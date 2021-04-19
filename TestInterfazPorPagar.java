package lab02;

public class TestInterfazPorPagar {

	public static void main(String[] args) {
		PorPagar [] objPorPagar= new PorPagar[5];
		
		objPorPagar[0]= new Factura("p01","pieza 1", 20, 10.6);
		objPorPagar[1]= new Factura("p02","pieza 2", 5,23.8);
		objPorPagar[0]= new EmpleadoAsalariado("Jesus","Pizarro",9999,500);
		objPorPagar[0]= new EmpleadoAsalariado("Patty","Vasquez",8888,650);
		
		listar(objPorPagar);
		
	}
	
	public static void listar(PorPagar[]arr) {
		for(PorPagar e: arr) {
			if(e!=null)
				System.out.println(e);
				System.out.println("\tmonto a pagar: "+e.obtenerMontoPago());
		}
		
	}
	
}
