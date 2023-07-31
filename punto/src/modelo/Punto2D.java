/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Punto2D {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto2D: (" + x + ", " + y + ")";
    }
    public static void mostrarLista(LinkedList<Punto2D> lista) { // Modificación aquí
        lista.forEach((punto) -> {
            System.out.println(punto);
        });
    }

    // Método que permite agregar un punto al inicio de la lista
  //  public static void agregarPuntoAlInicio(LinkedList<Punto2D> lista, Punto2D punto) {
 //       lista.addFirst(punto);
  //  }

    // Método que permite agregar un punto al final de la lista
 //   public static void agregarPuntoAlFinal(LinkedList<Punto2D> lista, Punto2D punto) {
  //      lista.addLast(punto);
//    }

    // Método que toma una lista y crea una nueva con su contenido invertido
 //   public static LinkedList<Punto2D> invertirLista(LinkedList<Punto2D> lista) {
 //       LinkedList<Punto2D> listaInvertida = new LinkedList<>(lista);
 //       Collections.reverse(listaInvertida);
  //      return listaInvertida;
 //   }

    // Método que ordena la lista por x de manera descendente
//    public static void ordenarPorXDescendente(LinkedList<Punto2D> lista) {
  //      lista.sort((p1, p2) -> Double.compare(p2.getX(), p1.getX()));
  //  }
}
