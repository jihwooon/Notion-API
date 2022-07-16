package project.upbits.client;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import project.upbits.markets.client.UpBitMarketClient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class UpBitMarketClientTest {

    @Autowired
    private UpBitMarketClient upBitMarketClient;
    private Class<? extends UpBitMarketClient> upBitMarketClass;

    @BeforeEach
    void setUp() {
        upBitMarketClass = upBitMarketClient.getClass();
    }

    @Test
    void classAnnotations() {
        assertTrue(upBitMarketClass.isAnnotationPresent(FeignClient.class));
        assertEquals("https://api.upbit.com/v1/market/all",upBitMarketClass.getAnnotation(FeignClient.class).value());

    }

}
