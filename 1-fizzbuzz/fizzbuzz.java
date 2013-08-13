// Very first Java program
//
// By the influence of [@chao787](https://github.com/chao787/), I think i just need to learn something like this

// ArrayList seems to be a fancy guy here.
import java.util.ArrayList;

class FizzBuzz {
  public static void main(String[] args) {
    // strange syntax in java for me :P
    ArrayList<String> result = new ArrayList<String>();
    for(int x = 1; x < 101; x = x + 1) {
      String item = "";

      // maybe this is kind of stupid, no?
      if(x % 15 == 0) {
        item = "FizzBuzz";
      } else if (x % 3 == 0) {
        item = "Fizz";
      } else if (x % 5 == 0) {
        item = "Buzz";
      } else {
        // LOL, familar `toString()`
        item = new Integer(x).toString();
      }

      // in fact, i prefer `.push(item)` here rather than `add(item)`
      result.add(item);
    }

    // i know, i need a better way to test it, but how?
    for(int i = 0; i < 100; i = i + 1) {
      System.out.print(result.get(i) + ",");
    }
    System.out.println();

  }
}
