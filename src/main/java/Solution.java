public class Solution {
    public int maximumRequests(int n, int[][] requests) {

        int[] buildings = new int[n];
        int result = backtrack(requests, buildings, 0, 0);
        return Math.max(result, 0);
    }

    private int backtrack(int[][] requests, int[] buildings, int i, int changes) {
        if (i == requests.length) {
            for (int j = 0; j < buildings.length; j++) {
                if (buildings[j] != 0) {
                    return Integer.MIN_VALUE / 2;
                }
            }
            return changes;
        }

        int result = 0;

        int out = requests[i][0];
        int in = requests[i][1];
        buildings[out]--;
        buildings[in]++;
        int move = backtrack(requests, buildings, i + 1, changes + 1);
        buildings[out]++;
        buildings[in]--;

        int doNotMove = backtrack(requests, buildings, i + 1, changes);
        result = Math.max(move, doNotMove);

        return result;
    }
}