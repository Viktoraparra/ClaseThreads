package ar.org.centro8.curso.java.clase21;
import javax.swing.JTextField;
// se hace la implementacion de la clase Runnable para implementar
// el metodo sobre cargado de run par que haga los threads
public class HoraR implements Runnable{
    private JTextField txt;
    public HoraR(JTextField txt) { this.txt = txt;  }
    
    @Override public void run(){
        while (true) {
            
        }
    }
      
    
}//End Class
