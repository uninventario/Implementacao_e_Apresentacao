package com.uninventario.uninventario;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.uninventario.uninventario.domain.database.Database;
import com.uninventario.uninventario.domain.laboratorio.Laboratorio;
import com.uninventario.uninventario.domain.maquina.Maquina;
import com.uninventario.uninventario.domain.usuario.Usuario;

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
		@Test
	 	void adicionarMaquinaTest() {
		Maquina maquina = new Maquina(1, "Máquina 1", "Dell Latitude E6540", "Intel Core i5-5200U", "8 GB", "500 GB", "Laboratório 20");
		Database.adicionarMaquina(maquina);
		Maquina[] resultado = Database.buscarTodasMaquinas();
		assertEquals(1, resultado.length);
	}

		@Test
	 	void adicionarUsuarioTest() {
		Usuario usuario = new Usuario(1, "Daniel Silva Pereira", "Tecnico de informática", 12567);
		Database.adicionarUsuario(usuario);
		Usuario[] resultado = Database.buscarTodosUsuarios();
		assertEquals(1, resultado.length);
	}



}
