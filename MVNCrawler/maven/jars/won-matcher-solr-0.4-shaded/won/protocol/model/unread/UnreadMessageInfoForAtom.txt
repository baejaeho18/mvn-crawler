Compiled from "UnreadMessageInfoForAtom.java"
public class won.protocol.model.unread.UnreadMessageInfoForAtom {
  private java.net.URI atomURI;

  private won.protocol.model.unread.UnreadMessageInfo unreadMessageInfo;

  private java.util.Map<won.protocol.model.ConnectionState, won.protocol.model.unread.UnreadMessageInfo> unreadInfoByConnectionState;

  private java.util.Collection<won.protocol.model.unread.UnreadMessageInfoForConnection> unreadMessageInfoForConnections;

  public won.protocol.model.unread.UnreadMessageInfoForAtom(java.net.URI);
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #2                  // Field atomURI:Ljava/net/URI;
       9: aload_0
      10: new           #3                  // class java/util/HashMap
      13: dup
      14: invokespecial #4                  // Method java/util/HashMap."<init>":()V
      17: putfield      #5                  // Field unreadInfoByConnectionState:Ljava/util/Map;
      20: aload_0
      21: new           #6                  // class java/util/ArrayList
      24: dup
      25: invokespecial #7                  // Method java/util/ArrayList."<init>":()V
      28: putfield      #8                  // Field unreadMessageInfoForConnections:Ljava/util/Collection;
      31: return

  public void addUnreadMessageInfoForConnection(won.protocol.model.unread.UnreadMessageInfoForConnection);
    Code:
       0: aload_0
       1: getfield      #8                  // Field unreadMessageInfoForConnections:Ljava/util/Collection;
       4: aload_1
       5: invokeinterface #9,  2            // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
      10: pop
      11: aload_0
      12: aload_0
      13: aload_1
      14: invokevirtual #10                 // Method won/protocol/model/unread/UnreadMessageInfoForConnection.getUnreadInformation:()Lwon/protocol/model/unread/UnreadMessageInfo;
      17: aload_0
      18: getfield      #11                 // Field unreadMessageInfo:Lwon/protocol/model/unread/UnreadMessageInfo;
      21: invokespecial #12                 // Method aggregate:(Lwon/protocol/model/unread/UnreadMessageInfo;Lwon/protocol/model/unread/UnreadMessageInfo;)Lwon/protocol/model/unread/UnreadMessageInfo;
      24: putfield      #11                 // Field unreadMessageInfo:Lwon/protocol/model/unread/UnreadMessageInfo;
      27: aload_0
      28: aload_1
      29: invokespecial #13                 // Method aggregateByConnectionState:(Lwon/protocol/model/unread/UnreadMessageInfoForConnection;)V
      32: return

  private void aggregateByConnectionState(won.protocol.model.unread.UnreadMessageInfoForConnection);
    Code:
       0: aload_0
       1: getfield      #5                  // Field unreadInfoByConnectionState:Ljava/util/Map;
       4: aload_1
       5: invokevirtual #14                 // Method won/protocol/model/unread/UnreadMessageInfoForConnection.getConnectionState:()Lwon/protocol/model/ConnectionState;
       8: invokeinterface #15,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      13: checkcast     #16                 // class won/protocol/model/unread/UnreadMessageInfo
      16: astore_2
      17: aload_0
      18: aload_1
      19: invokevirtual #10                 // Method won/protocol/model/unread/UnreadMessageInfoForConnection.getUnreadInformation:()Lwon/protocol/model/unread/UnreadMessageInfo;
      22: aload_2
      23: invokespecial #12                 // Method aggregate:(Lwon/protocol/model/unread/UnreadMessageInfo;Lwon/protocol/model/unread/UnreadMessageInfo;)Lwon/protocol/model/unread/UnreadMessageInfo;
      26: astore_2
      27: aload_0
      28: getfield      #5                  // Field unreadInfoByConnectionState:Ljava/util/Map;
      31: aload_1
      32: invokevirtual #14                 // Method won/protocol/model/unread/UnreadMessageInfoForConnection.getConnectionState:()Lwon/protocol/model/ConnectionState;
      35: aload_2
      36: invokeinterface #17,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      41: pop
      42: return

  private won.protocol.model.unread.UnreadMessageInfo aggregate(won.protocol.model.unread.UnreadMessageInfo, won.protocol.model.unread.UnreadMessageInfo);
    Code:
       0: aload_2
       1: ifnonnull     9
       4: aload_1
       5: invokevirtual #18                 // Method won/protocol/model/unread/UnreadMessageInfo.clone:()Lwon/protocol/model/unread/UnreadMessageInfo;
       8: areturn
       9: aload_2
      10: aload_1
      11: invokevirtual #19                 // Method won/protocol/model/unread/UnreadMessageInfo.aggregateWith:(Lwon/protocol/model/unread/UnreadMessageInfo;)Lwon/protocol/model/unread/UnreadMessageInfo;
      14: areturn

  public java.net.URI getAtomURI();
    Code:
       0: aload_0
       1: getfield      #2                  // Field atomURI:Ljava/net/URI;
       4: areturn

  public java.util.Map<won.protocol.model.ConnectionState, won.protocol.model.unread.UnreadMessageInfo> getUnreadInfoByConnectionState();
    Code:
       0: aload_0
       1: getfield      #5                  // Field unreadInfoByConnectionState:Ljava/util/Map;
       4: areturn

  public java.util.Collection<won.protocol.model.unread.UnreadMessageInfoForConnection> getUnreadMessageInfoForConnections();
    Code:
       0: aload_0
       1: getfield      #8                  // Field unreadMessageInfoForConnections:Ljava/util/Collection;
       4: areturn
}
