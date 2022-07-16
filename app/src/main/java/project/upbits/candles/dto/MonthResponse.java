package project.upbits.candles.dto;

import lombok.Getter;

@Getter
public class MonthResponse {

    public String market;
    public String candle_date_time_utc;
    public Double opening_price;
    public Double high_price;
}
