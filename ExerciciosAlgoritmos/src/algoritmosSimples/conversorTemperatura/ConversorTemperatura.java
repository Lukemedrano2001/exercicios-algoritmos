package algoritmosSimples.conversorTemperatura;

import java.util.HashMap;
import java.util.Map;
import java.util.function.UnaryOperator;

public class ConversorTemperatura {
    private static Map<String, UnaryOperator<Double>> conversao = new HashMap<>();

    static {
        inicializarConversoes();
    }

    private static void inicializarConversoes() {
        conversao.put("Celsius Para Fahrenheit", ConversorTemperatura::celsiusParaFahrenheit);
        conversao.put("Fahrenheit Para Celsius", ConversorTemperatura::fahrenheitParaCelsius);
        conversao.put("Celsius Para Kelvin", ConversorTemperatura::celsiusParaKelvin);
        conversao.put("Kelvin Para Celsius", ConversorTemperatura::kelvinParaCelsius);
        conversao.put("Fahrenheit Para Kelvin", ConversorTemperatura::fahrenheitParaKelvin);
        conversao.put("Kelvin Para Fahrenheit", ConversorTemperatura::kelvinParaFahrenheit);
    }

    public static double converterTemperatura(double temperatura, String operacao) {
        UnaryOperator<Double> funcao = conversao.get(operacao);
        
        if (funcao != null) {
            return funcao.apply(temperatura);
        } else {
            throw new IllegalArgumentException("\nOperação de conversão inválida.");
        }
    }

    private static double celsiusParaFahrenheit(double temperatura) {
        double resultado = (temperatura * 9 / 5) + 32;
        return resultado;
    }

    private static double fahrenheitParaCelsius(double temperatura) {
        double resultado = (temperatura - 32) * 5 / 9;
        return resultado;
    }

    private static double celsiusParaKelvin(double temperatura) {
        double resultado = temperatura + 273.15;
        return resultado;
    }

    private static double kelvinParaCelsius(double temperatura) {
    	double resultado = temperatura - 273.15;
        return resultado;
    }

    private static double fahrenheitParaKelvin(double temperatura) {
        double resultado = (temperatura - 32) * 5 / 9 + 273.15;
        return resultado;
    }

    private static double kelvinParaFahrenheit(double temperatura) {
    	double resultado = (temperatura - 273.15) * 9 / 5 + 32;
        return resultado;
    }
}