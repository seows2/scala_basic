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
