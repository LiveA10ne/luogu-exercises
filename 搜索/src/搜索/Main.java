package 搜索;

import java.util.*;

public class Main { 
	
	private static int[] s = new int[5];
	
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
			s[i] = sc.nextInt();
		}
        int[] a1=new int[s[1]];
        int[] a2=new int[s[2]];
        int[] a3=new int[s[3]];
        int[] a4=new int[s[4]];
        for(int i=0;i<s[1];i++)
            a1[i]=sc.nextInt();
        for(int i=0;i<s[2];i++)
            a2[i]=sc.nextInt();
        for(int i=0;i<s[3];i++)
            a3[i]=sc.nextInt();
        for(int i=0;i<s[4];i++)
            a4[i]=sc.nextInt();
        System.out.println(f(a1)+f(a2)+f(a3)+f(a4));
        sc.close();
    }
    public static int f(int[] a){
        int n=a.length;
        if(n==1)
            return a[0];
        if(n==2)
            return Math.max(a[0],a[1]);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
            
        int v=sum/2;
        int[] dp=new int[v+1];
        for(int i=0;i<n;i++)
            for(int j=v;j>=a[i];j--)
                dp[j]=Math.max(dp[j],dp[j-a[i]]+a[i]);
        return Math.max(dp[v],sum-dp[v]);
    }
}
