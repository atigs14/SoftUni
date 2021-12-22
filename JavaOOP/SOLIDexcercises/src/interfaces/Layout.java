package interfaces;

import ENUM.ReportLevel;

public interface Layout {
    String format(String time, String message, ReportLevel reportLevel);
}
