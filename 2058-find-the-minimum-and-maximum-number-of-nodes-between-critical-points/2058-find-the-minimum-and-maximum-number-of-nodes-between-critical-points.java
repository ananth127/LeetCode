/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> ar=new ArrayList<>();
        int prev=-1;
        int curr=-1;
        int next=0;
        int count=0;
        int arr[]=new int[2];
        while(head!=null){
            count++;
            curr=head.val;
           //System.out.println(head.val+" :value");
            if(head.next!=null){
                next=head.next.val;
            }
            if(prev==-1){
                prev=head.val;
                
               //System.out.println(prev+" prev");
            }
            else if((prev==curr)||(curr==next)){
                   // System.out.print(curr+"same");
                    prev=curr;
                }
               else if((prev>curr)&&(curr<next)){
                //curr=head.val;
                    //System.out.println(prev+" "+curr+" "+" "+next+" samll");
                    ar.add(count);
                    prev=curr;
                }
            
                else if((prev<curr)&&(curr>next)){
                   //curr=head.val;
                  //  System.out.println(prev+" "+curr+" "+" "+next+" big");                    
                    ar.add(count);
                    prev=curr;
                }
                head=head.next;
            }
            
            
            for(Integer a:ar){
           // System.out.print(a+" ");
        }
        if(ar.size()<=1){
            arr[0]=-1;
            arr[1]=-1;
        }
        else if(ar.size()==2){
            arr[0]=Math.abs(ar.get(0)-ar.get(1));
            arr[1]=Math.abs(ar.get(0)-ar.get(1));
        }
        else{
            Collections.sort(ar);
            int min=Integer.MAX_VALUE;

            for(int i=0;i<ar.size()-1;i++){
                if(Math.abs(ar.get(i)-ar.get(i+1))<min){
                    min=Math.abs(ar.get(i)-ar.get(i+1));
                    System.out.print(min+" ");
                }
                
            }
            arr[0]=min;
            //arr[0]=Math.abs(ar.get(1)-ar.get(0));
            arr[1]=Math.abs(ar.get(ar.size()-1)-ar.get(0));
            
        }
        return arr;

        }
        
    }
