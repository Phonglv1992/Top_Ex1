public class InsurancePackage {

    private  int id;

    private  String name;

    private  String packageType;

    private int carType;

    public InsurancePackage() {
    }

    public InsurancePackage(int id, String name, String packageType, int carType) {
        this.id = id;
        this.name = name;
        this.packageType = packageType;
        this.carType = carType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public int getCarType() {
        return carType;
    }

    public void setCarType(int carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "InsurancePackage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", packageType=" + packageType +
                ", carType=" + carType +
                '}';
    }
}
