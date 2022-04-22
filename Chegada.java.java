package com.FilaEntrada;

import java.util.Scanner;

public class Chegada {
	int extensao_da_fila = 0;
	int Numero_Maximo_de_Elementos = 100;
    String A[] = new String[Numero_Maximo_de_Elementos];


        // Método para Inserir elementos na Fila
        public void InserirNaFila() {

            if (extensao_da_fila == Numero_Maximo_de_Elementos)
               System.out.println("Fila Cheia");

            else {

               System.out.print("Digite o nome do cliente: ");
               A[extensao_da_fila] = new Scanner (System.in).next();
               extensao_da_fila++;

            }
        }


        // Método para Remover elementos da Fila
        public void RemoverDaFila() {

            if (extensao_da_fila == 0)
               System.out.println("Fila Vazia: ");

            if (extensao_da_fila == 1)
               extensao_da_fila = 0;

            if (extensao_da_fila > 1) {

               for (int i=0; i < (extensao_da_fila - 1); ++i)
                    A[i] = A[i+1];

               extensao_da_fila--;

            }
        }


        // Método para Exibir elementos da Fila
        public void ExibirFila() {

            System.out.print("Fila: ");

            for (int i=0; i<extensao_da_fila;++i)
                System.out.print(A[i] + "  ");

            System.out.print("\n");

       }


        // Método para Retirar todos elementos da Fila
        public void LimparFila() {

            System.out.println("Fila Limpa!");
            extensao_da_fila = 0;

        }

            }