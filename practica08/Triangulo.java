package geometria;

    /**
    * Clase de triangulos
    * @author Samuel Rosales Araujo
    * @version 1.0
    */

  public class Triangulo {
    private Punto a;
    private Punto b;
    private Punto c;
    public static final int EQUILATERO;
    public static final int ESCALENO;
    public static final int ISOSCELES;
 }
   
     /**
     *Declaro un constructor default con valores iniciales.
     *@param a
     *@param b
     *@param c 
     */
    
  public Triangulo() {
     a = new Punto (0,0);
     b = new Punto (1,0);
     c = new Punto (0.5, Math.sin(Math.PI/3));
    }

     /**
     *Declaro un constructor default con valores iniciales.
     *@param a - nuevoPuntoA
     *@param b - nuevoPuntoB
     *@param c - nuevoPuntoC
     */

  public Triangulo​(Punto nuevoPuntoA,nuevoPuntoB,nuevoPuntoC){
    a = nuevoPuntoA;
    b = nuevoPuntoB;
    c = nuevoPuntoC;
   }

     /**
     *Regresa el tipo de triàngulo y su longitud.
     *@return - regresa el triangulo.
     */

  public boolean tieneVerticesAlineados(){
  if (a.estanAlineados(b) && c.estanAlineados(a) && b.estanAlineados(c));
   return;
  }
     /**
     *Regresa el tipo de triàngulo y su longitud, puede ser equilatero, escaleno o isosceles.
     *@return - regresa el triangulo.
     */
  
  public int tipo(){
  if(a.distancia(b)==b.distancia(c) && b.distancia(c)==c.disnatcia(a));
    return EQUILATERO;
    if(c.distancia(a)==c.distancia(b) || a.distancia(b)==a.distancia(c) || b.distancia(c)==c.disnatcia(a));
  }  

