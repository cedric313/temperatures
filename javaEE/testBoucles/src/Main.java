
public class Main {

    public static void main(String[] args)  {

//        si le nombre est divisible par 3 : on écrit Fizz
//        si le nombre est divisible par 5 : on écrit Buzz
//        si le nombre est divisible par 3 et par 5 : on écrit Fizzbuzz
//        sinon : on écrit le nombre

        fizBuz(15);

    }

    public static void fizBuz(int number) {

        if(number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if(number % 5 == 0) {
            System.out.println("Buzz");
        } else if (number % 3 == 0 ) {
            System.out.println("Fizz");
        }
    }
}

