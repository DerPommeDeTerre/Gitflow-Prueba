/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

/**
 *
 * @author administrador
 */
public class CCliente {
    
   
    String idCliente;
    String name;    
    String apellido;
    Integer edad;

    public CCliente() {
    }
    
    
    public CCliente(String idCliente, String name, String apellido, Integer edad) {
        this.idCliente = idCliente;
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
            
}
