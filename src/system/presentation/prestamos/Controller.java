package system.presentation.prestamos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
<<<<<<< HEAD
import java.util.logging.Level;
import java.util.logging.Logger;
=======
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
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
<<<<<<< HEAD
        model.setPrestamo(new Prestamo("", 0, 0, 0));

=======
        model.setPrestamo(new Prestamo("",0,0,0));
        
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
        view.setModel(model);
        view.setController(this);
    }

    public void show() {
        model.setCliente(Service.instance().getClienteActual());
        model.commit();
        this.view.setVisible(true);
    }
<<<<<<< HEAD

    public void hide() {
        this.view.setVisible(false);
    }

    public void clientesSHOW() {
=======
    public void hide(){
        this.view.setVisible(false);
    }
    public void clientesSHOW(){
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
        this.hide();
        Application.CLIENTES.show();
    }

    //metodo add prestamo, agrega un nuevo prestamo a un cliente determinado
<<<<<<< HEAD
    public void prestamoAddTo(String idCliente, Prestamo prestamo) {
        try {
            Service.instance().prestamoAddTo(idCliente, prestamo);
            model.setPrestamo(new Prestamo("", 0, 0, 0));
            model.setPrestamos(Arrays.asList(prestamo));
            model.commit();
        } catch (Exception ex) {
            model.setPrestamo(new Prestamo("", 0, 0, 0));
            model.commit();
        }
    }

    //metoso prestamoEdit para poder revisar en edl jtable
    public void PrestamoEdit(int row) {
=======
    public void prestamoAddTo(String idCliente, Prestamo prestamo){
            Service.instance().prestamoAddTo(idCliente, prestamo);
            model.setPrestamo(new Prestamo("",0,0,0));
            model.setPrestamos(Arrays.asList(prestamo));
            model.commit();
    }
    //metoso prestamoEdit para poder revisar en edl jtable
        public void PrestamoEdit(int row){
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
        Prestamo prestamo = model.prestamos.get(row);
        model.setPrestamo(prestamo);
        model.commit();
    }
<<<<<<< HEAD

    public void prestamoSearch(String idCliente) {
        List<Prestamo> prestamos = Service.instance().prestamoSearch(idCliente);
        model.setPrestamo(new Prestamo("", 0, 0, 0));
=======
        
       public void  prestamoSearch(String idCliente){
        List<Prestamo> prestamos= Service.instance().prestamoSearch(idCliente);
        model.setPrestamo(new Prestamo("",0,0,0));
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
        model.setPrestamos(prestamos);
        model.commit();
    }
}
