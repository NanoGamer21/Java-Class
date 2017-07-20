import javax.swing.JOptionPane;

public class AirlineRegristation {
public static void main(String[] args) {
	String Name=JOptionPane.showInputDialog("Name Please?");	
	String Bday =JOptionPane.showInputDialog("whats your birthday?");
	String Gender=JOptionPane.showInputDialog("Whats your Gender?");
	String Destenation=JOptionPane.showInputDialog("where are you going");
	JOptionPane.showMessageDialog(null,"Name:" + Name + " " + "\nBirtday:" + Bday + " " + "\nGender:" + Gender + " " + "\nDestination:" + Destenation + " ");
}

}
