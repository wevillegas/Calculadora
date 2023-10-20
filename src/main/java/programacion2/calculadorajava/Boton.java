package programacion2.calculadorajava;


public class Boton {
    protected String etiqueta;

    public Boton(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void ejecutar() {
        // A ser implementado por las clases hijas
    }
}
