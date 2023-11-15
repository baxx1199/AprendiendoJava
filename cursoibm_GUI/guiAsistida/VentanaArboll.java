/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cursoibm_GUI.guiAsistida;

import java.awt.Color;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author baxx
 */
public class VentanaArboll extends javax.swing.JFrame {

    DefaultMutableTreeNode ramaUno = new DefaultMutableTreeNode("DC Comics");
    DefaultTreeModel raiz = new DefaultTreeModel(ramaUno);
    
    
    public VentanaArboll() {
        iniciarArbol();
        initComponents();
    }

    public void coloresHeroes(String sel){
    
        switch (sel) {
            case "Superman":
                panel1.setBackground(Color.red);
                colorComplemento.setBackground(Color.blue);
                
                break;
            case "Batman":
                    panel1.setBackground(Color.black);
                    colorComplemento.setBackground(Color.yellow);
                break;
                
            case "Mujer Maravilla":
                
                    panel1.setBackground(Color.yellow);
                    colorComplemento.setBackground(Color.red);
                
                break;
             case "Superboy":
                
                    panel1.setBackground(Color.black);
                    colorComplemento.setBackground(Color.red);
                
                break;
            case "Supergirl":
                
                    panel1.setBackground(Color.red);
                    colorComplemento.setBackground(Color.blue);
                
                break;
            
                
             case "Nightwing":
                
                    panel1.setBackground(Color.black);
                    colorComplemento.setBackground(Color.blue);
                
                break;
                case "Robin":
                
                    panel1.setBackground(Color.red);
                    colorComplemento.setBackground(Color.green);
                
                break;
                
             case "Red hood":
                
                    panel1.setBackground(Color.red);
                    colorComplemento.setBackground(Color.gray);
                
                break;
                case "Wonder girl":
                
                    panel1.setBackground(Color.yellow);
                    colorComplemento.setBackground(Color.yellow);
                
                break;
                
             case "Lex Luthor":
                
                    panel1.setBackground(Color.green);
                    colorComplemento.setBackground(Color.black);
                
                break;
            case "Joker":
                
                    panel1.setBackground(Color.green);
                    colorComplemento.setBackground(Color.magenta);
                
                break;
            case "Hades":
                
                    panel1.setBackground(Color.red);
                    colorComplemento.setBackground(Color.orange);
                
                break;
            case "Gordon":
                
                    panel1.setBackground(Color.gray);
                    colorComplemento.setBackground(Color.lightGray);
                
                break;
             case "Alfred":
                
                    panel1.setBackground(Color.white);
                    colorComplemento.setBackground(Color.black);
                
                break;
            case "Iris":
                
                    panel1.setBackground(Color.pink);
                    colorComplemento.setBackground(Color.white);
                
                break;
            
            default:
                //throw new AssertionError();
        }
    
    }
    
    public void iniciarArbol(){
        
        DefaultMutableTreeNode heroes = new DefaultMutableTreeNode("Heroes");
        
        DefaultMutableTreeNode superman = new DefaultMutableTreeNode("Superman");
        DefaultMutableTreeNode batman = new DefaultMutableTreeNode("Batman");
        DefaultMutableTreeNode wonderWoman = new DefaultMutableTreeNode("Mujer Maravilla");
        
        
        heroes.add(superman);
        heroes.add(batman);
        heroes.add(wonderWoman);
        
        DefaultMutableTreeNode superboy = new DefaultMutableTreeNode("Superboy");
        DefaultMutableTreeNode superGirl = new DefaultMutableTreeNode("Supergirl");
        
        superman.add(superboy);
        superman.add(superGirl);
        
        DefaultMutableTreeNode nightwing = new DefaultMutableTreeNode("Nightwing");
        DefaultMutableTreeNode robin = new DefaultMutableTreeNode("Robin");
        DefaultMutableTreeNode redHood = new DefaultMutableTreeNode("Red hood");
        
        batman.add(nightwing);
        batman.add(redHood);
        batman.add(robin);
        
        DefaultMutableTreeNode wonderGirl = new DefaultMutableTreeNode("Wonder girl");
        
        wonderWoman.add(wonderGirl);
        
        
        DefaultMutableTreeNode villanos = new DefaultMutableTreeNode("Villanos");
        
        DefaultMutableTreeNode lexLuthor = new DefaultMutableTreeNode("Lex Luthor");
        DefaultMutableTreeNode joker = new DefaultMutableTreeNode("Joker");
        DefaultMutableTreeNode hades = new DefaultMutableTreeNode("Hades");
        
        villanos.add(lexLuthor);
        villanos.add(joker);
        villanos.add(hades);
        
        DefaultMutableTreeNode personasNomales = new DefaultMutableTreeNode("Personas Normales");
        
        DefaultMutableTreeNode gordon = new DefaultMutableTreeNode("Gordon");
        DefaultMutableTreeNode alfred = new DefaultMutableTreeNode("Alfred");
        DefaultMutableTreeNode iris = new DefaultMutableTreeNode("Iris");
        
        
        personasNomales.add(iris);
        personasNomales.add(alfred);
        personasNomales.add(gordon);
        
        ramaUno.add(heroes);
        ramaUno.add(villanos);
        ramaUno.add(personasNomales);
    
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
        jScrollPane1 = new javax.swing.JScrollPane();
        arbol_g = new javax.swing.JTree();
        TreeSelectionListener tsl = new TreeSelectionListener(){

            @Override
            public void valueChanged(TreeSelectionEvent e){

                DefaultMutableTreeNode selecionado =(DefaultMutableTreeNode)arbol_g.getLastSelectedPathComponent();
                System.out.print(selecionado.toString());
                coloresHeroes(selecionado.toString());

            }
        };

        arbol_g.getSelectionModel().addTreeSelectionListener(tsl);
        colorComplemento = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(204, 255, 255));

        arbol_g.setModel(raiz);
        jScrollPane1.setViewportView(arbol_g);

        javax.swing.GroupLayout colorComplementoLayout = new javax.swing.GroupLayout(colorComplemento);
        colorComplemento.setLayout(colorComplementoLayout);
        colorComplementoLayout.setHorizontalGroup(
            colorComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        colorComplementoLayout.setVerticalGroup(
            colorComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(colorComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            java.util.logging.Logger.getLogger(VentanaArboll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaArboll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaArboll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaArboll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaArboll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbol_g;
    private javax.swing.JPanel colorComplemento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel1;
    // End of variables declaration//GEN-END:variables
}
