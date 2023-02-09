package ezen.exception;

/**
 * 자바에서 예외란?
 * 
 * @Author 김재훈
 * @Date 2023. 1. 9.
 */
public class ExceptionExample {
/*
	public static void main(String[] args) {
		System.out.println("프로그램 시작됨.");
		Foo foo = new Foo();
		int result = foo.doTask4(10, 5);
		System.out.println("결과: " + result);
		try {
			result = foo.doTask4(10, 0);
			System.out.println("결과: " + result);
			foo.doTask5();
			
		} catch (Exception e) {
			System.out.println("예기치 않은 오류가 발생했습니다.");
			e.printStackTrace();
		}

		System.out.println("프로그램 종료됨.");
		
	} */
	
	public static void main(String[] args) throws Exception {
		System.out.println("프로그램 시작됨.");
		Foo foo = new Foo();
		int result = foo.doTask4(10, 5);
		System.out.println("결과: " + result);
		
			result = foo.doTask4(10, 0);
			System.out.println("결과: " + result);
			foo.doTask5();
			
		
			System.out.println("예기치 않은 오류가 발생했습니다.");
		

		System.out.println("프로그램 종료됨.");
		
	}

}
