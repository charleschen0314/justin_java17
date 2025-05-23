package justin.java17.samples.CH07.Interface.src.cc.openhome;

public class ClientEvent {
  private Client client;

  public ClientEvent(Client client) {
    this.client = client;
  }

  public String getName() {
    return client.name;
  }

  public String getIp() {
    return client.ip;
  }
}
