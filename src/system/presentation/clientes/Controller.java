package system.presentation.clientes;

import java.util.ArrayList;
import java.util.List;
import system.Application;
import system.logic.Canton;
import system.logic.Cliente;
import system.logic.Distrito;
import system.logic.Provincia;
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
        model.setProvincia(new Provincia());
        model.setCantones(new ArrayList<>());
        model.setDistritos(new ArrayList<>());
        view.setModel(model);
        view.setController(this);
    }

    public void show() {
        this.view.setVisible(true);
    }
    public void hide(){
        this.view.setVisible(false);
    }

    public Provincia getProvincia(int x, int y) {
        Provincia resultProvincia = Service.instance().getProvincia(x, y);
        model.setProvincia(resultProvincia);
      //  model.commit();
        return resultProvincia;
    }

    public List<Canton> getCantones(String nombreProvincia) {
        List<Canton> resultCantones = Service.instance().getCantones(nombreProvincia);
        model.setCantones(resultCantones);
       // model.commit();
        return resultCantones;
    }

    public List<Distrito> getDistritos(String nombreCanton) {
        List<Distrito> resultDistritos = Service.instance().getDistritos(nombreCanton);
        model.setDistritos(resultDistritos);
        //model.commit();
        return resultDistritos;
    }

    // Controller methods that respond to View events
    // probably invoke methods from Service,
    // and set data to Model, which in turn causes the View to update 
    public void clienteGet(String cedula) {
        try {
            Cliente cliente = Service.instance().clienteGet(cedula);
            model.setCliente(cliente);
            model.commit();
        } catch (Exception ex) {
            model.setCliente(new Cliente());
            model.commit();
        }
    }

    public void clienteAdd(Cliente cliente) {
        try {
            Service.instance().clienteAdd(cliente);
            model.setCliente(new Cliente());
            model.commit();
        } catch (Exception ex) {
            model.setCliente(new Cliente());
            model.commit();
        }

    }
    
    public void prestamosSHOW(){
        this.hide();
        Application.PRESTAMOS.show();
    }

    public void exit() {
        Service.instance().store();
    }

}
