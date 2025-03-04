package chapter06;

/**
 * <h1>3. 변수와 메서드</h1>
 */
public class Chapter06_3 {

	/**
	 * <p>
	 *     <h5>3.1 선언위치에 따른 변수의 종류</h5><br>
	 *     변수는 클래스변수, 인스턴스 변수, 지역변수 모두 세 종류가 있다. <br>
	 *     변수의 종류를 결정짓는 중요한 요소는 '변수의 선언된 위치' 이므로 변수의 종류를 파악하기 위해서는 변수가 어느 영역에 선언되어있는지를 확인하는 것이 중요하다.<br>
	 *     멤버변수를 제외한 나머지 변수들은 모두 지역변수이며, 멤버변수 중 static이 붙은 것은 클래스변수, 붙지 않은 것은 인스턴스변수이다.<br>
	 * <pre>
	 * class variables{ <- 클래스 영역
	 *     int iv; // 인스턴스 변수
	 *     static int cv; // 클래스 변수(static변수, 공유변수)
	 *     void method(){ <- 메서드 영역
	 *         int lv = 0; // 지역변수
	 *     }
	 * }
	 * </pre>
	 * 		<br>
	 * 		iv와 cv는 클래스 영역에 선언되어있으므로 멤버변수이다. 그 중 cs는 키워드 static과 함께 선언되어 있으므로 클래스 변수이며, iv는 인스턴스 변수이다.<br>
	 * 		lv는 메서드인 method()의 내부, 즉 '메서드 영역'에 선언되어 있으므로 지역변수이다.<br>
	 * 		변수의 종류 | 선언위치 | 생성시기<br>
	 * 		클래스변수(class variable) | 클래스 영역 | 클래스가 메모리에 올라갈 때<br>
	 * 		인스턴스변수(instance variable) | 클래스 영역 | 인스턴스가 생성되었을 때<br>
	 * 		지역변수(local variable) | 클래스 영역 이외의 영역(메서드, 생성자, 초기화 블럭 내부) | 변수 선언문이 수행되었을 때
	 * 		<br>
	 * 		1. 인스턴스변수(instance variable)<br>
	 * 		클래스 영역에 선언되며, 클래스의 인스턴스를 생성할 때 만들어진다. 그렇기 때문에 인스턴스 변수의 값을 읽어 오거나 저장하기 위해서는 먼저 인스턴스를 생성해야 한다.<br>
	 * 		인스턴스는 독립적인 저장공간을 가지므로 서로 다른 값을 가질 수 있다. 인스턴스마다 고유한 상태를 유지해야하는 속성의 경우, 인스턴스변수로 선언한다.<br>
	 * 		2. 클래스변수(class variable)<br>
	 * 		클래스 변수를 선언하는 방법은 인스턴스변수 앞에 static을 붙이기만 하면 된다. 인스턴스마다 독립적인 저장공간을 갖는 인스턴스변수와는 달리,<br>
	 *      클래스변수는 모든 인스턴스가 공통된 저장공간(변수)을 공유하게 된다.<br>
	 *      한 클래스의 모든 인스턴스들이 공통적인 값을 유지해야하는 속성의 경우, 클래스변수로 선언해야 한다.<br>
	 *      클래스 변수는 인스턴스변수와 달리 인스턴스를 생성하지 않고도 언제라도 바로 사용할 수 있다는 특징이있으며, '클래스이름.클래스변수'와 같은 형식으로 사용한다.<br>
	 *      클래스가 메모리에 '로딩(loading)'될 때 생성되어 프로그램이 종료될 때 가지 유지되며, public을 앞에 붙이면 같은 프로그램내에서 어디서나 접근할 수 있는 '전역변수(global variable)'의 성격을 갖는다.<br>
	 *      <small>※참조변수의 선언이나 객체의 생성과 같이 클래스의 정보가 필요할 때, 클래스는 메모리에 로딩된다.</small>
	 *      <br>
	 *      3. 지역변수(local variable)<br>
	 *      메서드 내에 선언되어 메서드 내에서만 사용 가능하며, 메서드가 종료되면 소멸되어 사용할 수 없게된다.
	 * </p>
	 */
	class Memo01 {
	}

