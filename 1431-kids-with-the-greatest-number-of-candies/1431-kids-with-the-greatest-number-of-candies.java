class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        //int max = 0;
           //Arrays.sort(candies);
           int max = 0;
          // for( int candy : candies){ 
             for( int i = 0 ; i < candies.length ; i++){  
               //Arrays.sort(candies);
        max = Math.max(max,candies[i]);
         //System.out.println(max);
           }
          // System.out.println(max);
        for( int i = 0 ; i < candies.length ; i++){
            //System.out.println(candy + extraCandies);
           if( candies[i]+ extraCandies >= max  ) 
                list.add(true)  ;
                
          else list.add (false);
        } 
        return list;
    }
}