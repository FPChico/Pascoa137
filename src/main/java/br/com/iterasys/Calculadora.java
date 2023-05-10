// 1 - pacote: conjunto de classes
package br.com.iterasys;

// 2 - Blibliotecas


// 3 -Classe
   public class Calculadora {
    // 3.1 Atributos - caracteristicas - campos

    // 3.2 Funções e Metódos
    public static double somarDoisNumeros(double num1, double num2){
        return num1 + num2;
    }

    public static double subtrairDoisNumeros(double num1, double num2){
        return num1 - num2;
    }

    public static double dividirDoisNumeros(double num1, double num2){
        return num1 / num2;
    }
    public static double multiplicarDoisNumeros(double num1, double num2){
        return num1 * num2;
    }
    public static String dividirDoisNumerosInteiros(int numA, int numB){ // inicio da função dividindo
         try{
            return String.valueOf(numA / numB);
         }
         catch (Exception e) {
             return ("Não foi possivel dividir por zero");

         }// final da função dividir Dois Numeiros Inteiros

    }// final classe dividir Dois Numerros Inteiros

}// final da classe


