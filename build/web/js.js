
$(document).ready(function () {

    var cols = 1;
    var fila = 1;
    var data = [];


    $('#btnAdd').click(function () {
        var count = 1;
        var first_row = $('#Row2');
        fila++;
        addNumOfCel();
        while (count-- > 0) {
            var newcel = first_row.clone()
                    .find("td").html("").end();
            newcel.appendTo('#blacklistgrid');
        }
    });

    $('#btnAddCol').click(function () {
        cols++;
        $("#blacklistgrid tr").each(function (index, value) {
            if (index === 0) {
                $(this).append('<th>' + getCabecera().toUpperCase() + '</th>');
            } else {
                $(this).append('<td contenteditable="true" ></td>');
            }
        });
    });

    $('#btnrun').click(function () {
        $("#blacklistgrid tr").each(function (index) {
            if (index !== 0) {
                var posh = index;
                $(this).children("td").each(function (index2) {
                    var posv = index2+1;
                    if($(this).html()===""){
                        console.log("valor : vacio ");
                    }else{
                        console.log("valor : " + $(this).html());
                        data.push({pos:posh+"/"+posv,val:$(this).html()});
                    }
                });
            }
        });
    });


    $('#btnsave').click(function () {
        console.log(cols);
        console.log(fila);
        for(var i = 0 ; i < data.length ; i++){
            console.log(data[i].pos);
            console.log(data[i].val);
        }
    });

    function addNumOfCel() {
        var new_r2 = $("#r2");
        var new_cel = new_r2.clone()
                .find("td").html(fila).end();
        new_cel.appendTo('#tab');
    }

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



});    