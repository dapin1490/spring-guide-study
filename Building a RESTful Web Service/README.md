# spring guide study

## 프로젝트 구성
tutorial: <https://spring.io/guides/gs/rest-service/>    
initializer: <https://start.spring.io/>  

- Project: Gradle - Groovy  
- Language: Java  
- Spring Boot: 2.7.8  
- Project Metadata
  - Group: com.example
  - Artifact: spring_guide_study
  - Name: spring_guide_study
  - Description: Guide project for Spring Boot
  - Package name: com.example.spring_guide_study
  - Packaging: Jar
  - Java: 19
- Dependencies: Spring Web

## 참고 자료
- 실행 참고: [Command Line에서 BootRun 실행하기](https://abbo.tistory.com/117)
- 빌드 참고: [3. gradlew (gradle wrapper) - spring 사용하기](https://gihyun.com/120)
- cmd 빌드 유의 사항: 윈도우는 `./` 없이 `gradlew`로 사용: [gradlew와 gradle.bat 을 사용해 gradle 설치하지 않고 사용하기](https://kotlinworld.com/314)

## 오류 해결
- 환경변수에 설정된 자바 버전과 프로젝트에서 사용하는 자바 버전 불일치 문제: [[Spring Boot / Error] 빌드 시 "Execution failed for task ':compileJava'.> invalid source release: 11" 에러 발생](https://devlifetestcase.tistory.com/7)

## cmd로 실행하기

```shell
$ cd C:\Users\dpgbu\Desktop\SAE\tool\github\spring-guide-study\Building a RESTful Web Service
$ gradlew build
$ java -jar build/libs/Building-a-RESTful-Web-Service-0.0.1-SNAPSHOT.jar
$ curl localhost:8080/greeting
```
