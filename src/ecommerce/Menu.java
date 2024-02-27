package ecommerce;

import java.io.IOException;
import java.util.*;

import carro.controller.CarroController;
import carro.model.Carro;
import carro.model.CarroZero;
import carro.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		String modeloCarro, placaCarro;
		int idCarro, anoCarro, anosGarantia;
		float precoCarro, precoCarroAtualizado;
		
		CarroController carros = new CarroController();
		
		while (true) {
			System.out.println(Cores.TEXT_RED + Cores.ANSI_WHITE_BACKGROUND_BRIGHT);
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("               ESTACIONAMENTO GENERATION             ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Carro                      ");
			System.out.println("            2 - Listar todos os Carros               ");
			System.out.println("            3 - Buscar Carro por ID                  ");
			System.out.println("            4 - Atualizar Dados do Carro             ");
			System.out.println("            5 - Apagar Carro                         ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			//opcao = scanner.nextInt();
			
			try {
				opcao = scanner.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				scanner.nextLine();
				opcao = 0;
			}

			if (opcao == 9) {
				System.out.println("\nEstacionamento Generation - Até mais!");
				sobre();
				scanner.close();
				System.exit(0);
			}

			scanner.nextLine();
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_PURPLE + "\nCadastrar Carro");
				System.out.println("Digite o ID do Carro: ");
				idCarro = scanner.nextInt();
				scanner.skip("\\R?");
				System.out.println("Digite o Modelo do Carro: ");
				modeloCarro = scanner.nextLine();
				
				System.out.println("Digite a Placa do Carro: ");
				placaCarro = scanner.nextLine();
				
				System.out.println("Digite o ano do Carro");
				anoCarro = scanner.nextInt();
				scanner.skip("\\R?");
				System.out.println("Digite o preço do Carro");
				precoCarro = scanner.nextFloat();
				scanner.skip("\\R?");
				System.out.println("Digite a quantidade de anos de garantia do Carro");
				anosGarantia = scanner.nextInt();
				
				carros.cadastrar(new CarroZero(modeloCarro, placaCarro, idCarro, anoCarro, precoCarro, anosGarantia));
				
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_BLUE + "\nListar todos Carros");
				carros.listarTodos();
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_YELLOW + "\nBuscar Carro por ID");
				
				System.out.println("Digite o número do ID do Carro: ");
				idCarro = scanner.nextInt();
				
				carros.procurarPorId(idCarro);
				
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_GREEN + "\nAtualizar Preço do Carro");
				
				System.out.println("Digite o número do ID do Carro: ");
				idCarro = scanner.nextInt();
				
				var buscaCarro = carros.buscarNaCollection(idCarro);
				
				if(buscaCarro != null) {
					System.out.println("Digite o novo Preço do Carro: ");
					precoCarroAtualizado = scanner.nextFloat();
					carros.atualizar(idCarro, precoCarroAtualizado);
				}

				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_RED + "\nApagar Carro");
				
				System.out.println("Digite o número do ID do Carro: ");
				idCarro = scanner.nextInt();
				
				carros.deletar(idCarro);
				
				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida" + Cores.TEXT_RESET);
				
				keyPress();
				break;
			}
		}
	}

	private static void keyPress() {
		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

	private static void sobre() {
		
		
	}
	

	}


