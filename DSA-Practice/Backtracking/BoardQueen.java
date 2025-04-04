//package Backtracking;
//
//public class BoardQueen {
//
//
//    public static void combinationOfSeats(int queens,boolean[]seats1,String ans1,int QueenNum,int seatNum ){
//
//        if(queens==0){
//            System.out.println(ans1);
//            return;
//        }
//
//        for(int i=seatNum+1;i<seats1.length;i++){
//
//            if(seats1[i]==false){
//
//                seats1[i]=true;
//                combinationOfSeats(queens-1,seats1,ans1+"S"+seatNum+"Q"+QueenNum+" ",QueenNum+1,seatNum+1);
//                seats1[i]=false;
//
//            }
//
//
//    }
//
////permutation
//    public static void printSeat(int Queens,boolean[]seats,String ans,int num){
//
//        if(Queens==0){
//            System.out.println(ans);
//            return;
//        }
//
//        for(int i=0;i<seats.length;i++){
//
//            if(seats[i]==false){
//
//                seats[i]=true;
//                printSeat(Queens-1,seats,ans+"S"+i+"Q"+num+" ",num+1);
//                seats[i]=false;
//
//            }
//
//
//
//        }
//
//
//
//    }
//
//    public static void main(String[] args) {
//
//        boolean []arr=new boolean[4];
//
//        printSeat(2,arr,"",0);
//
//        combinationOfSeats(2,arr,"",);
//
//
//    }
//
//}
