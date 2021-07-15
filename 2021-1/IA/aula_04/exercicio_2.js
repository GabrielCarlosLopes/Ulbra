function calculo_n_neuronios() {
    var nEntradas = window.prompt("Digite o número de entradas:", "0");
    var x;
    var w;
    var soma;
    var cont=0;
    var y;

    do {
        cont++;
        var x = parseInt(window.prompt("Digite a " + cont + "º entrada", "0"));
        var w = parseInt(window.prompt("Digite o " + cont + "º peso", "0"));

        soma += x * w;
        x = 0;
        w = 0;

    } while (cont < nEntradas);

    var func = window.prompt("Qual função deseja utilizar para calcular?", "LR | FR | FS");

    switch (func) {
        case 'lr' || 'LR':
            if (soma <= 0) {
                y = -1;
            } else {
                y = 1;
            }
            break;
        case 'fr' || 'FR':
            if (soma < 0) {
                y = 0;
            } else if (soma == 0 || soma == 1) {
                y = soma;
            } else {
                y = 1;
            }
            break;
        case 'fs' || 'FS':
            if (soma >= 0) {
                var fs = 1 - 1 / (1 + soma);
                y = fs;
            } else {
                var fs = -1 + 1 / (1 - soma);
                y = fs;
            }
            break;
        default:
            alert('Opção incorreta!');
            window.location.reload();
            break;
    }

    alert('O resultado é igual a: '+y+'!');
}