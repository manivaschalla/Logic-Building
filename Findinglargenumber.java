public class Findinglargenumber {
    public static void main(String args[]){
        int a = 10, b = 30, c = 50;
        if(a>b & a>c){
            System.out.println("Largest Number is : "+a);
        }else if(b>a & b>c){
            System.out.println("Largest Number is : "+b);
        }else{
            System.out.println("Largest Number is : "+c);
        }
    }
}
