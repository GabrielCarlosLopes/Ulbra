//grupo de exemplos para treinamento supervisionado
var x10 = 1, x11 = 0, x12 = 0, y1 = 0 // {1,0,0} = 0
var x20 = 1, x21 = 0, x22 = 1, y2 = 0 // {1,0,1} = 0
var x30 = 1, x31 = 1, x32 = 0, y3 = 1 // {1,1,0} = 1
var x40 = 1, x41 = 1, x42 = 1, y4 = 1 // {1,1,1} = 1

//pesos
var w0 = 0, w1 = 0, w2 = 0;

//outras variaveis
var sum, y, ajustes, ajustesTotais = 0, repeticoes = 0;

do {
    ajustes = 0;
    //primeiro grupo
    sum = soma(x10, x11, x12);
    y = transferencia(sum);
    if (y != y1) {
        ajuste(x10, x11, x12, y1, y);
        ajustes++;
        ajustesTotais++;
    }

    //segundo grupo

    sum = soma(x20, x21, x22);
    y = transferencia(sum);
    if (y != y2) {
        ajuste(x20, x21, x22, y2, y);
        ajustes++;
        ajustesTotais++;
    }

    //terceiro grupo

    sum = soma(x30, x31, x32);
    y = transferencia(sum);
    if (y != y3) {
        ajuste(x30, x31, x32, y3, y);
        ajustes++;
        ajustesTotais++;
    }

    //quarto grupo

    sum = soma(x40, x41, x42);
    y = transferencia(sum);
    if (y != y4) {
        ajustes(x40, x41, x42, y4, y);
        ajustes++;
        ajustesTotais++;
    }
    repeticoes++;
} while (ajustes != 0);

console.log("================== Rede treinada ===============");
console.log("Os pesos finais ficaram w0: " + w0 + ", w1: " + w1 + " e w2: " + w2);
console.log("A quantidade de ajustes foi: " + ajustesTotais);
console.log("A quantidade de repetções foi: " + repeticoes);

//funcao de calculo da soma
function soma(_x0, _x1, _x2) {
    return (_x0 * w0) + (_x1 * w1) + (_x2 * w2);
}

// funcao rampa
function transferencia(_sum) {
    if (_sum <= 0) {
        return 0;
    } else {
        return 1;
    }
}

//ajuste dos pesos-> regra de delta  wn = wn + ca * (sd - so) * xn;
function ajuste(_x0, _x1, _x2, _yd, _yo){
    w0 = w0 + 1 * (_yd - _yo) * _x0;
    w1 = w1 + 1 * (_yd - _yo) * _x1;
    w2 = w2 + 1 * (_yd - _yo) * _x2;
}