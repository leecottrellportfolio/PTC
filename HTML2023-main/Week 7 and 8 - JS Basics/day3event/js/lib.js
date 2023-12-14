

function hoverImg(){
    document.getElementById("heroName").innerHTML=this.title;
}

function clickImg(){
    var img = this;
    var newSrc = img.src;
    newSrc = newSrc.replace("small", "");
    //alert(newSrc);
    document.getElementById("heroLarge").src = newSrc;

}

var allImages = document.querySelectorAll("img");
allImages.forEach(function(img){
    img.addEventListener("mouseover", hoverImg);
    img.addEventListener("click", clickImg);
    img.addEventListener("mouseout",function(){
             document.getElementById("heroName").innerHTML ="Hover over an image";
         });
});

//var img = document.getElementById("hero0");
//img.addEventListener("mouseover", hoverImg);

//anonymous function
//no name
//defined where needed
// img.addEventListener("mouseout",function(){
//     document.getElementById("heroName").innerHTML ="Hover over an image";
// });

function docLastMod(){
    //document.write(document.lastModified);
    var lastMod = new Date(document.lastModified);
    document.write("<h6> Page last modified ");

    document.write(lastMod.getMonth() + "/" + lastMod.getDate() + "/" + lastMod.getFullYear());

    document.write("</h6>");
}