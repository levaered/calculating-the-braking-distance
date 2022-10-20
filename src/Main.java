import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        brakingDistance brakingDistance = new brakingDistance();
        double s = 0;
        System.out.println("Введите скорость автомобиля: ");
        int carSpeed = in.nextInt();
        System.out.println("Введите состояние дорожного покрытия\n(1) - сухая\n(2) - мокрая\nEnter: ");
        int roadCondotion = in.nextInt();
        if(roadCondotion == 1){
            System.out.println("Выбирите дорожное покрытие");
            System.out.println("1. Асфальт, бетон");
            System.out.println("2. Песчаная дорога");
            System.out.println("3. Щебеночное покрытие");
            System.out.println("4. Грунтовая дорога");
            System.out.println("5. Булыжник и брусчатка");
            System.out.println("Enter");
            int typeOfRoadSurface = in.nextInt();
            s = brakingDistance.brakingDistance(carSpeed, 1, typeOfRoadSurface);
        }
        if(roadCondotion == 2){
            System.out.println("Выбирите дорожное покрытие");
            System.out.println("1. Асфальт, бетон");
            System.out.println("2. Песчаная дорога");
            System.out.println("3. Щебеночное покрытие");
            System.out.println("4. Грунтовая дорога");
            System.out.println("5. Дорога, покрытая снегом");
            System.out.println("6. Снежная укатанная дорога");
            System.out.println("7. Гололед");
            System.out.println("Enter");
            int typeOfRoadSurface = in.nextInt();
            s = brakingDistance.brakingDistance(carSpeed, 1, typeOfRoadSurface);
        }
        System.out.println(s);
    }
}