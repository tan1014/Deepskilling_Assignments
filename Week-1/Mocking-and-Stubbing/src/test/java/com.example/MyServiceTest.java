//package com.example;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//
//
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//public class MyServiceTest<MyService> {
//
//    @Test
//    public void testExternalApi() {
//
//        com.example.ExternalApi mockApi = Mockito.mock(com.example.ExternalApi.class);
//
//        when(mockApi.getData()).thenReturn("Mock Data");
//
//        MyService service = new MyService(mockApi);
//
//        String result = service.fetchData();
//
//        assertEquals("Mock Data", result);
//    }
//}