package refatoracoes.mover;

public class InlineClass {
	
	private Person person;

	public InlineClass(Person person, TelephoneNumber telephone) {
		this.person = person;
		this.person.setTelephone(telephone);
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Person getPerson() {
		return this.person;
	}
}

