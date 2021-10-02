package system.presentation.prestamos;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import system.logic.Cliente;
import system.logic.Prestamo;


public class Model extends Observable{
    
    // Model attributes here
    Cliente cliente;
    List<Prestamo> prestamos;
    Prestamo prestamo;
    
    public Cliente getCliente() {
        return cliente;
    }

    // Model gets and sets here
    public void setCliente(Cliente cliente) {    
        this.cliente = cliente;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
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











