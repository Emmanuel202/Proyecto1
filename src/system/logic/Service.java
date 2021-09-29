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
        }
        catch(Exception e){
            data =  new Data();
        }

    }
    
}
