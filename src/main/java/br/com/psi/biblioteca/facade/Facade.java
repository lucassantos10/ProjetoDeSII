/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.psi.biblioteca.facade;

import br.com.psi.biblioteca.dao.GrupoDao;
import br.com.psi.biblioteca.dao.PermissaoDao;
import br.com.psi.biblioteca.dao.UsuarioDao;
import br.com.psi.biblioteca.exception.DaoException;
import br.com.psi.biblioteca.model.Grupo;
import br.com.psi.biblioteca.model.Permissao;
import br.com.psi.biblioteca.model.Usuario;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author lucas
 */
public class Facade {

    PermissaoDao permissaoDao = new PermissaoDao();
    GrupoDao grupoDao = new GrupoDao();
    UsuarioDao usuarioDao = new UsuarioDao();

    public void salvarPermissao(Permissao p) throws SQLException, DaoException {
        permissaoDao.save(p);
    }

    public List<Permissao> listarPermissoes() throws DaoException {
        return permissaoDao.all();
    }

    public Permissao buscarPermissao(long id) throws DaoException {
        return permissaoDao.find(id);
    }

    public void editarPermissao(Permissao p) throws DaoException {
        permissaoDao.update(p);
    }

    public void removerPermissao(Permissao p, long id) throws DaoException {
        permissaoDao.remove(p, id);

    }
    
    public void salvarGrupo(Grupo g) throws SQLException, DaoException {
        grupoDao.save(g);
    }

    public List<Grupo> listarGrupo() throws DaoException {
        return grupoDao.all();
    }

    public Grupo buscarGrupo(long id) throws DaoException {
        return grupoDao.find(id);
    }

    public void editarGrupo(Grupo g) throws DaoException {
        grupoDao.update(g);
    }

    public void removerGrupo(Grupo g, long id) throws DaoException {
        grupoDao.remove(g, id);

    }
    
    public void salvarUsuario(Usuario u) throws SQLException, DaoException {
        usuarioDao.save(u);
    }

    public List<Usuario> listarUsuario() throws DaoException {
        return usuarioDao.all();
    }

    public Usuario buscarUsuario(long id) throws DaoException {
        return usuarioDao.find(id);
    }

    public void editarUsuario(Usuario u) throws DaoException {
        usuarioDao.update(u);
    }

    public void removerUsuario(Usuario u, long id) throws DaoException {
        usuarioDao.remove(u, id);
        System.out.println("");

    }


}
