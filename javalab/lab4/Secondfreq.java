import java.util.*;
public class Secondfreq{
    public static void main(String args[]){
        String S;
        int freq[]=new int[100];
        int count=0,l,max=0,min=0;
        Scanner s=new Scanner(System.in);
        System.out.printf("enter a string ");
        S=s.next();
        String uni="";
        char char_arr[]=S.toCharArray();
        l=char_arr.length;
        for(int k=0;k<l;k++){
            String ch=Character.toString(char_arr[k]);
           if(!(uni.contains(ch)))
           uni=uni+char_arr[k];
        }      
       for(int i=0;i<uni.length();i++){
            count=0;
            for(int j=0; j<l;j++){
            if(uni.charAt(i)==char_arr[j])
                count++;
            }
            freq[i]=count;
            }
            for(int y=0;y<uni.length();y++){
                if(freq[y]>max){
                    min=max;
                    max=freq[y];
                }
                else if(freq[y]>min){
                    if(freq[y]==max)
                        continue;
                    min=freq[y];
                }
        }
        if(min!=0){
        System.out.printf("The second frequent character in %s is/are:%d ",S);           
        for(int a=0;a<uni.length();a++){
            if(freq[a]==min)
                System.out.print(uni.charAt(a));
        }
        }
        else
            System.out.print("no Second frequent character");
        s.close();
    }
}
