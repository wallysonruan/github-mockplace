# Set help as the default command if the user enters 'make'
.DEFAULT_GOAL := help

help:
	@echo 'Available commands:'
	@echo 'frontend-test			Run all Vue tests.'
	@echo 'frontend-build			Run the tests and build the frontend.'
	@echo 'backend-test				Run all Java tests.'
	@echo 'backend-build			Run all Java tests and build the whole application.'
	@echo 'build-app-image			Build the whole application image.'
	@echo 'app-build				Run all builds'


BACKEND_FOLDER := "backend/"
FRONTEND_FOLDER := "frontend/"
IMAGE_NAME := "github-mockplace"

# Separated lines: Commands executed in different folders, that's why the commands below are united by the && operator.
# cd <folder> && <command>
.PHONY: frontend-test
frontend-test:
	cd ${FRONTEND_FOLDER} && npm i && npm run test

.PHONY: frontend-build
frontend-build: frontend-test
	make frontend-test
	cd ${FRONTEND_FOLDER} && npm run build

.PHONY: backend-test
backend-test:
	cd ${BACKEND_FOLDER} && gradle test

.PHONY: backend-build
backend-build: backend-test
	make backend-test
	cd ${BACKEND_FOLDER} && gradle assemble

.PHONY: build-app-image
build-app-image:
	docker build -t ${IMAGE_NAME} .
	@echo 'IMAGE NAME: ${IMAGE_NAME}'

.PHONY: app-build
app-build: frontend-build backend-build build-app-image
	frontend-build
	backend-build
	build-app-image
