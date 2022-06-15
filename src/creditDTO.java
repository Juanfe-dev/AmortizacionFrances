
public class creditDTO {

	private double feeToPay;  // La cuota que pagar.
	private double loan;  // La cuantía total del préstamo hipotecario.
	private double fee;	//  El número de cuotas totales.
	private double interest;	//	Tipo de interés efectivo.

	public creditDTO() { 
		// void constructor
	}

	public double getFeeToPay() {
		return feeToPay;
	}

	public void setFeeToPay(double feeToPay) {
		this.feeToPay = feeToPay;
	}

	public double getLoan() {
		return loan;
	}

	public void setLoan(double loan) {
		this.loan = loan;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double installment) {
		this.fee = installment;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}
}