import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String daysOfTheWeek [] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        float number = 14.5F;
        System.out.println(number);
        int i = (int)14.5F;
        int i1 = (int)number;
        System.out.println(i);

        int n = 2;       //++n ---> 3
        System.out.println(n++);//2
        System.out.println(n);//3
        // POSTincrement
        // ++n ---> PREincrement
        for (int j = 0; j < n; j++) {// i=0
            // some action         // i=1
        }

        for (int j = 0; j < 3; ++j) {
            System.out.println("Hello Cumali!");
        }

        System.out.println(4 != 20); //---> Condition (so it is boolean).
        System.out.println(1+2);

        // difference between multibranch if and nested if.
        // nested means that something is inside something.
        // multibranch ---> multiple separate conditions.

        if(true){
        }else if(false){
        } // multibranch

        if(true){ // opens

            if(false){ // this if condition is inside of another if.
            }

        } // closes

        // pregnant woman and the child inside --> nested person
        // not pregnant woman and her child --> they are family, so they are connected but not nested --> they are multibranch.

        System.out.println("==============");

        boolean a = true;
        boolean b = true;

        if(a){
            System.out.println(1);
            if(b){
                System.out.println(2);
            }
        }

        String browser = "internet explorer";
        switch(browser){
            case "chrome":
                System.out.println("opening google in chrome");
                break;
            case "firefox":
                System.out.println("opening google in firefox");
                break;
            case "safari":
                System.out.println("opening google safari");
                break;

            default:
                System.out.println("opening google in chrome");
        }







    }

}
