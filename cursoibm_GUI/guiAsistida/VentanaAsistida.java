/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cursoibm_GUI.guiAsistida;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author baxx
 */
public class VentanaAsistida extends javax.swing.JFrame {
     private DefaultComboBoxModel <Persona> dcbm = new DefaultComboBoxModel<Persona>() ;
     
     private DefaultTableModel dtm = new DefaultTableModel();
    /**
     * Creates new form VentanaAsistida
     */
    public VentanaAsistida() {
        llenarComboBox();
        llenarTabla();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        etiquetaPersona = new javax.swing.JLabel();
        comboPersona = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        etiquetaDatos = new javax.swing.JLabel();
        etiquetaDatoNombre = new javax.swing.JLabel();
        nombreInput = new javax.swing.JTextField();
        etiquetaDatoApellido = new javax.swing.JLabel();
        apellidoInput = new javax.swing.JTextField();
        etiquetaDatoCorreo = new javax.swing.JLabel();
        correoInput = new javax.swing.JTextField();
        etiquetaDatoCelular = new javax.swing.JLabel();
        celularInput = new javax.swing.JTextField();
        etiquetaDatoDireccion = new javax.swing.JLabel();
        direccionInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista Personas");

        etiquetaPersona.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etiquetaPersona.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaPersona.setText("Persona");

        comboPersona.setModel(dcbm);

        btnAgregar.setText("Agregar Persona");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tablaPersonas.setModel(dtm);
        ListSelectionListener lsl = new ListSelectionListener (){
            @Override
            public void valueChanged(ListSelectionEvent e){
                if(e.getValueIsAdjusting()==true){
                    int seleccion = tablaPersonas.getSelectedRow();

                    String nombre = (String)dtm.getValueAt(seleccion, 0);
                    String apellido = (String)dtm.getValueAt(seleccion, 1);
                    String correo = (String)dtm.getValueAt(seleccion, 2);
                    String celular = (String)dtm.getValueAt(seleccion, 3);
                    String direccion = (String)dtm.getValueAt(seleccion, 4);

                    String [] datoSelect={nombre,apellido,correo,celular,direccion};

                    llenarInputs(datoSelect);
                }
            }
        };

        tablaPersonas.getSelectionModel().addListSelectionListener(lsl);
        jScrollPane1.setViewportView(tablaPersonas);

        etiquetaDatos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etiquetaDatos.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaDatos.setText("Datos Persona");

        etiquetaDatoNombre.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        etiquetaDatoNombre.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaDatoNombre.setText("Nombre");

        etiquetaDatoApellido.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        etiquetaDatoApellido.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaDatoApellido.setText("Apellido");

        etiquetaDatoCorreo.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        etiquetaDatoCorreo.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaDatoCorreo.setText("Correo");

        etiquetaDatoCelular.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        etiquetaDatoCelular.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaDatoCelular.setText("Celular");

        etiquetaDatoDireccion.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        etiquetaDatoDireccion.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaDatoDireccion.setText("Direccion");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(etiquetaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(comboPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etiquetaDatoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(apellidoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(etiquetaDatoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(celularInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 30, Short.MAX_VALUE))))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(nombreInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaDatoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaDatoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaDatoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccionInput, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(etiquetaPersona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(etiquetaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etiquetaDatoNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(etiquetaDatoApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellidoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(etiquetaDatoCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(correoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(etiquetaDatoCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(celularInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(etiquetaDatoDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(direccionInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Persona p = (Persona)comboPersona.getSelectedItem();
        
        String nombreP = p.getNombre();
        String apellidoP = p.getApellido();
        String correoP = p.getCorreo();
        String celularP = p.getCelular();
        String direccionP = p.getDireccion();
        
        
        String [] datos = {nombreP,apellidoP,correoP,celularP,direccionP};
        
        dtm.addRow(datos);
    }//GEN-LAST:event_btnAgregarActionPerformed
    
    public void llenarComboBox(){
        
        dcbm.addElement(new Persona("Julian", "Cobos", "jjCobos@prueba.com", "3195183409","Calle siempre Viva 123"));
        dcbm.addElement(new Persona("Laura", "Chirinos", "lauChirinos@prueba.com", "3132663631", "Calle siempre viva 456"));
        dcbm.addElement(new Persona("Sergio", "Cobos", "sfCobos@prueba.com", "555123456", "Calle siempre viva 123"));
        dcbm.addElement(new Persona("Baxx", "Baxter", "baxxB@prueba.com", "3195183409", "Calle siempre viva 456"));
        dcbm.addElement(new Persona("Joshua", "Bautista", "jjCobos@prueba.com", "3195183409","Calle siempre Viva 123"));
        dcbm.addElement(new Persona("Estefania", "Pineda", "lauChirinos@prueba.com", "3132663631", "Calle siempre viva 456"));
        dcbm.addElement(new Persona("Felipe", "Bautista", "sfCobos@prueba.com", "555123456", "Calle siempre viva 123"));
        dcbm.addElement(new Persona("Baxx", "Baxter", "baxxB@prueba.com", "3195183409", "Calle siempre viva 456"));
        dcbm.addElement(new Persona("Julian", "Cobos", "jjCobos@prueba.com", "3195183409","Calle siempre Viva 123"));
        dcbm.addElement(new Persona("Laura", "Chirinos", "lauChirinos@prueba.com", "3132663631", "Calle siempre viva 456"));
        dcbm.addElement(new Persona("Sergio", "Cobos", "sfCobos@prueba.com", "555123456", "Calle siempre viva 123"));
        dcbm.addElement(new Persona("Baxx", "Baxter", "baxxB@prueba.com", "3195183409", "Calle siempre viva 456"));
        dcbm.addElement(new Persona("Joshua", "Bautista", "jjCobos@prueba.com", "3195183409","Calle siempre Viva 123"));
        dcbm.addElement(new Persona("Estefania", "Pineda", "lauChirinos@prueba.com", "3132663631", "Calle siempre viva 456"));
        dcbm.addElement(new Persona("Felipe", "Bautista", "sfCobos@prueba.com", "555123456", "Calle siempre viva 123"));
        dcbm.addElement(new Persona("Baxx", "Baxter", "baxxB@prueba.com", "3195183409", "Calle siempre viva 456"));
        dcbm.addElement(new Persona("Julian", "Cobos", "jjCobos@prueba.com", "3195183409","Calle siempre Viva 123"));
        dcbm.addElement(new Persona("Laura", "Chirinos", "lauChirinos@prueba.com", "3132663631", "Calle siempre viva 456"));
        dcbm.addElement(new Persona("Sergio", "Cobos", "sfCobos@prueba.com", "555123456", "Calle siempre viva 123"));
        dcbm.addElement(new Persona("Baxx", "Baxter", "baxxB@prueba.com", "3195183409", "Calle siempre viva 456"));
        dcbm.addElement(new Persona("Joshua", "Bautista", "jjCobos@prueba.com", "3195183409","Calle siempre Viva 123"));
        dcbm.addElement(new Persona("Estefania", "Pineda", "lauChirinos@prueba.com", "3132663631", "Calle siempre viva 456"));
        dcbm.addElement(new Persona("Felipe", "Bautista", "sfCobos@prueba.com", "555123456", "Calle siempre viva 123"));
        dcbm.addElement(new Persona("Baxx", "Baxter", "baxxB@prueba.com", "3195183409", "Calle siempre viva 456"));
        
        
    }
    public void llenarTabla(){
    
        dtm.addColumn("Nombre");
        dtm.addColumn("Apellido");
        dtm.addColumn("Correo");
        dtm.addColumn("Celular");
        dtm.addColumn("Direccion");
    
    }
    public void llenarInputs (String[] p){
        
        nombreInput.setText(p[0]);
        apellidoInput.setText(p[1]);
        correoInput.setText(p[2]);
        celularInput.setText(p[3]);
        direccionInput.setText(p[4]);
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaAsistida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAsistida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAsistida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAsistida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        try {
             UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(VentanaAsistida.class.getName()).log(Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             Logger.getLogger(VentanaAsistida.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             Logger.getLogger(VentanaAsistida.class.getName()).log(Level.SEVERE, null, ex);
         } catch (UnsupportedLookAndFeelException ex) {
             Logger.getLogger(VentanaAsistida.class.getName()).log(Level.SEVERE, null, ex);
         }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAsistida().setVisible(true);
            }
        });
        
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoInput;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JTextField celularInput;
    private javax.swing.JComboBox<Persona> comboPersona;
    private javax.swing.JTextField correoInput;
    private javax.swing.JTextField direccionInput;
    private javax.swing.JLabel etiquetaDatoApellido;
    private javax.swing.JLabel etiquetaDatoCelular;
    private javax.swing.JLabel etiquetaDatoCorreo;
    private javax.swing.JLabel etiquetaDatoDireccion;
    private javax.swing.JLabel etiquetaDatoNombre;
    private javax.swing.JLabel etiquetaDatos;
    private javax.swing.JLabel etiquetaPersona;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nombreInput;
    private javax.swing.JPanel panel1;
    private javax.swing.JTable tablaPersonas;
    // End of variables declaration//GEN-END:variables
}