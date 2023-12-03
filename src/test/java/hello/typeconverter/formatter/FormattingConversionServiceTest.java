package hello.typeconverter.formatter;

import hello.typeconverter.converter.IntegerToString;
import hello.typeconverter.converter.StringToIntegerConverter;
import hello.typeconverter.type.IpPort;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;

public class FormattingConversionServiceTest {

    @Test
    void formattingConversionService() {
        DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
        // 컨버터
        conversionService.addConverter(new StringToIntegerConverter());
        conversionService.addConverter(new IntegerToString());

        //포멧터 등록
        conversionService.addFormatter(new MyNumberFormatter());

        //포맷터 사용

      /*  Assertions.assertThat(conversionService.convert("1,000",String.class)).isEqualTo(1000);*/



    }
}
