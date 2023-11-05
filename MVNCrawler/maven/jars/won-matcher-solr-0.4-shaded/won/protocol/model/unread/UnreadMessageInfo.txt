Compiled from "UnreadMessageInfo.java"
public class won.protocol.model.unread.UnreadMessageInfo {
  private long count;

  private java.util.Date newestTimestamp;

  private java.util.Date oldestTimestamp;

  public won.protocol.model.unread.UnreadMessageInfo(long, java.util.Date, java.util.Date);
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: lload_1
       6: putfield      #2                  // Field count:J
       9: aload_0
      10: aload_3
      11: putfield      #3                  // Field newestTimestamp:Ljava/util/Date;
      14: aload_0
      15: aload         4
      17: putfield      #4                  // Field oldestTimestamp:Ljava/util/Date;
      20: return

  public long getCount();
    Code:
       0: aload_0
       1: getfield      #2                  // Field count:J
       4: lreturn

  public java.util.Date getNewestTimestamp();
    Code:
       0: aload_0
       1: getfield      #3                  // Field newestTimestamp:Ljava/util/Date;
       4: areturn

  public java.util.Date getOldestTimestamp();
    Code:
       0: aload_0
       1: getfield      #4                  // Field oldestTimestamp:Ljava/util/Date;
       4: areturn

  public won.protocol.model.unread.UnreadMessageInfo aggregateWith(won.protocol.model.unread.UnreadMessageInfo);
    Code:
       0: new           #5                  // class won/protocol/model/unread/UnreadMessageInfo
       3: dup
       4: aload_0
       5: getfield      #2                  // Field count:J
       8: aload_1
       9: getfield      #2                  // Field count:J
      12: ladd
      13: aload_0
      14: getfield      #3                  // Field newestTimestamp:Ljava/util/Date;
      17: aload_1
      18: getfield      #3                  // Field newestTimestamp:Ljava/util/Date;
      21: invokevirtual #6                  // Method java/util/Date.after:(Ljava/util/Date;)Z
      24: ifeq          34
      27: aload_0
      28: getfield      #3                  // Field newestTimestamp:Ljava/util/Date;
      31: goto          38
      34: aload_1
      35: getfield      #3                  // Field newestTimestamp:Ljava/util/Date;
      38: aload_0
      39: getfield      #4                  // Field oldestTimestamp:Ljava/util/Date;
      42: aload_1
      43: getfield      #4                  // Field oldestTimestamp:Ljava/util/Date;
      46: invokevirtual #6                  // Method java/util/Date.after:(Ljava/util/Date;)Z
      49: ifeq          59
      52: aload_1
      53: getfield      #4                  // Field oldestTimestamp:Ljava/util/Date;
      56: goto          63
      59: aload_0
      60: getfield      #4                  // Field oldestTimestamp:Ljava/util/Date;
      63: invokespecial #7                  // Method "<init>":(JLjava/util/Date;Ljava/util/Date;)V
      66: areturn

  public won.protocol.model.unread.UnreadMessageInfo clone();
    Code:
       0: new           #5                  // class won/protocol/model/unread/UnreadMessageInfo
       3: dup
       4: aload_0
       5: getfield      #2                  // Field count:J
       8: aload_0
       9: getfield      #3                  // Field newestTimestamp:Ljava/util/Date;
      12: aload_0
      13: getfield      #4                  // Field oldestTimestamp:Ljava/util/Date;
      16: invokespecial #7                  // Method "<init>":(JLjava/util/Date;Ljava/util/Date;)V
      19: areturn

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException;
    Code:
       0: aload_0
       1: invokevirtual #8                  // Method clone:()Lwon/protocol/model/unread/UnreadMessageInfo;
       4: areturn
}
