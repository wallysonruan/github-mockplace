# Set help as the default command if the user enters 'make'
.DEFAULT_GOAL := help

help:
 @echo 'Available commands:'


# Separated lines: Commands executed in different folders, that's why the commands below are united by the && operator.
# cd <folder> && <command>
.PHONY: vue-test
vue-test:
	cd frontend && npm run test

.PHONY: vue-build
vue-build:
	cd frontend && npm run build

.PHONY: java-jar
java-jar:
	cd backend && gradle assemble

.PHONY: docker-compose
docker-compose:
	docker-compose up

.PHONY: docker-build
docker-build:
	docker build -t "simple-catalog" .

build-image: vue-test vue-build java-jar docker-build