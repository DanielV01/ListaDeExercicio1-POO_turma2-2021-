package classe.executavel;

import classes.java.Conta;
import classes.java.Correntista;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		Correntista correntista = new Correntista(1234654, 0);
		
		Conta conta = new Conta("Zezinho", 31, 234567890, 907823212, 999887766);
		
		correntista.SaldoELimite(1000.00, 500.00);
		
		/*correntista.Deposito(500.00);
		correntista.Saque(100.00);*/

		System.out.println(conta.toString());
		
		Double valorSaque = 200.00;
		System.out.println(correntista.Saque(valorSaque));
		
		double valorDeposito = 500.00;
		System.out.println(correntista.Deposito(valorDeposito));
		
		System.out.println(correntista.Extrato());
	}

}
