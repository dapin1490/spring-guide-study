## spring guide study
- [Building a RESTful Web Service](#building-a-restful-web-service)
  - [프로젝트 구성](#프로젝트-구성)
- [Building REST services with Spring](#building-rest-services-with-spring)
  - [프로젝트 구성](#프로젝트-구성-1)
- [참고 자료](#참고-자료)
- [오류 해결](#오류-해결)

# Building a RESTful Web Service
[Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)

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

# Building REST services with Spring
[Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

## 프로젝트 구성
tutorial: <https://spring.io/guides/tutorials/rest/>    
initializer: <https://start.spring.io/>  

- Project: Gradle - Groovy  
- Language: Java  
- Spring Boot: 2.7.8  
- Project Metadata
  - Group: com.example
  - Artifact: build-rest-service
  - Name: build-rest-service
  - Description: Guide project for Spring Boot
  - Package name: com.example.build-rest-service
  - Packaging: Jar
  - Java: 19
- Dependencies: Spring Web, Spring Data JPA, H2 Database

# 참고 자료
- 실행 참고: [Command Line에서 BootRun 실행하기](https://abbo.tistory.com/117)
- 빌드 참고: [3. gradlew (gradle wrapper) - spring 사용하기](https://gihyun.com/120)
- cmd 빌드 유의 사항: 윈도우는 `./` 없이 `gradlew`로 사용: [gradlew와 gradle.bat 을 사용해 gradle 설치하지 않고 사용하기](https://kotlinworld.com/314)

# 오류 해결
- 환경변수에 설정된 자바 버전과 프로젝트에서 사용하는 자바 버전 불일치 문제: [[Spring Boot / Error] 빌드 시 "Execution failed for task ':compileJava'.> invalid source release: 11" 에러 발생](https://devlifetestcase.tistory.com/7)

