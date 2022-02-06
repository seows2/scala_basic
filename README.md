# scala_basic

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
