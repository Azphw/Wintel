import javax.swing.*;
import java.awt.*;



//TEST GITHUBBBBBBBBBBBBBBBBBBB
public class Wintel extends JFrame{

  private JPanel IDHaut;
	private JPanel IDEst;
	private JPanel ID;
	private JLabel Abonnée;
	private JLabel Prenom;
        private JMenuBar Menu;

	public Wintel() {

	     super ( "Wintel" );
	     this.creerInterface();
	     this.attacherReactions();
	     this.setSize( 500, 500 );
	     this.setVisible( true );
	     this.setDefaultCloseOperation ( EXIT_ON_CLOSE );
		
	     
	}

	public void creerInterface(){
		this.IDHaut = new JPanel (new GridLayout(1,2));
		this.Menu = new JMenuBar ();
		this.Prenom = new JLabel("Prenom");
		
		this.add(Prenom);
		

	}

	private void attacherReactions(){}
}
