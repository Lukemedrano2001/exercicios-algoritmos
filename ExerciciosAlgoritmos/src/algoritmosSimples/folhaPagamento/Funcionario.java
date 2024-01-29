package algoritmosSimples.folhaPagamento;

public class Funcionario {
	double salarioHora;
	int horasTrabalhadas;
	double valeTransporte;
	double valeAlimentacao;
	int horasExtras;
	double percentualHorasExtras;
	
	public Funcionario(double salarioHora, int horasTrabalhadas, double valeTransporte, double valeAlimentacao, int horasExtras, double percentualHorasExtras) {
		this.salarioHora = salarioHora;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valeTransporte = valeTransporte / 100;
		this.valeAlimentacao = valeAlimentacao / 100;
		this.horasExtras = horasExtras;
		this.percentualHorasExtras = percentualHorasExtras;
	}
}