package project.upbits.candles.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import project.upbits.candles.dto.WeekResponse;

import java.util.List;

@FeignClient(name = "UpBitCandlesWeek", url = "https://api.upbit.com/v1/candles/weeks")
public interface UpBitCandlesWeekClient {

    @RequestMapping(method = RequestMethod.GET)
    List<WeekResponse> getWeekList(@RequestParam(value = "market") String market);
}
