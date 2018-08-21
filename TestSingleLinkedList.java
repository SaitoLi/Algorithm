package com.lzz.test;

import com.lzz.linkedlist.SingleLinkedList;
import com.lzz.vo.Node;

public class TestSingleLinkedList {
	public static void main(String[] args) {
		SingleLinkedList single = new SingleLinkedList();
		System.out.println("空链表：");
		single.Display();
		single.addHead("A");
		single.addHead("B");
		single.addHead("C");
		single.addHead("D");
		System.out.println("原链表：");
		single.Display();
		System.out.println("翻转：");
		single.head = single.Reverse(single.head);
		single.Display();
		System.out.println("插入头节点方式更新链表：");
		single.Display();
		single.addNode(single.size,"E");
		single.addNode(single.size,"F");
		single.addNode(single.size,"G");
		System.out.println("添加节点到链表末尾：");
		single.Display();
		single.delHead();
		System.out.println("删除一个头结点：");
		single.Display();
		single.addNode(2, "H");
		System.out.println("插入节点：");
		single.Display();
		single.delNode(3);
		System.out.println("删除第四个节点：");
		single.Display();
		single.delNodeByData("B");
		System.out.println("删除B节点：");
		single.Display();
		Node find = single.findByIndex(3);
		System.out.println("查找第四个节点信息：");
		System.out.println("node: " + find.data);
		single.head = single.Reverse(single.head);
		System.out.println("链表翻转：");
		single.Display();
	}
}
