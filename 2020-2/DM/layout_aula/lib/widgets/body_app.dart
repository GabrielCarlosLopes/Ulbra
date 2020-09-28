import 'dart:ui';

import 'package:flutter/material.dart';
import 'package:percent_indicator/circular_percent_indicator.dart';

class BodyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final List<Widget> cards = [
      cardAula(Colors.blue, '1111', '80%', 0.8, 'Banco de Dados', context),
      cardAula(Colors.green, '2222', '40%', 0.4,
          'Desenvolvimento de Aplicações Orientadas a Objeto', context),
      cardAula(Colors.orange, '3333', '10%', 0.1,
          'Desenvolvimento de Sistemas Móveis', context),
      cardAula(
          Colors.brown, '4444', '5%', 0.05, 'Gerência de Projetos', context),
      cardAula(Colors.indigoAccent, '5555', '28%', 0.28,
          'Modelagem de Software', context)
    ];

    return Expanded(
      child: ListView.builder(
        itemCount: cards.length,
        itemBuilder: (context, index) {
          return cards[index];
        },
      ),
    );
  }
}

Widget cardAula(
  Color colorCard,
  String nRoom,
  String percent,
  double percentRadius,
  String course,
  BuildContext context,
) {

  final _widthPhone = MediaQuery.of(context).size.width;

  return Padding(
    padding: const EdgeInsets.only(top: 10, right: 20, left: 20),
    child: Container(
      height: 270,
      child: Stack(
        children: [
          //container parte de cima do card
          Container(
            margin: EdgeInsets.only(top: 10),
            height: 130,
            decoration: BoxDecoration(
              borderRadius: BorderRadius.only(
                topRight: Radius.circular(8),
              ),
              color: colorCard,
            ),
            child: Padding(
              padding: EdgeInsets.all(15),
              child: Container(
                height: 50,
                child: Row(
                  children: [
                    Container(
                      width: _widthPhone / 1.9,
                      child: Column(
                        crossAxisAlignment: CrossAxisAlignment.start,
                        mainAxisAlignment: MainAxisAlignment.end,
                        children: [
                          Text(
                            course,
                            style: TextStyle(
                              color: Colors.white,
                              fontSize: 18,
                              fontWeight: FontWeight.bold,
                            ),
                          ),
                          SizedBox(
                            height: 5,
                          ),
                          Text(
                            'Turma: 0155-A - 41N/42N - Graduação',
                            style: TextStyle(color: Colors.white, fontSize: 12),
                          )
                        ],
                      ),
                    ),
                    Padding(
                      padding: const EdgeInsets.only(left: 20),
                      child: CircularPercentIndicator(
                        radius: 75.0,
                        lineWidth: 4.0,
                        animation: true,
                        animationDuration: 1200,
                        percent: percentRadius,
                        center: Text(
                          percent,
                          style: TextStyle(
                              color: Colors.white,
                              fontSize: 15,
                              fontWeight: FontWeight.bold),
                        ),
                        progressColor: Colors.amber,
                      ),
                    ),
                  ],
                ),
              ),
            ),
          ),
          //container parte de baixo
          Container(
            margin: EdgeInsets.only(top: 140),
            height: 110,
            decoration: BoxDecoration(
              borderRadius: BorderRadius.only(
                bottomLeft: Radius.circular(8),
                bottomRight: Radius.circular(8),
              ),
              color: Colors.white,
            ),
            child: Padding(
              padding: EdgeInsets.all(5.0),
              child: Container(
                  child: Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  Column(
                    children: [
                      Row(
                        children: [
                          IconButton(
                            icon: Icon(
                              Icons.star,
                              size: 30,
                              color: Color(0xFFECECEC),
                            ),
                            onPressed: () {},
                          ),
                          SizedBox(
                            width: 20,
                          ),
                          IconButton(
                            icon: Icon(
                              Icons.mode_comment_rounded,
                              size: 30,
                              color: Color(0xFFECECEC),
                            ),
                            onPressed: () {},
                          ),
                          SizedBox(
                            width: 20,
                          ),
                          IconButton(
                            icon: Icon(
                              Icons.info,
                              size: 30,
                              color: Color(0xFFECECEC),
                            ),
                            onPressed: () {},
                          ),
                        ],
                      ),
                      Container(
                        width: _widthPhone / 1.3,
                        child: RaisedButton(
                          onPressed: () {},
                          color: Colors.green,
                          textColor: Colors.white,
                          child: Text('Entrar na Sala'),
                        ),
                      ),
                    ],
                  )
                ],
              )),
            ),
          ),
          //container do numero da turma eu acho
          Container(
            alignment: Alignment.center,
            height: 20,
            width: 80,
            decoration: BoxDecoration(
              borderRadius: BorderRadius.only(
                topRight: Radius.circular(8),
                bottomRight: Radius.circular(8),
                topLeft: Radius.circular(8),
              ),
              color: Colors.white,
            ),
            child: Text(
              nRoom,
              style: TextStyle(fontWeight: FontWeight.bold),
            ),
          ),
        ],
      ),
    ),
  );
}