	/**
	 * <p>
	 *     <h5>3.2 클래스변수와 인스턴스변수</h5><br>
	 *     <b>인스턴스변수는 인스턴스가 생성될 때 마다 생성되므로 인스턴스마다 각기 다른 값을 유지할 수 있지만, 클래스 변수는 모든 인스턴스가</b><br>
	 *     <b>하나의 저장공간을 공유하므로, 항상 공통된 값을 갖는다.</b>
	 * </p>
	 */
	static class CardTest {

		public static void main(String[] args) {

			System.out.println("Card.width = " + Card.width); // <- 클래스변수(static변수)는 객체생성 없이 '클래스이름.클래스변수'로 직접 사용 가능하다.
			System.out.println("Card.height = " + Card.height);

			Card c1 = new Card();
			c1.kind = "Heart"; // <- 인스턴스변수의 값을 변경한다.
			c1.number = 7; // <- 인스턴스변수의 값을 변경한다.

			Card c2 = new Card();
			c2.kind = "Spade";
			c2.number = 4;

			System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
			System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
			System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");

			c1.width = 50; // <- 클래스변수의 값을 변경한다.
			c1.height = 80; // <- 클래스변수의 값을 변경한다.

			System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
			System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");

		}

	}

	static class Card {
		String kind;
		int number;
		static int width = 100;
		static int height = 250;
	}

	/**
	 * <p>
	 *     <h5>3.3 메서드</h5><br>
	 *     '메서드(method)'는 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것이다. 기본적으로 수학의 함수와 유사하며, 어떤 값을 입력하면<br>
	 *     이 값으로 작업을 수행해서 결과를 반환한다.<br>
	 *     <small>※수학의 함수와 달리 메서드는 입력값 또는 출력값(결과값)이 없을 수도 있으며, 심지어는 입력값과 출력값이 모두 없을 수도 있다.</small><br>
	 *     그저 메서드가 작업을 수행하는데 필요한 값만 넣고 원하는 결과를 얻으면 될 뿐, 이 메서드가 내부적으로 어떤 과정을 거쳐 결과를 만들어내는지 전혀 몰라도 된다.<br>
	 *     메서드를 내부가 보이지 않는 '블랙박스(black box)'라고도 한다.<br>
	 *     메서드를 사용하는 이유<br>
	 *     <b>1. 높은 재사용성(reusability)</b><br>
	 *     <b>2. 중복된 코드의 제거</b><br>
	 *     <b>3. 프로그램의 구조화</b><br>
	 * </p>
	 */
	class Memo02 {
	}

	/**
	 * <p>
	 *     <h5>3.4 메서드의 선언과 구현</h5><br>
	 *     메서드는 크게 두 부분, '선언부(header,머리)'와 '구현부(body, 몸통)'로 이루어져 있다.<br>
	 *     메서드를 정의한다는 것은 선언부와 구현부를 작성하는 것을 뜻한다.<br>
	 *     <b>메서드 선언부(method declaration, method header)</b><br>
	 *     메서드 선언부는 '메서드의 이름'과 '매개변수 선언', 그리고 '반환타입'으로 구성되어 있으며, 메서드가 작업을 수행하기 위해 어떤 값들을<br>
	 *     필요로 하고 작업의 결과로 어떤 타입의 값을 반환하는지에 대한 정보를 제공한다.
	 * </p>
	 */
	class Memo03 {
	}

	/**
	 * <h5>매개변수 선언(parameter declaration)</h5><br>
	 * 매개변수는 메서드가 작업을 수행하는데 필요한 값들(입력)을 제공받기 위한 것이며, 필요한 값의 개수만큼 변수를 선언하며 각 변수 간의 구분은<br>
	 * 쉼표','를 사용한다.<br>
	 * ※<small>매개변수도 메서드 내에 선언된 것으로 간주되므로 '지역변수(local variable)'이다.</small><br>
	 */
	class Memo04 {
	}

