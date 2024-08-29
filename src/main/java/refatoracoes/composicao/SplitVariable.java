package refatoracoes.composicao;

public class SplitVariable {
	public SplitVariable(float height, float width) {
		double temp = 2 * (height + width);
		System.out.println(temp);
		temp = height * width;
		System.out.println(temp);
	}
}
