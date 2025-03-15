/*
 * Actualizar la clase Main
 * @author:Pablo
 */
public class Main {
    public static void main(String[] args) {
        Persona.datos("Juan Perez", 45, 50000);
        Persona.mostrar();
        calcularBono bono1= new calcularBono();
        bono1.calcularBono();
        Saludar saludito = new Saludar();
        saludito.imprimirSaludo();
    }
}
