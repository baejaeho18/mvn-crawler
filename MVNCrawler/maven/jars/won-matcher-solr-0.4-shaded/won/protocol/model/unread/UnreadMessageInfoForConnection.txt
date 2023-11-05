Compiled from "UnreadMessageInfoForConnection.java"
public class won.protocol.model.unread.UnreadMessageInfoForConnection {
  private won.protocol.model.unread.UnreadMessageInfo unreadInformation;

  private java.net.URI connectionURI;

  private won.protocol.model.ConnectionState connectionState;

  public won.protocol.model.unread.UnreadMessageInfoForConnection(java.net.URI, won.protocol.model.ConnectionState, won.protocol.model.unread.UnreadMessageInfo);
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #2                  // Field connectionURI:Ljava/net/URI;
       9: aload_0
      10: aload_2
      11: putfield      #3                  // Field connectionState:Lwon/protocol/model/ConnectionState;
      14: aload_0
      15: aload_3
      16: putfield      #4                  // Field unreadInformation:Lwon/protocol/model/unread/UnreadMessageInfo;
      19: return

  public won.protocol.model.unread.UnreadMessageInfoForConnection(java.net.URI, won.protocol.model.ConnectionState, long, java.util.Date, java.util.Date);
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #2                  // Field connectionURI:Ljava/net/URI;
       9: aload_0
      10: aload_2
      11: putfield      #3                  // Field connectionState:Lwon/protocol/model/ConnectionState;
      14: aload_0
      15: new           #5                  // class won/protocol/model/unread/UnreadMessageInfo
      18: dup
      19: lload_3
      20: aload         5
      22: aload         6
      24: invokespecial #6                  // Method won/protocol/model/unread/UnreadMessageInfo."<init>":(JLjava/util/Date;Ljava/util/Date;)V
      27: putfield      #4                  // Field unreadInformation:Lwon/protocol/model/unread/UnreadMessageInfo;
      30: return

  public won.protocol.model.unread.UnreadMessageInfo getUnreadInformation();
    Code:
       0: aload_0
       1: getfield      #4                  // Field unreadInformation:Lwon/protocol/model/unread/UnreadMessageInfo;
       4: areturn

  public java.net.URI getConnectionURI();
    Code:
       0: aload_0
       1: getfield      #2                  // Field connectionURI:Ljava/net/URI;
       4: areturn

  public won.protocol.model.ConnectionState getConnectionState();
    Code:
       0: aload_0
       1: getfield      #3                  // Field connectionState:Lwon/protocol/model/ConnectionState;
       4: areturn
}
