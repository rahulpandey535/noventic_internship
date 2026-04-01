public class Arr{

    public static void main(String[]args){
        int[] arr ={1,2,2,3,2,1,3,1,3};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i:arr){
            System.out.print(i);
        }
    }
}