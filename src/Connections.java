import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Connections {
    public static Connection CreateConnect(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection  connection = DriverManager.getConnection
                    ("jdbc:oracle:thin:@localhost:1521:orcl", "books_admin", "123456");
            return  connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
//        List<Car> list=new ArrayList<Car>();
//        statement=connection.createStatement();
//        resultSet=statement.executeQuery("SELECT * FROM car");
//        System.out.println("\t\t\t\t"+"ID" + "\t" +"Bien so" +"\t"+"Nam SX"+"\t"
//        +"Hang SX"+"\t"+"BH"+"\t" +"Dinh vi"+"\t"+"Tay lai tro luc"+"\t"+"Luu Hanh");
//        System.out.println("\t\t\t"+"--------------------------------------------------------------------------");

//        while (resultSet.next())
//        {
//            Car car=new Car(resultSet.getInt(1),resultSet.getInt(2),resultSet.getInt(3)
//                    ,resultSet.getString(4),resultSet.getInt(5),resultSet.getInt(6),
//                    resultSet.getInt(7),resultSet.getInt(8));
//            list.add(new Car(resultSet.getInt(1),resultSet.getInt(2),resultSet.getInt(3)
//                    ,resultSet.getString(4),resultSet.getInt(5),resultSet.getInt(6),
//                    resultSet.getInt(7),resultSet.getInt(8)));

//            System.out.print("\t\t\t\t"+resultSet.getString("ID") + "\t");
//            System.out.print(resultSet.getString("NUMBER_PLATE") + "\t");
//            System.out.print(resultSet.getString("YEAR_OF_MANUFACTURE") + "\t");
//            System.out.print(resultSet.getString("BRAND") + "\t");
//            System.out.print(resultSet.getString("HAVE_INSURANCE") + "\t  ");
//            System.out.print(resultSet.getString("HAVE_POSITIONING_DIVICE") + "\t\t\t");
//            System.out.print(resultSet.getString("HAVE_POWER_STEERING") + "\t\t\t\t");
//            System.out.print(resultSet.getString("ACTION_DURATION") + "\t\t");
//            System.out.println();
   //     }
//        for(Car car:list){
//            //System.out.println(car.toString());
//            if(car.getHaveInsurance()==1){
//
//            }
//
//        }
//        Random rand = new Random();
//
//// nextInt as provided by Random is exclusive of the top value so you need to add 1
//
//        int randomNum = rand.nextInt((2012 - 1980) + 1) + 1980;
//        int randomNum1 = rand.nextInt((2 - 0) + 0) + 0;
//        System.out.println(randomNum);
//        String[] s =new String[] {"a", "b", "c"};
//        System.out.println(s[randomNum1]);
//        connection.close();

    }

}
