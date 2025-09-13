package chapter09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <h1>2. 유용한 클래스</h1>
 */
public class Chapter09_2 {

	/**
	 * <h5>2.1 java.util.Objects클래스</h5><br>
	 * Object클래스의 보조 클래스로 Math클래스처럼 모든 메서드가 'static'이다. 객체의 비교나 널 체크(null check)에 유용하다.<br>
	 * isNull()은 해당 객체가 널인지 확인해서 null이면 true를 반환하고 아니면 false를 반환한다. nonNull()은 isNull()과 정반대의 일을 한다.<br>
	 * 즉, !Objects.isNull(obj)와 같다.<br>
	 * requireNonNull()은 해당 객체가 널이 아니어야 하는 경우에 사용한다. 만일 객체가 널이면, NulPointerException을 발생시킨다.<br>
	 * Object클래스에는 두 객체의 등가비교를 위한 equals()만 있고, 대소비교를 위한 compare()가 없는 것이 좀 아쉬웠다.<br>
	 * 그래서인지 Objects에는 compare()가 추가되었다. compare()는 두 비교대상이 같으면 0, 크면 양수, 작으면 음수를 반환한다.<br>
	 * Object클래스에 정의된 equals()가 왜 Object클래스에도 있는지 궁금할 텐데, 이 메서드의 장점은 null검사를 하지 않아도 된다는 데 있다.<br>
	 * <pre><code>
	 *     if(a!= null && a.equals(b)) { // a가 null인지 반드시 확인해야 한다.
	 *     	  ...
	 *     }
	 *     ↓
	 *     if(Objects.equals(a, b) { // 매개변수의 값이 null인지 확인할 필요가 없다.
	 *         ...
	 *     }
	 * </code></pre>
	 * <br>
	 * equals()의 내부에서 a와 b의 널 검사를 하기 때문에 따로 널 검사를 위한 조건식을 따로 넣지 않아도 되는 것이다. 이 메서드의 실제 코드는 다음과 같다.<br>
	 * <pre><code>
	 *     public static boolean equals(Object s, Object b) {
	 *         return ( a == b) || (a != null && a.equals(b));
	 *     }
	 * </code></pre>
	 * <br>
	 * a와 b가 모두 널인 경우에는 참을 반환한다는 점을 빼고는 특별한 것이 없다. equals()보다는 deepEquals()의 존재가 더 반가운데, 이 메서드는 객체를 재귀적으로 비교하기 때문에 다차원 배열의 비교도 가능하다.
	 */
	class Memo01 {

	}

	/**
	 * <h5>2.2 java.util.Random클래스</h5><br>
	 * 난수를 얻는 방법을 생각하면 Math.random()이 떠오를 것이다. 이 외에도 Random클래스를 사용하면 난수를 얻을 수 있다.<br>
	 * 사실 Math.random()은 내부적으로 Random클래스의 인스턴스를 생성해서 사용하는 것이므로 둘 중에서 편한 것을 사용하면 된다.<br>
	 * Math.random()과 Random의 가장 큰 차이점이라면, 종자값(seed)을 설정할 수 있다는 것이다. <br>
	 * 종자값이 같은 Random인스턴스들은 항상 같은 난수를 같은 순서대로 반환한다.<br>
	 * 종자값은 난수를 만드는 공식에 사용되는 값으로 같은 공식에 같은 값을 넣으면 같은 결과를 얻는 것처럼 같은 종자값을 넣으면 같은 난수를 얻게 된다.
	 */
	class Memo2 {

	}

	/**
	 * <h5>Random클래스의 생성자와 메서드</h5><br>
	 * 생성자 Random()은 아래와 같이 종자값을 System.currentTimeMillis()로 하기 때문에 실행할 때마다 얻는 난수가 달라진다.<br>
	 * <small>※ System.currentTimeMillis()는 현재시간을 천분의 1초단위로 변환해서 반환한다.</small><br>
	 * <pre><code>
	 *     int[] fillRand(int[] arr, int from, int to)
	 *     : 배열 arr을 from과 to범위의 값들로 채워서 반환한다.
	 *     int[] fillRand(int[] arr, int[] data)
	 *     : 배열 arr을 배열 data에 있는 값들로 채워서 반환한다.
	 *     int getRand(int from, int to)
	 *     : from과 to범위의 정수 (int)값을 반환한다. from과 to 모두 범위에 포함된다.
	 * </code></pre>
	 */
	class Memo3 {

	}

