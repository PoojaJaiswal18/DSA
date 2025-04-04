package Recursion;

//characterwise check;

public class LexicalOrder {

    public static void lexicalOrder(int range,int result){

        if(result>range){
            return;
        }
        System.out.println(result);

        int i=(result==0?1:0);

        for (; i <=9 ; i++) {

            int next=(result*10)+i;

            lexicalOrder(range,next);

        }



    }

    public static void main(String[] args) {

        lexicalOrder(1000,0);



    }
}
