컴파일과 실행
1. Hello.java와 같은 자바 소스 코드를 개발자가 작성한다.
2. 자바 컴파일러를 사용해서 소스 코드를 컴파일 한다.
    - 자바가 제공하는 javac라는 프로그램을 사용한다.
    - .java -> .class 파일이 생성된다.
    - 자바 소스 코드를 바이트 코드로 변환하여 자바 가상 머신에서 더 빠르게 실행될 수 있게 최적화하고 문법 오류도 검출한다.
3. 자바 프로그램을 실행한다.
    - 자바가 제공하는 java라는 프로그램을 사용한다.
    - 자바 가상 머신(JVM)이 실행되면서 프로그램이 작동한다.

자바 언어의 관례
클래스는 대문자로 시작, 나머지는 소문자로 시작
- 자바에서 클래스 이름의 첫 글자는 대문자로 시작함 그리고 나머지는 모두 첫 글자를 소문자로 시작
- 여기에 낙타 표기법을 적용함
- 예시 : 클래스는 첫글자 대문자, 나머지는 모두 첫 글자 소문자로 시작 + 낙타 표기법
    - 클래스 : Person, OrderDetail
    - 변수를 포함한 나머지 : firstName
- 예외 2가지
    - 상수는 모두 대문자 사용하고 언더바로 구분 (USER_LIMIT)
    - 패키지는 모두 소문자 사용

- 변수의 이름은 용도에 명확하게 설명해야함 !!!