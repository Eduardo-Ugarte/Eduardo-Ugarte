package lab02;

public class EmpleadoAsalariado extends Empleado {
	private double salarioSemanal;

	public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, int nss, double salarioSemanal) {
		super(primerNombre, apellidoPaterno, nss);
		this.setSalarioSemanal(salarioSemanal);
		// TODO Auto-generated constructor stub
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		if(salarioSemanal>0)
			this.salarioSemanal=salarioSemanal;
		else
			this.salarioSemanal = 0;
	}

	@Override
	public String toString() {
		return "Empleado asalariado: " + super.toString()  + "\nsalario semanal: " + this.salarioSemanal;
	}
	
	public double obtenerMontoPago() {
		return 4 * this.getSalarioSemanal();
	}
}
