// function calculate(){
//     var num1 = document.getElementById("num1").value;
//     var num2 = document.getElementById("num2").value;

//     num1 = parseFloat(num1);
//     num2 = parseFloat(num2);

//     var select = document.getElementById('op');
//     var value = select.options[select.selectedIndex].value;
    
    
//     switch(value){
//         case 'Soma':
//             var soma = num1 + num2;
//             document.getElementById("result").innerHTML = "Resultado: "+soma;
//             break;
//         case 'Subtração':
//             var sub = num1 - num2;
//             document.getElementById("result").innerHTML = "Resultado: "+sub;
//             break;
//         case 'Multiplicação':
//             var mult = num1 * num2;
//             document.getElementById("result").innerHTML = "Resultado: "+mult;
//             break;
//         case 'Divisão':
//             var div = num1 / num2;
//             document.getElementById("result").innerHTML = "Resultado: "+div;
//             break;
//     }
// }

// function calulateKwh(){
//     var kwh = document.getElementById("kwh").value;
//     var kwhValue = document.getElementById("kwhValue").value;

//     kwh = parseFloat(kwh);
//     kwhValue = parseFloat(kwhValue);

//     if(kwh > 100){
//         kwh += (kwh*25)/100;
//     }
//         if(kwh > 200){
//         kwh += (kwh*50)/100;
//     }

//     var valor =  kwh * kwhValue;

//     document.getElementById("resultKwh").innerHTML = valor

// }


// function verificar(){
//     var nums = document.getElementById('num').value;

//     var result = [] = nums.split(",");
    
//     var maiorNumero = 0;

//     for(var x=0; x<result.length; x++){
//         if(maiorNumero < result[x]){
//             maiorNumero = result[x];
//         }
//     }
//     document.getElementById('result').innerHTML = 'O maior valor digitado foi de: '+ maiorNumero
// }

function verificarIdades(){
    var nums = document.getElementById('idade').value;

    var result = [] = nums.split(",");
    
    var maiorIdade = 0;
    var menorIdade = 0;

    for(var x=0; x<result.length; x++){
        if(result[x] > 18){
            maiorIdade++;
        }else{
            menorIdade++;
        }
    }
    document.getElementById('resultado').innerHTML = 
        'Foram registradas '+ maiorIdade + ' idades maiores que 18 e '+menorIdade+
        ' idades menores que 18'
}