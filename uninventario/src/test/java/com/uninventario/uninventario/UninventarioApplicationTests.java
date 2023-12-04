package com.uninventario.uninventario;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.uninventario.uninventario.domain.database.Database;
import com.uninventario.uninventario.domain.laboratorio.Laboratorio;

@SpringBootTest
class UninventarioApplicationTests {

	@Test
	 void adicionarLaboratorioTest() {
		Database.resetarLaboratorio();
		Laboratorio laboratorio = new Laboratorio(1, "Laboratório de informática 1", "Predio Central", 2);
		Database.adicionarLaboratorio(laboratorio);
		Laboratorio[] resultado = Database.buscarTodosLaboratorios();
		assertEquals(1, resultado.length);
	}



}
