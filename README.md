Project Appium maven with cucumber for Android

Requirements

Java 8
Appium 1.8.1
Maven
Android Simulators or Devices

Running Tests

Start appium server: $ appium

Run android tests: $ mvn clean test -Dcucumber.options="--tags @here_tags_for_Android" -Denv.PLATAFORM=ANDROID

Run ios tests: $ mvn clean test -Dcucumber.options="--tags @here_tags_for_IOS" -Denv.PLATAFORM=IPHONE_8

Generate reports: mvn allure:serve
