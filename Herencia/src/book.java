
public class book extends magazine {

	public book() {

	}

	private long isbn;
	private int timeReaded;

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public int getTimeReaded() {
		return timeReaded;
	}

	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}

	public void read() {
		
		System.out.println("Titulo : "+getTitle()+"\nEdicion: "+getEdition()+"\nEditorial: "+getEditorial()+"\nAutor: "+getAutor()+"\nID :"+getId()+"\nISBN : "+getIsbn()+"\nTiempo leido: "+getTimeReaded());
	}
}
