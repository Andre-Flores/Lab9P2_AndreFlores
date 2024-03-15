package lab9p2_andreflores_;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class HiloProgressBar extends Thread implements Runnable {

    private JProgressBar barra = new JProgressBar();
    private JTextArea area = new JTextArea();
    private String texto;

    public HiloProgressBar(JProgressBar barr, JTextArea are, String text) {
        this.barra = barr;
        this.area = are;
        this.texto = text;
    }

    @Override
    public void run() {
        while (barra.getValue() <= 100) {
            barra.setValue(barra.getValue() + 20);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (barra.getValue() == 100) {
                area.setText(texto);
                break;

            }
        }

    }

}
