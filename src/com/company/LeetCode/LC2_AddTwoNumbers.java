package com.company.LeetCode;

/**
 * Created by lipeiyuan on 2018/4/21.
 * 1、如果只设一个result指针，则最后只能记录最后一个值，单向链表无法返回去，所以用一个result_point帮忙进行赋值操作，不用result亲自动手
 * 因为result和result_point初始如果指向同一个对象那么result_point的操作对result也生效
 * 2、不管是否需要进位，该位的值都是（l1_point.val+l2_point.val+addNext）% 10 , 下一位进的位数 addNext都可以用  （l1_point.val+l2_point.val）/10
 * 3、考察对链表的遍历和操作
 * 4、三元表达式减少if-else
 * 5、while循环条件是两个判断的  或 ，且要进行迭代遍历，前后都要判断是否为空
 * 6、定一个结果链表的头（结果链表的第一个节点的前一个）
 * 7、要考虑到如果两个链表都遍历完还有进位
 */
public class LC2_AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);

        ListNode result = addTwoNumbers(l1,l2);
        while (result != null) {
            System.out.print(result.val+"->");
            result = result.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        }

        ListNode result_beforeHead = new ListNode(0);
        ListNode result_point = result_beforeHead;

        //表示进位到下一位的值
        int nextAdd = 0;

        while (l1 != null || l2 != null) {
            int a = l1==null ? 0 : l1.val;
            int b = l2==null ? 0 : l2.val;

            int sum = (a+b+nextAdd)%10;
            nextAdd = (a+b+nextAdd)/10;

            result_point.next = new ListNode(sum);
            result_point = result_point.next;

            l1 = l1!=null ? l1.next : null;
            l2 = l2!=null ? l2.next : null;

        }

        //如果还有进位，添加节点存入其中
        if (nextAdd != 0) {
            ListNode last = new ListNode(nextAdd);
            result_point.next = last;
        }



        return result_beforeHead.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
