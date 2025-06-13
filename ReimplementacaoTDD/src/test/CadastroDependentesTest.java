package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.IRPF;

public class CadastroDependentesTest {

	
	private static IRPF irpf;
	
	@BeforeEach
	public void setup() {
		irpf = new IRPF();
	}
	
	@Test
	public void testCadastrarUmDependente() {
		irpf.cadastrarDependente("Jose");
		assertEquals(189.59f, irpf.getDeducaoDependentes(), 0);
	}
	
	@Test
	public void testCadastrarDoisDependentes() {
		irpf.cadastrarDependente("Jose");
		irpf.cadastrarDependente("Maria");
		assertEquals(2*189.59f, irpf.getDeducaoDependentes(), 0);
	}
	
	@Test
	public void testCadastrarTresDependentes() {
		irpf.cadastrarDependente("Jose");
		irpf.cadastrarDependente("Maria");
		irpf.cadastrarDependente("Joao");
		assertEquals(3*189.59f, irpf.getDeducaoDependentes(), 0);
	}
	
	@Test
	public void testCadastrarDependenteRepetido() {
		irpf.cadastrarDependente("Jose");
		irpf.cadastrarDependente("Jose");
		assertEquals(189.59f, irpf.getDeducaoDependentes(), 0);
	}
}
