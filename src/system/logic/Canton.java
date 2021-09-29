/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Emmanuel
 */
public class Canton {
    private String numero;
    private String nombre;
    private List<Distrito>distritos;

    public Canton(String numero, String nombre, List<Distrito> distritos) {
        this.numero = numero;
        this.nombre = nombre;
        this.distritos = distritos;
    }

    public Canton() {
        this.numero = "";
        this.nombre = "";
        this.distritos = new ArrayList<>();  
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

    public List<Distrito> getDistritos() {
        return distritos;
    }

    public void setDistritos(List<Distrito> distritos) {
        this.distritos = distritos;
    }

    @Override
    public String toString() {
        return "Canton{" + "nombre=" + nombre + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.numero);
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
        final Canton other = (Canton) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
