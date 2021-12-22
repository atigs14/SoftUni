package impl.appenders;

import ENUM.ReportLevel;
import interfaces.Layout;

public class ConsoleAppender extends BaseAppender {


    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String time, String message, ReportLevel reportLevel) {
        String formattedMessage = layout.format(time, message, reportLevel);
        System.out.println(formattedMessage);
    }
}
