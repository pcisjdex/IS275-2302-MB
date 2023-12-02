package org.controller;

public class FacturaIgv extends Factura{

    @Override
    public double getImporteIgv() {
        return getImporte()*1.18;
    }
}
