/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.logic;

/**
 *
 * @author Emmanuel
 */

import java.util.List;
import java.util.stream.Collectors;
    import java.awt.Rectangle;
import java.util.ArrayList;
import system.data.Data;
import system.data.XmlPersister;

public class Service {
    
    // Singleton implementation
    private static Service theInstance;
    public static Service instance(){
        if (theInstance==null){ 
            theInstance=new Service();
        }
        return theInstance;
    }
    
    // Service data
      private Data data;
      private List<Rectangle> rectangulosProvincias;
       

    private void generarProvincias(){
        rectangulosProvincias = new ArrayList<>();
        Rectangle sanJose = new Rectangle(228, 241, 171, 41);
        Rectangle alajuela = new Rectangle(175, 51, 108, 95);
        Rectangle cartago = new Rectangle(340,203,86,39);
        Rectangle heredia = new Rectangle(297, 77, 48, 117);
        Rectangle guanacaste = new Rectangle(29,72,129,113);
        Rectangle puntarenas = new Rectangle(352,309,157,123);
        Rectangle limon = new Rectangle(352,126,152,77);
        rectangulosProvincias.add(0,sanJose);
        rectangulosProvincias.add(1,alajuela);
        rectangulosProvincias.add(2,cartago);
        rectangulosProvincias.add(3,heredia);
        rectangulosProvincias.add(4,guanacaste);
        rectangulosProvincias.add(5,puntarenas);
        rectangulosProvincias.add(6,limon);
    }
    public Provincia getProvincia(int x, int y){
        List<Provincia> provincias = data.getProvincias();
        Provincia result;
        for(int i = 0; i< 7;i++){
           Rectangle r = (Rectangle) rectangulosProvincias.get(i);
            if(r.contains(x,y)){
             result = provincias.get(i);
             return result;
            }
        }
        return new Provincia();
    }
    public List<Canton> getCantones(String nombreProvincia){
        List<Provincia> provincias = data.getProvincias();

        for(int i = 0; i<provincias.size();i++){
        Provincia provinciaTemp = provincias.get(i);   
        if(provinciaTemp.getNombre() == nombreProvincia){
           return provinciaTemp.getCantones();
           }
        }
        return new ArrayList<>();
    }
   
    
/*
    
    // Service methods
    public Cliente clienteGet(String cedula) throws Exception{
        Cliente result=data.getClientes().stream().filter(c->c.getCedula().equals(cedula)).findFirst().orElse(null);
        if (result!=null) return result;
        else throw new Exception("Cliente no existe");   
    }
    
    public List<Cliente> clienteSearch(String cedula){
        List<Cliente> result=data.getClientes().stream().filter(c->c.getCedula().startsWith(cedula)).collect(Collectors.toList());
       return result;        
    }
    
    public List<Cliente> clienteAll(){
        return data.getClientes();       
    }
    
    public void clienteAdd(Cliente cliente) throws Exception{
        Cliente old=data.getClientes().stream().filter(c->c.getCedula().equals(cliente.getCedula())).findFirst().orElse(null);
        if (old==null) data.getClientes().add(cliente);
        else throw new Exception("Cliente ya existe");           
        
    }    

//---------------
    public Factura facturaGet(String numero) throws Exception{
        Factura result=data.getFacturas().stream().filter(f->f.getNumero().equals(numero)).findFirst().orElse(null);
        if (result!=null) return result;
        else throw new Exception("Factura no existe");   
    }
    
    public List<Factura> facturaSearch(String numero){
        List<Factura> result=data.getFacturas().stream().filter(f->f.getNumero().startsWith(numero)).collect(Collectors.toList());
       return result;        
    }
    
    public void facturaAdd(Factura factura) throws Exception{
        Factura old=data.getFacturas().stream().filter(f->f.getNumero().equals(factura.getNumero())).findFirst().orElse(null);
        if (old==null) data.getFacturas().add(factura);
        else throw new Exception("Factura ya existe");           
        
    }    
  */
    public void store(){
        try {
            XmlPersister.instance().store(data);
        } catch (Exception ex) {
        }
    }
    
    public Service() {
        try{
            data=XmlPersister.instance().load();
            generarProvincias();
        }
        catch(Exception e){
            data =  new Data();
        }

    }
    
}
