public class task1_8 {
    public static void main(String[] args){
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++){
                if (a==b){
                    continue;
                }
                for (int c = 1; c <= 9; c++){
                    if (c==a || c==b){
                        continue;
                    }
                    int nimetaja = 10*a+b;
                    int lugeja = 10*b+c;
                    if (nimetaja*c == lugeja*a){
                        System.out.println(nimetaja + "/" + lugeja);
                    }
                }
            }
        }
    }

}
