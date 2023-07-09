package vending;

/**
 * Classe de Exceção para o Dispenser indicar quando o item solicitado estiver
 * esgotado.
 */
public class UnavailableItemException extends RuntimeException {

	/**
	 * Construct this exception object.
	 */
	public UnavailableItemException() {
		super();
	}

	/**
	 * Construct this exception object.
	 * 
	 * @param message
	 *            the error message.
	 */
	public UnavailableItemException(String message) {
		super(message);
	}
}
