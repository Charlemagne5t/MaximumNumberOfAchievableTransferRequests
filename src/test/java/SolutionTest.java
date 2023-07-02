import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void maximumRequestsTest1() {
        int n = 5;
        int[][] requests = {
                {0, 1},
                {1, 0},
                {0, 1},
                {1, 2},
                {2, 0},
                {3, 4}
        };
        int expected = 5;
        int actual = new Solution().maximumRequests(n, requests);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maximumRequestsTest2() {
        int n = 3;
        int[][] requests = {
                {0, 0},
                {1, 2},
                {2, 1},
        };
        int expected = 3;
        int actual = new Solution().maximumRequests(n, requests);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maximumRequestsTest3() {
        int n = 3;
        int[][] requests = {
                {0, 3},
                {3, 1},
                {1, 2},
                {2, 0}
        };
        int expected = 4;
        int actual = new Solution().maximumRequests(n, requests);
        Assertions.assertEquals(expected, actual);
    }

}
