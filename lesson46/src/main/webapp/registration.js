/*$('.btnNext').click(function(){
    $('.nav-tabs > .active').next('li').find('a').trigger('click');
});

$('.btnPrevious').click(function(){
    $('.nav-tabs > .active').prev('li').find('a').trigger('click');
});*/
/*let nextBtn=document.getElementsByClassName("btnNext");

for(var e in nextBtn){
nextBtn.forEach(function (e) { /!*при клике віполнть определенную ф*!/ункцию
    e.addEventListener('click', moveNext);
});

function moveNext(){
    let navTab= document.getElementsByClassName("nav-tabs active")

    let navLi= navTab.getElementsByTagName("li")[0];

    navLi.getElementsByTagName("a")[0].fireEvent('onclick');

}*/

function validateEmail(event){

    event.preventDefault();

    var email=document.getElementById("email");
    console.log(email.value);

    var emailText = email.value;

    console.log(emailText.indexOf("@")===-1);

    if(emailText.indexOf("@") === -1){
      email.style="border-color: red";
    }
}

document.getElementById("registerBtn").addEventListener('click',validateEmail);

document.getElementById("email").addEventListener("focus",resetEmailField);

/*
function resetEmailField(){
    document.getElementById("email").style="";
}*/


 function resetEmailField(){
 document.getElementById("email").style="";
 }
