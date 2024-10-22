public class Singer extends Person {

    private String brandName;
    private String singing;
    private String playGitar;

    public Singer() {
    }

    public Singer(String name, String designation, String brandName, String learn, String walk, String eat,  String singing, String playGitar) {
        super(name, designation, learn, walk, eat);
        this.brandName = brandName;
        this.singing = singing;
        this.playGitar = playGitar;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSinging() {
        return singing;
    }

    public void setSinging(String singing) {
        this.singing = singing;
    }

    public String getPlayGitar() {
        return playGitar;
    }

    public void setPlayGitar(String playGitar) {
        this.playGitar = playGitar;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nBrand name: " + brandName +
                "\nSinging: " + singing +
                "\nPlay gitar: " + playGitar;
    }
}
