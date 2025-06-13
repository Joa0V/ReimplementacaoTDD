package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.IRPF;

class CadastroRendimentosTest {

	private static IRPF irpf;
	
	@BeforeEach
	public void setup() {
		irpf = new IRPF();
	}
	
	@Test
	void testCadastrarSalario() {
		irpf.cadastrarSalario(5000f);
		assertEquals(5000f, irpf.getSalarioTotal(), 0);
	}
	@Test
	void testCadastrarSalario2() {
		irpf.cadastrarSalario(6000f);
		assertEquals(6000f, irpf.getSalarioTotal(), 0);
	}
	@Test
	void testCadastrarSalario3() {
		irpf.cadastrarSalario(6000f);
		irpf.cadastrarSalario(5000f);
		assertEquals(11000f, irpf.getSalarioTotal(), 0);
	}

}
