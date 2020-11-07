import 'package:flutter/material.dart';
import 'package:lista_de_compras/src/pages/home_page.dart';
import 'package:splashscreen/splashscreen.dart';

class Splashscreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: SafeArea(
        child: Center(
          child: SplashScreen(
            seconds: 5,
            navigateAfterSeconds: HomePage(),
            title: Text(
              'Sua Lista de Compras',
              style: TextStyle(
                fontWeight: FontWeight.bold,
                fontSize: 22,
                color: Colors.deepPurple,
              ),
            ),
            image: Image.asset('lib/assets/splash_image.png'),
            backgroundColor: Colors.white,
            photoSize: MediaQuery.of(context).size.width / 4,
            loaderColor: Colors.deepPurple,
          ),
        ),
      ),
    );
  }
}
