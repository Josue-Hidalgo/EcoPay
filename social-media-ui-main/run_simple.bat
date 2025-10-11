@echo off
echo Compiling and running Simple Social Media UI Application...

REM Create target directory if it doesn't exist
if not exist "target\classes" mkdir target\classes

REM Compile the simple version
echo Compiling simple version...
javac -d target\classes src\main\java\raven\main\SimpleApplication.java src\main\java\raven\login\Simple*.java src\main\java\raven\manager\Simple*.java src\main\java\raven\toast\Simple*.java

if %ERRORLEVEL% NEQ 0 (
    echo Compilation failed! Please check for errors above.
    pause
    exit /b 1
)

echo Compilation successful!

if %ERRORLEVEL% NEQ 0 (
    echo Compilation failed!
    pause
    exit /b 1
)

REM Copy resources
echo Copying resources...
if exist "src\main\resources" (
    xcopy /s /y src\main\resources\* target\classes\
)

REM Run the application
echo Starting simple application...
java -cp "target\classes" raven.main.SimpleApplication

pause
