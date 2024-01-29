package areaFiguras;

public class Quadrado extends FiguraGeometrica2D {
	// O Quadrado tem os lados iguais, temos um leve problema de LSP
	
	public Quadrado(double lado) {
		super(lado, lado);
	}
	
	@Override
	public double calculaArea() {
		double area = Math.pow(comprimento, 2);
		return area;
	}
}