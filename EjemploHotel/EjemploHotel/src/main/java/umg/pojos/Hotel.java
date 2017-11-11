package umg.pojos;
// Generated 09-nov-2017 21:45:51 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Hotel generated by hbm2java
 */
public class Hotel  implements java.io.Serializable {


     private BigDecimal idhotel;
     private String nombre;
     private String direccion;
     private String descripcion;
     private String imagen;
     private Set habitacions = new HashSet(0);

    public Hotel() {
    }

	
    public Hotel(BigDecimal idhotel) {
        this.idhotel = idhotel;
    }
    public Hotel(BigDecimal idhotel, String nombre, String direccion, String descripcion, String imagen, Set habitacions) {
       this.idhotel = idhotel;
       this.nombre = nombre;
       this.direccion = direccion;
       this.descripcion = descripcion;
       this.imagen = imagen;
       this.habitacions = habitacions;
    }
   
    public BigDecimal getIdhotel() {
        return this.idhotel;
    }
    
    public void setIdhotel(BigDecimal idhotel) {
        this.idhotel = idhotel;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getImagen() {
        return this.imagen;
    }
    
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public Set getHabitacions() {
        return this.habitacions;
    }
    
    public void setHabitacions(Set habitacions) {
        this.habitacions = habitacions;
    }




}


