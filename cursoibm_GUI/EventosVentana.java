/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoibm_GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.border.Border;



/**
 *
 * @author baxx
 */
public class EventosVentana extends JFrame{
    
    
    JPanel panelE;
    private JLabel etSaludo;
    private JButton botonPr;
    private JTextField txt1;
    private JTextArea areatxt1;
    private JButton botonMou;

    public EventosVentana(){
        
        this.setSize(600, 800);
      
        setTitle("Prueba de Eventos");
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        iniciarComponentes();
        
    }
    
    
    
    public void iniciarComponentes(){
        iniciarPanel();
        iniciarCajaTexto();
        //iniciarBotones();
        //iniciarEtiqueta();
        
    }
    
    public void iniciarPanel(){
        panelE = new JPanel();
        
        
        panelE.setLayout(null);
        this.getContentPane().add(panelE);
        
       // eventosMovimiento();
    }
    public void iniciarCajaTexto(){
        
        txt1 = new JTextField();
        
        txt1.setBounds(50, 100, 150, 50);
        
        areatxt1 = new JTextArea();
        areatxt1.setBounds(220 , 100, 300, 400);
        
        JScrollPane scrolArea = new JScrollPane(areatxt1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrolArea.setBounds(220 , 100, 300, 400);
        
        
        panelE.add(scrolArea);
        panelE.add(txt1);
     
            eventosTeclas();
    }
    
    public void eventosTeclas(){
        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //areatxt1.append("presionado letras o numeros\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
               // areatxt1.append("presionado...\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyChar()=='*'){
                    dispose();
                
                }
                
                areatxt1.append(""+e.getKeyChar());
            }
        };
        
        txt1.addKeyListener(kl);
    
    }
    public void iniciarBotones(){
        
        botonPr = new JButton("Saludar");
        botonPr.setBounds(50, 170, 100, 45);
        botonPr.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
        
        
        ActionListener  l = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
               etSaludo.setText("Hola "+ txt1.getText());
            }
        };
        
        
        
        botonPr.addActionListener(l);
        panelE.add(botonPr);
        
        botonAcMouse();
    
    }
    
    public void botonAcMouse(){
    
            botonMou = new JButton("Clck");
            
           
            
            botonMou.setBounds(50, 440, 100, 50);
            
            MouseListener ml = new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    
                    
                    
                    if(e.isAltDown()){
                    
                            areatxt1.append("Click \tcon Alt\n");
                    }else if (e.isControlDown()) {
                        areatxt1.append("Click \tcon CTRl\n");
                    }else if (e.isShiftDown()) {
                        areatxt1.append("Click \tcon Shift\n");
                    }else if (e.isMetaDown()) {
                        areatxt1.append("Click \tDERECHO\n");
                    } else {
                        areatxt1.append("Click\n");
                    }
                    
                    if(e.getClickCount()==2){
                        areatxt1.append("Double-Click\n");
                    }
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    areatxt1.append("press\n");
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    areatxt1.append("released\n");
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    
                    areatxt1.append("entered\n");
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    areatxt1.append("exit\n");
                }
            };
            
            
            botonMou.addMouseListener(ml);
            panelE.add(botonMou);
            
            
            JButton btnBorrar = new JButton("Borrar");
            
            btnBorrar.setBounds(50, 495, 100, 50);
            
             ActionListener  l = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    areatxt1.setText("");
                }
             };
             
             btnBorrar.addActionListener(l);
             
             panelE.add(btnBorrar);
            
    
    
    }
    
    public void eventosMovimiento(){
        MouseMotionListener lm = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                areatxt1.append("arrastrando\n");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                areatxt1.append("Moviendo\n");
                
            }
        };
        
        
        panelE.addMouseMotionListener(lm);
    }
    public void iniciarEtiqueta(){
    
        etSaludo= new JLabel();
        
         etSaludo.setFont(new Font("Monospaced", 1, 42));
        
         
        etSaludo.setBounds(50, 350, 600, 50);
           
        
            
        panelE.add(etSaludo);
    }
   
}
