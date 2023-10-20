package programacion2.calculadorajava;

public class Calculadora {

    private double resultado;

    public Calculadora() {
        this.resultado = 0.0;
    }

    public double getResultado() {
        return resultado;
    }

    public void operar(Boton boton, double numero) {
        if (boton instanceof BotonOperacion) {
            ((BotonOperacion) boton).ejecutar(this, numero);
        } else if (boton instanceof BotonNumero) {
            ((BotonNumero) boton).ejecutar(this, numero);
        }
    }
}
