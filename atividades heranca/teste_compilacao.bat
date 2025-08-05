@echo off
echo ========================================
echo TESTE DE COMPILACAO - PROJETOS HERANCA
echo ========================================
echo.

echo Testando compilacao do projeto Escola...
cd src\br\com\projetoEscola
javac -d ..\..\..\..\..\..\bin *.java
if %errorlevel% equ 0 (
    echo [OK] ProjetoEscola compilou com sucesso!
) else (
    echo [ERRO] Falha na compilacao do ProjetoEscola
)
cd ..\..\..\..\..\..\..

echo.
echo Testando compilacao do projeto Clinica...
cd src\br\com\projetoClinica
javac -d ..\..\..\..\..\..\bin *.java
if %errorlevel% equ 0 (
    echo [OK] ProjetoClinica compilou com sucesso!
) else (
    echo [ERRO] Falha na compilacao do ProjetoClinica
)
cd ..\..\..\..\..\..\..

echo.
echo Testando compilacao do projeto Estacionamento...
cd src\br\com\projetoEstacionamento
javac -d ..\..\..\..\..\..\bin *.java
if %errorlevel% equ 0 (
    echo [OK] ProjetoEstacionamento compilou com sucesso!
) else (
    echo [ERRO] Falha na compilacao do ProjetoEstacionamento
)
cd ..\..\..\..\..\..\..

echo.
echo Testando compilacao do projeto Biblioteca...
cd src\br\com\projetoBiblioteca
javac -d ..\..\..\..\..\..\bin *.java
if %errorlevel% equ 0 (
    echo [OK] ProjetoBiblioteca compilou com sucesso!
) else (
    echo [ERRO] Falha na compilacao do ProjetoBiblioteca
)
cd ..\..\..\..\..\..\..

echo.
echo Testando compilacao do projeto Hotel...
cd src\br\com\projetoHotel
javac -d ..\..\..\..\..\..\bin *.java
if %errorlevel% equ 0 (
    echo [OK] ProjetoHotel compilou com sucesso!
) else (
    echo [ERRO] Falha na compilacao do ProjetoHotel
)
cd ..\..\..\..\..\..\..

echo.
echo Testando compilacao do projeto Academia...
cd src\br\com\projetoAcademia
javac -d ..\..\..\..\..\..\bin *.java
if %errorlevel% equ 0 (
    echo [OK] ProjetoAcademia compilou com sucesso!
) else (
    echo [ERRO] Falha na compilacao do ProjetoAcademia
)
cd ..\..\..\..\..\..\..

echo.
echo Testando compilacao do projeto Cinema...
cd src\br\com\projetoCinema
javac -d ..\..\..\..\..\..\bin *.java
if %errorlevel% equ 0 (
    echo [OK] ProjetoCinema compilou com sucesso!
) else (
    echo [ERRO] Falha na compilacao do ProjetoCinema
)
cd ..\..\..\..\..\..\..

echo.
echo Testando compilacao do projeto Ong...
cd src\br\com\projetoOng
javac -d ..\..\..\..\..\..\bin *.java
if %errorlevel% equ 0 (
    echo [OK] ProjetoOng compilou com sucesso!
) else (
    echo [ERRO] Falha na compilacao do ProjetoOng
)
cd ..\..\..\..\..\..\..

echo.
echo Testando compilacao do projeto Loja...
cd src\br\com\projetoLoja
javac -d ..\..\..\..\..\..\bin *.java
if %errorlevel% equ 0 (
    echo [OK] ProjetoLoja compilou com sucesso!
) else (
    echo [ERRO] Falha na compilacao do ProjetoLoja
)
cd ..\..\..\..\..\..\..

echo.
echo Testando compilacao do projeto Petshop...
cd src\br\com\projetoPetshop
javac -d ..\..\..\..\..\..\bin *.java
if %errorlevel% equ 0 (
    echo [OK] ProjetoPetshop compilou com sucesso!
) else (
    echo [ERRO] Falha na compilacao do ProjetoPetshop
)
cd ..\..\..\..\..\..\..

echo.
echo ========================================
echo TESTE DE COMPILACAO CONCLUIDO
echo ========================================
pause 