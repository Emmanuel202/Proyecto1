<<<<<<< HEAD
package system.presentation.prestamos;

import java.math.BigDecimal;
import java.util.Observable;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;
import system.MyInputVerifier;
=======

package system.presentation.prestamos;
import java.util.Observable;
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
import system.logic.Cliente;
import system.logic.Prestamo;

public class View extends javax.swing.JFrame implements java.util.Observer {

//**************  MVC ***********
    Controller controller;
    Model model;
<<<<<<< HEAD

    public void setController(Controller controller) {
        this.controller = controller;
=======
    
    public void setController(Controller controller){
        this.controller=controller;
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
    }

    public Controller getController() {
        return controller;
    }
<<<<<<< HEAD

    public void setModel(Model model) {
        this.model = model;
        model.addObserver(this);
=======
    
    public void setModel(Model model){
        this.model=model;
         model.addObserver(this);
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
    }

    public Model getModel() {
        return model;
    }
<<<<<<< HEAD

    @Override
    @SuppressWarnings("MalformedFormatString")
    public void update(Observable o, Object arg) {
        Cliente cliente = model.getCliente();
        Prestamo prestamo = model.getPrestamo();
        if (cliente.equals(new Cliente())) {
            id.setText("");
            nombre.setText("");
            this.TXT_ID.setText("");
            this.txt_monto.setText("");
            this.txt_plazo.setText("");
            this.txt_tasa.setText("");
            this.labelCuota.setText("");
            this.txt_monto.setInputVerifier(new MyInputVerifier());
            this.txt_plazo.setInputVerifier(new MyInputVerifier());
            this.txt_tasa.setInputVerifier(new MyInputVerifier());
            this.TXT_ID.setInputVerifier(new MyInputVerifier());
        } else {
            id.setText(cliente.getCedula());
            nombre.setText(cliente.getNombre());
            this.TXT_ID.setText(prestamo.getId());
            this.txt_monto.setText(String.valueOf(prestamo.getMonto()));
            this.txt_plazo.setText(String.valueOf(prestamo.getPlazo()));
            this.txt_tasa.setText(String.valueOf(prestamo.getTasa()));
            this.labelCuota.setText(String.valueOf(prestamo.calcularCuota()));
            this.jTablePrestamos.setModel(new PrestamosTableModel(model.getPrestamos()));

        }
    }
//************** END MVC ***********

    /* 
    }
     */
    public View() {
        initComponents();

=======
    
    @Override
    public void update(Observable o, Object arg) {
        Cliente cliente = model.getCliente();
        Prestamo prestamo = model.getPrestamo();
        if(cliente.equals(new Cliente()))
        {
            id.setText("");
            nombre.setText("");
           this.TXT_ID.setText("");
           this.txt_monto.setText("");
           this.txt_plazo.setText("");
           this.txt_tasa.setText("");
       }
       else
       {
           id.setText(cliente.getCedula());
           nombre.setText(cliente.getNombre());
           this.TXT_ID.setText(prestamo.getId());
           this.txt_monto.setText(String.valueOf(prestamo.getMonto()));
           this.txt_plazo.setText(String.valueOf(prestamo.getPlazo()));
           this.txt_tasa.setText(String.valueOf(prestamo.getTasa()));
           this.jTablePrestamos.setModel(new PrestamosTableModel(model.getPrestamos()));
          
           
           
       }
    }
//************** END MVC ***********

  /*  public void show(Prestamo p) {
        jLabelPrestamo.setText(p.toString());
        jTableMensualidades.setModel(new MensualidadTableModel(p.getMensualidades()));
    }
   */
    public View() {
        initComponents();
    
        
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePrestamos = new javax.swing.JTable();
        btn_regresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TXT_ID = new javax.swing.JTextField();
        txt_monto = new javax.swing.JTextField();
        txt_plazo = new javax.swing.JTextField();
        txt_tasa = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_listar = new javax.swing.JButton();
<<<<<<< HEAD
        cuota = new javax.swing.JLabel();
        labelCuota = new javax.swing.JLabel();
=======
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Préstamo");

        jTablePrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablePrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePrestamosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePrestamos);

        btn_regresar.setText("REGRESAR");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        jLabel2.setText("ID DEL CLIENTE:");

        jLabel1.setText("NOMBRE DEL CLIENTE:");

<<<<<<< HEAD
=======
        id.setText("jLabel3");

        nombre.setText("jLabel4");

>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("DATOS DEL PRESTAMO");

        jLabel4.setText("NUMERO DE PRESTAMO:");

        jLabel5.setText("MONTO DEL PRESTAMO:");

        jLabel6.setText("TASA DE INTERES:");

        jLabel7.setText("PLAZO DEL PRESTAMO:");

<<<<<<< HEAD
        TXT_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_IDActionPerformed(evt);
            }
        });

=======
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
        btn_agregar.setText("AGREGAR NUEVO PRESTAMO");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_listar.setText("LISTAR TODOS LOS PRESTAMOS");
        btn_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listarActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        cuota.setText("CUOTA:");

=======
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
<<<<<<< HEAD
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
=======
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nombre)
                                    .addComponent(id)))
                            .addComponent(btn_regresar)
                            .addComponent(jLabel3)
