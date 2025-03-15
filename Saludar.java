/*
 * Encapsular clase
 * Encapsular método imprimirSaludo
 * @author:Pablo
 */

Public class Saludar {
    public void imprimirSaludo() {
        if (A.edad < 18) {
            System.out.println("Hola, joven " + Persona.nombre);
        } else {
            System.out.println("Hola, señor/a " + Persona.nombre);
        }
    }
}

