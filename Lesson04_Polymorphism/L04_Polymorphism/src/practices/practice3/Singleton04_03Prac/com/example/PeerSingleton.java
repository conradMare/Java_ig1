package practices.practice3.Singleton04_03Prac.com.example;

public final class PeerSingleton {

    private static final String[] hostNames = new String[5];

    static {
        // Read from File
        hostNames[0] = "192.168.1.2";
        hostNames[1] = "192.168.1.4";
        hostNames[2] = "192.168.2.3";
        hostNames[3] = "192.168.2.5";
        hostNames[4] = "192.168.2.14";
    }

    public PeerSingleton() {
    }

    public String[] getHostNames() {
        return hostNames;
    }
}
