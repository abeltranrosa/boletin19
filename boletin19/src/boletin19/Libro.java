
package boletin19;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Objects;



public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private float precio;
    private int numerounidades;

    public Libro(String titulo, String autor, String ISBN, float precio, int numerounidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
        this.numerounidades = numerounidades;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getNumerounidades() {
        return numerounidades;
    }

    public void setNumerounidades(int numerounidades) {
        this.numerounidades = numerounidades;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", precio=" + precio + ", numerounidades=" + numerounidades + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }

    
    
    
}
