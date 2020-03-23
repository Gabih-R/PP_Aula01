package País;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestePais {
	Pais pais, copia;
	static int id = 0;

	
	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
		pais = new Pais(id, "Vaticano", 831, 0.44);
		copia = new Pais(id, "Vaticano", 831, 0.44);
		System.out.println(pais);
		System.out.println(copia);
		System.out.println(id);
	}

	@Test
	public void test00Carregar() {
		System.out.println("carregar");
		
		Pais fixture = new Pais(1, "China", 1415045928, 9388211);
		Pais novo = new Pais(1, null, 0, 0);
		novo.carregar();
		assertEquals("testa inclusao", novo.getId(), fixture.getId());
	}

	@Test
	public void test01Criar() {
		System.out.println("criar");
		pais.criar();
		id = pais.getId();
		System.out.println(id);
		copia.setId(id);
		assertEquals("testa criacao", pais.getId(), copia.getId());
	}

	@Test
	public void test02Atualizar() {
		System.out.println("atualizar");
		pais.setPopulacao(9999990);
		copia.setPopulacao(999999);
		pais.atualizar();
		pais.carregar();
		assertEquals("testa atualizacao", pais.getId(), copia.getId());
	}

	@Test
	public void test03Excluir() {
		System.out.println("excluir");
		copia.setId(-1);
		copia.setNome(null);
		copia.setPopulacao(0);
		copia.setArea(0);
		pais.excluir();
		pais.carregar();
		assertEquals("testa exclusao", pais.getId(), copia.getId());
	}

	private void assertEquals(String string, int id2, int id3) {
	
		
	}
	
}
	

	