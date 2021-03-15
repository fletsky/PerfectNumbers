import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        for (int i = 33550000; i < 40000000; i++) {
            if (checkPerfection(i)){
                System.out.println(i);
            }
        }

    }

    //Create ArrayList of divisors of a number.
    static ArrayList<Integer> divisors(int a){
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i < a; i++) {
            if(a%i == 0){
                result.add(i);
            }
        }
        return result;
    }

    static boolean checkPerfection(int a){
        ArrayList<Integer> divisors = divisors(a);
        int divisorsSum =0;

        for (Integer divisor : divisors){
            divisorsSum = divisorsSum + divisor;
        }
        return divisorsSum == a;
    }

}
