function calcImc(){
    var nome = document.getElementById("nome").value;
    var sexo = document.getElementById("sexo").value
    var peso = document.getElementById("peso").value;
    var altura = document.getElementById("altura").value;

    peso = parseFloat(peso);
    altura = parseFloat(altura);

    

    var imc = peso/(altura * altura);

    imc = Math.round(imc);

    console.log(altura);

    if(imc < 18.5){
        document.getElementById("result").innerHTML = nome + ", você está abaixo do peso ideal. Seu IMC é de: "+imc;
    }else if(imc >= 18.5 && imc <= 25){
        document.getElementById("result").innerHTML = nome + ", você está no peso ideal. Seu IMC é de: "+imc;
    }else if(imc > 25 && imc <= 30){
        document.getElementById("result").innerHTML = nome + ", você está acima do peso ideal. Seu IMC é de: "+imc;
    }else{
        document.getElementById("result").innerHTML = nome + ", você está obeso. Seu IMC é de: "+imc;
    }
}

