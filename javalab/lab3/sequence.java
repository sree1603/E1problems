public class sequence {
    
    public static int findLongestPositiveSequenceSum(int[] arr) {
        int maxLength = 0;
        int currentLength = 0;
        int sum = 0;
        int arr1[]=new int[100];
        int i=0;
        for (int num : arr) {
            if (num > 0) {
                currentLength++;
                sum += num;
            } else {
                arr1[i]=sum;
                i++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }

                currentLength = 0;
                sum = 0;
            }
        }
        
        //Check if the longest sequence is at the end of the array
        if (currentLength > maxLength) {
            maxLength = currentLength;
        }
        
        int max=0;
        for(int k=0;k<arr1.length;k++){
            if(arr1[k]>max){
                max=arr1[k];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,-1,-2,1};
        int sum = findLongestPositiveSequenceSum(arr);
        System.out.println("Sum of the longest sequence of positive integers: " + sum);
    }
}

