public class SumOfNaturalNos {
    public static void main(String[] args) {
        int n=10;
        System.out.println(sum(n));
    }

    private static int sum(int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        return sum;
        //OR USE n*(n-1)/2
    }

}
