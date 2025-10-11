@echo off
echo Testing Social Media UI Application...

REM Check if Java is available
java -version >nul 2>&1
if %ERRORLEVEL% NEQ 0 (
    echo ERROR: Java is not installed or not in PATH
    pause
    exit /b 1
)

echo Java is available.

REM Check if classes exist
if not exist "target\classes\raven\main\SimpleApplication.class" (
    echo ERROR: Application classes not found. Please compile first.
    echo Run: javac -d target\classes src\main\java\raven\main\SimpleApplication.java src\main\java\raven\login\Simple*.java src\main\java\raven\manager\Simple*.java src\main\java\raven\toast\Simple*.java
    pause
    exit /b 1
)

echo Application classes found.

REM Test compilation
echo Testing compilation...
javac -d target\classes src\main\java\raven\main\SimpleApplication.java src\main\java\raven\login\Simple*.java src\main\java\raven\manager\Simple*.java src\main\java\raven\toast\Simple*.java

if %ERRORLEVEL% NEQ 0 (
    echo ERROR: Compilation failed
    pause
    exit /b 1
)

echo Compilation successful!

REM Copy resources
xcopy /s /y src\main\resources\* target\classes\ >nul 2>&1

echo Starting application test...
echo The application window should open now.
echo Close the application window to complete the test.

java -cp "target\classes" raven.main.SimpleApplication

echo Test completed successfully!
pause
