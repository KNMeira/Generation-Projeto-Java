package carro.controller;

import java.util.ArrayList;

import carro.model.Carro;
import carro.repository.CarroRepository;


public class CarroController implements CarroRepository {
	
	private ArrayList<Carro> listaCarros = new ArrayList<Carro>();

	@Override
	public void procurarPorId(int idCarro) {
		var carro = buscarNaCollection(idCarro);
		if(carro != null) {
			System.out.println("O carro é: " + carro);
		} else {
			System.out.println("\n O carro: " + carro + "Não foi encontrado");
		}
			
		
	}

	private Object buscarNaCollection(int idCarro) {
		
		return null;
	}

	@Override
	public void listarTodos() {
		for (var carro : listaCarros) {
			System.out.println(listaCarros);
		}
		
	}

	@Override
	public void cadastrar(Carro carro) {
		listaCarros.add(carro);
		System.out.println("\n O carro: " + carro.getIdCarro() + "foi cadastrado com sucesso!");
		
	}

	@Override
	public void atualizar(Carro carro) {
		var buscaCarro = buscarNaCollection(carro.getIdCarro());
		
		if(buscaCarro != null) {
			listaCarros.set(listaCarros.indexOf(buscaCarro), carro);
			System.out.println("\n O Carro: " + carro.getIdCarro() + " foi atualizado com sucesso!");
		} else {
			System.out.println("\n O Carro: " + carro.getIdCarro() + "não foi encontrado!");
		}
		
	}

	@Override
	public void deletar(int IdCarro) {
		var carro = buscarNaCollection(IdCarro);
		
		if(carro != null) {
			if (listaCarros.remove(carro) == true)
				System.out.println("\n O Carro número: " + IdCarro + " foi deletado!");
		} else {
			System.out.println("\n O Carro número: " + IdCarro + " não foi encontrado!");
		}
		
	}

}