	/**
	 * <h5>2.3 정규식(Regular Expression) - java.util.regex패키지</h5><br>
	 * 정규식이란 텍스트 데이터 중에서 원하는 조건(패턴, pattern)과 일치하는 문자열을 찾아내기 위해 사용하는 것으로 미리 정의된 기호와 문자를 이용해서 작성한 문자열을 말한다.<br>
	 * 원래 Unix에서 사용하던 것이고 Perl의 강력한 기능이었는데 요즘은 Java를 비롯해 다양한 언어에서 지원하고 있다.<br>
	 * 정규식을 이용하면 많은 양의 텍스트 파일 중에서 원하는 데이터를 손쉽게 뽑아낼 수도 있고 입력된 데이터가 형식에 맞는지 체크할 수도 있다.<br>
	 * Pattern은 정규식을 정의하는데 사용되고 Matcher는 정규식(패턴)을 데이터와 비교하는 역할을 한다.<br>
	 * <pre><code>
	 *     1. 정규식을 매개변수로 Pattern클래스의 static메서드인 Pattern compile(String regex)을 호출하여 Pattern인스턴스를 얻는다.
	 *     Pattern p = Pattern.compile("c[a-z]*");
	 *     2. 정규식으로 비교할 대상을 매개변수로 Pattern클래스의 Matcher matcher(CharSequence input)를 호출해서 Matcher인스턴스를 얻는다.
	 *     Matcher m = p.matcher(data[i]);
	 *     3. Matcher인스턴스에 boolean matches()를 호출해서 정규식에 부합하는지 확인한다.
	 *     if(m.matches())
	 * </code></pre>
	 */
	class Memo4 {

	}

	/**
	 * <pre><code>
	 *     1. 문자열 source에서 "broken"을 m.find()로 찾은 후 처음으로 m.appendReplacement(sb, "drunken");가 호출되면 source의 시작부터 "broken"을 찾은 위치까지의 내용에 "drunken"을 더해서 저장한다.
	 *     - sb에 저장된 내용 : "A drunken"
	 *     2. m.find()는 첫 번째로 발견된 위치의 끝에서부터 다시 검색을 시작하여 두 번째 "broken"을 찾게 된다. 다시 m.appendReplacement(sb, "drunken");가 호출
	 *     - sb에 저장된 내용: "A drunken hand works, but not a drunken"
	 *     3. m.appendTail(sb);이 호축되면 마지막으로 치환된 이후의 부분을 sb에 덧붙인다.
	 *     - sb에 저장된 내용: "A drunken hand works, but not a drunken heart."
	 * </code></pre>
	 */
	static class RegularEx4 {

		public static void main(String[] args) {
			String source = "A broken hand works, but not a broken heart.";
			String pattern = "broken";
			StringBuffer sb = new StringBuffer();

			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(source);
			System.out.println("source:" + source);

			int i = 0;

			while (m.find()) {
				System.out.println(++i + "번째 매칭" + m.start() + "~" + m.end());
				// broken을 drunken으로 치환하여 sb에 저장한다.
				m.appendReplacement(sb, "drunken");
			}
			m.appendTail(sb);
			System.out.println("Replacement count : " + i);
			System.out.println("result:" + sb.toString());

		}

	}

	/**
	 * <h5>2.4 java.util.Scanner클래스</h5><br>
	 * Scanner는 화면, 파일, 문자열과 같은 입력소스로부터 문자데이터를 읽어오는데 도움을 줄 목저으로 JDK1.5부터 추가되었다.<br>
	 * Scanner는 정규식 표현(Regular expression)을 이용한 라인단위의 검색을 지원하며 구분자(delimiter)에도 정규식 표현을 사용할 수 있어서 복잡한 형태의 구분자도 처리가 가능하다.<br>
	 */
	class Memo5 {

	}

	/**
	 * <h5>2.5 java.util.StringTokenizer클래스</h5><br>
	 * StringTokenizer는 긴 문자열을 저자된 구분자(delimiter)를 기준으로 토큰(token)이라는 여러 개의 문자열로 잘라내는 데 사용된다.<br>
	 * stringTokenizer를 이용하는 방법 이외에도 아래와 같이 String의 split(String regex)이나 Scanner의 userDelimiter(String pattern)를 사용할 수도 있지만,<br>
	 * 이 두가지 방법은 정규식 표현(Regular expression)을 사용해야하므로 정규식 표현에 익숙하지 않은 경우 StringTokenizer를 사용하는 것이 간단하면서도 명확한 결과를 얻을 수 있을 것이다.
	 */
	class Memo6 {

	}

