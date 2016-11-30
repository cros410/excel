<%-- 
    Document   : index
    Created on : 30/11/2016, 01:12:21 PM
    Author     : cvalencia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="estilo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <form name="myform" id="myform">
            <table id="tab">
                <tr id="r1">
                    <th>#</th>
                </tr>
                <tr id="r2">
                    <td>1</td>
                </tr>
            </table>
            <table id="blacklistgrid">
                <tr id="Row1">
                    <th>A</th>
                </tr>
                <tr id="Row2">
                    <td contenteditable="true" ></td>
                </tr>
            </table>
            <br>
            <br>
            <button type="button" id="btnAdd">Agregar fila!</button></br></br>
            <button type="button" id="btnAddCol">Agregar columna!</button></br></br>
            <button type="button" id="btnrun"/>Recorrer tabla</button>
            <button type="button" id="btnsave"/>Guardar</button>
    </form>
    <script src="https://code.jquery.com/jquery-3.1.1.js" integrity="sha256-16cdPddA6VdVInumRGo6IbivbERE8p7CQR3HzTBuELA=" crossorigin="anonymous"></script>
    <script src="js.js" type="text/javascript"></script>
</body>
</html>
