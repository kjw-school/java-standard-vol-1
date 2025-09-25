package chapter05;

/**
 * <h1>3. 다차원 배열</h1><br>
 * 다차원(多次元, multi-dimensional) 배열도 선언해서 사용할 수 있다.
 */
public class Chapter05_3 {

	/**
	 * <h5>3.1 2차원 배열의 선언과 인덱스</h5><br>
	 * 2차원 배열을 선언하는 방법은 1차원 배열과 같다.<br>
	 * <table>
	 *     <thead>
	 *         <th>선언 방법</th>
	 *         <th>선언 예</th>
	 *     </thead>
	 *     <tbody>
	 *         <tr>
	 *             <td>타입[][] 변수이름;</td>
	 *             <td>int[][] score;</td>
	 *         </tr>
	 *         <tr>
	 *             <td>타입 변수이름[][];</td>
	 *             <td>int score[][];</td>
	 *         </tr>
	 *         <tr>
	 *             <td>타입[] 변수이름[];</td>
	 *             <td>int[] score[];</td>
	 *         </tr>
	 *     </tbody>
	 * </table>
	 * <br>
	 * 배열을 생성하면, 배열의 각 요소에는 배열요소타입의 기본값이 자동적으로 저장된다.
	 */
	class Memo1 {

	}

	/**
	 * <h5>2차원 배열의 index</h5><br>
	 * 2차원 배열은 행(row)과 열(column)로 구성되어 있기 때문에 index도 행과 열에 각각 하나씪 존재한다. '행index'의 범위는 '0~행의 길이-1'이고, '열index'의 범위는 '0~열의 길이-1'이다.<br>
	 * 2차원 배열의 각 요소에 접근하는 방법은 '배열이름[행index][열index]'이다.
	 */
	class Memo2 {

	}

	/**
	 * <h5>3.2 2차원 배열의 초기화</h5><br>
	 * 2차원 배열도 괄호{}를 사용해서 생성과 초기화를 동시에 할 수 있다. 다만, 1차원 배열보다 괄호{}를 반헌 더 써서 행렬로 구분해 준다.<br>
	 * <pre><code>
	 *     int[][] arr = new int[][]{ {1,2,3}. {4,5,6} };
	 *     int[][] arr = { {1,2,3}, {4,5,6} }; // new int[][]가 생략됨.
	 * </code></pre>
	 */
	class Memo3 {

	}

}
