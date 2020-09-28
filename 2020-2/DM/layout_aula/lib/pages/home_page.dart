import 'package:flutter/material.dart';
import 'package:layout_aula/consts/consts_app.dart';
import 'package:layout_aula/widgets/body_app.dart';
import 'package:layout_aula/widgets/drawer_body.dart';
import 'package:layout_aula/widgets/header_app.dart';

class HomePage extends StatefulWidget {
  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Color(0xFFECECEC),
      appBar: AppBar(
        iconTheme: IconThemeData(color: Colors.black),
        backgroundColor: Colors.white,
        title: Row(
          mainAxisAlignment: MainAxisAlignment.start,
          children: [
            Container(
              child: Image.asset(
                ConstsApp.logo,
                fit: BoxFit.cover,
                height: 55,
              ),
            ),
          ],
        ),
      ),
      drawer: Drawer(
        child: DrawerBody()
      ),
      body: Column(
        crossAxisAlignment: CrossAxisAlignment.stretch,
        children: [
          Container(
            child: HeaderApp(),
          ),
          BodyApp()
        ],
      ),
    );
  }
}
