public class PythagorasTriplet {
    public static void main(String[] args) {
        int a[]={12,45,7};//3,4,5 are triplets
        int arr_size= a.length;
        if(isTriplet(a,arr_size)==true){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    private static boolean isTriplet(int[] a, int n) {
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                for(int k=j+1;k<n;k++){
                    int x=a[i]*a[i],y=a[j]*a[j],z=a[k]*a[k];
                    if(x==y+z || y==x+z||z==x+y)
                        return true;
                }
        return false;
        }

}
