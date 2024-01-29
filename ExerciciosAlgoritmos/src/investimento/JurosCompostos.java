package investimento;

public class JurosCompostos {
	public static void main(String[] args) {
		System.out.println(calculaMontante(1000));
	}
	
	public enum UnidadeTempo {
		DIA, MES, ANO
	}

	public static double calculaJurosCompostos(double capital, double taxa, int tempo, UnidadeTempo unidadeTempo) {
		double tempoEmAnos = converterParaAnos(tempo, unidadeTempo);
		double juros = capital * Math.pow((1 + taxa / 100), tempoEmAnos) - capital;
		
		return juros;
	}

	public static double converterParaAnos(int tempo, UnidadeTempo unidadeTempo) {
		if (unidadeTempo == UnidadeTempo.ANO) {
            return tempo;
        } else if (unidadeTempo == UnidadeTempo.MES) {
            return tempo / 12;
        } else {
            return tempo / 365;
        }
	}
	
	public static String calculaMontante(double capital) {
		double juros = calculaJurosCompostos(capital, 5, 122, UnidadeTempo.MES);
		double montante = capital + juros;
		
		return String.format("Capital: %.2f | Juros: %.2f | Montante: %.2f", capital, juros, montante);
	}
}