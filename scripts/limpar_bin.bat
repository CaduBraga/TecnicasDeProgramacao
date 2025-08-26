@echo off
echo Limpando arquivos compilados do repositorio...
echo.

set "DIRETORIOS=atividades heranca atividades polimorfismo atividades static atividades CRUD e MVC desafio jean projetos prova POO simulado POO tratamento excecoes"
set "TOTAL_REMOVIDOS=0"

echo Removendo diretorios bin e arquivos .class...

for %%d in (%DIRETORIOS%) do (
    if exist "%%d\bin" (
        echo Removendo: %%d\bin
        rmdir /s /q "%%d\bin" 2>nul
        set /a TOTAL_REMOVIDOS+=1
    )
)

echo.
echo Removendo arquivos .class soltos...

for /r . %%f in (*.class) do (
    echo Removendo: %%f
    del "%%f" 2>nul
    set /a TOTAL_REMOVIDOS+=1
)

echo.
echo ========================================
echo LIMPEZA CONCLUIDA
echo ========================================
echo Total de itens removidos: %TOTAL_REMOVIDOS%
echo.
echo Todos os arquivos compilados foram removidos!
echo Para recompilar, use: scripts\compilar_todos.bat
echo.

pause
