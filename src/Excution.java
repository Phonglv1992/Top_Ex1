import java.util.List;
import java.util.Scanner;

public class Excution {
    public static void showAllCar() {
        ExcuteQuery excuteQuery=new ExcuteQuery();
        List<Car> lst = excuteQuery.getAllCar();
        Car car = new Car();
        car.showCarInfo(lst);
    }
    public static void addNewCar() {
        ExcuteQuery excuteQuery=new ExcuteQuery();
        excuteQuery.addNewCar();
    }
    public static void main(String[] args) {
        MediumCar mediumCar=new MediumCar();

        int chon;
        do {
            System.out.println("MOI BAN CHON CHUC NANG:");
            System.out.println("1. Thêm 10 xe vào db.");
            System.out.println("2. Hiển thị danh sách toàn bộ xe.");
            System.out.println("3. Thêm 10 gói bảo hiểm vào db");
            System.out.println("4. Mua bảo hiểm cho 1 xe");
            System.out.println("5. Thoát");
            Scanner input=new Scanner(System.in);
            chon=input.nextInt();
            switch(chon) {
                case 1:
                    ExcuteQuery excuteQuery=new ExcuteQuery();
                    excuteQuery.addNewCar();
                    break;
                case 2:
                    showAllCar();
                    break;
                case 3:
                    System.out.println();
                    break;
                case 7: break;
                default:
                    System.out.println("Mời bạn chọn lại");
            }
        }while (chon!=7);

    }
}
