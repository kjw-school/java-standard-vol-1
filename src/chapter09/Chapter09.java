package chapter09;

/**
 * <h1>1. java.lang패키지</h1><hr>
 * java.lang패키지는 자바프로그래밍에 가장 기본이 되는 클래스들을 포함하고 있다.<br>
 * 그렇기 때문에 java.lang패키지의 클래스들은 import문 없이도 사용할 수 있게 되어 있다.<br>
 * 그 동안 String클래스나 System클래스를 import문 없이 사용할 수 있었던 이유가 바로 java.lang패키지에 속한 클래스들이기 때문이었던 것이다.
 */
public class Chapter09 {

	/**
	 * <h5>1.3 StringBuffer클래스와 StringBuilder클래스</h5><br>
	 * String클래스는 인스턴스를 생성할 때 저장된 문자열을 변경할 수 없지만 StringBuffer클래스는 변경이 가능하다.<br>
	 * 내부적으로 문자열 편집을 위한 버퍼(buffer)를 가지고 있으며, StringBuffer인스턴스를 생성할 때 그 크기를 지정할 수 있다.<br>
	 * 편집할 문자열의 길이를 고려하여 버퍼의 길이를 충분히 잡아주는 것이 좋다.<br>
	 * 편집 중인 문자열이 버퍼의 길이를 넘어서게 되면 버퍼의 길이를 늘려주는 작업이 추가로 수행되어야하기 때문에 작업효율이 떨어진다.<br>
	 * StringBuffer클래스는 String클래스와 유사한 점이 많다.<br>
	 * StringBuffer클래스는 String클래스와 같이 문자열을 저장하기 위한 char형 배열의 참조변수를 인스턴스변수로 선언해 놓고 있다.<br>
	 * StringBuffer인스턴스가 생성될 때, char형 배열이 생성되며 이 때 생성된 char형 배열을 인스턴스변수 value가 참조하게 된다.
	 */
	class Memo01 {

	}

	/**
	 * <h5>StringBuffer의 생성자</h5><br>
	 * StringBuffer클래스의 인스턴스를 생성할 때, 적절한 길이의 char형 배열이 생성되고, 이 배열은 문자열을 저장하고 편집하기 위한 공간(buffer)으로 사용된다.<br>
	 * StringBuffer인스턴스를 생성할 때는 생성자 StringBuffer(int length)를 사용해서 StringBuffer인스턴스에 저장될 문자열의 길이를 고려하여 충분히 여유있는 크기로 지정하는 것이 좋다.<br>
	 * StringBuffer인스턴스를 생성할 때, 버퍼의 크기를 지정해주지 않으면 16개의 문자를 저장할 수 있는 크기의 버퍼를 생성한다.<br>
	 * StringBuffer인스턴스로 문자열을 다루는 작업을 할 때, 버퍼의 크기가 작업하려는 문자열의 길이보다 작을 때는 내부적으로 버퍼의 크기를 증가시키는 작업이 수행된다.<br>
	 * 배열의 길이는 변경될 수 없으므로 새로운 길이의 배열을 생성한 후에 이전 배열의 값을 복사해야 한다.
	 * <code>
	 *     ...<br>
	 *     // 새로운 길이(newCapacity)의 배열을 생성한다. newCapacity는 정수값이다.<br>
	 *     char newValue[] = new char[newCapacity];<br>
	 *     <br>
	 *     //배열 value의 내용을 배열 newValue로 복사한다.<br>
	 *     System.arraycopy(value, 0, newValue, 0, count); // count는 문자열의 길이<br>
	 *     value = newValue; // 새로 생성된 배열의 주소를 참조변수 value에 저장<br>
	 * </code><br>
	 * 이렇게 함으로써 StringBuffer클래스의 인스턴스 변수 value는 길이가 증가된 새로운 배열을 참조하게 된다.
	 */
	class Memo02 {

	}

