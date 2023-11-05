Compiled from "JvmThreadMetrics.java"
public class io.micrometer.core.instrument.binder.jvm.JvmThreadMetrics implements io.micrometer.core.instrument.binder.MeterBinder {
  private final java.lang.Iterable<io.micrometer.core.instrument.Tag> tags;

  public io.micrometer.core.instrument.binder.jvm.JvmThreadMetrics();
    Code:
       0: aload_0
       1: invokestatic  #1                  // Method java/util/Collections.emptyList:()Ljava/util/List;
       4: invokespecial #7                  // Method "<init>":(Ljava/lang/Iterable;)V
       7: return

  public io.micrometer.core.instrument.binder.jvm.JvmThreadMetrics(java.lang.Iterable<io.micrometer.core.instrument.Tag>);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #18                 // Field tags:Ljava/lang/Iterable;
       9: return

  public void bindTo(io.micrometer.core.instrument.MeterRegistry);
    Code:
       0: invokestatic  #22                 // Method java/lang/management/ManagementFactory.getThreadMXBean:()Ljava/lang/management/ThreadMXBean;
       3: astore_2
       4: ldc           #28                 // String jvm.threads.peak
       6: aload_2
       7: invokedynamic #30,  0             // InvokeDynamic #0:applyAsDouble:()Ljava/util/function/ToDoubleFunction;
      12: invokestatic  #34                 // InterfaceMethod io/micrometer/core/instrument/Gauge.builder:(Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/ToDoubleFunction;)Lio/micrometer/core/instrument/Gauge$Builder;
      15: aload_0
      16: getfield      #18                 // Field tags:Ljava/lang/Iterable;
      19: invokevirtual #40                 // Method io/micrometer/core/instrument/Gauge$Builder.tags:(Ljava/lang/Iterable;)Lio/micrometer/core/instrument/Gauge$Builder;
      22: ldc           #45                 // String The peak live thread count since the Java virtual machine started or peak was reset
      24: invokevirtual #47                 // Method io/micrometer/core/instrument/Gauge$Builder.description:(Ljava/lang/String;)Lio/micrometer/core/instrument/Gauge$Builder;
      27: ldc           #53                 // String threads
      29: invokevirtual #55                 // Method io/micrometer/core/instrument/Gauge$Builder.baseUnit:(Ljava/lang/String;)Lio/micrometer/core/instrument/Gauge$Builder;
      32: aload_1
      33: invokevirtual #58                 // Method io/micrometer/core/instrument/Gauge$Builder.register:(Lio/micrometer/core/instrument/MeterRegistry;)Lio/micrometer/core/instrument/Gauge;
      36: pop
      37: ldc           #62                 // String jvm.threads.daemon
      39: aload_2
      40: invokedynamic #64,  0             // InvokeDynamic #1:applyAsDouble:()Ljava/util/function/ToDoubleFunction;
      45: invokestatic  #34                 // InterfaceMethod io/micrometer/core/instrument/Gauge.builder:(Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/ToDoubleFunction;)Lio/micrometer/core/instrument/Gauge$Builder;
      48: aload_0
      49: getfield      #18                 // Field tags:Ljava/lang/Iterable;
      52: invokevirtual #40                 // Method io/micrometer/core/instrument/Gauge$Builder.tags:(Ljava/lang/Iterable;)Lio/micrometer/core/instrument/Gauge$Builder;
      55: ldc           #65                 // String The current number of live daemon threads
      57: invokevirtual #47                 // Method io/micrometer/core/instrument/Gauge$Builder.description:(Ljava/lang/String;)Lio/micrometer/core/instrument/Gauge$Builder;
      60: ldc           #53                 // String threads
      62: invokevirtual #55                 // Method io/micrometer/core/instrument/Gauge$Builder.baseUnit:(Ljava/lang/String;)Lio/micrometer/core/instrument/Gauge$Builder;
      65: aload_1
      66: invokevirtual #58                 // Method io/micrometer/core/instrument/Gauge$Builder.register:(Lio/micrometer/core/instrument/MeterRegistry;)Lio/micrometer/core/instrument/Gauge;
      69: pop
      70: ldc           #67                 // String jvm.threads.live
      72: aload_2
      73: invokedynamic #69,  0             // InvokeDynamic #2:applyAsDouble:()Ljava/util/function/ToDoubleFunction;
      78: invokestatic  #34                 // InterfaceMethod io/micrometer/core/instrument/Gauge.builder:(Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/ToDoubleFunction;)Lio/micrometer/core/instrument/Gauge$Builder;
      81: aload_0
      82: getfield      #18                 // Field tags:Ljava/lang/Iterable;
      85: invokevirtual #40                 // Method io/micrometer/core/instrument/Gauge$Builder.tags:(Ljava/lang/Iterable;)Lio/micrometer/core/instrument/Gauge$Builder;
      88: ldc           #70                 // String The current number of live threads including both daemon and non-daemon threads
      90: invokevirtual #47                 // Method io/micrometer/core/instrument/Gauge$Builder.description:(Ljava/lang/String;)Lio/micrometer/core/instrument/Gauge$Builder;
      93: ldc           #53                 // String threads
      95: invokevirtual #55                 // Method io/micrometer/core/instrument/Gauge$Builder.baseUnit:(Ljava/lang/String;)Lio/micrometer/core/instrument/Gauge$Builder;
      98: aload_1
      99: invokevirtual #58                 // Method io/micrometer/core/instrument/Gauge$Builder.register:(Lio/micrometer/core/instrument/MeterRegistry;)Lio/micrometer/core/instrument/Gauge;
     102: pop
     103: aload_2
     104: invokeinterface #72,  1           // InterfaceMethod java/lang/management/ThreadMXBean.getAllThreadIds:()[J
     109: pop
     110: invokestatic  #78                 // Method java/lang/Thread$State.values:()[Ljava/lang/Thread$State;
     113: astore_3
     114: aload_3
     115: arraylength
     116: istore        4
     118: iconst_0
     119: istore        5
     121: iload         5
     123: iload         4
     125: if_icmpge     218
     128: aload_3
     129: iload         5
     131: aaload
     132: astore        6
     134: ldc           #84                 // String jvm.threads.states
     136: aload_2
     137: aload         6
     139: invokedynamic #86,  0             // InvokeDynamic #3:applyAsDouble:(Ljava/lang/Thread$State;)Ljava/util/function/ToDoubleFunction;
     144: invokestatic  #34                 // InterfaceMethod io/micrometer/core/instrument/Gauge.builder:(Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/ToDoubleFunction;)Lio/micrometer/core/instrument/Gauge$Builder;
     147: aload_0
     148: getfield      #18                 // Field tags:Ljava/lang/Iterable;
     151: iconst_2
     152: anewarray     #89                 // class java/lang/String
     155: dup
     156: iconst_0
     157: ldc           #91                 // String state
     159: aastore
     160: dup
     161: iconst_1
     162: aload         6
     164: invokestatic  #93                 // Method getStateTagValue:(Ljava/lang/Thread$State;)Ljava/lang/String;
     167: aastore
     168: invokestatic  #97                 // Method io/micrometer/core/instrument/Tags.concat:(Ljava/lang/Iterable;[Ljava/lang/String;)Lio/micrometer/core/instrument/Tags;
     171: invokevirtual #40                 // Method io/micrometer/core/instrument/Gauge$Builder.tags:(Ljava/lang/Iterable;)Lio/micrometer/core/instrument/Gauge$Builder;
     174: new           #103                // class java/lang/StringBuilder
     177: dup
     178: invokespecial #105                // Method java/lang/StringBuilder."<init>":()V
     181: ldc           #106                // String The current number of threads having
     183: invokevirtual #108                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     186: aload         6
     188: invokevirtual #112                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     191: ldc           #115                // String  state
     193: invokevirtual #108                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     196: invokevirtual #117                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     199: invokevirtual #47                 // Method io/micrometer/core/instrument/Gauge$Builder.description:(Ljava/lang/String;)Lio/micrometer/core/instrument/Gauge$Builder;
     202: ldc           #53                 // String threads
     204: invokevirtual #55                 // Method io/micrometer/core/instrument/Gauge$Builder.baseUnit:(Ljava/lang/String;)Lio/micrometer/core/instrument/Gauge$Builder;
     207: aload_1
     208: invokevirtual #58                 // Method io/micrometer/core/instrument/Gauge$Builder.register:(Lio/micrometer/core/instrument/MeterRegistry;)Lio/micrometer/core/instrument/Gauge;
     211: pop
     212: iinc          5, 1
     215: goto          121
     218: goto          222
     221: astore_3
     222: return
    Exception table:
       from    to  target type
         103   218   221   Class java/lang/Error

