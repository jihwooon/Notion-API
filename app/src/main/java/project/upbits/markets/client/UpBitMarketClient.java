package project.upbits.markets.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import project.upbits.markets.dto.UpBitIsDetailsResponse;
import project.upbits.markets.dto.UpBitResponse;

import java.util.List;

@FeignClient(name = "UpBitClient", url = "https://api.upbit.com/v1/market/all")
public interface UpBitMarketClient {

    @RequestMapping(method = RequestMethod.GET)
    List<UpBitResponse> findAll();

    @RequestMapping(method = RequestMethod.GET)
    List<UpBitIsDetailsResponse> findByIsBoolean(@RequestParam(value = "isDetails") boolean isDetails);

}
