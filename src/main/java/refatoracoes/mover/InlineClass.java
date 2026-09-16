package refatoracoes.mover;

public class InlineClass {
	
	public class Person {
		String name;
		String officeAreaCode;
		private String officeNumber;

		public String getTelephoneNumber() {
			return officeAreaCode + officeNumber;
		}
	}
}

