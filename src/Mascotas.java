import javax.swing.JOptionPane;

public class Mascotas {
	
	// Atributos
		int codigo;
	    String nombre;
	    String especie;
	    int edad;

	    //Constructor sin parametros
	    public Mascotas() {
	    	  nombre = "Firu";
	          especie = "Default";
	          edad = 0;
	    }
	    
	    public void ingresar() {
	        this.nombre = JOptionPane.showInputDialog("Ingrese nombre");
	        this.especie = JOptionPane.showInputDialog("Ingrese especie");
	        this.edad = Integer.parseInt(JOptionPane.showInputDialog("Edad de la mascota"));
	    }

	    public void menu(int opt) {
	    	switch (opt) {
			case 1:
				ingresar();
				break;
			case 2:
				
				break;
			

			default:
				break;
			}
	    }
	    public void buscarMascota(String nombreM) {
	        if (nombre.equalsIgnoreCase(nombreM)) {
	            System.out.println( "Nombre: " + this.nombre +
	                    "\nEspecie: " + this.especie +
	                    "\nEdad: " + this.edad + " años");
	            hacerSonido();
	        }else {
	        	JOptionPane.showMessageDialog(null, "operacion finalizada");
	        }
	    }

	    public void mascota(String nombre, String especie, int edad) {
	        this.nombre = nombre;
	        this.especie = especie;
	        this.edad = edad;
	    }
	    
	    public void mostrarInformacion() {
	        String mensaje = "Nombre: " + nombre + "\n";
	        mensaje += "Especie: " + especie + "\n";
	        mensaje += "Edad: " + edad + " años";

	        JOptionPane.showMessageDialog(null, mensaje, "Información de la mascota", JOptionPane.INFORMATION_MESSAGE);
	    }

	    public void hacerSonido() {
	        if (especie.equalsIgnoreCase("perro")) {
	            System.out.println("¡Guau guau!");
	        } else if (especie.equalsIgnoreCase("gato")) {
	            System.out.println("¡Miau miau!");
	        } else if (especie.equalsIgnoreCase("pato")) {
	            System.out.println("¡Cua Cua!");
	        } else if (especie.equalsIgnoreCase("paloma")) {
	            System.out.println("¡ruu ruu!");
	        } else if (especie.equalsIgnoreCase("vaca")) {
	            System.out.println("¡muu muu!");
	        } else if (especie.equalsIgnoreCase("pollo")) {
	            System.out.println("¡pio pio!");
	        } else {
	            System.out.println("La mascota no hace sonidos conocidos.");
	        }
	    }

}
