package chapter03;

/**
 * <h1>3. 산술 연산자</h1><br>
 * 산술 연산자에는 사칙 연산자(+, -, *, /)와 나머지 연산자(%)가 있다.
 */
public class Chapter03_3 {

	/**
	 * <h5>3.1 사칙 연산자 + - * /</h5><br>
	 * 곱셈(*), 나눗셈(/), 나머지(%), 연산자가 덧셈(+), 뺄셈(-)연산자보다 우선순위가 높으므로 먼저 처리된다.<br>
	 * 나누기 연산자의 두 피연산자가 모두 int타입인 경우, 연산결과 역시 int타입이다.<br>
	 * int타입은 소수점을 저장하지 못하므로 정수만 남고 소수점 이하는 버려지기 때문이다. 이 때, 반올림이 발생하지 않는다는 것에 주의하자.<br>
	 * 피연산자가 정수형인 경우, 나누는 수로 0을 사용할 수 없다. 만일 0으로 나누면, 컴파일은 정상적으로 되지만 실행 시 오류(ArithmeticException)가 발생한다.<br>
	 * 부동 소수점값인 0.0f, 0.0d로 나누는 것은 가능하지만 그 결과는 Infinity(무한대)이다.<br>
	 * <small>※NaN은 'Not a Number'를 줄인 것으로, 숫자가 아니라는 뜻이다.</small><br>
	 * <table>
	 *     <thead>
	 *         <th>x</th>
	 *         <th>y</th>
	 *         <th>x / y</th>
	 *         <th>x % y</th>
	 *     </thead>
	 *     <tbody>
	 *         <tr>
	 *             <td>유한수</td>
	 *             <td>&plusmn;0.0</td>
	 *             <td>&plusmn;Infinity</td>
	 *             <td>NaN</td>
	 *         </tr>
	 *         <tr>
	 *             <td>유한수</td>
	 *             <td>&plusmn;Infinity</td>
	 *             <td>&plusmn;0.0</td>
	 *             <td>x</td>
	 *         </tr>
	 *         <tr>
	 *             <td>&plusmn;0.0</td>
	 *             <td>유한수</td>
	 *             <td>&plusmn;Infinity</td>
	 *             <td>NaN</td>
	 *         </tr>
	 *         <tr>
	 *             <td>&plusmn;Infinity</td>
	 *             <td>&plusmn;Infinity</td>
	 *             <td>NaN</td>
	 *             <td>NaN</td>
	 *         </tr>
	 *     </tbody>
	 * </table>
	 * <br>
	 * 크기가 작은 자료형의 변수를 큰 자료형의 변수에 저장할 때는 자동으로 형변환(type conversion, casting)되지만, 반대로 큰 자료형의 값을 작은 자료형의 변수에 저장하려면 명시적으로 형변환 연산자를 사용해서 변환해주어야 한다.<br>
	 * 사칙연산의 피연산자로 숫자뿐만 아니라 문자도 가능하다. 문자는 실제로 해당 문자의 유니코드(부호없는 정수)로 바뀌어 저장되므로 문자간의 사칙연산은 정수간의 연산과 동일하다.<br>
	 * 상수 또는 리터럴 간의 연산은 실행과정동안 변하는 값이 아니기 때문에, 컴파일 시에 컴파일러가 계산해서 그 결과로 대체함으로써 코드를 보다 효율적으로 만든다.
	 */
	class Memo1 {

	}

	/**
	 * <h5>3.2 나머지 연산자 %</h5><br>
	 * 나머지 연산자는 왼쪽의 피연산자를 오른쪽 피연산자로 나누고 난 나머지 값을 결과로 반환하는 연산자이다.<br>
	 * 나눗셈에서처럼 나누는 수(오른쪽 피연산자)로 0을 사용할 수 없다는 점에 주의하자.
	 */
	class Memo2 {

	}

}
