/*Clase persona con atributos básicos
*Encapsulación a atributos
* @author:daniel
*/
class Persona {
    private static String nombre = "SinNombre";
    private static int edad = 0;
    private static double salario = 0.0;

    static void datos(String n, int e, double s) {
        nombre = n;
        edad = e;
        salario = s;
    }

    static void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}
}
