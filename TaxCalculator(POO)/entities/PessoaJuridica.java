package entities;

public class PessoaJuridica extends Pessoa {
	
	public Integer funcionarios;

	public PessoaJuridica(String nome, Double renda, Integer funcionarios) {
		super(nome, renda);
		this.funcionarios = funcionarios;
	}

	public Integer getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	@Override
	public Double impostos() {
		if (funcionarios > 10) {
			return (renda * 0.14);
		} else {
			return (renda * 0.16);
		}
	}

}
