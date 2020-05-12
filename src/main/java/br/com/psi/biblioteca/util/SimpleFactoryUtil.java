/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.psi.biblioteca.util;
import br.com.psi.biblioteca.model.Grupo;
import br.com.psi.biblioteca.model.Permissao;
import br.com.psi.biblioteca.model.Usuario;

/**
 *
 * @author mac
 */
public class SimpleFactoryUtil {
    public static final Permissao criarPermissao() {
    return new Permissao();
  }

  public static final Grupo criarGrupo(){
   return new Grupo();
  }
  
   public static final Usuario criarUsuario(){
   return new Usuario();
  }
}
