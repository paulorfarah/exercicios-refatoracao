package refatoracoes.mover;

public class Person {

    private String name;

    private TelephoneNumber telephone;

    public void setTelephone(TelephoneNumber tele) {
		this.telephone = tele;
	}

	public TelephoneNumber getTelephoneNumber() {
		return this.telephone;
	}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    } 

}