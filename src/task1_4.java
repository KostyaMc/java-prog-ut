public class task1_4 {
    public static int task4(int num){
        int summa = 0;
        for (int i = 1; i <= num; i++){
            summa = summa + i * ++i;
        }
        return summa;
    }

    public static void main(){
        // f(n) = 1 * 2 + 3 * 4 + 5 * 6 + ... + (n-1) * n
        int summa = task4(2022);
        System.out.println(summa);
    }
}
