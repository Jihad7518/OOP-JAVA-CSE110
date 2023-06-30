import javax.swing.JOptionPane;


public class Task01_2020260170 {
    public static void main(String[] args) {
        String vel = JOptionPane.showInputDialog(null, "Initial Velocity : ","Input ",JOptionPane.QUESTION_MESSAGE);
	String acc = JOptionPane.showInputDialog(null, "Acceleration : ","Input ",JOptionPane.QUESTION_MESSAGE);
	String time = JOptionPane.showInputDialog(null, "Time : ","Input ",JOptionPane.QUESTION_MESSAGE);
	
	int u = Integer.parseInt(vel);
	int a = Integer.parseInt(acc);
	double t = Double.parseDouble(time);

        double v = u + a*t;
        double s = (u*t) + (0.5*a*t*t);

	String str = "Final velocity is : "+v+ "\n Distance Travelled : "+s;
	JOptionPane.showMessageDialog(null, str, "Final celocity and Distance ",JOptionPane.INFORMATION_MESSAGE);
    }
}