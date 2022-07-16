package project.upbits.candles.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import project.upbits.candles.dto.MonthResponse;

import java.util.List;

@FeignClient(name = "UpBitCandlesMonth", url = "https://api.upbit.com/v1/candles/months")
public interface UpBitCandlesMonthClient {

    @RequestMapping(method = RequestMethod.GET)
    List<MonthResponse> getMonthList(@RequestParam(value = "market") String market);
}
