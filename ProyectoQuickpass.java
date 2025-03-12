
package com.mycompany.proyectoquickpass;

public class ProyectoQuickpass {
    private String filial;
    private String codigo;
    private String placa;
    private Estado estado;

    public ProyectoQuickpass(String filial, String codigo, String placa) {
        this.filial = filial;
        this.codigo = codigo;
        this.placa = placa;
        this.estado = Estado.Rechazado;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getFilial() {
        return filial;
    }

    public String getPlaca() {
        return placa;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public static boolean esPlacaValida(String placa) {
        return placa != null && placa.matches("[A-Z0-9]+") && placa.length() >= 6;
    }

    @Override
    public String toString() {
        return "Quickpass{" +
                "Filial='" + filial + '\'' +
                ", Codigo='" + codigo + '\'' +
                ", Placa='" + placa + '\'' +
                ", Estado=" + estado +
                '}';
    }
}