package chapter06;

/**
 * <h1>2. 클래스와 객체</h1>
 */
public class Chapter06_2 {

	/**
	 * <p>
	 *     <h5>2.1 클래스와 객체의 정의와 용도</h5><br>
	 *     클래스란 '객체를 정의해놓은 것', 또는 클래스는 '객체의 설계도 또는 틀'이라고 정의할 수 있다.<br>
	 *     클래스는 객체를 생성하는데 사용되며, 객체는 클래스에 정의된 대로 생성된다.<br>
	 *     <b>클래스의 정의</b> 클래스란 객체를 정의해 놓은 것이다.<br>
	 *     <b>클래스의 용도</b> 클래스는 객체를 생성하는데 사용된다.<br>
	 *     객체의 사전적인 정의는 '실제로 존재하는 것'이다. 객체지향이론에서는 사물과 같은 유형적인 것 뿐만 아니라, 개념이나 논리와 같은<br>
	 *     무형적인 것들도 객체로 간주한다.<br>
	 *     프로그래밍에서의 객체는 클래스에 정의된 내용대로 메모리에 생성된 것을 뜻한다.<br>
	 *     <b>객체의 정의</b> 실제로 존재하는 것. 사물 또는 개념<br>
	 *     <b>객체의 용도</b> 객체가 가지고 있는 기능과 속성에 따라 다름<br>
	 *     <b>유형의 객체</b> 책상, 의자, 자동차, TV와 같은 사물<br>
	 *     <b>무형의 객체</b> 수학공식, 프로그램 에러와 같은 논리나 개념<br>
	 *     클래스는 단지 객체를 생성하는데 사용될 뿐, 객체 그 자체는 아니다. 우리가 원하는 기능의 객체를 사용하기 위해서는 먼저 클래스로부터<br>
	 *     객체를 생성하는 과정이 선행되어야 한다.<br>
	 *     프로그래밍에서는 먼저 클래스를 작성한 다음, 클래스로부터 객체를 생성하여 사용한다.<br>
	 *     <small>※객체를 사용한다는 것은 객체가 가지고 있는 속성과 기능을 사용한다는 뜻이다.</small>
	 * </p>
	 */
	class Memo01{}

	/**
	 * <p>
	 *     <h5>2.2 객체와 인스턴스</h5><br>
	 *     클래스로부터 객체를 만드는 과정을 클래스의 인스턴스(instantiate)라고 하며, 어떤 클래스로부터 만들어진 객체를 그 클래스의 인스턴스(instnace)라고 한다.<br>
	 *     인스턴스는 어떤 클래스로부터 만들어진 것인지를 강조하는 보다 구체적인 의미를 갖고 있다.<br>
	 *     <pre>
	 *     	            인스턴스화
	 * 	      클래스 --------> 인스턴스(객체)
	 *     </pre>
	 * </p>
	 */
	class Memo02{}

	/**
	 * <p>
	 *     <h5>2.3 객체의 구성요소 - 속성과 기능</h5><br>
	 *     객체는 속성과 기능, 두 종류의 구성요소로 이루어져 있으며, 일반적으로 객체는 다수의 속성과 다수의 기능을 갖는다.<br>
	 *     객체는 속성과 기능의 집합이라고 할 수 있다.<br>
	 *     객체가 가지고 있는 속성과 기능을 그 객체의 멤버(구성원, member)라 한다.<br>
	 *     클래스란 객체를 정의한 것이므로, 클래스에는 객체의 모든 속성과 기능이 정의되어있다.<br>
	 *     클래스로부터 객체를 생성하면, 클래스에 정의된 속성과 기능을 가진 객체가 만들어지는 것이다.<br>
	 *     <b>속성(property)</b> - 멤버변수(member variable), 특성(attribute), 필드(field), 상태(state)<br>
	 *     <b>기능(function)</b> - 메서드(method), 함수(function), 행위(behavior)<br>
	 *     <small>※멤버변수와 메서드를 선언하는데 있어서 순서는 관계없지만, 일반적으로 메서드보다는 멤버변수를 먼저 선언하고 멤버변수는 멤버변수끼리 메서드는 메서드끼리 모아 놓는 것이 일반적이다.</small>
	 * </p>
	 */
	class Memo03{}

