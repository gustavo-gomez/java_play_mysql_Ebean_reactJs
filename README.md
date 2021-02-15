## Overview

- **This is a template, which you can start from**
- **We are using: Play Framework 2.8, Java 11, Webpack, ReactJs, Ebean ORM, MYSQL**
- **In the view you will find a button, this will insert a new row in database, using Ebean ORM to connect Java and MYSQL**

## Pre Requisites

Install the following:

- Java 
- sbt
- Mysql 5 or 8.0



## Setup Project

Clone into your local:
```sh
git clone https://github.com/gomezf09/java_play_mysql_Ebean_reactJs.git
```
Update database username and password in `application.config`.
You can use environment variables for it, like this:

```
db.default.url=${?DB_CONNECT_URL}
db.default.username=${?DB_USERNAME}
db.default.password=${?DB_PASSWORD}
```

Create a database called: `test_db` (if you are using another name, be sure to update the file `application.config`)

Depending of the MYSQL version you had installed, update `build.sbt`

Setup backend

```sh
sbt compile
```
Install react dependencies

```sh
cd react
npm install
```

### Run the project

Frontend
```sh
cd react
npm start
```

Backend
```sh
sbt run
```

Also you can run backend using an IDE, in that case you just need to run frontend
