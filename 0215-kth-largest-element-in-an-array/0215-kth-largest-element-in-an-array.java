class Solution {
    public int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<k;i++) minHeap.offer(arr[i]);
        for(int i=k;i<arr.length;i++){
            if(arr[i]>minHeap.peek()){
                minHeap.poll();
                minHeap.offer(arr[i]);
            }
        }
        return minHeap.peek();
    }
}