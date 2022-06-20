/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

/**
 *
 * @author HP
 */
public class DetallePedido {
    protected String codigo;
    protected Double cantidadPedido;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getCantidadPedido() {
        return cantidadPedido;
    }

    public void setCantidadPedido(Double cantidadPedido) {
        this.cantidadPedido = cantidadPedido;
    }
}
