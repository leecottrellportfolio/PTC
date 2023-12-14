/* Manipulating the DOM of our HTML page */

//document.write
document.getElementById("slogan").innerHTML = "Hi there!";
document.getElementsByTagName("p")[3].style.backgroundColor='#ff00ff';
document.getElementsByClassName("great")[0].innerHTML = "This is the first great";

function button_click(){
    var username = document.getElementById("input-uname").value;
    if(username == ""){
        alert("Please enter a username!")
        document.getElementById("input-uname").focus();
        return;
    }
    var output = "Greetings " + username;
    document.getElementById("greeting").innerHTML = output;
}

/* Part 2: GETTING VALUES FROM THE DOM  */
//Let's learn to GET and SET the text of any HTML element on our page
//Here, we'll target a specific HTML text tag’s text by mentioning its ID in ():

//Can do tags, too. This GETS the contents of a certain tag, targeting it by its tag name.  Note the plural s and the number in brackets, because there may be more than one.

//Here, we'll GET the contents of a certain item with 'great' class, targeting it by its class name.  Note the plural s and the number in brackets, because there may be more than one.

//Nothing results from the above code. We need to DO something with the text we're GETting from the element, like display it:
// Count from 0 like this: 0, 1, 2, 3, etc.

//...or store the results in a var, for later use:
// Count from 0 like this: 0, 1, 2, 3, etc.


/* Part 3: SETTING VALUES IN THE DOM */
//Above we GET the current value. We can also SET it to a new value:
//Target your first <p> tag by its tag name and SET its HTML to a new value:


/* Part 4: CHANGING THE CSS STYLING WITH JS */
//We can also SET a CSS style property of an element like this:
//Target your second <p> tag by its tag name and alter its style, giving it a red text color

//If the CSS property would get a hyphen, remove the hyphen and camelCase instead:


/* Part 5: CHANGING HTML TAG ATTRIBUTE VALUES WITH JS */
//Recall that opening HTML tags often have attributes like href, src, alt, class, and id. In the tag <img src="temp.png" alt="#">, for example, src and alt are attributes. In JS you can change their values using dot syntax: object.attribute = newValue. (And if the tag didn't have that attribute before, it will now!)
// Set the src attribute of the img tag to a new value: 


// Set the value attribute of the input tag to a new value (innerHTML doesn't work on a form element!): 


//Caution: you might expect to be able to set "class" in the same way, but you have to say "className": 
 //Note the style in the CSS doc called fiery


/* Part 6: REMOVE or CREATE ANY HTML ELEMENT (TAG) */
//Remove the image from the web page:


//Here, we'll add a new <p> to the <div>
//Set up a var for the parent. (What new tag will go inside of)

//the next line creates any HTML tag we want, but it's not attached to the doc yet

//lastly, you must attach the child inside its parent





//If necessary, fill the new element with text, style it, attach classes... THIS IS WHY WE MADE IT A VAR!!!


//On your own, try to do this EXAMPLE 2: Let's add the image of the temp.png to the body (it will appear below the div). After a time, I'll give you the answer

