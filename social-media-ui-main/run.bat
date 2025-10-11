@echo off
echo Compiling and running Social Media UI Application...

REM Create lib directory if it doesn't exist
if not exist "lib" mkdir lib

REM Check if dependencies exist, if not, download them
if not exist "lib\flatlaf-3.6.2.jar" (
    echo Downloading FlatLaf dependency...
    powershell -Command "Invoke-WebRequest -Uri 'https://repo1.maven.org/maven2/com/formdev/flatlaf/3.6.2/flatlaf-3.6.2.jar' -OutFile 'lib\flatlaf-3.6.2.jar'"
)

if not exist "lib\flatlaf-extras-3.6.2.jar" (
    echo Downloading FlatLaf Extras dependency...
    powershell -Command "Invoke-WebRequest -Uri 'https://repo1.maven.org/maven2/com/formdev/flatlaf-extras/3.6.2/flatlaf-extras-3.6.2.jar' -OutFile 'lib\flatlaf-extras-3.6.2.jar'"
)

if not exist "lib\flatlaf-fonts-roboto-2.137.jar" (
    echo Downloading FlatLaf Fonts dependency...
    powershell -Command "Invoke-WebRequest -Uri 'https://repo1.maven.org/maven2/com/formdev/flatlaf-fonts-roboto/2.137/flatlaf-fonts-roboto-2.137.jar' -OutFile 'lib\flatlaf-fonts-roboto-2.137.jar'"
)

if not exist "lib\miglayout-swing-11.4.2.jar" (
    echo Downloading MigLayout dependency...
    powershell -Command "Invoke-WebRequest -Uri 'https://repo1.maven.org/maven2/com/miglayout/miglayout-swing/11.4.2/miglayout-swing-11.4.2.jar' -OutFile 'lib\miglayout-swing-11.4.2.jar'"
)

REM Compile the source files
echo Compiling source files...
javac -cp "lib\flatlaf-3.6.2.jar;lib\flatlaf-extras-3.6.2.jar;lib\flatlaf-fonts-roboto-2.137.jar;lib\miglayout-swing-11.4.2.jar" -d target\classes src\main\java\raven\main\Application.java src\main\java\raven\login\*.java src\main\java\raven\manager\*.java src\main\java\raven\component\*.java src\main\java\raven\util\*.java src\main\java\raven\toast\*.java

if %ERRORLEVEL% NEQ 0 (
    echo Compilation failed!
    pause
    exit /b 1
)

REM Copy resources
echo Copying resources...
xcopy /s /y src\main\resources\* target\classes\

REM Run the application
echo Starting application...
java -cp "target\classes;lib\flatlaf-3.6.2.jar;lib\flatlaf-extras-3.6.2.jar;lib\flatlaf-fonts-roboto-2.137.jar;lib\miglayout-swing-11.4.2.jar" raven.main.Application

pause
