package system.presentation.prestamos;

import java.util.Observable;
import java.util.Observer;
import system.logic.Cliente;


public class Model extends Observable{
    
    // Model attributes here
    Cliente cliente;
    
    public Cliente getCliente() {
        return cliente;
    }

    // Model gets and sets here
    public void setCliente(Cliente cliente) {    
        this.cliente = cliente;
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











