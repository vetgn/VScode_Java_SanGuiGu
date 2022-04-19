package src.Book2;
/**
 * 求出所有的水仙花数
 */
public class eleven {
    public static void main(String[] args) {
        int a,b,c;
        int num=0;
        for(int i=100;i<1000;i++){
            a=i/100;
            b=(i-a*100)/10;
            c=(i-a*100-b*10);
            if(Math.pow(a, 3)+Math.pow(b, 3)+ Math.pow(c,3)==i){
                System.out.print(i + " ");
                num++;
                if(num%5==0){
                System.out.println();
            }
            
            }
        }
    }
}
