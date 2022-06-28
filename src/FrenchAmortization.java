import java.util.*;

public class FrenchAmortization {

	Scanner input = new Scanner(System.in);
	creditDTO requestDTO = new creditDTO();

	private double toPayPerFee; // La cuota que pagar.
	private double totalMount; // Valor a pagar total
	private double feeInterest; // Interes por cuota
	private double pendingCapital; // Capital restante
	private double amortizationFee; // Cuota de amortizacion

	public void FrenchAmortization() {
		// void constructor
	}

	public void userDataInput() {

		System.out.println("Calculadora de amortizacion de credito a cuota fija: ");
		System.out.println("1. Ingrese el valor total del prestamo crediticio: ");
		requestDTO.setLoan(input.nextDouble());
		System.out.println("2. Numero de cuotas deseadas.");
		requestDTO.setFee(input.nextDouble());
		System.out.println("3. Numero de porcentaje de interes.");
		requestDTO.setInterest(input.nextDouble());
		System.out.println("Se han almacenado los datos correctamente. \n");
		calculateFee();
	}

	public void calculateFee() {
		pendingCapital = requestDTO.getLoan();
		System.out.println("El estudio de pago de sus cuotas es el siguiente: \n");
		for (int i = 0; i <= requestDTO.getFee(); i++) {
			if (i > 0) { // Ya que el primer mes no se tiene en cuenta

				toPayPerFee = requestDTO.getLoan() * (Math.pow(1 + requestDTO.getInterest() / 100, requestDTO.getFee())
						* requestDTO.getInterest() / 100)
						/ (Math.pow(1 + requestDTO.getInterest() / 100, requestDTO.getFee()) - 1);
				feeInterest = pendingCapital * (requestDTO.getInterest() / 100); // Interes por cuota
				System.out.println();
				amortizationFee = toPayPerFee - feeInterest;
				pendingCapital = pendingCapital - amortizationFee;
				System.out.printf("Cuota: " + i + ": %f, Interes: %f, Cuota de amortizacion: %f, Capital: %f",
				toPayPerFee, feeInterest, amortizationFee, pendingCapital);
				totalMount = totalMount + toPayPerFee;
			}
		}
	}
}
