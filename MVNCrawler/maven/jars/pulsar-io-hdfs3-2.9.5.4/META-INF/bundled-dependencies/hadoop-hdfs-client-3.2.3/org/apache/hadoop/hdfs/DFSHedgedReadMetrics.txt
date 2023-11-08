Compiled from "DFSHedgedReadMetrics.java"
public class org.apache.hadoop.hdfs.DFSHedgedReadMetrics {
  public final java.util.concurrent.atomic.AtomicLong hedgedReadOps;

  public final java.util.concurrent.atomic.AtomicLong hedgedReadOpsWin;

  public final java.util.concurrent.atomic.AtomicLong hedgedReadOpsInCurThread;

  public org.apache.hadoop.hdfs.DFSHedgedReadMetrics();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #2                  // class java/util/concurrent/atomic/AtomicLong
       8: dup
       9: invokespecial #3                  // Method java/util/concurrent/atomic/AtomicLong."<init>":()V
      12: putfield      #4                  // Field hedgedReadOps:Ljava/util/concurrent/atomic/AtomicLong;
      15: aload_0
      16: new           #2                  // class java/util/concurrent/atomic/AtomicLong
      19: dup
      20: invokespecial #3                  // Method java/util/concurrent/atomic/AtomicLong."<init>":()V
      23: putfield      #5                  // Field hedgedReadOpsWin:Ljava/util/concurrent/atomic/AtomicLong;
      26: aload_0
      27: new           #2                  // class java/util/concurrent/atomic/AtomicLong
      30: dup
      31: invokespecial #3                  // Method java/util/concurrent/atomic/AtomicLong."<init>":()V
      34: putfield      #6                  // Field hedgedReadOpsInCurThread:Ljava/util/concurrent/atomic/AtomicLong;
      37: return

  public void incHedgedReadOps();
    Code:
       0: aload_0
       1: getfield      #4                  // Field hedgedReadOps:Ljava/util/concurrent/atomic/AtomicLong;
       4: invokevirtual #7                  // Method java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
       7: pop2
       8: return

  public void incHedgedReadOpsInCurThread();
    Code:
       0: aload_0
       1: getfield      #6                  // Field hedgedReadOpsInCurThread:Ljava/util/concurrent/atomic/AtomicLong;
       4: invokevirtual #7                  // Method java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
       7: pop2
       8: return

  public void incHedgedReadWins();
    Code:
       0: aload_0
       1: getfield      #5                  // Field hedgedReadOpsWin:Ljava/util/concurrent/atomic/AtomicLong;
       4: invokevirtual #7                  // Method java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
       7: pop2
       8: return

  public long getHedgedReadOps();
    Code:
       0: aload_0
       1: getfield      #4                  // Field hedgedReadOps:Ljava/util/concurrent/atomic/AtomicLong;
       4: invokevirtual #8                  // Method java/util/concurrent/atomic/AtomicLong.longValue:()J
       7: lreturn

  public long getHedgedReadOpsInCurThread();
    Code:
       0: aload_0
       1: getfield      #6                  // Field hedgedReadOpsInCurThread:Ljava/util/concurrent/atomic/AtomicLong;
       4: invokevirtual #8                  // Method java/util/concurrent/atomic/AtomicLong.longValue:()J
       7: lreturn

  public long getHedgedReadWins();
    Code:
       0: aload_0
       1: getfield      #5                  // Field hedgedReadOpsWin:Ljava/util/concurrent/atomic/AtomicLong;
       4: invokevirtual #8                  // Method java/util/concurrent/atomic/AtomicLong.longValue:()J
       7: lreturn
}
