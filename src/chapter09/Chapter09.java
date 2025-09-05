package chapter09;

/**
 * <h1>1. java.lang패키지</h1><hr>
 * java.lang패키지는 자바프로그래밍에 가장 기본이 되는 클래스들을 포함하고 있다.<br>
 * 그렇기 때문에 java.lang패키지의 클래스들은 import문 없이도 사용할 수 있게 되어 있다.<br>
 * 그 동안 String클래스나 System클래스를 import문 없이 사용할 수 있었던 이유가 바로 java.lang패키지에 속한 클래스들이기 때문이었던 것이다.
 */
public class Chapter09 {

	/**
	 * <h5>1.1 Object클래스</h5><br>
	 * Object클래스는 모든 클래스의 최고 조상이기 때문에 Object클래스의 멤버들은 모든 클래스에서 바로 사용 가능하다.<br>
	 * <b>Object클래스의 메서드</b><br>
	 * <table border="1">
	 *     <thead>
	 *         <th>Object클래스의 메서드</th>
	 *         <th>설명</th>
	 *     </thead>
	 *     <tbody>
	 *         <tr>
	 *             <td>protected Object clone()</td>
	 *             <td>객체 자신의 복사본을 반환한다.</td>
	 *         </tr>
	 *         <tr>
	 *             <td>public boolean equals(Object obj)</td>
	 *             <td>객체 자신과 객체 obj가 같은 객체인지 알려준다.(같으면 true)</td>
	 *         </tr>
	 *         <tr>
	 *             <td>protected void finalize()</td>
	 *             <td>객체가 소멸될 때 가비지 컬렉터에 의해 자동적으로 호출된다. 이 때 수행되어야하는 코드가 있을 때 오버라이딩한다.(거의 사용안함)</td>
	 *         </tr>
	 *         <tr>
	 *             <td>public Class getClass()</td>
	 *             <td>객체 자신의 클래스 정보를 담고 있는 Class인스턴스를 반환한다.</td>
	 *         </tr>
	 *         <tr>
	 *             <td>public int hashCode()</td>
	 *             <td>객체 자신의 해시코드를 반환한다.</td>
	 *         </tr>
	 *         <tr>
	 *             <td>public String toString()</td>
	 *             <td>객체 자신의 정보를 문자열로 반환한다.</td>
	 *         </tr>
	 *         <tr>
	 *             <td>public void notify()</td>
	 *             <td>객체 자신을 사용하려고 기다리는 쓰레드를 하나만 깨운다.</td>
	 *         </tr>
	 *         <tr>
	 *             <td>public void notifyAll()</td>
	 *             <td>객체 자신을 사용하려고 기다리는 모든 쓰레드를 깨운다.</td>
	 *         </tr>
	 *         <tr>
	 *             <td>
	 *                 public void wait()<br>
	 *                 public void wait(long timeout)<br>
	 *                 public void wait(long timeout, int nanos)
	 *             </td>
	 *             <td>다른 쓰레드가 notify()나 notifyAll()을 호출할 때까지 현재 쓰레드를 무한히 또는 지정된 시간(timeout, nanos)동안 기다리게 한다.(timeout은 천 분의 1초, nanos는 10<sup>9</sup>분의 1초</td>
	 *         </tr>
	 *     </tbody>
	 * </table>
	 * <br>
	 * Object클래스는 멤버변수는 없고 오직 11개의 메서드만 가지고 있다. 이 메서드들은 모든 인스턴스가 가져야 할 기본적인 것들이며, 우선 이 중에서 중요한 몇 가지만 살펴보자.
	 */
	class Memo1 {

	}

	/**
	 * <h5>equals(Object obj)</h5><br>
	 * 매개변수로 객체의 참조변수를 받아서 비교하여 그 결과를 boolean값으로 알려 주는 역할을 한다.<br>
	 * 두 객체의 같고 다름을 참조변수의 값으로 판단한다. 그렇기 때문에 서로 다른 두 개겣를 equals메서드로 비교하면 항상 false를 결과로 얻게 된다.<br>
	 * <small>※ 객체를 생성할 때, 메모리의 비어있는 공간을 찾아 생성하므로 서로 다른 두 개의 객체가 같은 주소를 갖는 일은 있을 수 없다. 두 개 이상의 참조변수가 같은 주소값을 갖는 것(한 객체를 참조하는 것)은 가능하다.</small><br>
	 * Object클래스로부터 상속받은 equals메서드는 결국 두 개의 참조변수가 같은 객체를 참조하고 있는지, 즉 두 참조변수에 저장된 값(주소값)이 같은지를 판단하는 기능밖에 할 수 없다는 것을 알 수 있다.<br>
	 * equals메서드로 Value인스턴스가 가지고 있는 value값을 비교하도록 할 수는 없을까? Value클래스에서 equals메서드를 오버라이딩하여 주소가 아닌 객체에 저장된 내용을 비교하도록 변경하면 된다.<br>
	 * String클래스 역시 Object클래스의 equals메서드를 그대로 사용하는 것이 아니라 오버라이딩을 통해서 String인스턴스가 갖는 문자열 값을 비교하도록 되어있다.<br>
	 * 그렇기 때문에 같은 내용의 문자열을 갖는 두 String인스턴스에 equals메서드를 사용하면 항상 true값을 얻는 것이다.<br>
	 * <small>※ String클래스뿐만 아니라, Date, File, wrapper클래스(Integer, Double 등)의 equals메서드도 주소값이 아닌 내용을 비교하도록 오버라이딩되어 있다. 그러나 의외로 StringBuilder클래스는 오버라이딩되어 있지 않다.</small>
	 */
	class Memo2 {

	}

