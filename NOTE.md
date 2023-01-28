## 참고 자료
- 실행 참고: [Command Line에서 BootRun 실행하기](https://abbo.tistory.com/117)
- 빌드 참고: [3. gradlew (gradle wrapper) - spring 사용하기](https://gihyun.com/120)
- cmd 빌드 유의 사항: 윈도우는 `./` 없이 `gradlew`로 사용: [gradlew와 gradle.bat 을 사용해 gradle 설치하지 않고 사용하기](https://kotlinworld.com/314)
- 윈도우 cmd 프로세스 종료 명령어: [[윈도우 서버] cmd 프로세스 kill 명령어](https://blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=afidev&logNo=20189044670)
- spring 서버 종료 방법: [Spring Boot - 안전하게 종료시키기](https://heowc.dev/2018/12/27/spring-boot-graceful-shutdown/), [Graceful Shutdown Spring Boot Applications](https://blog.marcosbarbero.com/graceful-shutdown-spring-boot-apps/), [Graceful Shutdown Spring Boot Application Code](https://github.com/weekly-drafts/graceful-shutdown-spring-boot/blob/master/src/main/java/com/marcosbarbero/wd/gracefulshutdown/GracefulShutdown.java).
- 서버 종료 주의 사항: 서버를 실행중인 cmd 창은 명령어를 더 입력할 수 없으니 새 cmd 창을 열어 `taskkill`을 실행해야 함. 서버 종료는 `/F` 옵션을 추가해 강제로 종료해야 함. 

## 오류 해결
- 환경변수에 설정된 자바 버전과 프로젝트에서 사용하는 자바 버전 불일치 문제: [[Spring Boot / Error] 빌드 시 "Execution failed for task ':compileJava'.> invalid source release: 11" 에러 발생](https://devlifetestcase.tistory.com/7)

