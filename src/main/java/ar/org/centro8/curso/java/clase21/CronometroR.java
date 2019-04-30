package ar.org.centro8.curso.java.clase21;
import javax.swing.JTextField;
public class CronometroR implements Runnable {
    private JTextField txt;
    private int cont=0;
    private boolean correr=false;
    public CronometroR(JTextField txt) {this.txt = txt;}
    
    @Override public void run() {
          while (true) {
              if (correr) {
                  cont++;
                  int milisegundo=cont%60;
                  int segundo=cont/60;
                  int minuto=cont/60;
                  int hora=minuto/60;
                  minuto=minuto%60;
                  txt.setText(
                          ((hora<10)?"0"+hora:""+hora)+":"+
                          ((minuto<10)?"0"+minuto:""+minuto)+":"+
                          ((segundo<10)?"0"+segundo:""+segundo)+":"+
                          ((milisegundo<10)?"0"+milisegundo:""+milisegundo)
                  );
              }
              try {Thread.sleep(10);} catch (Exception ex) {}
        }
        
        
//        Integer minutos = 0 , segundos = 0, milesimas = 0;
//        //min es minutos, seg es segundos y mil es milesimas de segundo
//        String min="", seg="", mil="";
//       
//        
//            //Mientras cronometroActivo sea verdadero entonces seguira
//            //aumentando el tiempo
//            while( true )
//            {
//                if (correr) {
//                    //Incrementamos 4 milesimas de segundo
//                milesimas += 4;
//                 
//                //Cuando llega a 1000 osea 1 segundo aumenta 1 segundo
//                //y las milesimas de segundo de nuevo a 0
//                if( milesimas == 1000 )
//                {
//                    milesimas = 0;
//                    segundos += 1;
//                    //Si los segundos llegan a 60 entonces aumenta 1 los minutos
//                    //y los segundos vuelven a 0
//                    if( segundos == 60 )
//                    {
//                        segundos = 0;
//                        minutos++;
//                    }
//                }
// 
//                //Esto solamente es estetica para que siempre este en formato
//                //00:00:000
//                if( minutos < 10 ) min = "0" + minutos;
//                else min = minutos.toString();
//                if( segundos < 10 ) seg = "0" + segundos;
//                else seg = segundos.toString();
//                 
//                if( milesimas < 10 ) mil = "00" + milesimas;
//                else if( milesimas < 100 ) mil = "0" + milesimas;
//                else mil = milesimas.toString();
//                 
//                //Colocamos en la etiqueta la informacion
//                txt.setText( min + ":" + seg + ":" + mil );  
//                    
//                }
//
//                try {Thread.sleep(4);} catch (Exception ex) {}
//        }
    }
    public void correr() { correr=true;  }
    public void pausa()  { correr=false; }
    public void reset()  { 
        correr=false;
        cont=0;
        txt.setText("0");
    }
    
}//End Of Class
