package Entities;

public class TerceiroFuncionario {

	public TerceiroFuncionario(String string, String string2, int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}

	public class Terceiro extends Funcionario {

	    private double adicional;

	    public Terceiro(String matricula, String nome, int horasTrabalhadas, double valorHora, double adicional) {
	        super(matricula, nome, horasTrabalhadas, valorHora);
	        this.setAdicional(adicional);
	    }

	    public double getAdicional() {
	        return adicional;
	    }

	    public void setAdicional(double adicional) {
	        this.adicional = adicional;
	    }
	    
	    @Override
	    public double calcularSalario() {
	    	
	    	return (super.getHorasTrabalhadas()*super.getValorHoras())+this.adicional;
	    
	}
	}

	public char[] getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getMatricula() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getHorasTrabalhadas() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getValorHora() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getAdicional() {
		// TODO Auto-generated method stub
		return null;
	}
}
	
	
	

