package solutions.practice3.Singleton04_03Soln.com.example;

import practices.practice3.Singleton04_03Prac.com.example.PeerSingleton;

public class Main {
    public static void main(String[] args) {
        PeerSingleton peerList01 = PeerSingleton.getInstance();
        PeerSingleton peerList02 = PeerSingleton.getInstance();

        for(String hostName:peerList01.getHostNames()){
            System.out.println("Host name: " + hostName);
        }

        System.out.println();
        for(String hostName:peerList02.getHostNames()){
            System.out.println("Host name: " + hostName);
        }
    }
}
