/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: AddTwoNumbers
 * Author:   xuyz
 * Date:     2018/11/5 21:02
 * Description: 两数相加
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xuyz.leetcode.addtwonumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈两数相加〉
 *
 * @author xuyz
 * @create 2018/11/5
 * @since 1.0.0
 */
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        List<Integer> list1 = new ArrayList();
        list1.add(l1.val);
        while (l1.next.val>=0){
            list1.add(l1.next.val);
            l1 = l1.next;
        }
        List<Integer> list2 = new ArrayList();
        list2.add(l2.val);
        while (l2.next.val>=0){
            list2.add(l2.next.val);
            l2 = l2.next;
        }
        int len = list1.size()>=list2.size() ? list1.size() : list2.size();
        int ll1 = list1.size();
        int ll2 = list2.size();
        for(int i=0;i<len;i++){
            listNode.val = list1.get(ll1-1-i) +list2.get(ll2-1-i);
        }
        return listNode;
    }

    public static void main(String[] args) {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(2);
        ListNode l21 = new ListNode(2);
        ListNode l22 = new ListNode(2);
        ListNode l23 = new ListNode(2);
        l11.next = l12;
        l12.next = l13;
        l21.next = l22;
        l22.next = l23;
        addTwoNumbers(l11,l21);
        System.out.print(l11.next.val);
    }
}
