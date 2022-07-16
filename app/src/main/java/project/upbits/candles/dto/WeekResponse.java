package project.upbits.candles.dto;

import lombok.Getter;

@Getter
public class WeekResponse {

    private String market;

    private String candle_date_time_utc;

    private String candle_date_time_kst;


}
