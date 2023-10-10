import java.util.*;
                                // Java Task-1
public class Shuffle
{
    public static void main(String[] args) 
    {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};

        List<Integer> l = new ArrayList<>(Arrays.asList(arr));
        Collections.shuffle(l);
        Integer[] shuffledArray = l.toArray(new Integer[0]);
        System.out.println("Shuffled Array: " + Arrays.toString(shuffledArray));

    }
}
