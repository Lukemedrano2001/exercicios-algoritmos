package areaFiguras;

public abstract class FiguraGeometrica2D {
	double comprimento;
	double altura;
	
	public abstract double calculaArea();
	
	public FiguraGeometrica2D(double comprimento, double altura) {
		this.comprimento = comprimento;
		this.altura = altura;
	}

	public String exibeConsole() {
		return String.format("Área: %.2f", this.calculaArea());
	}
}