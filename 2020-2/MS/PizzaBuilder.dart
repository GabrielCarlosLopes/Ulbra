class PizzaBuilder {
  String _borda;
  int _diametro;
  Set<String> _coberturas;

  PizzaBuilder(this._diametro);

  String get borda => _borda;
  set borda(String newborda) {
    _borda = newborda;
  }

  int get diametro => _diametro;
  set diametro(int newDiametro) {
    _diametro = newDiametro;
  }

  Set<String> get coberturas => _coberturas;
  set coberturas(Set<String> newCoberturas) {
    _coberturas = newCoberturas;
    _enserirQueijo();
  }

  void _enserirQueijo() {
    _coberturas.add("queijo");
  }

  Pizza build() {
    return Pizza(this);
  }
}

class Pizza {
  String _borda;
  int _diametro;
  Set<String> _coberturas;

  Pizza(PizzaBuilder builder) {
    _borda = builder.borda;
    _diametro = builder.diametro;
    _coberturas = builder.coberturas;
  }

  String get borda => _borda;
  int get diametro => _diametro;
  String get coberturas => _stringifiedCoberturas();
  String _stringifiedCoberturas() {
    var stringCoberturas = _coberturas.join(", ");
    var lastComma = stringCoberturas.lastIndexOf(",");
    var replacement =
        ",".allMatches(stringCoberturas).length > 1 ? ", e" : " e";

    return stringCoberturas.replaceRange(lastComma, lastComma + 1, replacement);
  }

  @override
  String toString() {
    return "Uma deliciosa pizza de $_diametro\ cm com borda de $_borda e coberta de $coberturas";
  }
}

void main() {
  var pizzaBuilder = PizzaBuilder(8);

  pizzaBuilder.borda = "catupiri";
  pizzaBuilder.coberturas = Set.from(["calabresa"]);

  var plainPizza = Pizza(pizzaBuilder);
  print(plainPizza);

  pizzaBuilder.borda = "catupiri";
  pizzaBuilder.diametro = 15;
  pizzaBuilder.coberturas = Set.from(["calabresa", "4 queijos", "chocolate"]);

  var pizzaEspecial = pizzaBuilder.build();
  print(pizzaEspecial);
}
