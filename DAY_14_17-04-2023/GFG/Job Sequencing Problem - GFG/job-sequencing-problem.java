//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum profit and the number of jobs done.
   int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        //Sort the array of jobs based on their deadlines in non-decreasing order.
        Arrays.sort(arr, (a, b) -> a.deadline - b.deadline);
        //Initialize an empty min-heap (priority queue) to keep track 
       // of the jobs that can be completed before their deadlines.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            // If the current job's deadline is equal to the number of jobs currently in the priority
            //queue, and if its profit is greater than the minimum profit in the queue, 
            //remove the job with the minimum profit from the queue and add the current 
            //job to the queue.
            if(arr[i].deadline==pq.size() && pq.peek()<arr[i].profit){
                pq.poll();
                pq.add(arr[i].profit);
                //If the current job's deadline is greater than
                //the number of jobs in the queue, simply add the job to the queue.
            }else if(arr[i].deadline>pq.size()){
                pq.add(arr[i].profit);
            }
        }
        int ans=0;
        int m=pq.size();
        //After adding all the jobs to the queue, calculate the maximum profit by summing up 
        //the profits of all the jobs in the queue.
        while(!pq.isEmpty()){
            ans += pq.poll();
        }
        //Calculate the number of jobs in the queue, which gives us the count of jobs done.
        //Return an array containing the count of jobs done and maximum profit.
        return new int[]{m, ans};
    }
}