	/**
	 * <h5>2.6 java.math.BigInteger클래스</h5><br>
	 * 정수형으로 표현할 수 있는 값의 한계가 있다. 가장 큰 정수형 타입인 long으로 표현할 수 있는 값을 10진수로 19자리 정도이다.<br>
	 * <pre><code>
	 *     final int signum; // 부호. 1(양수), 0, -1(음수) 셋 중의 하나
	 *     final int[] mag; // 값(magnitude)
	 * </code></pre>
	 * BigInteger는 내부적으로 int배열을 사용해서 값을 다룬다. 그래서 long타입보다 훨씬 큰 값을 다룰 수 있는 것이다. 대신 성능은 long타입보다 떨어질 수밖에 없다.<br>
	 * BigInteger는 String처럼 불변(immutable)이다. 모든 정수형이 그렇듯이 BigInteger 역시 값을 '2의 보수'의 형태로 표현한다.
	 */
	class Memo7 {

	}

	/**
	 * <h5>BigInteger의 생성</h5><br>
	 * BigInteger를 생성하는 방법은 여러 가지가 있는데, 문자열로 숫자를 표현하는 것이 일반적이다. 정수형 리터럴로는 표현할 수 있는 값의 한계가 있기 때문이다.
	 */
	class Memo8 {

	}

	/**
	 * <h5>다른 탕비으로의 변환</h5><br>
	 * BigInteger를 문자열, 또는 byte배열로 변환하는 메서드<br>
	 * <pre><code>
	 *     String toString() // 문자열로 변환
	 *     String toString(int radix) // 지정된 진법(radix)의 문자열로 변환
	 *     byte[] toByteArray() // byte배열로 변환
	 * </code></pre>
	 * <br>
	 * BigInteger도 Number로부터 상속받은 기본형으로 변환하는 메서드들을 가지고 있다.<br>
	 * <pre><code>
	 *     int intValue()
	 *     long longValue()
	 *     float floatValue()
	 *     double doubleValue()
	 * </code></pre>
	 * <br>
	 * 정수형으로 변환하는 메서드 중에서 이름 끝에 'Exact'가 붙은 것들은 변환한 결과가 변환한 타입의 범위에 속하지 않으면 ArithmeticException을 발생시킨다.<br>
	 * <pre><code>
	 *     byte byteValueExact()
	 *     int intValueExact()
	 *     long longValueExact()
	 * </code></pre>
	 */
	class Memo9 {

	}

	/**
	 * BigInteger의 연산<br>
	 * <pre><code>
	 * 		BigInteger add(BigInteger val) // 덧셈(this + val)
	 * 	    BigInteger subtract(BigInteger val) // 뺄셈(this - val)
	 * 	    BigInteger multiply(BigInteger val) // 곱셈(this * val)
	 * 	    BigInteger divide(BigInteger val) // 나눗셈(this / val)
	 * 	    BigInteger remainder(BigInteger val) // 나머지(this % val)
	 * </code></pre>
	 * <br>
	 * BigInteger는 불변이므로, 반환타입이 BigInteger란 얘기는 새로운 인스턴스가 변환된다는 뜻이다.
	 */
	class Memo10 {

	}

	/**
	 * <h5>비트 연산 메서드</h5><br>
	 * <pre><code>
	 *     int bitCount() // 2진수로 표현했을 때, 1의 개수(음수는 0의 개수)
	 *     int bitLength() // 2진수로 표현했을 때, 값을 표현하는데 필요한 bit수
	 *     boolean testBit(int n) // 우측에서 n+1번째 비트가 1이면 true, 0이면 false
	 *     BigInteger setBit(int n) // 우측에서 n+1번째 비트를 1로 변경
	 *     BigInteger clearBit(int n) // 우측에서 n+1번째 비트를 0으로 변경
	 *     BigInteger flipBit(int n) // 우측에서 n+1번째 비트를 전환(1->0, 0->1)
	 * </code></pre>
	 */
	class Memo11 {

	}

