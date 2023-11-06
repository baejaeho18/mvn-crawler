Compiled from "ThreadMetadata.java"
public class org.apache.kafka.streams.processor.ThreadMetadata {
  private final java.lang.String threadName;

  private final java.lang.String threadState;

  private final java.util.Set<org.apache.kafka.streams.processor.TaskMetadata> activeTasks;

  private final java.util.Set<org.apache.kafka.streams.processor.TaskMetadata> standbyTasks;

  private final java.lang.String mainConsumerClientId;

  private final java.lang.String restoreConsumerClientId;

  private final java.util.Set<java.lang.String> producerClientIds;

  private final java.lang.String adminClientId;

  public org.apache.kafka.streams.processor.ThreadMetadata(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Set<java.lang.String>, java.lang.String, java.util.Set<org.apache.kafka.streams.processor.TaskMetadata>, java.util.Set<org.apache.kafka.streams.processor.TaskMetadata>);
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_3
       6: putfield      #2                  // Field mainConsumerClientId:Ljava/lang/String;
       9: aload_0
      10: aload         4
      12: putfield      #3                  // Field restoreConsumerClientId:Ljava/lang/String;
      15: aload_0
      16: aload         5
      18: putfield      #4                  // Field producerClientIds:Ljava/util/Set;
      21: aload_0
      22: aload         6
      24: putfield      #5                  // Field adminClientId:Ljava/lang/String;
      27: aload_0
      28: aload_1
      29: putfield      #6                  // Field threadName:Ljava/lang/String;
      32: aload_0
      33: aload_2
      34: putfield      #7                  // Field threadState:Ljava/lang/String;
      37: aload_0
      38: aload         7
      40: invokestatic  #8                  // Method java/util/Collections.unmodifiableSet:(Ljava/util/Set;)Ljava/util/Set;
      43: putfield      #9                  // Field activeTasks:Ljava/util/Set;
      46: aload_0
      47: aload         8
      49: invokestatic  #8                  // Method java/util/Collections.unmodifiableSet:(Ljava/util/Set;)Ljava/util/Set;
      52: putfield      #10                 // Field standbyTasks:Ljava/util/Set;
      55: return

  public java.lang.String threadState();
    Code:
       0: aload_0
       1: getfield      #7                  // Field threadState:Ljava/lang/String;
       4: areturn

  public java.lang.String threadName();
    Code:
       0: aload_0
       1: getfield      #6                  // Field threadName:Ljava/lang/String;
       4: areturn

  public java.util.Set<org.apache.kafka.streams.processor.TaskMetadata> activeTasks();
    Code:
       0: aload_0
       1: getfield      #9                  // Field activeTasks:Ljava/util/Set;
       4: areturn

  public java.util.Set<org.apache.kafka.streams.processor.TaskMetadata> standbyTasks();
    Code:
       0: aload_0
       1: getfield      #10                 // Field standbyTasks:Ljava/util/Set;
       4: areturn

  public java.lang.String consumerClientId();
    Code:
       0: aload_0
       1: getfield      #2                  // Field mainConsumerClientId:Ljava/lang/String;
       4: areturn

  public java.lang.String restoreConsumerClientId();
    Code:
       0: aload_0
       1: getfield      #3                  // Field restoreConsumerClientId:Ljava/lang/String;
       4: areturn

  public java.util.Set<java.lang.String> producerClientIds();
    Code:
       0: aload_0
       1: getfield      #4                  // Field producerClientIds:Ljava/util/Set;
       4: areturn

  public java.lang.String adminClientId();
    Code:
       0: aload_0
       1: getfield      #5                  // Field adminClientId:Ljava/lang/String;
       4: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: ifnull        22
      11: aload_0
      12: invokevirtual #11                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      15: aload_1
      16: invokevirtual #11                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      19: if_acmpeq     24
      22: iconst_0
      23: ireturn
      24: aload_1
      25: checkcast     #12                 // class org/apache/kafka/streams/processor/ThreadMetadata
      28: astore_2
      29: aload_0
      30: getfield      #6                  // Field threadName:Ljava/lang/String;
      33: aload_2
      34: getfield      #6                  // Field threadName:Ljava/lang/String;
      37: invokestatic  #13                 // Method java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
      40: ifeq          145
      43: aload_0
      44: getfield      #7                  // Field threadState:Ljava/lang/String;
      47: aload_2
      48: getfield      #7                  // Field threadState:Ljava/lang/String;
      51: invokestatic  #13                 // Method java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
      54: ifeq          145
      57: aload_0
      58: getfield      #9                  // Field activeTasks:Ljava/util/Set;
      61: aload_2
      62: getfield      #9                  // Field activeTasks:Ljava/util/Set;
      65: invokestatic  #13                 // Method java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
      68: ifeq          145
      71: aload_0
      72: getfield      #10                 // Field standbyTasks:Ljava/util/Set;
      75: aload_2
      76: getfield      #10                 // Field standbyTasks:Ljava/util/Set;
      79: invokestatic  #13                 // Method java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
      82: ifeq          145
      85: aload_0
      86: getfield      #2                  // Field mainConsumerClientId:Ljava/lang/String;
      89: aload_2
      90: getfield      #2                  // Field mainConsumerClientId:Ljava/lang/String;
      93: invokevirtual #14                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      96: ifeq          145
      99: aload_0
     100: getfield      #3                  // Field restoreConsumerClientId:Ljava/lang/String;
     103: aload_2
     104: getfield      #3                  // Field restoreConsumerClientId:Ljava/lang/String;
     107: invokevirtual #14                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     110: ifeq          145
     113: aload_0
     114: getfield      #4                  // Field producerClientIds:Ljava/util/Set;
     117: aload_2
     118: getfield      #4                  // Field producerClientIds:Ljava/util/Set;
     121: invokestatic  #13                 // Method java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
     124: ifeq          145
     127: aload_0
     128: getfield      #5                  // Field adminClientId:Ljava/lang/String;
     131: aload_2
     132: getfield      #5                  // Field adminClientId:Ljava/lang/String;
     135: invokevirtual #14                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     138: ifeq          145
     141: iconst_1
     142: goto          146
     145: iconst_0
     146: ireturn