	/**
	 * <h5>메서드의 이름(method name)</h5><br>
	 * 메서드의 이름도 앞서 배운 변수의 명명규칙대로 작성하면 된다.
	 */
	class Memo05 {
	}

	/**
	 * <h5>반환타입(return type)</h5><br>
	 * 메서드의 작업수행 결과(출력)인 '반환값(return value)'의 타입을 적는다. 반환값이 없는 경우 반환타입으로 'void'를 적어야한다.
	 */
	class Memo06 {
	}

	/**
	 * <h5>메서드의 구현부(method body, 메서드 몸통)</h5><br>
	 * 메서드의 선언부 다음에 오는 괄호{}를 '메서드의 구현부'라고 하는데, 여기에 메서드를 호출했을 때 수행될 문장들을 넣는다.
	 */
	class Memo07 {
	}

	/**
	 * <h5>return문</h5><br>
	 * 메서드의 반환타입이 'void'가 아닌 경우, 구현부{}안에 'return 반환값;'이 반드시 포함되어 있어야 한다.<br>
	 * 이 문장은 작업을 수행한 결과인 반환값을 호출한 메서드로 전달하는데, 이 값의 타입은 반환타입과 <b>일치하거나 적어도 자동 형변환이 가능한 것</b>이어야 한다.<br>
	 * 여러 개의 변수를 선언할 수 있는 매개변수와 달리 return문은 단 하나의 값만 반환할 수 있는데, 메서드로의 입력(매개변수)은 여러 개일 수 있어도 출력(반환값)은 최대 하나만 허용하는 것이다.
	 */
	class Memo08 {
	}

	/**
	 * <h5>지역변수(local variable)</h5><br>
	 * 메서드 내에 선언된 변수들은 그 메서드 내에서만 사용할 수 있으므로 서로 다른 메서드 라면 같은 이름의 변수를 선언해도 된다.<br>
	 * 이처럼 메서드 내에 선언된 변수를 '지역변수(local variable)'라고 한다.<br>
	 * <small>※매개변수도 메서드 내에 선언된 것으로 간주되므로 지역변수이다.</small>
	 */
	class Memo09 {
	}

	/**
	 * <h5>3.5 메서드의 호출</h5><br>
	 * 메서드를 정의했어도 호출되지 않으면 아무 일도 일어나지 않는다. 메서드를 호출해야만 구현부{}의 문장들의 수행된다.<br>
	 * <small>※main메서드는 프로그램 실행 시 OS에 의해 자동적으로 호출된다.</small><br>
	 * <code>메서드이름(값1, 값2, ...) // 메서드를 호출하는 방법</code>
	 */
	class Memo10 {
	}

	/**
	 * <h5>인자(argument)와 매개변수(parameter)</h5><br>
	 * 메서드를 호출할 때 괄호{}안에 저장해준 값들을 '인자(argument)' 또는 '인수'라고 하는데, 인자의 개수와 순서는 호출된 메서드에 선언된 매개변수와 일치해야 한다.<br>
	 * 그리고 인자는 메서드가 호출되면서 매개변수에 대입되므로, 인자의 타입은 매개변수의 타입과 일치하거나 자동 형변환이 가능한 것이어야 한다.<br>
	 * <code>
	 *     public static void main(String args[]) {<br>
	 *         int result = add(3, 5) // 메서드를 호출, (3,5) = 인자(argument, 원본)<br>
	 *     }<br>
	 *
	 *     int add(int x, int y) {<br>
	 *         ... // (x, y) = 매개변수(parameter, 복사본)<br>
	 *     }
	 * </code>
	 */
	class Memo11 {
	}

