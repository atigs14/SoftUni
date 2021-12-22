package impl;

import ENUM.ReportLevel;
import interfaces.Appender;
import interfaces.Logger;

public class MessageLogger implements Logger {

    private Appender[] appenders;

    public MessageLogger(Appender... appender) {
        this.appenders = appender;
    }

    @Override
    public void logInfo(String time, String message) {
        log(time, message, ReportLevel.INFO);
    }

    @Override
    public void logWarning(String time, String message) {
        log(time, message, ReportLevel.WARNING);

    }

    @Override
    public void logError(String time, String message) {
        log(time, message, ReportLevel.ERROR);

    }

    @Override
    public void logCritical(String time, String message) {
        log(time, message, ReportLevel.CRITICAL);

    }

    @Override
    public void logFatal(String time, String message) {
        log(time, message, ReportLevel.FATAL);
    }

    private void log(String time, String message, ReportLevel reportLevel) {
        for (Appender appender : appenders) {
            appender.append(time, message, reportLevel);
        }
    }
}
