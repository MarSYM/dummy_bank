// Get the modal
var configGrade = document.getElementById('myConfigGrade');

// Get the button that opens the modal
var conficBtn = document.getElementById("config-grade-button");

// Get the <span> element that closes the modal
var closeSpan = document.getElementsByClassName("configClose")[0];

// When the user clicks the button, open the modal 
conficBtn.onclick = function() {
    configGrade.style.display = "block";
}

// When the user clicks on <span> (x), close the modal
closeSpan.onclick = function() {
    configGrade.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == config) {
        configGrade.style.display = "none";
    }
}