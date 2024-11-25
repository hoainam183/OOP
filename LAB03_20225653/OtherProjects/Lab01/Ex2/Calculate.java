import javax.swing.JOptionPane;

public class Calculate {
    static double sum(double a, double b) {
        return a + b;
    }

    static double difference(double a, double b) {
        return a - b;
    }

    static double product(double a, double b) {
        return a * b;
    }

    static double quotient(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Please enter 2 numbers!", "Instruction", JOptionPane.INFORMATION_MESSAGE);
       
        String strNum1 = JOptionPane.showInputDialog("Please enter the first number");
        double a =  Double.parseDouble(strNum1); 
        String strNum2 = JOptionPane.showInputDialog("Please enter the second number");
        double b =  Double.parseDouble(strNum2);
        
        JOptionPane.showMessageDialog(null, 
        "Sum: " + sum(a, b), "Sum of 2 numbers", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, 
        "Difference: " + difference(a, b), "Difference of 2 numbers", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, 
        "Product: " + product(a, b), "Product of 2 numbers", JOptionPane.INFORMATION_MESSAGE);

        if(b==0)
        {
            JOptionPane.showMessageDialog(null, 
        "Can not execaute the division!", "Quotient of 2 numbers", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, 
            "Quotient: " + quotient(a, b), "Quotient of 2 numbers", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
