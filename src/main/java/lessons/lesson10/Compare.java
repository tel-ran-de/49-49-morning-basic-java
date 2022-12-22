package lessons.lesson10;

public class Compare {

    public double greatestValue(double value1, double value2){
        if (value1 > value2) {
            return value1;
        }  else {
            return value2;
        }
    }

    public double smallestValue(double value1, double value2){
        if (value1 < value2) {
            return value1;
        }  else {
            return value2;
        }
    }

    public boolean isEqual(double value1, double value2){
        if (value1 == value2) {
            return true;
        }  else {
            return false;
        }
    }
}
