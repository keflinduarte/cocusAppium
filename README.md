Project Appium maven with cucumber for Android

## Requirements

* Java 8
* Appium 1.8.1
* Maven
* Android Simulators or Devices

## Running Tests

1. Start appium server: `$ appium` 
	
2. Run android tests: `$ mvn clean test -Dcucumber.options="--tags @here_tags_for_Android" -Denv.PLATAFORM=ANDROID`

3. Generate reports: `mvn allure:serve`

## IMPORTANT

* Before run the tests you need to start android device or emulator and appium server.
