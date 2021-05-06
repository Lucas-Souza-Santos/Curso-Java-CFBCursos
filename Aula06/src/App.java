import java.util.Arrays;

public class App {
    public static void main(String[] args){
        int[] num = new int[5];

        num[0] = 1;
        num[4] = 10;
        num[1] = 5;
        num[2] = 9;
        num[3] = 5;

        Arrays.sort(num);

        for (int i : num) {
            System.out.println("num = " + i);
        }

        

    }
}
