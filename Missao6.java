package missao6;

import java.util.Scanner;

public class Missao6 {

    public static void main(String[] args) {
 
        float Celsius, Fahrenehit, TempCelsius, TempFahrenheit;
        float CotacaoDolar, ConversaoDolar, ConversaoReal, QtdeDolar, QtdeReais;        
        int opcao = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        do{
            
            System.out.println("");
            System.out.println("ESCOLHA UMA DAS OPÇÕES A SEGUIR:");
            System.out.println("1 - CONVERSÃO DA TEMPERAURA DE CELSIUS PARA FAHRENHEIT");
            System.out.println("2 - CONVERSÃO DA TEMPERAURA DE FAHRENHEIT PARA CELSIUS");
            System.out.println("3 - CONVERSÃO DA MOEDA DE DOLAR PARA REAIS");
            System.out.println("4 - CONVERSÃO DA MOEDA DE REAIS PARA DOLAR");
            System.out.println("5 - FINALIZAR");
            opcao = leitor.nextInt();
                      
            switch(opcao) {
                case 1:
                    System.out.println("INFORME A TEMPERATURA EM CELSIUS: ");
                    Celsius = leitor.nextFloat();
                    TempFahrenheit = (Celsius * 1.8f) + 32;
                    System.out.println("A TEMPERATURA EM FAHRENEHIT É: " + TempFahrenheit + "ºF");
                    break;
                
                case 2:
                    System.out.println("INFORME A TEMPERATURA EM FAHRENHEIT: ");
                    Fahrenehit = leitor.nextFloat();
                    TempCelsius = (Fahrenehit - 32)/1.8f;
                    System.out.println("A TEMPERATURA EM CELSIUS É: " + TempCelsius + "ºC");
                    break;
                
                case 3:
                    System.out.println("INFORME A COTAÇÃO DO DOLAR ");
                    CotacaoDolar = leitor.nextFloat();
                    System.out.println("INFORME QUANTOS DOLARES QUER CONVERTER");
                    QtdeDolar = leitor.nextFloat();
                    ConversaoReal = (QtdeDolar * CotacaoDolar);
                    System.out.println("A CONVERSAO DEU: R$ " + ConversaoReal);
                    break;
                
                case 4:
                    System.out.println("INFORME A COTAÇÃO DO DOLAR ");
                    CotacaoDolar = leitor.nextFloat();
                    System.out.println("INFORME QUANTOS REAIS QUER CONVERTER");
                    QtdeReais = leitor.nextFloat();
                    ConversaoDolar = (QtdeReais / CotacaoDolar);
                    System.out.println("A CONVERSAO DEU: U$ " + ConversaoDolar);
                    break;
                
                case 5:
                    System.out.println("CONVERSOES FINALIZADAS, OBRIGADO");
                    break;  
                    
                default:
                    System.out.println("DIGITE UM NUMERO VALIDO");
                    break;    
            }  
            
        }while(opcao != 5);
    }
    
}
