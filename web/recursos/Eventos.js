/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
Evento = new Object();

Evento.innit = function() {
    //console.log("a");
    $("#enviar").addEventListener("click", function() {
        //console.log("b");
        Autenticacion.enviar();
    });
};

console.log("Eventos cargados");