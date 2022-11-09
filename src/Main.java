import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        brakingDistance brakingDistance = new brakingDistance();
        double s = 0;
        System.out.println("Введите скорость автомобиля: ");
        if(in.hasNextInt()){
            int carSpeed = in.nextInt();
            System.out.println("Введите состояние дорожного покрытия\n(1) - сухая\n(2) - мокрая\nEnter: ");
            if(in.hasNextInt()) {
                int roadCondotion = in.nextInt();
                System.out.println("Выберите тип шин\n1 - летние\n2 - зимние\nEnter: ");
                if(in.hasNextInt()){
                    int tireType = in.nextInt();
                    if(tireType > 0 && tireType < 3 ){
                        if(roadCondotion == 1){
                            System.out.println("Выбирите дорожное покрытие");
                            System.out.println("1. Асфальт, бетон");
                            System.out.println("2. Песчаная дорога");
                            System.out.println("3. Щебеночное покрытие");
                            System.out.println("4. Грунтовая дорога");
                            System.out.println("5. Булыжник и брусчатка");
                            System.out.println("Enter");
                            if(in.hasNextInt()) {
                                int typeOfRoadSurface = in.nextInt();
                                s = brakingDistance.brakingDistance(carSpeed, 1, typeOfRoadSurface, tireType);
                                System.out.println("Тормозной путь: " + s);
                            }
                            else{
                                System.out.println("ERROR");
                            }
                        }
                        else if(roadCondotion == 2){
                            System.out.println("Выбирите дорожное покрытие");
                            System.out.println("1. Асфальт, бетон");
                            System.out.println("2. Песчаная дорога");
                            System.out.println("3. Щебеночное покрытие");
                            System.out.println("4. Грунтовая дорога");
                            System.out.println("5. Дорога, покрытая снегом");
                            System.out.println("6. Снежная укатанная дорога");
                            System.out.println("7. Гололед");
                            System.out.println("Enter");
                            if(in.hasNextInt()){
                                int typeOfRoadSurface = in.nextInt();
                                s = brakingDistance.brakingDistance(carSpeed, 2, typeOfRoadSurface, tireType);
                                System.out.println("Тормозной путь: " + s);
                            }
                            else{
                                System.out.println("ERROR");
                            }
                        }
                        else{
                            System.out.println("ERROR");
                        }
                    }
                    else{
                        System.out.println("ERROR");
                    }
                }
                else{
                    System.out.println("ERROR");
                }
            }
            else{
                System.out.println("ERROR");
            }
        }
        else{
            System.out.println("ERROR");
        }
    }
}