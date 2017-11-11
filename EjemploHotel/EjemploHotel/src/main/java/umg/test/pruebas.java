
package umg.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import umg.conf.NewHibernateUtil;
import umg.pojos.Usuario;


public class pruebas {

    public List<Usuario> listaUsuario(){
        SessionFactory sesion= NewHibernateUtil.getSessionFactory();
        Session session;
        
        List<Usuario> retorno = null;
        session = sesion.openSession();
        retorno = session.createCriteria(Usuario.class).list();
        return retorno;
    }
   
    public List<Usuario> listaUsuario(String usuario, String clave){
        SessionFactory sesion= NewHibernateUtil.getSessionFactory();
        Session session;
        
        List<Usuario> retorno = new ArrayList<>();
        session = sesion.openSession();
        retorno = session.createQuery("from Usuario where usuario = :usr and contrasena = :contr").setParameter("usr", usuario).setParameter("contr", clave).list();
        return retorno;
    }
    
    
    
    /*public List<Cliente> listaClientes(){
        SessionFactory sesion= NewHibernateUtil.getSessionFactory();
        Session session;
        
        List<Usuario> retorno = null;
        session = sesion.openSession();
        retorno = session.createCriteria(Usuario.class).list();
        return retorno;
    }
    */
    public static void main(String[] args) {
        SessionFactory sesion= NewHibernateUtil.getSessionFactory();
        Session session;
        
        pruebas pru = new pruebas();
        
        
         Usuario usr;
            usr = new Usuario();
            usr.setIdusuario(new BigDecimal(2)); // aca ponen el codigo puse por defecto 1 pero debes de saber cual es el sieguiente correctalivo
            usr.setUsuario("Alfrin");
            usr.setContrasena("123");
            usr.setNombrecompleto("Karen Alejandra");
            usr.setCorreoelectronico("karen@gmail.com");
            usr.setPuesto("sistemas");
            System.out.print("se inserto");
            session = sesion.openSession();
            Transaction tx = session.beginTransaction();
            session.save(usr);
            tx.commit();
            session.close();
            
        
        List<Usuario> usua = pru.listaUsuario();
        //List<Clientes> cli = pru.listaClientes();
        
        
        
        
        for(Usuario usr1 : usua){
            System.out.println(usr.getUsuario());
        }
        
        
        
        
    }
    
}
