package cn.yasyx;

public class GasStation {

    public static void main(String[] args) {
        Solution solution = new Solution();
        //gas = [1,2,3,4,5], cost = [3,4,5,1,2]
        int[] gas = new int[] {1,2,3,4,5};
        int[] cost = new int[] {3,4,5,1,2};
        solution.canCompleteCircuit(gas,cost);
    }

   static class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int n = gas.length;
            int i = 0;
            while (i < n) {
                int sumOfGas = 0, sumOfCost = 0;
                int cnt = 0;
                while (cnt < n) {
                    int j = (i + cnt) % n;
                    sumOfGas += gas[j];
                    sumOfCost += cost[j];
                    if (sumOfCost > sumOfGas) {
                        break;
                    }
                    cnt++;
                }
                if (cnt == n) {
                    return i;
                } else {
                    i = i + cnt + 1;
                }
            }
            return -1;
        }
    }


}
