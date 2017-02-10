package boletin19;

import javax.swing.JOptionPane;

public class Boletin19 {

    public static void main(String[] args) {

        int opcion;
        Libreria menu = new Libreria();

        menu.cargarArray();

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion del menu \n 1.Añadir libro \n 2.Vender libro \n 3. Amosar libro \n 4. Dar de baja un libro \n 5. Consulta un libro"));
            switch (opcion) {
                case 1:
                    menu.añadirLibros();
                case 2:
                    menu.venderLibros();
                    break;
                case 3:
                    menu.AmosarLibros();
                    break;
                case 4:
                    menu.Dardebajalibros();
                    break;
                case 5:
                    menu.ConsultarLibro();
                    break;
                case 6:
                    System.exit(0);

            }

        } while (opcion<6);

    }
    
}
