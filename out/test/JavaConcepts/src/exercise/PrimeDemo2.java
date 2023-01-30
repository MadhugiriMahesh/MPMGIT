package exercise;

public class PrimeDemo2 {

    public static void main(String[] args) {

       int i =5;
       boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " IS A PRIME NUMBER");
            }
            else {
                System.out.println(i + " IS NOT A PRIME NUMBER");
            }

        }
    }




