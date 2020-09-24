import 'package:flutter/material.dart';
import 'package:layout_aula/widgets/drop_list.dart';

class HeaderApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Padding(
          padding: const EdgeInsets.all(20),
          child: Text(
            'Salas Virtuais',
            style: TextStyle(
              fontWeight: FontWeight.bold,
              fontSize: 20,
            ),
          ),
        ),
        Padding(
          padding: const EdgeInsets.only(left: 20),
          child: Text(
            'Periodo:',
            style: TextStyle(
              fontWeight: FontWeight.bold,
              fontSize: 15,
            ),
          ),
        ),
        Padding(
              padding: const EdgeInsets.only(
                  top: 10, right: 20, left: 20, bottom: 20),
              child: DropList(),
            ),
      ],
    );
  }
}
