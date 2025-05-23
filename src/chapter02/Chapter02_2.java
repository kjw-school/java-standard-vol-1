package chapter02;

/**
 * <h1>2. 변수의 타입</h1><br>
 * 우리가 주로 사용하는 값(data)의 종류(type)는 크게 '문자와 숫자'로 나눌 수 있으며, 숫자는 다시 '정수와 실수'로 나눌 수 있다.<br>
 * 이러한 값(data)의 종류(type)에 따라 값이 저장될 공간의 크기와 저장형식을 정의한 것이 자료형(data type)이다.<br>
 * 자료형에는 문자형(char), 정수형(byte, short, int, long), 실수형(float, double) 등이 있으며, 변수를 선언할 때는 저장하려는 값의 특성을 고려하여가장 알맞은 자료형을 변수의 타입으로 선택하면 된다.
 */
public class Chapter02_2 {

	/**
	 * <h5>기본형과 참조형</h5><br>
	 * 자료형은 크게'기본형' 과 '참조형' 두 가지로 나눌 수 있는데, 기본형 변수는 실제 값(data)을 저장하는 반면, 참조형 변수는 어떤 값이 저장되어 있는 주소(memory address)를 값으로 갖는다.<br>
	 * 자바는 C언어와 달리 참조형 변수 간의 연산을 할 수 없으므로 실제 연산에 사용되는 것은 모두 기본형 변수이다.<br>
	 * 기본형(primitive type)<br>
	 * - 논리형(boolean), 문자형(char), 정수형(byte, short, int, long), 실수형(float, double)<br>
	 *   계산을 위한 실제 값을 저장한다. 모두 8개<br>
	 * 참조형(reference type)<br>
	 * - 객체의 주소를 저장한다. 8개의 기본형을 제외한 나머지 타입<br>
	 * 참조형 변수(또는 참조변수)를 선언할 때는 변수의 타입으로 클래스의 이름을 사용하므로클래스의 이름이 참조변수의 타입이 된다. 그래서 새로운 클래스를 작성한다는 것은 새로운 참조형을 추가하는 셈이다.<br>
	 * 클래스이름 변수이름; // 변수의 타입이 기본형이 아닌 것들은 모두 참조변수이다.<br>
	 * 객체를 생성하는 연산자 new의 결과는 생성된 객체의 주소이다.이 주소가 대입연산자'='에 의해서 참조변수에 저장되는 것이다. 이제 참조변수를 통해서 생성된 객체를 사용할 수 있게 된다.<br>
	 * <small>참조형 변수는 null 또는 객체의 주소(4 byte, 0x0~0xFFFFFFFF)를 값으로 갖는다.</small><br>
	 * null은 어떤 객체의 주소도 저장되어 있지 않음을 뜻한다. 단 JVM이 32 bit가 아니라 64 bit라면 참조형 변수의 크기는 8 byte가 된다.
	 */
	class Memo01 {

	}

