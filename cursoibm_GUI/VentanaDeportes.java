/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoibm_GUI;

import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;


public class VentanaDeportes extends JFrame {
    
    private JPanel panel1;
    private JLabel etiqueta1, imagen1;
    private JRadioButton rb1, rb2, rb3, rb4;

    public VentanaDeportes() {
        
        this.setSize(700, 400);
        this.setTitle("Elegir deporte");
        this.setLocationRelativeTo(null);
        iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
    public void iniciarComponentes(){
        iniciarPanel();
        iniciEtiquetas();
        iniciarRadioBotones();
    
    }
    
    public void iniciarPanel(){
    
        panel1 = new JPanel();
        panel1.setLayout(null);
        this.getContentPane().add(panel1);
     
    
    }
    
    public void iniciEtiquetas(){
    
        etiqueta1 = new JLabel("Elige tu Deporte Favorito", SwingConstants.LEFT);
        
        etiqueta1.setBounds(50, 50, 300, 50);
        etiqueta1.setFont(new Font("Jetbrains Mono", 1, 16));
         
        panel1.add(etiqueta1);
    }
    
    public void iniciarRadioBotones(){
        rb1 = new JRadioButton("Futbol");
        rb1.setBounds(50, 150, 150, 50);
        rb1.setFont(new Font("Jetbrains Mono", 1, 15));
        
        
        
        rb2 = new JRadioButton("Baloncesto");
        rb2.setBounds(50, 200, 150, 50);
        rb2.setFont(new Font("Jetbrains Mono", 1, 15));
        
        
        rb3 = new JRadioButton("Tenis");
        rb3.setBounds(50, 250, 150, 50);
        rb3.setFont(new Font("Jetbrains Mono", 1, 15));
        
        rb4 = new JRadioButton("Voleibol");
        rb4.setBounds(50, 300, 150, 50);
        rb4.setFont(new Font("Jetbrains Mono", 1, 15));
        
        
        
        
        ButtonGroup rbs = new ButtonGroup();
        rbs.add(rb1);
        rbs.add(rb2);
        rbs.add(rb3);
        rbs.add(rb4);
        
        panel1.add(rb1);
        panel1.add(rb2);
        panel1.add(rb3);
        panel1.add(rb4);
        mostrarSeleccion();
        
    }
    
    public void mostrarSeleccion(){
        imagen1 = new JLabel();
        imagen1.setBounds(250, 100, 400, 200);
        panel1.add(imagen1);
        
        final ImageIcon imgFutbol = new ImageIcon(getClass().getResource("/imagenes/futbol.jpg"));
        final ImageIcon imgBaloncesto = new ImageIcon(getClass().getResource("/imagenes/baloncesto.jpg"));
        final ImageIcon imgTenis = new ImageIcon(getClass().getResource("/imagenes/tenis.jpg"));
        final ImageIcon imgVoleibol = new ImageIcon(getClass().getResource("/imagenes/voleibol.jpg"));
        
        ActionListener al1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                imagen1.setIcon(new ImageIcon (imgFutbol.getImage().getScaledInstance(imagen1.getWidth(), imagen1.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        
        ActionListener al2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                imagen1.setIcon(new ImageIcon (imgBaloncesto.getImage().getScaledInstance(imagen1.getWidth(), imagen1.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        
        ActionListener al3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                imagen1.setIcon(new ImageIcon (imgTenis.getImage().getScaledInstance(imagen1.getWidth(), imagen1.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        ActionListener al4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                imagen1.setIcon(new ImageIcon (imgVoleibol.getImage().getScaledInstance(imagen1.getWidth(), imagen1.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        rb1.addActionListener(al1);
        rb2.addActionListener(al2);
        rb3.addActionListener(al3);
        rb4.addActionListener(al4);
    }
}
