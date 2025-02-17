public class Programmer extends Person {
    private String companyName;
    private String coding;

    public Programmer() {
    }

    public Programmer(String name, String designation,  String companyName, String learn, String walk, String eat, String coding) {
        super(name, designation, learn, walk, eat);
        this.companyName = companyName;
        this.coding = coding;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCoding() {
        return coding;
    }

    public void setCoding(String coding) {
        this.coding = coding;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nCompany name: " + companyName +
                "\nCoding: " + coding ;
    }
}
