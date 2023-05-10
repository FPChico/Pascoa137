// Biblioteca



import br.com.iterasys.Calculadora;
import static br.com.iterasys.Calculadora.dividirDoisNumerosInteiros;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
//import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

// Classe
    public class TesteCalculadora {

    // Atributos

    // Funções e Métodos

    @Test
    public void testeSomarDoisNumeros() { // inicio função somar
        // Configura
        // Valores de entrada
        double num1 = 2;
        double num2 = 5;
        double resultadoEsperado = 7;

        // Executa
        double resultadoAtual = Calculadora.somarDoisNumeros(num1, num2);

        // Valida
        double assertEqualsresultadoEsperado = resultadoAtual;
    }; //fim Função teste somar-

   @ParameterizedTest
   @CsvSource(value = {"2,5,7","1,2,3","10,15,25"})
        public void testeSomarDoisNumerosLendoLista(double num1, double num2, double resultadoEsperado) { // inicio função somar
        // Configura
        // Valores de entrada
        //double num1 = 2;
        //double num2 = 5;
        //double resultadoEsperado = 7;

        // Executa
        double resultadoAtual = Calculadora.somarDoisNumeros(num1, num2);

        // Valida
        double assertEqualsresultadoEsperado = resultadoAtual;
    } //fim Função teste somar-

    @ParameterizedTest
    @CsvFileSource(resources = "csv/massaTesteSomarDoisNumeros.csv",delimiter = ';')
    public void testeSomarDoisNumerosLendocsv(double num1, double num2, double resultadoEsperado) { // inicio função somar
        // Configura
        // Valores de entrada
        //double num1 = 2;
        //double num2 = 5;
        //double resultadoEsperado = 7;

        // Executa
        double resultadoAtual = Calculadora.somarDoisNumeros(num1, num2);

        // Valida
        double assertEqualsresultadoEsperado = resultadoAtual;
    } //fim Função teste somar-

    public static double subtrairDoisNumeros(double num1, double num2) {// inicio função subtrair
        return num1 - num2;
    }// fim da classe somar

    // Atributos

    // Métodos e Funções

    @Test
    public void testeSubtrairDoisNumeros() { // inicio do teste subtrair
        //Configure

        //Valores de Entrada
        double num1 = 20;
        double num2 = 10;
        double resultadoEsperado = 10;

        // Executa
        double resultadoAtual = Calculadora.subtrairDoisNumeros(num1, num2);

        // Valida
        double assertEqualsresultadoEsperado = resultadoAtual;
    }// final da função subtrair

    public static double testeDividirDoisNumeros(double num1, double num2) { // inicio da função dividir
        return num1 / num2;
    }    //fim da classe subtrair


    // atributos


    //  Métodos é funções

    @Test
    public void testeDividirDoisNumeros() { // inicio da teste dividir
        // configura

        double num1 = 26;
        double num2 = 5;
        double resultadoEsperado = 5.2;

        // executa
        double resultadoAtual = Calculadora.dividirDoisNumeros(num1, num2);

        // valida
        double assertEqualsresultadoEsperado = resultadoAtual;
    }// final da função teste didivir

    public static double multiplicarDoisNumeros(double num1, double num2) { // inicio da função multiplicar
        return num1 * num2;
    }// fim classe dividir


         // Atributos

         // Métodos e funções
    @Test
    public void testeMultiplicarDoisNumeros() { // inicio teste multiplicar

        // configura

        double num1 = 30;
        double num2 = 100;
        double resultadoEsperado = 3000;

        // executa
        double resultadoAtual = Calculadora.multiplicarDoisNumeros(num1, num2);

        // valida
        assertEquals(resultadoEsperado, resultadoAtual);



    } // fim da classe multiplicar
    @Test
    public void testedividirDoisNumerosInteiros() { // inicio função teste dividir por Zero

            // configura

            int numA = 8;
            int numB = 0;
            String ResultadoEsperado = "Não foi possivel dividir por zero";

            // Executa
            String ResultadoAtual = dividirDoisNumerosInteiros(numA, numB);
            // Valida
            assertEquals(ResultadoEsperado, ResultadoAtual);
            System.out.println(numA + " / " + numB + " = " + ResultadoAtual);
            System.out.println("0 resultado esperado: " + ResultadoEsperado);

        } // fim função dividir Dois Numeiros Inteiros
        //  fim classe dividir por Zero
}
