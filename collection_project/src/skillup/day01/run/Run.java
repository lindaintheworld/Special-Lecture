package skillup.day01.run;

import java.util.*;

import skillup.day01.model.vo.Music;

public class Run {

	public static void main(String[] args) {
		//List list = new ArrayList();/* = new List();*/
		//����� �ȵȴ�
		
		ArrayList<Music> list = new ArrayList/*<Music>*/(3);
		System.out.println(list);
		
		//1. add(E e) : ����Ʈ�� ���� �ν��Ͻ� �߰�
		list.add(new Music("�۹�ȣ", "�Ƴ���"));
		list.add(new Music("����", "SOLO"));
		list.add(new Music("��", "����̾ȷ��ҵ�"));
		System.out.println(list);
		list.add("��"); //Ÿ�� �����ؼ� ��� �� �������µ� �ٸ� Ÿ�� �������� �ϴϱ� ������
		//������ ũ�⺸�� ũ�� ���� �־ ���� �ȳ�
		//�پ��� Ÿ���� ���� �����ϴ�.
		System.out.println(list);

		//2. add(int index, E e) : ����� �� �߰�
		list.add(1, new Music("������", "������"));
		System.out.println(list);
		
		//3. set(int index, E e) : �ش� �ε��� �� ����
		list.set(0, new Music("����", "artist"));
		System.out.println(list);
		
		//4. size() --> int : ����Ʈ �ȿ� ��� �ν��Ͻ��� �ִ���
		System.out.println("size : " + list.size());
		
		//5. remove(int index) : �ش� �ε����� �ν��Ͻ� ����
		list.remove(1);
		System.out.println(list);
		
		//6. get(int index) : �ش� �ε����� �ν��Ͻ��� ���
		Music m = /*(Music)*/ list.get(0);
		System.out.println(m);
		String str = (String)list.get(3); //Ÿ�� �����ؼ� ��� �� �������µ� �ٸ� Ÿ�� �������� �ϴϱ� ������
		System.out.println(str);
		
		//7. contains(Object o) --> boolean : o��� ��ü�� �����ϰ� �ִ���
		System.out.println(list.contains(new Music("����", "artist"))); //�ּҰ� ��, new Music���� ���� �����߱� ������ ã�� ���� ���� �׷��ϱ� �ʵ尪�� ���� �� �ְ� equals method�� �������̵��ؾ���
		
		//8. subList(int index1, int index2) --> List : �ش� �ε����� ������ ������ List�� ����
		List sub = list.subList(0, 2);
		System.out.println(sub);
		
		//9. addAll(Collection c) : �÷��� �߰�
		list.addAll(sub);
		System.out.println(list);
		
		//10. isEmpty() --> boolean : list�ȿ� ���� �����
		System.out.println(list.isEmpty());
		
		//11. clear() : ��ü ����
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list);
	}
	

}
