package interfaces;

import ENUM.ReportLevel;

public interface Appender {
    void append(String time, String message, ReportLevel reportLevel);
}
