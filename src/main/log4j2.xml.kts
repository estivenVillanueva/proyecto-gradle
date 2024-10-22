<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="WARN">
<Appenders>
<!-- Consola Appender -->
<Console name="Console" target="SYSTEM_OUT">
<PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
</Console>
</Appenders>

<Loggers>
<!-- Logger de la aplicación -->
<Logger name="com.example.RegistroApp" level="debug" additivity="false">
<AppenderRef ref="Console"/>
</Logger>

<!-- Logger raíz -->
<Root level="info">
<AppenderRef ref="Console"/>
</Root>
</Loggers>
</Configuration>
