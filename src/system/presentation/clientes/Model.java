package system.presentation.clientes;

import java.util.Observable;
import java.util.Observer;
import system.logic.Provincia;

public class Model extends Observable{
    
    // Model attributes here
    Provincia provincia;
    // Model gets and sets here

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); 
        this.commit();
    }
    
    public void commit(){
        this.setChanged();
        this.notifyObservers();
    }
    
}











