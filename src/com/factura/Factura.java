package com.factura;

public class Factura {
    private Integer numero;
    private String descripcion;
    private Integer cantidad;
    private Double precioPorItem;

    public Factura(Integer numero, String descripcion, Integer cantidad, Double precioPorItem) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioPorItem = precioPorItem;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioPorItem() {
        return precioPorItem;
    }

    public void setPrecioPorItem(Double precioPorItem) {
        this.precioPorItem = precioPorItem;
    }

    public Double getTotalFactura(){
        Double total = precioPorItem * cantidad;
        if(cantidad < 0){
            this.cantidad = 0;
        }
        if(precioPorItem < 0 ){
            this.precioPorItem = 0.0;
        }
        return total;
    }

    //Metodo toString
    public String toString(){
        return "Número de pedido: " + numero +
                "\nDescripción: " + descripcion +
                "\nCantidad: " + cantidad +
                "\nPrecio por producto: " + precioPorItem +
                "\nTotal de la compra: " + String.format("$" + getTotalFactura());
    }
}
