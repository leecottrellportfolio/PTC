import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class App extends JFrame implements ActionListener {

    public static JLabel hourLabel = new JLabel("Hours Worked");
    public static JLabel rateLabel = new JLabel("Hourly Rate");
    public static JLabel payLabel = new JLabel("Gross pay $0.00");
    public static JTextField hourField = new JTextField(10);
    public static JTextField rateField = new JTextField(10);
    public static JButton calcButton = new JButton("Calculate Gross Pay");

    public static void main(String[] args){
      App theWindow = new App();
      theWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
      theWindow.setSize(250, 250);
      theWindow.setTitle("Payroll");
      theWindow.setLayout(new FlowLayout());
        //put objects here
      theWindow.add(hourLabel);
      theWindow.add(hourField);
      theWindow.add(rateLabel);
      theWindow.add(rateField);
      theWindow.add(calcButton);
      theWindow.add(payLabel);

      calcButton.addActionListener(theWindow);

      theWindow.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double hours =0;
        double rate = 0;
        double pay = 0;

        //strip from the screen (input)
        rate = Double.parseDouble(rateField.getText());
        hours = Double.parseDouble(hourField.getText());
        //do the math (processing)
        pay = rate * hours;
        //write back to the appropriate object (output)
        payLabel.setText("Your pay $" + pay);
    }
}
