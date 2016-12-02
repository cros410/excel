

var cols = 1;
var fila = 1;
var data = "";

function addNumFila() {
    $("#blacklistgrid tr").each(function (index) {
        if (index !== 0) {
            $(this).children("td").each(function (index2) {
                if (index2 === 0) {
                    $(this).html(index);
                }
            });
        }
    });
}

$('#btnAddCol').click(function () {
    addCol();
});

$('#btnAdd').click(function () {
    addFila();
});




function getData() {
    data = "";
    $("#blacklistgrid tr").each(function (index) {
        if (index !== 0) {
            var posh = index;
            $(this).children("td").each(function (index2) {
                var posv = index2;
                if (index2 !== 0) {
                    if ($(this).html() === "") {
                        console.log("valor : vacio ");
                    } else {
                        console.log($(this).html());
                        data = data + "&" + posh + "/" + posv + "%" + $(this).html();

                    }
                }
            });
        }
    });
}
;

function opeen(c, f, cadena) {
    $("#blacklistgrid").html("");
    armarTabla(c, f);
    var res = getInfo(cadena);
    $("#blacklistgrid tr").each(function (index) {
        if (index !== 0) {
            var posh = index;
            $(this).children("td").each(function (index2) {
                var posv = index2;
                if (index2 !== 0) {
                    var find = isInArray(posh + "/" + posv, res);
                    if (find.is) {
                        $(this).html(find.val);
                    }
                }
            });
        }
    });
}
;

function isInArray(pos, array) {
    var is = false;
    var val;
    for (var i = 0; i < array.length; i++) {
        var ar = array[i];
        if (ar[0] === pos) {
            is = true;
            val = ar[1];
        }
        if (i === (array.length - 1)) {
            return {"is": is, "val": val};
        }
    }
}

function getInfo(cadena) {
    var info = [];
    var cels = cadena.split("&");

    for (var i = 0; i < cels.length; i++) {
        var cel = cels[i].split("%");
        var posi = cel[0].split("/");
        info.push([posi[0] + "/" + posi[1], cel[1]]);
        if (i === (cels.length - 1)) {
            return info;
        }
    }
}

function armarTabla(co, fi) {
    var base = '<tr id="Row1"><th>#</th><th>A</th></tr><tr id="Row2"><td  class="num">1</td><td class="celda" contenteditable="true" ></td></tr>';
    $("#blacklistgrid").html(base);
    cols = 1;
    fila = 1;

    $(".celda").bind('keypress', function (e) {
        if (e.keyCode === 13) {
            sumar($(this).html(), $(this));
            return false;
        } else {
            return true;
        }

    });

    for (var i = 1; i < co; i++) {
        addCol();
    }
    for (var j = 1; j < fi; j++) {
        addFila();
    }

}

function addFila() {
    var count = 1;
    var first_row = $('#Row2');
    fila++;
    while (count-- > 0) {
        var newcel = first_row.clone(true)
                .find("td").html("").end();
        newcel.appendTo('#blacklistgrid');
    }
    addNumFila();
}

function getFormat() {
    var first_row = $('#Row2');
    var newcel = first_row.clone(true)
            .find("td").html("").end();
    return newcel.find("td:nth-child(2)");
}

function addCol() {
    cols++;
    $("#blacklistgrid tr").each(function (index, value) {
        if (index === 0) {
            $(this).append('<th>' + getCabecera().toUpperCase() + '</th>');
        } else {
            $(this).append(getFormat());
        }
    });
}


$('#btnsave').click(function () {
    $('#myModal4').modal('show');
});


$('#gdoc').click(function () {
    var nbd = $("#nomdoc").val();
    var usr = localStorage.getItem('usuario');
    var cl = cols;
    var fl = fila;
    getData();
    setTimeout(function () {
        var cad = data.substr(1, data.length);
        var info =
                {
                    "cadena": cad,
                    "col": cl,
                    "fila":fl,
                    "nombre":nbd,
                    "usuario":usr
                };
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/excel/service/excelweb/saveDoc",
            processData: false,
            contentType: 'application/json',
            data: JSON.stringify(info),
            success: function (r) {
                $('#myModal4').modal('hide');
                location.reload();
            }});

    }, 3000);

});



function getCabecera() {
    var num = Math.trunc(cols / 26);
    if (cols > 26) {
        return getLetra(cols) + "" + num;
    } else {
        return getLetra(cols) + "";
    }

}

