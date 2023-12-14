import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!" + " Coding is fun " + 42);

        System.out.print("This is a line");
        System.out.print("This is another line");

        JOptionPane.showMessageDialog(null, "hi there", "This is the title", JOptionPane.ERROR_MESSAGE);
    }
}
