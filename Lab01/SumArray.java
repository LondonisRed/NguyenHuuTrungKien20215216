package Lab01;

public class SumArray {
    
    static void sortingarray(int array[]){
        int i,j;
        int temp;
        for(i = 0; i < array.length; i++){
            for(j = i+1; j<array.length;j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp; 
                }
            }
        }
        System.out.print("The array after sorted is:\n");
        for(int k : array){
            System.out.print(k + " ");
        }
        System.out.print('\n');
        sumarray(array);
    }
    static void sumarray(int array[]){
        int i;
        int sum = 0;
        for(i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.print("\nSum of all index of the array is: " + sum);
    }
    public static void main(String[] args){
        int arr[] = {2,3,5,6,1,4};
        sortingarray(arr);
    }
}