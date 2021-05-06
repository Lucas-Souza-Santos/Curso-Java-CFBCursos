public class App {
    public static void main(String[] args){
        
        // loop for
        for(int i = 0; i < 4; i++)
        {
            System.out.println("i = " + i);
        }
        // loop while
        int cont = 0;
        while(cont < 5)
        {
            System.out.println("cont = " + cont);
            cont++;
        }
        int num = 0;
        do
        {
            System.out.println(num);
            num++;
        }
        while(num < 10);
    }
}
