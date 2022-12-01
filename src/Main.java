import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        //loops
        //2 families
        //conditional - while loops
        //fixed loops - for loops
        //examples

        int value = 0;

        while (value <= 20){
            value++;
            out.println(value);
        }
        out.println("done");


        for (int index = 30;index > 15;index -= 4){
            out.println("pass through");
        }
    }
}