	/**
	 * <h5>hashCode()</h5><br>
	 * 이 메서드는 해싱(hashing)기법에 사용되는 '해시함수(hash function)'를 구현한 것이다.<br>
	 * 해싱은 데이터관리기법 중의 하나인데 다량의 데이터를 저장하고 검색하는 데 유용하다.<br>
	 * 해시함수는 찾고자하는 값을 입력하면, 그 값이 저장된 위치를 알려주는 해시코드(hash code)를 반환한다.<br>
	 * 일반적으로 해시코드가 같은 두 객체가 존재하는 것이 가능하지만, Object클래스에 정의된 hashCode메서드는 객체의 주소값으로 해시코드를 만들어 반환하기 때문에 32 bit JVM에서는 서로 다른 두 객체는 결코 같은 해시코드를 가질 수 없엇지만,<br>
	 * 64 bit JVM에서는 8 byte 주소값으로 해시코드(4 byte)를 만들기 때문에 해시코드가 중복될 수 있다.<br>
	 * <small>※해싱기법을 사용하는 HashMap이나 HashSet과 같은 클래스에 저장할 객체라면 반드시 hashCode메서드를 오버라이딩해야 한다.</small> <br>
	 * String클래스는 문자열의 내용이 같으면, 동일한 해시코드를 반환하도록 hashCode메서드가 오버라이딩되어 있기 때문에, 문자열의 내용이 같은 객체에 대해 hashCode()를 호출하면 항상 돌일한 해시코드값을 얻는다.<br>
	 * 반면에 System.identityHashCode(Object x)는 Object클래스의 hashCode()메서드처럼 객체의 주소값으로 해시코드를 생성하기 때문에 모든 객체에 대해 항상 다른 해시코드값을 반환할 것을 보장한다.<br>
	 * <small>※System.identityHashCode(Object x)의 호출결과는 실행 할 때마다 달라질 수 있다.</small>
	 */
	class Memo3 {

	}

	/**
	 * <h5>toString()</h5><br>
	 * 이 메서드는 인스턴스에 대한 정보를 문자열(String)로 제공할 목적으로 정의한 것이다.<br>
	 * 인스턴스의 정보를 제공한다는 것은 대부분의 경우 인스턴스 변수에 저장된 값들을 문자열로 표현한다는 뜻이다.<br>
	 * <pre><code>
	 *     public String toString() {
	 *         return getClass().getName()+"@"+Integer.toHexString(hashCode());
	 *     }
	 * </code></pre>
	 * <br>
	 * toString()을 호출하면 클래스이름에 16진수의 해시코드를 얻게 될 것이다.<br>
	 * <small>※getClass()와 hashCode() 역시 Object클래스에 정의된 것이므로 인스턴스 생성없이 바로 호출할 수 있다.</small>
	 */
	class Memo4 {

	}

	/**
	 * <h5>clone()</h5><br>
	 * 이 메서드는 자신을 복제하여 새로운 인스턴스를 생성하는 일을 한다.<br>
	 * Object클래스에 정의된 clone()은 단순히 인스턴스 변수의 값만 복사하기 때문에 참조타입의 인스턴스 변수가 있는 클래스는 완전한 인스턴스 복제가 이루어지지 않는다.<br>
	 * clone()을 사용하려면, 먼저 복제할 클래스가 Cloneable인터페이스를 구현해야하고, clone()을 오버라이딩하면서 접근 제어자를 protected에서 public으로 변경한다.<br>
	 * 그래야만 상속관계가 없는 다른 클래스에서 clone()을 호출할 수 있다.<br>
	 * <small>※ Object클래스의 clone()은 Cloneable을 구현하지 않은 클래스 내에서 호출되면 예외를 발생시킨다.</small><br>
	 * Cloneable인터페이스를 구현한 클래스의 인스턴스만 clone()을 통한 복제가 가능한데, 그 이유는 인스턴스의 데이터를 보호하기 위해서이다.<br>
	 * CLoneable인터페이스가 구현되어 있다는 것은 클래스 작성자가 복제를 허용한다는 의미이다.
	 */
	class Memo5 {

	}

