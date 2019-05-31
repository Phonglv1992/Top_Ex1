import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Car {

    protected int id;

    protected String name;

    protected int numberPlate;

    protected int yearOfManufacture;

    protected String brand;

    protected boolean haveInsurance;

    public Car() {
    }

    public Car(int id, String name, int numberPlate, int yearOfManufacture, String brand, boolean haveInsurance) {
        this.id = id;
        this.name = name;
        this.numberPlate = numberPlate;
        this.yearOfManufacture = yearOfManufacture;
        this.brand = brand;
        this.haveInsurance = haveInsurance;
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

    public int getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(int numberPlate) {
        this.numberPlate = numberPlate;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isHaveInsurance() {
        return haveInsurance;
    }

    public void setHaveInsurance(boolean haveInsurance) {
        this.haveInsurance = haveInsurance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberPlate=" + numberPlate +
                ", yearOfManufacture=" + yearOfManufacture +
                ", brand='" + brand + '\'' +
                ", haveInsurance=" + haveInsurance +
                '}';
    }

    public void showCarInfo(List<Car> lst) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ban muon hien thi danh sach nhu nao: ?");
        System.out.println("1.Toan bo xe");
        System.out.println("2.Xe doi moi");
        System.out.println("3.Xe doi trung");
        System.out.println("4.Xe doi cu");
        int userOption = input.nextInt();
        for (Car car : lst) {
            System.out.println(car.toString());
        }
        switch (userOption) {
            case 1:
                System.out.println("Danh sanh toan bo xe");
                for (Car car : lst) {
                    System.out.println(car.toString());
                }
                break;
            case 2:
                System.out.println("Danh sach cac xe moi");
                for (Car car : lst) {
                    if (car.yearOfManufacture>=2005) {
                        System.out.println(car.toString());
                    }
                }
                break;
            case 3:
                System.out.println("Danh sach cac xe tam trung");
                for (Car car : lst) {
                    if (car.yearOfManufacture<=2004 && car.yearOfManufacture>=1996) {
                        System.out.println(car.toString());
                    }
                }
                break;
            case 4:
                System.out.println("Danh sach cac xe cu");
                for (Car car : lst) {
                    if (car.yearOfManufacture<=1995) {
                        System.out.println(car.toString());
                    }

                }
                break;
            default:
                System.out.println("Moi ban chon lai");
                break;
        }
    }

    public void addNewCar() {
        Connection connection = Connections.CreateConnect();
        String[] brand = new String[]{"TOYOTA", "BMW", "HUYNDAI"};
        Random random = new Random();
        int numberPlate = random.nextInt((99999 - 10000) + 1) + 10000;
        int yearOfManufacture = random.nextInt((2012 - 1980) + 1) + 1980;
        int br = random.nextInt((2 - 0) + 1) + 0;
        Boolean haveInsurance = random.nextBoolean();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from car");
            int k = rs.getRow();
            String name = "CAR" + Integer.toString(k);
            String insertDb = "INSERT INTO CAR(name,numberPlate,yearOfManufacture,brand,haveInsurance)"
                    + "VALUES(\'" + name + "\','" + numberPlate + "','" + yearOfManufacture + "','" + brand[br] + "','" + haveInsurance + "')";
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String packageTypeForCar(){

        if(this.yearOfManufacture>=2005){
            return "A";
        }else if (this.yearOfManufacture>=1995 && this.yearOfManufacture<=2004){
            return "B";
        }else
            return "C";
    }

    public void assignAssurance(InsurancePackage insurancePackage){
        if(this.isHaveInsurance()){
            System.out.println("Unavailable Buying");
       }
//        else if(this.packageTypeForCar().equals())
    }
}
