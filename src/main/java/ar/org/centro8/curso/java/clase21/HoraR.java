package ar.org.centro8.curso.java.clase21;
import java.time.LocalDateTime;
import javax.swing.JTextField;
// se hace la implementacion de la clase Runnable para implementar
// el metodo sobre cargado de run par que haga los threads
public class HoraR implements Runnable{
    private JTextField txt;
    public HoraR(JTextField txt) { this.txt = txt;  }
    
    @Override public void run(){
        while (true) {
            LocalDateTime ldt=LocalDateTime.now();
            // Separo los tiempos en String para que me los muestre en el formato HH:mm:ss
            String hora=(ldt.getHour()<10)?"0"+ldt.getHour():""+ldt.getHour();
            String minutos=(ldt.getMinute()<10)?"0"+ldt.getMinute():""+ldt.getMinute();
            String segundos=(ldt.getSecond()<10)?"0"+ldt.getSecond():""+ldt.getSecond();
            txt.setText(hora+":"+minutos+":"+segundos);
            try { Thread.sleep(1000);} catch (Exception e) {}
        }
    }
     
    
}//End Class