	/**
	 * <p>
	 *     <h5>2.4 인스턴스의 생성과 사용</h5><br>
	 *     클래스를 선언한 것은 설계도를 작성한 것에 불과하므로, 인스턴스를 생성해야 사용할 수 있다.
	 * </p>
	 */
	static class Tv {
		// TV의 속성(멤버변수)
		String color; // 색상
		boolean power; // 전원상태(on/off)
		int channel; // 채널

		// TV의 기능(메서드)
		void power() { power = !power; } // TV를 켜거나 끄는 기능을 하는 메서드
		void channelUp() { ++channel; } // TV의 채널을 높이는 기능을 하는 메서드
		void channelDown() { --channel; } // TV의 채널을 낮추는 기능을 하는 메서드

	}

	/**
	 * <p>
	 *     1. Tv t;<br>
	 *     Tv클래스 타입의 참조변수 t를 선언한다. 메모리에 참조변수 t를 위한 공간이 마련된다. 아직 인스턴스가 생성되지 않았으므로 참조변수로 아무것도 할 수 없다.<br>
	 *     2. t = new Tv();<br>
	 *     연산자 new에 의해 Tv클래스의 인스턴스가 메모리의 빈 공간에 생성된다. 주소가 0x100인 곳에 생성되었다고 가정하자. 이 때,<br>
	 *     멤버변수는 각 자료형에 해당하는 기본값으로 초기화 된다. 그 다음에는 대입연산자(=)에 의해서 생성된 객체의 주소값이 참조변수 t에<br>
	 *     저장된다. 이제는 참조변수 t를 통해 Tv인스턴스에 접근할 수 있다. 인스턴스를 다루기 위해서는 참조변수가 반드시 필요하다.<br>
	 *     3. t.channel = 7;<br>
	 *     참조변수 t에 저장된 주소에 있는 인스턴스의 멤버변수 channel에 7을 저장한다. 여기서 알 수 있는 것처럼. 인스턴스의 멤버변수(속성)<br>
	 *     를 사용하려면 '참조변수.멤버변수'와 같이 하면된다.<br>
	 *     4. t.channelDown(); <br>
	 *     참조변수 t가 참조하고 있는 Tv인스턴스와 channelDown메서드를 호출한다. channel Down메서드는 멤버변수 channel에 저장되어 있는 값을 1 감소시킨다.<br>
	 *     5. System.out.println("현재 채널은 " + t.channel + " 입니다.");<br>
	 *     참조변수 t가 참조하고 있는 Tv인스턴스의 멤버변수 channel에 저장되어 있는 값을 출력한다.<br>
	 *     현재 channel의 값은 6이므로 '현재 채널은 6 입니다.'7가 화면에 출력된다.<br>
	 *     <b>인스턴스는 참조변수를 통해서만 다룰 수 있으며, 참조변수의 타입은 인스턴스의 타입과 일치해야한다.</b><br>
	 *     같은 클래스로부터 생성되었을지라도 각 인스턴스의 속성(멤버변수)은 서로 다른 값을 유지할 수 있으며, 메서드의 내용은 모든 인스턴스에 대해 동일하다.<br>
	 *     참조변수에는 하나의 값(주소)만이 저장될 수 있으므로 둘 이상의 참조변수가 하나의 인스턴스를 가리키는(참조하는) 것은 가능하지만<br>
	 *     하나의 참조변수로 여러 개의 인스턴스를 가리키는 것은 가능하지 않다.
	 * </p>
	 */
	static class TvTest {

