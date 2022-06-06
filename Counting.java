public class Counting {
    public static void main(String[] args) {
        int num= 324_543_763;
        int count=0;
        while(num>0){
            int rem=num%10;
           num= num/10;
            if (rem==3) count += 1;
        }
        System.out.println("Occurences:"+count);
    }
}