	/**
	 * <h5>공변 반환타입</h5><br>
	 * JDK1.5부터 '공변 반환타입(covariant return type)'이라는 것이 추가되었는데, 이 기능은 오버라이딩할 때 조상 메서드의 반환타입을 잔손 클래스의 타입으로 변경을 허용하는 것이다.<br>
	 * '공변 반환타입'을 사용하면, 조상의 타입이 아닌, 실제로 반환되는 자손 객체의 타입으로 반환할 수 있어서 번거로운 형변환이 줄어든다는 장점이 있다.<br>
	 * <pre><code>
	 *     Point copy = (Point)original.clone(); -> Point copy = original.clone();
	 * </code></pre>
	 * <br>
	 * 배열 뿐 아니라 java.util패키지의 Vector, ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap, Calendar, Date와 같은 클래스들이 이와 같은 방식으로 복제가 가능하다.<br>
	 * <small>※ clone()으로 복제가 가능한 클래스인지 확인하려면 Java API에서 Cloneable을 구현하였는지 확인하면 된다.</small>
	 */
	class Memo6 {

	}

	/**
	 * <h5>얕은 복사와 깊은 복사</h5><br>
	 * clone()은 단순히 객체에 저장된 값을 그대로 복제할 뿐, 객체가 참조하고 있는 객체까지 복제하지는 않는다.<br>
	 * 객체배열을 clone()으로 복제하는 경우에는 원본과 복제본이 같은 객체를 공유하므로 완전한 복제라고 보기 어렵다. 이러한 복제(복사)를 '얕은 복사(shallow copy)'라고 한다.<br>
	 * 얕은 복사에서는 원본을 변경하면 복사본도 영향을 받는다.<br>
	 * 원본이 참조하고 있는 객체까지 복제하는 것을 '깊은 복사(deep copy)'라고 하며, 깊은 복사에서는 원본과 복사본이 서로 다른 객체를 참조하기 때문에 원본의 변경이 복사본에 영향을 미치지 않는다.
	 */
	class Memo7 {

	}

	/**
	 * <h5>getClass()</h5><br>
	 * 이 메서드는 자신이 속한 클래스의 Class객체를 반환하는 메서드인데, Class객체는 이름이 'Class'인 클래스의 객체이다.<br>
	 * <pre><code>
	 *     public final class Class implements ... { // Class클래스
	 *         ...
	 *     }
	 * </code></pre>
	 * <br>
	 * Class객체는 클래스의 모든 정보를 담고 있으며, 클래스 당 1개만 존재한다.<br>
	 * 클래스 파일이 '클래스 로더(ClassLoader)'에 의해서 메모리에 올라갈 때, 자동으로 생성된다.<br>
	 * 클래스 로더는 실행 시에 필요한 클래스를 동적으로 메모리에 로드하는 역할을 한다.<br>
	 * 먼저 기존에 생성된 클래스 객체가 메모리에 존재하는지 확인하고, 있으면 객체의 참조를 반환하고 없으면 클래스 패스(classpath)에 지정된 경로를 따라서 클래스 파일을 찾는다.<br>
	 * 못 찾으면 ClassNotFoundException이 발생하고, 찾으면 해당 클래스 파일을 읽어서 Class객체로 변환한다.<br>
	 * 파일 형태로 저장되어 있는 클래스를 읽어서 Class클래스에 정의된 형식으로 변환하는 것이다.<br>
	 * 클래스 파일을 읽어서 사용하기 편한 형태로 저장해 놓은 것이 클래스 객체이다.<br>
	 * <small>※ 클래스 파일을 메모리에 로드하고 변환하는 일은 클래스 로더가 한다.</small>
	 */
	class Memo8 {

	}

