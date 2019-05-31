import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OldCar extends Car {

    private int actionDuration;

    public OldCar() {
    }

    public OldCar(int actionDuration) {
        this.actionDuration = actionDuration;
    }

    public OldCar(int id, String name, int numberPlate, int yearOfManufacture, String brand, boolean haveInsurance, int actionDuration) {
        super(id, name, numberPlate, yearOfManufacture, brand, haveInsurance);
        this.actionDuration = actionDuration;
    }

    public int getActionDuration() {
        return actionDuration;
    }

    public void setActionDuration(int actionDuration) {
        this.actionDuration = actionDuration;
    }

    @Override
    public String toString() {
        return "OldCar{" +
                "actionDuration=" + actionDuration +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", numberPlate=" + numberPlate +
                ", yearOfManufacture=" + yearOfManufacture +
                ", brand='" + brand + '\'' +
                ", haveInsurance=" + haveInsurance +
                '}';
    }

}