	/**
	 * <h5>메서드의 실행흐름</h5><br>
	 * 같은 클래스 내의 메서드 끼리는 참조변수를 사용하지 않고도 서로 호출이 가능하지만 static메서드는 같은 클래스 내의 인스턴스 메서드를 호출할 수 없다.<br>
	 */
	class Memo12 {
	}

	/**
	 * MyMath클래스의 'add(long a, long b)'를 호출하기 위해서는 먼저 'MyMath mm = new MyMath();'와 같이 해서, MyMath클래스의 인스턴스를 생성한 다음 참조변수 mm을 통해야한다.<br>
	 * <code>
	 *     MyMath mm = new MyMath(); // 먼저 인스턴스를 생성한다.<br>
	 *     long value = mm.add(1L, 2L); // 메서드를 호출한다.<br>
	 *     long add(long a, long b) {<br>
	 *         long result = a + b;<br>
	 *         return result;<br>
	 *     }<br>
	 * </code>
	 * 1. main메서드에서 메서드 add를 호출한다. 호출시 지정한 1L과 2L이 메서드 add의 매개변수 a,b에 각각 복사(대입)된다.<br>
	 * 2. 메서드 add의 괄호{}안에 있는 문장들이 순서대로 수행된다.<br>
	 * 3. 메서드 add의 모든 문장이 실행되거나 return문을 만나면, 호출한 메서드(main메서드)로 되돌아와서 이후의 문장들을 실행한다.<br>
	 * 메서드가 호출되면 지금까지 실행 중이던 메서드는 실행을 잠시 멈추고 호출된 메서드의 문장들이 실행된다.<br>
	 * 편의상 메서드 add의 호출결과가 바로 vaule에 저장되는 것처럼 그렸지만, 사실은 호출한 자리를 반환값이 대신하고 대입연산자에 의해 이 값이 변수 value에 저장된다.
	 */
	static class MyMath {
		long add(long a, long b) {
			long result = a + b;
			return result;
			// return a + b; 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
		}

		long subtract(long a, long b) {
			return a - b;
		}

		long multiply(long a, long b) {
			return a * b;
		}

		double divide(long a, long b) {
			return a / b;
		}

	}

	static class MyMathTest {

		public static void main(String[] args) {

			MyMath mm = new MyMath();
			long result1 = mm.add(5L, 3L);
			long result2 = mm.subtract(5L, 3L);
			long result3 = mm.multiply(5L, 3L);
			double result4 = mm.divide(5L, 3L);

			System.out.println("add(5L, 3L) = " + result1);
			System.out.println("subtract(5L, 3L) = " + result2);
			System.out.println("multiply(5L, 3L) = " + result3);
			System.out.println("divide(5L, 3L) = " + result4);

		}

	}

	/**
	 * <h5>3.6 return문</h5>
	 * <br>
	 * return문은 현재 실행준인 메서드를 종료하고 호출한 메서드로 되돌아간다. 지금까지 반환값이 있을 때만 return문을 썼지만, 원래는 반환값의<br>
	 * 유무에 관계없이 모든 메서드에는 적어도 하나의 return문이 있어야 한다. 그런데도 반환타입이 void인 경우, return문 없이도 아무런 문제가 없었던 이유는<br>
	 * 컴파일러가 메서드의 마지막에 'return;'을 자동적으로 추가해주었기 때문이다.
	 */
	class Memo13 {
	}

	/**
	 * <h5>반환값(return value)</h5>
	 * <br>
	 * return문의 반환값으로 주로 변수가 오긴 하지만 항상 그런 것은 아니다. 아래 왼쪽의 코드는 오른쪽과 같이 간략히 할 수 있는데, 그렇다고 해서<br>
	 * 수식이 반환되는 것은 아니고, 이 수식을 계산한 결과가 반환된다.
	 */
	class Memo14 {

		int add(int x, int y) {
			int result = x + y;
			return result;
		}

		int addChange(int x, int y) {
			return x + y;
		}

	}

