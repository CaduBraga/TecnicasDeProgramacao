@echo off
title Menu PrincipalAluno - Tecnicas de Programacao
color 0A

:menu
cls
echo.
echo  ╔══════════════════════════════════════════════════════════════╗
echo  ║                    TECNICAS DE PROGRAMACAO                    ║
echo  ║                     CentroWeg MIDS 77                        ║
echo  ║                                                              ║
echo  ║                        MENU PRINCIPAL                        ║
echo  ╚══════════════════════════════════════════════════════════════╝
echo.
echo  [1] 🔧 Verificar Ambiente Java
echo  [2] 📦 Compilar Todos os Projetos
echo  [3] ▶️  Executar Projeto Específico
echo  [4] 🧹 Limpar Arquivos Compilados
echo  [5] 📊 Gerar Estatísticas do Projeto
echo  [6] 📚 Abrir Documentação
echo  [7] 🚪 Sair
echo.
echo  ═══════════════════════════════════════════════════════════════
echo.
set /p opcao="Escolha uma opção (1-7): "

if "%opcao%"=="1" goto verificar_java
if "%opcao%"=="2" goto compilar_todos
if "%opcao%"=="3" goto executar_projeto
if "%opcao%"=="4" goto limpar_bin
if "%opcao%"=="5" goto estatisticas
if "%opcao%"=="6" goto documentacao
if "%opcao%"=="7" goto sair

echo.
echo ❌ Opção inválida! Digite um número de 1 a 7.
echo.
pause
goto menu

:verificar_java
cls
echo.
echo 🔧 Verificando ambiente Java...
echo.
call verificar_java.bat
echo.
pause
goto menu

:compilar_todos
cls
echo.
echo 📦 Compilando todos os projetos...
echo.
call compilar_todos.bat
echo.
pause
goto menu

:executar_projeto
cls
echo.
echo ▶️  Executando projeto específico...
echo.
call executar_projeto.bat
echo.
pause
goto menu

:limpar_bin
cls
echo.
echo 🧹 Limpando arquivos compilados...
echo.
call limpar_bin.bat
echo.
pause
goto menu

:estatisticas
cls
echo.
echo 📊 Gerando estatísticas do projeto...
echo.
call estatisticas_projeto.bat
echo.
pause
goto menu

:documentacao
cls
echo.
echo 📚 Abrindo documentação...
echo.
echo 📖 README.md - Documentação principal do projeto
echo 📝 CHANGELOG.md - Histórico de mudanças
echo 📄 LICENSE - Licença educacional
echo 🤝 CONTRIBUTING.md - Guia de contribuição
echo 📋 CODE_OF_CONDUCT.md - Código de conduta
echo.
echo Para abrir os arquivos, use:
echo - notepad README.md
echo - notepad CHANGELOG.md
echo - notepad LICENSE
echo.
pause
goto menu

:sair
cls
echo.
echo  ╔══════════════════════════════════════════════════════════════╗
echo  ║                        OBRIGADO!                             ║
echo  ║                                                              ║
echo  ║         Tecnicas de Programacao - CentroWeg MIDS 77         ║
echo  ║                                                              ║
echo  ║              Desenvolvido por Carlos Eduardo Braga           ║
echo  ╚══════════════════════════════════════════════════════════════╝
echo.
echo 🎓 Continue aprendendo e desenvolvendo!
echo.
pause
exit
