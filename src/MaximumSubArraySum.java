public class MaximumSubArraySum {

    static int findMaxSubArraySum(int input1, int [] input2) {

        int sum = input2[0];
        int maxSum = input2[0];

        for(int i = 1; i < input2.length; i++) {

            if(sum < 0) {
                sum = input2[i];
            } else {
                sum = sum + input2[i];
            }
        }
        return maxSum = Math.max(sum, maxSum);


    }
}