	/**
	 * <h5>2.1 기본형(primitive type)</h5><br>
	 * 기본형에는 모두 8개의 타입(자료형)이 있으며, 크게 논리형, 문자형, 정수형, 실수형으로 구분된다.<br>
	 * 논리형(boolean) - true와 false중 하나를 값으로 갖으며, 조건식과 논리적 계산에 사용된다.<br>
	 * 문자형(char) - 문자를 저장하는데 사용되며, 변수에 하나의 문자만 저장할 수 있다.<br>
	 * 정수형(byte, short, int, long) - 정수를 저장하는데 사용되며, 주로 int가 사용된다. byte는 이진 데이터를 다룰 때 사용되며, short은 C언어와의 호환을 위해서 추가되었다.<br>
	 * 실수형(float, double) - 실수를 저장하는데 사용되며, 주로 double이 사용된다.<br>
	 * 문자형인 char는 문자를 내부적으로 정수(유니코드)로 저장하기 때문에 정수형과 별반 다르지 않으며, 정수형 또는 실수형과 연산도 가능하다. 반면에 boolean은 다른 기본형과의연산이 불가능하다.<br>
	 * 즉, boolean을 제외한 나머지 7개의 기본형은 서로 연산과 변환이 가능하다.<br>
	 * 정수는 가장 많이 사용되므로 타입을 4가지나 제공한다.<br>
	 * 일반적으로 int를 많이사용한다. 왜냐하면, int는 CPU가 가장 효율적으로 처리할 수 있는 타입이기 때문이다.<br>
	 * <table border="1">
	 *     <thead>
	 *         <th>종류/크기</th>
	 *         <th>1 byte</th>
	 *         <th>2 byte</th>
	 *         <th>4 byte</th>
	 *         <th>8 byte</th>
	 *     </thead>
	 *     <tbody>
	 *         <tr>
	 *             <td>논리형</td>
	 *             <td>boolean</td>
	 *             <td></td>
	 *             <td></td>
	 *             <td></td>
	 *         </tr>
	 *         <tr>
	 *             <td>문자형</td>
	 *             <td></td>
	 *             <td>char</td>
	 *             <td></td>
	 *             <td></td>
	 *         </tr>
	 *         <tr>
	 *             <td>정수형</td>
	 *             <td>byte</td>
	 *             <td>short</td>
	 *             <td>int</td>
	 *             <td>long</td>
	 *         </tr>
	 *         <tr>
	 *             <td>실수형</td>
	 *             <td></td>
	 *             <td></td>
	 *             <td>float</td>
	 *             <td>double</td>
	 *         </tr>
	 *     </tbody>
	 * </table>
	 * <br>
	 * - boolean은 true와 false 두 가지 값만 표현할 수 있으면 되므로 가장 작은 크기인 1 byte.<br>
	 * - char은 자바에서 유니코드(2 byte 문자체계)를 사용햐므로 2 byte<br>
	 * - byte는 크기가 1 byte라서 byte.<br>
	 * - int(4 byte)를 기준으로 짧아서 short(2 byte), 길어서 long(8 byte). (short <-> long)<br>
	 * - float는 실수값을 부동소수점(floating-point)방식으로 저장하기 떄문에 float<br>
	 * - double은 float보다 두 배의 크기(8 byte)를 갖기 때문에 double<br>
	 * <table border="1">
	 *     <thead>
	 *         <td>자료형</td>
	 *         <td>저장 가능한 값의 범위</td>
	 *         <td>bit</td>
	 *         <td>byte</td>
	 *     </thead>
	 *     <tbody>
	 *         <tr>
	 *             <td>boolean</td>
	 *             <td>false, true</td>
	 *             <td>8</td>
	 *             <td>1</td>
	 *         </tr>
	 *         <tr>
	 *             <td>char</td>
	 *             <td>'\u0000' ~ '\uffff'(0~2^16 -1, 0~65535)</td>
	 *             <td>16</td>
	 *             <td>2</td>
	 *         </tr>
	 *         <tr>
	 *             <td>byte</td>
	 *             <td>-128 ~ 127(-2^7 ~ 2^7 -1)</td>
	 *             <td>8</td>
	 *             <td>1</td>
	 *         </tr>
	 *         <tr>
	 *             <td>short</td>
	 *             <td>-32,768 ~ 32,767 (-2^15 ~ 2^15 -1)</td>
	 *             <td>16</td>
	 *             <td>2</td>
	 *         </tr>
	 *         <tr>
	 *             <td>int</td>
	 *             <td>-2,147,483,648 ~ 2,147,483,647 (-2^31 ~ 2^31 -1, 약 +- 20억)</td>
	 *             <td>32</td>
	 *             <td>4</td>
	 *         </tr>
	 *         <tr>
	 *             <td>long</td>
	 *             <td>-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807(-2^63 ~ 2^63 -1)</td>
	 *             <td>64</td>
	 *             <td>8</td>
	 *         </tr>
	 *         <tr>
	 *             <td>float</td>
	 *             <td>1.4E-45 ~ 3.4E38(1.4x10^-45 ~ 3.4x10^38)</td>
	 *             <td>32</td>
	 *             <td>4</td>
	 *         </tr>
	 *         <tr>
	 *             <td>double</td>
	 *             <td>4.9E-324 ~ 1.8E308(4.9x10^-324 ~ 1.8x10^308)</td>
	 *             <td>64</td>
	 *             <td>8</td>
	 *         </tr>
	 *     </tbody>
	 * </table>
	 * <br>
	 * 1 byte = 8 bit<br>
	 * 정수형의 경우 값의 범위는 '-2^n-1 ~ 2^n-1 -1' (n은 bit수)<br>
	 * 실수형은 정수형과 저장형식이 달라서 같은 크기라도 훨씬 큰 값을 표현할 수 있으나 오차가 발생할 수 있다는 단점이 있다.<br>
	 * 그래서 정밀도(precision)가 중요한데, 정밀도가 높을수록 발생할 수 있는 오차의 범위가 줄어든다.<br>
	 */
	class Memo02 {

	}

