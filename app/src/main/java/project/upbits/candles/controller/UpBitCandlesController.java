package project.upbits.candles.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.upbits.candles.client.UpBitCandlesMonthClient;
import project.upbits.candles.client.UpBitCandlesWeekClient;
import project.upbits.candles.dto.MonthResponse;
import project.upbits.candles.dto.WeekResponse;

import java.util.List;

@RestController
@RequestMapping("/candles")
@RequiredArgsConstructor
public class UpBitCandlesController {

    public final UpBitCandlesMonthClient upBitCandlesClient;
    public final UpBitCandlesWeekClient upBitCandlesWeekClient;

    @GetMapping("/month/{market}")
    public List<MonthResponse> getMonth(@PathVariable String market) {
        return upBitCandlesClient.getMonthList(market);
    }

    @GetMapping("/week/{market}")
    public List<WeekResponse> getWeekList(@PathVariable String market) {
        return upBitCandlesWeekClient.getWeekList(market);
    }
}
