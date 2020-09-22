import 'package:flutter/material.dart';
import 'package:gasolina_alcool/consts/consts_app.dart';

class HomePage extends StatefulWidget {
  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  final _formKey = GlobalKey<FormState>();
  TextEditingController _gasolinaController = TextEditingController();
  TextEditingController _alcoolController = TextEditingController();
  String _resultado;

  @override
  void initState() {
    super.initState();
    resetFields();
    setState(() {
      _resultado = 'Digite os valores';
    });
  }

  void resetFields() {
    _gasolinaController.text = '';
    _alcoolController.text = '';
    resetResult();
  }

  void resetResult() {
    setState(() {
      _resultado = '';
    });
  }

  void calcularValor() {
    double gasolina = double.parse(_gasolinaController.text);
    double alcool = double.parse(_alcoolController.text);

    double melhorValor = alcool / gasolina;
    setState(() {
      if (melhorValor < 0.7) {
        _resultado = "É mais vantajoso abastecer com álcool";
      } else {
        _resultado = "É mais vantajoso abastecer com gasolina";
      }
    });
  }

  @override
  Widget build(BuildContext context) {
    double topPadding = MediaQuery.of(context).padding.top - 11 / 2.8;
    double width = MediaQuery.of(context).size.width;
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.redAccent,
        title: Text('Gasolina ou Álcool'),
        centerTitle: true,
        actions: [
          IconButton(
            icon: Icon(Icons.refresh),
            onPressed: () {
              resetFields();
            },
          ),
        ],
      ),
      body: Stack(
        children: [
          imageBackground(topPadding, width),
          Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Form(
                key: _formKey,
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: <Widget>[
                    textFormFieldCustom(_gasolinaController, 'Gasolina'),
                    Divider(
                      height: 20,
                    ),
                    textFormFieldCustom(_alcoolController, 'Alcool'),
                    buttonCalculate(),
                    Row(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: [
                        buildTextResult(),
                      ],
                    ),
                  ],
                ),
              ),
            ],
          ),
        ],
      ),
    );
  }

  Widget imageBackground(double top, double width) {
    return Positioned(
      top: top,
      child: Opacity(
        opacity: 0.3,
        child: Image.asset(
          ConstsApp.bomba,
          width: width,
          height: 550,
        ),
      ),
    );
  }

  Widget textFormFieldCustom(TextEditingController controller, String tipo) {
    return Padding(
      padding: const EdgeInsets.all(10.0),
      child: TextFormField(
        onChanged: (text) {
          resetResult();
        },
        controller: controller,
        keyboardType: TextInputType.number,
        decoration: InputDecoration(
          border: OutlineInputBorder(),
          hintText: 'Digite o valor do litro de $tipo',
        ),
        validator: (value) {
          if (value.isEmpty) {
            return 'Por favor digite o valor do litro de $tipo';
          }
          return null;
        },
      ),
    );
  }

  Widget buildTextResult() {
    return Padding(
      padding: EdgeInsets.symmetric(vertical: 36.0),
      child: Text(
        _resultado,
        textAlign: TextAlign.center,
        style: TextStyle(fontSize: 18),
      ),
    );
  }

  Widget buttonCalculate() {
    return Row(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        Padding(
          padding: EdgeInsets.symmetric(vertical: 16.0),
          child: RaisedButton(
            color: Colors.redAccent,
            shape: RoundedRectangleBorder(
              borderRadius: BorderRadius.circular(15.0),
            ),
            onPressed: () {
              if (_formKey.currentState.validate()) {
                calcularValor();
                FocusScope.of(context).requestFocus(new FocusNode());
              }
            },
            child: Text(
              'Calcular',
              style: TextStyle(
                fontSize: 22,
                color: Colors.white,
              ),
            ),
          ),
        ),
      ],
    );
  }
}
