package pooJava;

public class Empleado {
	private String nombreCompleto;
	private int permanencia;
	private double salario;
	
	public Empleado() {
		this.nombreCompleto= "";
		this.permanencia = 0;
		this.salario = 0.0;
	}
	public Empleado(String nombreCompleto, int permanencia, double salario) {
		this.nombreCompleto = nombreCompleto;
		this.permanencia = permanencia;
		this.salario = salario;
	}
	public String clasificacion() {
		if (permanencia <= 3) {
			return "Principiante";
		} else if (permanencia <18) {
			return "Intermedio";
		} else {
			return "Senior";
		}
	}
	public void mostrarDatos() {
		System.out.println("Nombre Completo: "+nombreCompleto);
		System.out.println("Permanencia: "+permanencia +" años");
		System.out.println("Clasificacion: " +clasificacion());
		System.out.println("Salario: "+salario + " euros");
		System.out.println();
	}
	public void aumentarSalario(double porcentaje) {
		salario += salario * (porcentaje /100);
	}
}
