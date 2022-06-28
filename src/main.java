import java.io.IOException;
import java.util.InputMismatchException;


public class main {

	public static void main(String[] args) {
		Run();
	}

	public static void Run() {
		FrenchAmortization credit = new FrenchAmortization();
		try {
			credit.userDataInput();
		} catch (InputMismatchException ex) {
			System.out.println("Intente de nuevo\nPor favor ingrese un valor numerico sin signos de puntuacion. ");
			Run();
		}
	}
}
