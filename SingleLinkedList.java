package com.lzz.linkedlist;

import com.lzz.vo.Node;

public class SingleLinkedList {
	public int size; // 链表长度
	public Node head; // 头节点

	public SingleLinkedList() {
		size = 0;
		head = null; // 构造函数创建空链表
	}

	public void addHead(Object obj) {
		/*
		 * 添加一个头节点
		 */
		Node newHead = new Node(obj);
		if (size == 0) { // 空链表则添加的为头节点
			head = newHead;
		} else {
			newHead.next = head; // 新的节点插入到头节点的位置
			head = newHead;
		}
		size++;
	}

	public void delHead() {
		/*
		 * 删除一个头节点
		 */
		Node temp = head;
		head = temp.next;
		size--;
	}

	public void addNode(int index, Object obj) {
		/*
		 * 在链表index位置后添加节点
		 */
		Node newNode = new Node(obj);
		Node curNode = head;
		Node preNode = head;
		int temp = 0;
		while (temp != index) {
			// 查找Index位置
			preNode = curNode;
			curNode = curNode.next;
			temp++;
		}
		// 添加节点
		newNode.next = curNode;
		preNode.next = newNode;
		size++;
	}

	public void delNode(int index) {
		/*
		 * 删除index位置后的一个节点
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
		 * 查询index后一个节点的信息
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
		 * 链表翻转
		 */
		if (head == null) {   //空链表
			return null;
		}
		if (head.next == null) {   //只有一个节点
			return head;
		}
		Node pre = null;
		Node cur = head;
		Node temp = null;
		while (cur != null) {   //反向
			temp = cur.next;
			cur.next = pre;
			pre = cur;
			if (temp == null) {   //原表尾节点变为新表头节点
				break;  
			}
			cur = temp;
		}
		return cur;   //返回新链表
	}

	public void Display() {
		/*
		 * 显示链表结构
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
