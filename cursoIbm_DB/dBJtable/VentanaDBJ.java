/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cursoIbm_DB.dBJtable;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author baxx
 */
public class VentanaDBJ extends javax.swing.JFrame {
    
    private static final String url ="jdbc:mysql://localhost:3306/school?autoReconnet=true&useSSL=false";
    private static final String user="root";
    private static final String password = "1234";
    PreparedStatement ps;
    ResultSet rs ;
    DefaultTableModel dtm;
    
    public VentanaDBJ() {
        initComponents();
        setLocationRelativeTo(null);
        input_id.setVisible(false);
        btn_save.setEnabled(false);
        btn_clear1.setEnabled(false);
    }

    
    private Connection getConnection(){
        Connection connection=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection=(Connection) DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            System.err.println("Error: "+e);
        }
        return connection;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStudents = new javax.swing.JTable();
        input_search = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        input_day = new javax.swing.JTextField();
        input_name = new javax.swing.JTextField();
        input_lastname = new javax.swing.JTextField();
        input_age = new javax.swing.JTextField();
        input_year1 = new javax.swing.JTextField();
        input_month = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        btn_clear1 = new javax.swing.JButton();
        input_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        input_code = new javax.swing.JTextField();
        btn_exit = new javax.swing.JButton();
        btn_update1 = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Edad", " Fecha de nacimiento"
            }
        ));
        jScrollPane1.setViewportView(tableStudents);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 420, 300));
        jPanel1.add(input_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 310, 40));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado de estudiantes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        btnSearch.setBackground(new java.awt.Color(204, 204, 204));
        btnSearch.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(51, 51, 51));
        btnSearch.setText("Buscar");
        btnSearch.setOpaque(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 90, 40));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("#");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 10, -1));

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Edad");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 114, -1));

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Dia");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 30, -1));

        jLabel5.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Apellido");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 114, 20));
        jPanel3.add(input_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 50, -1));
        jPanel3.add(input_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, -1));
        jPanel3.add(input_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 200, -1));
        jPanel3.add(input_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 200, -1));
        jPanel3.add(input_year1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 70, -1));
        jPanel3.add(input_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 50, -1));

        jLabel6.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Fecha de nacimiento");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 150, -1));

        jLabel7.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Año");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 30, -1));

        jLabel8.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Mes");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 30, -1));

        btn_save.setBackground(new java.awt.Color(51, 255, 204));
        btn_save.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btn_save.setForeground(new java.awt.Color(51, 51, 51));
        btn_save.setText("Guardar");
        btn_save.setOpaque(false);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel3.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 80, -1));

        btn_clear1.setBackground(new java.awt.Color(255, 102, 102));
        btn_clear1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btn_clear1.setForeground(new java.awt.Color(51, 51, 51));
        btn_clear1.setText("Limpiar");
        btn_clear1.setOpaque(false);
        btn_clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clear1ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_clear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 80, -1));

        input_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_id.setText("0000");
        jPanel3.add(input_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 60, -1));

        jLabel9.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Nombre");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 14, 114, -1));

        input_code.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_code.setText("0000");
        jPanel3.add(input_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 60, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 220, 350));

        btn_exit.setBackground(new java.awt.Color(204, 204, 204));
        btn_exit.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(51, 51, 51));
        btn_exit.setText("Salir");
        btn_exit.setOpaque(false);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 80, -1));

        btn_update1.setBackground(new java.awt.Color(255, 255, 102));
        btn_update1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btn_update1.setForeground(new java.awt.Color(51, 51, 51));
        btn_update1.setText("Editar");
        btn_update1.setOpaque(false);
        btn_update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 80, -1));

        btn_delete.setBackground(new java.awt.Color(255, 102, 102));
        btn_delete.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(51, 51, 51));
        btn_delete.setText("Borrar");
        btn_delete.setOpaque(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String filter= input_search.getText();
        getRegisters(filter);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btn_clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clear1ActionPerformed
       clearfields();
    }//GEN-LAST:event_btn_clear1ActionPerformed

    private void clearfields(){
        input_age.setText("");
       input_search.setText("");
       input_day.setText("");
       input_lastname.setText("");
       input_month.setText("");
       input_name.setText("");
       input_code.setText("");
       input_year1.setText("");
       input_id.setText("");
    }
    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update1ActionPerformed
        
        
        
        int rowSelect= tableStudents.getSelectedRow();
        if(rowSelect!=-1){
                
                String codeSelect =  String.valueOf((tableStudents.getValueAt(rowSelect, 0)));
                Connection conn = getConnection();
            try {
                ps = (PreparedStatement) conn.prepareStatement("select * from student where codeStudent="+codeSelect);
                rs= ps.executeQuery();

                if(rs.next()){
                    input_id.setText(String.valueOf(rs.getInt("idstudent")));
                    input_code.setText(String.valueOf(rs.getInt("codeStudent")));
                    input_name.setText(rs.getString("name"));
                    input_lastname.setText(rs.getString("lastname"));
                    input_age.setText(String.valueOf(rs.getInt("age")));
                    input_day.setText(String.valueOf( rs.getDate("date_of_birth").getDay()));
                    input_month.setText(String.valueOf( rs.getDate("date_of_birth").getMonth()));
                    SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
                    String currentYear = getYearFormat.format(rs.getDate("date_of_birth"));
                    input_year1.setText(String.valueOf( currentYear ));
                    btn_save.setEnabled(true);
                    btn_clear1.setEnabled(true);
                    

                }
                    ps.close();
            } catch (Exception e) {
                System.err.println("Error: "+e);
            }
        }
        
        
    }//GEN-LAST:event_btn_update1ActionPerformed

    private void getRegisters(String filter){
        Connection conn = getConnection();
        dtm = new DefaultTableModel();
        tableStudents.setModel(dtm);
        dtm.addColumn("code");
        dtm.addColumn("Nombre");
        dtm.addColumn("Apellido");
        dtm.addColumn("Edad");
        dtm.addColumn("Fecha de nacimiento");
        Object studentI[]= new Object[5];
        
        String strQuery=getSearch(filter);
        
        try {
            ps = (PreparedStatement) conn.prepareStatement(strQuery);
            rs= ps.executeQuery();
            
            while (rs.next()) {
                for (int i = 0; i < 5; i++) {
                    studentI[i]=rs.getObject(i+1);
                }
                dtm.addRow(studentI);
            }
            
           
          ps.close();
          input_search.setText(null);
            
        } catch (Exception e) {
            System.err.println("Error:"+ e);
        }
    }
    
    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int rowSelect= tableStudents.getSelectedRow();
        String codeSelect =  String.valueOf((tableStudents.getValueAt(rowSelect, 0)));
        Connection conn = getConnection();
        
        try {
            ps = (PreparedStatement) conn.prepareStatement("delete from student where codeStudent=?");
            ps.setInt(1, Integer.parseInt(codeSelect));
            int statementQuery= ps.executeUpdate();
            if(statementQuery>0){
                JOptionPane.showMessageDialog(null, "Registro Eliminado exitosamente");
                getRegisters("");
            }else{
                JOptionPane.showMessageDialog(null, "Algo a salido mal, imposible eliminar");
                
            }
            ps.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
       Connection conn = getConnection();
       String dateBirth = input_year1.getText()+"-"+input_month.getText()+"-"+input_day.getText();
        try {
            ps=(PreparedStatement) conn.prepareStatement("update student set codeStudent=?,name=?,lastname=?,age=?,date_of_birth=? where idstudent=?");
            ps.setInt(1, Integer.parseInt( input_code.getText()));
            ps.setString(2, input_name.getText());
            ps.setString(3, input_lastname.getText());
            ps.setInt(4, Integer.parseInt(input_age.getText()));

            ps.setDate(5, Date.valueOf(dateBirth));
            ps.setInt(6, Integer.parseInt(input_id.getText()));
            
            int statementQuery= ps.executeUpdate();
            
            if(statementQuery>0){
                JOptionPane.showMessageDialog(null, "Los datos del estudiante se ha actualizado con exito");
                clearfields();
                getRegisters("");
                btn_save.setEnabled(false);
                btn_clear1.setEnabled(false);
                btn_update1.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "algo ha salido mal");
            }
            
            conn.close();
            
        } catch (Exception e) {
            System.err.println("Error: "+ e);
        }
       
    }//GEN-LAST:event_btn_saveActionPerformed

    public String getSearch(String s){
        String searchtxt= s,querytxt="";
            
            if(searchtxt== null||"".equals(searchtxt)||" ".equals(searchtxt)||"*".equals(searchtxt)){
                querytxt="select codeStudent,name,lastname,age,date_of_birth from student";
            }else{
                querytxt="select codeStudent,name,lastname,age,date_of_birth from student where codeStudent="+searchtxt;
            }
        
        return querytxt;
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
            java.util.logging.Logger.getLogger(VentanaDBJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDBJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDBJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDBJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDBJ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btn_clear1;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update1;
    private javax.swing.JTextField input_age;
    private javax.swing.JTextField input_code;
    private javax.swing.JTextField input_day;
    private javax.swing.JTextField input_id;
    private javax.swing.JTextField input_lastname;
    private javax.swing.JTextField input_month;
    private javax.swing.JTextField input_name;
    private javax.swing.JTextField input_search;
    private javax.swing.JTextField input_year1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableStudents;
    // End of variables declaration//GEN-END:variables
}
