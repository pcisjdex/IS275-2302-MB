package org.controlador;

public class Scooter extends Motocicleta{
    private String tipoSuspension;
    public String getTipoSuspension() {
        return tipoSuspension;
    }

    public double precioFinal() {
        int costo = 0;
        if (this.tipoSuspension == "Posterior") {
            costo = 400;
        } else if (this.tipoSuspension == "Delantera") {
            costo = 500;
        } else {
            costo = 800;
        }

        return costo + precioBase("Tipo");

    }
}





}
