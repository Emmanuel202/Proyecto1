package system.logic;

import java.util.List;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import system.data.Data;
import system.data.XmlPersister;

public class Service {

    // Singleton implementation
    private static Service theInstance;

    public static Service instance() {
        if (theInstance == null) {
            theInstance = new Service();
        }
        return theInstance;
    }

    // Service data
    private Data data;
    private List<Rectangle> rectangulosProvincias;
    private Cliente clienteActual; // contendra el ultimo cliente consultado

    public Cliente getClienteActual() {
        return clienteActual;
    }

    public void setClienteActual(Cliente clienteActual) {
        this.clienteActual = clienteActual;
    }

<<<<<<< HEAD
=======
    

>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
    //----------------------------------------------------------------------------------------------Service methods for Ciente
    public void clienteAdd(Cliente cliente) throws Exception {
        Cliente old = data.getClientes().stream().filter(c -> c.getCedula().equals(cliente.getCedula())).findFirst().orElse(null);
        if (old == null) {
            data.getClientes().add(cliente);
        } else {
            throw new Exception("Cliente ya existe");
        }
    }

    public Cliente clienteGet(String cedula) throws Exception {
        Cliente result = data.getClientes().stream().filter(c -> c.getCedula().equals(cedula)).findFirst().orElse(null);
        if (result != null) {
            setClienteActual(result);
            return result;
        } else {
            throw new Exception("Cliente no existe");
        }
    }

    private void generarProvincias() {
        rectangulosProvincias = new ArrayList<>();
        Rectangle sanJose = new Rectangle(228, 241, 171, 41);
        Rectangle alajuela = new Rectangle(175, 51, 108, 95);
        Rectangle cartago = new Rectangle(340, 203, 86, 39);
        Rectangle heredia = new Rectangle(297, 77, 48, 117);
        Rectangle guanacaste = new Rectangle(29, 72, 129, 113);
        Rectangle puntarenas = new Rectangle(352, 309, 157, 123);
        Rectangle limon = new Rectangle(352, 126, 152, 77);
        rectangulosProvincias.add(0, sanJose);
        rectangulosProvincias.add(1, alajuela);
        rectangulosProvincias.add(2, cartago);
        rectangulosProvincias.add(3, heredia);
        rectangulosProvincias.add(4, guanacaste);
        rectangulosProvincias.add(5, puntarenas);
        rectangulosProvincias.add(6, limon);
    }

    public Provincia getProvincia(int x, int y) {
        List<Provincia> provincias = data.getProvincias();
        Provincia result;
        for (int i = 0; i < 7; i++) {
            Rectangle r = (Rectangle) rectangulosProvincias.get(i);
            if (r.contains(x, y)) {
                result = provincias.get(i);
                return result;
            }
        }
        return new Provincia();
    }

    public List<Canton> getCantones(String nombreProvincia) {
        List<Provincia> provincias = data.getProvincias();

        for (int i = 0; i < provincias.size(); i++) {
            Provincia provinciaTemp = provincias.get(i);
            if (provinciaTemp.getNombre() == nombreProvincia) {
                return provinciaTemp.getCantones();
            }
<<<<<<< HEAD
=======
        }
        return new ArrayList<>();
    }
    
    public List<Distrito> getDistritos(String nombreCanton){
        List<Canton> cantones = data.getCantones();
        
        for(int i = 0; i<cantones.size();i++){
            Canton cantonesTemp = cantones.get(i);
            if(cantonesTemp.getNombre() == nombreCanton){
                return cantonesTemp.getDistritos();
            }
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
        }
        return new ArrayList<>();
    }

<<<<<<< HEAD
    public List<Distrito> getDistritos(String nombreCanton) {
        List<Canton> cantones = data.getCantones();

        for (int i = 0; i < cantones.size(); i++) {
            Canton cantonesTemp = cantones.get(i);
            if (cantonesTemp.getNombre() == nombreCanton) {
                return cantonesTemp.getDistritos();
            }
        }
        return new ArrayList<>();
    }

=======
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
    public void store() {
        try {
            XmlPersister.instance().store(data);
        } catch (Exception ex) {
        }
    }
//-------------------------------------------------------------------------------------------------------fin de metodos de cliente
<<<<<<< HEAD

//----------------------------------Metodos relacionados a prestamo--------------------------------------------------
    public void prestamoAddTo(String idCliente, Prestamo prestamo) throws Exception {
        try {
            Cliente result = clienteGet(idCliente);
            Prestamo prestamoAux = result.getPrestamos().stream().filter(p -> p.getId().equals(prestamo.getId())).findFirst().orElse(null);
            if(prestamoAux == null) result.getPrestamos().add(prestamo);
            else throw new Exception("Ya existe un prestamo con ese id");
        } catch (Exception ex) {
            throw new Exception("Ya existe un prestamo con ese id");
        }
    }

    public List<Prestamo> prestamoSearch(String idCliente) {
        try {
            Cliente result = clienteGet(idCliente);
            return result.getPrestamos(); 
        } catch (Exception ex) {
            //Hacer un manejo de exception acorde
        }
        return new ArrayList<>();
    }
    //-------------------------------------------------------------------------------------------------------------------------

=======
    
//----------------------------------Metodos relacionados a prestamo--------------------------------------------------
    public void prestamoAddTo(String idCliente, Prestamo prestamo){
        try {
            Cliente result = clienteGet(idCliente);
            result.getPrestamos().add(prestamo);
        } catch (Exception ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public List<Prestamo> prestamoSearch(String idCliente){
            
        try {
            Cliente result;
            result = clienteGet(idCliente);
            List<Prestamo> prestamos = result.getPrestamos();
            return prestamos;
        } catch (Exception ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();           
    }
   //-------------------------------------------------------------------------------------------------------------------------
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
    public Service() {
        try {
            clienteActual = new Cliente();
            data = XmlPersister.instance().load();
            generarProvincias();
        } catch (Exception e) {
            data = new Data();
        }

    }

}
