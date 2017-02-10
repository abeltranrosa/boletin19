package boletin19;

import static beltran.Beltran.pedirFloat;
import static beltran.Beltran.pedirInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Collections;
import static beltran.Beltran.pedirString;

public class Libreria { 

    ArrayList<Libro> librerias = new ArrayList<Libro>();

    public void cargarArray() {
         Libro libro1 = new Libro("El codigo da Vincci","Dan Brown","z666",45,10);
         Libro libro2 = new Libro("El cruasan","Martin Lutero","z652",15,25);
         Libro libro3 = new Libro("La biblia","Desconocido","z125", 25,50);
        
         librerias.add(libro1);
         librerias.add(libro2);
         librerias.add(libro3);
         
    }

    public void añadirLibros() {
        librerias.add(new Libro(pedirString(), pedirString(), pedirString(), pedirFloat(), pedirInt()));
    }

    public void venderLibros(int x) {
        librerias.remove(x);
    }

    public void AmosarLibros() {
        //Collections.sort(Libreria, null);
        String cadena = " ";
        for (int i = 0; i < librerias.size(); i++) {
            JOptionPane.showMessageDialog(null, librerias.get(i));
        }

            
        }
   

    public void Dardebajalibros() {
        for (int i = 0; i < librerias.size(); i++) {
            if (librerias.get(i).getNumerounidades() == 0) {
                librerias.remove(i);
            }
        }
    }

    public void ConsultarLibro() {
        String libro = JOptionPane.showInputDialog("Introduce el titulo del libro");
        for (int i = 0; i < librerias.size(); i++) {
            if (librerias.get(i).getTitulo().equalsIgnoreCase(libro)) {
                JOptionPane.showMessageDialog(null, librerias.get(i).toString());
            }
        }

    }

}
