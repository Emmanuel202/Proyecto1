/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import system.presentation.clientes.Controller;

/**
 *
 * @author Emmanuel
 */
public class Application {
    
    
        public static void main(String[] args) {
           try { 
         system.presentation.prestamos.Model modelPrestamos = new system.presentation.prestamos.Model() ;
        system.presentation.prestamos.View viewPrestamos = new system.presentation.prestamos.View();
        system.presentation.prestamos.Controller controllerPrestamos = new system.presentation.prestamos.Controller(modelPrestamos,viewPrestamos);
        PRESTAMOS = controllerPrestamos;
        
        
        system.presentation.clientes.Model modelClientes=new system.presentation.clientes.Model() ;
        system.presentation.clientes.View viewClientes = new system.presentation.clientes.View();
        system.presentation.clientes.Controller controllerClientes = new Controller(modelClientes,viewClientes);
        CLIENTES = controllerClientes;
        CLIENTES.show();
           }
           catch(Exception ex){System.out.print(ex);}

    }
        public static system.presentation.clientes.Controller CLIENTES;
        public static system.presentation.prestamos.Controller PRESTAMOS;

     }
