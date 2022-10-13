import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban muon nhap bao nhieu phan tu");
        int longArr = Integer.parseInt(scanner.nextLine());
        int[] arrInt = new int[longArr];
        int[] arrIntNew = new int[arrInt.length];
        for (int i = 0; i < longArr; i++) {
            System.out.printf("Nhap phan tu thu %d ", i + 1);
            arrInt[i] = Integer.parseInt(scanner.nextLine());

        }

        Arrays.sort(arrInt);
        arrIntNew = arrInt;
        System.out.println("Mang co dang:");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrIntNew[i] + "\t");
        }
        System.out.println("\n");
        System.out.println("Nhap gia tri ban muon tim");
        int  key = Integer.parseInt(scanner.nextLine());
        if (binaryTree(arrIntNew,key)!=-1){
            System.out.printf(" Phan tu %d can tim co chi so la:%d ",key,binaryTree(arrIntNew,key));
        }else {
            System.out.printf("Khong tim thay so co gia tri la %d",key);
        }
    }

    public static int binaryTree(int[] arrInt, int key) {
        int low = 0;
        int high = arrInt.length-1;
        System.out.print("\n");
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arrInt[mid] == key) {
                return mid;
            } else if (arrInt[mid] > key) {
                high = mid - 1;
            } else if (arrInt[mid] < key) {
                low = mid + 1;
            }
        }

        return -1;
    }
}