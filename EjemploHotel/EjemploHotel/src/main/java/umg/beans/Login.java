/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.beans;

import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import umg.spring.UsuariosControl;

/**
 *
 * @author EDUARDO RIVAS
 */
@Named(value = "loginMB")
@Dependent
@ManagedBean
public class Login {
    private String name;
    private String password;
    private String mensaje;

    UsuariosControl ctrlusr = new UsuariosControl();
    
    public String validarUsuario(){
        System.out.println("entro");
        System.out.println(this.name);
        
        String pagina="/details.xthml";
        
        if (ctrlusr.validaUsuario(name, password)){
            System.out.println("correcto");
            this.mensaje = "Usuario Corecto";
            pagina ="/details.xhtml";
        }else{
            System.out.println("incorrecto");
            this.mensaje = "Usuario Incorrecto";
        }
        
        return pagina;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
      public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    

    
}
