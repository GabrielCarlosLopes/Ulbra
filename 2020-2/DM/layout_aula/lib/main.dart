import 'package:flutter/material.dart';

import 'pages/home_page.dart';

main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Layout Aula',
      debugShowCheckedModeBanner: false,
      home: HomePage(),
    );
  }
}
