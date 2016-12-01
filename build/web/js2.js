

var cols = 1;
var fila = 1;
var data = [];

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

$('#btnrun').click(function () {
    $("#blacklistgrid tr").each(function (index) {
        if (index !== 0) {
            var posh = index;
            $(this).children("td").each(function (index2) {
                var posv = index2;
                if (index2 !== 0) {
                    if ($(this).html() === "") {
                        console.log("valor : vacio ");
                    } else {
                        data.push({pos: posh + "/" + posv, val: $(this).html()});
                    }
                }
            });
        }
    });
});

$('#btnopen').click(function () {
    var c = 15;
    var f = 15;
    var cadena = "1/1%123&1/2%124&1/3%125";
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




});

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
    var base = '<tr id="Row1"><th>#</th><th>A</th></tr><tr id="Row2"><td class="celda" class="num">1</td><td contenteditable="true" ></td></tr>';
    $("#blacklistgrid").html(base);
    cols = 1;
    fila = 1;
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
    console.log(cols);
    console.log(fila);
    for (var i = 0; i < data.length; i++) {
        console.log(data[i].pos);
        console.log(data[i].val);
    }
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

$('.celda').click(function () {
    console.log("$focused");
});

