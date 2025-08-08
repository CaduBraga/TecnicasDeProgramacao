@echo off
echo ========================================
echo    LIMPADOR DE ARQUIVOS COMPILADOS
echo ========================================
echo.

echo Removendo arquivos .class e diretorios bin...
echo.

if exist "bin" (
    rmdir /s /q "bin"
    echo ✓ Diretorio bin removido
)

if exist "atividades heranca/bin" (
    rmdir /s /q "atividades heranca/bin"
    echo ✓ Bin das atividades de heranca removido
)

if exist "projetos/bin" (
    rmdir /s /q "projetos/bin"
    echo ✓ Bin dos projetos removido
)

if exist "tratamento excecoes/bin" (
    rmdir /s /q "tratamento excecoes/bin"
    echo ✓ Bin do tratamento de excecoes removido
)

if exist "desafio jean/bin" (
    rmdir /s /q "desafio jean/bin"
    echo ✓ Bin do desafio jean removido
)

if exist "atividades polimorfismo/bin" (
    rmdir /s /q "atividades polimorfismo/bin"
    echo ✓ Bin das atividades polimorfismo removido
)

if exist "atividades CRUD e MVC/bin" (
    rmdir /s /q "atividades CRUD e MVC/bin"
    echo ✓ Bin das atividades CRUD e MVC removido
)

echo.
echo Removendo arquivos .class individuais...
echo.

for /r . %%f in (*.class) do (
    del "%%f"
    echo ✓ Removido: %%f
)

echo.
echo ========================================
echo    LIMPEZA CONCLUIDA!
echo ========================================
echo.
echo Todos os arquivos compilados foram removidos.
echo Execute o script de compilacao para recriar os arquivos .class
echo.
pause
