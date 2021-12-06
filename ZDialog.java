import javax.swing.JDialog;
import javax.swing.JFrame;

public class ZDialog extends JDialog{
    public ZDialog(JFrame parent, String title, boolean modal){
        super(parent, title, modal);
        this.setSize(200, 80);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
}