public class task2_3 {
    static void masiivi_l(int[] masiiv){
        for (int i = 0, j = masiiv.length-1; i < j; i++, j--) {
            System.out.print(masiiv[i] + " ");
            System.out.print(masiiv[j] + " ");
        }
        if (masiiv.length % 2 == 1){
            System.out.println(masiiv[masiiv.length/2]);
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        masiivi_l(a);
    }
}