<<<<<<< HEAD
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_listar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_agregar)
                                .addGap(41, 41, 41))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(87, 87, 87)
=======
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_listar)
                                .addGap(67, 67, 67)
                                .addComponent(btn_agregar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(86, 86, 86)
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
<<<<<<< HEAD
                            .addComponent(jLabel6)
                            .addComponent(cuota))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_ID)
                            .addComponent(txt_monto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_plazo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_tasa, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelCuota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
=======
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TXT_ID)
                            .addComponent(txt_monto)
                            .addComponent(txt_plazo)
                            .addComponent(txt_tasa))))
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(TXT_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_plazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txt_tasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cuota)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_listar)
                    .addComponent(btn_agregar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
=======
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TXT_ID))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_monto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_plazo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_tasa))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_listar))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
                .addComponent(btn_regresar)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
<<<<<<< HEAD
=======
        // TODO add your handling code here:
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
        controller.clientesSHOW();
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
<<<<<<< HEAD
=======
        // TODO add your handling code here:
        
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
        String num = this.TXT_ID.getText();
        double monto = Double.parseDouble(this.txt_monto.getText());
        int plazo = Integer.parseInt(this.txt_plazo.getText());
        double tasa = Double.parseDouble(this.txt_tasa.getText());
<<<<<<< HEAD
        controller.prestamoAddTo(this.id.getText(), new Prestamo(num, monto, plazo, tasa));
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void jTablePrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePrestamosMouseClicked
        if (evt.getClickCount() == 2) {
=======
        controller.prestamoAddTo(this.id.getText() ,new Prestamo(num,monto,plazo,tasa));
        controller.prestamoSearch(id.getText());
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void jTablePrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePrestamosMouseClicked
                if(evt.getClickCount()==2){
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
            controller.PrestamoEdit(this.jTablePrestamos.getSelectedRow());
        }
    }//GEN-LAST:event_jTablePrestamosMouseClicked

<<<<<<< HEAD

    private void btn_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarActionPerformed
        controller.prestamoSearch(id.getText());
    }//GEN-LAST:event_btn_listarActionPerformed

    private void TXT_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_IDActionPerformed
=======
    private void btn_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_listarActionPerformed

    
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXT_ID;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_listar;
    private javax.swing.JButton btn_regresar;
<<<<<<< HEAD
    private javax.swing.JLabel cuota;
=======
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePrestamos;
<<<<<<< HEAD
    private javax.swing.JLabel labelCuota;
=======
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField txt_monto;
    private javax.swing.JTextField txt_plazo;
    private javax.swing.JTextField txt_tasa;
    // End of variables declaration//GEN-END:variables

<<<<<<< HEAD
=======

  
>>>>>>> 175dd393d6680ce657160a9768194dc578f7942b
}