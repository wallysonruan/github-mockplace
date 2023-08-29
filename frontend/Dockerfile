FROM node:slim

COPY . /usr/src

WORKDIR /usr/src

RUN npm i && npm install

EXPOSE 5173

ENTRYPOINT [ "npm", "run", "dev" ]