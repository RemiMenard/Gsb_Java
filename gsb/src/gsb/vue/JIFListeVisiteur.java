package gsb.vue;

import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JIFListeVisiteur extends JInternalFrame {
	 public static void main(String[] args){       
		 	//affichage fenetre
		 	JFrame fenetre = new JFrame();
		    fenetre.setVisible(true);
		    fenetre.setTitle("Liste des visiteurs");
		    fenetre.setSize(800, 400);
		    fenetre.setLocationRelativeTo(null);
		    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
	 

}
