import java.util.Scanner;

public class Test {



    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type a number between 0 and 999:  ");
        number = scanner.nextInt();
        while(number>=0){
            if(number>=0 && number<=999){
                if(number==0){
                    System.out.print("ZERO");
                } else {
                    numberToWord(((number / 100) % 10), " HUNDRED");
                    numberToWord((number % 100), " ");
                }

            } else{
                System.out.print("out of ability");
            }
            System.out.print("\nPlease type a number between 0 and 999:  ");
            number = scanner.nextInt();
        }
    }

    public static void numberToWord(int num, String val) {
        String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"
        };
        String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
        if (num > 19) {
            System.out.print(tens[num / 10] + " " + ones[num % 10]);
        } else {
            System.out.print(ones[num]);
        }
        if (num > 0) {
            System.out.print(val);
        }
    }
}