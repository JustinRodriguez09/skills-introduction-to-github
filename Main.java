package com.mycompany.proyectoquickpass;

import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String filial = JOptionPane.showInputDialog("Ingrese la filial:");

        String codigo = "QP" + (1000 + new Random().nextInt(9000));

        String placa;
        do {
            placa = JOptionPane.showInputDialog("Ingrese la placa:");
            if (!ProyectoQuickpass.esPlacaValida(placa)) {
                JOptionPane.showMessageDialog(null, "Error: Placa inválida. Intente nuevamente.");
            }
        } while (!ProyectoQuickpass.esPlacaValida(placa));

        ProyectoQuickpass quickpass = new ProyectoQuickpass(filial, codigo, placa);

        quickpass.setEstado(new Random().nextBoolean() ? Estado.Aceptado : Estado.Rechazado);

        JOptionPane.showMessageDialog(null, quickpass.toString(), "Información Quickpass", JOptionPane.INFORMATION_MESSAGE);
    }
}