// Задание по перестановке последней цифры числа в начало
// решение 1 в методе task в среднем 24-25 миллисекунд на 1000000 итераций

public class Main{
    public static int task(int num){
        int last_num = num % 10;  // возвращает последнюю цифру
        int reset = num / 10;  // число без последней цифры
        int digit = (int)(Math.log10(reset)) + 1;  // количество цифр в числе
        int new_num = last_num * ((int)(Math.pow(10, digit))) + reset;  // redundant что это значит

        return new_num;
    }
    public static void main(){
        long sum = 0;
        long start = System.nanoTime();
        for (int i=0; i < 1000000; i++){
            sum += task(12759);
        }
        long finish = System.nanoTime();
        System.out.println(sum);
        long diff = finish - start;
        long time = (long)(diff * 0.000001);
        System.out.println(time + " милисекунд");
    }
}
