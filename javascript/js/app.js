alert("soy una vertana emergente");
console.log("Hola soy mensajes en la consola")
/*Variables*/
var nombre_variable;
let otra_variable = "Hola";
const PI = 3.1416;
let num2=18;
let hayClases=true;
let terminoLaClase=false
/*tipos, undefined, numero, string, Boolean, Objeto, arreglo, chart, función*/
console.log(PI*num2);
console.log(num2 + 36 + "" +otra_variable)
/*Condicionales*/
hayClases=false;
if(hayClases == true && terminoLaClase != true){
    console.log("Nos conectamos a la video llamada")
    
}else{
    console.log("Salimos a celebrar el día del Estudiante")
}
if(hayClases == false || terminoLaClase == true){
    console.log("Salimos a celebrar el día del Estudiante"); 
  } 

  let elemento = document.getElementById("principal");

  //console.log(elemento)
  elemento.innerHTML="Mi valor para innerHTML"
  elemento.innerHTML+="<p>"+otra_variable+"<p/>";
  document.write("<h3 class='text-center bg-primary'>Hola buen día</h3>")
  document.write("<h3>Cómo están?</h3>")

  if(nombre_variable == undefined){
      elemento.innerHTML+="Estamos con una variable sin valor definido!"
      elemento.innerHTML+="<p>Lui navas</p><p>Damian</p><p>David</p><p>Yeimi navarrete</p>"
      elemento.style.backgroundColor="Blue"
      elemento.style.color="white"
    }
