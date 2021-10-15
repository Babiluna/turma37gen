package Entities;

public class Funcionario {
	
	
	private String nome;
	private String matricula;
	private int horasTrabalhadas;
    private double valorHoras;
    
    public Funcionario (String nome, String matricula, int hotasTrabalhadas, double valorHoras) {
    	
    	super();
    	this.nome=nome;
    	this.matricula=matricula;
    	this.horasTrabalhadas=horasTrabalhadas;
    	this.valorHoras=valorHoras;
    	
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHoras() {
		return valorHoras;
	}

	public void setValorHoras(double valorHoras) {
		this.valorHoras = valorHoras;
	}
	
	public double calcularSalario() {
    	
    	return (this.horasTrabalhadas*this.valorHoras);
}

}