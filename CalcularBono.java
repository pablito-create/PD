/*
 * Encapsular método 
 * Encapsular atributo
 * @author:Pablo
 */

public class calcularBono{

    public void calcularBono() {
        private double bono = 0;
        if (Persona.edad > 50) {
            bono = Persona.salario * 0.10;
        } else {
            bono = Persona.salario * 0.05;
        }
        System.out.println("Bono: " + bono);
    }

}
