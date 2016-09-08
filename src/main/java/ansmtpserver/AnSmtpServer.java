package ansmtpserver;

import org.subethamail.wiser.Wiser;

import com.alexkasko.installer.DaemonLauncher;

public class AnSmtpServer implements DaemonLauncher {

    private Wiser server;

    public AnSmtpServer() {
        super();
        server = new Wiser();
        server.setHostname("javazone");
        server.setPort(2200);
    }

    public void startDaemon() {
        server.start();
    }

    public void stopDaemon() {
        server.stop();
    }

}
