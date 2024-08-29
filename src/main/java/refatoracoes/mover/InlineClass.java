package refatoracoes.mover;

public class InlineClass {
	
	public class Person {
		String name;
		public String getTelephoneNumber() {
			TelephoneNumber tn = new TelephoneNumber();
			return tn.getTelephoneNumber();
		}
	}
	
	public class TelephoneNumber {
		private String officeAreaCode;
		private String officeNumber;

		public String getTelephoneNumber() {
			return officeAreaCode + officeNumber;
		}
	}
}

