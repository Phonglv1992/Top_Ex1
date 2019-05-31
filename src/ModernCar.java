import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ModernCar extends Car {

    private boolean havePositioningDevie;

    public ModernCar(boolean havePositioningDevie) {
        this.havePositioningDevie = havePositioningDevie;
    }

    public ModernCar(int id, String name, int numberPlate, int yearOfManufacture, String brand, boolean haveInsurance, boolean havePositioningDevie) {
        super(id, name, numberPlate, yearOfManufacture, brand, haveInsurance);
        this.havePositioningDevie = havePositioningDevie;
    }

    public boolean isHavePositioningDevie() {
        return havePositioningDevie;
    }

    public void setHavePositioningDevie(boolean havePositioningDevie) {
        this.havePositioningDevie = havePositioningDevie;
    }

    @Override
    public String toString() {
        return "ModernCar{" +
                "havePositioningDevie=" + havePositioningDevie +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", numberPlate=" + numberPlate +
                ", yearOfManufacture=" + yearOfManufacture +
                ", brand='" + brand + '\'' +
                ", haveInsurance=" + haveInsurance +
                '}';
    }

    public void showCarInfo() {
        System.out.println(this.toString());
        Connection con = Connections.CreateConnect();
//        List<Car> carList = new ArrayList<Car>();
//        try {
//            Statement statement = con.createStatement();
//            ResultSet resultSet = statement.executeQuery
//                    ("SELECT name,numberPlate,yearOfManufacture,brand,haveInsurance,havePositioningDevie FROM CAR");
//            while (resultSet.next()) {
//                ModernCar modernCar = new ModernCar(resultSet.getInt(1), resultSet.getString(2),
//                        resultSet.getInt(3), resultSet.getInt(4), resultSet.getString(5)
//                        , resultSet.getInt(6), resultSet.getInt(7));
//                if (modernCar.yearOfManufacture >= 2005) {
//                    carList.add(modernCar);
//                } else break;
//            }
//            for (Car car : carList) {
//                System.out.println(car.toString());
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }
}
