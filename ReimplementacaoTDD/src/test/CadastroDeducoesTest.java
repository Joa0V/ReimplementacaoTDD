package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.IRPF;

public class CadastroDeducoesTest {

	private static IRPF irpf;
	
	@BeforeEach
	public void setup() {
		irpf = new IRPF();
	}
	
	@Test
	public void testCadastrarPrevidenciaOficial() {
		irpf.cadastrarPrevidenciaOficial(700f);
		assertEquals(700f, irpf.getPrevidenciaOficial(), 0);
	}
	
	@Test
	public void testCadastrarPrevidenciaOficial2() {
		irpf.cadastrarPrevidenciaOficial(1000f);
		assertEquals(1000f, irpf.getPrevidenciaOficial(), 0);
	}
	
	@Test
	public void testCadastrarPrevidenciaOficial3() {
		irpf.cadastrarPrevidenciaOficial(900f);
		assertEquals(900f, irpf.getPrevidenciaOficial(), 0);
	}
}
