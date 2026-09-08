package refatoracoes.composicao;

public class SplitVariable {
	public SplitVariable(float height, float width) {
		double perimeter = 2 * (height + width);
		System.out.println(perimeter);
		double area = height * width;
		System.out.println(area);
	}
}
