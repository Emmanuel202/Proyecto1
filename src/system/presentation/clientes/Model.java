package system.presentation.clientes;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import system.logic.Canton;
import system.logic.Distrito;
import system.logic.Provincia;

public class Model extends Observable{
    
    // Model attributes here
    Provincia provincia;
    List<Canton> cantones;
    List<Distrito> distritos;
    // Model gets and sets here

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public List<Canton> getCantones() {
        return cantones;
    }

    public void setCantones(List<Canton> cantones) {
        this.cantones = cantones;
    }

    public List<Distrito> getDistritos() {
        return distritos;
    }

    public void setDistritos(List<Distrito> distritos) {
        this.distritos = distritos;
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











