
$(document).ready(function () {

    $("#btnlog").click(function () {
        var user = $("#user").val();
        var pass = $("#pass").val();
        var info =
                {
                    "usuario": user,
                    "clave": pass
                };
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/excel/service/excelweb/login",
            processData: false,
            contentType: 'application/json',
            data: JSON.stringify(info),
            success: function (r) {
                if (r.cod === 1) {
                    localStorage.setItem("usuario", r.user.usuario);
                    window.location.href = "excel.jsp";
                } else {
                    alert("Usuario no registrado");
                }

            }});

    });


    $("#btnreg").click(function () {
        var user = $("#user").val();
        var pass = $("#pass").val();
        var info =
                {
                    "usuario": user,
                    "clave": pass
                };
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/excel/service/excelweb/saveUser",
            processData: false,
            contentType: 'application/json',
            data: JSON.stringify(info),
            success: function (r) {
                if (r.cod === 1) {
                    localStorage.setItem("usuario", r.user.usuario);
                    window.location.href = "excel.jsp";
                } else {
                    alert("Usuario no registrado");
                }

            }});

    });



});