package algoritmosSimples.conversorTemperatura;

public class ConversorTemperaturaTeste {
    public static void main(String[] args) {
    	System.out.println(testarConversao("Celsius Para Fahrenheit", 0));	// 32 ºF
    	System.out.println(testarConversao("Fahrenheit Para Celsius", 32));	// 0 ºC
    	System.out.println(testarConversao("Celsius Para Kelvin", 100));	// 373,15 ºK
    	System.out.println(testarConversao("Kelvin Para Celsius", 373.15));	// 100 ºC
    	System.out.println(testarConversao("Fahrenheit Para Kelvin", 32));	// 273,15 ºK
    	System.out.println(testarConversao("Kelvin Para Fahrenheit", 273.15));	// 32 ºF

        try {
            testarConversao("Operação Qualquer", 0);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static String testarConversao(String operacao, double temperatura) {
        double resultado = ConversorTemperatura.converterTemperatura(temperatura, operacao);
        return String.format("%.2f %s é igual a = %.2f", temperatura, operacao, resultado);
	}
}