		public static void main(String[] args) {
			Tv t; // Tv의 인스턴스를 참조하기 위한 변수 t를 선언
			t = new Tv(); // Tv인스턴스를 생성한다.
			t.channel = 7; // Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
			t.channelDown(); // Tv인스턴스의 메서드 channelDown()을 호출한다.
			System.out.println("현재 채널은 " + t.channel + " 입니다.");
		}

	}

	static class TvTest2 {

		public static void main(String[] args) {
			Tv t1 = new Tv();
			Tv t2 = new Tv();

			System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
			System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

			t1.channel = 7;
			System.out.println("t1의 channel값을 7로 변경하엿습니다.");

			System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
			System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		}

	}

	static class TvTest3 {

		public static void main(String[] args) {
			Tv t1 = new Tv();
			Tv t2 = new Tv();

			System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
			System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

			t2 = t1;
			t1.channel = 7;
			System.out.println("t1의 channel값을 7로 변경하엿습니다.");

			System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
			System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		}

	}

	/**
	 * <p>
	 *     <h5>2.5 객체 배열</h5><br>
	 *     많은 수의 객체를 다뤄야할 때 객체 역시 배열로 다루는 것이 가능하며, 이를 '객체 배열'이라고한다.<br>
	 *     그렇다고 객체 배열 안에 객체가 저장되는 것은 아니고, 객체의 주소가 저장된다. 사실 객체 배열은 참조변수들을 하나로 묶은 참조변수 배열인 것이다.<br>
	 *     객체 배열을 생성하는 것은, 그저 객체를 다루기 위한 참조변수들이 만들어진 것일 뿐, 아직 객체가 저장되지 않았다.<br>
	 *     객체를 생성해서 객체 배열의 각 요소에 저장하는 것을 잊으면 안 된다.
	 * </p>
	 */
	static class Memo04 {}

	static class TvTest4{

		public static void main(String[] args) {
			Tv[] tvArr = new Tv[3];	 // 길이가 3인 Tv객체 배열

			//Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
			for(int i = 0; i < tvArr.length; i++) {
				tvArr[i] = new Tv();
				tvArr[i].channel = i+10; // tvArr[i]의 channel에 i+10을 저장
			}

			for(int i = 0; i < tvArr.length; i++) {
				tvArr[i].channelUp(); // tvArr[i]의 메서드를 호출. 채널이 1증가
				System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
			}

		} // main의 끝

	}

	/**
	 * <p>
	 *     <h5>2.6 클래스의 또 다른 정의</h5><br>
	 *     1. 클래스 - 데이터와 함수의 결합<br>
	 *     프로그래밍언어에서 데이터 처리를 위한 데이터 저장형태의 발전과정은 다음과 같다.<br>
	 *     변수 -> 배열 -> 구조체 -> 클래스
	 *     <br>
	 *     <b>1.변수 - 하나의 데이터를 저장할 수 있는 공간</b><br>
	 *     <b>2.배열 - 같은 종류의 여러 데이터를 하나의 집합으로 저장할 수 있는 공간</b><br>
     *     <b>3.구조체 - 서로 관련된 여러 데이터를 종류의 관계없이 하나의 집합으로 저장할 수 있는 공간</b><br>
	 *     <b>4.클래스 - 데이터와 함수의 결합(구조체 + 함수)</b><br>
	 *     서로 관련된 변수들을 정의하고 이들에 대한 작업을 수행하는 함수들을 함께 정의한 것이 바로 클래스이다.<br>
	 *     2. 클래스 - 사용자정의 타입(user-defined type)<br>
	 *     프로그래밍언어에서 제공하는 자료형(primitive type)외에 프로그래머가 서로 관련된 변수들을 묶어서 하나의 타입으로 새로 추가하는 것을<br>
	 *     사용자정의 타입(user-defined type)이라고 한다.<br>
	 *     자바와 같은 객체지향언어에서는 클래스가 곧 사용자 정의 타입이다.
	 * </p>
	 */
	static class Memo05 {}

}