	/**
	 * <h5>2.2 상수와 리터럴(constant & literal)</h5><br>
	 * '상수(constant)'는 변수와 마찬가지로 '값을 저장할 수 있는 공간'이지만, 변수와 달리 한 번 값을 저장하면 다른 값으로 변경할 수 없다.<br>
	 * 상수를 선언하는 방법은 변수와 동일하며, 단지 변수의 타입 앞에 키워드 'final'을 붙여주기만 하면 된다.<br>
	 * final int MAX_SPEED = 10; // 상수 MAX_SPEED를 선언 & 초기화<br>
	 * 그리고 상수는 반드시 선언과 동시에 초기화해야 하며, 그 후 부터는 상수의 값을 변경하는 것이 허용되지 않는다.<br>
	 * 리터럴(literal)<br>
	 * 원래 12, 123, 3.14, 'A'와 같은 값들이 '상수'인데, 프로그래밍에서는 상수를 '값을 한 번 저장하면 변경할 수 없는 저장공간'으로 정의하였다.<br>
	 * 그래서 상수 대신 리터럴이라는 용어를 사용한다. 리터럴은 단지 우리가 기존에 알고 있던 '상수'의 다른 이름일 뿐이다.<br>
	 * 변수(variable) - 하나의 값을 저장하기 위한 공간<br>
	 * 상수(constant) - 값을 한번만 저장할 수 있는 공간<br>
	 * 리터럴(literal) - 그 자체로 값을 의미하는 것<br>
	 *     변수          리터럴<br>
	 *      ↑     ↗<br>
	 * int year = 2014        ↑<br>
	 * final int MAX_VALUE = 100;<br>
	 *              ↓<br>
	 *             상수<br>
	 * 리터럴의 타입과 접미사<br>
	 * 리터럴에도 타입이 있다. 변수의 타입은 저장될 '값의 타입(리터럴의 타입)'에 의해 결정되므로, 만일 리터럴에 타입이 없다면 변수의 타입도필요없을 것이다.<br>
	 * <table border="1">
	 *     <thead>
	 *         <td>종류</td>
	 *         <td>리터럴</td>
	 *         <td>접미사</td>
	 *     </thead>
	 *     <tbody>
	 *         <tr>
	 *             <td>논리형</td>
	 *             <td>false, true</td>
	 *             <td>없음</td>
	 *         </tr>
	 *         <tr>
	 *             <td>정수형</td>
	 *             <td>123, 0b0101, 077, 0XFF, 100L</td>
	 *             <td>L</td>
	 *         </tr>
	 *         <tr>
	 *             <td>실수형</td>
	 *             <td>3.14, 3.0e8, 1.4f, 0x1, 0p-1</td>
	 *             <td>f, d</td>
	 *         </tr>
	 *         <tr>
	 *             <td>문자형</td>
	 *             <td>'A', '1', '\n'</td>
	 *             <td>없음</td>
	 *         </tr>
	 *         <tr>
	 *             <td>문자열</td>
	 *             <td>"ABC", "123", "A", "true"</td>
	 *             <td>없음</td>
	 *         </tr>
	 *     </tbody>
	 * </table>
	 * long타입의 리터럴에 접미사 'l'또는 'L'을 붙이고, 접미사가 없으면 int타입의 리터럴이다.<br>
	 * byte와 short타입의 리터럴은 별도로 존재하지 않으며 byte와 short타입의 변수에 값을 저장할 때는 int타입의 리터럴을 사용한다.<br>
	 * 16진수라는 것을 표시하기 위해 리터럴 앞에 접두사 '0x' 또는 '0X'를, 8진수의 경우에는 '0'을 붙인다.<br>
	 */
	class Memo03 {

	}

