@echo off
echo ========================================
echo    VERIFICADOR DE AMBIENTE JAVA
echo ========================================
echo.

echo Verificando instalacao do Java...
echo.

java -version >nul 2>&1
if %errorlevel% equ 0 (
    echo ✓ Java encontrado!
    java -version
    echo.
) else (
    echo ✗ Java nao encontrado!
    echo Por favor, instale o Java JDK 17 ou superior
    echo Download: https://www.oracle.com/java/technologies/downloads/
    echo.
    pause
    exit /b 1
)

echo Verificando versao do Java...
echo.

for /f "tokens=3" %%g in ('java -version 2^>^&1 ^| findstr /i "version"') do (
    set JAVA_VERSION=%%g
)

echo Versao do Java: %JAVA_VERSION%
echo.

echo Verificando variavel JAVA_HOME...
echo.

if defined JAVA_HOME (
    echo ✓ JAVA_HOME configurado: %JAVA_HOME%
) else (
    echo ⚠ JAVA_HOME nao configurado
    echo Recomendado configurar a variavel de ambiente JAVA_HOME
)

echo.
echo Verificando compilador javac...
echo.

javac -version >nul 2>&1
if %errorlevel% equ 0 (
    echo ✓ Compilador javac encontrado!
    javac -version
    echo.
) else (
    echo ✗ Compilador javac nao encontrado!
    echo Verifique se o JDK esta instalado corretamente
    echo.
    pause
    exit /b 1
)

echo ========================================
echo    AMBIENTE JAVA VERIFICADO!
echo ========================================
echo.
echo ✓ Java instalado e funcionando
echo ✓ Compilador javac disponivel
echo.
echo O ambiente esta pronto para compilar e executar os projetos!
echo.
pause
