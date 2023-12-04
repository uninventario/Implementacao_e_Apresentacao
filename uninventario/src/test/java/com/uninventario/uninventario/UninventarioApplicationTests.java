package com.uninventario.uninventario;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.xml.crypto.Data;

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
		Usuario usuario2 = new Usuario(2, "Catarina Romano", "Supervisora de informática", 65738);
		Database.adicionarUsuario(usuario);
		Database.adicionarUsuario(usuario2);
		Usuario[] resultado = Database.buscarTodosUsuarios();
		assertEquals(2, resultado.length);
	}

	@Test
	void editarUsuario() {
		Usuario usuario = ed
	}




}
