#!/bin/bash

set -e

cd frontend
echo "Building frontend application"
npm run build

cd ..
echo "Cleaning static folder"
rm -r backend/src/main/resources/static/*

echo "Adding frontend artifacts to backend/static folder"
cp -r frontend/dist/ backend/src/main/resources/static/

cd backend
echo "Building full aplication into a jar"
./gradlew assemble

cd ..
echo "Building container image with jar"

docker build -t "service-catalog" .
