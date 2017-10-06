
jQuery(function ($) {
    $("#date").mask("99/99/9999");
});

function aumentaLetra() {
    var x = document.getElementById("fname");
    x.value = x.value.toUpperCase();
}
