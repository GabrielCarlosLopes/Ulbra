function nome(paistime) {
    alert(paistime);
}


$(document).ready(function() {

    

    $("#home").click( function () {
        $("#content").load("./contents/home.html");
    });

    $("#about").click( function () {
        $("#content").load("./contents/about.html");
    });

    $("#product").click( function () {
        $("#content").load("./contents/product.html");
    });

    $("#contact").click( function () {
        $("#content").load("./contents/contact.html");
    });
});