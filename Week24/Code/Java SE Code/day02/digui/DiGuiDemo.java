package com.wayne.io.c2.digui;

public class DiGuiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �ݹ飺 ��������ֱ�ӻ��߼�ӵĵ���������
		 * 
		 * ע�⣺ 1���ݹ�һ����ȷ��������������ջ���
		 */
		// show();

		// toBin(8);

		int sum = getSum(50);

		System.out.println(sum);

	}

	public static int getSum(int i) {
		// TODO Auto-generated method stub
		if (i == 1)
			return 1;
		return i + getSum(i - 1);
	}

	public static void toBin(int i) {
		// TODO Auto-generated method stub

		/*
		 * return; 1������ֵ����Ϊvoid��һ�㺯������һ��Ĭ�ϵ�return���
		 * 2��void������ʾ��һ�㺯��û�з���ֵ����Ĭ�ϵ�return���-�������������������ظ��������� 3������ִ�н���֮��������ͷż���ջ
		 * 
		 * ���캯��/�� 1���޷��������У���Ҫ��main��������-��Ϊ������ʼ��
		 * 
		 */

		if (i > 0) {
			toBin(i / 2);
			System.out.println(i % 2);
		}
	}

	/*
	 * public static void show() { // TODO Auto-generated method stub
	 * 
	 * method(); }
	 * 
	 * public static void method() { // TODO Auto-generated method stub
	 * 
	 * show(); }
	 */

}
