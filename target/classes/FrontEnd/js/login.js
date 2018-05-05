$(document).ready(function ()
{

    var username = document.getElementsByName("username").toString();
    var password = document.getElementsByName("pass");

    //console.log("Hello");
    //console.log(document.URL);
    function trimming() {
        var str = document.URL;
        var res = str.substr(33, str.indexOf('&'));
        console.log(res);
        //document.getElementById("demo").innerHTML = res;
    }

    function getUserName(input){
        return input.split("email=")[1].split("&")[0];
    }

    function getPassword(input){
        return input.split("pass=")[1];
    }

    $(document).on('click', '.classToClick', function ()
    {

        console.log(getUserName(document.URL));
        console.log(getPassword(document.URL));


    });

});