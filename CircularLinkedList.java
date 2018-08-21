package com.lzz.linkedlist;

import com.lzz.vo.Node1;

public class CircularLinkedList {
	public int size;
	public Node1 head;

	public CircularLinkedList() {
		size = 0;
		head = null;
	}

	public void addNode(int data) {
		/*
		 * ������β�����һ���ڵ�
		 */
		Node1 node = new Node1(data);
		if (head == null) {
			head = node;
			node.next = head;
			size++;
		} else {
			if (head.next.equals(head)) {
				head.next = node;
				node.next = head;
				size++;
			} else {
				Node1 temp = head;
				while (temp.next != head) {
					temp = temp.next;
				}
				temp.next = node;
				node.next = head;
				size++;
			}
		}
	}

	public void delNode(int data) {
		/*
		 * ����Dataɾ���ڵ�
		 */
		Node1 temp = head;
		while (true) {
			if (temp.next.getData() == data) {
				if (temp.next == head) {
					head = temp.next.next;
					size--;
					break;
				} else {
					temp.next = temp.next.next;
					size--;
					break;
				}
			} else {
				temp = temp.next;
			}
		}
	}

	public Node1 findByIndex(int index) {
		/*
		 * ��ѯindex��һ���ڵ����Ϣ
		 */
		Node1 curNode = head;
		int i = 0;
		while (i != index) {
			curNode = curNode.next;
			i++;
		}
		return curNode;
	}

	public void Display() {
		/*
		 * չʾ����ṹ
		 */
		if (size > 0) {
			Node1 node = head;
			int tempSize = size;
			if (tempSize == 1) {
				System.out.println("[" + node.getData() + "]");
				return;
			}
			while (tempSize > 0) {
				if (node.equals(head)) {
					System.out.print("[" + node.getData() + "->");
				} else if (node.next.equals(head)) {
					System.out.println(node.getData() + "]");
				} else {
					System.out.print(node.getData() + "->");
				}
				node = node.next;
				tempSize--;
			}
		} else {
			System.out.println("[]");
		}
	}
}
