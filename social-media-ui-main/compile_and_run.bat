@echo off
echo Compiling Social Media UI Application...

REM Compile source files with minimal dependencies
echo Compiling source files...
javac -cp "target\classes" -d target\classes src\main\java\raven\main\Application.java src\main\java\raven\login\*.java src\main\java\raven\manager\*.java src\main\java\raven\component\*.java src\main\java\raven\util\*.java src\main\java\raven\toast\*.java

if %ERRORLEVEL% NEQ 0 (
    echo Compilation failed!
    echo Trying alternative approach...
    goto :alternative
)

REM Copy resources
echo Copying resources...
xcopy /s /y src\main\resources\* target\classes\

REM Try to run with existing classes
echo Starting application...
java -cp "target\classes" raven.main.Application
goto :end

:alternative
echo Trying to run with existing compiled classes...
java -cp "target\classes" raven.main.Application

:end
pause
