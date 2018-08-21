package com.lzz.linkedlist;

import com.lzz.vo.Node;

public class SingleLinkedList {
	public int size; // ������
	public Node head; // ͷ�ڵ�

	public SingleLinkedList() {
		size = 0;
		head = null; // ���캯������������
	}

	public void addHead(Object obj) {
		/*
		 * ���һ��ͷ�ڵ�
		 */
		Node newHead = new Node(obj);
		if (size == 0) { // ����������ӵ�Ϊͷ�ڵ�
			head = newHead;
		} else {
			newHead.next = head; // �µĽڵ���뵽ͷ�ڵ��λ��
			head = newHead;
		}
		size++;
	}

	public void delHead() {
		/*
		 * ɾ��һ��ͷ�ڵ�
		 */
		Node temp = head;
		head = temp.next;
		size--;
	}

	public void addNode(int index, Object obj) {
		/*
		 * ������indexλ�ú���ӽڵ�
		 */
		Node newNode = new Node(obj);
		Node curNode = head;
		Node preNode = head;
		int temp = 0;
		while (temp != index) {
			// ����Indexλ��
			preNode = curNode;
			curNode = curNode.next;
			temp++;
		}
		// ��ӽڵ�
		newNode.next = curNode;
		preNode.next = newNode;
		size++;
	}

	public void delNode(int index) {
		/*
		 * ɾ��indexλ�ú��һ���ڵ�
		 */
		Node curNode = head;
		Node preNode = head;
		int temp = 0;
		while (temp != index) {
			preNode = curNode;
			curNode = curNode.next;
			temp++;
		}
		if (curNode.equals(head)) {
			head = head.next;
			size--;
		} else {
			preNode.next = curNode.next;
			size--;
		}
	}

	public void delNodeByData(Object obj) {
		Node preNode = head;
		Node curNode = head;
		while (curNode.data != obj) {
			if (curNode.next == null) {
				return;
			}
			preNode = curNode;
			curNode = curNode.next;
		}
		if (curNode.equals(head)) {
			head = head.next;
			size--;
		} else {
			preNode.next = curNode.next;
			size--;
		}
	}

	public Node findByIndex(int index) {
		/*
		 * ��ѯindex��һ���ڵ����Ϣ
		 */
		Node curNode = head;
		int i = 0;
		while (i != index) {
			curNode = curNode.next;
			i++;
		}
		return curNode;
	}

	public Node Reverse(Node head) {
		/*
		 * ����ת
		 */
		if (head == null) {   //������
			return null;
		}
		if (head.next == null) {   //ֻ��һ���ڵ�
			return head;
		}
		Node pre = null;
		Node cur = head;
		Node temp = null;
		while (cur != null) {   //����
			temp = cur.next;
			cur.next = pre;
			pre = cur;
			if (temp == null) {   //ԭ��β�ڵ��Ϊ�±�ͷ�ڵ�
				break;  
			}
			cur = temp;
		}
		return cur;   //����������
	}

	public void Display() {
		/*
		 * ��ʾ����ṹ
		 */
		if (size > 0) {
			Node node = head;
			int tempSize = size;
			if (tempSize == 1) {
				System.out.println("[" + node.data + "]");
				return;
			}
			while (tempSize > 0) {
				if (node.equals(head)) {
					System.out.print("[" + node.data + "->");
				} else if (node.next == null) {
					System.out.println(node.data + "]");
				} else {
					System.out.print(node.data + "->");
				}
				node = node.next;
				tempSize--;
			}
		} else {
			System.out.println("[]");
		}
	}

}
