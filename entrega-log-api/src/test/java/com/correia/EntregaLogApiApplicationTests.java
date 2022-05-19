package com.correia;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.correia.dominio.model.Cliente;
import com.correia.dominio.repository.ClienteRepository;

@SpringBootTest
class EntregaLogApiApplicationTests {

	@Autowired
	ClienteRepository dao;
	@Test
	void contextLoads() {
		Cliente cliente = new Cliente();
		cliente.setEmail("teste01@gmail.com");
		cliente.setNome("Teste 01");
		cliente.setTelefone("65 99110-6022");
		
		dao.save(cliente);
		
	}

}
