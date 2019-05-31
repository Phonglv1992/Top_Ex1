import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MediumCar extends Car {

    private boolean havePowerSteering;

    public MediumCar() {
    }

    public MediumCar(boolean havePowerSteering) {
        this.havePowerSteering = havePowerSteering;
    }

    public MediumCar(int id, String name, int numberPlate, int yearOfManufacture, String brand, boolean haveInsurance, boolean havePowerSteering) {
        super(id, name, numberPlate, yearOfManufacture, brand, haveInsurance);
        this.havePowerSteering = havePowerSteering;
    }

    public boolean isHavePowerSteering() {
        return havePowerSteering;
    }

    public void setHavePowerSteering(boolean havePowerSteering) {
        this.havePowerSteering = havePowerSteering;
    }

    @Override
    public String toString() {
        return "MediumCar{" +
                "havePowerSteering=" + havePowerSteering +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", numberPlate=" + numberPlate +
                ", yearOfManufacture=" + yearOfManufacture +
                ", brand='" + brand + '\'' +
                ", haveInsurance=" + haveInsurance +
                '}';
    }


}
