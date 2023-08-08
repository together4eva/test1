package test;

import model.Poclain;
import model.Spade;

public class TestWorker {
	public static void main(String[] args) {
		//필요시 객체를 생성해 사용
		//Hammer에서 Spade로 변경
//		Hammer tool= new Hammer();
//		tool.work();
//		필요로 하는 객체(컴포넌트 or Bean)를 직접 생성 (직접 제어)
//		Spade tool= new Spade();
//		tool.work();
//		이후 툴이 추가될 때마다 코드 변경은 불가피한 구조, 결합도가 높아 유지보수성이 낮다
		
		Poclain tool= new Poclain();
		tool.work();		
	}
}
