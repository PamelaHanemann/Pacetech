algoritmo "Conversao Temperatura"

VAR
MENU: LITERAL
Conversao, Temperatura, Hora: VETOR[1..4] DE REAL
I, J, CONTADOR: INTEIRO
AUX, AUX2, AUX3: REAL

PROCEDIMENTO OrdenacaoTemperatura
INICIO
para I de 1 ate 4 faca
   para J de 1 ate 4 faca
      se Temperatura[J] < Temperatura[I] entao
         AUX <- Temperatura[I]
         Temperatura[I] <- Temperatura[J]
         Temperatura[J] <- AUX
         aux2 <- Hora[I]
         Hora[I] <- Hora[J]
         Hora[J] <- aux2
         aux3 <- CONVERSAO[I]
         CONVERSAO[I] <- CONVERSAO[J]
         CONVERSAO[J] <- aux3
      fimse
   fimpara
fimpara
FIMPROCEDIMENTO

FUNCAO CalculaFahrenheit():real
INICIO
CONVERSAO[contador] <- ((Temperatura[contador] * 1.8)+ 32)
RETORNE CONVERSAO[contador]
FIMFUNCAO


FUNCAO CalculaCelsius():real
VAR
INICIO
CONVERSAO[contador] <- ((Temperatura[contador] - 32)/1.8)
RETORNE CONVERSAO[contador]
FIMFUNCAO

PROCEDIMENTO CelsiusFahrenheit
INICIO

PARA CONTADOR DE 1 ATE 4 FACA
   ESCREVAL("INFORME A", CONTADOR," TEMPERATURA EM CELSIUS")
   LEIA(Temperatura[CONTADOR])
   ESCREVAL("INFORME O", contador, " HORARIO DA MEDIÇÃO DA TEMPERATURA")
   LEIA(Hora[CONTADOR])
   CONVERSAO[CONTADOR] <- CalculaFahrenheit()
FIMPARA

OrdenacaoTemperatura

   ESCREVAL()
   ESCREVAL("TEMPERATURA ORDENADA DE FORMA CRESCENTE:")
   ESCREVAL()
   para Contador de 1 ate 4 faca
   ESCREVAL("TEMPERATURA ",Temperatura[contador]," GRAUS CELSIUS, REGISTRADA AS ",Hora[contador],"H CORRESPONDE A ",CONVERSAO[contador]," GRAUS FAHRENEHIT")
FIMPARA
FIMPROCEDIMENTO


PROCEDIMENTO FahrenheitCelsius
INICIO

PARA CONTADOR DE 1 ATE 4 FACA
   ESCREVAL("INFORME A", CONTADOR," TEMPERATURA EM FAHRENHEIT")
   LEIA(Temperatura[CONTADOR])
   ESCREVAL("INFORME O", contador, " HORARIO DA MEDIÇÃO DA TEMPERATURA")
   LEIA(Hora[CONTADOR])
   CONVERSAO[CONTADOR] <- CalculaCelsius()
FIMPARA

OrdenacaoTemperatura

   ESCREVAL()
   ESCREVAL("TEMPERATURA ORDENADA DE FORMA CRESCENTE:")
   ESCREVAL()
   para Contador de 1 ate 4 faca
   ESCREVAL("TEMPERATURA ",Temperatura[contador]," GRAUS FAHRENHEIT, REGISTRADA AS ",Hora[contador],"H CORRESPONDE A ",CONVERSAO[contador]," GRAUS CELSIUS")

FIMPARA
FIMPROCEDIMENTO

inicio

REPITA
   ESCREVAL ()
   ESCREVAL ("ESCOLHA UMA DAS OPÇÕES A SEGUIR")
   ESCREVAL ("1 - CONVERSÃO DA TEMPERATURA DE CELSIUS PARA FAHRENHEIT")
   ESCREVAL ("2 - CONVERSÃO DA TEMPERATURA DE FAHRENHEIT PARA CELSIUS")
   ESCREVAL ("3 - FINALIZAR")
   ESCREVAL ()
   LEIA(MENU)

   limpatela

   ESCOLHA MENU

      CASO "1"
          CelsiusFahrenheit

      CASO "2"
          FahrenheitCelsius

      CASO "3"
         ESCREVAL("CONVERSÕES FINALIZADAS")

      OUTROCASO
         ESCREVAL("DIGITE UM NUMERO VALIDO")

   FIMESCOLHA
ATE MENU = "3"

fimalgoritmo

