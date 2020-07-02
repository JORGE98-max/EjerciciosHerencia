
public class estudiante extends persona {

	// ATRIBUTOS
	
	private int codigoEstudiante;
	private float notaFinal;
	
	// GET AND SET
	
	public int getCodigoEstudiante() {
		return codigoEstudiante;
	}
	public void setCodigoEstudiante(int codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}
	public float getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(float notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	//METODO MOSTRAR DATOS
	
	public void mostrar() {
		
		System.out.println("Nombre : "+getNombre()+ "\nApellido: "+getApellido()+"\nEdad : "+getEdad()+"\nCodigo: "+getCodigoEstudiante()+"\nNota Final: "+getNotaFinal());
		
	}
}
