package corrida;

import java.util.HashMap;
import java.util.Map;

public class Corrida {
	public static void main(String[] args) {
		Map<Integer, Corredor> corredores = new HashMap<Integer, Corredor>();
		
		Corredor corredor1 = new Corredor("Corredor 1", 5);
		Corredor corredor2 = new Corredor("Corredor 2", 6);
		Corredor corredor3 = new Corredor("Corredor 3", 7);
		
		Volta volta1 = new Volta(1, 20);
		Volta volta2 = new Volta(2, 18);
		Volta volta3 = new Volta(1, 16);
		Volta volta4 = new Volta(2, 14);
		Volta volta5 = new Volta(1, 12);
		Volta volta6 = new Volta(2, 10);
		
		corredor1.adicionaVolta(volta1);
		corredor1.adicionaVolta(volta2);
		corredor2.adicionaVolta(volta3);
		corredor2.adicionaVolta(volta4);
		corredor3.adicionaVolta(volta5);
		corredor3.adicionaVolta(volta6);
		
		corredores.put(1, corredor1);
		corredores.put(2, corredor2);
		corredores.put(3, corredor3);

	    System.out.println(calcularResultados(corredores));
	}
	
	
	public static String calcularResultados(Map<Integer, Corredor> corredores) {
	    StringBuilder resultado = new StringBuilder();

	    for (Map.Entry<Integer, Corredor> entry: corredores.entrySet()) {
	        Corredor corredor = entry.getValue();
	        String nomeCorredor = String.format("\nResultados para %s: \n", corredor.getNome());
	        String mediaTempo = String.format("Média dos tempos de volta: %.2f \n", mediaTempo(corredor));
	        String melhorTempo = String.format("Melhor tempo de volta: %.2f \n", melhorTempo(corredor));
	        String melhorCorredor = String.format("\nO Melhor corredor: %s \n", melhorCorredor(corredores));

	        resultado.append(nomeCorredor).append(mediaTempo).append(melhorTempo).append(melhorCorredor);
	    }

	    return resultado.toString();
	}

	
	public static double mediaTempo(Corredor corredor) {
		if(corredor.getVoltas().size() > 0) {
			double somaTempos = somaTempo(corredor);
			return somaTempos / corredor.getVoltas().size();
		} else {
			return 0;
		}
	}
	
	
	public static double somaTempo(Corredor corredor) {
		double somaTempos = 0;
		
		for(Volta volta: corredor.getVoltas()) {
			somaTempos += volta.getTempoVolta();
		}
		
		return somaTempos;
	}
	
	
	public static double melhorTempo(Corredor corredor) {
		double melhorTempo = Double.MAX_VALUE;
		
		for (Volta volta : corredor.getVoltas()) {
            melhorTempo = Math.min(melhorTempo, volta.getTempoVolta());
        }
		
        return melhorTempo;
	}
	
	
	public static Corredor melhorCorredor(Map<Integer, Corredor> corredores) {
	    Corredor melhorCorredor = null;
	    double menorMediaTempo = Double.MAX_VALUE;

	    for (Map.Entry<Integer, Corredor> entry : corredores.entrySet()) {
	        Corredor corredor = entry.getValue();
	        double mediaTempoCorredor = mediaTempo(corredor);

	        if (mediaTempoCorredor < menorMediaTempo) {
	            menorMediaTempo = mediaTempoCorredor;
	            melhorCorredor = corredor;
	        }
	    }

	    return melhorCorredor;
	}
}