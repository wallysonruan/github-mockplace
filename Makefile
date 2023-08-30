# Set help as the default command if the user enters 'make'
.DEFAULT_GOAL := help

help:
 @echo 'Available commands:'


# Separated lines: Commands executed in different folders, that's why the commands below are united by the && operator.
# cd <folder> && <command>
.PHONY: frontend-test
frontend-test:
	cd frontend && npm i && npm run test

.PHONY: frontend-build
frontend-build: frontend-test
	cd frontend && npm i
	make frontend-test
	cd frontend && npm run build

.PHONY: backend-test
backend-test:
	cd backend && gradle test

.PHONY: backend-build
backend-build: backend-test
	make backend-test
	cd backend && gradle assemble

.PHONY: docker-compose
docker-compose:
	docker-compose up

.PHONY: build-app-image
build-app-image:
	docker build -t "simple-catalog" .

.PHONY: app-build
app-build: frontend-test frontend-build backend-test backend-build build-app-image
	make frontend-build
	make backend-build
	make build-app-image