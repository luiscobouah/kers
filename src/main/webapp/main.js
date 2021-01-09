
function calcularGanancia() {    
    var coche = document.getElementById('coche').value;
    var circuito = document.getElementById('circuito').value;
    var ganancia = parseInt(coche) * parseInt(circuito);   	
    document.getElementById('resultado').innerHTML = "La ganancia de potencia es: "+ "&nbsp;<strong>"+  ganancia + "&nbspkW</strong>.";       
}