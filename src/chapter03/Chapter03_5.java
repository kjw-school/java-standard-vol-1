package chapter03;

/**
 * <h1>5. 논리 연산자</h1>
 */
public class Chapter03_5 {

	/**
	 * <h5>5.1 논리 연산자 - &&, ||, !</h5><br>
	 * 논리 연산자 '&&'는 우리말로 '그리고(AND)'에 해당하며, 두 피연산자가 모두 true일 때만 true를 결과로 얻는다.<br>
	 * '||'는 '또는(OR)'에 해당하며, 두 피연산자 중 어느 한 쪽만 true이어도 true를 결과로 얻는다.<br>
	 * 논리 연산자는 피연산자로 boolean형 또는 boolean형 값을 결과로 하는 조건식만을 허용한다.<br>
	 * <pre><code>
	 *     ||(OR결합) - 피연산자 중 어느 한 쪽만 true이면 true를 결과로 얻는다.
	 *     &&(AND결합) - 피연산자 양쪽 모두 true이어야 true를 결과로 얻는다.
	 * </code></pre>
	 * <br>
	 */
	class Memo1 {

	}

	/**
	 * <h5>효율적인 연산(short circuit evaluation)</h5><br>
	 * 논리 연산자의 또 다른 특징은 효율적인 연산을 한다는 것이다. OR연산'||'의 경우, 두 피연산자 중 어느 한 쪽만 '참'이어도 전체 연산결과가 '참'이므로 좌측 피연산자가 'true(참)'이면, 우측 피연산자의 값은 평가하지 않는다.<br>
	 * AND연산'&&'의 경우도 마찬가지로 어느 한쪽만 '거짓(false)'이어도 전체 연산결과가 '거짓(false)'이므로 좌측 피연산자가 '거짓(false)'이면, 우측 피연산자는 평가하지 않는다.
	 */
	class Memo2 {

	}

	/**
	 * <h5>논리 부정 연산자 !</h5><br>
	 * 이 연산자는 피연산자가 true이면, false를, false면 true를 결과로 반환한다. 간단히 말해서, true와 false를 반대로 바꾸는 것이다.<br>
	 * <table>
	 *     <thead>
	 *         <th>x</th>
	 *         <th>!x</th>
	 *     </thead>
	 *     <tbody>
	 *         <tr>
	 *             <td>true</td>
	 *             <td>false</td>
	 *         </tr>
	 *         <tr>
	 *             <td>false</td>
	 *             <td>true</td>
	 *         </tr>
	 *     </tbody>
	 * </table>
	 * <br>
	 * <pre><code>
	 *     false(거짓, off) ! -> true(참, on) ! -> false(거짓, off) ! -> true(참, on) ! -> ...
	 * </code></pre>
	 */
	class Memo3 {

	}

	/**
	 * <h5>5.2 비트 연산자 & | ^ ~ << >></h5><br>
	 * 비트 연산자는 피연산자를 비트단위로 논리 연산한다. 피연산자를 이진수로 표현했을 때의 각 자리를 아래의 규칙에 따라 연산을 수행하며, 피연산자로 실수는 허용하지 않는다. 정수(문자 포함)만 허용된다.<br>
	 * <pre><code>
	 *     |(OR연산자) - 피연산자 중 한 쪽의 값이 1이면, 1을 결과로 얻는다. 그 외에는 0을 얻는다.
	 *     &(AND연산자) - 피연산자 양 쪽이 모두 1이어야만 1을 결과로 얻는다. 그 외에는 0을 얻는다.
	 *     ^(XOR연산자) - 피연산자의 값이 서로 다를 때만 1을 결과로 얻는다. 같을 때는 0을 얻는다.
	 * </code></pre>
	 * <br>
	 * <table>
	 *     <thead>
	 *         <th>x</th>
	 *         <th>y</th>
	 *         <th>x | y</th>
	 *         <th>x & y</th>
	 *         <th>x ^ y</th>
	 *     </thead>
	 *     <tbody>
	 *         <tr>
	 *             <td>1</td>
	 *             <td>1</td>
	 *             <td>1</td>
	 *             <td>1</td>
	 *             <td>0</td>
	 *         </tr>
	 *         <tr>
	 *             <td>1</td>
	 *             <td>0</td>
	 *             <td>1</td>
	 *             <td>0</td>
	 *             <td>1</td>
	 *         </tr>
	 *         <tr>
	 *             <td>0</td>
	 *             <td>1</td>
	 *             <td>1</td>
	 *             <td>0</td>
	 *             <td>1</td>
	 *         </tr>
	 *         <tr>
	 *             <td>0</td>
	 *             <td>0</td>
	 *             <td>0</td>
	 *             <td>0</td>
	 *             <td>0</td>
	 *         </tr>
	 *     </tbody>
	 * </table>
	 * <br>
	 * <small>※ 연산자 '^'는 배타적 XOR(eXclusive OR)라고 하며, 피연산자의 값이 서로 다른 경우, 즉 배타적인 경우에만 참(1)을 결과로 얻는다.</small><br>
	 * 비트OR연산자'|'는 주로 특정 비트의 값을 변경할 때 사용한다.<br>
	 * 비트AND연산자'&'는 주로 특정 비트의 값을 뽑아낼 때 사용한다.<br>
	 * 비트XOR연산자'^'는 두 피연산자의 비트가 다를 때만 1이 된다. 그리고 같은 값으로 두고 XOR연산을 수행하면 원래의 값으로 돌아오는 특징이 있어서 간단한 암호화에 사용된다.<br>
	 */
	class Memo4 {

	}

	/**
	 * <h5>비트 전환 연산자 ~</h5><br>
	 */
	class Memo5 {

	}

}
