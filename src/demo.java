import java.util.Scanner;

public class demo {
    public static void swapArr(Scanner scanner){
        int c,i,n,k;
        System.out.println("Mời nhập số lượng phần tử trong mảng");
        n = scanner.nextInt();
        int arr[] = new int[n];
        for (i=0;i<n;i++){
            System.out.println("Mời nhập phần tử thứ "+(i+1));
            arr[i]= scanner.nextInt();
        }
        System.out.println("Mời nhập số k muốn tìm:");
        k = scanner.nextInt();
        for (i=0,c=0;i<n;i++){
            if(arr[i]!=k){
                arr[c]=arr[i];
                c++;
            }
        }
        n=c;
        for (i=0; i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        swapArr(scanner);
    }
}
