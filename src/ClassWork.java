public class ClassWork {

    public static void main(String []args) {
    int[] numbers= {23,13,34,32,23};
        for (int i = 0 ; i<numbers.length /2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];

            numbers[numbers.length - 1 - i] = temp;

        }
        for( int i = 0 ; i< numbers.length; i++)
            System.out.println(numbers[i]);
        }
    }
  //  public static void extramethod(int[] school){

  //  }


