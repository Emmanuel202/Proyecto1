package system.presentation.clientes;

import java.util.ArrayList;
import java.util.List;
import system.logic.Canton;
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
        model.setProvincia(new Provincia());
        model.setCantones(new ArrayList<>());
        view.setModel(model);
        view.setController(this);
    }
    
    public void show(){
        this.view.setVisible(true);
    }
    
    public Provincia getProvincia(int x, int y){
        
        Provincia resultProvincia = Service.instance().getProvincia(x, y);
        model.setProvincia(resultProvincia);
        model.commit();
        return resultProvincia;
    }
    public List<Canton> getCantones(String nombreProvincia){
        List<Canton> resultCantones = Service.instance().getCantones(nombreProvincia);
        model.setCantones(resultCantones);
        model.commit();
        return resultCantones;
    }

    
    // Controller methods that respond to View events
    // probably invoke methods from Service,
    // and set data to Model, which in turn causes the View to update 
}
