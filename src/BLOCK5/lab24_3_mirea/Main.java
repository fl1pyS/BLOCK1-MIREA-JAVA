package BLOCK5.lab24_3_mirea;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Editor(new CreateTextDocument()).setVisible(true));
    }
}
