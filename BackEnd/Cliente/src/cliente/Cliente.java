/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author administrador
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CCliente clienteUno = new CCliente("01", "Mauricio", "Avalos", 25);
        CCliente clienteDos = new CCliente("02", "Delia", "Torres", 38);
        CCliente clienteTres = new CCliente("03", "Ximena", "Gutierrez", 20);
        CCliente clienteCuatro = new CCliente("04", "Oscar", "Hernandez", 35);
        CCliente clienteCinco = new CCliente("05", "Julio", "Torino", 40);
        CCliente clienteSeis = new CCliente("06", "Ana", "Sands", 55);
        
        //Generar lista de clientes en la rama feature con nombre listaClientes
        
//        List<CCliente> listaClientes = new ArrayList<>();
//        
//        listaClientes.add(clienteUno);
//        listaClientes.add(clienteDos);
//        listaClientes.add(clienteTres);
//        listaClientes.add(clienteCuatro);
//        listaClientes.add(clienteCinco);
//        listaClientes.add(clienteSeis);
        
        
        for(CCliente elemento:listaClientes){
            
            System.out.println("**************************************");
            System.out.println("Cliente ID: " + elemento.getIdCliente());
            System.out.println("Nombre: " + elemento.getName());
            System.out.println("Apellido: " + elemento.getApellido());
            System.out.println("Edad: " + elemento.getEdad());
        }
                
    }
    
}
