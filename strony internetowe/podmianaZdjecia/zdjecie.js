var zdjecie1 = document.getElementsByTagName("img")[0];
var zdjecie2 = document.getElementsByTagName("img")[1];
var zdjecie3 = document.getElementsByTagName("img")[2];
var zdjecie4 = document.getElementsByTagName("img")[3];

zdjecie1.addEventListener("click", function(){

	zdjecie4.setAttribute("src","image1.png");

})

zdjecie2.addEventListener("click", function(){

	zdjecie4.setAttribute("src","image2.png");

})

zdjecie3.addEventListener("click", function(){

	zdjecie4.setAttribute("src","image3.png");

})

