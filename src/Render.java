import javax.swing.JFrame;
import javax.swing.UIManager;

public class Render {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();;
        }
        JFrame program = new LogicFrame();
    }
}
