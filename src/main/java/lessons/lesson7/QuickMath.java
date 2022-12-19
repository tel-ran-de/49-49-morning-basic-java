package lessons.lesson7;

public class QuickMath {
    public int sum (int x, int y){

        return (x+y);
    }

    public int minus (int x, int y){
        return (x-y);
    }

    public int result(int x, int y){
        int res1= sum(x,y);
        int res2= minus(x,y);
        int result = res1 * res2;
        return result;
        // return (sum(x,y)*minus(x,y))
    }
}
