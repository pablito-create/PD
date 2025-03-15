/*Clase persona con atributos básicos
*Encapsulación a atributos y clase Persona
* @author:daniel
*
*/
public class Persona {
    private static String nombre = "SinNombre";
    private static int edad = 0;
    private static double salario = 0.0;
	/*Edición del constructor y nombre de atributos
	*
	*@author:Daniel
	*/
    public static void datos(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    static void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}
}
