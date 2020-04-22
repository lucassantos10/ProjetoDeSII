package br.com.psi.biblioteca.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Entity Manager Factory.
 *
 * @author LUCAS
 */
public class JpaUtil {

  private static EntityManagerFactory emf;
  private static EntityManager em;

  /**
   * Estabelecer conexão com o banco de dados.
   *
   * @return
   */
  public static EntityManager createEntityManager() {
    if (JpaUtil.emf == null) {
      JpaUtil.emf = Persistence.createEntityManagerFactory("BIBLIOTECAPU");
    }
    if (JpaUtil.em == null || !JpaUtil.em.isOpen()) {
      JpaUtil.em = emf.createEntityManager();
    }
    return JpaUtil.em;
  }

  /**
   * Encerrar conexão com o banco dados.
   */
  public static void closeEntityManager() {
    if (JpaUtil.em != null) {
      JpaUtil.em.close();
    }
  }

}
