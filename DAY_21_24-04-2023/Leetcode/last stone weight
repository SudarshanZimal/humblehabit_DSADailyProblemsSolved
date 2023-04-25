class Solution {
    public int lastStoneWeight(int[] stones) {
        // Arrays.sort(stones);
        int n = stones.length;
        // ArrayList<Integer>  list = new ArrayList<>();
        // int i = 0;
        // while(i --> stones.length){
        //     list.add(stones[i]);
        //     i++;
        // }
        // while(list.hasNext()){
        //     if(stones[n-2] <= stones[n-1]){
        //         list.remove(stones[n-2])
        //     }
        // }
        // int element = list.get(n-2);
        //  int element1 = list.get(n-1);
        // int k 
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
       //then add into the elemetn into the maxheap
        for( int add: stones){
            maxHeap.offer(add);
        }
        while(maxHeap.size() != 1){
           int small = maxHeap.poll();
            int large = maxHeap.poll();
            maxHeap.offer(Math.abs(small - large));
        }
        return maxHeap.poll();
        
        
    }
}
