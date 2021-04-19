package lab02;

public abstract class Empleado implements PorPagar{
	private String primerNombre;
	private String apellidoPaterno;
	private int nss;
	
	public Empleado(String primerNombre, String apellidoPaterno, int nss) {
		super();
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.nss = nss;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public int getNss() {
		return nss;
	}

	public void setNss(int nss) {
		this.nss = nss;
	}

	@Override
	public String toString() {
		return this.primerNombre + " " + this.apellidoPaterno + "\nnumero de seguro social " + this.nss;
	}
	
	
}
