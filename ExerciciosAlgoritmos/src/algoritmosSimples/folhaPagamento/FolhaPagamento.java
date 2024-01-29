package algoritmosSimples.folhaPagamento;

public class FolhaPagamento {
	public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(10, 220, 5, 5, 50, 0.5);

        double salarioBase = CalculoFolhaPagamento.calcularSalarioBase(funcionario);
        double salarioBruto = CalculoFolhaPagamento.calcularSalarioBruto(funcionario);
        double salarioHorasExtras = CalculoFolhaPagamento.calcularSalarioHorasExtras(funcionario);
        double descontoINSS = CalculoFolhaPagamento.calcularDescontoINSS(funcionario);
        double descontoFGTS = CalculoFolhaPagamento.calcularDescontoFGTS(funcionario);
        double salarioLiquido = CalculoFolhaPagamento.calcularSalarioLiquido(funcionario);
        double valeTransporte = CalculoFolhaPagamento.calcularValeTransporte(funcionario);
        double valeAlimentacao = CalculoFolhaPagamento.calcularValeAlimentacao(funcionario);

        
        System.out.printf("Salário Base: %.2f \n", salarioBase);
        System.out.printf("Horas extras: %.2f \n", salarioHorasExtras);                        
        System.out.printf("Salário Bruto: %.2f \n", salarioBruto);
        
        System.out.println();
        
        System.out.printf("Desconto INSS: %.2f \n", descontoINSS);
        System.out.printf("Desconto FGTS: %.2f \n", descontoFGTS);
        
        System.out.println();
        
        System.out.printf("Vale Transporte: %.2f \n", valeTransporte);
        System.out.printf("Vale Alimentação: %.2f \n", valeAlimentacao);
        
        System.out.println();
        
        System.out.printf("Salário Líquido: %.2f", salarioLiquido);
	}
}