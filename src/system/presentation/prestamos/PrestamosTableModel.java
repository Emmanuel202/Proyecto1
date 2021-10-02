
package system.presentation.prestamos;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import system.logic.Prestamo;

public class PrestamosTableModel extends AbstractTableModel implements TableModel {
    String[] cols = {"ID", "Monto", "Plazo", "Tasa", "Cuota"};
    List<Prestamo> rows;
    
    public PrestamosTableModel(List<Prestamo> rows){
        this.rows = rows;
    }
    
    public int getColumnCount(){
        return 5;
    }
    
    public String getColumnName(int columnIndex){
        return cols[columnIndex];
    }
    
    public int getRowCount(){
        return this.rows.size();
    }
    
    public Class<?> getColumnClass(int columnIndex){
        return Integer.class;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Prestamo p = rows.get(rowIndex);
        switch (columnIndex){
            case 0: return p.getId();
            case 1:return p.getMonto();
            case 2:return p.getPlazo();
            case 3:return p.getTasa();
            case 4:return p.calcularCuota();
            default: return "";
        }
    }
}
