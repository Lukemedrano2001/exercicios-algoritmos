package areaFiguras;

public class Triangulo extends FiguraGeometrica2D {
	public Triangulo(double comprimento, double altura) {
		super(comprimento, altura);
	}

	@Override
	public double calculaArea() {
		double area = comprimento * altura / 2;
		return area;
	}
}