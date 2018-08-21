package com.lzz.linkedlist;

import com.lzz.vo.Node1;

public class Josephu {
	CircularLinkedList cir = new CircularLinkedList();

	public void addJosephu(int a) {
		cir.addNode(a);
	}

	public void delJosephu(int a){
		cir.delNode(a);
	}
	
	public void showJosephu() {
		System.out.println("参与者队列：");
		cir.Display();
	}

	public void Start(int k, int m) {
		/*
		 * 开始求解约瑟夫问题
		 */
		int n = k - 1;
		Node1 node = cir.findByIndex(n);
		int i = 1;
		while (i <= m) {
			if (i == m) {
				Node1 temp = node.next;
				System.out.println("“" + node.getData() + "”" + "出列");
				cir.delNode(node.getData());
				System.out.println("队列：");
				cir.Display();
				node = temp;
				if (cir.size == 1) {
					System.out.println("“" + cir.head.getData() + "”" + "出列");
					cir.delNode(cir.head.getData());
					System.out.println("队列：");
					cir.Display();
					break;
				}
				i = 1;
			}
			else{
				i++;
				node = node.next;
			}
		}
	}
}
