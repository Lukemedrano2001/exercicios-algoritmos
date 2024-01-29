package algoritmosSimples.conversorTempo;

public class ConversorTempoTeste {
	public static void main(String[] args) {
		System.out.println(testarConversao("Ano para Dias", 2));	// 2 anos em dias
        System.out.println(testarConversao("Dias para Hora", 7)); 	// 7 dias em horas
        System.out.println(testarConversao("Hora para Minuto", 24));  // 24 horas em minutos
        System.out.println(testarConversao("Minuto para Segundo", 60));  // 60 minutos em segundos
        
        try {
            testarConversao("Operação Qualquer", 0);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static String testarConversao(String operacao, int valor) {
        int resultado = (int) ConversorTempo.converterTempo(valor, operacao);
        return String.format("%d %s é igual a = %d", valor, operacao, resultado);
    }
}