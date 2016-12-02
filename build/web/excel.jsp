<%-- 
    Document   : test
    Created on : 01/12/2016, 02:17:30 AM
    Author     : ChristianV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Excel web</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.5/css/bootstrap.min.css" integrity="sha384-AysaV+vQoT3kOAXZkl02PThvDr8HYKPZhNT5h/CXfBThSRXQ6jW5DO2ekP5ViFdi" crossorigin="anonymous">
        <link href="estilo2.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                        <h4 class="modal-title" id="myModalLabel">Sumar</h4>
                    </div>
                    <div class="modal-body">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-12">
                                    <h5>Sintaxis: </h5>
                                </div>
                                <div class="col-md-12">
                                    <label> =SUMAR rango_celdas</label>
                                    <div>Mas informacion : </div>
                                    <br>
                                    <div style="margin-left: 20px;"> * rango_celdas son las celdas que se sumará. Estas estarán separadas por el caracter dos puntos (:)</div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade" id="myModal3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                        <h4 class="modal-title" id="myModalLabel">Documentos</h4>
                    </div>
                    <div class="modal-body">
                        <div class="container">
                            <div class="row" id="docus">
                                
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade" id="myModal4" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                        <h4 class="modal-title" id="myModalLabel">Documentos</h4>
                    </div>
                    <div class="modal-body">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-12 form-group">
                                    <label> Nombre </label>
                                    <input type="text"  class="form-control" id="nomdoc"/>
                                    <button style="margin-top: 30px;" class="btn btn-primary" id="gdoc">Guardar</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                        <h4 class="modal-title" id="myModalLabel">Integrantes</h4>
                    </div>
                    <div class="modal-body">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-4">
                                    <img src="http://oliva.ulima.edu.pe/imagenes/fotos/165362.jpg" class="img-thumbnail">
                                    <div style="text-align: center;"> Juan  Saquicoray </div>
                                    <div style="text-align: center;"> 20112350  </div>
                                </div>
                                <div class="col-md-4">
                                    <img src="http://oliva.ulima.edu.pe/imagenes/fotos/173276.jpg" class="img-thumbnail">
                                    <div style="text-align: center;"> Luis Carbajal </div>
                                    <div style="text-align: center;"> 20121568  </div>
                                </div>
                                <div class="col-md-4">
                                    <img src="http://oliva.ulima.edu.pe/imagenes/fotos/152008.jpg" class="img-thumbnail">
                                    <div style="text-align: center;"> Cyndi Blanco </div>
                                    <div style="text-align: center;"> 20102219  </div>
                                </div>
                                <div class="col-md-4">
                                    <img src="http://oliva.ulima.edu.pe/imagenes/fotos/145019.jpg" class="img-thumbnail">
                                    <div style="text-align: center;"> Andre Acosta </div>
                                    <div style="text-align: center;"> 20091298  </div>
                                </div>
                                <div class="col-md-4">
                                    <img src="http://oliva.ulima.edu.pe/imagenes/fotos/128892.jpg" class="img-thumbnail">
                                    <div style="text-align: center;"> Andrés Abad </div>
                                    <div style="text-align: center;"> 20080002  </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <nav class="navbar navbar-dark bg-primary navbar-fixed-top">
            <button class="navbar-toggler hidden-lg-up" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation"></button>
            <div class="collapse navbar-toggleable-md" id="navbarResponsive">
                <a class="navbar-brand" href="#">ExcelWeb</a>
                <ul class="nav navbar-nav">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle"  id="responsiveNavbarDropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Operaciones</a>
                        <div class="dropdown-menu" aria-labelledby="responsiveNavbarDropdown">
                            <a class="dropdown-item" id="btnsumar">Sumar</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle"  id="responsiveNavbarDropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Ayuda</a>
                        <div class="dropdown-menu" aria-labelledby="responsiveNavbarDropdown">
                            <a class="dropdown-item" id="btnsomos">¿Quienes somos?</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle"  id="responsiveNavbarDropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Acciones</a>
                        <div class="dropdown-menu" aria-labelledby="responsiveNavbarDropdown">
                            <a class="dropdown-item" id="btnrun">Nuevo</a>
                            <a class="dropdown-item" id="btnsave">Guardar</a>
                            <a class="dropdown-item" id="btnabrir" >Abrir</a>
                            <a class="dropdown-item" id="btnAdd" >Agregar Fila</a>
                            <a class="dropdown-item" id="btnAddCol">Agregar Columna</a>
                        </div>
                    </li>
                </ul>
            </div>
        </nav>
        <table  class="excel" id="blacklistgrid">
            <tr id="Row1">
                <th>#</th>
                <th>A</th>
            </tr>
            <tr id="Row2">
                <td class="num">1</td>
                <td class="celda" contenteditable="true" ></td>
            </tr>
        </table>
        <script src="https://code.jquery.com/jquery-3.1.1.js" integrity="sha256-16cdPddA6VdVInumRGo6IbivbERE8p7CQR3HzTBuELA=" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.5/js/bootstrap.min.js" integrity="sha384-BLiI7JTZm+JWlgKa0M0kGRpJbF2J8q+qreVrKBC47e3K6BW78kGLrCkeRX6I9RoK" crossorigin="anonymous"></script>
        <script src="js2.js" type="text/javascript"></script>
    </body>
</html>