	/**
	 * <h5>Class객체를 얻는 방법</h5><br>
	 * 클래스의 정보가 필요할 때, 먼저 Class객체에 대한 참조를 얻어 와야 하는데, 해당 Class객체에 대한 참조를 얻는 방법은 여러 가지가 있다.<br>
	 * <pre><code>
	 *     Class cObj = new Card().getClass(); // 생성된 객체로 부터 얻는 방법
	 *     Class cObj = Card.class; // 클래스 리터럴(*.class)로 부터 얻는 방법
	 *     Class cObj = Class.forName("Card"); // 클래스 이름으로 부터 얻는 방법
	 * </code></pre>
	 * <br>
	 * 특히 forName()은 특정 클래스 파일, 예를 들어 데이터베이스 드라이버를 메모리에 올릴 때 주로 사용한다.<br>
	 * Class객체를 이용하면 클래스에 정의된 멤버의 이름이나 개수 등, 클래스에 대한 모든 정보를 얻을 수 있기 때문에 Class객체를 통해서 객체를 생성하고 메서드를 호출하는 등 보다 동적인 코드를 작성할 수 있다.<br>
	 * <pre><code>
	 *     Card c = new Card(); // new연산자를 이용해서 객체 생성
	 *     Card c = Card.class.newInstance(); // Class객체를 이용해서 객체 생성
	 * </code></pre>
	 * <br>
	 * <small>※ newInstance()는 InstantiationException이 발생할 수 있으므로 예외처리가 필요하다.</small><br>
	 * 동적으로 객체를 생성하고 메서드를 호출하는 방법에 대해 더 알고 싶다면, '리플렉션 API(reflection API)'로 검색하면 된다.
	 */
	class Memo9 {

	}

	/**
	 * <h5>1.2 String클래스</h5><br>
	 * 기존의 다른 언어에서는 문자열을 char형의 배열로 다루었으나 자바에서는 문자열을 위한 클래스를 제공한다.<br>
	 * 그것이 바로 String클래스인데, String클래스는 문자열을 저장하고 이를 다루는데 필요한 메서드를 함께 제공한다.
	 */
	class Memo10 {

	}

	/**
	 * <h5>변경 불가능한(immutable) 클래스</h5><br>
	 * String클래스에는 문자열을 저장하기 위해서 문자형 배열 참조변수(char[]) value를 인스턴스 변수로 정의해놓고 있다.<br>
	 * 인스턴스 생성 시 생성자의 매개변수로 입력받는 문자열은 이 인스턴스변수(value)에 문자형 배열(char[])로 저장되는 것이다.<br>
	 * <small>※ String클래스는 앞에 final이 붙어 있으므로 다른 클래스의 조상이 될 수 없다.</small><br>
	 * 한번 생성된 String인스턴스가 갖고 있는 문자열은 읽어 올 수만 있고, 변경할 수는 없다.<br>
	 * 예를 들어 아래의 코드와 같이 '+'연산자를 이용해서 문자열을 결합하는 경우 인스턴스 내의 문자열이 바뀌는 것이 아니라 새로운 문자열("ab")이 담긴 String인스턴스가 생성되는 것이다.
	 * <pre><code>
	 *     String a = "a";
	 *     String b = "b";
	 *            a = a + b;
	 * </code></pre>
	 * <br>
	 * 문자열간의 결합이나 추출 등 문자열을 다루는 작업이 많이 필요한 경우에는 String클래스 대신 StringBuffer클래스를 사용하는 것이 좋다.<br>
	 * StringBuffer인스턴스에 저장된 문자열은 변경이 가능하므로 하나의 StringBuffer인스턴스만으로도 문자열을 다루는 것이 가능하다.
	 */
	class Memo11 {

	}

	/**
	 * <h5>문자열의 비교</h5><br>
	 * String클래스의 생성자를 이용한 경우에는 new연산자에 의해서 메모리할당이 이루어지기 때문에 항상 새로운 String인스턴스가 생성된다.<br>
	 * 문자열 리터럴은 이미 존재하는 것을 재사용하는 것이다.<br>
	 * <small>※ 문자열 리터럴은 클래스가 메모리에 로드될 때 자동적으로 미리 생성된다.</small>
	 */
	class Memo12 {

	}

	/**
	 * <h5>문자열 리터럴</h5><br>
	 * 자바 소스파일에 포함된 모든 문자열 리터럴은 컴파일 시에 클래스 파일에 저장된다. 이 때 같은 내용의 문자열 리터럴은 한번만 저장된다.<br>
	 * 문자열 리터럴도 String인스턴스이고, 한번 생성하면 내용을 변경할 수 없으니 하나의 인스턴스를 공유하면 되기 때문이다.<br>
	 * String리터럴들은 컴파일시에 클래스파일에 저장된다.<br>
	 * 클래스 파일에는 소스파일에 포함된 모든 리터럴의 목록이 있다. 해당 클래스 파일이 클래스 로더에 의해 메모리에 올라갈 때, 이 리터럴의 목록에 있는 리터럴들이 JVM내에 있는 '상수 저장소(constant pool)'에 저장된다.
	 */
	class Memo13 {

	}

