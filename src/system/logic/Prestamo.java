package system.logic;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
//TEMPORALEMTE COMENTADO EN LO QUE SE CREA LA CLASE MENSUALIDAD
//import java.util.List;
//import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
public class Prestamo {  
    @XmlID
    private String id;
    private double monto;
    private int plazo;
    private double tasa;
    //private List<Mensualidad> m;
    
 

    public Prestamo(String id, double monto, int plazo, double tasa) {
        this.id = id;
        this.monto = monto;
        this.plazo = plazo;
        this.tasa = tasa;
    }
    

    public Prestamo() {
        this.id = "";
        this.monto = 0;
        this.plazo = 0;
        this.tasa = 0;
    }
    

    public double calcularCuota() {
        int exp = this.plazo * -1;
        double base = this.tasa + 1;
        return (this.monto * this.tasa) / (1 - (Math.pow(base, exp)));
    }
    /*  TEMPORALEMTE COMENTADO EN LO QUE SE CREA LA CLASE MENSUALIDAD

    public void crearMensualidades() {
        int cont = 1;
        double intereses;
        double amortizacion;
        double saldo = this.monto;
        double cuota = this.calcularCuota();

        for (int i = 0; i < this.plazo; i++) {
            intereses = saldo * this.tasa;
            amortizacion = cuota - intereses;
            Mensualidad men = new Mensualidad(cont, saldo, intereses, amortizacion);
            saldo = saldo - amortizacion;
            cont++;
            this.m.add(men);
        }
    }
    */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public String toString() {
        StringBuilder r = new StringBuilder();
        r.append(String.format("Monto: %.0f  Tasa: %.0f  Plazo: %d  Cuota: %.0f%n", this.monto, this.tasa * 100, this.plazo, this.calcularCuota()));
        return r.toString();
    }

    /*public List<Mensualidad> getMensualidades() {
        return this.m;
    }*/
    

}
