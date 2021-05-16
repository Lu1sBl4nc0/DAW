/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche_main;

/**
 *
 * @author Luis
 */
public class Coche_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Coche mycar;
        int stockActual;

        mycar = vende_car();

        stockActual = compra_car(mycar);
        System.out.println("El stock actual es " + stockActual);
    }

    private static int compra_car(Coche mycar) {
        int stockActual;
        try {
            System.out.println("Compra de Coches");
            mycar.comprar(500);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar " + e);
        }
        stockActual = mycar.obtenerStock();
        return stockActual;
    }

    private static Coche vende_car() {
        Coche mycar;
        mycar = new Coche("Opel", 12000, 500);
        try {
            System.out.println("Venta de Coches");
            mycar.vender(300);
        } catch (Exception e) {
            System.out.print("Fallo al vender " + e);
        }
        return mycar;
    }

}
