import java.util.Scanner;

public class SumOfSubArraySum {
    static int findSumOfSubArraySum(int[] A){
        int prefixSum[] = new int[A.length];
        int sum = 0, result = 0;
        for(int i = 0; i <A.length; i++){
            sum += A[i];
            prefixSum[i] = sum;
        }
        for(int L = 0; L < A.length; L++){
            for(int R = L; R < A.length; R++){
                if(L == 0){
                    result += prefixSum[R];
                }else{
                    result += prefixSum[R] - prefixSum[L - 1];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array size: ");
        int N = scanner.nextInt();
        int array[] = new int[N];
        System.out.print("Array elements: ");
        for(int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(findSumOfSubArraySum(array));
    }
}
