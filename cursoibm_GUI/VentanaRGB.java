/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoibm_GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicSliderUI;

/**
 *
 * @author baxx
 */
public class VentanaRGB extends JFrame{
    private JPanel panel1;
    private JLabel etiqueta1;
    private JButton btnRed, btnGreen, btnBlue;
    private int r=0,g=0,b=0, pulse =0;
    
    public VentanaRGB(){
        this.setSize(800, 600);
        this.setTitle("Colores RGB");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        iniciarComponentes();
    
    }
    
    public void iniciarComponentes(){
        iniciarPanel();
        iniciarEtiquetas();
        iniciarBotones();
        agregarEventosRojo();
    }
    public void iniciarPanel(){
        panel1 = new JPanel();
        panel1.setLayout(null);
        this.getContentPane().add(panel1);
        
       
    
    
    }
    public void iniciarEtiquetas(){
        
        String txtEtiqueta = "Color(R="+r+" G="+g+" B= "+b+") ";
        
        etiqueta1 = new JLabel(txtEtiqueta,SwingConstants.CENTER);
        etiqueta1.setBounds(50, 50, 700, 50);
        etiqueta1.setFont(new Font("Monospaced", 1, 28));
        
        
        panel1.add(etiqueta1);
    
    }
    public void iniciarBotones(){
        
        btnRed = new JButton("Rojo");
        btnRed.setFont(new Font("Monospaced", 1, 18));
        btnRed.setBounds(100, 400, 150, 50);
        btnRed.setForeground(Color.red);
        
        btnGreen = new JButton("Verde");
        btnGreen.setFont(new Font("Monospaced", 1, 18));
        btnGreen.setBounds(325, 400, 150, 50);
        btnGreen.setForeground(Color.GREEN);
        
        btnBlue = new JButton("Azul");
        btnBlue.setFont(new Font("Monospaced", 1, 18));
        btnBlue.setBounds(550, 400, 150, 50);
        btnBlue.setForeground(Color.BLUE);
        
        
        panel1.add(btnRed);
        panel1.add(btnGreen);
        panel1.add(btnBlue);
        elegirBotones();
    }
    
    public void elegirBotones(){    
        ActionListener lr = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                pulse=1;

            }
        };
         ActionListener lg = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                pulse = 2;

            }
        };
          ActionListener lb = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                pulse = 3;

            }
        };
        
        
        
        
        btnRed.addActionListener(lr);
        btnGreen.addActionListener(lg);
        btnBlue.addActionListener(lb);
        
    
    }
    
    public void agregarEventosRojo( ){
            
        
        MouseWheelListener mwlr = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if(pulse==1){
                    
                        if(e.getPreciseWheelRotation() ==-1 && r<255){
                           
                            r++;
                    }else if(e.getPreciseWheelRotation() ==1 && r>0){
                        r--;
                    }
                }else if(pulse==2){
                    
                    if(e.getPreciseWheelRotation() ==-1 && g<255){
                           
                            g++;
                    }else if(e.getPreciseWheelRotation() ==1 && g>0){
                        g--;
                    }
                }else if(pulse==3){
                    if(e.getPreciseWheelRotation() ==-1 && b<255){
                           
                            b++;
                    }else if(e.getPreciseWheelRotation() ==1 && b>0){
                        b--;
                    }
                }
                
                
                
                etiqueta1.setText("Color(R="+r+" G="+g+" B= "+b+") ");
                panel1.setBackground(new Color(r,g,b));
                
            }
        };
        
        panel1.addMouseWheelListener(mwlr);
    
    }
    
    
  
    
   
    
}
