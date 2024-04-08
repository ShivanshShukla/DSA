package Dummy;

public class A {

    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if((i==j)|| (i+j==2)){
                    System.out.print("#");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}