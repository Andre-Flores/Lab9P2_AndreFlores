package lab9p2_andreflores_;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class HiloHora extends Thread implements Runnable {

    private JLabel labelfecha, labelhora;

    public HiloHora(JLabel labelfecha, JLabel labelhora) {
        this.labelfecha = labelfecha;
        this.labelhora = labelhora;
    }

    @Override
    public void run() {

        while (true) {
            Date fecha = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
            labelfecha.setText(formatter.format(fecha));
            labelhora.setText(fecha.getHours() + ":" + fecha.getMinutes() + ":" + fecha.getSeconds());
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}