	/**
	 * <h5>StringBuffer의 변경</h5><br>
	 * String과 달리 StringBuffer는 내용을 변경할 수 있다.<br>
	 * <code>
	 *     StringBuffer sb = new StringBuffer("abc");<br>
	 *     그리고 sb에 문자열 "123"을 추가하면,<br>
	 *     sb.append("123"); // sb의 내용 뒤에 "123"을 추가한다.<br>
	 * </code><br>
	 * append()는 반환타입이 StringBuffer인데 자신의 주소를 반환한다. 그래서 아래와 같은 문장이 수행되면, sb에 새로운 문자열이 추가되고 sb자신의 주소를 반환하여 sb2에는 sb의 주소인 0x100이 저장된다.<br>
	 * <code>
	 *     StringBuffer sb2 = sb.append("ZZ") // sb의 내용뒤에 "ZZ"를 추가한다.<br>
	 *     System.out.println(sb); // abc123ZZ<br>
	 *     System.out.println(sb2); // abc123ZZ<br>
	 * </code><br>
	 * sb와 sb2가 모두 같은 StringBuffer인스턴스를 가리키고 있으므로 같은 내용이 출력된다.<br>
	 * 그래서 하나의 StringBuffer인스턴스에 대해 아래와 같이 연속적으로 append()를 호출하는 것이 가능하다.<br>
	 * <code>
	 *     StringBuffer sb = new StringBuffer("abc");<br>
	 *     sb.append("123");<br>
	 *     sb.append("ZZ");
	 * </code><br>
	 * ↓<br>
	 * <code>
	 *     StringBuffer sb = new StringBuffer("abc");<br>
	 *     sb.append("123").append("ZZ");
	 * </code>
	 */
	class Memo3 {

	}

	/**
	 * <h5>StringBuffer의 비교</h5><br>
	 * String클래스에서는 equals메서드를 오버라이딩해서 문자열의 내용을 비교하도록 구현되어 있지만<br>
	 * StringBuffer클래스는 equals메서드를 오버라딩하지 않아서 StringBuffer클래스의 equals메서드를 사용해도 등가비교연산자(==)로 비교한 것과 같은 결과를 얻는다.<br>
	 * <code>
	 *     StringBuffer sb = new StringBuffer("abc");<br>
	 *     StringBuffer sb2 = new Stringbuffer("abc");<br>
	 *     System.out.println(sb == sb2); // false<br>
	 *     System.out.println(sb.equals(sb2)); // false
	 * </code><br>
	 * 반면에 toString()은 오버라이딩되어 있어서 StringBuffer인스턴스에 toString()을 호출하면, 담고있는 문자열을 String으로 반환한다.<br>
	 * StringBuffer인스턴스에 담긴 문자열을 비교하기 위해서는 StringBuffer인스턴스 toString()을 호출해서 String인스턴스를 얻은 다음, 여기에 equals메서드를 사용해서 비교해야한다.
	 */
	class Memo4 {
	}

	static class StringBufferEx1 {
		public static void main(String[] args) {
			StringBuffer sb = new StringBuffer("abc");
			StringBuffer sb2 = new StringBuffer("abc");

			System.out.println("sb == sb2 ? " + (sb == sb2));
			System.out.println("sb.equals(sb2) ? " + (sb.equals(sb2)));

			// StringBuffer의 내용을 String으로 변환한다.
			String s = sb.toString(); // String s = new String(sb); 와 같다
			String s2 = sb2.toString();

			System.out.println("s.equals(s2) ? " + s.equals(s2));

		}
	}

