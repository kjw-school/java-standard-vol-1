package chapter05;

/**
 * <h1>2. String배열</h1>
 */
public class Chapter05_2 {

	/**
	 * <h5>2.1 String배열의 선언과 생성</h5><br>
	 * 배열의 타입이 String인 경우에도 int배열의 선언과 생성방법은 다르지 않다.<br>
	 * <pre><code>
	 *     String[] name = new String[3]; // 3개의 문자열을 담을 수 있는 배열을 생성한다.
	 * </code></pre>
	 * 변수의 타입에 따른 기본값<br>
	 * <table>
	 *     <thead>
	 *         <th>자료형</th>
	 *         <th>기본값</th>
	 *     </thead>
	 *     <tbody>
	 *         <tr>
	 *             <td>boolean</td>
	 *             <td>false</td>
	 *         </tr>
	 *         <tr>
	 *             <td>char</td>
	 *             <td>u0000</td>
	 *         </tr>
	 *         <tr>
	 *             <td>byte, short, int</td>
	 *             <td>0</td>
	 *         </tr>
	 *         <tr>
	 *             <td>long</td>
	 *             <td>0L</td>
	 *         </tr>
	 *         <tr>
	 *             <td>float</td>
	 *             <td>0.0f</td>
	 *         </tr>
	 *         <tr>
	 *             <td>double</td>
	 *             <td>0.0d 또는 0.0</td>
	 *         </tr>
	 *         <tr>
	 *             <td>참조형변수</td>
	 *             <td>null</td>
	 *         </tr>
	 *     </tbody>
	 * </table>
	 */
	class Memo1 {

	}

	/**
	 * <h5>2.2 String배열의 초기화</h5><br>
	 * 기본형 배열이 아닌 경우, 즉, 참조형 배열의 경우 배열에 저장되는 것은 객체의 주소이다.
	 */
	class Memo2 {

	}

	/**
	 * <h5>2.3 char배열과 String클래스</h5><br>
	 * 지금까지 여러 문자, 즉 문자열을 저장할 때 String타입의 변수를 사용했다.<br>
	 * 사실 문자열이라는 용어는 '문자를 연이어 늘어놓은 것'을 의미하므로 문자배열인 char배열과 같은 뜻이다.<br>
	 * 자바에서는 char배열이 아닌 String클래스를 이용해서 문자열을 처리하는 이유는 String클래스가 char배열에 여러 가지 기능을 추가하여 확장한 것이기 때문이다.<br>
	 * <pre><code>
	 *     String클래스는 char배열에 기능(메서드)을 추가한 것이다.
	 * </code></pre>
	 * <br>
	 * 객체지향언어에서는 데이터와 그에 관련된 기능을 하나의 클래스에 묶어서 다룰 수 있게 한다.<br>
	 * 서로 관련된 것들끼리 데이터와 기능을 구분하지 않고 함께 묶는 것이다.<br>
	 * '기능'은 함수를 의미하며, 메서드는 객체지향 언어에서 '함수'대신 사용하는 용어일 뿐 함수와 같은 뜻이다.<br>
	 * char배열과 String클래스의 한 가지 중요한 차이가 있는데, String객체(문자열)는 읽을 수 만 있을 뿐 내용을 변경할 수 없다는 것이다.
	 */
	class Memo3 {

	}

	/**
	 * <h5>String클래스의 주요 메서드</h5><br>
	 * String클래스의 주요 메서드<br>
	 * <table>
	 *     <thead>
	 *         <th>메서드</th>
	 *         <th>설명</th>
	 *     </thead>
	 *     <tbody>
	 *         <tr>
	 *             <td>char charAt(int index)</td>
	 *             <td>문자열에서 해당 휘치(index)에 있는 문자를 반환한다.</td>
	 *         </tr>
	 *         <tr>
	 *             <td>int length()</td>
	 *             <td>문자열의 길이를 반환한다.</td>
	 *         </tr>
	 *         <tr>
	 *             <td>String substring(int from, int to)</td>
	 *             <td>문자열에서 해당 범위(from~to)에 있는 문자열을 반환한다.(to는 범위에 포함되지 않음)</td>
	 *         </tr>
	 *         <tr>
	 *             <td>boolean equals(Object obj)</td>
	 *             <td>문자열의 내용이 obj와 같은지 확인한다. 같으면 결과는 true, 다르면 false가 된다.</td>
	 *         </tr>
	 *         <tr>
	 *             <td>char[] toCharArray()</td>
	 *             <td>문자열을 문자배열(char[])로 변환해서 반환한다.</td>
	 *         </tr>
	 *     </tbody>
	 * </table>
	 * <br>
	 * charAt메서드는 문자열에서 지정된 index에 있는 한 문자를 가져온다. 배열과 마찬가지로 charAt메서드의 index값은 0부터 시작한다.<br>
	 * substring()은 문자열의 일부를 뽑아낼 수 있다. 주의할 것은 범위의 끝은 포함되지 않는다는 것이다. 예를 들어, index의 범위가 1~4라면 4는 범위에 포함되지 않는다.
	 */
	class Memo4 {

	}
}