	/**
	 * <h5>빈 문자열(empty string)</h5><br>
	 * 길이가 0인 배열이 존재할 수 있을까? 답은 'Yes'이다. char형 배열도 길이가 0인 배열을 생성할 수 있고, 이 배열을 내부적으로 가지고 잇는 문자열이 바로 빈 문자열이다.<br>
	 * 'String s = ""'와 같은 문장이 있을 때, 참조변수 s가 참조하고 있는 String인스턴스는 내부에 'new char[0]'과 같이 길이가 0인 char형 배열을 저장하고 있는 것이다.<br>
	 * 'String s = "";'과 같은 표현이 가능하다고 해서 'char c = ";'와 같은 표현도 가능한 것은 아니다. char형 변수에는 반드시 하나의 문자를 지정해야한다.<br>
	 * <pre><code>
	 *     String s = null;
	 *     char c = '\u0000';
	 *     ↓
	 *     String s = ""; // 빈 문자열로 초기화
	 *     char c = ' '; // 공백으로 초기화
	 * </code></pre>
	 * <br>
	 * 일반적으로 변수를 선언할 때, 각 타입의 기본값으로 초기화 하지만 String은 참조형 타입의 기본값인 null 보다는 빈 문자열로, char형은 기본값인 '\u0000' 대신 공백으로 초기화하는 것이 보통이다.<br>
	 * <small>※'\u0000'은 유니코드의 첫 번째 문자로써 아무런 문자도 지정되지 않은 빈 문자이다.</small>
	 */
	class Memo14 {

	}

	/**
	 * <h5>유니코드의 보충문자</h5><br>
	 * 유니코드는 원래 2 byte, 즉 16비트 문자체계인데, 이걸로도 모자라서 20비트로 확장하게 되었다.<br>
	 * 그래서 하나의 문자를 char타입으로 다루지 못하고, int타입으로 다룰 수 밖에 없다.<br>
	 * 확장에 의해 새로 추가된 문자들을 '보충 문자(supplementary character)'라고 하는데, String클래스의 메서드 중에서는 보충 문자를 지원하는 것이 있고 지원하지 않는 것도 있다.<br>
	 * 이들을 구별하는 방법은 쉽다. 매개변수가 'int ch'인 것들은 보충문자를 지원하는 것이고, 'char ch'인 것들은 지원하지 않는 것들이다.
	 */
	class Memo15 {

	}

	/**
	 * <h5>문자 인코딩 변환</h5><br>
	 * getBytes(String charsetName)를 사용하면, 문자열의 문자 인코딩을 다른 인코딩으로 변경할 수 있다.<br>
	 * 자바가 UTF-16을 사용하지만, 문자 리터럴에 포함되는 문자들은 OS의 인코딩을 사용한다.<br>
	 * 한글 윈도우즈의 경우 문자 인코딩으로 CP949를 사용하며, UTF-8로 변경하려면, 아래와 같이 한다.<br>
	 * <pre><code>
	 *     byte[] utf8_str = "가".getBytes("UTF-8"); // 문자열을 UTF-8로 변환
	 *     String str = new String(utf8_str, "UTF-8"); // byte배열을 문자열로 변환
	 * </code></pre>
	 * <br>
	 * 서로 다른 문자 인코딩을 사용하는 컴퓨터 간에 데이터를 주고받을 때는 적절한 문자 인코딩이 필요하다.<br>
	 * 그렇지 않으면 알아볼 수 없는 내용의 문서를 보게 될 것이다.<br>
	 * UTF-8은 한글 한 글자를 3 byte로 표현하고, CP949는 2 byte로 표현한다. 그래서 문자'가'는 UTF-8로 '0xEAB080'이고, CP949로 '0xB0A1'이다.<br>
	 * <small>※문자 인코딩은 CP949는 MS949라고도 한다.</small>
	 */
	class Memo16 {

	}

	/**
	 * <h5>String.format()</h5><br>
	 * format()은 형식화된 문자열을 만들어내는 간단한 방법이다. printf()하고 사용법이 완전히 똑같으므로 사용하는데 별 어려움은 없을 것이다.
	 */
	class Memo17 {

	}

	/**
	 * <h5>기본형 값을 String으로 변환</h5><br>
	 * 숫자에 빈 문자열을""을 더해주기만 하면 된다. 이 외에도 valueOf()를 사용하는 방법도 있다. 성능은 valueOf()가 더 좋지만, 빈 문자열을 더하는 방법이 간단하고 편하기 때문에 성능향상이 필요한 경우에만 valueOf()를 쓰자.<br>
	 * <small>※참조변수에 String을 더하면, 참조변수가 가리키는 인스턴스의 toString()을 호출하여 String을 얻은 다음 결합한다.</small>
	 */
	class Memo18 {

	}

