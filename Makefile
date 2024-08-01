build:
	mvn clean package -DskipTests


.PHONY: run
run:
	mvn spring-boot:run


.PHONY: test
test:
	mvn test