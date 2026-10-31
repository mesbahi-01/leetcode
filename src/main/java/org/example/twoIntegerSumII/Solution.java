class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        // we will use two pointers
        // while pointer1 != pointer2
            // if their sum is equal to target we return poth pointers,
            // else if sum is greater than target we reduce the right pointer,
            // else we increment left pointer

        // we return an empty array if can't find both indexs

        int[] indexs = new int[2];


        int pointer1 = 0;
        int pointer2 = numbers.length - 1;

        while (pointer1 < pointer2) {
            int sum = numbers[pointer1] + numbers[pointer2];

            if (sum == target) {
                indexs[0] = pointer1;
                indexs[1] = pointer2;
                break;
            }else if (sum > target) {
                pointer2--;
            }else{
                pointer1++;
            }
        }
        return indexs;
    }
}
