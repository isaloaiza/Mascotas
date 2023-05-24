import javax.swing.JOptionPane;
import java.util.ArrayList;

public class PrincipalM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Mascotas> listaMascotas = new ArrayList<>();

		String menu = "Ingreso Mascotas\n\n";
		menu += "1) Datos\n";
		menu += "2) Lista ; Buscar por nombre\n\n";
		int opt;

		do {
			opt = Integer.parseInt(JOptionPane.showInputDialog(menu));

			Mascotas m = new Mascotas();
			m.menu(opt);
			listaMascotas.add(m);

		} while (opt != 2);

		String validar = JOptionPane.showInputDialog("NO para salir SI para continuar");
		if (validar.equalsIgnoreCase("si")) {
			for (Mascotas ani : listaMascotas) {
				System.out.println(
						"Nombre: " + ani.nombre + "\nEspecie: " + ani.especie + "\nEdad: " + ani.edad + " años");
				System.out.println("_____________");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Operación finalizada");
		}
		String validar2 = JOptionPane.showInputDialog("ingrese  SI  buscar y NO para salir");

		if (validar2.equalsIgnoreCase("si")) {
		    String nombreM = JOptionPane.showInputDialog("Nombre");
		    for (Mascotas masc : listaMascotas) {
		        masc.buscarMascota(nombreM);
		        System.out.println("entro");
		    }
		} else {
		    JOptionPane.showMessageDialog(null, "Operación finalizada");
		}


	}

}
