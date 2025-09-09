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
	 */
	class Memo5 {

	}

}
