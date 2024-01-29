package algoritmosSimples.folhaPagamento;

public class CalculoFolhaPagamento {
	
	public static double calcularSalarioBruto(Funcionario funcionario) {
		double salarioBase = calcularSalarioBase(funcionario);
	    double salarioHorasExtras = calcularSalarioHorasExtras(funcionario);
	    double salarioBruto = salarioBase + salarioHorasExtras;

	    double valorValeTransporte = calcularValeTransporte(funcionario);
	    double valorValeAlimentacao = calcularValeAlimentacao(funcionario);

	    salarioBruto -= valorValeTransporte;
	    salarioBruto -= valorValeAlimentacao;

	    return salarioBruto;
    }
	
    public static double calcularSalarioBase(Funcionario funcionario) {
        return funcionario.salarioHora * funcionario.horasTrabalhadas;
    }

    public static double calcularSalarioHorasExtras(Funcionario funcionario) {
        return funcionario.horasExtras * (1 + funcionario.percentualHorasExtras) * funcionario.salarioHora;
    }

    public static double calcularDescontoINSS(Funcionario funcionario) {
        double salarioBruto = calcularSalarioBruto(funcionario);
        double descontoINSS = 0;

        if (salarioBruto <= 1100) {
            descontoINSS = salarioBruto * 0.08;
        } else if (salarioBruto <= 2203.48) {
            descontoINSS = salarioBruto * 0.09;
        } else if (salarioBruto <= 3305.22) {
            descontoINSS = salarioBruto * 0.12;
        } else {
            descontoINSS = salarioBruto * 0.14;
        }

        return descontoINSS;
    }

    public static double calcularDescontoFGTS(Funcionario funcionario) {
        return calcularSalarioBruto(funcionario) * 0.08;
    }
    
    public static double calcularValeTransporte(Funcionario funcionario) {
        return funcionario.valeTransporte * calcularSalarioBase(funcionario);
    }

    public static double calcularValeAlimentacao(Funcionario funcionario) {
        return funcionario.valeAlimentacao * calcularSalarioBase(funcionario);
    }

    public static double calcularSalarioLiquido(Funcionario funcionario) {
        double descontoTotal = calcularDescontoINSS(funcionario) + calcularDescontoFGTS(funcionario);
        return calcularSalarioBruto(funcionario) - descontoTotal;
    }
}