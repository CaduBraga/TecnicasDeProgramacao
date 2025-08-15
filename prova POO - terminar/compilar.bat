@echo off
echo Compilando Sistema de Hotel...
echo.

if not exist "bin" mkdir bin

javac -d bin -cp "src" src/model/*.java src/service/*.java src/view/*.java

if %ERRORLEVEL% EQU 0 (
    echo.
    echo Compilacao concluida com sucesso!
    echo.
    echo Para executar o programa, use:
    echo java -cp bin view.Main
    echo.
) else (
    echo.
    echo Erro na compilacao!
    echo.
)

pause
