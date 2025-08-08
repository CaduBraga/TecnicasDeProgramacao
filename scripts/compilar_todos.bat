@echo off
echo ========================================
echo    COMPILADOR UNIVERSAL - TECNICAS DE PROGRAMACAO
echo ========================================
echo.

echo [1/8] Compilando Atividades de Heranca...
cd "atividades heranca"
if exist "teste_compilacao.bat" (
    call teste_compilacao.bat
) else (
    echo Script de compilacao nao encontrado para atividades de heranca
)
cd ..

echo.
echo [2/8] Compilando Projetos CRUD e MVC...
cd "projetos"
if exist "compilar.bat" (
    call compilar.bat
) else (
    echo Script de compilacao nao encontrado para projetos CRUD
)
cd ..

echo.
echo [3/8] Compilando Tratamento de Excecoes...
cd "tratamento excecoes/src"
javac -d ../../bin *.java
if %errorlevel% equ 0 (
    echo ✓ Tratamento de excecoes compilado com sucesso
) else (
    echo ✗ Erro na compilacao do tratamento de excecoes
)
cd ../..

echo.
echo [4/8] Compilando Desafio Jean...
cd "desafio jean/src"
javac -d ../../bin br/com/desafioJean/*/*.java
if %errorlevel% equ 0 (
    echo ✓ Desafio Jean compilado com sucesso
) else (
    echo ✗ Erro na compilacao do Desafio Jean
)
cd ../..

echo.
echo [5/8] Compilando Atividades Static...
cd "atividades static/respostas/11-13"
javac *.java
if %errorlevel% equ 0 (
    echo ✓ Atividades Static compiladas com sucesso
) else (
    echo ✗ Erro na compilacao das Atividades Static
)
cd ../../..

echo.
echo [6/8] Compilando Atividades Polimorfismo...
cd "atividades polimorfismo/src"
javac -d ../../bin br/com/atividadesPolimorfismo/*/*.java
if %errorlevel% equ 0 (
    echo ✓ Atividades Polimorfismo compiladas com sucesso
) else (
    echo ✗ Erro na compilacao das Atividades Polimorfismo
)
cd ../..

echo.
echo [7/8] Compilando Atividades CRUD e MVC...
cd "atividades CRUD e MVC/src"
javac -d ../../bin br/com/atividades-CRUDeMVC/*/*.java
if %errorlevel% equ 0 (
    echo ✓ Atividades CRUD e MVC compiladas com sucesso
) else (
    echo ✗ Erro na compilacao das Atividades CRUD e MVC
)
cd ../..

echo.
echo [8/8] Compilando Simulados de Classes...
cd "simulado classes/10"
javac *.java
if %errorlevel% equ 0 (
    echo ✓ Simulado 10 compilado com sucesso
) else (
    echo ✗ Erro na compilacao do Simulado 10
)
cd ../11
javac *.java
if %errorlevel% equ 0 (
    echo ✓ Simulado 11 compilado com sucesso
) else (
    echo ✗ Erro na compilacao do Simulado 11
)
cd ../12/v1
javac *.java
if %errorlevel% equ 0 (
    echo ✓ Simulado 12 v1 compilado com sucesso
) else (
    echo ✗ Erro na compilacao do Simulado 12 v1
)
cd ../v2
javac *.java
if %errorlevel% equ 0 (
    echo ✓ Simulado 12 v2 compilado com sucesso
) else (
    echo ✗ Erro na compilacao do Simulado 12 v2
)
cd ../../..

echo.
echo ========================================
echo    COMPILACAO CONCLUIDA!
echo ========================================
echo.
echo Para executar os projetos:
echo - Navegue ate o diretorio desejado
echo - Execute: java -cp ../../bin br.com.nomeProjeto.main.Main
echo.
pause
