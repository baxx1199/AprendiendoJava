/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoibm_GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;


import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author baxx
 */
public class Ventana extends JFrame{
    
    JPanel panel1;
    
    public Ventana(){
        this.setSize(600, 800);
        
        this.setTitle("Primera ventana a codigo");
        
        
        this.setLocation(500, 300); //Ajusta la posicion donde aparece contanto desde la esquina superior izquierda(en pixeles)
        this.setLocationRelativeTo(null);
        //this.setResizable(false);
       // this.getContentPane().setBackground(Color.red);
        
                
        
        
        inciarComponentes();
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(600, 800));
        
      
    
    }
    
    public Ventana(int a,int b, int c, int d){
        
        this.setBounds(a, b, c, d);
        this.setTitle("Ventana Con setBound");
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setBackground(Color.red);
        this.setMinimumSize(new Dimension(600, 350));
        this.setMaximumSize(new Dimension(600, 1200));
    
    
    }
    
    private void inciarComponentes(){
    
     iniciarPanel();
//        iniciarEtiquetas();
//        //iniciarBotones();
//        iniciarRadioBotones();
//        iniciarToggleButtons();

//        iniciarCajasTexto();
//        iniciarCheckbox();
//        iniciarDesplegables();
//        iniciarCamposContraseña();

        iniciarTabla();
        iniciarLista();

    }
    public void iniciarPanel(){
         panel1= new JPanel();
         panel1.setLayout(null);// Modifica los estilos o organizacion por defecto
         ;
         // panel1.setBackground(Color.MAGENTA);//Se establece el color de fondo del panel
          this.getContentPane().add(panel1);
    }
    public void iniciarEtiquetas(){
        JLabel label1 = new JLabel("Pikachu", SwingConstants.CENTER);
        JLabel imgLabel = new JLabel();
        ImageIcon imgPika = new ImageIcon("Pikachu.jpg"); 
       
       // label1.setText("Titulo"); // Modifica el texto de la etiqueta
       //label1.setHorizontalAlignment(SwingConstants.RIGHT); //Establece la posicion del texto en el eje x
       
        label1.setBounds(150, 20, 300, 50);
        label1.setOpaque(true); //Opacidad del fondo
        label1.setBackground(Color.YELLOW);//establecer color de fondo, debe estar activado setOpaque()
        label1.setForeground(Color.GRAY); // Color de la fuente
        label1.setFont(new Font("Monospaced", 1, 42));
        
        
        
        imgLabel.setBounds(150, 80, 300, 450);
        imgLabel.setIcon(new ImageIcon(imgPika.getImage().getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(), Image.SCALE_AREA_AVERAGING)));
        
        JLabel labelEnc = new JLabel("¿Que tipo es Pikachu?", SwingConstants.CENTER);
         labelEnc.setBounds(150, 520, 300, 50);
         labelEnc.setForeground(Color.GRAY);
         labelEnc.setFont(new Font("Monospaced", 1, 22));
        
        
        panel1.add(label1);//agregar el componente al panlel
        
        panel1.add(imgLabel);
        panel1.add(labelEnc);
    }
    
    public void iniciarBotones(){
        
        //boton de Texto -Ajustes
        
        JButton boton1= new JButton("Listo");
        
       boton1.setBounds(200, 700, 100, 50);
        boton1.setEnabled(true);//Activa o descativa interaccion del boton
       boton1.setMnemonic('j');//atajo de teclado para pulsar el boton alt+ (tecla) puede ser char o int
       
       boton1.setForeground(Color.GRAY);
       boton1.setFont(new Font("arial", 1, 15));
       //boton1.setBackground(Color.red);
       boton1.setBorder(BorderFactory.createLineBorder(Color.CYAN, 3, true) ); // establecer bordes, requiere un objeto de tipo borde, el cual es una interface
       
       
       
       //boton con imagen - Ajustes
       
        JButton boton2 = new JButton();
        
                //ajustes
        
        ImageIcon btnImgExit =   new ImageIcon("salirBtn.png"); 
        boton2.setBounds(310, 700, 100, 50);
        boton2.setIcon(new ImageIcon(btnImgExit.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_AREA_AVERAGING)));
        
        
       
        panel1.add(boton1);//agrega el boton al panel
        panel1.add(boton2);
        
    }
    
    public void iniciarRadioBotones(){
        JRadioButton rb1 = new JRadioButton("Fuego", true);
        rb1.setBounds(150, 560, 200, 30);
        JRadioButton rb2 = new JRadioButton("Agua", false);
        rb2.setBounds(150, 590, 200, 30);
        JRadioButton rb3 = new JRadioButton("Electrico", false);
        rb3.setBounds(150, 620, 200, 30);
        JRadioButton rb4 = new JRadioButton("Planta", false);
        rb4.setBounds(150, 650, 200, 30);
        
        ButtonGroup grupoRB = new ButtonGroup();
        
        grupoRB.add(rb1);
        grupoRB.add(rb2);
        grupoRB.add(rb3);
        grupoRB.add(rb4);
        
        
        panel1.add(rb1);
        panel1.add(rb2);
        panel1.add(rb3);
        panel1.add(rb4);
    }
    
    public void iniciarToggleButtons(){
    
        JToggleButton tB1=new JToggleButton("Nivel evolutivo", true);
        JToggleButton tB2=new JToggleButton("Piedra Trueno", false);
        JToggleButton tB3=new JToggleButton("No evoluciona", false);
        
        tB1.setBounds(150, 690, 100, 30);
        tB2.setBounds(250, 690, 100, 30);
        tB3.setBounds(350, 690, 100, 30);
        
        ButtonGroup grupoTb = new ButtonGroup();
        
        grupoTb.add(tB1);
        grupoTb.add(tB2);
        grupoTb.add(tB3);
        
        panel1.add(tB1);
         panel1.add(tB2);
           panel1.add(tB3);
    }
    
    
   public void iniciarCajasTexto(){
       
       
       
   
//       JTextField texto1= new JTextField();
//       texto1.setBounds(150, 100, 200, 50);
       //texto1.setColumns(20);  //establece el numero de columnas que tiene la caja de texto, requiere tener layaout activado, sera sobreesccrito por SetBounds
       
       
      
       
       /*Etiqueta para la caja*/
       
//       JLabel etiquetaText = new JLabel("Nombre",SwingConstants.CENTER);
//       etiquetaText.setLabelFor(texto1);
//       etiquetaText.setBounds(50, 100, 90, 50);
//       
       
       
      
       //areas de texto
       
       JTextArea areaTxt1 = new JTextArea();
       
       areaTxt1.setBounds(150, 330, 200, 100);
       areaTxt1.setText("Escribir tu historia");
       areaTxt1.append("\nCuentanos......");   //Agrega un texto al finalizar la ultima linea
       areaTxt1.setEditable(true); // Permite habilitar o deshabilitar la edicion de la caja de texto
       
       
       
//       JLabel etiquetaText2 = new JLabel("Acerca de",SwingConstants.CENTER);
//       etiquetaText2.setLabelFor(areaTxt1);
//        etiquetaText2.setBounds(50, 330, 90, 50);
       
       
       
       
        
        // agregar Barras de scroll
        
        JScrollPane scrollArea = new JScrollPane(areaTxt1);
        scrollArea.setBounds(150, 330, 200, 100);
        scrollArea.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollArea.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
       
       
       
       
//       panel1.add(texto1);
      // panel1.add(areaTxt1);
//       panel1.add(etiquetaText);
//       panel1.add(etiquetaText2);
       

       
      panel1.add(scrollArea);
       
       
              
   }
   
   public void iniciarCheckbox (){
   
       JCheckBox check1 = new JCheckBox("Kanto",true);
       JCheckBox check2 = new JCheckBox("Jotho");
       JCheckBox check3 = new JCheckBox("Kalos");
       
       check1.setBounds(50, 100, 150, 50);
       check2.setBounds(50, 155, 150, 50);
       check3.setBounds(50, 210, 150, 50);
       
       ButtonGroup bgCheck = new ButtonGroup();
       
       
       bgCheck.add(check1);
       bgCheck.add(check2);
       bgCheck.add(check3);
       
       
       panel1.add(check1);
       panel1.add(check2);
       panel1.add(check3);
   }
   
   public void iniciarDesplegables(){
       
       
       Pokemon pokemon1 = new Pokemon("Arceus", "Normal", 520);
       Pokemon pokemon2 = new Pokemon("Dialga", "Acero", 570);
       Pokemon pokemon3 = new Pokemon("Palkia", "Dragon", 570);
       
       DefaultComboBoxModel lengen = new DefaultComboBoxModel();
       
       lengen.addElement(pokemon1);
       lengen.addElement(pokemon2);
       lengen.addElement(pokemon3);
       
       String pokemons[]={"Charmander", "Squirtle", "Bulbasaur", "Pikachu", "Eevee"};
   
       JComboBox desplegable1 = new JComboBox(pokemons);
       
       desplegable1.setBounds(50, 300, 200, 50);
   
       
       JComboBox legendarios = new JComboBox(lengen);
       
       
       legendarios.setBounds(50, 400, 200, 50);
       
       panel1.add(desplegable1);
       panel1.add(legendarios);
               
               
   }
   
   public void iniciarCamposContraseña(){
   
       JPasswordField contraseña1 = new JPasswordField();
       contraseña1.setBounds(50, 500, 200, 50);
       
       contraseña1.setText("Perro");
       
       panel1.add(contraseña1);
       
       String contraString = "";
       
       for (int i = 0; i < contraseña1.getPassword().length; i++) {
           contraString+= contraseña1.getPassword()[i];
           
       }
       
       System.out.println("contraseña: " + contraString);
       
   }
   
   
   public void iniciarTabla(){
   
       DefaultTableModel modelo = new DefaultTableModel();
       
       modelo.addColumn("Nombre");
       modelo.addColumn("Tipo");
       modelo.addColumn("Stats");
       
       String [] pkm1 = {"Pikachu", "Electrico", "360"};
       String [] pkm2 = {"Arcanine", "Fuego", "570"};
       String [] pkm3 = {"Pachirisu", "Electrico", "360"};
       String [] pkm4 = {"Pikachu", "Electrico", "360"};
       String [] pkm5 = {"Arcanine", "Fuego", "570"};
       String [] pkm6 = {"Pachirisu", "Electrico", "360"};
       String [] pkm7 = {"Pikachu", "Electrico", "360"};
       String [] pkm8 = {"Arcanine", "Fuego", "570"};
       String [] pkm9 = {"Pachirisu", "Electrico", "360"};
       String [] pkm10 = {"Pikachu", "Electrico", "360"};
       String [] pkm11 = {"Arcanine", "Fuego", "570"};
       String [] pkm12 = {"Pachirisu", "Electrico", "360"};
                       
       modelo.addRow(pkm1);
       modelo.addRow(pkm2);
       modelo.addRow(pkm3);
       modelo.addRow(pkm4);
       modelo.addRow(pkm5);
       modelo.addRow(pkm6);
       modelo.addRow(pkm7);
       modelo.addRow(pkm8);
       modelo.addRow(pkm9);
       modelo.addRow(pkm10);
       modelo.addRow(pkm11);
       modelo.addRow(pkm12);
       
   
       
       JTable tb = new JTable(modelo);
       tb.setBounds(50, 100, 400, 200);
       
       JScrollPane scroll = new JScrollPane(tb, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       scroll.setBounds(50, 100, 400, 200);
       
       
       panel1.add(scroll);
   }
   
   public void iniciarLista(){
       
       DefaultListModel lm = new DefaultListModel();
       String p = "planta";
       String e = "Electrico";
       String f = "Fuego";
       String a = "Agua";
       String d = "Dragon";
       
       Pokemon pokemon1 = new Pokemon("Arceus", "Normal", 520);
       Pokemon pokemon2 = new Pokemon("Dialga", "Acero", 570);
       Pokemon pokemon3 = new Pokemon("Palkia", "Dragon", 570);
       
       
       lm.addElement(pokemon1);
       lm.addElement(pokemon3);
       lm.addElement(pokemon2);
       lm.addElement(new Pokemon("Turtwig", "planta", 230));
       lm.addElement(new Pokemon("Chimchar", f, 250));
       lm.addElement(new Pokemon("Piplop", a, 230));
       lm.addElement(new Pokemon("Godra", d, 600));
       lm.addElement(new Pokemon("Electabuzz", e, 470));
       lm.addElement(new Pokemon("Buizel", a, 490));
       lm.addElement(new Pokemon("Charmander", f, 230));
       lm.addElement(new Pokemon("Cyndaquil", f, 230));
       lm.addElement(new Pokemon("Raichu", e, 470));
       lm.addElement(new Pokemon("Garchom", d, 600));
       lm.addElement(new Pokemon("Gyarados", a, 600));
       lm.addElement(new Pokemon("Tropius", p, 370));
               
       
       
       
       
       JList lista1 = new JList(lm);
       
       lista1.setBounds(50, 400, 400, 200);
       
       JScrollPane scrollList = new JScrollPane(lista1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       scrollList.setBounds(50, 400, 400, 200);
       
       
       
       
       panel1.add(scrollList);
       
       
   }
}
