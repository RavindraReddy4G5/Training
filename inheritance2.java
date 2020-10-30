public abstract class Library {

	abstract public void bookTitle(String title);
	abstract public void bookGenre(String genre);
	abstract public void bookEdition(int edition);
}
public class BookAccess extends Library{

	@Override
	public void bookTitle(String title) {
		
		System.out.println(title);
		
	}

	@Override
	public void bookGenre(String genre) {
		
		System.out.println(genre);
		
	}

	@Override
	public void bookEdition(int edition) {
		
		System.out.println(edition);
		
	}

}
public class MainClass2 {
	
	public static void main(String[] args) {
		BookAccess bookaccess = new BookAccess();
		bookaccess.bookTitle("Networks");
		bookaccess.bookGenre("ComputerScience");
		bookaccess.bookEdition(4);
	}
}

