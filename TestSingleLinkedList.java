package com.lzz.test;

import com.lzz.linkedlist.SingleLinkedList;
import com.lzz.vo.Node;

public class TestSingleLinkedList {
	public static void main(String[] args) {
		SingleLinkedList single = new SingleLinkedList();
		System.out.println("������");
		single.Display();
		single.addHead("A");
		single.addHead("B");
		single.addHead("C");
		single.addHead("D");
		System.out.println("ԭ����");
		single.Display();
		System.out.println("��ת��");
		single.head = single.Reverse(single.head);
		single.Display();
		System.out.println("����ͷ�ڵ㷽ʽ��������");
		single.Display();
		single.addNode(single.size,"E");
		single.addNode(single.size,"F");
		single.addNode(single.size,"G");
		System.out.println("��ӽڵ㵽����ĩβ��");
		single.Display();
		single.delHead();
		System.out.println("ɾ��һ��ͷ��㣺");
		single.Display();
		single.addNode(2, "H");
		System.out.println("����ڵ㣺");
		single.Display();
		single.delNode(3);
		System.out.println("ɾ�����ĸ��ڵ㣺");
		single.Display();
		single.delNodeByData("B");
		System.out.println("ɾ��B�ڵ㣺");
		single.Display();
		Node find = single.findByIndex(3);
		System.out.println("���ҵ��ĸ��ڵ���Ϣ��");
		System.out.println("node: " + find.data);
		single.head = single.Reverse(single.head);
		System.out.println("����ת��");
		single.Display();
	}
}
