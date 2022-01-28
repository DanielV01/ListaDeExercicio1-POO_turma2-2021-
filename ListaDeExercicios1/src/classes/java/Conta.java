package classes.java;

public class Conta {
	private String nome;
	private int idade;
	private long cpf;
	private long rg;
	private long telefone;
	private Correntista correntista;
	public Conta() {
		
	}
	
	public Conta(double saldo, double limite) {
		this.correntista.setSaldo(saldo);
		this.correntista.setLimite(limite);
	}
	
	public Conta(String nome, int idade, long cpf, long rg, long telefone) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.rg = rg;
		this.telefone = telefone;
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public Correntista getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}
	
	
	
	public String toString() {
		return "[ [Nome: " + nome + "], [idade: " + idade + "], [Número do CPF: " + cpf + "], [Número do RG: " + rg + "], [Número do telefone: " + telefone 
				+ "] ]";
	}
}
