////grupo para treinamento
var x11 = 0, x12 = 0, y1 = 0; //{0,0} = 0 -> grupo 1

var x21 = 1, x22 = 1, y2 = 1; //{1,1} = 1 -> grupo 2

//var x_grupo_entrada = y_grupo

//pesos
var w1 = -1, w2 = -1;

//variaveis auxiliares
var sum, y, ajustes, ajustesTotais = 0, repeticoes = 0;

//processo de treinamento
do {
    ajustes = 0;

    //primeiro exemplo -> grupo 1
    sum = x11 * w1 + x12 * w2;
    //funcao rampa
    if (sum < 0) {
        y = 0;
    } else if (sum >= 0 && sum <= 1) {
        y = sum;
    } else {
        y = 1;
    }

    if (y != y1) {
        //ajuste dos pesos
        w1 = w1 + 1 * (y1 - y) * x11;
        w2 = w2 + 1 * (y1 - y) * x12;
        ajustes++;
        ajustesTotais++;
    }

    //segundo exemplo -> grupo 2

    sum = x21 * w1 + x22 * w2;
    //funcao rampa
    if (sum < 0) {
        y = 0;
    } else if (sum >= 0 && sum <= 1) {
        y = sum;
    } else {
        y = 1;
    }

    if (y != y2) {
        //ajuste dos pesos
        w1 = w1 + 1 * (y2 - y) * x21;
        w2 = w2 + 1 * (y2 - y) * x22;
        ajustes++;
        ajustesTotais++;
    }

    repeticoes++;

} while (ajustes != 0);

console.log('rede treinada com os pesos:');
console.log('w1: ' + w1 + ' e w2: ' + w2);
console.log('quantidade de ajustes: ' + ajustesTotais);
console.log('repetições: ' + repeticoes);