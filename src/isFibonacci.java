public class isFibonacci {
    public static void main(String[] args) {
        int i=1 ,start = 0,end=1,num = 5;
        System.out.print(0);
        while(i<=num){
            int nextTerm = start + end;//1
            start = end ;//1
            end = nextTerm;
            i++;

            System.out.print(" "+nextTerm);
        }

    }
}
