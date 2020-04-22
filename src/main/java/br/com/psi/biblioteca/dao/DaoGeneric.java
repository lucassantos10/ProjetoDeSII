/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.psi.biblioteca.dao;


import br.com.psi.biblioteca.util.JpaUtil;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

/**
 *
 * @author LUCAS
 */
public abstract class DaoGeneric<T> implements IDaoGeneric<T> {

  EntityManager manager;
  private Class classe;

  public DaoGeneric() {
    manager = JpaUtil.createEntityManager();
    classe = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
  }

  /**
   *
   * @param t
   * @throws DaoException
   */
  @Override
  public void save(T t) throws DaoException {
    try {
      manager = JpaUtil.createEntityManager();
      manager.getTransaction().begin();
      manager.persist(t);
      manager.getTransaction().commit();
    }
    catch (Exception e) {
      manager.getTransaction().rollback();
      e.printStackTrace();
      throw new DaoException("...");
    }
    finally {
      JpaUtil.closeEntityManager();
    }
  }

  /**
   *
   * @param t
   * @throws DaoException
   */
  @Override
  public void update(T t) throws DaoException {
    try {
      manager = JpaUtil.createEntityManager();
      manager.getTransaction().begin();
      manager.merge(t);
      manager.getTransaction().commit();
    }
    catch (Exception e) {
      manager.getTransaction().rollback();
      e.printStackTrace();
      throw new DaoException("...");
    }
  }

  @Override
  public T find(long id) throws DaoException {
    try {
      manager = JpaUtil.createEntityManager();
      return (T) manager.find(this.classe, id);
    }
    catch (Exception e) {
      throw new DaoException("...");
    }
    finally {
      JpaUtil.closeEntityManager();
    }
  }

  @Override
  public void remove(T t, long id) throws DaoException {
    try {
      manager = JpaUtil.createEntityManager();
      manager.getTransaction().begin();
      t = (T) manager.find(this.classe, id);
      manager.remove(t);
      manager.getTransaction().commit();
    }
    catch (Exception e) {
      manager.getTransaction().rollback();
      throw new DaoException("...");
    }
    finally {
      JpaUtil.closeEntityManager();
    }
  }

  /**
   *
   * @return @throws DaoException
   */
  @Override
  public List<T> all() throws DaoException {
    try {
      Criteria criteria = getCriteria();
      criteria.addOrder(Order.asc("id")); // orderBy id;
      return (List<T>) criteria.list();
    }
    catch (Exception e) {
      manager.getTransaction().rollback();
      e.printStackTrace();
      throw new DaoException("...");
    }
  }

  public Criteria getCriteria() {
    Session session = ((Session) manager.getDelegate());
    return session.createCriteria(this.classe);
  }
}