	/**
	 * <h5>2.7 java.math.BigDecimal클래스</h5><br>
	 * double타입으로 표현할 수 있는 값을 상당히 범위가 넓지만, 정밀도가 최대 13자리 밖에되지 않고 실수형의 특성상 오차를 피할 수 없다.<br>
	 * BigDecimal은 실수형과 달리 정수를 이용해서 실수를 표현한다.<br>
	 * 정수 x 10<sup>-scale</sup><br>
	 * scale은 0부터 Integer.MAX_VALUE사이의 범위에 있는 값이다. BigDecimal은 정수를 저장하는데 BigInteger를 사용한다.<br>
	 * <small>※ BigInteger처럼 BigDecimal도 불변(immutable)이다.</small>
	 * <br>
	 * <pre><code>
	 *     private final BigInteger intVal; // 정수(unscaled value)
	 *     private final int scale; // 지수(scale)
	 *     private transient int precision; // 정밀도(precision) - 정수의 자릿수
	 * </code></pre>
	 * 123.45는 12345 x 10<sup>-2</sup>로 표현할 수 있으며, 이 값이 BigDecimal에 저장되면, intVal의 값은 12345가 되고 scale의 값은 2가 된다.<br>
	 * scale은 소수점 이하의 자리수를 의미한다는 것을 알 수있다. 그리고 precision의 값은 5가 되는데, 이 값은 정수의 전체 자리수를 의미한다.
	 */
	class Memo12 {

	}

	/**
	 * <h5>BigDecimal의 생성</h5><br>
	 * 문자열로 숫자를 표현하는 것이 일반적이다. 기본형 리터럴로는 표현할 수 있는 값의 한계가 있기 때문이다.<br>
	 * 한 가지 주의할 점은, double타입의 값을 매개변수로 갖는 생성자를 사용하면 오차가 발생할 수 있다는 것이다.
	 */
	class Memo13 {

	}

	/**
	 * <h5>다른 타입으로의 변환</h5><br>
	 * <pre><code>
	 *     String toPlainString() // 어떤 경우에도 다른 기호없이 숫자로만 표현
	 *     String toString() // 필요하면 지수형태로 표현할 수도 있음
	 * </code></pre>
	 * <br>
	 * 대부분의 경우 이 두 메서드의 반환결과가 같지만, BigDecimal을 생성할 때 '1.0e-22'아 같은 지수형태의 리터럴을 사용했을 때 다른 결과를 얻는 경우가 있다.<br>
	 * BigDecimal도 Number로 부터 상속받은 기본형으로 변환하는 메서드들을 가지고 있다.<br>
	 * <pre><code>
	 *     int intValue()
	 *     long longValue()
	 *     float floatValue()
	 *     double doubleValue()
	 * </code></pre>
	 * <br>
	 * BigDecimal을 정수형으로 변환하는 메서드 중에서 이름 끝에 'Exact'가 붙은 것들은 변환한 결과가 반환한 타입의 범위에 속하지 않으면 ArithmeticException을 발생시킨다.<br>
	 * <pre><code>
	 *     byte byteValueExact()
	 *     short shortValueExact()
	 *     int intValueExact()
	 *     long longValueExact()
	 *     BigInteger toBigIntegerExact()
	 * </code></pre>
	 *
	 */
	class Memo14 {

	}

	/**
	 * <h5>BigDecimal의 연산</h5><br>
	 * <pre><code>
	 *     BigDecimal add(BigDecimal val) // 덧셈(this + val)
	 *     BigDecimal subtract(BigDecimal val) // 뺄셈(this - val)
	 *     BigDecimal multiply(BigDecimal val) // 곱셈(this * val)
	 *     BigDecimal divide(BigDecimal val) // 나눗셈(this / val)
	 *     BigDecimal remainder(BigDecimal val) // 나머지(this % val)
	 * </code></pre>
	 * <br>
	 * BigInteger와 마찬가지로 BigDecimal도 불변이므로, 반환타입이 BigDecimal인 경우 새로운 인스턴스가 반환된다.
	 */
	class Memo15 {

	}

