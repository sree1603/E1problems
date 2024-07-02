public class Happynum {
    public static void main(String args[]){
        int n=1; 
        int count=0;
        System.out.print("first 10 happy numbers are : ");
        while(count<10){
            int num=n;
            while(num!=1 && num!=4){
                int sum=0;
                while(num>0){
                int r=num%10;
                sum+=(r*r);
                num/=10;
                }
                num=sum;
            }
            if(num==1){
                System.out.print(n+" ");
                count++;
            }
            n++;
        }
    }
}
