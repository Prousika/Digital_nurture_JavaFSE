package mockitoDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class AtmServiceTest {

    @Test
    void testTransactionStatus(){

        AtmServer server = mock(AtmServer.class);

        when(server.getTransactionStatus())
                .thenReturn(
                        "Processing",
                        "Processing",
                        "Cash Dispensed"
                );
        AtmService service = new AtmService(server);
        assertEquals("Processing",service.checkStatus());
        assertEquals("Processing",service.checkStatus());
        assertEquals(
                "Cash Dispensed",
                service.checkStatus()
        );


    }
}
