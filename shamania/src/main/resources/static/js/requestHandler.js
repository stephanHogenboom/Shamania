$(document).ready(function(){
    $('#start-button').on('click', function(){
        $.post("/shaman/new/shackleboiii").done(function(){
            $.post("/battle/start/shackleboiii").done(function(value){
                console.dir(value);
                $('#centre-panel').html(value);
            }).fail(function(){
                alert("error");
            });
        }).fail(function(){
            alert("error");
        });
    });
});
