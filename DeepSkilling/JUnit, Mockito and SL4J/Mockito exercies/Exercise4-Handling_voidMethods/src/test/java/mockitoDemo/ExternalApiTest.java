package mockitoDemo;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class ExternalApiTest {

    @Test
    void testVoidMethod(){
        ExternalApi mockApi = mock(ExternalApi.class);
        doNothing().when(mockApi).log("Data Saved");
        MyService service = new MyService(mockApi);
        service.saveData();
        verify(mockApi).log("Data Saved");

    }
}
