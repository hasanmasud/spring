@ECHO OFF
cls
call mvn clean package >log.txt
call mvn exec:java -Dexec.mainClass="com.bank.app.TransferScript"