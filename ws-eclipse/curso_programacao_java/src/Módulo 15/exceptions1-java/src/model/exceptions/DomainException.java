package model.exceptions;

// minha classe de erro personalizado herda Exception ou RuntimeException
// Exception o compilador avisa pedindo para propagar ou lançar o erro
// RuntimeException fica mais do programador para ter atenção, pois não há avisos do compilador
public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
	
}
