# scala_basic

## 스칼라 설치하기

`brew install coursier/formulas/coursier && cs setup`  
또는  
`curl -fLo cs https://git.io/coursier-cli-macos && chmod +x cs && (xattr -d com.apple.quarantine cs || true) && ./cs setup`

## 프로젝트 생성

1. 빈 폴더에 들어간다. `mkdir hello-world-ver.2 && cd hello-world-ver.2`
2. Scala2 프로젝트 생성 -> `sbt new scala/원하는프로젝트이름.g8`  
   Scala3 프로젝트 생성 -> `sbt new scala/scala3.g8`
3. 명령어 프롬프트에 원하는 프로젝트 명 적기 `hello-world-ver.2'

4. 그럼 아래와 같은 Scala 프로젝트가 생성

```
- hello-world-ver.2
    - project (sbt uses this for its own files)
        - build.properties
    - build.sbt (sbt's build definition file)
    - src
        - main
            - scala (all of your Scala code goes here)
                - Main.scala (Entry point of program) <-- this is all we need for now
```

## 컴파일

- Main.scala

```scala
object Main extends App {
  println("Hello, World!")
  println("안녕")
  println("반가워요!")
}
```

`javac`을 쓰는 것과 같이 `scalac`을 통해 컴파일  
Main.scala가 있는 폴더로 가서
`scalac Main.scala` 를 하면 `Main$.class`와 `Main.class`가 생김  
javac과 같은 바이트코드로 컴파일되고 JVM내에서 실행 가능  
`scala Main`을 하면 컴파일된 class를 실행시켜볼 수 있다.

![이미지](/images/scala1.png)

근데 더 쉬운 방법.

1. `build.sbt`가 있는 폴더로 들어감.
2. `sbt`를 입력하면 sbt console로 진입할 수 있음
3. `~run`입력.  
   그럼 sbt서버가 알아서 컴파일해서 실행시켜줌

## 사칙연산

변수는 `var` 상수는 `val`로 선언

```scala
object Main extends App {
  val x: Int = 4
  val y: Int = 2
  println((x).+(y))
  println(x + y)
  println(x + (x + y)./(y))
}
```

스칼라는 Int와 같은 원시타입을 객체로 취급함  
그래서 사실상 변수 x도 객체!  
그래서 `(x).+(y)`라는 식은 x라는 객체에서 +라는 함수를 불러오고 인자로 y를 넣겠다는 의미와 같음  
물론 그냥 `x + y`라 해도 됨  
개념을 잘 알아둬야 할 듯!

## 프린트

```scala
object Main extends App {
  val x = 10
  val y = 1

  println("1. " + x + "은 " + y + "보다 크다!")
  println(s"2. $x 은 $y 보다 크다!")
  println(s"3. $x + $y = ${x + y}")
  println(s"4. PI는 ${Math.PI}")
}
```

앞에 s를 붙이면 $로 중간에 변수 삽입 가능 굿
