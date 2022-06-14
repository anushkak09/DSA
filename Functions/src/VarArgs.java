import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        VarArgs(2,3,4,5,6,8,9,10);
    }
    static void VarArgs(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
