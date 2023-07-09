package vending;

/**
 * Esta classe representa uma possível implementação do componente responsável
 * pela entrega do item comprado. Para que a entrega do item se concretize,
 * algumas restrições precisam ser satisfeitas. Tais condições são descritas
 * abaixo.
 * 
 * @author Auri Marcelo Rizzo Vincenzi
 */
public class Dispenser {
	final private int MINSEL = 1; // Índice do primeiro item
	final private int MAXSEL = 20; // Índice do último item
	final private int VAL = 50; // Preço máximo dos itens

	// Lista dos itens disponíveis para compra. Números comentados representam
	// produtos esgotados.
	private int[] availSelectionVals = { 1, 2, 3, 4,/* 5, */6, 7, 8, 9, 10, 11,
			12, 13, 14, 15, 16, 17, /* 18, */19 /* ,20 */};

	/**
	 * Simula o comportamento do componente que faz a entrega de determinado
	 * item em uma máquina de venda. Um item é entregue quando uma quantidade de
	 * créditos suficiente para a sua compra estiver disponível, o código do
	 * item ser um código válido e o item estiver disponível para compra (não
	 * estiver esgotado).
	 * 
	 * @param credit
	 *            - o valor atual em centavos do crédito disponíve no
	 *            compartimento de moedas. Um valor de 50 centavos é necessáiro
	 *            para a compra de qualquer item.
	 * 
	 * @param sel
	 *            - o índice do item selecionado para compra. Um item válido tem
	 *            um índice representado por um número inteiro variando de 1 a
	 *            20. Observa-se que embora o índice seja válido, pode ser que o
	 *            item em questão esteja esgotado e não possa ser vendido.
	 * 
	 * @return O valor pago pelo item desejado. Atualmente esse valor é sempre
	 *         50.
	 * 
	 *         Em caso de erro, uma exceção é lançada, indicando o erro ocorrido
	 *         conforme descrito abaixo:
	 * 
	 * @throws NoCoinsException
	 *             nenhuma moeda foi inserida.
	 * @throws InvalidItemException
	 *             item selecionado é inválido.
	 * @throws UnavailableItemException
	 *             item selecionado encontra-se esgotado.
	 * @throws NotEnoughtCreditException
	 *             crédito insuficiente para a compra do item desejado.
	 */
	public int dispense(int credit, int sel) {
		int val = 0;

		if (credit == 0) // nenhuma moeda inserida
			throw new NoCoinsException();
		else if ((sel < MINSEL) || (sel > MAXSEL)) // item selecionado fora do
			// intervalo
			throw new InvalidItemException();
		else if (!available(sel)) // item esgotado
			throw new UnavailableItemException();
		else {
			val = VAL;
			if (credit < val) { // sem crédito suficiente para a compra do item
				int value = val - credit;

				val = 0;
				throw new NotEnoughtCreditException("Mais " + value
						+ " centavos são necessários para a compra do item.");
			} else { // venda realizada com sucesso
				return val;
			}
		}
	}

	/**
	 * Este método verifica se determinado item encontra-se disponível, ou seja,
	 * não esgotado.
	 * 
	 * @param sel
	 *            índice do item desejado.
	 * @return true se o item não estiver esgotado ou false caso o item esteja
	 *         esgotado.
	 */
	private boolean available(int sel) {
		for (int i = 0; i < availSelectionVals.length; i++)
			if (availSelectionVals[i] == sel)
				return true;
		return false;
	}
} // classe Dispenser
