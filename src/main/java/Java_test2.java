public class Java_test2 {

    public static void main(String[] args){
        int y = 4568;

        System.out.println(sumLastNums(y));

    }

    public static int sumLastNums(int x) {
        int var1= 4568%10;
        int var2= (4568/10)%10;
        x = var1 + var2;
        return x;
    }
}
