package refatoracoes.mover;

public class InlineClass {

    public class Person {
        String name;
        private String officeAreaCode;
        private String officeNumber;

        public String getTelephoneNumber() {
            return officeAreaCode + officeNumber;
        }

        public String getOfficeAreaCode() {
            return officeAreaCode;
        }

        public void setOfficeAreaCode(String officeAreaCode) {
            this.officeAreaCode = officeAreaCode;
        }

        public String getOfficeNumber() {
            return officeNumber;
        }

        public void setOfficeNumber(String officeNumber) {
            this.officeNumber = officeNumber;
        }
    }
}