	/**
	 * <h1>매개변수의 유효성 검사</h1>
	 * <br>
	 * 메서드의 구현부{}를 작성할 때, 제일 먼저 해야 하는 일이 매개변수의 값이 적절한 것인지 확인하는 것이다.
	 */
	class Memo15 {

	}

	/**
	 * <h1>3.7 JVM의 메모리 구조</h1>
	 * <br>
	 * 응용프로그램이 실행되면, JVM은 시스템으로부터 프로그램을 수행하는데 필요한 메모리를 할당받고 JVM은 이 메모리를 용도에 따라 여러 영역으로 나누어 관리한다.<br>
	 * 그 중 3가지 주요 영역(method area, call stack, heap)에 대해서 알아보자.<br>
	 * 1. 메서드 영역(method area)<br>
	 * - 프로그램 실행 중 어떤 클래스가 사용되면, JVM은 해당 클래스의 클래스파일(*.class)을 읽어서 분석하여 클래스에 대한 정보(클래스 데이터)를 이곳에 저장한다.<br>
	 * 이 때, 그 클래스의 클래스변수(class variable)도 이 영역에 함께 생성된다.<br>
	 * 2. 힙(heap)<br>
	 * - 인스턴스가 생성되는 공간, 프로그램 실행 중 생성되는 인스턴스는 모두 이곳에 생성된다. 즉, 인스턴스 변수(instance variable)들이 생성되는 공간이다.<br>
	 * 3. 호출스택(call stack 또는 execution stack)<br>
	 * - 호출스택은 메서드의 작업에 필요한 메모리 공간을 제공한다. 메서드가 호출되면, 호출스택에 호출된 메서드를 위한 메모리가 할당되며,<br>
	 * 이 메모리는 메서드가 작업을 수행하는 동안 지역변수(매개변수 포함)들과 연산의 중간결과 등을 저장하는데 사용된다. 그리고 메서드가 작업을 마치면<br>
	 * 할당되었던 메모리공간은 반환되어 비워진다.<br>
	 * 각 메서드를 위한 메모리상의 작업공간은 서로 구별되며, 첫 번째로 호출된 메서드를 위한 작업공간이 호출스택의 맨 밑에 마련되고, 첫 번째 메서드 수행중에 다른 메서드를 호출하면,<br>
	 * 첫 번째 메서드의 바로 위에 두 번째로 호출된 메서드를 위한 공간이 마련된다.<br>
	 * 이 때 첫 번째 메서드는 수행을 멈추고, 두 번째 메서드가 수행되기 시작한다. 두 번째로 호출된 메서드가 수행을 마치게 되면, 두 번째 메서드를 위해 제공되었던 호출스택의 메모리 공간이 반환되며,<br>
	 * 첫 번째 메서드는 다시 수행을 계속하게 된다. 첫 번째 메서드가 수행을 마치면, 역시 제공되었던 메모리 공간이 호출스택에서 제거되며 호출스택은 완전히 비워지게 된다.<br>
	 * 호출스택의 제일 상위에 위치하는 메서드가 현재 실행 중인 메서드이며, 나머지는 대기상태에 있게 된다.<br>
	 * - 메서드가 호출되면 수행에 필요한 만큼의 메모리를 스택에 할당받는다.<br>
	 * - 메서드가 수행을 마치고나면 사용했던 메모리를 반환하고 스택에서 제거된다.<br>
	 * - 호출스택의 제일 위에 있는 메서드가 현재 실행 중인 메서드이다.<br>
	 * - 아래에 있는 메서드가 바로 위의 메서드를 호출한 메서드이다.<br>
	 * 반환타입(return type)이 있는 메서드는 종료되면서 결과값을 자신을 호출한 메서드(caller)에게 반환한다. 대기상태에 있던 호출한 메서드(caller)는 넘겨받은 반환값으로 수행을 계속 진행하게 된다.
	 */
	class Memo16 {

	}

	static class CallStackTest {

	}

}
