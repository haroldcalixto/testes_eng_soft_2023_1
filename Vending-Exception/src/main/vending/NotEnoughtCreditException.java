package vending;

/**
 * Classe de Exceção para o Dispenser indicar quando o crédito existente não é
 * suficiente para a compra do item.
 */
public class NotEnoughtCreditException extends RuntimeException {

	public NotEnoughtCreditException() {
		super();
	}

	public NotEnoughtCreditException(String message) {
		super(message);
	}
}
