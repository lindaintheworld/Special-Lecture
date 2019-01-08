package skillup.day01.run;

import java.util.*;

import skillup.day01.model.vo.Music;

public class Run {

	public static void main(String[] args) {
		//List list = new ArrayList();/* = new List();*/
		//상속이 안된다
		
		ArrayList<Music> list = new ArrayList/*<Music>*/(3);
		System.out.println(list);
		
		//1. add(E e) : 리스트의 끝에 인스턴스 추가
		list.add(new Music("송민호", "아낙네"));
		list.add(new Music("제니", "SOLO"));
		list.add(new Music("퀸", "보헤미안랩소디"));
		System.out.println(list);
		list.add("끝"); //타입 제한해서 노란 줄 없어졌는데 다른 타입 담으려고 하니까 에러남
		//지정한 크기보다 크게 값을 넣어도 오류 안남
		//다양한 타입이 저장 가능하다.
		System.out.println(list);

		//2. add(int index, E e) : 가운데에 값 추가
		list.add(1, new Music("강보람", "기술향상"));
		System.out.println(list);
		
		//3. set(int index, E e) : 해당 인덱스 값 변경
		list.set(0, new Music("지코", "artist"));
		System.out.println(list);
		
		//4. size() --> int : 리스트 안에 몇개의 인스턴스가 있는지
		System.out.println("size : " + list.size());
		
		//5. remove(int index) : 해당 인덱스의 인스턴스 삭제
		list.remove(1);
		System.out.println(list);
		
		//6. get(int index) : 해당 인덱스의 인스턴스가 어떤지
		Music m = /*(Music)*/ list.get(0);
		System.out.println(m);
		String str = (String)list.get(3); //타입 제한해서 노란 줄 없어졌는데 다른 타입 담으려고 하니까 에러남
		System.out.println(str);
		
		//7. contains(Object o) --> boolean : o라는 객체를 포함하고 있느냐
		System.out.println(list.contains(new Music("지코", "artist"))); //주소값 비교, new Music으로 새로 생성했기 때문에 찾을 수가 없다 그러니까 필드값만 비교할 수 있게 equals method를 오버라이딩해야함
		
		//8. subList(int index1, int index2) --> List : 해당 인덱스들 사이의 값들을 List로 추출
		List sub = list.subList(0, 2);
		System.out.println(sub);
		
		//9. addAll(Collection c) : 컬렉션 추가
		list.addAll(sub);
		System.out.println(list);
		
		//10. isEmpty() --> boolean : list안에 값이 비었냐
		System.out.println(list.isEmpty());
		
		//11. clear() : 전체 삭제
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list);
	}
	

}
