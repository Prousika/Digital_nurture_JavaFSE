package mockitoDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ExternalApiTest {

    @Test
    void testArgumentMatching(){
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData(anyString())).thenReturn("Mock Data");
        MyService service = new MyService(mockApi);
        String result = service.fetchData();
        verify(mockApi).getData("India");
        assertEquals("Mock Data",result);
    }
}
