package org.Iteracion7;

public class Mecanico extends Usuario {
	
	public Encargo paquete;
	public Reserva solicitud;
	
	private String _idTallerM;
	private int _dNI;
	private String _nombre;
	private String _apellidos;
	private int _id;
	private int _telefono;
	private int _edad;
	private String _sexo;

	public boolean Autenticar(String aDNI, String aContrasena) {
		throw new UnsupportedOperationException();
	}
	
	public void AvisarCliente() {
		throw new UnsupportedOperationException();
	}
	public void VisualizaPiezasCompat() {
		throw new UnsupportedOperationException();
	}

	public void LanzarPeticionAlmacen() {
		throw new UnsupportedOperationException();
	}
	
	public int SeleccionarBox() {
		throw new UnsupportedOperationException();
	}
	
	public void GestionarBoxes() {
		throw new UnsupportedOperationException();
	}
	
	public void ImprimirCuenta() {
		throw new UnsupportedOperationException();
	}
	
}

