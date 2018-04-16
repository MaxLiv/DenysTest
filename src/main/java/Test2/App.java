package Test2;

public class App{

    public static void main (String[] args) {
        int arr[] = {1, 2, 3, 4};
        print(arr);
        reverse(arr, 0, arr.length-1);
        print(arr);
    }

    static void reverse(int arr[], int start, int end){
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start+1, end-1);
    }

    static void print(int arr[]){
        for (int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
