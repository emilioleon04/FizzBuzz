public class ConsoleBasedFizzBuzz implements FizzBuzz {
    
    public ConsoleBasedFizzBuzz() {
    }

    @Override
    public void print(int from, int to) {
    while (to >= from) {
        if (from % 15 == 0) {
            System.out.println("FizzBuzz" + " " + from);
        } else if (from % 3  == 0 ) {
            System.out.println("Fizz" + " " + from);
        } else if (from % 5== 0) {
            System.out.println("Buzz" + " "+ from);
        }
        from++;
        }
    }
}