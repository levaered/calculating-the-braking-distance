import java.util.Scanner;

public class brakingDistance {
    int brakingFactor = 1;
    double s;
    public  double brakingDistance(int carSpeed, int roadCondotion, int typeOfRoadSurface, int tireType){
        if(roadCondotion == 1){
            if(tireType == 1){
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
            else{
                switch (typeOfRoadSurface){
                    case 1:
                        s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.8);
                        s = s - ((s / 100) * 4);
                        break;
                    case 2:
                        s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.7);
                        s = s - ((s / 100) * 4);
                        break;
                    case 3:
                        s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.7);
                        s = s - ((s / 100) * 4);
                        break;
                    case 4:
                        s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.6);
                        s = s - ((s / 100) * 4);
                        break;
                    case 5:
                        s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.55);
                        s = s - ((s / 100) * 4);
                        break;
                }
            }
        }
        if(roadCondotion == 2){
            if(tireType == 1){
                switch (typeOfRoadSurface){
                    case 1:
                        s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.55);
                        s = s + ((s / 100) * 6);
                        break;
                    case 2:
                        s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.65);
                        s = s + ((s / 100) * 6);
                        break;
                    case 3:
                        s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.5);
                        s = s + ((s / 100) * 6);
                        break;
                    case 4:
                        s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.5);
                        s = s + ((s / 100) * 6);
                        break;
                    case 5:
                        s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.4);
                        s = s + ((s / 100) * 6);
                        break;
                    case 6:
                        s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.25);
                        s = s + ((s / 100) * 6);
                        break;
                    case 7:
                        s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.25);
                        s = s + ((s / 100) * 8);
                        break;
                }
            }else{
                switch (typeOfRoadSurface){
                    case 1:
                        s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.55);
                        s = s + ((s / 100) * 2);
                        break;
                    case 2:
                        s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.65);
                        s = s + ((s / 100) * 2);
                        break;
                    case 3:
                        s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.5);
                        s = s + ((s / 100) * 2);
                        break;
                    case 4:
                        s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.5);
                        s = s + ((s / 100) * 2);
                        break;
                    case 5:
                        s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.4);
                        s = s + ((s / 100) * 2);
                        break;
                    case 6:
                        s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.25);
                        s = s + ((s / 100) * 2);
                        break;
                    case 7:
                        s = (brakingFactor * (carSpeed * carSpeed)) / (254 * 0.25);
                        s = s + ((s / 100) * 4);
                        break;
                }
            }
        }
        return s;
    }
}
