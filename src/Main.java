import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int x,y;
        Scanner input = new Scanner(System.in);
        System.out.println("input length arr1");
        int[] arr1=nArr(1,input.nextInt());
        System.out.println("input length arr2");
        int[] arr2=nArr(2,input.nextInt());
        int[] arr3=new int[arr1.length+arr2.length];
        for (int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            arr3[arr1.length+i]=arr2[i];
        }
        for(int i:arr3){
            System.out.print(i+" ");
        }
    }
    public static int[] nArr(int index,int a){
        Scanner input = new Scanner(System.in);
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            System.out.print("input index " +i +" = ");
            arr[i]=input.nextInt();
        }
        return arr;
    }
}