package paquete;

import processing.core.PApplet;

public class TABLA extends PApplet {

    public static void main(String[] args) {
        PApplet.main("paquete.TABLA");
        

        }



    @Override
    public void settings() {
        size(800,800);
    }

    @Override
    public void setup() {

    }     

    @Override
    public void draw() {
      for (int fila1=0; fila1<800;fila1+=200) {
          for(int filaBlanca=0; filaBlanca<800; filaBlanca+=200){
            fill(255,255,255);
            rect(filaBlanca,fila1,100,100);
            }
           for(int filaNegra=0; filaNegra<800; filaNegra+=200){
            fill(255,255,255);
            rect(filaNegra,fila1,100,100);
            }

        }    

          for (int fila2=0; fila2<800; fila2+=200) {
                for (int filaNegra1=0; filaNegra1<800; filaNegra1+=200) {
                    fill(0,0,0);
                    rect(filaNegra1,fila2,100,100);
                }
                for (int filaBlanca1=0; filaBlanca1<800; filaBlanca1+=200) {
                    fill(0,0,0);
                    rect(fila1,fila2,100,100);
            }
            }  
      }

           
    
}    