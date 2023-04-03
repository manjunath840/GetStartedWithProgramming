package Programming;

public class BiggestOfNumber {
    public static void main(String[] args) {

        int[] arr= {1, 33, 44, 9, 55};

        int maxNumber= findMax(arr);

        System.out.println(maxNumber);
    }

    public static int findMax(int[] arr){

       int max= arr[0];

       for (int i=1; i< arr.length; i++){

           if (arr[i]> max){

               max= arr[i];
           }
       }

       return max;

    }

}
