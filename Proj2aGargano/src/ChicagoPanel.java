//Vinnie Gargano, Project 2a, 1/24/18 - Chicago Panel
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChicagoPanel extends JPanel {
	
	public ChicagoPanel( ) {
		setBackground(Color.black);
	}
		public void paintComponent(Graphics g) {
		super.paintComponent(g);
	    
		//Title of picture
        g.setFont(new Font("cursive", Font.BOLD, 50));
        g.setColor(Color.blue);
        g.drawString("Chicago at Night", 10, 50);
       
        g.setColor(Color.gray); //Moon
        g.fillOval(30, 80, 200, 200);
        g.setColor(Color.black);
        g.drawOval(30, 80, 200, 200);
        
        g.setColor(Color.black); //Crescent Moon
        g.fillOval(20, 70, 200, 200);
        g.setColor(Color.black);
        g.drawOval(20, 70, 200, 200);
        
        g.setColor(Color.yellow);// Little Dipper
        g.fillOval(380, 80, 5, 5);
        g.fillOval(355, 120, 5, 5);
        g.fillOval(340, 160, 5, 5);
        g.fillOval(370, 200, 5, 5);
        g.fillOval(420, 270, 5, 5);
        g.fillOval(360, 290, 5, 5);
        g.fillOval(320, 220, 5, 5);
        
        g.setColor(Color.red);// 1st building
        g.fillRect(0, 430, 50, 70);
        g.setColor(Color.white);
        g.drawRect(0, 430, 50, 70);
        
        g.setColor(Color.gray);// 2nd building
        g.fillRect(30, 450, 50, 50);
        g.setColor(Color.blue);
        g.drawRect(30, 450, 50, 50);
        
        g.setColor(Color.blue);// 3rd building
        g.fillRect(80, 400, 70, 100);
        g.setColor(Color.gray);
        g.drawRect(80, 400, 70, 100);
        
        g.setColor(Color.gray);// 4th building
        g.fillRect(150, 410, 40, 90);
        g.setColor(Color.red);
        g.drawRect(150, 410, 40, 90);
        
        g.setColor(Color.red);// 4th building (antenna)
        g.fillRect(160, 360, 10, 50);
        g.setColor(Color.blue);// 
        g.drawRect(160, 360, 10, 50);
        
        g.setColor(Color.black); // Sears Tower (main)
        g.fillRect(190, 280, 76, 220);
        g.setColor(Color.red);
        g.drawRect(190, 280, 76, 220);
        
        g.setColor(Color.gray);//Sears Tower windows (main)
        g.fillRect(195, 281, 2, 219);
        g.fillRect(200, 281, 2, 219);
        g.fillRect(205, 281, 2, 219);
        g.fillRect(210, 281, 2, 219);
        g.fillRect(215, 281, 2, 219);
        g.fillRect(220, 281, 2, 219);
        g.fillRect(225, 281, 2, 219);
        g.fillRect(230, 281, 2, 219);
        g.fillRect(235, 281, 2, 219);
        g.fillRect(240, 281, 2, 219);
        g.fillRect(245, 281, 2, 219);
        g.fillRect(250, 281, 2, 219);
        g.fillRect(255, 281, 2, 219);
        g.fillRect(260, 281, 2, 219); 
        
        g.setColor(Color.black);// Sears Tower (second)
        g.fillRect(209, 190, 40, 90);
        g.setColor(Color.red);
        g.drawRect(209, 190, 40, 90);
        
        g.setColor(Color.gray);//Sears Tower windows (second)
        g.fillRect(210, 190, 2, 90);
        g.fillRect(215, 190, 2, 90);
        g.fillRect(220, 190, 2, 90);
        g.fillRect(225, 190, 2, 90);
        g.fillRect(230, 190, 2, 90);
        g.fillRect(235, 190, 2, 90);
        g.fillRect(240, 190, 2, 90);
        g.fillRect(245, 190, 2, 90);
        
        g.setColor(Color.red);// Sears Tower (antennas)
        g.fillRect(220, 150, 5, 40);
        g.fillRect(235, 150, 5, 40);
        
        g.setColor(Color.red);// 6th building (main)
        g.fillRect(250, 400, 70, 100);
        g.setColor(Color.black);
        g.drawRect(250, 400, 70, 100);
        
        g.setColor(Color.gray);// 6th building (second)
        g.fillRect(280, 360, 30, 40);
        g.setColor(Color.blue);
        g.drawRect(280, 360, 30, 40);
        
        g.setColor(Color.gray);//7th building
        g.fillRect(300, 450, 90, 50);
        g.setColor(Color.red);
        g.drawRect(300, 450, 90, 50);
        
        g.setColor(Color.red);//Aon Center
        g.fillRect(380, 310, 40, 190);
        g.setColor(Color.blue);
        g.drawRect(380, 310, 40, 190);
        
        g.setColor(Color.blue);//Aon Center windows
        g.fillRect(417, 320, 2, 180);
        g.fillRect(412, 320, 2, 180);
        g.fillRect(407, 320, 2, 180);
        g.fillRect(402, 320, 2, 180);
        g.fillRect(397, 320, 2, 180);
        g.fillRect(392, 320, 2, 180);
        g.fillRect(387, 320, 2, 180);
        g.fillRect(382, 320, 2, 180);
     
        g.setColor(Color.blue);//9th building
        g.fillRect(420, 410, 40, 90);
        g.setColor(Color.white);
        g.drawRect(420, 410, 40, 90);
        
        g.setColor(Color.red);// 10th building (main)
        g.fillRect(460, 380, 50, 120);
        g.setColor(Color.black);
        g.drawRect(460, 380, 50, 120);
        
        g.setColor(Color.blue);// 10th building (second)
        g.fillRect(470, 340, 30, 40);
        g.setColor(Color.gray);
        g.drawRect(470, 340, 30, 40);
        
        g.setColor(Color.gray);//11th building
        g.fillRect(500, 470, 40, 30);
        g.setColor(Color.blue);
        g.drawRect(500, 470, 40, 30);
        
        g.setColor(Color.blue);//11th building
        g.fillRect(542, 450, 40, 90);
        g.setColor(Color.red);
        g.drawRect(542, 450, 40, 90);
        
        g.setColor(Color.green);//Grass
        g.fillRect(0, 500, 590, 200);
        g.setColor(Color.gray);
        g.drawRect(0, 500, 590, 200); 
	}//end ChicagoPanel
}//end public class ChicagoPanel