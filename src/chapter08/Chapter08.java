package chapter08;

/**
 * <h1>8. 예외처리 exception handling</h1>
 */
public class Chapter08 {

	/**
	 * <h1>1. 예외처리(exception handling)</h1><br>
	 * <h5>1.1 프로그램 오류</h5><br>
	 * 프로그램이 실행 중 어떤 원인에 의해서 오작동을 하거나 비정상적으로 종료되는 경우가 있다. <br>
	 * 이러한 결과를 초래하는 원인을 프로그램 에러 또는 오류라고 한다.<br>
	 * 이를 발생시점에 따라 '컴파일 에러(compile-time error)' 와 '런타임 에러(runtime error)'로 나눌 수 있는데,<br>
	 * 글자 그대로 '컴파일 에러'는 컴파일 할 때 발생하는 에러이고 프로그램의 실행도중에 발생하는 에러를 '런타임 에러'라고 한다.<br>
	 * 이 외에도 '논리적 에러(logical error)'가 있는데, 컴파일도 잘되고 실행도 잘되지만 의도한 것과 다르게 동작하는 것을 말한다.<br>
	 * <pre><code>
	 *     컴파일 에러 - 컴파일 시에 발생하는 에러
	 *     런타임 에러 - 실행 시에 발생하는 에러
	 *     논리적 에러 - 실행은 되지만, 의도와 다르게 동작하는 것
	 * </code></pre>
	 * <br>
	 * 소스코드를 컴파일 하면 컴파일러가 소스코드(*.java)에 대해 오타나 잘못된 구문, 자료형 체크 등의 기본적인 검사를 수행하여 오류가 있는지를 알려 준다.<br>
	 * 컴파일러가 알려 준 에러들을 모두 수정해서 컴파일을 성공적으로 마치고 나면, 클래스 파일(*.class)이 생성되고, 생성된 클래스 파일을 실행할 수 있게 되는 것이다.<br>
	 * 컴파일을 에러없이 성공적으로 마쳤다고 해서 프로그램의 실행 시에도 에러가 발생하지 않는 것은 아니다.<br>
	 * 컴파일러가 소스코드의 기본적인 사항은 컴파일 시에 모두 걸러 줄 수는 있지만, 실행도중에 발생할 수 있는 잠재적인 오류까지 검사할 수 없기 떄문에 컴파일은 잘되었어도 실행 중에 에러에 의해서 잘못된 결과를 얻거나 프로그램이 비정상적으로 종료될 수 있다.<br>
	 * 런타임 에러를 방지하기 위해서는 프로그램의 실행도중 발생할 수 잇는 모든 경우의 수를 고려하여 이에 대한 대비를 하는 것이 필요하다.<br>
	 * 자바에서는 실행 시(runtime)발생할 수 있는 프로그램 오류를 '에러(error)'와 '예외(exception)', 두 가지로 구분하였다.<br>
	 * 에러는 메모리 부족(OutOfMemoryError)이나 스택오버플로우(StackOverflowError)와 같이 일단 발생하면 복구할 수 없는 심각한 오류이고, 예외는 발생하더라도 수습될 수 있는 비교적 덜 심각한 것이다.<br>
	 * <pre><code>
	 *     에러(error) - 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
	 *     예외(exception) - 프로그램 코드에 의해서 수습될 수 잇는 다소 미약한 오류
	 * </code></pre>
	 */
	class Memo1 {

	}

	/**
	 * <h5>1.2 예외 클래스의 계층구조</h5><br>
	 * 자바에서는 실행 시 발생할 수 있는 오류(Exception과 Error)를 클래스로 정의하였다.<br>
	 * 모든 클래스의 조상은 Object 클래스이므로 Exception과 Error 클래스 역시 Object 클래스의 자손들이다.<br>
	 * 모든 예외의 최고 조상은 Exception 클래스이다.<br>
	 * RuntimeException 클래스들은 주로 프로그래머의 실수에 의해서 발생될 수 있는 예외들로 자바의 프로그래밍 요소들과 관계가 깊다.<br>
	 * Exception 클래스들은 주로 외부의 영향으로 발생할 수 있는 것들로서, 프로그램의 사용자들의 동작에 의해서 발생하는 경우가 많다.<br>
	 * <pre><code>
	 *     Exception 클래스들 - 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
	 *     RuntimeException 클래스들 - 프로그래머의 실수로 발생하는 예외
	 * </code></pre>
	 */
	class Memo2 {

	}

	/**
	 * <h5>1.3 예외처리하기 - try-catch문</h5>
	 */
	class Memo3 {

	}

}
