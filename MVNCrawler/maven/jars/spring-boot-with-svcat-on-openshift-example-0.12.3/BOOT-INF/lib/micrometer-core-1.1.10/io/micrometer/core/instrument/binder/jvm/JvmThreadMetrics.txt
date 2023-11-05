Compiled from "JvmThreadMetrics.java"
public class io.micrometer.core.instrument.binder.jvm.JvmThreadMetrics implements io.micrometer.core.instrument.binder.MeterBinder {
  private final java.lang.Iterable<io.micrometer.core.instrument.Tag> tags;

  public io.micrometer.core.instrument.binder.jvm.JvmThreadMetrics();
    Code:
       0: aload_0
       1: invokestatic  #35                 // Method java/util/Collections.emptyList:()Ljava/util/List;
       4: invokespecial #38                 // Method "<init>":(Ljava/lang/Iterable;)V
       7: return

  public io.micrometer.core.instrument.binder.jvm.JvmThreadMetrics(java.lang.Iterable<io.micrometer.core.instrument.Tag>);
    Code:
       0: aload_0
       1: invokespecial #43                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #45                 // Field tags:Ljava/lang/Iterable;
       9: return

  public void bindTo(io.micrometer.core.instrument.MeterRegistry);
    Code:
       0: invokestatic  #53                 // Method java/lang/management/ManagementFactory.getThreadMXBean:()Ljava/lang/management/ThreadMXBean;
       3: astore_2
       4: ldc           #55                 // String jvm.threads.peak
       6: aload_2
       7: invokedynamic #77,  0             // InvokeDynamic #0:applyAsDouble:()Ljava/util/function/ToDoubleFunction;
      12: invokestatic  #81                 // InterfaceMethod io/micrometer/core/instrument/Gauge.builder:(Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/ToDoubleFunction;)Lio/micrometer/core/instrument/Gauge$Builder;
      15: aload_0
      16: getfield      #45                 // Field tags:Ljava/lang/Iterable;
      19: invokevirtual #84                 // Method io/micrometer/core/instrument/Gauge$Builder.tags:(Ljava/lang/Iterable;)Lio/micrometer/core/instrument/Gauge$Builder;
      22: ldc           #86                 // String The peak live thread count since the Java virtual machine started or peak was reset
      24: invokevirtual #90                 // Method io/micrometer/core/instrument/Gauge$Builder.description:(Ljava/lang/String;)Lio/micrometer/core/instrument/Gauge$Builder;
      27: ldc           #92                 // String threads
      29: invokevirtual #95                 // Method io/micrometer/core/instrument/Gauge$Builder.baseUnit:(Ljava/lang/String;)Lio/micrometer/core/instrument/Gauge$Builder;
      32: aload_1
      33: invokevirtual #99                 // Method io/micrometer/core/instrument/Gauge$Builder.register:(Lio/micrometer/core/instrument/MeterRegistry;)Lio/micrometer/core/instrument/Gauge;
      36: pop
      37: ldc           #101                // String jvm.threads.daemon
      39: aload_2
      40: invokedynamic #106,  0            // InvokeDynamic #1:applyAsDouble:()Ljava/util/function/ToDoubleFunction;
      45: invokestatic  #81                 // InterfaceMethod io/micrometer/core/instrument/Gauge.builder:(Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/ToDoubleFunction;)Lio/micrometer/core/instrument/Gauge$Builder;
      48: aload_0
      49: getfield      #45                 // Field tags:Ljava/lang/Iterable;
      52: invokevirtual #84                 // Method io/micrometer/core/instrument/Gauge$Builder.tags:(Ljava/lang/Iterable;)Lio/micrometer/core/instrument/Gauge$Builder;
      55: ldc           #108                // String The current number of live daemon threads
      57: invokevirtual #90                 // Method io/micrometer/core/instrument/Gauge$Builder.description:(Ljava/lang/String;)Lio/micrometer/core/instrument/Gauge$Builder;
      60: ldc           #92                 // String threads
      62: invokevirtual #95                 // Method io/micrometer/core/instrument/Gauge$Builder.baseUnit:(Ljava/lang/String;)Lio/micrometer/core/instrument/Gauge$Builder;
      65: aload_1
      66: invokevirtual #99                 // Method io/micrometer/core/instrument/Gauge$Builder.register:(Lio/micrometer/core/instrument/MeterRegistry;)Lio/micrometer/core/instrument/Gauge;
      69: pop
      70: ldc           #110                // String jvm.threads.live
      72: aload_2
      73: invokedynamic #115,  0            // InvokeDynamic #2:applyAsDouble:()Ljava/util/function/ToDoubleFunction;
      78: invokestatic  #81                 // InterfaceMethod io/micrometer/core/instrument/Gauge.builder:(Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/ToDoubleFunction;)Lio/micrometer/core/instrument/Gauge$Builder;
      81: aload_0
      82: getfield      #45                 // Field tags:Ljava/lang/Iterable;
      85: invokevirtual #84                 // Method io/micrometer/core/instrument/Gauge$Builder.tags:(Ljava/lang/Iterable;)Lio/micrometer/core/instrument/Gauge$Builder;
      88: ldc           #117                // String The current number of live threads including both daemon and non-daemon threads
      90: invokevirtual #90                 // Method io/micrometer/core/instrument/Gauge$Builder.description:(Ljava/lang/String;)Lio/micrometer/core/instrument/Gauge$Builder;
      93: ldc           #92                 // String threads
      95: invokevirtual #95                 // Method io/micrometer/core/instrument/Gauge$Builder.baseUnit:(Ljava/lang/String;)Lio/micrometer/core/instrument/Gauge$Builder;
      98: aload_1
      99: invokevirtual #99                 // Method io/micrometer/core/instrument/Gauge$Builder.register:(Lio/micrometer/core/instrument/MeterRegistry;)Lio/micrometer/core/instrument/Gauge;
     102: pop
     103: invokestatic  #121                // Method java/lang/Thread$State.values:()[Ljava/lang/Thread$State;
     106: astore_3
     107: aload_3
     108: arraylength
     109: istore        4
     111: iconst_0
     112: istore        5
     114: iload         5
     116: iload         4
     118: if_icmpge     211
     121: aload_3
     122: iload         5
     124: aaload
     125: astore        6
     127: ldc           #127                // String jvm.threads.states
     129: aload_2
     130: aload         6
     132: invokedynamic #135,  0            // InvokeDynamic #3:applyAsDouble:(Ljava/lang/Thread$State;)Ljava/util/function/ToDoubleFunction;
     137: invokestatic  #81                 // InterfaceMethod io/micrometer/core/instrument/Gauge.builder:(Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/ToDoubleFunction;)Lio/micrometer/core/instrument/Gauge$Builder;
     140: aload_0
     141: getfield      #45                 // Field tags:Ljava/lang/Iterable;
     144: iconst_2
     145: anewarray     #137                // class java/lang/String
     148: dup
     149: iconst_0
     150: ldc           #139                // String state
     152: aastore
     153: dup
     154: iconst_1
     155: aload         6
     157: invokestatic  #143                // Method getStateTagValue:(Ljava/lang/Thread$State;)Ljava/lang/String;
     160: aastore
     161: invokestatic  #149                // Method io/micrometer/core/instrument/Tags.concat:(Ljava/lang/Iterable;[Ljava/lang/String;)Lio/micrometer/core/instrument/Tags;
     164: invokevirtual #84                 // Method io/micrometer/core/instrument/Gauge$Builder.tags:(Ljava/lang/Iterable;)Lio/micrometer/core/instrument/Gauge$Builder;
     167: new           #151                // class java/lang/StringBuilder
     170: dup
     171: invokespecial #152                // Method java/lang/StringBuilder."<init>":()V
     174: ldc           #154                // String The current number of threads having
     176: invokevirtual #158                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     179: aload         6
     181: invokevirtual #161                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     184: ldc           #163                // String  state
     186: invokevirtual #158                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     189: invokevirtual #167                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     192: invokevirtual #90                 // Method io/micrometer/core/instrument/Gauge$Builder.description:(Ljava/lang/String;)Lio/micrometer/core/instrument/Gauge$Builder;
     195: ldc           #92                 // String threads
     197: invokevirtual #95                 // Method io/micrometer/core/instrument/Gauge$Builder.baseUnit:(Ljava/lang/String;)Lio/micrometer/core/instrument/Gauge$Builder;
     200: aload_1
     201: invokevirtual #99                 // Method io/micrometer/core/instrument/Gauge$Builder.register:(Lio/micrometer/core/instrument/MeterRegistry;)Lio/micrometer/core/instrument/Gauge;
     204: pop
     205: iinc          5, 1
     208: goto          114
     211: return