	/**
	 * <h5>String을 기본형 값으로 변환</h5><br>
	 * String을 기본형으로 변환하는 방법도 간단하다. valueOf()를 쓰거나 앞서 배운 parseInt()를 사용하면 된다.<br>
	 * valueOf(String s)는 메서드 내부에서 그저 parseInt(String s)를 호출할 뿐이므로, 두 메서드는 반환 타입만 다르지 같은 메서드다.<br>
	 * <small>※parseInt(s, 10)은 parseInt(s)와 같다.</small><br>
	 * <small>※문자열"A"를 문자'A'로 변환하려면 char ch = "A".charAt(0)과 같이 하면 된다.</small><br>
	 * parseInt()나 parseFloat()같은 메서드는 문자열에 공백 또는 문자가 포함되어 있는 경우 변환 시 예외(NumberFormatException)가 발생할 수 있으므로 주의해야 한다.<br>
	 * 그래서 문자열 양끝의 공백을 제거해주는 trim()을 습관적으로 같이 사용하기도 한다.<br>
	 * 부호를 의미하는 '+'나 소수점을 의미하는 ','와 float형 값을 뜻하는 f와 같은 자료형 접미사는 허용된다.<br>
	 * 단, 자료형에 알맞은 변환을 하는 경우에만 허용된다.<br>
	 * <small>※'+'가 포함된 문자열이 parseInt()로 변환가능하게 된 것은 JDK1.7부터이다.</small><br>
	 * substring(int start, int end)를 사용할 떄 주의해야할 점은 매개변수로 사용되는 문자열에서 각 문자의 위치를 뜻하는 index가 0부터 시작한다는 것과 start부터 end의 범위중 end위치에 있는 문자는 결과에 포함되지 않는다는 것이다.<br>
	 * <small>※end에서 start값을 빼면 substring에 의해 추출될 글자의 수가 된다.</small>
	 */
	class Memo19 {

	}

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
	class Memo20 {

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
	class Memo21 {

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
	class Memo22 {

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
	class Memo23 {
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
	class Memo24 {
	}

	/**
	 * <h5>1.4 Math클래스</h5><br>
	 * Math클래스는 기본적인 수학계산에 유용한 메서드로 구성되어 있다.<br>
	 * Math클래스의 생성자는 접근 제어자가 private이기 때문에 다른 클래스에서 Math인스턴스를 생성할 수 없도록 되어있다.<br>
	 * 그 이유는 클래스 내에 인스턴스변수가 하나도 없어서 인스턴스를 생성할 필요가 없기 때문이다.<br>
	 */
	class Memo25 {

	}

	/**
	 * <h5>올림, 버림, 반올림</h5><br>
	 * 소수점 n번째 자리에서 바놀림한 값을 얻기 위해서는 round()를 사용해야 하는데, 이 메서드는 항상 소수점 첫째자리에서 반올림을 해서 정수값(long)을 결과로 돌려준다.<br>
	 * <pre><code>
	 *    1. 원래 값에 100을 곱한다.
	 *     90.7552 * 100 -> 9075.52
	 *    2. 위의 결과에 Math.round()를 사용한다.
	 *     Math.round(9075.52) -> 9076
	 *    3. 위의 결과를 다시 100.0으로 나눈다.
	 *     9076 / 100.0 -> 90.76
	 *     9076 / 100 -> 90
	 * </code></pre>
	 * <br>
	 * 만일 정수형 값인 100 또는 100L로 나눈다면, 결과는 정수형 값을 얻게 될 것이다.<br>
	 * 정수형간의 연산에서는 반올림이 이루어지지 않는다는 것을 반드시 기억하자.<br>
	 * 반올림이 필요하지 않다면 round()를 사용하지 않고 단순히 1000으로 곱하고 1000.0으로 나눈기만 하면 된다.<br>
	 * rint()도 round()처럼 소수점 첫 째자리에서 반올림하지만, 반환값이 double이다.<br>
	 * 그리고 rint()는 두 정수의 정가운데 있는 값은 가장 가까운 짝수 정수를 반환한다.<br>
	 * round()는 소수점 첫째자리가 5일 때, 더 큰 값으로 반올림하니까 -1이 되지만, rint()는 -1.5와 같이 홀수(-1.0)와 짝수(-2.0)의 딱 중간에 있는 경우 짝수(-2.0)를 결과로 반환한다.<br>
	 * 그리고 음수에서는 양수와 달리 -1.5를 버림(floor)하면 -2.0이 된다.
	 */
	class Memo26 {
	}

