/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.spring;

import java.util.List;
import umg.pojos.Usuario;
import umg.test.pruebas;

/**
 *
 * @author EDUARDO RIVAS
 */
public class UsuariosControl {
    
    pruebas dao = new pruebas();
    
    public boolean validaUsr(String usuario, String clave){
        boolean valida = false;
        
        List<Usuario> usr = dao.listaUsuario(usuario, clave);
        
        if (usr.size()>0){
            valida = true;
        }
        return valida;
        
    }
    
    public boolean validaUsuario(String usuario, String clave){
        List<Usuario> usr = dao.listaUsuario();
        boolean valida = false;
        
        for(Usuario u : usr){
            if ((u.getUsuario().equals(usuario)) || (u.getContrasena().equals(clave))){
                valida = true;
            }
        }

        return valida;
        
    }
    
    
}
