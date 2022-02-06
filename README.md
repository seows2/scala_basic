# scala_basic

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
