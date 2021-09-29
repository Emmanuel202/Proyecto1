/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import system.logic.Canton;
import system.logic.Distrito;
import system.logic.Provincia;

/**
 *
 * @author Emmanuel
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Data {
    
    private List<Provincia>provincias;
    private List<Canton> cantones;
    private List<Distrito> distritos;
    
    public Data(){
        provincias = new ArrayList<>();
        cantones = new ArrayList<>();
        distritos = new ArrayList<>();
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
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
    
    
    
}
