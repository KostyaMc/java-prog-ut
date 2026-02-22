public class task2_4 {

    static void task(int[] masiiv){
        for (int i = 0; i < masiiv.length; i++) {
            int praegune = masiiv[i];
            if (praegune % 2 == 0){
                int ajutineindeks = i;
                int eelmine = (ajutineindeks != 0) ? masiiv[ajutineindeks-1] : 2;
                while (eelmine % 2 == 1){
                    int temp = masiiv[ajutineindeks - 1];
                    masiiv[ajutineindeks-1] = masiiv[ajutineindeks];
                    masiiv[ajutineindeks] = temp;
                    ajutineindeks--;
                    eelmine = (ajutineindeks != 0) ? masiiv[ajutineindeks-1] : 1;
                }
            }
        }
    }

    public static void main(){

    }
}
