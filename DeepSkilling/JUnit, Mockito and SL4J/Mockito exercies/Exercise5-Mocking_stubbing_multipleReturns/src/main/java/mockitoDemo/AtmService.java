package mockitoDemo;

public class AtmService {

    private AtmServer server;

    public AtmService(AtmServer server) {
        this.server = server;
    }

    public String checkStatus() {

        return server.getTransactionStatus();
    }

}
