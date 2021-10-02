package system.presentation.prestamos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import system.Application;
import system.logic.Cliente;
import system.logic.Prestamo;
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
        model.setPrestamos(new ArrayList<>());
        model.setPrestamo(new Prestamo("",0,0,0));
        
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

    //metodo add prestamo, agrega un nuevo prestamo a un cliente determinado
    public void prestamoAddTo(String idCliente, Prestamo prestamo){
            Service.instance().prestamoAddTo(idCliente, prestamo);
            model.setPrestamo(new Prestamo("",0,0,0));
            model.setPrestamos(Arrays.asList(prestamo));
            model.commit();
    }
    //metoso prestamoEdit para poder revisar en edl jtable
        public void PrestamoEdit(int row){
        Prestamo prestamo = model.prestamos.get(row);
        model.setPrestamo(prestamo);
        model.commit();
    }
        
       public void  prestamoSearch(String idCliente){
        List<Prestamo> prestamos= Service.instance().prestamoSearch(idCliente);
        model.setPrestamo(new Prestamo("",0,0,0));
        model.setPrestamos(prestamos);
        model.commit();
    }
}
