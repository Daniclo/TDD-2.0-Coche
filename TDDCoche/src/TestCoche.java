import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCoche {

	@Test
	void test_al_crear_un_coche_su_velocidad_es_0DaniColl() {
		Coche nuevoCoche = new Coche();
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}
	@Test
	void test_al_acelerar_un_coche_su_velocidad_aumentaDaniColl() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.acelerar(30);
		Assertions.assertEquals(30, nuevoCoche.velocidad);
	}
	@Test
	void test_al_decelerar_un_coche_su_velocidad_disminuyeDaniColl() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.acelerar(30);
		nuevoCoche.decelerar(20);
		Assertions.assertEquals(10, nuevoCoche.velocidad);
	}
	@Test
	void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_inferior_a_0DaniColl() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.acelerar(30);
		nuevoCoche.decelerar(50);
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}
}