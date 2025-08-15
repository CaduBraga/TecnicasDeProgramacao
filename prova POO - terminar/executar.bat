@echo off
echo Executando Sistema de Hotel...
echo.

if not exist "bin" (
    echo Erro: Projeto nao compilado!
    echo Execute primeiro o script 'compilar.bat'
    echo.
    pause
    exit /b 1
)

java -cp bin view.Main

pause
