# SPRING CLOUD MSA

* discoveryservice => @EnableEurekaServer
* user-service => @EnableDiscoveryClient

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
* 인강
  * https://www.inflearn.com/course/스프링-클라우드-마이크로서비스
* 참고
  * https://bcho.tistory.com/1252