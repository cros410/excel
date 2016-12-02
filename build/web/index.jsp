<%-- 
    Document   : login
    Created on : 02/12/2016, 01:00:45 PM
    Author     : cvalencia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.5/css/bootstrap.min.css" integrity="sha384-AysaV+vQoT3kOAXZkl02PThvDr8HYKPZhNT5h/CXfBThSRXQ6jW5DO2ekP5ViFdi" crossorigin="anonymous">

    </head>
    <body>
        <div class="container" style="padding: 200px;">
            <div class="row">
                <div class="col-xs-3">

                </div>
                <div class="col-xs-6" style=" border: 1px solid black; border-radius: 10px; min-width: 400px;">
                    <div style="margin: 30px;">
                        <h2> Login</h2>
                        <div class="form-group">
                            <label> Usuario</label>
                            <input id="user" type="text" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label>Password</label>
                            <input id="pass" type="password" class="form-control"/>
                        </div>
                        <button id="btnlog" class="btn btn-primary"> Ingresar</button>
                        <a href="registro.jsp" class="btn btn-warning" style="margin-left: 100px;"> Registrarse</a>
                    </div>
                </div>
                <div class="col-xs-3" >

                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.1.1.js" integrity="sha256-16cdPddA6VdVInumRGo6IbivbERE8p7CQR3HzTBuELA=" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.5/js/bootstrap.min.js" integrity="sha384-BLiI7JTZm+JWlgKa0M0kGRpJbF2J8q+qreVrKBC47e3K6BW78kGLrCkeRX6I9RoK" crossorigin="anonymous"></script>
        <script src="main.js" type="text/javascript"></script>
    </body>

</html>
