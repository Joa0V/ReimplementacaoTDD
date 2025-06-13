package app;

import java.util.*;

public class IRPF {
	
	private float salario;
	private float previdenciaOficial;
	private ArrayList<String> Dependentes = new ArrayList<String>();
	
	public void cadastrarSalario(float salario) {
		this.salario += salario;
	}
	
	public float getSalarioTotal() {
		return this.salario;
	}

	public void cadastrarPrevidenciaOficial(float valorPrevidenciaOficial) {
		this.previdenciaOficial = valorPrevidenciaOficial;
		
	}

	public float getPrevidenciaOficial() {
		return this.previdenciaOficial;
	}

	public void cadastrarDependente(String nomeDependente) {
		
		if(!this.Dependentes.contains(nomeDependente)) {
			this.Dependentes.add(nomeDependente);			
		}
	}

	public float getDeducaoDependentes() {
		
		float deducaoTotalDependentes = 189.59f * this.Dependentes.size();

		return deducaoTotalDependentes;
	}
	
	
}
