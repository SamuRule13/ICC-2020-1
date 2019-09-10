 /**
 *Creè una clase Libro con atributos: tı́tulo, autor y año de publicación.
 * @author Samuel Rosales.
 * @version 1.0
 * 10 de Septiembre del 2019.
 */

public class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;
    
  /**
 *Declarè un constructor default con valores iniciales arbitrarios.
 */
    
    public Libro() {
     this.titulo = "";
     this.autor = "";
     this.anoPublicacion = 0;
    }
  
 /**
 *Declarè un constructor con parámetros que  los atributos a los valores de dichos parámetros.
 *@param nuevoTitulo nuevo titulo
 *@param nuevoAutor nuevo autor
 *@param nuevoAnoPublicacion nuevo año de publicacion
 */

public Libro(String nuevoTitulo, String nuevoAutor, int nuevoAnoPublicacion) {
     nuevoTitulo = nuevoTitulo;
     nuevoAutor = nuevoAutor;
     nuevoAnoPublicacion = nuevoAnoPublicacion;
    }

 /**
 *Declarè un mètodo de modificaciòn y acceso para el atributo Autor.
 *@return autor
 */

 public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

  /**
 *Declarè un mètodo de modificaciòn y acceso para el atributo Autor.
 *@return titulo
 */

 public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

  /**
 *Declarè un mètodo de modificaciòn y acceso para el atributo Autor.
 *@return anoPublicacion
 */

 public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }


}


