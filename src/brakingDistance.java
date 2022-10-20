import java.util.Scanner;

public class brakingDistance {
    int brakingFactor = 1;
    double s;
    public  double brakingDistance(int carSpeed, int roadCondotion, int typeOfRoadSurface){
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
                    s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.55);
                    break;
                case 2:
                    s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.65);
                    break;
                case 3:
                    s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.5);
                    break;
                case 4:
                    s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.5);
                    break;
                case 5:
                    s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.4);
                    break;
                case 6:
                    s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.25);
                    break;
                case 7:
                    s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.25);
                    break;
            }
        }
        return s;
    }
}
