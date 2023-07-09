package vending;

/**
 * Classe de Exceção para o Dispenser indicar quando um item inválido foi
 * selecionado.
 */
public class InvalidItemException extends RuntimeException {

	public InvalidItemException() {
		super();
	}

	public InvalidItemException(String message) {
		super(message);
	}
}