	/**
	 * <h5>StringBuilder 란?</h5><br>
	 * StringBuffer는 멀티쓰레드에 안전(thread safe)하도록 동기화되어 있다.<br>
	 * 동기화가 StringBuffer의 성능을 떨어뜨린다는 것만 이해하면 된다.<br>
	 * 멀티쓰레드로 작성된 프로그램이 아닌 경우, StringBuffer의 동기화는 불필요하게 성능만 떨어뜨리게 한다.<br>
	 * StringBuffer에서 쓰레드의 동기화만 뺀 StringBuilder가 새로 추가되었다.<br>
	 * StringBuilder는 StringBuffer와 완전히 똑같은 기능으로 작성되어 있어서, 소스코드에서 StringBuffer대신 StringBuilder를 사용하도록 바꾸기만 하면 된다.<br>
	 * StringBuffer도 충분히 성능이 좋기 때문에 성능향상이 반드시 필요한 경우를 제외하고는 기존에 작성한 코드에서 StringBuffer를 StringBuilder로 굳이 바꿀 필요는 없다.
	 */
	class Memo5 {
	}

	/**
	 * <h5>1.4 Math클래스</h5><br>
	 * Math클래스는 기본적인 수학계산에 유용한 메서드로 구성되어 있다.<br>
	 * Math클래스의 생성자는 접근 제어자가 private이기 때문에 다른 클래스에서 Math인스턴스를 생성할 수 없도록 되어있다.<br>
	 * 그 이유는 클래스 내에 인스턴스변수가 하나도 없어서 인스턴스를 생성할 필요가 없기 때문이다.<br>
	 */
	class Memo06 {

	}

	/**
	 * <h5>올림, 버림, 반올림</h5><br>
	 * 소수점 n번째 자리에서 반올림한 값을 얻기 위해서는 round()를 사용해야 하는데, 이 메서드는 항상<br>
	 * 소수점 첫째자리에서 반올림을 해서 정수값(long)을 결과로 돌려준다.<br>
	 * <pre><code>
	 *     1. 원래 값에 100을 곱한다.
	 *     		90.7552 * 100 -> 9075.52
	 *     2. 위의 결과에 Math.round()를 사용한다.
	 *     		Math.round(9075.52) -> 9076
	 *     3. 위의 결과를 다시 100.0으로 나눈다.
	 *     		9076 / 100.0 -> 90.76
	 *     		9076 / 100 -> 90
	 * </code></pre><br>
	 * 만일 정수형 값인 100 또는 100L로 나눈다면, 결과는 정수형 값을 얻게 될 것이다.<br>
	 * 정수형 간의 연산에서는 반올림이 이루어지지 않는다는 것을 반드시 기억하자.<br>
	 * 반올림이 필요하지 않다면 round()를 사용하지 않고 단순히 1000으로 곱하고 1000.0으로 나누기만 하면 된다.<br>
	 * rint()도 round()처럼 소수점 첫 째자리에서 반올림하지만, 반환값이 double이다.<br>
	 * 그리고 rint()는 두 정수의 정 가운데 있는 값은 가장 가까운 짝수 정수를 반환한다.<br>
	 * round()는 소수점 첫째자리가 5일 때, 더 큰 값으로 반올림하니까 01이 되지만, rint()는 -1.5와 같이 홀수(-1.0)와 짝수(-2.0)의 딱 중간에 있는 경우 짝수(-2.0)를 결과로 반환한다.<br>
	 * 그리고 음수에서는 양수와 달리 -1.5를 버림(floor)하면 -2.0이 된다.
	 */
	class Memo07 {
	}

	/**
	 * <h5>예외를 발생시키는 메서드</h5><br>
	 * 메서드 이름에 'Exact'가 포함된 메서드들이 JDK1.8부터 새로 추가되었다. 이들은 정수형간의 연산에서 발생할 수 있는 오버플로우(overflow)를 감지하기 위한 것이다.<br>
	 * 연산자는 단지 결과를 반환할 뿐, 오버플로우의 발생여부에 대해 알려주지 않는다. 그러나 위의 메서드들은 오버플로우가 발생하면, 예외(ArithmeticException)를 발생시킨다.<br>
	 * negateExact(int a)는 매개변수의 부호를 반대로 바꿔주는데 무슨 예외가 발생할까?라고 생각할지도 모르겠다. 부호를 반대로 바꾸는 식은 '~a+1'이다. '~a'의 결과가 int의 최대값이면, 여기에 1을 더하니까 오버플로우가 발생할 수 있는 것이다.
	 */
	class Memo08 {

	}

