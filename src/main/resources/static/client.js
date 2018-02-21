$(document).ready(function () {
    gotoHome();
    gotoPerson();
    gotoEveryone();
});

function gotoPerson() {

    $("#gotoPerson").on("click", function () {
        var searchString = $("#personSearch").val();
        window.location.href = "/person/" + searchString;
    });

}

function gotoHome() {

    $("#gotoHome").on("click", function () {
        window.location.href = "/";
    });

}
function gotoEveryone() {
    $("#gotoEveryone").on("click", function () {
        window.location.href = "/everyone";
    });

}