function getLetra(num) {
    var char;

    var mul = Math.trunc(num / 26);
    if (num % 26 === 0) {
        mul--;
    }
    var pos = ((num - (((mul) * 26))));
    char = getForCha(pos);
    return char;
}

function getForCha(num) {
    return String.fromCharCode(97 + (num - 1));
}

$(".celda").bind('keypress', function (e) {
    if (e.keyCode === 13) {

        sumar($(this).html(), $(this));
        return false;
    } else {
        return true;
    }

});

function sumar(rango, cel) {
    var res = validarFuncion(rango);
    var suma = 0;
    var err = false;
    if (res.cod !== 1) {
        console.log("No es una funcion");
    } else {
        console.log("Desde : " + res.vals[0] + " / " + res.vals[1]);
        console.log("Hasta : " + res.vals[2] + " / " + res.vals[3]);
        console.log("cols " + cols);
        console.log("final " + fila);

        if ((res.vals[0] + 1) <= cols && (res.vals[2] + 1) <= cols) {
            if ((res.vals[1]) <= fila && (res.vals[3]) <= fila) {
                $("#blacklistgrid tr").each(function (index) {
                    if (index !== 0) {
                        var posh = index;
                        $(this).children("td").each(function (index2) {
                            var posv = index2;
                            if (index2 !== 0) {
                                if (index2 !== 0) {
                                    if (posv >= (res.vals[0] + 1) && posv <= (res.vals[2] + 1)
                                            && (posh >= res.vals[1]) && (posh <= res.vals[3])) {
                                        if ($(this).html() !== "") {
                                            console.log($(this).html());
                                            if (err === false) {
                                                if (isNumber($(this).html())) {
                                                    suma = suma + Number($(this).html());
                                                    console.log(suma);
                                                    cel.html(suma);

                                                } else {
                                                    alert("#ERROR");
                                                    cel.html("#ERROR");
                                                    err = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        });
                    }
                });
            } else {
                alert("rango no valido");
            }
        } else {
            alert("rango no valido");
        }
    }
}

function validarFuncion(func) {
    var res = {"cod": 0, "vals": []};

    if (func.substr(0, 1) === "=") {
        if (func.substr(1, 5) === "sumar") {
            if (func.substr(9, 1) === ":") {
                var r1 = func.substr(7, 2);
                var r2 = func.substr(10, 2);
                var r11 = r1.substr(0, 1).toLowerCase();
                var r12 = r1.substr(1, 2);
                var r21 = r2.substr(0, 1).toLowerCase();
                var r22 = r2.substr(1, 2);
                res.cod = 1;
                res.vals.push(getPosFromLetra(r11));
                res.vals.push(r12);
                res.vals.push(getPosFromLetra(r21));
                res.vals.push(r22);
                return res;
            } else {
                return res;
            }
        } else {
            return res;
        }
    } else {
        return res;
    }

}

function isNumber(val) {
    return !isNaN(val);
}

function getPosFromLetra(letra) {
    return (letra.charCodeAt(0) - 97);
}

$('#btnsumar').click(function () {
    $('#myModal').modal('show');
});

$('#btnsomos').click(function () {
    $('#myModal2').modal('show');
});


$('#btnabrir').click(function () {

    var user = localStorage.getItem('usuario');
    var info =
            {
                "usuario": user
            };
    $.ajax({
        type: "POST",
        url: "http://localhost:8080/excel/service/excelweb/getDocusUser",
        processData: false,
        contentType: 'application/json',
        data: JSON.stringify(info),
        success: function (r) {
            console.log("llego");
            $("#docus").html("");
            for (var i = 0; i < r.length; i++) {
                console.log(r);
                var dc =
                        '<div class="col-md-12" style="margin-top: 20px;" >' +
                        '<label style="margin-right: 30px;" >' + r[i].nombre + '</label>' +
                        '<a style="color: white" col=' + r[i].col + ' fila=' + r[i].fila + ' cadena=' + r[i].cadena + ' class="btn btn-primary hrabri" id="' + r[i].nombre + '"> Abrir </a>' +
                        '</div>';

                $(dc).appendTo("#docus");

                $("#" + r[i].nombre).bind('click', function (e) {
                    console.log("c: " + $(this).attr("col"));
                    console.log("f: " + $(this).attr("fila"));
                    console.log("cad: " + $(this).attr("cadena"));
                    $('#myModal3').modal('hide');
                    opeen($(this).attr("col"), $(this).attr("fila"), $(this).attr("cadena"));

                });
                if (i === (r.length - 1)) {

                    $('#myModal3').modal('show');
                }
            }

        }});


});


