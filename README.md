# Getting Started

## HTML
```
<html>
<head>
<meta charset="UTF-8">
<title>My first HTML page</title>
</head>
<body>
	My first html page with body - JSP
</body>
</html>
```
## JSP
/myfirstwebapp/src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp

/say-hello-jsp => SayHelloController - sayHelloJsp method => sayHello

/WEB-INF/jsp/sayHello.jsp

## Login JSP

/login => com.idevalot.springboot.myfirstwebapp.login.LoginController => login.jsp

## 
localhost:8080/login

B1: Identifies correct Controller method
/login => LoginController.gotoLoginPage

B2: Executes Controller method
=> Puts data to model
=> Returns View name => login

B3: Identifies correct View
/WEB-INF/jsp/login.jsp


B4: Executes View


## Todo

id
username
description
targetDate
done

TodoController
listTodos.jsp

## Request vs Model vs Session

/META-INF/resourses/webjars/
bootstrap/5.1.3/css/
bootstrap.min.css

/META-INF/resourses/webjars/
bootstrap/3.6.4/js/
bootstrap.min.js




