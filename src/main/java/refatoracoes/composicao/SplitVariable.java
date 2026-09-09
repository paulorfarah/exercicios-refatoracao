package refatoracoes.composicao;

public class SplitVariable {
	public SplitVariable(float height, float width) {
		double perimetro = 2 * (height + width);
		System.out.println(perimetro);
		double area = height * width;
		System.out.println(area);
	}
}