	/**
	 * <h5>예외를 발생시키는 메서드</h5><br>
	 * 메서드 이름에 'Exact'가 포함된 메서드들이 JDK1.8부터 새로 추가되었다. 이들은 정수형간의 연산에서 발생할 수 있는 오버플로우(overflow)를 감지하기 위한 것이다.<br>
	 * <pre><code>
	 *     int addExact(int x, int y) // x + y
	 *     int subtractExact(int x, int y) // x - y
	 *     int multiplyExact(int x, int y) // x * y
	 *     int incrementExact(int a) // a++
	 *     int decrementExact(int a) // a--
	 *     int negateExact(int a) // -a
	 *     int toIntExact(long value) // (int)value - int로의 형변환
	 * </code></pre>
	 * <br>
	 * 연산자는 단지 결과를 반환할 뿐, 오버플로우의 발생여부에 대해 알려주지 않는다. 그러나 위의 메서드들은 오버플로우가 발생하면, 예외(ArithmeticException)를 발생시킨다.<br>
	 * negateExact(int a)는 매개변수의 부호를 반대로 바꿔주는데 무슨 예외가 발생할까?라고 생각할지도 모르겠다.<br>
	 * 부호를 반대로 바꾸는 식은 '~a+1'이다. '~a'의 결과가 int의 최대값이면, 여기에 1을 더하니까 오버플로우가 발생할 수 있는 것이다.
	 */
	class Memo27 {

	}

	/**
	 * <h5>StrictMath클래스</h5><br>
	 * Math클래스는 최대한의 성능을 얻기 위해 JVM이 설치된 OS의 메서드를 호출해서 사용한다. 즉, OS에 의존적인 계산을 하고 있는 것이다.<br>
	 * 이러한 차이를 없애기 위해 성능은 다소 포기하는 대신, 어떤 OS에서 실행되어도 항상같은 결과를 얻도록 Math클래스를 새로 작성한 것이 StrictMath클래스이다.
	 */
	class Memo28 {

	}

	/**
	 * <h5>1.5 래퍼(wrapper) 클래스</h5><br>
	 * 객체지향 개념에서 모든 것은 객체로 다루어져야 한다. 그러나 자바에서는 8개의 기본형을 객체로 다루지 않는데 이것이 바로 자바가 완전한 객체지향 언어가 아니라는 얘기를 듣는 이유이다.<br>
	 * 그 대신 보다 높은 성능을 얻을 수 있었다.<br>
	 * 기본형(primitive type)변수도 어쩔 수 없이 객체로 다뤄야 하는 경우가 있다. 매개변수로 객체를 요구할 때, 기본형 값이 아닌 객체로 저장해야할 때, 객체간의 비교가 필요할 때 등등의 경우에는 기본형 값들을 객체로 변환하여 작업을 수행해야 한다.<br>
	 * 이 때 사용되는 것이 래퍼(wrapper)클래스이다. 8개의 기본형을 대표하는 8개의 래퍼클래스가 있는데, 이 클래스들을 이용하면 기본형 값을 객체로 다룰 수 있다.<br>
	 * char형과 int형을 제외한 나머지는 자료형 이름의 첫 글자를 대문자로 한 것이 각 래퍼 클래스의 이름이다.<br>
	 * 래퍼 클래스의 생성자는 매개변수로 문자열이나 각 자료형의 값들을 인자로 받는다. 이 때 주의해야할 것은 생성자의 매개변수로 문자열을 재공할 때, 각 자료형에 알맞은 문자열을 사용해야한다는 것이다.<br>
	 * 래퍼 클래스들은 객체생성 시에 생성자의 인자로 주어진 각 자료형에 알맞은 값을 내부적으로 저장하고 있다.<br>
	 * 래퍼클래스의 생성자<br>
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
	 *             <td>Boolean(boolean value), Boolean(String s)</td>
	 *             <td>Boolean b = new Boolean(true);, Boolean b2 = new Boolean("true");</td>
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
	 *             <td>Byte(byte value), Byte(String s)</td>
	 *             <td>Byte b = new Byte(10);, Byte b2 = new Byte("10");</td>
	 *         </tr>
	 *         <tr>
	 *             <td>short</td>
	 *             <td>Short</td>
	 *             <td>Short(short value), Short(String s)</td>
	 *             <td>Short s = new Short(10);, Short s2 = new Short("10");</td>
	 *         </tr>
	 *         <tr>
	 *             <td>int</td>
	 *             <td>Integer</td>
	 *             <td>Integer(int value), Integer(String s)</td>
	 *             <td>Integer i = new Integer(100);, Integer i2 = new Integer("10");</td>
	 *         </tr>
	 *         <tr>
	 *             <td>long</td>
	 *             <td>Long</td>
	 *             <td>Long(long value), Long(String s)</td>
	 *             <td>Long l = new Long(100);, Long l2 = new Long("100");</td>
	 *         </tr>
	 *         <tr>
	 *             <td>float</td>
	 *             <td>Float</td>
	 *             <td>Float(double value), Float(float value), Float(String s)</td>
	 *             <td>Float f = new Float(1.0);, Float f2 = new Float(1.0f);, Float f3 = new Float("1.0f");</td>
	 *         </tr>
	 *         <tr>
	 *             <td>double</td>
	 *             <td>Double</td>
	 *             <td>Double(double value), Double(String s)</td>
	 *             <td>Double d = new Double(1.0);, Double d2 = new Double("1.0");</td>
	 *         </tr>
	 *     </tbody>
	 * </table>
	 * <br>
	 * 래퍼 클래스들은 모두 equals()가 오버라이딩되어 있어서 주소값이 아닌 객체가 가지고 있는 값을 비교한다. 오토박싱이 된다고 해도 Integer객체에 비교연산자를 사용할 수 없다.<br>
	 * 대신 compareTo()를 제공한다.<br>
	 * toString()도 오버라이딩되어 있어서 객체가 가지고 있는 값을 문자열로 변환하여 반환한다. 래퍼 클래스들은 MAX_VALUE, MIN_VALUE, SIZE, BYTES, TYPE 등의 static 상수를 공통적으로 가지고 있다.<br>
	 */
	class Memo29 {

	}

