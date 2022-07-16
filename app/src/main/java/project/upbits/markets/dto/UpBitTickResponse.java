package project.upbits.markets.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class UpBitTickResponse {

    private String market;
    private String trade_date;
    private String trade_time;
    private Double opening_price;
    private Double high_price;
    private Double low_price;

}
