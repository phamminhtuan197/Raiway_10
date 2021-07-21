$(document).ready(function() {
    $(".an_1").click(function() {
        $(".content_1").fadeOut();
        $(".an_1").hide();
        $(".xemthem_1").show();
    });
    $(".xemthem_1").click(function() {
        $(".content_1").fadeIn();
        $(".an_1").show();
        $(".xemthem_1").hide();
    });
    $(".an_2").click(function() {
        $(".content_2").fadeOut();
        $(".an_2").hide();
        $(".xemthem_2").show();
    });
    $(".xemthem_2").click(function() {
        $(".content_2").fadeIn();
        $(".an_2").show();
        $(".xemthem_2").hide();
    });
    $(".an_3").click(function() {
        $(".content_3").fadeOut();
        $(".an_3").hide();
        $(".xemthem_3").show();
    });
    $(".xemthem_3").click(function() {
        $(".content_3").fadeIn();
        $(".an_3").show();
        $(".xemthem_3").hide();
    });
    $(".an_4").click(function() {
        $(".content_4").fadeOut();
        $(".an_4").hide();
        $(".xemthem_4").show();
    });
    $(".xemthem_4").click(function() {
        $(".content_4").fadeIn();
        $(".an_4").show();
        $(".xemthem_4").hide();

    });

})

var ad = $(".slideText").css("margin-left");
if (ad == "0px")
    $(".slideText").animate({ "margin-left": "700px" }, 2000, "linear", function() {
        animate_Exam();
    });
else
    $(".slideText").animate({ "margin-left": "0px" }, 2000, "linear", function() {
        animate_Exam();
    });

function animate_Exam() {
    var ad = $(".slideText").css("margin-left");
    if (ad == "0px")
        $(".slideText").animate({ "margin-left": "700px" }, 2000, "linear", function() {
            animate_Exam();
        });
    else
        $(".slideText").animate({ "margin-left": "0px" }, 2000, "linear", function() {
            animate_Exam();
        });
}