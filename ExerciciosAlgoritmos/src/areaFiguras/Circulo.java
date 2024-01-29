package areaFiguras;

public class Circulo extends FiguraGeometrica2D {
	public Circulo(double raio) {
		super(raio, raio);
	}

	@Override
	public double calculaArea() {
		double area = 2 * Math.PI * comprimento;
		return area;
	}
}