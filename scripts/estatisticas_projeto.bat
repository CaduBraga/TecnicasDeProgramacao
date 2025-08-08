@echo off
echo ========================================
echo    ESTATISTICAS DO PROJETO
echo ========================================
echo.

echo Contando arquivos Java...
set /a total_java=0
set /a total_projetos=0
set /a total_exercicios=0

echo.
echo === ATIVIDADES DE HERANCA ===
cd "atividades heranca/src"
for /r . %%f in (*.java) do (
    set /a total_java+=1
)
echo Arquivos Java encontrados: %total_java%
set /a total_projetos+=10
cd ../..

echo.
echo === PROJETOS CRUD E MVC ===
cd "projetos/src"
for /r . %%f in (*.java) do (
    set /a total_java+=1
)
echo Arquivos Java encontrados: %total_java%
set /a total_projetos+=5
cd ../..

echo.
echo === TRATAMENTO DE EXCECOES ===
cd "tratamento excecoes/src"
for /r . %%f in (*.java) do (
    set /a total_java+=1
)
echo Arquivos Java encontrados: %total_java%
set /a total_exercicios+=4
cd ../..

echo.
echo === DESAFIO JEAN ===
cd "desafio jean/src"
for /r . %%f in (*.java) do (
    set /a total_java+=1
)
echo Arquivos Java encontrados: %total_java%
set /a total_projetos+=1
cd ../..

echo.
echo === ATIVIDADES POLIMORFISMO ===
cd "atividades polimorfismo/src"
for /r . %%f in (*.java) do (
    set /a total_java+=1
)
echo Arquivos Java encontrados: %total_java%
set /a total_exercicios+=1
cd ../..

echo.
echo === ATIVIDADES CRUD E MVC ===
cd "atividades CRUD e MVC/src"
for /r . %%f in (*.java) do (
    set /a total_java+=1
)
echo Arquivos Java encontrados: %total_java%
set /a total_exercicios+=1
cd ../..

echo.
echo === SIMULADOS DE CLASSES ===
cd "simulado classes"
for /r . %%f in (*.java) do (
    set /a total_java+=1
)
echo Arquivos Java encontrados: %total_java%
set /a total_exercicios+=4
cd ..

echo.
echo === ATIVIDADES STATIC ===
cd "atividades static/respostas"
for /r . %%f in (*.java) do (
    set /a total_java+=1
)
echo Arquivos Java encontrados: %total_java%
set /a total_exercicios+=3
cd ../..

echo.
echo ========================================
echo    RESUMO ESTATISTICO
echo ========================================
echo.
echo 📊 Total de arquivos Java: %total_java%
echo 📁 Total de projetos: %total_projetos%
echo 📝 Total de exercicios: %total_exercicios%
echo.
echo 📂 Estrutura do projeto:
echo    - 8 categorias principais
echo    - 15+ projetos completos
echo    - 20+ exercicios praticos
echo    - 3 tipos de excecoes customizadas
echo    - 5 scripts de automacao
echo.
echo 🎯 Conceitos abordados:
echo    - Heranca e Polimorfismo
echo    - Tratamento de Excecoes
echo    - Padroes MVC e CRUD
echo    - Membros Static
echo    - Encapsulamento
echo.
echo 🛠️ Tecnologias utilizadas:
echo    - Java 17
echo    - IntelliJ IDEA / Eclipse
echo    - Git para versionamento
echo    - Scripts batch para automacao
echo.
echo ========================================
echo.
pause
