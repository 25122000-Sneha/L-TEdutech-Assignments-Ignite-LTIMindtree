
firstname.onblur=function(){
    fEle = document.getElementById("firstname");
    var fName = fEle.value;
    fName = fName.substring(0,1).toUpperCase() + fName.substring(1);
    fEle.value = fName;

}

lastname.onblur=function(){
    lEle = document.querySelector("#lastname");
    var lName = lEle.value;
    lName = lName.substring(0,1).toUpperCase() + lName.substring(1);
    lEle.value = lName;
}

function addColor(){
    var but = document.getElementById('register')
    but.classList.add("myStyle");
}
