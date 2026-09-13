package refatoracoes.composicao;

public class SplitVariable {
	public SplitVariable(float height, float width) {
		
		double temp = 2 * (height + width);
		System.out.println(temp);
		
		double area = height * width;
		System.out.println(area);
	}
}
