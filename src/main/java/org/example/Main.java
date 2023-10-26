package org.example;

import gui.VentanaMenu;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Crear una instancia de VentanaMenu
                VentanaMenu ventanaMenu = new VentanaMenu();

                // Agregar action listeners a los botones en VentanaMenu
                ventanaMenu.ActionListeners();

                // Mostrar la ventana de menú
                ventanaMenu.mostrarVentana();
            }
        });
    }
}