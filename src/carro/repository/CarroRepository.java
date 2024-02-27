package carro.repository;

import carro.model.Carro;

public interface CarroRepository {
	
	        // CRUD do Estacionamento
			public void procurarPorId(int idCarro);
			public void listarTodos();
			public void cadastrar(Carro carro);
			public void atualizar(Carro carro);
			public void deletar(int idCarro);

}
