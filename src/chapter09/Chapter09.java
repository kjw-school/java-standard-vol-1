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
	class tempMemo1 {

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
	class tempMemo2 {

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
	class tempMemo3 {

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
	class tempMemo4 {
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
	class tempMemo5 {
	}

	/**
	 * <h5>1.4 Math클래스</h5><br>
	 * Math클래스는 기본적인 수학계산에 유용한 메서드로 구성되어 있다.<br>
	 * Math클래스의 생성자는 접근 제어자가 private이기 때문에 다른 클래스에서 Math인스턴스를 생성할 수 없도록 되어있다.<br>
	 * 그 이유는 클래스 내에 인스턴스변수가 하나도 없어서 인스턴스를 생성할 필요가 없기 때문이다.<br>
	 */
	class tempMemo06 {

	}

	/**
	 * <h5>올림, 버림, 반올림</h5><br>
	 */
	class tempMemo07 {
	}

}