  static long getThreadStateCount(java.lang.management.ThreadMXBean, java.lang.Thread$State);
    Code:
       0: aload_0
       1: aload_0
       2: invokeinterface #178,  1          // InterfaceMethod java/lang/management/ThreadMXBean.getAllThreadIds:()[J
       7: invokeinterface #182,  2          // InterfaceMethod java/lang/management/ThreadMXBean.getThreadInfo:([J)[Ljava/lang/management/ThreadInfo;
      12: invokestatic  #188                // Method java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
      15: aload_1
      16: invokedynamic #201,  0            // InvokeDynamic #4:test:(Ljava/lang/Thread$State;)Ljava/util/function/Predicate;
      21: invokeinterface #207,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
      26: invokeinterface #211,  1          // InterfaceMethod java/util/stream/Stream.count:()J
      31: lreturn

  private static java.lang.String getStateTagValue(java.lang.Thread$State);
    Code:
       0: aload_0
       1: invokevirtual #214                // Method java/lang/Thread$State.name:()Ljava/lang/String;
       4: invokevirtual #217                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
       7: ldc           #219                // String _
       9: ldc           #221                // String -
      11: invokevirtual #225                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      14: areturn

  private static boolean lambda$getThreadStateCount$1(java.lang.Thread$State, java.lang.management.ThreadInfo);
    Code:
       0: aload_1
       1: ifnull        16
       4: aload_1
       5: invokevirtual #231                // Method java/lang/management/ThreadInfo.getThreadState:()Ljava/lang/Thread$State;
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
       2: invokestatic  #235                // Method getThreadStateCount:(Ljava/lang/management/ThreadMXBean;Ljava/lang/Thread$State;)J
       5: l2d
       6: dreturn
}
