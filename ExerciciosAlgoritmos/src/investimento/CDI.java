package investimento;

import java.time.LocalDate;

public class CDI {
	public static void main(String[] args) {
		 double selic = 0.05;
		 double capitalInicial = 1000;
		 LocalDate dataInicial = LocalDate.of(2000, 1, 1);
		 LocalDate dataFinal = LocalDate.of(2024, 1, 1);
		 Frequencia frequencia = Frequencia.MENSAL;
		 
		 // 24 anos de diferença = 8.760 dias ou 288 meses
		 System.out.println(calcularEvolucaoLucrosCDI(selic, capitalInicial, dataInicial, dataFinal, frequencia));
	}
	
	public enum Frequencia { DIARIA, MENSAL, ANUAL }
	
	// Juros compostos, o retorno do capital atual, vai ser no dia 01 de cada mês até chegar no dia 31/01/2024
	public static String calcularEvolucaoLucrosCDI(double selic, double capital, LocalDate dataInicial, LocalDate dataFinal, Frequencia frequencia) {
		StringBuilder resultado = new StringBuilder();
		LocalDate dataAtual = dataInicial;
        double capitalAtual = capital;

        while (dataAtual.isBefore(dataFinal) || dataAtual.isEqual(dataFinal)) {
            double juros = calcularJuros(selic, capitalAtual, frequencia);

            capitalAtual += juros;
            
            String dataFormatada = "Data: " + dataAtual;
            String capitalFormatado = " | Capital: " +  String.format("%.2f", capitalAtual);
            
            resultado.append(dataFormatada).append(capitalFormatado).append("\n");
            
            if(frequencia == Frequencia.DIARIA) {
            	dataAtual = dataAtual.plusDays(1);
            } else if(frequencia == Frequencia.MENSAL) {
            	dataAtual = dataAtual.plusMonths(1);
            } else {
            	dataAtual = dataAtual.plusYears(1);
            }
        }
        
        return resultado.toString();
    }

    public static double calcularJuros(double selic, double capital, Frequencia frequencia) {
        double taxaJuros = Math.pow(1 + selic, 1.0 / obterFatorConversao(frequencia)) - 1;
        return capital * taxaJuros;
    }

    public static int obterFatorConversao(Frequencia frequencia) {
    	if(frequencia == Frequencia.DIARIA) {
    		return 252;
    	} else if(frequencia == Frequencia.MENSAL) {
    		return 12;
    	} else {
    		return 1;
    	}
    }
}