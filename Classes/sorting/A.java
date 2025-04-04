import javax.swing.tree.TreeNode;
import java.util.HashMap;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    public int[] findMode(TreeNode root) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int max=0;
        int []arr=new int[1];
        root = findMode(root.left);
        root = findMode(root.right);
        if(int map.contain(root.val)){
            int freq=map.get(root)+1;
            map.replace(root.val,freq);
            if(max<freq){
                max=freq;
            }

        }
        else{
            map.put(root.val,1);
            max=1;
        }
        arr[0]=max;




        return arr;




    }
}



package Classes.sorting;

import javax.swing.tree.Node;
import java.util.ArrayList;
import java.util.HashMap;

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

   class Node {
  int val;
  Node left;
  Node right;
  Node() {}
  Node(int val) { this.val = val; }
  Node(int val, Node left, Node right) {
  this.val = val;
  this.left = left;
  this.right = right;
  }
  }
 

class solution1 extends  Node {
    Node inorder(Node root) {
        HashMap <Integer, Integer> map = new   HashMap<>();
        root = inorder(root.left);
        root = inorder(root.right);
        if ( int map.)
        map.put(root.val, 1);
        return root;


    }
}
//
//public class A extends ListNode {
//    public boolean isPalindrome(ListNode head) {
//
//        ArrayList<Integer> arr = new ArrayList<>();
//
//        ListNode ptr = head;
//        int i = 0;
//        while (ptr.next != null) {
//            arr.add(ptr.val);
//            ptr = ptr.next;
//        }
//
//        int mid;
//
//        if (arr.size()%2==0){
//            mid=(arr.size())/2;
//        }
//        else {
//            mid=(int)((arr.size()/2)-0.5);
//        }
//
//
//        for ( i = 0; i<mid; i++){
//            for(int j=mid;j>0;j++){
//
//                if (arr.get(i)== arr.get(j)){
//                    return true;
//                }
//                else {
//                    return false;
//                }
//            }
//
//        }
//
//
//
//    }


//
//    public boolean isPalindrome(ListNode head) {
//
//        Stack<Integer> stack = new Stack<>( );
//        ListNode ptr=head;
//        while(ptr.next!=null){
//            stack.push( ptr.val);
//        }
//


//
//    }
//
//
//        public String reverseWords(String s) {
//
//            int n = s.length();
//            StringBuilder ans = new StringBuilder();
//
//            for (int i = n - 1; i >= 0; i--) {
//
//                if (s.charAt(i) == ' ') {
//                    for (int j = i + 1; j < n; j++) {
//                        ans.append(s.charAt(j));
//                    }
//                    n = i;
//                    ans.append(' ');
//                }
//            }
//
//            for (int i = 0; i < n; i++) {
//                ans.append(s.charAt(i));
//            }
//
//
//
//
//return  ans.toString();
//
//        }
//
//
//
//    //task scheduler
//    public int leastInterval(char[] tasks, int n) {
//        HashMap<Character,Integer> map=new HashMap<>();
//        for (int i = 0; i < tasks.length; i++) {
//            if(map.containsKey(tasks[i])){
//                int freq=map.get(tasks[i]);
//                map.replace(tasks[i],(freq+1));
//            }
//            else {
//                map.put(tasks[i],1);
//            }
//
//        }
//        int num, count=0;
//        for (int i = 0; i < map.size(); i++) {
//            if(map.size()<n){
//
//            }
//
//        }
//
//
//
//
//
//
//
//    }
//
//    public static void main(String[] args) {
//
//
//


    }}
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        Arrays.sort(arr);
//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i] + "\t");
//        }
//    }
//}

