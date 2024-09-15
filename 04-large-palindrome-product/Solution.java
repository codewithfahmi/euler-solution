import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
  public static void main(String[] args) {
    List<Integer> firstList = IntStream
        .range(1, 1000)
        .boxed().toList();
    List<Integer> secondList = IntStream
        .range(1, 1000)
        .boxed().toList().reversed();

    int result = Collections.max(
        firstList.stream()
            .flatMap(fst -> secondList.stream().map(scnd -> fst * scnd))
            .distinct()
            .sorted()
            .filter(item -> Integer.toString(item)
                .equals(String.join(
                    "",
                    Arrays.stream(Integer.toString(item).split(""))
                        .toList()
                        .reversed())))
            .toList());

    System.out.println(result);
  }
}