package ar.org.centro8.curso.java.clase21;
public class Clase21 {
    public static void main(String[] args) {
        //https://github.com/crios2020/javaobjlumivinoche
        // Clase 21 manejo de Threads
        
        /*
            Tarea 1 - Abrir y leer el file1 del medio 1 10s
            Tarea 2 - Abrir y leer el file2 del medio 2 10s
            Tarea 3 - Abrir Formulario y mostras contendio 
                      de file1 y file2  1s        
        
            Tarea1      Tarea2    Tarea3
        |-----------|-----------|--------|
           10 s         10 s        1 s
        
        Tiempo total 21 segundos
        
            Tarea1
        |-----------|
            10 s
            Tarea2
        |-----------|
                        Tarea3
                        |-|
                        1s
                Tiempo total 11s
        */
        
        class HiloT extends Thread{
            private String nombre;
            public HiloT(String nombre){ this.nombre=nombre; }
            @Override public void run(){
                // Este metodo es el unico que puede iniciar un hilo
                // de ejecucion nuevo
                for (int a = 1; a <= 10; a++) {
                    System.out.println(nombre + " " + a);
                    try {
                    Thread.sleep(1000);
                        
                    } catch (Exception e) { e.printStackTrace(); }
                    
                }
            }
        }//end Class HiloT
        
        HiloT hiloT1= new HiloT("hilo1");
        HiloT hiloT2= new HiloT("hilo2");
        HiloT hiloT3= new HiloT("hilo3");
        HiloT hiloT4= new HiloT("hilo4");
        HiloT hiloT5= new HiloT("hilo5");
        
//        hiloT1.run();
//        hiloT2.run();
//        hiloT3.run();
//        hiloT4.run();
//        hiloT5.run();

//        El metodo .start() invoca el metodo .run() en un nuevo Thread
//          hiloT1.start();
//          hiloT2.start();
//          hiloT3.start();
//          hiloT4.start();
//          hiloT5.start();
          
          //Interface Runnable
          
          class HiloR implements Runnable{
              private String nombre;
              public HiloR(String nombre) { this.nombre=nombre; }
              @Override public void run(){
                  for (int a = 1; a < 10; a++) {
                      System.out.println(nombre + " "+ a);
                      try { Thread.sleep(1000);} catch (Exception e) {e.printStackTrace(); }
                  }
              }
        } //End Class HiloR
          HiloR hiloR1 = new HiloR("HiloR1");
          HiloR hiloR2 = new HiloR("HiloR2");
          HiloR hiloR3 = new HiloR("HiloR3");
          HiloR hiloR4 = new HiloR("HiloR4");
          HiloR hiloR5 = new HiloR("HiloR5");
          
           //carece de clase Start() muchas veces la herencia esta ocupada
           //hay que implementar la fase Runnable y se debe realizar atravez
           //de la clase Thread
          Thread tHiloR1 = new Thread(hiloR1);
          Thread tHiloR2 = new Thread(hiloR2);
          Thread tHiloR3 = new Thread(hiloR3);
          Thread tHiloR4 = new Thread(hiloR4);
          Thread tHiloR5 = new Thread(hiloR5);
          
          tHiloR1.start();
          tHiloR2.start();
          tHiloR3.start();
          tHiloR4.start();
          tHiloR5.start();
          
          new Thread(new HiloR("hiloR6")).start();
          
    }//End Main
    
}//End Clase 21
