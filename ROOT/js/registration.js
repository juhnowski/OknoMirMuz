var rootURL = "http://www.phreebie.net/okno";

$('#btnRegisterTeacher').click(function () {
    console.log("Register Teacher");
    $.ajax({
        type: 'GET',
        contentType: 'application/json',
        url: rootURL + ".teacher",
        dataType: "text",
        data: "",
        success: function (data, textStatus, jqXHR) {
            console.log('Teacher registered successfully:' + data);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert('Registration error: ' + textStatus);
        }
    });
});

$('#btnRegisterPupil').click(function () {
    console.log("Register Person");
    $.ajax({
        type: 'GET',
        contentType: 'application/json',
        url: rootURL + formPersonToString(),
        dataType: "json",
        data: formPersonToJSON(),
        success: function (data, textStatus, jqXHR) {
            console.log('Person registered successfully:' + data);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert('Registration error: ' + textStatus);
        }
    });
});

function formPersonToString() {
  
    return "/person/add?"+
        "personFamily=\"" + $('#personFamily').val() +
        "\"&personName=\"" + $('#personName').val() +
        "\"&personSName=\"" + $('#personSName').val() +
        "\"&personFullAge=" + $('#personFullAge').is(":checked") +
        "&personParentFamily=\"" + $('#personParentFamily').val() +
        "\"&personParentName=\"" + $('#personParentName').val() +
        "\"&personParentSName=\"" + $('#personParentSName').val() +
        "\"&personMusicLevel=" + $('#personMusicLevel').is(":checked") +
        "&musicType=\"" + $('#musicType').val() +
        "\"&personPhone=\"" + $('#personPhone').val() +
        "\"&personCountry=\"" + $('#personCountry').val() +
        "\"&personCity=\"" + $('#personCity').val() +
        "\"&personEmail=\"" + $('#personEmail').val() +
        "\"&personPassword=\"" + $('#personPassword').val() +
        "\"&personHome=" + $('#personHome').is(":checked") +
        "&personAgreement=" + $('#personAgreement').is(":checked");
    
}

function formPersonToJSON() {
    return JSON.stringify({
        "personFamily": $('#personFamily').val(),
        "personName": $('#personName').val(),
        "personSName": $('#personSName').val(),
        "personFullAge":$('#personFullAge').val(),
        "personParentFamily":$('#personParentFamily').val(),
        "personParentName":$('#personParentName').val(),
        "personParentSName":$('#personParentSName').val(),
        "personMusicLevel":$('#personMusicLevel').val(),
        "musicType":$('#musicType').val(),
        "personPhone":$('#personPhone').val(),
        "personCountry":$('#personCountry').val(),
        "personCity":$('#personCity').val(),
        "personEmail":$('#personEmail').val(),
        "personPassword":$('#personPassword').val(),
        "personHome":$('#personHome').val(),
        "personAgreement":$('#personHome').val()
    });
}


function formTeacherToJSON() {
    return JSON.stringify({
        "teacherFamily": $('#teacherFamily').val(),
        "teacherName": $('#teacherName').val(),
        "teacherSName": $('#teacherSName').val(),
        "teacherExpOnline":$('#teacherExpOnline').val(),
        "teacherEducation":$('#teacherEducation').val(),
        "teacherCurrentWork":$('#teacherCurrentWork').val(),
        "teacherWorkHistory":$('#teacherWorkHistory').val(),
        "teacherThems":$('#teacherThems').val(),
        "teachersAuthorsProgramm":$('#teachersAuthorsProgramm').val(),
        "teacherPhone":$('#teacherPhone').val(),
        "teacherCountry":$('#teacherCountry').val(),
        "teacherCity":$('#teacherCity').val(),
        "teacherEmail":$('#teacherEmail').val(),
        "teacherPassword":$('#teacherPassword').val(),
        "teacherHome":$('#teacherHome').val(),
        "teacherAgreement":$('#teacherAgreement').val()
    });
}