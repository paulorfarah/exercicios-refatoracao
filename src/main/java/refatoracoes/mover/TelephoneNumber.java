package refatoracoes.mover;

public class TelephoneNumber {
    
    private String officeAreaCode;
    private String officeNumber;

    public String getTelephoneNumber() {
        return officeAreaCode + officeNumber;
    }
}