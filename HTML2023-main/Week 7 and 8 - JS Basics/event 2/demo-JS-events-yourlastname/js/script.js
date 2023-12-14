// JavaScript Document
/* EVENTS */

// Functions that will be called in response to events:

function metalFeedback(){
    //alert("Metal works!!");
    document.getElementById("feedback").innerHTML = "<b>bang</b> your head!";
}

function countryFeedback(){
    document.getElementById("feedback").innerHTML = "grab your truck and dance in the barn <i>yee haw!</i>";
}




document.getElementsByTagName("a")[0].addEventListener("click", metalFeedback);

document.getElementsByTagName("a")[1].addEventListener("click", countryFeedback);

function colorFeedback(color){
    document.getElementById("feedback").style.backgroundColor = color;
}
document.getElementById("redLink").addEventListener("click",
    function(){
        colorFeedback("#ff0000");
    });
document.getElementById("greenLink").addEventListener("click",
    function(){
        colorFeedback("#00ff00");
    });

    // we could also change things in the DOM:
    // ...and change their styling...
    // display: none; is the CSS to hide an element

function oppositeColor(color){
 //get the three components
    var redHex = color.substring(1,3);
    var greenHex = color.substring(3,5);
    var blueHex = color.substring(5,7);
    // alert(redHex + " " + greenHex + " " + blueHex);
    //convert the color to decimal
    var red = parseInt(redHex, 16);
    var green = parseInt(greenHex, 16);
    var blue = parseInt(blueHex, 16);
    //alert(red);
    var oppRed = 255 - red; 
    var oppGreen = 255 - green;
    var oppBlue = 255 - blue;
    //alert(oppRed);
    //build the rgba string
    return "rgba(" + oppRed +","+ oppGreen + "," + oppBlue + ", 1)";
}
function colorPickerEvent(){
    //alert("Color is picked");
    var color = document.getElementById("input-color").value;

    document.getElementById("colorMe").style.backgroundColor=color;
    document.getElementById("colorMe").style.color=oppositeColor(color);

}

document.getElementById("done-button").addEventListener("click",colorPickerEvent);
// Event Listeners
// if and when first link is clicked, call one feedback function above

// if and when second link is clicked, call the other feedback function


// HOW TO USE EVENTS AND ARGUMENTS
/**
 * This method changes the text color
 * of the feedback box to blue
 */


// Pass argument where event handler calls the function, using an anonymous function:
// if and when first link is clicked, call changeTextColor function


// if and when second link is clicked, call changeTextColor function



// CONDITIONAL STRUCTURES (IF)

// a single equals assigns a new value, kicking out the old value "red"
// A === checks the value, rather than assigning it. A conditional statement checks whether the comparison in ( ) is true or false. If true, it does the code in { }. If false, it skips past the code in { }

    // this log will only happen if favColor is red:

    // we CAN afterward add an 'ELSE IF' after the curly closes, which has its own condition that ONLY gets checked if the first 'if' condition was false


    // an 'ELSE' clause can end the structure. It does not get its own condition in ( ). It just does the code in its { } if NONE of the preceding 'IF's and 'ELSE if's conditions were true



        // In the conditions, we can use COMPARISON OPERATORS to compare 'less than' and 'greater than' instead of ===
    
        


/* Preventing Form Submission if input is invalid */
// To submit the form: document.getElementById("my-form").submit(); 
// BUT... that happens without us coding it. Here, we might need to STOP submission...
// We will VALIDATE: Add a condition in case they left it blank. If so, prevent form from submitting and show feedback. 


// Note how we pass the event object in several places in the listener:

