import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //we make array of two numbers for storing result in this array we store the index of the element or the value of the element 
        int[] result = new int[2];
        //then we create hashmap for storing the value of the element or the index of the element 
        Map<Integer , Integer> add= new HashMap<Integer , Integer>();
        //after creating the hashmap we traverse the nums array for accesing the index of the element or the value of the element 
        //use for loop
        for( int i = 0 ; i < nums.length ; i++){
            //then we check the target sum is found in array or not
            //use hashmap methods.
            if(add.containsKey(target - nums[i])){
                result[1] = i;
                result[0] = add.get(target - nums[i]);
                return result;

            }
            add.put(nums[i] , i);
           
        } 
         return result;
    }
}