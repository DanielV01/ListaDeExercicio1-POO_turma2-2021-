package classes.java;

public class Correntista {
	
	private int numeroConta;
	private int tipoConta;// 0 - ContaCorrente; 1 - ContaPoupança;
	private double limite;
	private double saldo;
	public Correntista() {
		
	}
	
	public Correntista(int numeroConta, int tipoConta) {
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;

	}
	
	public String TipoConta() {
		if(this.tipoConta == 1){
			return "Conta poupança";
		}
		else {
			return "Conta corrente";
		}
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void SaldoELimite(double saldo, double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}
	public String Deposito(double valor) {
		this.saldo += valor;
		return "Deposito realizado com suceso no valor de R$"+valor;
	}
	
	public String Saque(double valor) {
		if(saldo >= valor) {
			 this.saldo -= valor;
			 return "Saque realizado com sucesso no valor: R$" + valor;
		}else {
			return "Saque negado, o valor R$" + valor + " é maior que o saldo."; 
		}

	}
	
	public String Extrato() {
		return "Extrato: [Saldo atual : R$" + getSaldo() + "]" + ",[Limite: R$"  + getLimite() + "]";
	}


}
