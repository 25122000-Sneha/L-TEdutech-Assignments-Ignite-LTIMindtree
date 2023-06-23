function showGamePage(){
    window.location = "./game.html";
    var name;
    document.onkeydown = myFunction;
}
function myFunction(){
    if(window.event.type=="keydown"){
        const k = window.event.key;
        console.log(k)
    }
}

