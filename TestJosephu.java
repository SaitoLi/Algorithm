package com.lzz.test;

import com.lzz.linkedlist.Josephu;

public class TestJosephu {
	public static void main(String[] args) {
		Josephu jo = new Josephu();
		jo.addJosephu(2);
		jo.addJosephu(8);
		jo.addJosephu(5);
		jo.addJosephu(7);
		jo.addJosephu(1);
		jo.addJosephu(4);
		jo.addJosephu(6);
		jo.addJosephu(3);
		jo.showJosephu();
		jo.Start(3, 4);
	}
}
