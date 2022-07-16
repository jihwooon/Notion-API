//TODO : Upbit에서 제공해주는 API  마켓 코드 조회 호출해오기
// RestTemples 통해 호출해오기
package project.upbits.markets.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.upbits.markets.client.UpBitMarketClient;
import project.upbits.markets.dto.UpBitIsDetailsResponse;
import project.upbits.markets.dto.UpBitResponse;
import project.upbits.markets.dto.UpBitTickResponse;
import project.upbits.markets.client.UpBitTickClient;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/exchange")
public class UpBitController {

    private final UpBitMarketClient upBitMarketClient;
    private final UpBitTickClient upBitTickClient;

    @GetMapping("/markets")
    public List<UpBitResponse> getList() {

        return upBitMarketClient.findAll();
    }

    @GetMapping("/markets/{isDetails}")
    public List<UpBitIsDetailsResponse> getIsDetails(@PathVariable boolean isDetails) {

        return upBitMarketClient.findByIsBoolean(isDetails);
    }

    @GetMapping("/tickers/{ticker}")
    public UpBitTickResponse getListTicks(@PathVariable String ticker) {

        return upBitTickClient.getListUpBitTick(ticker).get(0);
    }

}
