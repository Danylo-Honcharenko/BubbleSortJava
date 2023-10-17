import com.algo.Bubble;
import org.junit.Assert;
import org.junit.Test;

public class Main {
    @Test
    public void bubble() {
        Bubble bubble = new Bubble(4);
        bubble.insert(178);
        bubble.insert(90);
        bubble.insert(150);
        bubble.insert(34);

        bubble.bubbleSorter();

        Integer[] expected = new Integer[]{34, 90, 150, 178};

        Assert.assertArrayEquals(expected, bubble.printArray());
    }
}