	/**
	 * <h5>StrictMath클래스</h5><br>
	 * Math클래스는 최대한의 성능을 얻기 위해 JVM이 설치된 OS의 메서드를 호출해서 사용한다. 즉, OS에 의존적인 계산을 하고 있는 것이다.<br>
	 * 이러한 차이를 없애기 위해 성능은 다소 포기하는 대신, 어떤 OS에서 실행되어도 항상 같은 결과를 얻도록 Math클래스를 새로 작성한 것이 StrictMath클래스이다.
	 */
	class Memo09 {

	}

	/**
	 * <h5>1.5 래퍼(wrapper) 클래스</h5><br>
	 * 객체지향 개념에서 모든 것은 객체로 다루어져야 한다. 그러나 자바에서는 8개의 기본형을 객체로 다루지 않는데 이것이 바로 자바가 완전한 객체지향 언어가 아니라는 얘기를 듣는 이유이다.<br>
	 * 그 대신 보다 높은 성능을 얻을 수 있었다. 기본형(primitive type)변수도 어쩔 수 없이 객체로 다뤄야 하는 경우가 있다.<br>
	 * 매개변수로 객체를 요구할 때, 기본형 값이 아닌 객체로 저장해야할 때, 객체간의 비교가 필요할 때 등등의 경우에는 기본형 값들을 변환하여 작업을 수행해야 한다.<br>
	 * 이 때 사용되는 것이 래퍼(wrapper)클래스이다. 8개의 기본형을 대표하는 8개의 래퍼클래스가 있는데, 이 클래스들을 이용하면 기본형 값을 객체로 다룰 수 있다.<br>
	 * char형과 int형을 제외한 나머지는 자료형 이름의 첫 글자를 대문자로 한 것이 각 래퍼 클래스의 이름이다.<br>
	 * 래퍼 클래스의 생성자는 매개변수로 문자열이나 각 자료형의 값들을 인자로 받는다. 이 때 주의해야할 것은 생성자의 매개변수로 문자열을 제공할 때, 각 자료형에 알맞은 문자열을 사용해야한다는 것이다.<br>
	 * 래퍼 클래스들은 객체생성 시에 생성자의 인자로 주어진 각 자료형에 알맞은 값을 내부적으로 저장하고 있다.<br>
	 * <table>
	 *     <thead>
	 *         <th>기본형</th>
	 *         <th>래퍼클래스</th>
	 *         <th>생성자</th>
	 *         <th>활용예</th>
	 *     </thead>
	 *     <tbody>
	 *         <tr>
	 *             <td>boolean</td>
	 *             <td>Boolean</td>
	 *             <td>
	 *                 Boolean(boolean value)<br>
	 *                 Boolean(String s)
	 *             </td>
	 *             <td>
	 *                 Boolean b = new Boolean(true);<br>
	 *                 Boolean b2 = new Boolean("true");
	 *             </td>
	 *         </tr>
	 *         <tr>
	 *             <td>char</td>
	 *             <td>Character</td>
	 *             <td>Character(char value)</td>
	 *             <td>Character c = new Character('a');</td>
	 *         </tr>
	 *         <tr>
	 *             <td>byte</td>
	 *             <td>Byte</td>
	 *             <td>
	 *                 Byte(byte value)<br>
	 *                 Byte(String s)
	 *             </td>
	 *             <td>
	 *                 Byte b = new Byte(10);<br>
	 *                 Byte b2 = new Byte("10");
	 *             </td>
	 *         </tr>
	 *         <tr>
	 *             <td>short</td>
	 *             <td>Short</td>
	 *             <td>
	 *                 Short(short value)<br>
	 *                 Short(String s)
	 *             </td>
	 *             <td>
	 *                 Short s = new Short(10);<br>
	 *                 Short s2 = new Short("10")
	 *             </td>
	 *         </tr>
	 *         <tr>
	 *             <td>int</td>
	 *             <td>Integer</td>
	 *             <td>
	 *                 Integer(int value)<br>
	 *                 Integer(String s)
	 *             </td>
	 *             <td>
	 *                 Integer i = new Integer(100);<br>
	 *                 Integer i2 = new Integer("100");
	 *             </td>
	 *         </tr>
	 *         <tr>
	 *             <td>long</td>
	 *             <td>Long</td>
	 *             <td>
	 *                 Long(long value)<br>
	 *                 Long(String s)
	 *             </td>
	 *             <td>
	 *                 Long l = new Long(100);<br>
	 *                 Long l2 = new Long("100");
	 *             </td>
	 *         </tr>
	 *         <tr>
	 *             <td>float</td>
	 *             <td>Float</td>
	 *             <td>
	 *                 Float(double value)<br>
	 *                 Float(float value)<br>
	 *                 Float(String s)
	 *             </td>
	 *             <td>
	 *                 Float f = new Float(1.0);<br>
	 *                 Float f2 = new Float(1.0f);<br>
	 *                 Float f3 = new Float("1.0f");
	 *             </td>
	 *         </tr>
	 *         <tr>
	 *             <td>double</td>
	 *             <td>Double</td>
	 *             <td>
	 *                 Double(double value)<br>
	 *                 Double(String s)
	 *             </td>
	 *             <td>
	 *                 Double d = new Double(1.0);<br>
	 *                 Double d2 = new Double("1.0");
	 *             </td>
	 *         </tr>
	 *     </tbody>
	 * </table>
	 * <br>
	 * 래퍼 클래스들은 모두 equals()가 오버라이딩되어 있어서 주소값이 아닌 객체가 가지고 있는 값을 비교한다.<br>
	 * 오토박싱이 된다고 해도 Integer객체에 비교연산자를 사용할 수 없다. 대신 compareTo()를 제공한다.<br>
	 * toString()도 오버라이딩되어 있어서 객체가 가지고 있는 값을 문자열로 변환하여 반환한다. 래퍼 클래들은 MAX_VALUE, MIN_VALUE, SIZE, BYTES, TYPE 등의 static상수를 공통적으로 가지고 있다.
	 */
	class Memo10 {

	}

