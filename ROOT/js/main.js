var rootURL = "http://www.phreebie.net/okno";

$('#btnAuth').click(function () {
    console.log("Try to login");
    $.ajax({
        type: 'GET',
        contentType: 'application/json',
        url: rootURL + formPersonToString(),
        dataType: "text",
        data: "",
        success: function (data, textStatus, jqXHR) {
            alert("data="+data.toString());
//            setCookie("musicToken",data.token)
            window.location.replace(data.url);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            window.location.replace("/auth_error.html");
            //alert('Registration error: ' + textStatus);
        }
    });

});


function formPersonToString() {
    req = "/login/try?" +
            "mail=\"" + $('#personEmail').val() +
            "\"&password=\"" + $('#personPassword').val() +
            "\"&ishome=" + $('#personHome').is(":checked");
    return req;
}

function getCookie(name) {
  var matches = document.cookie.match(new RegExp(
    "(?:^|; )" + name.replace(/([\.$?*|{}\(\)\[\]\\\/\+^])/g, '\\$1') + "=([^;]*)"
  ));
  return matches ? decodeURIComponent(matches[1]) : undefined;
}

function setCookie(name, value) {
  var updatedCookie = name + "=" + value;
  document.cookie = updatedCookie;
}