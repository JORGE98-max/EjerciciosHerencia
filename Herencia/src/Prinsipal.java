
public class Prinsipal {

	public Prinsipal() {            // CONSTRUCTOR
		
	}

	public static void main(String[] args) {
		
		book libro = new book ();      // CREACION DEL OBJETO
		
		libro.setTitle("Los Heraldos Negros");
		libro.setEdition("Independently Published, 2019");
		libro.setEditorial("Talleres de la Penitenciaría de Lima");
		libro.setAutor("Cesar Vallejo");
		libro.setId(2239-11-14);
		libro.setIsbn(978170997);
		libro.setTimeReaded(694);
		// PARA MOSTRAR DATOS
		
		libro.read();
		
	
		
	}

}
