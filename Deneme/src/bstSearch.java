public class bstSearch {
 
    public int binarySearch(int[] inputArr, int key) {
         
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
  
    public static void main(String[] args) {
         
    	bstSearch mbs = new bstSearch();
        //String[] arr = {"Alakazam","Balbasur","Charmander","Pikachu","Squirtle"};
        int[] arr= {1,2,3,14};
        System.out.println("Key 14's position: "+mbs.binarySearch(arr, 14));

    }
}