/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoibm_GUI;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author baxx
 */
public class VentanaCuenta extends JFrame{
    private int contador=0;
    
    private JPanel panel1;
    private JButton btn1;
    private JLabel lb1;

    public VentanaCuenta()  {
        
        this.setSize(400, 400);
        this.setTitle("Contador");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        iniciarComponentes();
        
    }
    public void iniciarComponentes(){
        iniciarPanel();
        iniciarEtiqueta();
        iniciarBoton();
    
    }
    public void iniciarPanel(){
        
        panel1 = new JPanel();
        panel1.setLayout(null);
        this.getContentPane().add(panel1);
        
    
    }
    public void iniciarBoton(){
        btn1 = new JButton("Pulse aqui");
        btn1.setBounds(150, 250, 100, 50);
        
        panel1.add(btn1);
        contarClicks();
    }
    
    public void contarClicks(){
        
        
        ActionListener l = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                contador++;
                System.out.println(contador);
                lb1.setText("El botón a sido pulsado "+ contador + " veces");
            }
        };
    
        btn1.addActionListener(l);
    }
    
    public void iniciarEtiqueta(){
        lb1 = new JLabel("El botón a sido pulsado "+ contador + " veces");
        lb1.setBounds(20, 50, 400, 50);
        lb1.setFont(new Font("Monospaced", 1, 18));
     
        panel1.add(lb1);
    }
    
    
}
