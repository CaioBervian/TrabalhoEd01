package com.FilaEntrada;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	Chegada chegada = new Chegada();
	Chegada caixa = new Chegada();
	ListaDeMesas listaMesa = new ListaDeMesas();
	boolean iniciar = true;
	double somaCaixa = 0;
	Mesa mesa = new Mesa();
	
	System.out.print("Defina quantos mesas o restaurante tem: ");
	int mesas = entrada.nextInt();
	System.out.println("Defina quantos pratos estão disponíveis: ");
	int pratos = entrada.nextInt();
	
	for (int i = 0; i < mesas; i++) {
		mesa = new Mesa();
		mesa.setNumero(i + 1);
		mesa.setStatus("Está Livre");
		listaMesa.adicionar(mesa);
	}
	
	while (iniciar) {
		System.out.println();
		System.out.println("======================Restaurante Bom-Gosto======================");
		System.out.println();
		System.out.println("1- Fila Almoço");
		System.out.println("2- Servir");
		System.out.println("3- Fila caixa");
		System.out.println("4- Pagamento Caixa");
		System.out.println("5- Mesas");
		System.out.println("6- Mostrar fila do Almoço ");
		System.out.println("7- Mostrar fila do caixa");
		System.out.println("8- Pratos");
		System.out.println("9- Total movimentado no Caixa");
		System.out.println("0- Finalizar");
		int opc = entrada.nextInt();
		
		switch (opc) {
		case 1:
			chegada.InserirNaFila();
			break;
		case 2:
			if (pratos != 0) {
			chegada.RemoverDaFila();
			pratos = pratos - 1;
			System.out.println(listaMesa.listarDisponivels());
			System.out.println("Informe a mesa que deseja!");
			int num = entrada.nextInt();
			listaMesa.selecionarMesa(num);}
			else 
				System.out.println("Sem pratos!");
			break;
		case 3:
			caixa.InserirNaFila();
			break;
		case 4:
			System.out.println("Informe o total a pagar: ");
			double total = entrada.nextDouble();
			somaCaixa = somaCaixa + total;
			caixa.RemoverDaFila();
			
			break;
		case 5:
			System.out.println("\n======= MENU MESAS =======");
            System.out.println("1 - Disponíveis: ");
            System.out.println("2 - Indisponíveis: ");
            System.out.println("3 - Todas: ");
            System.out.println("4 - Liberar mesa");
            System.out.println("============================");
			int opcao = entrada.nextInt();
			if (opcao == 1) 
	        	   System.out.println(listaMesa.listarDisponivels());
			else if (opcao == 2) 
	        	   System.out.println(listaMesa.listarIndisponivels());
			else if (opcao == 3) 
        	   System.out.println(listaMesa.listar());
			else{
				System.out.println(listaMesa.listarIndisponivels());
				System.out.println("Informe a mesa que deseja liberar!");
				int numMe = entrada.nextInt();
				listaMesa.terminarAlmoço(numMe);
				}
			break;
		case 6:
			chegada.ExibirFila();
			break;
		case 7:
			caixa.ExibirFila();
			break;
		case 8:
			System.out.println("\n======= MENU PRATOS =======");
            System.out.println("1 - Disponíveis: ");
            System.out.println("2 - Repor Pratos: ");
            System.out.println("============================");
			int opcao1 = entrada.nextInt();
			if (opcao1 == 1) 
	        	   System.out.println(pratos);
			else { 
				System.out.println("Digite a quantidade de pratos que deseja repor: ");
				int quantidade = entrada.nextInt();
				pratos = pratos + quantidade;
			}
			
			break;
		case 9:
			System.out.println(somaCaixa);
			break;
		case 0:
			iniciar = false;
			System.out.println("Finalizando !");
			break;
		default:
			System.out.println("Tecla incorreta !");
		}
	
	

	}
entrada.close();
}
	
}
