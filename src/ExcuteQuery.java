import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcuteQuery {
    Connection connection = Connections.CreateConnect();

    public List<Car> getAllCar() {
        Connection connection = Connections.CreateConnect();
        List<Car> lstCar = new ArrayList<Car>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from CAR");
            while (resultSet.next()) {
                lstCar.add(new Car(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3),
                        resultSet.getInt(5), resultSet.getString(5), resultSet.getInt(6) == 1 ? true : false));
            }
            connection.close();
            return lstCar;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public List<OldCar> getOldCar() {
        List<OldCar> lstOldCar = new ArrayList<OldCar>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from CAR");
            while (resultSet.next()) {
                lstOldCar.add(new OldCar(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3),
                        resultSet.getInt(5), resultSet.getString(5), resultSet.getInt(6) == 1 ? true : false, resultSet.getInt(9)));
            }
            connection.close();
            return lstOldCar;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<MediumCar> getMediumCar() {
        List<MediumCar> lstMediumCar = new ArrayList<MediumCar>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from CAR");
            while (resultSet.next()) {
                lstMediumCar.add(new MediumCar(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3),
                        resultSet.getInt(5), resultSet.getString(5), resultSet.getInt(6) == 1 ? true : false, resultSet.getInt(8) == 1 ? true : false));
            }
            connection.close();
            return lstMediumCar;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<ModernCar> getModernCar() {
        List<ModernCar> lstModernCar = new ArrayList<ModernCar>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from CAR");
            while (resultSet.next()) {
                lstModernCar.add(new ModernCar(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3),
                        resultSet.getInt(5), resultSet.getString(5), resultSet.getInt(6) == 1 ? true : false, resultSet.getInt(7) == 1 ? true : false));
            }
            connection.close();
            return lstModernCar;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
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
            int k=0;
            while(rs.next())
            {
                k++;
            }
            String name = "CAR" + Integer.toString(k+1);
            String insertDb = "INSERT INTO CAR(id,name,numberPlate,yearOfManufacture,brand,haveInsurance)"
                    + "VALUES('CAR_SEQ.nextval','" + name + "','" + numberPlate + "','" + yearOfManufacture + "','" + brand[br] + "','" + haveInsurance + "')";
            st.executeUpdate(insertDb);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<InsurancePackage> getInsurancePackage() {
        List<InsurancePackage> insurancePackages = new ArrayList<InsurancePackage>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from InsurancePackage");
            while (resultSet.next()) {
                insurancePackages.add(new InsurancePackage(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getString(3), resultSet.getInt(4)));
            }
            connection.close();
            return insurancePackages;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
