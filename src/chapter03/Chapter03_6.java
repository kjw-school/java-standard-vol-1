package chapter03;

/**
 * <h1>6. 그 외의 연산자</h1>
 */
public class Chapter03_6 {

	/**
	 * <h5>6.1 조건 연산자 ? :</h5><br>
	 * 조건 연산자는 조건식, 식1, 식2 모두 세 개의 피연산자를 필요로 하는 삼항 연산자이며, 삼항 연산자는 조건 연산자 하나뿐이다.<br>
	 * 조건 연산자는 첫 번째 피연산자인 조건식의 평가결과에 따라 다른 결과를 반환한다. 조건식의 평가결과가 true이면 식1이, false이면 식2가 연산결과가 된다.<br>
	 * <pre><code>
	 *     result = (x > y) ? x : y;
	 *     ↕
	 *     if(x > y) result = x; // x > y가 true일 때
	 *     else
	 *      result = y; // x > y가 false일 때
	 * </code></pre>
	 */
	class Memo1 {

	}

	/**
	 * <h5>6.2 대입 연산자 = op=</h5><br>
	 * 대입 연산자는 변수와 같은 저장공간에 값 또는 수식의 연산결과를 저장하는데 사용된다.<br>
	 * 이 연산자는 오른쪽 피연산자의 값(식이라면 평가값)을 왼쪽 피연산자에 저장한다.<br>
	 * 그리고 저장된 값을 연산결과로 반환한다.<br>
	 * 대입 연산자는 연산자들 중에서 가장 낮은 우선순위를 가지고 있기 때문에 식에서 제일 나중에 수행된다.<br>
	 * 그리고 앞서 배운 것처럼 연산 진행 방향이 오른쪽에서 왼쪽이기 때문에 'x=y=3;' 에서 'y=3'이 먼저 수행되고 그 다음에 'x=y'가 수행된다.
	 */
	class Memo2 {

	}

	/**
	 * <h5>lvalue와 rvalue</h5><br>
	 * 대입 연산자의 왼쪽 피연산자를 'lvalue(left value)'이라 하고, 오른쪽 피연산자를 'rvalue(right value)'라고 한다.<br>
	 * 대입연산자의 rvalue는 변수뿐만 아니라 식이나 상수 등이 모두 가능한 반면, lvalue는 반드시 변수처럼 값을 변경할 수 있는 것이어야 한다. 그래서 리터럴이나 상수같이 값을 저장할 수 없는 것들은 lvalue가 될 수 없다.
	 */
	class Memo3 {

	}

	/**
	 * <h5>복합 대입 연산자</h5><br>
	 * 대입 연산자는 다른 연산자(op)와 결합하여 'op='와 같은 방식으로 사용될 수 있다.<br>
	 * 예를 들면, 'i = i + 3'은 'i += 3'과 같이 표현될 수 있다. 결합된 두 연산자는 반드시 공백없이 붙여써야 한다.<br>
	 * <table>
	 *     <thead>
	 *         <th>op=</th>
	 *         <th>=</th>
	 *     </thead>
	 *     <tbody>
	 *         <tr>
	 *             <td>i += 3;</td>
	 *             <td>i = i + 3;</td>
	 *         </tr>
	 *         <tr>
	 *             <td>i -= 3</td>
	 *             <td>i = i - 3;</td>
	 *         </tr>
	 *         <tr>
	 *             <td>i *= 3;</td>
	 *             <td>i = i * 3;</td>
	 *         </tr>
	 *         <tr>
	 *             <td>i /= 3;</td>
	 *             <td>i = i / 3;</td>
	 *         </tr>
	 *         <tr>
	 *             <td>i %= 3;</td>
	 *             <td>i = i % 3;</td>
	 *         </tr>
	 *         <tr>
	 *             <td>i <<= 3;</td>
	 *             <td>i = i << 3;</td>
	 *         </tr>
	 *         <tr>
	 *             <td>i >>= 3;</td>
	 *             <td>i = i >> 3;</td>
	 *         </tr>
	 *         <tr>
	 *             <td>i &= 3;</td>
	 *             <td>i = i & 3;</td>
	 *         </tr>
	 *         <tr>
	 *             <td>i ^= 3;</td>
	 *             <td>i = i ^ 3;</td>
	 *         </tr>
	 *         <tr>
	 *             <td>i |= 3;</td>
	 *             <td>i = i | 3;</td>
	 *         </tr>
	 *         <tr>
	 *             <td>i *= 10 + j;/td>
	 *             <td>i = i * (10 + j);</td>
	 *         </tr>
	 *     </tbody>
	 * </table>
	 * <br>
	 */
	class Memo4 {

	}

}
