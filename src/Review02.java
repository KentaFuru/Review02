
public class Review02 {

    public static void main(String[] args) {
        for(int integral_value = 1 ; integral_value <= 100 ; integral_value++) {
            if((integral_value % 3 == 0) && (integral_value % 5 == 0)) {
                System.out.println("FizzBuzz");
            }else if(integral_value % 3 == 0){
                System.out.println("Fizz");
            }else if(integral_value % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println( integral_value );
            }
        }
    }

}