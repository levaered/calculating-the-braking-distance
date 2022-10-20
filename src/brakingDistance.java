import java.util.Scanner;

public class brakingDistance {
    Scanner in = new Scanner(System.in);
    int brakingFactor = 1;
    double s;
    public void brakingDistance(int carSpeed, int roadCondotion, int typeOfRoadSurface){
        if(roadCondotion == 1){
            switch (typeOfRoadSurface){
                case 1:
                    s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.8);
                    break;
                case 2:
                    s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.7);
                    break;
                case 3:
                    s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.7);
                    break;
                case 4:
                    s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.6);
                    break;
                case 5:
                    s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.55);
                    break;
            }
        }
        if(roadCondotion == 2){
            switch (typeOfRoadSurface){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
            }
        }
    }
}
