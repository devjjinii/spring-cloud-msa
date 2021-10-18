# SPRING CLOUD MSA
:star: <b>인강</b> :star:
  * https://www.inflearn.com/course/스프링-클라우드-마이크로서비스
---
* discoveryservice => @EnableEurekaServer
* user-service => @EnableDiscoveryClient
* zuul-service => @EnableZuulProxy
---
* GateWay Client > GateWay Handler > Global Filter > CustomFilter > Logging Filter > Proxied Service
  * 순차실행, 역순종료

---
##### 여러개의 인스턴스 실행
* <img width="600" src="https://user-images.githubusercontent.com/53853730/136024443-62772958-6e09-426b-b81c-463d1693d751.png">
 
* mvn spring-boot:run -Dspring-boot.run.jvmArguments='-Dserver.port=[포트번호]'
  * mvn clean
* mvn compile package
  * java -jar -Dserver.port=[포트번호] ./target/user-service-0.0.1-SNAPSHOT.jar
---
* 랜덤포트 사용시
  * .yml > port: 0 으로 설정

---
* spring boot 2.3 까지는 spring-cloud-starter-netflix-zuul 을 통해 zuul 지원
  * 2.4 부터는 spring-cloud-starter-gateway 를 사용
  * 우선은 2.4.x 버전으로 프로젝트 생성 후, `pom.xml` 에서 boot의 버전을 2.3.11 로 변경 후 dependency 추가
  * mvn clean compile package   
---
* spring cloud zuul -> 동기방식 : tomcat 서버구동
* spring cloud gateway -> 비동기방식 : netty 서버구동
