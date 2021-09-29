/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;


@XmlAccessorType(XmlAccessType.FIELD)
public class Provincia {
    @XmlID
    private String numero;
    private String nombre;
    private List<Canton> cantones;
    
    
   
   /* import java.awt.Rectangle;
import java.util.ArrayList; 
    public static ArrayList generarProvincias(){
        Rectangle sanJose = new Rectangle(228, 241, 171, 41);
        Rectangle alajuela = new Rectangle(175, 51, 108, 95);
        Rectangle cartago = new Rectangle(340,203,86,39);
        Rectangle heredia = new Rectangle(297, 77, 48, 117);
        Rectangle guanacaste = new Rectangle(29,72,129,113);
        Rectangle puntarenas = new Rectangle(352,309,157,123);
        Rectangle limon = new Rectangle(352,126,152,77);
        provincias.add(0,sanJose);
        provincias.add(1,alajuela);
        provincias.add(2,cartago);
        provincias.add(3,heredia);
        provincias.add(4,guanacaste);
        provincias.add(5,puntarenas);
        provincias.add(6,limon);
        return Provincia.provincias;
    }
    
    private static ArrayList provincias = new ArrayList();*/

    public Provincia(String numero, String nombre, List<Canton> cantones) {
        this.numero = numero;
        this.nombre = nombre;
        this.cantones = cantones;
    }

    public Provincia() {
        this.numero = "";
        this.nombre = "";
        this.cantones = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Canton> getCantones() {
        return cantones;
    }

    public void setCantones(List<Canton> cantones) {
        this.cantones = cantones;
    }

    @Override
    public String toString() {
        return "Provincia{" + "nombre=" + nombre + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Provincia other = (Provincia) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }
    
    
}
