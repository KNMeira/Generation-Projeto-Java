package carro.controller;

import java.util.ArrayList;

import carro.model.Carro;
import carro.model.CarroZero;
import carro.repository.CarroRepository;
import carro.util.Cores;


public class CarroController implements CarroRepository {
	
	private ArrayList<CarroZero> listaCarros = new ArrayList<CarroZero>();

	@Override
	public void procurarPorId(int idCarro) {
		var carro = buscarNaCollection(idCarro);
		if(carro != null) {
			System.out.println("O carro é: " + ((Carro) carro).getModeloCarro());
		} else {
			System.out.println("\nO carro: " + carro + " não foi encontrado");
		}
			
		
	}

	

	@Override
	public void listarTodos() {
		for (var carro : listaCarros) {
			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND);
			System.out.println("******************************");
			System.out.println("O modelo do Carro é: " + carro.getModeloCarro());
			System.out.println("O ID é: " + carro.getIdCarro());
			System.out.println("Ano: " + carro.getAnoCarro());
			System.out.println("Placa: " + carro.getPlacaCarro());
			System.out.println("O valor: " + carro.getPrecoCarro());
			System.out.println("A garantia: " + carro.getAnosGarantia() + " anos");
			System.out.println("******************************");
		}
		
	}

	@Override
	public void cadastrar(CarroZero carro) {
		listaCarros.add(carro);
		System.out.println("\n O carro: " + carro.getIdCarro() + "foi cadastrado com sucesso!");
		
	}

	@Override
	public void atualizar(int idCarro, float precoCarroAtualizado) {
		CarroZero buscaCarro = buscarNaCollection(idCarro);
		CarroZero carroAtualizado = new CarroZero(buscaCarro.getModeloCarro(), buscaCarro.getPlacaCarro(), buscaCarro.getIdCarro(), buscaCarro.getAnoCarro(), precoCarroAtualizado, buscaCarro.getAnosGarantia());
		
		if(buscaCarro.getModeloCarro() != null) {
			listaCarros.set(listaCarros.indexOf(buscaCarro), carroAtualizado);
			System.out.println("\nO Carro: " + idCarro + " foi atualizado com sucesso!");
		} else {
			System.out.println("\nO Carro: " + idCarro + "não foi encontrado!");
		 }
		
	}

	public CarroZero buscarNaCollection(int idCarro) {
		for (CarroZero carro : listaCarros){
			if (idCarro == carro.getIdCarro()) {
				return carro;
			}
		}
		return null;
	}



	@Override
	public void deletar(int IdCarro) {
		var carro = buscarNaCollection(IdCarro);
		
		if(carro != null) {
			if (listaCarros.remove(carro) == true)
				System.out.println("\nO Carro número: " + IdCarro + " foi deletado!");
				System.out.println(listaCarros);
		} else {
			System.out.println("\nO Carro número: " + IdCarro + " não foi encontrado!");
		}
		
	}

}
