alert("soy una vertana emergente");
console.log("Hola soy mensajes en la consola")
/*Variables*/
/*palabra reservada nombre de la variable */
var nombre_variable; 
/*palabra reservada nombre de la variable = asignamos el valor*/
let otra_variable = "Hola"; /*tipo string*/
const PI = 3.1416; /*tipo entero y float*/
let num2=18;
let hayClases=true; /*tipo boolean */
let terminoLaClase=false
/*tipos, undefined, numero, string, Boolean, Objeto, arreglo, chart, función*/
console.log(PI*num2);
console.log(num2 + 36 + "" +otra_variable) /*Sumar  y concatenar*/
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
/*
    let mensaje = prompt("Introduce tu mensaje");
    elemento.innerHTML+="<h3>" +mensaje + "</h3>";
    elemento.innerHTML+="<div class=\"alert alert-success\" role=\"alert\">"+mensaje+"</div>";
    */

   //let menu = prompt("Selecciona el pedido: \n 1. Milanesa con fritas \n 2. Milanesa Napolitana\n 3. Fritas solas");
    menu="2";
    if(menu === '1'){/*Valor y el tipo*/
        elemento.innerHTML="<div class=\"alert alert-success\" role=\"alert\">Disfrute de tu Milanesa con Fritas!</div>";

    }else if(menu === '2'){/*Valor y el tipo*/
        elemento.innerHTML="<div class=\"alert alert-success\" role=\"alert\">Disfrute de tu Milanesa Napolitana!</div>";
    }else if(menu === '3'){/*Valor y el tipo*/
        elemento.innerHTML="<div class=\"alert alert-success\" role=\"alert\">Disfrute de tus Fritas!</div>";
    }else{
        alert('Debes elegir una opción valida')
        let menu = prompt("Selecciona el pedido: \n 1. Milanesa con fritas \n 2. Milanesa Napolitana\n 3. Fritas solas");
    }

    /*switch (menu) {
        case '1':
            elemento.innerHTML="<div class=\"alert alert-success\" role=\"alert\">Disfrute de tu Milanesa con Fritas!</div>";
            break;
    
        default:
            elemento.innerHTML="<div class=\"alert alert-success\" role=\"alert\">'Debes elegir una opción valida'!</div>";
            break;
    }
    */
   