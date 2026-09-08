package refatoracoes.mover;

public class InlineClass {
    public class Person {
        String name;
        private String officeAreaCode;
        private String officeNumber;

        public String getTelephoneNumber() {
            return officeAreaCode + officeNumber;
        }
    }
}
