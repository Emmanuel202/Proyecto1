package system.presentation.prestamos;

import system.Application;
import system.logic.Cliente;
import system.logic.Service;

public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        // invoke Model sets for initialization before linking to the view
        // problably get the data from Service
        model.setCliente(new Cliente());
        
        view.setModel(model);
        view.setController(this);
    }

    public void show() {
        model.setCliente(Service.instance().getClienteActual());
        model.commit();
        this.view.setVisible(true);
    }
    public void hide(){
        this.view.setVisible(false);
    }
    public void clientesSHOW(){
        this.hide();
        Application.CLIENTES.show();
    }

}
