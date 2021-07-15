function neuronio_duas_entradas() {

    var x1 = window.prompt("Digite o valor 1 de entrada", "0");
    var w1 = window.prompt("Digite o peso 1 de entrada", "0");
    var x2 = window.prompt("Digite o valor 2 entrada", "0");
    var w2 = window.prompt("Digite o peso 2 entrada", "0");

    var func = window.prompt("Qual função deseja utilizar para calcular?", "LR | FR | FS");

    switch (func) {
        case 'lr' || 'LR':
            st = calculaSoma(x1, x2, w1, w2);
            if (st <= 0) {
                alert('Saída igual a -1');
            } else {
                alert('Saída igaul a 1');
            }
            break;
        case 'fr' || 'FR':
            st = calculaSoma(x1, x2, w1, w2);
            if (st < 0) {
                alert('Saída igual a 0');
            } else if (st == 0 || st == 1) {
                alert('Saída igual a ' + st);
            } else {
                alert('Saída igual a 1');
            }
            break;
        case 'fs' || 'FS':
            st = calculaSoma(x1, x2, w1, w2);
            if (st >= 0) {
                var fs = 1 - 1/(1+st);
                alert('Saída igual a '+ fs);
            } else {
                var fs = -1+1/(1-st);
                alert('Saída igaul a '+ fs);
            }
            break;
    }
}

function calculaSoma(_x1, _x2, _w1, _w2) {
    var soma = _x1 * _w1 + _x2 * _w2;
    return soma;
}