	/**
	 * <h5>Number클래스</h5><br>
	 * 이 클래스는 추상클래스로 내부적으로 숫자를 멤버변수로 갖는 래퍼 클래스들의 조상이다.<br>
	 * 기본형 중에서 숫자와 관련된 래퍼 클래스들은 모두 Number클래스의 자손이라는 것을 알 수 있다.<br>
	 * Number클래스 자손으로 BigInteger와 BigDecimal 등이 있는데, BigInteger는 long으로도 다룰 수 없는 큰 범위의 정수를, BigDecimal은 double로도 다룰 수 없는 큰 범위의 부동 소수점수를 처리하기 위한 것으로 연산자의 역할을 대신하는 다양한 메서드를 제공한다.<br>
	 * Number클래스의 실제 소스는 아래와 같다. 객체가 가지고 있는 값을 숫자와 관련된 기본형으로 변환하여 반환하는 메서드들을 정의하고 있다.<br>
	 * <pre><code>
	 *     public abstract class Number implements java.io.Serializable {
	 *         public abstract int intValue();
	 *         public abstract long longValue();
	 *         public abstract float floatValue();
	 *         public abstract double doubleValue();
	 *
	 *         public byte byteValue() {
	 *             return (byte)intValue();
	 *         }
	 *
	 *         public short shortValue() {
	 *             return (shrot)intValue();
	 *         }
	 *
	 *     }
	 * </code></pre>
	 */
	class Memo11 {

	}

	/**
	 * <h5>문자열을 숫자로 변환하기</h5><br>
	 */
	class Memo12 {

	}

}
