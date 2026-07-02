package mockitoDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyServiceTesr {

    @Test
    void testExternalApi(){

        //mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // stub method
        when(mockApi.getData()).thenReturn("Mock Data");

        //inject mock into service
        MyService service = new MyService(mockApi);

        // call method
        String result = service.fetchData();

        //verify
        assertEquals("Mock Data",result);


    }
}
