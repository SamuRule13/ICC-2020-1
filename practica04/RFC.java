import java.util.Scanner;

public class RFC {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String nombre;
        String nacimiento;
        String rfc;
        String nom1,nom2,nom3,fecha;
        

        System.out.println("Hola, buenas. ¿Me puedes dar tu nombre completo?");
        nombre = teclado.nextLine();
        System.out.println("¿Me puedes dar tu fecha de nacimiento? Recuerda que es DD/MM/AAAA. Incluye diagonales.");
        nacimiento = teclado.nextLine();
 
        int posicion = nombre.indexOf(" ");    
        nom1=(nombre.substring(posicion+1,posicion+3));
	int posicion1 = nombre.lastIndexOf(" ");
        nom2=(nombre.substring(posicion1+1,posicion1+2));
        
        System.out.println("El RFC de " +nombre+" es: "+(nom1.toUpperCase())+(nom2.toUpperCase())+(nombre.substring(0,1))+(nacimiento.substring(8,10))+(nacimiento.substring(3,5))+(nacimiento.substring(0,2)));

     
        
    

}

}
