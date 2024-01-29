package algoritmosSimples.conversorTempo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.UnaryOperator;

public class ConversorTempo {
	private static Map<String, UnaryOperator<Double>> conversao = new HashMap<>();
	private static int dias = 365;	// 365 dias -> 1 ano
	private static int horas = 24;	// 24 Horas -> 1 dia
	private static int minutos = 60;	// 60 Minutos -> 1 Hora
	private static int segundos = 60;	// 60 Segundos -> 1 minuto
	
	static {
        inicializarConversoes();
    }
	
	private static void inicializarConversoes() {
        conversao.put("Ano para Dias", ConversorTempo::anoParaDias);
        conversao.put("Dias para Hora", ConversorTempo::diaParaHoras);
        conversao.put("Hora para Minuto", ConversorTempo::horaParaMinutos);
        conversao.put("Minuto para Segundo", ConversorTempo::minutoParaSegundos);
    }
	
	public static double converterTempo(double tempo, String operacao) {
        UnaryOperator<Double> funcao = conversao.get(operacao);
        
        if (funcao != null) {
            return funcao.apply(tempo);
        } else {
            throw new IllegalArgumentException("\nOperação de conversão inválida.");
        }
    }
	
	private static double anoParaDias(double ano) {
        return ano * dias;
    }
	
	private static double diaParaHoras(double dia) {
        return dia * horas;
    }

    private static double horaParaMinutos(double hora) {
    	 return hora * minutos;
    }

    private static double minutoParaSegundos(double minuto) {
    	 return minuto * segundos;
    }
}