	/**
	 * <h5>Number클래스</h5><br>
	 * 이 클래스는 추상클래스로 내부적으로 숫자를 멤버변수로 갖는 래퍼 클래스들의 조상이다. 기본형 중에서 숫자와 관련된 래퍼 클래스들은 모두 Number클래스의 자손이라는 것을 알 수 있다.<br>
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
	 *             return (short)intValue();
	 *         }
	 *     }
	 * </code></pre>
	 */
	class Memo30 {

	}

	/**
	 * <h5>문자열을 숫자로 변환하기</h5><br>
	 * <pre><code>
	 *     int i2 = Integer.parseInt("100"); // 주로 이 방법을 많이 사용.
	 * </code></pre>
	 * <br>
	 * 문자열을 기본형 또는 래퍼클래스로 변환하는 방법<br>
	 * <pre><code>
	 *     byte b = Byte.parseByte("100");
	 *     short s = Short.parseShort("100");
	 *     int i = Integer.parseInt("100");
	 *     long l = Long.parseLong("100");
	 *     float f = Float.parseFloat("3.14");
	 *     double d = Double.parseDouble("3.14");
	 *     Byte b = Byte.valueOf("100");
	 *     Short s = Short.valueOf("100");
	 *     Integer i = Integer.valueOf("100");
	 *     Long l = Long.valueOf("100");
	 *     Float f = Float.valueOf("3.14");
	 *     Double d = double.valueOf("3.14");
	 * </code></pre>
	 * <br>
	 * JDK1.5부터 도입된 '오토박싱(autoboxing)' 기능 때문에 반환값이 기본형일 때와 래퍼클래스일 때의 차이가 없어졌다. 그래서 그냥 구별없이 valueOf()를 쓰는 것도 괜찮은 방법이다. 단, 성능은 valueOf()가 조금 더 느리다.<br>
	 * 문자열이 10진수가 아닌 다른 진법(radix)의 숫자일 때도 변환이 가능하도록 다음과 같은 메서드가 제공된다.<br>
	 * <pre><code>
	 *     static int parseInt(String s, int radix) // 문자열 s를 radix진법으로 인식
	 *     static Integer valueOf(String s, int radix)
	 * </code></pre>
	 */
	class Memo31 {

	}

	/**
	 * <h5>오토박싱 & 언박싱(autoboxing & unboxing)</h5><br>
	 * JDK1.5이전에는 기본형과 참조형 간의 연산이 불가능했기 때문에, 래퍼 클래스로 기본형을 객체로 만들어서 연산해야 했다.<br>
	 * 이제는 기본형과 참조형 간의 덧셈이 가능하다. 자바 언어의 규칙이 바뀐 것은 아니고, 컴파일러가 자동으로 변환하는 코드를 넣어주기 때문이다.<br>
	 * 내부적으로 객체 배열을 가지고 있는 Vector클래스나 ArrayList클래스에 기본형 값을 저장해야할 때나 형변환이 필요할 때도 컴파일러가 자동적으로 코드를 추가해 준다.<br>
	 * 기본형 값을 래퍼 클래스의 객체로 자동 변환해주는 것을 '오토박싱(autoboxing)'이라고 하고, 반대로 변환하는 것을 '언박싱(unboxing)'이라고 한다.<br>
	 * 사실 이 기능은 컴파일러가 제공하는 편리한 기능일 뿐 자바의 원칙이 바뀐 것은 아니다. 생성자가 없는 클래스에 컴파일러가 기본 생성자를 자동적으로 추가해 주듯이 개발자가 간략하게 쓴 구문을 컴파일러가 원래의 구문으로 변경해 주는 것뿐이다.
	 */
	class Memo32 {

	}

}
