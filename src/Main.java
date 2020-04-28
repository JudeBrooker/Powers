public class Main {
    public static void main(String[] args){
        System.out.println(power(6, 4));
        System.out.println(power(12, 6));
        System.out.println(power(1.354, 3));
    }

    public static double power(double base, int exp){
        double total = base;
        for(int x=1;x<exp;x++){
            total *= base;
        }
        return total;
    }
}
