import 'package:flutter/material.dart';
import 'package:lista_de_compras/src/pages/splashscreen.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        debugShowCheckedModeBanner: false,
        title: 'Lista de Compras',
        theme: ThemeData(
          primaryColor: Colors.deepPurple,
          accentColor: Colors.deepPurpleAccent,
        ),
        home: Splashscreen());
  }
}
