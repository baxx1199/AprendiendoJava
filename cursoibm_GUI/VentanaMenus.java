/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cursoibm_GUI;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author baxx
 */
public class VentanaMenus extends javax.swing.JFrame {
    private int cantidadIndividuos =0;
    private ArrayList<String> lista ;
    private boolean ningunoAc = false;
    /**
     * Creates new form VentanaMenus
     */
    public VentanaMenus() {
        initComponents();
        grupoRB_MI.add(unoRB_MI);
        grupoRB_MI.add(dosRB_MI);
        grupoRB_MI.add(tresRB_MI);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRB_MI = new javax.swing.ButtonGroup();
        desplegablePOP = new javax.swing.JPopupMenu();
        tamaño = new javax.swing.JMenu();
        pequeño = new javax.swing.JMenuItem();
        grande = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        color = new javax.swing.JMenu();
        rojo = new javax.swing.JMenuItem();
        azul = new javax.swing.JMenuItem();
        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newProyectItem = new javax.swing.JMenuItem();
        openMI = new javax.swing.JMenuItem();
        saveMI = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitMI = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        renameMI = new javax.swing.JMenuItem();
        accionesMI = new javax.swing.JMenu();
        realizarMI = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        selectMI = new javax.swing.JMenu();
        elegirIndividuosMI = new javax.swing.JMenu();
        unoRB_MI = new javax.swing.JRadioButtonMenuItem();
        dosRB_MI = new javax.swing.JRadioButtonMenuItem();
        tresRB_MI = new javax.swing.JRadioButtonMenuItem();
        individuosMI = new javax.swing.JMenu();
        personaCB_MI = new javax.swing.JCheckBoxMenuItem();
        animalCB_MI = new javax.swing.JCheckBoxMenuItem();
        aliensCB_MI = new javax.swing.JCheckBoxMenuItem();
        robotCB_MI = new javax.swing.JCheckBoxMenuItem();
        zeroCB_MI = new javax.swing.JCheckBoxMenuItem();

        tamaño.setText("Tamaño ventana");

        pequeño.setText("Pequeño");
        pequeño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pequeñoActionPerformed(evt);
            }
        });
        tamaño.add(pequeño);

        grande.setText("Grande");
        grande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grandeActionPerformed(evt);
            }
        });
        tamaño.add(grande);

        desplegablePOP.add(tamaño);
        desplegablePOP.add(jSeparator2);

        color.setText("Cambiar color De fondo");

        rojo.setText("Rojo");
        rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rojoActionPerformed(evt);
            }
        });
        color.add(rojo);

        azul.setText("Azul");
        azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azulActionPerformed(evt);
            }
        });
        color.add(azul);

        desplegablePOP.add(color);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(204, 204, 204));
        panel1.setPreferredSize(new java.awt.Dimension(400, 600));
        panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panel1MouseReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo (2).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(1048, 1048, 1048))
        );

        jMenu1.setText("File");

        newProyectItem.setText("Crear nuevo...");
        newProyectItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProyectItemActionPerformed(evt);
            }
        });
        jMenu1.add(newProyectItem);

        openMI.setText("Abrir");
        openMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMIActionPerformed(evt);
            }
        });
        jMenu1.add(openMI);

        saveMI.setText("Guardar");
        saveMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMIActionPerformed(evt);
            }
        });
        jMenu1.add(saveMI);
        jMenu1.add(jSeparator1);

        exitMI.setText("Salir");
        exitMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMIActionPerformed(evt);
            }
        });
        jMenu1.add(exitMI);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        renameMI.setText("renombrar");
        jMenu2.add(renameMI);

        jMenuBar1.add(jMenu2);

        accionesMI.setText("Acciones");

        realizarMI.setText("realizar");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ADD, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Saludar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        realizarMI.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SUBTRACT, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Despedir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        realizarMI.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Preguntar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        realizarMI.add(jMenuItem3);

        accionesMI.add(realizarMI);

        selectMI.setText("seleccionar");

        elegirIndividuosMI.setText("Cantidad");

        unoRB_MI.setSelected(true);
        unoRB_MI.setText("1");
        unoRB_MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoRB_MIActionPerformed(evt);
            }
        });
        elegirIndividuosMI.add(unoRB_MI);

        dosRB_MI.setSelected(true);
        dosRB_MI.setText("2");
        dosRB_MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosRB_MIActionPerformed(evt);
            }
        });
        elegirIndividuosMI.add(dosRB_MI);

        tresRB_MI.setSelected(true);
        tresRB_MI.setText("3");
        tresRB_MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresRB_MIActionPerformed(evt);
            }
        });
        elegirIndividuosMI.add(tresRB_MI);

        selectMI.add(elegirIndividuosMI);

        individuosMI.setText("individuos");

        personaCB_MI.setSelected(true);
        personaCB_MI.setText("Peronas");
        personaCB_MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personaCB_MIActionPerformed(evt);
            }
        });
        individuosMI.add(personaCB_MI);

        animalCB_MI.setSelected(true);
        animalCB_MI.setText("Animales");
        animalCB_MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalCB_MIActionPerformed(evt);
            }
        });
        individuosMI.add(animalCB_MI);

        aliensCB_MI.setSelected(true);
        aliensCB_MI.setText("Aliens");
        aliensCB_MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aliensCB_MIActionPerformed(evt);
            }
        });
        individuosMI.add(aliensCB_MI);

        robotCB_MI.setSelected(true);
        robotCB_MI.setText("Robots");
        robotCB_MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                robotCB_MIActionPerformed(evt);
            }
        });
        individuosMI.add(robotCB_MI);

        zeroCB_MI.setSelected(true);
        zeroCB_MI.setText("ninguno");
        zeroCB_MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroCB_MIActionPerformed(evt);
            }
        });
        individuosMI.add(zeroCB_MI);

        selectMI.add(individuosMI);

        accionesMI.add(selectMI);

        jMenuBar1.add(accionesMI);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMIActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMIActionPerformed

    private void newProyectItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProyectItemActionPerformed
    JOptionPane.showMessageDialog(null, "Se a creado un nuevo documento");
    }//GEN-LAST:event_newProyectItemActionPerformed

    private void openMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMIActionPerformed
        JOptionPane.showMessageDialog(null, "Has abierto un documento");

    }//GEN-LAST:event_openMIActionPerformed

    private void saveMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMIActionPerformed
        JOptionPane.showMessageDialog(null, "Se ha guardado exitosamente");
    }//GEN-LAST:event_saveMIActionPerformed

    private void tresRB_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresRB_MIActionPerformed
        cantidadIndividuos=3;
    }//GEN-LAST:event_tresRB_MIActionPerformed

    private void zeroCB_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroCB_MIActionPerformed
       
        if (zeroCB_MI.getState()) {
            ningunoAc=true;
        }else{
            ningunoAc=false;
        }
        
    }//GEN-LAST:event_zeroCB_MIActionPerformed

    private void personaCB_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personaCB_MIActionPerformed
        System.out.println("persona"+ personaCB_MI.getState());
    }//GEN-LAST:event_personaCB_MIActionPerformed

    private void robotCB_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_robotCB_MIActionPerformed
        System.out.println("robot"+ robotCB_MI.getState());
    }//GEN-LAST:event_robotCB_MIActionPerformed

    private void aliensCB_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aliensCB_MIActionPerformed
       System.out.println("alien"+ aliensCB_MI.getState());
    }//GEN-LAST:event_aliensCB_MIActionPerformed

    private void animalCB_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalCB_MIActionPerformed
       System.out.println("animal"+ animalCB_MI.getState());
    }//GEN-LAST:event_animalCB_MIActionPerformed

    private void unoRB_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoRB_MIActionPerformed
       cantidadIndividuos=1;
    }//GEN-LAST:event_unoRB_MIActionPerformed

    private void dosRB_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosRB_MIActionPerformed
       cantidadIndividuos=2;
    }//GEN-LAST:event_dosRB_MIActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(ningunoAc){
                JOptionPane.showMessageDialog(null, "Hola");
        }else{
            JOptionPane.showMessageDialog(null, "Hola a "+ cantidadIndividuos + "  "+ encontrarsaludo());
        }
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       if(ningunoAc){
                JOptionPane.showMessageDialog(null, "Adios");
        }else{
            JOptionPane.showMessageDialog(null, "Adios a "+ cantidadIndividuos + "  "+ encontrarsaludo());
        }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if(ningunoAc){
                JOptionPane.showMessageDialog(null, "¿Que tal el viaje?");
        }else{
            JOptionPane.showMessageDialog(null, "preguntando a "+ cantidadIndividuos + "  "+ encontrarsaludo() +"¿Que tal el viaje?");
        }
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void panel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseReleased
        if (evt.isPopupTrigger()) {
            desplegablePOP.show(panel1, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_panel1MouseReleased

    private void pequeñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pequeñoActionPerformed
        this.setSize(300, 300);
    }//GEN-LAST:event_pequeñoActionPerformed

    private void grandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grandeActionPerformed
        this.setSize(700, 700);
    }//GEN-LAST:event_grandeActionPerformed

    private void rojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rojoActionPerformed
      panel1.setBackground(Color.red);
    }//GEN-LAST:event_rojoActionPerformed

    private void azulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azulActionPerformed
        panel1.setBackground(Color.blue);
    }//GEN-LAST:event_azulActionPerformed

    
    public String encontrarsaludo (){
        String saludo= "";
            
        if (personaCB_MI.getState()){
            if(cantidadIndividuos==1){
                saludo += " Persona,";
            }else{
                saludo += " Personas,";
            }
            
        }
        
        if (animalCB_MI.getState()){
            if(cantidadIndividuos==1){
                saludo += " Animal,";
            }else{
                saludo += " animales,";
            }
            
        }
        
        if (aliensCB_MI.getState()){
            if(cantidadIndividuos==1){
                saludo += " Alien,";
            }else{
                saludo += " Aliens,";
            }
            
        }
        
        if (robotCB_MI.getState()){
            if(cantidadIndividuos==1){
                saludo += " Robot";
            }else{
                saludo += " Robots";
            }
            
        }
        return saludo;
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
            java.util.logging.Logger.getLogger(VentanaMenus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMenus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMenus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMenus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMenus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu accionesMI;
    private javax.swing.JCheckBoxMenuItem aliensCB_MI;
    private javax.swing.JCheckBoxMenuItem animalCB_MI;
    private javax.swing.JMenuItem azul;
    private javax.swing.JMenu color;
    private javax.swing.JPopupMenu desplegablePOP;
    private javax.swing.JRadioButtonMenuItem dosRB_MI;
    private javax.swing.JMenu elegirIndividuosMI;
    private javax.swing.JMenuItem exitMI;
    private javax.swing.JMenuItem grande;
    private javax.swing.ButtonGroup grupoRB_MI;
    private javax.swing.JMenu individuosMI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem newProyectItem;
    private javax.swing.JMenuItem openMI;
    private javax.swing.JPanel panel1;
    private javax.swing.JMenuItem pequeño;
    private javax.swing.JCheckBoxMenuItem personaCB_MI;
    private javax.swing.JMenu realizarMI;
    private javax.swing.JMenuItem renameMI;
    private javax.swing.JCheckBoxMenuItem robotCB_MI;
    private javax.swing.JMenuItem rojo;
    private javax.swing.JMenuItem saveMI;
    private javax.swing.JMenu selectMI;
    private javax.swing.JMenu tamaño;
    private javax.swing.JRadioButtonMenuItem tresRB_MI;
    private javax.swing.JRadioButtonMenuItem unoRB_MI;
    private javax.swing.JCheckBoxMenuItem zeroCB_MI;
    // End of variables declaration//GEN-END:variables
}