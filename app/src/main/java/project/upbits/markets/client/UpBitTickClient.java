package project.upbits.markets.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import project.upbits.markets.dto.UpBitTickResponse;

import java.util.List;

@FeignClient(url = "https://api.upbit.com/v1/ticker", name = "UpBitTickClient")
public interface UpBitTickClient {

    @RequestMapping(method = RequestMethod.GET)
    List<UpBitTickResponse> getListUpBitTick(@RequestParam(value = "markets") String markets);
}
