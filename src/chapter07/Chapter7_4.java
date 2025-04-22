package chapter07;

/**
 * <h1>4. 제어자(modifier)</h1>
 */
public class Chapter7_4 {

	/**
	 * <h5>4.1 제어자란?</h5><br>
	 * 제어자(modifier)는 클래스, 변수 또는 메서드의 선언부에 함께 사용되어 부가적인 의미를 부여한다. 제어자의 종류는 크게 접근 제어자와 그 외의 제어자로 나눌 수 있다.<br>
	 * <pre><code>
	 *     접근 제어자 - public, protected, default, private
	 *     그 외 - static, final, abstract, native, transient, synchronized, volatile, strictfp
	 * </code></pre>
	 * <br>
	 * 제어자는 클래스나 멤버변수와 메서드에 주로 사용되며, 하나의 대상에 대해서 여러 제어자를 조합하여 사용하는 것이 가능하다.<br>
	 * 단, 접근 제어자는 한 번에 네 가지 중 하나만 선택해서 사용할 수 있다. 즉, 하나의 대상에 대해서 public과 private을 함께 사용할 수 없다는 것이다.<br>
	 * <small>※제어자들 간의 순서는 관계없지만 주로 접근 제어자를 제일 왼쪽에 놓는 경향이 있다.</small>
	 */
	class Memo1 {

	}

	/**
	 * <h5>4.2 static - 클래스의, 공통적인</h5><br>
	 * static은 '클래스의' 또는 '공통적인' 의미를 가지고 있다. 인스턴스변수는 하나의 클래스로부터 생성되었더라도 각기 다른 값을 유지하지만, 클래스변수(static멤버변수)는 인스턴스에 관계없이 같은 값을 갖는다.<br>
	 * 그 이유는 하나의 변수를 모든 인스턴스가 공유하기 때문이다.<br>
	 * static이 붙은 멤버변수와 메서드, 그리고 초기화 블럭은 인스턴스가 아닌 클래스에 관계된 것이기 때문에 인스턴스를 생성하지 않고도 사용할 수 있다.<br>
	 * 인스턴스메서드와 static메서드의 근본적인 차이는 메서드 내에서 인스턴스 멤버를 사용하는가의 여부에 있다.<br>
	 * <pre><code>
	 *     static이 사용될 수 있는 곳 - 멤버변수, 메서드, 초기화 블럭
	 * </code></pre>
	 * <br>
	 * <table border="1">
	 *     <thead>
	 *         <tr>
	 *             <th>제어자</th>
	 *             <th>대상</th>
	 *             <th>의미</th>
	 *         </tr>
	 *     </thead>
	 *     <tbody>
	 *         <tr>
	 *             <td rowspan="2">static</td>
	 *             <td>멤버변수</td>
	 *             <td>
	 *                 - 모든 인스턴스에 공통적으로 사용되는 클래스변수가 된다.
	 *                 - 클래스변수는 인스턴스를 생성하지 않고도 사용 가능하다.
	 *                 - 클래스가 메모리에 로드될 때 생성된다.
	 *             </td>
	 *         </tr>
	 *         <tr>
	 *             <td>메서드</td>
	 *             <td>
	 *                 - 인스턴스를 생성하지 않고도 호출이 가능한 static 메서드가 된다.
	 *                 - static메서드 내에서는 인스턴스멤버들을 직접 사용할 수 없다.
	 *             </td>
	 *         </tr>
	 *     </tbody>
	 * </table>
	 * <br>
	 * <small>※ static초기화 블럭은 클래스가 메모리에 로드될 때 단 한번만 수행되며, 주로 클래스변수(static변수)를 초기화하는데 주로 사용한다.</small>
	 */
	class Memo2 {

	}

	/**
	 * <h5>4.3 final - 마지막의, 변경될 수 없는 </h5>
	 */
	class Memo3 {

	}

}
