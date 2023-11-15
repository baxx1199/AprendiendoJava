/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoIbm_DB.dbimg;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

 
public class Imagen extends JPanel{
    private BufferedImage imgPath;

    public Imagen(int widht, int height, BufferedImage imgPath) {
        this.setSize(widht, height);
        this.imgPath = imgPath;
    }
    
    @Override
    public void paint(Graphics g){
        Dimension sizepanel = getSize();
        //ImageIcon img = new ImageIcon(getClass().getResource(imgPath));
        Image img = new ImageIcon(imgPath).getImage();
        g.drawImage(img, 0, 0, sizepanel.width, sizepanel.height, null);
        setOpaque(false);
        super.paintComponent(g);
        
    }
    
}