	/**
	 * <h5>타입의 불일치</h5><br>
	 * 리터럴의 타입은 저장될 변수의 타입과 일치하는 것이 보통이지만, 타입이 달라도 저장범위가 넓은 타입에 좁은 타입의 값을 저장하는 것은 허용된다.<br>
	 * byte와 short타입의 리터럴은 따로 존재하지 않으므로 int타입의 리터럴을 사용한다. 단, short타입의 변수가 저장할 수 있는범위에 속한 것이어야 한다.
	 */
	class Memo04 {

	}

	/**
	 * <h5>문자 리터럴과 문자열 리터럴</h5><br>
	 * 문자열 리터럴은 ""안에 아무런 문자도 넣지 않는 것을 허용하며, 이를 빈 문자열(empty string)이라고 한다. 문자 리터럴은 반드시 "안에하나의 문자가 있어야한다.<br>
	 * 피연산자 중 어느 한쪽이 String이면 나머지 한 쪽을 먼저 String으로 변환한 다음 두 String을 결합한다.<br>
	 * 기본형과 참조형의 구별 없이 어떤 타입의 변수도 문자열과 덧셈연산을 수행하면 그 결과가 문자열이 되는 것이다.
	 */
	class Memo05 {

	}

	/**
	 * <h5>2.3 형식화된 출력 - printf()</h5><br>
	 * printf()는 '지시자(specifier)'를 통해 변수의 값을 여러 가지 형식으로 변환하여 출력하는 기능을 가지고 있다. '지시자'는 값을 어떻게출력할 것인지를 지정해주는 역할을 한다.<br>
	 * 정수형 변수에 저장된 값을 10진 정수로 출력할 때는 지시자 '%d'를 사용하며, 변수의 값을 지정된형식으로 변환해서 지시자대신 넣는다.<br>
	 * <table border="1">
	 *     <thead>
	 *         <td>지시자</td>
	 *         <td>설명</td>
	 *     </thead>
	 *     <tbody>
	 *         <tr>
	 *             <td>%b</td>
	 *             <td>불리언(boolean) 형식으로 출력</td>
	 *         </tr>
	 *         <tr>
	 *             <td>%d</td>
	 *             <td>10진(decimal) 정수의 형식으로 출력</td>
	 *         </tr>
	 *         <tr>
	 *             <td>%o</td>
	 *             <td>8진(octal) 정수의 형식으로 출력</td>
	 *         </tr>
	 *         <tr>
	 *             <td>%x, %X</td>
	 *             <td>16진(hexa-decimal) 정수의 형식으로 출력</td>
	 *         </tr>
	 *         <tr>
	 *             <td>%f</td>
	 *             <td>부동 소수점(floating-point)의 형식으로 출력</td>
	 *         </tr>
	 *         <tr>
	 *             <td>%e, %E</td>
	 *             <td>지수(exponent) 표현식의 형식으로 출력</td>
	 *         </tr>
	 *         <tr>
	 *             <td>%c</td>
	 *             <td>문자(character)로 출력</td>
	 *         </tr>
	 *         <tr>
	 *             <td>%s</td>
	 *             <td>문자열(string)로 출력</td>
	 *         </tr>
	 *     </tbody>
	 * </table>
	 */
	class Memo06 {

	}

}
