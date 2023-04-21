import java.util.*;
class minimise_height{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int [4];
        int n=4;
        System.out.println("Enter the array :");
        for(int i=0;i<4;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<3;j++){
            for(int i=j+1;i<4;i++){
                if(a[i]<a[j]){
                int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        System.out.println("After sorted the array :");
        for(int i=0;i<4;i++){
            System.out.println(a[i]);
        }
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        int ans=a[n-1]-a[0];
        int smallest=a[0]+k;
        int largest=a[n-1]-k;
        int mi,ma;
        for(int i=0;i<n-1;i++){
            mi=Math.min(smallest,a[i+1]-k);
            ma=Math.max(largest,a[i]+k);
            if(mi<0)continue;
            ans=Math.min(ans,ma-mi);
        }
        System.out.println("Ans is "+ans);

    }
}