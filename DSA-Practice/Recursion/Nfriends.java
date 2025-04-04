public class Nfriends {

    public static int choice(int numOfPeople) {

        if(numOfPeople==1){
            return 1;
        }

        else if(numOfPeople==2){
            return 2;
        }

        else if (numOfPeople==0) {

            return 0;

        }


        int ch1=choice(numOfPeople-1);
        int ch2=(numOfPeople-1)*choice(numOfPeople-2);

        return ch1+ch2;

    }
    public static void main(String[] args) {

        System.out.println(choice(2));


    }
}
