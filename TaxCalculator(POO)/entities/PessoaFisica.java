package entities;

public class PessoaFisica extends Pessoa {
	
	private Double gastos;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String nome, Double renda, Double gastos) {
		super(nome, renda);
		this.gastos = gastos;
	}

	public Double getGastos() {
		return gastos;
	}

	public void setGastos(Double gastos) {
		this.gastos = gastos;
	}
	
	@Override
	public Double impostos() {
		if (renda <= 20000.00) {
			return (renda * 0.15) - (gastos * 0.5);
		} else {
			return (renda * 0.25) - (gastos * 0.5);
		}
	}
}
