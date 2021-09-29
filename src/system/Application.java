/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import system.presentation.clientes.Controller;
import system.presentation.clientes.Model;
import system.presentation.clientes.View;

/**
 *
 * @author Emmanuel
 */
public class Application {
    
        public static void main(String[] args) {
        Model model=new Model() ;
        View view = new View();
        Controller controller = new Controller(model,view);
        controller.show();  
    }

     }
