import java.util.*;

public class Exercise08AppendLetter {

  public static void main(String... args) {
    List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");

    // Create a method called "appendA()" that adds "a" to every string in the "far" list.
    // The parameter should be a list.

    System.out.println(appendA(far));
  }

  public static List<String> appendA (List<String> nimals){

    for (int i = 0; i < nimals.size(); i++){
      nimals.set(i, (nimals.get(i) + "a"));
    }
    return nimals;
  }
}