	/**
	 * <h5>반올림 모드 - divide()와 setScale()</h5><br>
	 * 다른 연산과 달리 나눗셈을 처리하기 위한 메서드는 다음과 같이 다양한 버젼이 존재한다.<br>
	 * 나숫셈의 결과를 어떻게 반올림(roundingMode)처리할 것인가와, 몇 번째 자리(scale)에서 반올림할 것인지를 지정할 수 있다.<br>
	 * BigDecimal이 아무리 오차없이 실수를 저장한다해도 나눗셈에서 발생하는 오차는 어쩔 수 없다.<br>
	 * <pre><code>
	 *     BigDecimal divide(BigDecimal divisor)
	 *     BigDecimal divide(BigDecimal divisor, int roundingMode)
	 *     BigDecimal divide(BigDecimal divisor, RoundingMode roundingMode)
	 *     BigDecimal divide(BigDecimal divisor, int scale, int roundingMode)
	 *     BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode)
	 *     BigDecimal divide(BigDecimal divisor, MathContext mc)
	 * </code></pre>
	 * <br>
	 * roundingMode는 반올림 처리방법에 대한 것으로 BigDecimal에 정의된 'ROUND_'로 시작하는 상수들 중에 하나를 선택해서 사용하면 된다.<br>
	 * RoundingMode는 이 상수들을 열거형으로 정의한 것으로 나중에 추가되었다.<br>
	 * 열거형 RoundingMode에 정의된 상수<br>
	 * <table>
	 *     <thead>
	 *         <th>상수</th>
	 *         <th>설명</th>
	 *     </thead>
	 *     <tbody>
	 *         <tr>
	 *             <td>CEILING</td>
	 *             <td>올림</td>
	 *         </tr>
	 *         <tr>
	 *             <td>FLOOR</td>
	 *             <td>내림</td>
	 *         </tr>
	 *         <tr>
	 *             <td>UP</td>
	 *             <td>양수일 떄는 올림, 음수일 때는 내림</td>
	 *         </tr>
	 *         <tr>
	 *             <td>DOWN</td>
	 *             <td>양수일 때는 내림, 음수일 때는 올림(UP과 반대)</td>
	 *         </tr>
	 *         <tr>
	 *             <td>HALF_UP</td>
	 *             <td>반올림(5이상 올림, 5미만 버림)</td>
	 *         </tr>
	 *         <tr>
	 *             <td>HALF_EVEN</td>
	 *             <td>반올림(반올림 자리의 값이 짝수면 HALF_DOWN, 홀수면 HALF_UP)</td>
	 *         </tr>
	 *         <tr>
	 *             <td>HALF_DOWN</td>
	 *             <td>반올림(6이상 올림, 6미만 버림)</td>
	 *         </tr>
	 *         <tr>
	 *             <td>UNNECESSARY</td>
	 *             <td>나눗셈의 결과가 딱 떨어지는 수가 아니면, ArithmeticException발생</td>
	 *         </tr>
	 *     </tbody>
	 * </table>
	 * <br>
	 * 주의해야할 점은 divide()로 나눈셈한 결과가 무한소수인 경우, 반올림 모드를 지정해주지 않으면 ArithmeticException이 발생한다는 것이다.
	 */
	class Memo16 {

	}

	/**
	 * <h5>java.math.MathContext</h5><br>
	 * 이 클래스는 반올림 모드와 정밀도(precision)을 하나로 묶어 놓은 것일 뿐 별다른 것은 없다.<br>
	 * 한 가지 주의할 점은 divide()에서는 scale이 소수점 이하의 자리수를 의미하는데, MathContext에서는 precision이 정수와 소수점 이하를 모두 포함한 자리수를 의미한다는 것이다.
	 */
	class Memo17 {

	}

	/**
	 * <h5>scale의 변경</h5><br>
	 * BigDecimal을 10으로 곱하거나 나누는 대신 scale의 값을 변경함으로써 같은 결과를 얻을 수 있다. BigDecimal의 scale을 변경하려면, setScale()을 이용하면 된다.<br>
	 * <pre><code>
	 *     BigDecimal setScale(int newScale)
	 *     BigDecimal setScale(int newScale, int roundingMode)
	 *     BigDecimal setScale(int newScale, RoundingMode mode)
	 * </code></pre>
	 * <br>
	 * setScale()로 scale을 값을 줄이는 것은 10의 n제곱으로 나누는 것과 같으므로, divide()를 호출할 때처럼 오차가 발생할 수 있고 반올리 모드를 지정해주어야 한다.
	 */
	class Memo18 {

	}

}
