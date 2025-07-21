package chapter03;

import static java.lang.System.*;

/**
 * <h1>4. 비교 연산자</h1><br>
 * 비교 연산자는 두 피연산자를 비교하는 데 사용되는 연산자다. 주로 조건문과 반복문의 조건식에 사용되며, 연산결과는 오직 true와 false 둘 중의 하나이다.<br>
 * 비교 연산자 역시 이항 연산자이므로 비교하는 피연산자의 타입이 서로 다를 경우에는 자료형의 범위가 큰 쪽으로 자동 형변환하여 피연산자의 타입을 일치시킨 후에 비교한다.
 */
public class Chapter03_4 {

	/**
	 * <h5>4.1 대소비교 연산자 < > <= >= </h5><br>
	 * 두 피연산자의 값의 크기를 비교하는 연산자이다. 참이면 true를, 거짓이면 false를 결과로 반환한다.<br>
	 * 기본형 중에서는 boolean 형을 제외한 나머지 자료형에 다 사용할 수 있지만 참조형에는 사용할 수 없다.<br>
	 * <table>
	 *     <thead>
	 *         <th>비교연산자</th>
	 *         <th>연산결과</th>
	 *     </thead>
	 *     <tbody>
	 *         <tr>
	 *             <td>></td>
	 *             <td>좌변 값이 크면, true 아니면 false</td>
	 *         </tr>
	 *         <tr>
	 *             <td><</td>
	 *             <td>좌변 값이 작으면, true 아니면 false</td>
	 *         </tr>
	 *         <tr>
	 *             <td>>=</td>
	 *             <td>좌변 값이 크거나 같으면, true 아니면 false</td>
	 *         </tr>
	 *         <tr>
	 *             <td><=</td>
	 *             <td>좌변 값이 작거나 같으면, true 아니면 false</td>
	 *         </tr>
	 *     </tbody>
	 * </table>
	 */
	class Memo1 {

	}

	/**
	 * <h5>4.2 등가비교 연산자 == !=</h5><br>
	 * 두 피연산자의 값이 같은지 또는 다른지를 비교하는 연산자이다. <br>
	 * 대소비교 연산자(<,>, <=, >=)와는 달리, 기본형은 물론 참조형, 즉 모든 자료형에 사용할 수 있다.<br>
	 * 기본형의 경우 변수에 저장되어 있는 값이 같은지를 알 수 있고, 참조형의 경우 객체의 주소값을 저장하기 때문에 두 개의 피연산자(참조변수)가 같은 객체를 가리키고 있는지를 알 수 있다.<br>
	 * 기본형과 참조형은 서로 형변환이 가능하지 않기 때문에 등가비교 연산자(==, !=)로 기본형과 참조형을 비교할 수 없다.<br>
	 * <table>
	 *     <thead>
	 *         <th>비교연산자</th>
	 *         <th>연산결과</th>
	 *     </thead>
	 *     <tbody>
	 *         <tr>
	 *             <td>==</td>
	 *             <td>두 값이 같으면, true 아니면 false</td>
	 *         </tr>
	 *         <tr>
	 *             <td>!=</td>
	 *             <td>두 값이 다르면, true 아니면 false</td>
	 *         </tr>
	 *     </tbody>
	 * </table>
	 * <br>
	 * '='는 이미 배운 것과 같이 변수에 값을 저장할 때 사용하는 '대입연산자'이기 때문에 '=='로 두 값이 같은지 비교하는 연산자를 표현한다.<br>
	 * 비교 연산자도 이항 연산자이므로 연산을 수행하기 전에 형변환을 통해 두 피연산자의 타입을 같게 맞춘 다음 피연산자를 비교한다.
	 */
	class Memo2 {

	}

	/**
	 * <h5>문자열의 비교</h5><br>
	 * 두 문자열을 비교할 때는, 비교 연산자 '=='대신 equals()라는 메서드를 사용해야 한다.<br>
	 * 비교 연산자는 두 문자열이 완전히 같은 것인지 비교할 뿐이므로, 문자열의 내용이 같은지 비교하기 위해서는 equals()를 사용하는 것이다.<br>
	 * equals()는 비교하는 두 문자열이 같으면 true를, 다르면 false를 반환한다.<br>
	 * 원래 String은 클래스이므로, 아래와 같이 new를 사용해서 객체를 생성해야한다.<br>
	 * <pre><code>
	 *     String str = new String("abc"); // String클래스의 객체를 생성
	 *     String str = "abc"; // 위의 문장을 간단히 표현
	 * </code></pre>
	 * <br>
	 */
	class Memo3 {

	}

	/**
	 * str2와 "abc"의 내용이 같은데도 "=="로 비교하면, false를 결과로 얻는다.<br>
	 * 내용은 같지만 서로 다른 객체라서 그렇다. 그러나 equals()는 객체가 달라도 내용이 같으면 true를 반환한다.<br>
	 * 그래서 문자열을 비교할 때는 항상 equals()를 사용해야 한다는 것을 기억하자.<br>
	 * 대소문자를 구별하지 않고 비교하고 싶으면, equals()대신 equalsIgnoreCase()를 사용하면 된다.
	 */
	class Ex01 {

		public static void main(String[] args) {
			String str1 = "abc";
			String str2 = new String("abc");

			out.printf("\"abc\"==\"abc\" ? %b%n", "abc" == "abc");
			out.printf(" str1==\"abc\"  %b%n", str1 == "abc");
			out.printf(" str2==\"abc\" ? %b%n", str2 == "abc");
			out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
			out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
			out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
			out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
		}

	}

}
