import javax.swing.JOptionPane;

public class Java06 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your Name: ");
        JOptionPane.showMessageDialog(null,"Hello " + name + "!!");
        
        int Age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
        JOptionPane.showMessageDialog(null,"You are " + Age + " Years Old.");

    }
}
