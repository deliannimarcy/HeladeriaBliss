/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemasdepedidos;

public class Cliente extends Persona {
    private int idCliente;

    public Cliente(int idCliente, String nombre) {
        super(nombre);
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void realizarPedido(Pedido pedido) {
        // lógica para realizar pedido
    }
}

