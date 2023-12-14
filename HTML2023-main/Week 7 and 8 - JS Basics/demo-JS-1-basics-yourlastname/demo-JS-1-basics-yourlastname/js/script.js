// JavaScript Document
// 1. Basic COMMANDS (INSTRUCTIONS/STATEMENTS) - no variables needed here
// This is a command (or statement, or instruction) to cause something to happen. Finish each with a semicolon
//alert("It works");
	
// 2. VARIABLES
// Variables are containers that store values you want the code to remember. WITHOUT some kind of mechanism like this, browsers don’t remember choices the user makes! Some values are string literal values (combination of letters, numbers, punctuation, spaces, anything). Those values get quotes. 
// Declare a variable named user with an initial string value that's someone’s name.

var userName = "Lee";
//console.log("Hello " + userName);
var score=0;
var health=100;
var lives = 3;

var health = health + 50;

// Don’t put spaces in variable names or start with a number. Underscore is the only punctuation you can use. Good to use camelCase —capitalizeEachWordExceptTheFirst
// Declare a variable with an initial numeric value. Those values don't get quotes.






// Note: when storing a price or big number, don’t add $ or comma: 654329
// Declare a variable with an initial boolean value. There are only two possible boolean values: true or false. They look like strings, but don’t add quotes!

var invisible=false;

//Test in a browser. Nothing happens. But you can rt-click > Inspect, open console and type in a var name and hit Enter. Its value appears.

// Now that some variables were initialized, we can refer to them again and again, but you don't ever say ‘let’ again for them. We can output a var by mentioning it in console.log() or alert(). 


//wrong! Don't put quotes around the var.
// Later the value might change. Here we use a single equals sign to ASSIGN a new value. The variable forgets any value it had before.





// 3. CONCATENATION AND MATH
// If we want to output more than one var... use a + between them to concatenate. I might want to add in some words, or spaces... put them in quotes, and concatenate! 

// Declare a variable named myCharacter that creates the sentence "Joe is my name and my job is magician" where the name and job are retrieved using the variables you made above.



// Using the PLUS operator on numbers makes the browser do the math. 
// Declare a variable named addThem that stores the numeric result of the operation 444 + 2. Make the browser do the math instead of you.
 
//Other math operators are possible:

// In your operation you can mention a var that stores a number, and the code performs math on it.
// Display the mathematical result of subtracting 5 from your health variable:

// Declare a variable named doubleMyMoney with an initial value that's the numeric result of the operation of multiplying your money variable by two.

// Declare a variable with an initial value that's the numeric result of the operation of adding one to your lives variable 


// Declare a variable named mathSentence that creates the sentence "The total of 4 plus 2 is 6" where the number is calculated by adding four plus two. First show the problem if you don't add parentheses, and check in browser. Then add parentheses around an operation to make the code do it first.

// Declare a variable named healthSentence that creates the sentence "The total of 4 plus the health variable is 104" where the number is calculated by adding four plus your health variable. 


// 4. FUNCTIONS (methods)
// The above instructions are executed right away, in order. But now we’ll expand our abilities to control the timing of execution. By wrapping code in a function, it doesn’t execute yet. 
// A function or method is a set of commands we can call upon by a short name we choose
// Define a function named doStuff that contains an instruction to display the string "Do you see this message?" in a popup alert box, then another an instruction to display through the console window the string "Do you see this text?"

function showPlayerStats(){
    //var output = userName + " health: " + health + " lives: "+ lives;
    //alert(output);
    //username = "Joe Bob";

    userName = document.getElementById("playerName").value;
    document.getElementById("user").innerText = userName;
    document.getElementById("health").innerText = health;
}

//showPlayerStats();

//nothing happens when we refresh the browser, right? In a browser, find the type-in prompt and type in "doStuff()". It appears! In future weeks, this will let us control the timing of when things happen. We could also call it in our code, before OR after we define the function:
// Add a statement which calls the function you just defined.


// Define a function that contains a command that displays in the console the sentence "Joe is my name and my job is magician" where the name and job are retrieved using the variables you made above.


// Add a statement which calls the function you just defined.


// Mention scope – var’s declared inside the {} of a function can only be called inside that function.
// With these old-school "callback functions," timing-wise, when JS code is read by the browser, the function definitions are read first, then the rest of the code is executed. This is called HOISTING. For that reason, we could call functions BEFORE they are defined! Still, I would tend to define them all near top of page. With newer fat-arrow syntax, you MUST DEFINE BEFORE YOU CALL OR YOU GET AN ERROR!  

// 5. RETURN
// Instead of logging or alerting inside the code block of a function, we can have the answer get "returned"
// Define a function named doMyMath() that multiplies the number 4.99 by the number 2 then returns the answer. It should not output anything.


// Where does it return to? Wherever we call the function.

// So the phrase doMyMath() sort of BECOMES the returned answer. That in itself doesn't cause the answer to be displayed or anything. Wrap it in log() or alert():  
// Call the function you just defined. Get the returned value to display in an alert box or a console log, or store it in a var:


// Count those nested parentheses… be sure each one that opens also closes. 

