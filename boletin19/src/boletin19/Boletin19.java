package boletin19;

import javax.swing.JOptionPane;

public class Boletin19 {

    public static void main(String[] args) {

        int opcion;
        Libreria menu = new Libreria();

        boolean condicion = true;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion del menu \n 1.Añadir libro \n 2.Vender libro \n 3. Amosar libro \n 4. Dar de baja un libro \n 5. Consulta un libro"));
            switch (opcion) {
                case 1:
                    menu.añadirLibros(JOptionPane.showInputDialog("Titulo :", JOptionPane.showInputDialog("Autor :", JOptionPane.showInputDialog("ISBN :"));
                    break;
                case 2:
                    menu.venderLibros(JOptionPane.showInputDialog("Indica el libro que deseas vender :"));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, menu.AmosarLibros());
                    break;
                case 4:
                    menu.DardebajaLibros();
                    break;
                case 5:
                    menu.ConsultarLibro();
                    break;
                case 6:
                    System.exit(0);

            }

        } while (condicion);

    }
}
