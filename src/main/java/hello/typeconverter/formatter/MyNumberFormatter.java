package hello.typeconverter.formatter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.format.Formatter;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


@Slf4j
public class MyNumberFormatter implements Formatter<Number> { // 문자를 숫자로.
    @Override
    public Number parse(String text, Locale locale) throws ParseException {
        log.info("text={}, locale={}",text, locale);
        //"1,000" -> 1000 이렇게 변환
        NumberFormat format = NumberFormat.getInstance(locale);
        Number parse = format.parse(text);
        return parse;
    }

    @Override
    public String print(Number object, Locale locale) { // 객체를 문자로
        log.info("object={},locale={}",object,locale);
        NumberFormat format = NumberFormat.getInstance(locale);
        String format1 = format.format(object);
        return format1;
    }
}
