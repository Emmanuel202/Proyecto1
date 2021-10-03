
package system;

import system.presentation.clientes.Controller;

public class Application {
<<<<<<< HEAD

    public static void main(String[] args) {
        try {
            system.presentation.prestamos.Model modelPrestamos = new system.presentation.prestamos.Model();
            system.presentation.prestamos.View viewPrestamos = new system.presentation.prestamos.View();
            system.presentation.prestamos.Controller controllerPrestamos = new system.presentation.prestamos.Controller(modelPrestamos, viewPrestamos);
            PRESTAMOS = controllerPrestamos;

            system.presentation.clientes.Model modelClientes = new system.presentation.clientes.Model();
            system.presentation.clientes.View viewClientes = new system.presentation.clientes.View();
            system.presentation.clientes.Controller controllerClientes = new Controller(modelClientes, viewClientes);
            CLIENTES = controllerClientes;
            CLIENTES.show();
        } catch (Exception ex) {
            System.out.print(ex);
        }

    }
    public static system.presentation.clientes.Controller CLIENTES;
    public static system.presentation.prestamos.Controller PRESTAMOS;
=======
    
    
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
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b

}
