@echo off
echo Gerando estatisticas do projeto...
echo.

set "TOTAL_ARQUIVOS=0"
set "TOTAL_LINHAS=0"
set "TOTAL_PROJETOS=0"
set "TOTAL_JAVA=0"
set "TOTAL_BAT=0"
set "TOTAL_MD=0"

echo ========================================
echo ESTATISTICAS DO REPOSITORIO
echo ========================================
echo.

echo 1. CONTAGEM DE ARQUIVOS POR TIPO:
echo ----------------------------------------

for /r . %%f in (*.java) do (
    set /a TOTAL_JAVA+=1
    set /a TOTAL_ARQUIVOS+=1
)
echo Arquivos Java: %TOTAL_JAVA%

for /r . %%f in (*.bat) do (
    set /a TOTAL_BAT+=1
    set /a TOTAL_ARQUIVOS+=1
)
echo Arquivos Batch: %TOTAL_BAT%

for /r . %%f in (*.md) do (
    set /a TOTAL_MD+=1
    set /a TOTAL_ARQUIVOS+=1
)
echo Arquivos Markdown: %TOTAL_MD%

echo.
echo 2. ESTRUTURA DE DIRETORIOS:
echo ----------------------------------------
echo.

if exist "atividades heranca" (
    echo ✓ Atividades de Heranca
    set /a TOTAL_PROJETOS+=10
)

if exist "atividades polimorfismo" (
    echo ✓ Atividades de Polimorfismo
    set /a TOTAL_PROJETOS+=1
)

if exist "atividades static" (
    echo ✓ Atividades Static
    set /a TOTAL_PROJETOS+=1
)

if exist "atividades CRUD e MVC" (
    echo ✓ Atividades CRUD e MVC
    set /a TOTAL_PROJETOS+=1
)

if exist "projetos" (
    echo ✓ Projetos CRUD e MVC
    set /a TOTAL_PROJETOS+=5
)

if exist "prova POO" (
    echo ✓ Prova POO - Sistema WEG 2.0
    set /a TOTAL_PROJETOS+=1
)

if exist "simulado POO" (
    echo ✓ Simulado POO
    set /a TOTAL_PROJETOS+=1
)

if exist "tratamento excecoes" (
    echo ✓ Tratamento de Excecoes
    set /a TOTAL_PROJETOS+=1
)

if exist "desafio jean" (
    echo ✓ Desafio Jean
    set /a TOTAL_PROJETOS+=1
)

if exist "simulado classes" (
    echo ✓ Simulado de Classes
    set /a TOTAL_PROJETOS+=1
)

echo.
echo 3. CONTAGEM DE LINHAS DE CODIGO:
echo ----------------------------------------

for /r . %%f in (*.java) do (
    for /f %%l in ('type "%%f" ^| find /c /v ""') do (
        set /a TOTAL_LINHAS+=%%l
    )
)

echo Total de linhas de codigo Java: %TOTAL_LINHAS%
echo.

echo 4. RESUMO GERAL:
echo ----------------------------------------
echo Total de arquivos: %TOTAL_ARQUIVOS%
echo Total de projetos: %TOTAL_PROJETOS%
echo Total de linhas de codigo: %TOTAL_LINHAS%
echo Total de scripts de automacao: %TOTAL_BAT%
echo.

echo 5. CONCEITOS ABORDADOS:
echo ----------------------------------------
echo ✓ Programacao Orientada a Objetos (POO)
echo ✓ Heranca e Polimorfismo
echo ✓ Encapsulamento e Abstração
echo ✓ Tratamento de Excecoes
echo ✓ Padroes de Projeto (MVC, CRUD)
echo ✓ Membros Estaticos
echo ✓ Estruturas de Dados
echo ✓ Interface com Usuario
echo ✓ Validação de Dados
echo ✓ Organização de Codigo
echo.

echo ========================================
echo ESTATISTICAS GERADAS COM SUCESSO!
echo ========================================
echo.
echo Para mais detalhes, consulte o README.md
echo Para compilar todos os projetos: scripts\compilar_todos.bat
echo.

pause
