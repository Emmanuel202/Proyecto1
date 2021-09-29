/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;
import java.awt.Rectangle;
import java.util.ArrayList;


public class Provincia {
    
    public Provincia(){
        
    }
   
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
    
    private static ArrayList provincias = new ArrayList();
}