  public int hashCode();
    Code:
       0: bipush        8
       2: anewarray     #15                 // class java/lang/Object
       5: dup
       6: iconst_0
       7: aload_0
       8: getfield      #6                  // Field threadName:Ljava/lang/String;
      11: aastore
      12: dup
      13: iconst_1
      14: aload_0
      15: getfield      #7                  // Field threadState:Ljava/lang/String;
      18: aastore
      19: dup
      20: iconst_2
      21: aload_0
      22: getfield      #9                  // Field activeTasks:Ljava/util/Set;
      25: aastore
      26: dup
      27: iconst_3
      28: aload_0
      29: getfield      #10                 // Field standbyTasks:Ljava/util/Set;
      32: aastore
      33: dup
      34: iconst_4
      35: aload_0
      36: getfield      #2                  // Field mainConsumerClientId:Ljava/lang/String;
      39: aastore
      40: dup
      41: iconst_5
      42: aload_0
      43: getfield      #3                  // Field restoreConsumerClientId:Ljava/lang/String;
      46: aastore
      47: dup
      48: bipush        6
      50: aload_0
      51: getfield      #4                  // Field producerClientIds:Ljava/util/Set;
      54: aastore
      55: dup
      56: bipush        7
      58: aload_0
      59: getfield      #5                  // Field adminClientId:Ljava/lang/String;
      62: aastore
      63: invokestatic  #16                 // Method java/util/Objects.hash:([Ljava/lang/Object;)I
      66: ireturn

  public java.lang.String toString();
    Code:
       0: new           #17                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #18                 // Method java/lang/StringBuilder."<init>":()V
       7: ldc           #19                 // String ThreadMetadata{threadName=
       9: invokevirtual #20                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      12: aload_0
      13: getfield      #6                  // Field threadName:Ljava/lang/String;
      16: invokevirtual #20                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      19: ldc           #21                 // String , threadState=
      21: invokevirtual #20                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      24: aload_0
      25: getfield      #7                  // Field threadState:Ljava/lang/String;
      28: invokevirtual #20                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      31: ldc           #22                 // String , activeTasks=
      33: invokevirtual #20                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      36: aload_0
      37: getfield      #9                  // Field activeTasks:Ljava/util/Set;
      40: invokevirtual #23                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      43: ldc           #24                 // String , standbyTasks=
      45: invokevirtual #20                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      48: aload_0
      49: getfield      #10                 // Field standbyTasks:Ljava/util/Set;
      52: invokevirtual #23                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      55: ldc           #25                 // String , consumerClientId=
      57: invokevirtual #20                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      60: aload_0
      61: getfield      #2                  // Field mainConsumerClientId:Ljava/lang/String;
      64: invokevirtual #20                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      67: ldc           #26                 // String , restoreConsumerClientId=
      69: invokevirtual #20                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      72: aload_0
      73: getfield      #3                  // Field restoreConsumerClientId:Ljava/lang/String;
      76: invokevirtual #20                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      79: ldc           #27                 // String , producerClientIds=
      81: invokevirtual #20                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      84: aload_0
      85: getfield      #4                  // Field producerClientIds:Ljava/util/Set;
      88: invokevirtual #23                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      91: ldc           #28                 // String , adminClientId=
      93: invokevirtual #20                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      96: aload_0
      97: getfield      #5                  // Field adminClientId:Ljava/lang/String;
     100: invokevirtual #20                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     103: bipush        125
     105: invokevirtual #29                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
     108: invokevirtual #30                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     111: areturn
}
