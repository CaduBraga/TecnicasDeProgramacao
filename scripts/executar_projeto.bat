@echo off
echo ========================================
echo    EXECUTOR DE PROJETOS - TECNICAS DE PROGRAMACAO
echo ========================================
echo.

echo Escolha o tipo de projeto:
echo.
echo [1] Atividades de Heranca
echo [2] Projetos CRUD e MVC
echo [3] Tratamento de Excecoes
echo [4] Desafio Jean
echo [5] Atividades Polimorfismo
echo [6] Atividades CRUD e MVC
echo [7] Simulados de Classes
echo [8] Atividades Static
echo.
set /p escolha="Digite o numero da opcao: "

if "%escolha%"=="1" goto heranca
if "%escolha%"=="2" goto crud
if "%escolha%"=="3" goto excecoes
if "%escolha%"=="4" goto desafio
if "%escolha%"=="5" goto polimorfismo
if "%escolha%"=="6" goto atividades_crud
if "%escolha%"=="7" goto simulados
if "%escolha%"=="8" goto static

echo Opcao invalida!
pause
exit /b

:heranca
echo.
echo Escolha o projeto de heranca:
echo [1] ProjetoEscola
echo [2] ProjetoClinica
echo [3] ProjetoEstacionamento
echo [4] ProjetoBiblioteca
echo [5] ProjetoHotel
echo [6] ProjetoAcademia
echo [7] ProjetoCinema
echo [8] ProjetoOng
echo [9] ProjetoLoja
echo [10] ProjetoPetshop
echo.
set /p projeto="Digite o numero do projeto: "

if "%projeto%"=="1" set projeto=projetoEscola
if "%projeto%"=="2" set projeto=projetoClinica
if "%projeto%"=="3" set projeto=projetoEstacionamento
if "%projeto%"=="4" set projeto=projetoBiblioteca
if "%projeto%"=="5" set projeto=projetoHotel
if "%projeto%"=="6" set projeto=projetoAcademia
if "%projeto%"=="7" set projeto=projetoCinema
if "%projeto%"=="8" set projeto=projetoOng
if "%projeto%"=="9" set projeto=projetoLoja
if "%projeto%"=="10" set projeto=projetoPetshop

cd "atividades heranca/src/br/com/%projeto%/main"
java Main
cd ../../../../../..
goto fim

:crud
echo.
echo Escolha o projeto CRUD:
echo [1] appBiblioteca
echo [2] appFilmes
echo [3] appFrutaria
echo [4] appSuplementos
echo [5] appCursos
echo.
set /p projeto="Digite o numero do projeto: "

if "%projeto%"=="1" set projeto=appBiblioteca
if "%projeto%"=="2" set projeto=appFilmes
if "%projeto%"=="3" set projeto=appFrutaria
if "%projeto%"=="4" set projeto=appSuplementos
if "%projeto%"=="5" set projeto=appCursos

cd "projetos/src/br/com/%projeto%/main"
java App%projeto%
cd ../../../../../..
goto fim

:excecoes
echo.
echo Escolha o exercicio:
echo [1] Exercicio1
echo [2] Exercicio2
echo [3] Exercicio3
echo [4] Exercicio4
echo.
set /p exercicio="Digite o numero do exercicio: "

cd "tratamento excecoes/src"
java br.com.tratamentoExcecoes.Exercicio%exercicio%
cd ../..
goto fim

:desafio
cd "desafio jean/src"
java br.com.desafioJean.main.DesafioJean
cd ../..
goto fim

:polimorfismo
cd "atividades polimorfismo/src"
java br.com.atividadesPolimorfismo.main.Main
cd ../..
goto fim

:atividades_crud
cd "atividades CRUD e MVC/src"
java br.com.atividades-CRUDeMVC.main.Main
cd ../..
goto fim

:simulados
echo.
echo Escolha o simulado:
echo [1] Simulado 10
echo [2] Simulado 11
echo [3] Simulado 12 v1
echo [4] Simulado 12 v2
echo.
set /p simulado="Digite o numero do simulado: "

if "%simulado%"=="1" (
    cd "simulado classes/10"
    java Principal
    cd ../..
)
if "%simulado%"=="2" (
    cd "simulado classes/11"
    java Principal
    cd ../..
)
if "%simulado%"=="3" (
    cd "simulado classes/12/v1"
    java Principal
    cd ../../..
)
if "%simulado%"=="4" (
    cd "simulado classes/12/v2"
    java Principal
    cd ../../..
)
goto fim

:static
cd "atividades static/respostas/11-13"
java Main
cd ../../../..
goto fim

:fim
echo.
echo Execucao concluida!
pause
