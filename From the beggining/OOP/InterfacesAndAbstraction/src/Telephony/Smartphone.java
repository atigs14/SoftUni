package Telephony;

import java.util.List;

public class Smartphone implements Browsable, Callable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {
        StringBuilder string = new StringBuilder();


        for (String number : numbers) {

            if (validateNumber(number)) {
                string.append("Calling... ").append(number)
                        .append(System.lineSeparator());

            } else {
                string.append("Invalid number!");
            }
        }


        return string.toString();
    }


    @Override
    public String browse() {
        StringBuilder stringBuilder = new StringBuilder();

        for (String url : urls) {
            if (validateUrl(url)) {

                stringBuilder.append("Browsing: ").append(url)
                        .append(System.lineSeparator());

            } else {
                stringBuilder.append("Invalid URL!");
            }
        }


        return stringBuilder.toString();
    }

    private boolean validateUrl(String url) {

        for (char c : url.toCharArray()) {
            if (Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

    private boolean validateNumber(String number) {
        for (char c : number.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }
}