  static long getThreadStateCount(java.lang.management.ThreadMXBean, java.lang.Thread$State);
    Code:
       0: aload_0
       1: aload_0
       2: invokeinterface #72,  1           // InterfaceMethod java/lang/management/ThreadMXBean.getAllThreadIds:()[J
       7: invokeinterface #123,  2          // InterfaceMethod java/lang/management/ThreadMXBean.getThreadInfo:([J)[Ljava/lang/management/ThreadInfo;
      12: invokestatic  #127                // Method java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
      15: aload_1
      16: invokedynamic #133,  0            // InvokeDynamic #4:test:(Ljava/lang/Thread$State;)Ljava/util/function/Predicate;
      21: invokeinterface #137,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
      26: invokeinterface #143,  1          // InterfaceMethod java/util/stream/Stream.count:()J
      31: lreturn

  private static java.lang.String getStateTagValue(java.lang.Thread$State);
    Code:
       0: aload_0
       1: invokevirtual #147                // Method java/lang/Thread$State.name:()Ljava/lang/String;
       4: invokevirtual #150                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
       7: ldc           #153                // String _
       9: ldc           #155                // String -
      11: invokevirtual #157                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      14: areturn

  private static boolean lambda$getThreadStateCount$1(java.lang.Thread$State, java.lang.management.ThreadInfo);
    Code:
       0: aload_1
       1: ifnull        16
       4: aload_1
       5: invokevirtual #161                // Method java/lang/management/ThreadInfo.getThreadState:()Ljava/lang/Thread$State;
       8: aload_0
       9: if_acmpne     16
      12: iconst_1
      13: goto          17
      16: iconst_0
      17: ireturn

  private static double lambda$bindTo$0(java.lang.Thread$State, java.lang.management.ThreadMXBean);
    Code:
       0: aload_1
       1: aload_0
       2: invokestatic  #167                // Method getThreadStateCount:(Ljava/lang/management/ThreadMXBean;Ljava/lang/Thread$State;)J
       5: l2d
       6: dreturn
}
