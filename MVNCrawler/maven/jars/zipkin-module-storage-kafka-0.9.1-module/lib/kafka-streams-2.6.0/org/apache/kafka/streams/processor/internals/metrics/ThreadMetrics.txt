Compiled from "ThreadMetrics.java"
public class org.apache.kafka.streams.processor.internals.metrics.ThreadMetrics {
  private static final java.lang.String COMMIT;

  private static final java.lang.String POLL;

  private static final java.lang.String PROCESS;

  private static final java.lang.String PUNCTUATE;

  private static final java.lang.String CREATE_TASK;

  private static final java.lang.String CLOSE_TASK;

  private static final java.lang.String SKIP_RECORD;

  private static final java.lang.String COMMIT_DESCRIPTION;

  private static final java.lang.String COMMIT_TOTAL_DESCRIPTION;

  private static final java.lang.String COMMIT_RATE_DESCRIPTION;

  private static final java.lang.String COMMIT_AVG_LATENCY_DESCRIPTION;

  private static final java.lang.String COMMIT_MAX_LATENCY_DESCRIPTION;

  private static final java.lang.String CREATE_TASK_DESCRIPTION;

  private static final java.lang.String CREATE_TASK_TOTAL_DESCRIPTION;

  private static final java.lang.String CREATE_TASK_RATE_DESCRIPTION;

  private static final java.lang.String CLOSE_TASK_DESCRIPTION;

  private static final java.lang.String CLOSE_TASK_TOTAL_DESCRIPTION;

  private static final java.lang.String CLOSE_TASK_RATE_DESCRIPTION;

  private static final java.lang.String POLL_DESCRIPTION;

  private static final java.lang.String POLL_TOTAL_DESCRIPTION;

  private static final java.lang.String POLL_RATE_DESCRIPTION;

  private static final java.lang.String POLL_AVG_LATENCY_DESCRIPTION;

  private static final java.lang.String POLL_MAX_LATENCY_DESCRIPTION;

  private static final java.lang.String POLL_AVG_RECORDS_DESCRIPTION;

  private static final java.lang.String POLL_MAX_RECORDS_DESCRIPTION;

  private static final java.lang.String PROCESS_DESCRIPTION;

  private static final java.lang.String PROCESS_TOTAL_DESCRIPTION;

  private static final java.lang.String PROCESS_RATE_DESCRIPTION;

  private static final java.lang.String PROCESS_AVG_LATENCY_DESCRIPTION;

  private static final java.lang.String PROCESS_MAX_LATENCY_DESCRIPTION;

  private static final java.lang.String PROCESS_AVG_RECORDS_DESCRIPTION;

  private static final java.lang.String PROCESS_MAX_RECORDS_DESCRIPTION;

  private static final java.lang.String PUNCTUATE_DESCRIPTION;

  private static final java.lang.String PUNCTUATE_TOTAL_DESCRIPTION;

  private static final java.lang.String PUNCTUATE_RATE_DESCRIPTION;

  private static final java.lang.String PUNCTUATE_AVG_LATENCY_DESCRIPTION;

  private static final java.lang.String PUNCTUATE_MAX_LATENCY_DESCRIPTION;

  private static final java.lang.String SKIP_RECORDS_DESCRIPTION;

  private static final java.lang.String SKIP_RECORD_TOTAL_DESCRIPTION;

  private static final java.lang.String SKIP_RECORD_RATE_DESCRIPTION;

  private static final java.lang.String COMMIT_OVER_TASKS_DESCRIPTION;

  private static final java.lang.String COMMIT_OVER_TASKS_TOTAL_DESCRIPTION;

  private static final java.lang.String COMMIT_OVER_TASKS_RATE_DESCRIPTION;

  private static final java.lang.String PROCESS_RATIO_DESCRIPTION;

  private static final java.lang.String PUNCTUATE_RATIO_DESCRIPTION;

  private static final java.lang.String POLL_RATIO_DESCRIPTION;

  private static final java.lang.String COMMIT_RATIO_DESCRIPTION;

  private org.apache.kafka.streams.processor.internals.metrics.ThreadMetrics();
    Code:
       0: aload_0
       1: invokespecial #3                  // Method java/lang/Object."<init>":()V
       4: return

  public static org.apache.kafka.common.metrics.Sensor createTaskSensor(java.lang.String, org.apache.kafka.streams.processor.internals.metrics.StreamsMetricsImpl);
    Code:
       0: aload_0
       1: ldc           #4                  // String task-created
       3: ldc           #5                  // String The average per-second number of newly created tasks
       5: ldc           #6                  // String The total number of newly created tasks
       7: getstatic     #7                  // Field org/apache/kafka/common/metrics/Sensor$RecordingLevel.INFO:Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;
      10: aload_1
      11: invokestatic  #8                  // Method invocationRateAndCountSensor:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;Lorg/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl;)Lorg/apache/kafka/common/metrics/Sensor;
      14: areturn

  public static org.apache.kafka.common.metrics.Sensor closeTaskSensor(java.lang.String, org.apache.kafka.streams.processor.internals.metrics.StreamsMetricsImpl);
    Code:
       0: aload_0
       1: ldc           #9                  // String task-closed
       3: ldc           #10                 // String The average per-second number of closed tasks
       5: ldc           #11                 // String The total number of closed tasks
       7: getstatic     #7                  // Field org/apache/kafka/common/metrics/Sensor$RecordingLevel.INFO:Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;
      10: aload_1
      11: invokestatic  #8                  // Method invocationRateAndCountSensor:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;Lorg/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl;)Lorg/apache/kafka/common/metrics/Sensor;
      14: areturn

  public static org.apache.kafka.common.metrics.Sensor skipRecordSensor(java.lang.String, org.apache.kafka.streams.processor.internals.metrics.StreamsMetricsImpl);
    Code:
       0: aload_0
       1: ldc           #12                 // String skipped-records
       3: ldc           #13                 // String The average per-second number of skipped records
       5: ldc           #14                 // String The total number of skipped records
       7: getstatic     #7                  // Field org/apache/kafka/common/metrics/Sensor$RecordingLevel.INFO:Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;
      10: aload_1
      11: invokestatic  #8                  // Method invocationRateAndCountSensor:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;Lorg/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl;)Lorg/apache/kafka/common/metrics/Sensor;
      14: areturn

  public static org.apache.kafka.common.metrics.Sensor commitSensor(java.lang.String, org.apache.kafka.streams.processor.internals.metrics.StreamsMetricsImpl);
    Code:
       0: aload_0
       1: ldc           #15                 // String commit
       3: ldc           #16                 // String The average per-second number of calls to commit
       5: ldc           #17                 // String The total number of calls to commit
       7: ldc           #18                 // String The average commit latency
       9: ldc           #19                 // String The maximum commit latency
      11: getstatic     #7                  // Field org/apache/kafka/common/metrics/Sensor$RecordingLevel.INFO:Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;
      14: aload_1
      15: invokestatic  #20                 // Method invocationRateAndCountAndAvgAndMaxLatencySensor:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;Lorg/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl;)Lorg/apache/kafka/common/metrics/Sensor;
      18: areturn

  public static org.apache.kafka.common.metrics.Sensor pollSensor(java.lang.String, org.apache.kafka.streams.processor.internals.metrics.StreamsMetricsImpl);
    Code:
       0: aload_0
       1: ldc           #21                 // String poll
       3: ldc           #22                 // String The average per-second number of calls to poll
       5: ldc           #23                 // String The total number of calls to poll
       7: ldc           #24                 // String The average poll latency
       9: ldc           #25                 // String The maximum poll latency
      11: getstatic     #7                  // Field org/apache/kafka/common/metrics/Sensor$RecordingLevel.INFO:Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;
      14: aload_1
      15: invokestatic  #20                 // Method invocationRateAndCountAndAvgAndMaxLatencySensor:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;Lorg/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl;)Lorg/apache/kafka/common/metrics/Sensor;
      18: areturn

  public static org.apache.kafka.common.metrics.Sensor processLatencySensor(java.lang.String, org.apache.kafka.streams.processor.internals.metrics.StreamsMetricsImpl);
    Code:
       0: aload_1
       1: aload_0
       2: ldc           #26                 // String process-latency
       4: getstatic     #7                  // Field org/apache/kafka/common/metrics/Sensor$RecordingLevel.INFO:Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;
       7: iconst_0
       8: anewarray     #27                 // class org/apache/kafka/common/metrics/Sensor
      11: invokevirtual #28                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.threadLevelSensor:(Ljava/lang/String;Ljava/lang/String;Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;[Lorg/apache/kafka/common/metrics/Sensor;)Lorg/apache/kafka/common/metrics/Sensor;
      14: astore_2
      15: aload_1
      16: aload_0
      17: invokevirtual #29                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.threadLevelTagMap:(Ljava/lang/String;)Ljava/util/Map;
      20: astore_3
      21: aload_1
      22: invokestatic  #30                 // Method threadLevelGroup:(Lorg/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl;)Ljava/lang/String;
      25: astore        4
      27: aload_2
      28: aload         4
      30: aload_3
      31: ldc           #26                 // String process-latency
      33: ldc           #31                 // String The average process latency
      35: ldc           #32                 // String The maximum process latency
      37: invokestatic  #33                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.addAvgAndMaxToSensor:(Lorg/apache/kafka/common/metrics/Sensor;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      40: aload_2
      41: areturn

  public static org.apache.kafka.common.metrics.Sensor pollRecordsSensor(java.lang.String, org.apache.kafka.streams.processor.internals.metrics.StreamsMetricsImpl);
    Code:
       0: aload_1
       1: aload_0
       2: ldc           #34                 // String poll-records
       4: getstatic     #7                  // Field org/apache/kafka/common/metrics/Sensor$RecordingLevel.INFO:Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;
       7: iconst_0
       8: anewarray     #27                 // class org/apache/kafka/common/metrics/Sensor
      11: invokevirtual #28                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.threadLevelSensor:(Ljava/lang/String;Ljava/lang/String;Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;[Lorg/apache/kafka/common/metrics/Sensor;)Lorg/apache/kafka/common/metrics/Sensor;
      14: astore_2
      15: aload_1
      16: aload_0
      17: invokevirtual #29                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.threadLevelTagMap:(Ljava/lang/String;)Ljava/util/Map;
      20: astore_3
      21: aload_1
      22: invokestatic  #30                 // Method threadLevelGroup:(Lorg/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl;)Ljava/lang/String;
      25: astore        4
      27: aload_2
      28: aload         4
      30: aload_3
      31: ldc           #34                 // String poll-records
      33: ldc           #35                 // String The average number of records polled from consumer within an iteration
      35: ldc           #36                 // String The maximum number of records polled from consumer within an iteration
      37: invokestatic  #33                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.addAvgAndMaxToSensor:(Lorg/apache/kafka/common/metrics/Sensor;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      40: aload_2
      41: areturn

  public static org.apache.kafka.common.metrics.Sensor processRecordsSensor(java.lang.String, org.apache.kafka.streams.processor.internals.metrics.StreamsMetricsImpl);
    Code:
       0: aload_1
       1: aload_0
       2: ldc           #37                 // String process-records
       4: getstatic     #7                  // Field org/apache/kafka/common/metrics/Sensor$RecordingLevel.INFO:Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;
       7: iconst_0
       8: anewarray     #27                 // class org/apache/kafka/common/metrics/Sensor
      11: invokevirtual #28                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.threadLevelSensor:(Ljava/lang/String;Ljava/lang/String;Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;[Lorg/apache/kafka/common/metrics/Sensor;)Lorg/apache/kafka/common/metrics/Sensor;
      14: astore_2
      15: aload_1
      16: aload_0
      17: invokevirtual #29                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.threadLevelTagMap:(Ljava/lang/String;)Ljava/util/Map;
      20: astore_3
      21: aload_1
      22: invokestatic  #30                 // Method threadLevelGroup:(Lorg/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl;)Ljava/lang/String;
      25: astore        4
      27: aload_2
      28: aload         4
      30: aload_3
      31: ldc           #37                 // String process-records
      33: ldc           #38                 // String The average number of records processed within an iteration
      35: ldc           #39                 // String The maximum number of records processed within an iteration
      37: invokestatic  #33                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.addAvgAndMaxToSensor:(Lorg/apache/kafka/common/metrics/Sensor;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      40: aload_2
      41: areturn

  public static org.apache.kafka.common.metrics.Sensor processRateSensor(java.lang.String, org.apache.kafka.streams.processor.internals.metrics.StreamsMetricsImpl);
    Code:
       0: aload_1
       1: aload_0
       2: ldc           #40                 // String process-rate
       4: getstatic     #7                  // Field org/apache/kafka/common/metrics/Sensor$RecordingLevel.INFO:Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;
       7: iconst_0
       8: anewarray     #27                 // class org/apache/kafka/common/metrics/Sensor
      11: invokevirtual #28                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.threadLevelSensor:(Ljava/lang/String;Ljava/lang/String;Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;[Lorg/apache/kafka/common/metrics/Sensor;)Lorg/apache/kafka/common/metrics/Sensor;
      14: astore_2
      15: aload_1
      16: aload_0
      17: invokevirtual #29                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.threadLevelTagMap:(Ljava/lang/String;)Ljava/util/Map;
      20: astore_3
      21: aload_1
      22: invokestatic  #30                 // Method threadLevelGroup:(Lorg/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl;)Ljava/lang/String;
      25: astore        4
      27: aload_2
      28: aload         4
      30: aload_3
      31: ldc           #41                 // String process
      33: ldc           #42                 // String The average per-second number of calls to process
      35: ldc           #43                 // String The total number of calls to process
      37: invokestatic  #44                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.addRateOfSumAndSumMetricsToSensor:(Lorg/apache/kafka/common/metrics/Sensor;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      40: aload_2
      41: areturn

  public static org.apache.kafka.common.metrics.Sensor punctuateSensor(java.lang.String, org.apache.kafka.streams.processor.internals.metrics.StreamsMetricsImpl);
    Code:
       0: aload_0
       1: ldc           #45                 // String punctuate
       3: ldc           #46                 // String The average per-second number of calls to punctuate
       5: ldc           #47                 // String The total number of calls to punctuate
       7: ldc           #48                 // String The average punctuate latency
       9: ldc           #49                 // String The maximum punctuate latency
      11: getstatic     #7                  // Field org/apache/kafka/common/metrics/Sensor$RecordingLevel.INFO:Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;
      14: aload_1
      15: invokestatic  #20                 // Method invocationRateAndCountAndAvgAndMaxLatencySensor:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;Lorg/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl;)Lorg/apache/kafka/common/metrics/Sensor;
      18: areturn

  public static org.apache.kafka.common.metrics.Sensor commitOverTasksSensor(java.lang.String, org.apache.kafka.streams.processor.internals.metrics.StreamsMetricsImpl);
    Code:
       0: aload_1
       1: aload_0
       2: ldc           #15                 // String commit
       4: getstatic     #50                 // Field org/apache/kafka/common/metrics/Sensor$RecordingLevel.DEBUG:Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;
       7: iconst_0
       8: anewarray     #27                 // class org/apache/kafka/common/metrics/Sensor
      11: invokevirtual #28                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.threadLevelSensor:(Ljava/lang/String;Ljava/lang/String;Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;[Lorg/apache/kafka/common/metrics/Sensor;)Lorg/apache/kafka/common/metrics/Sensor;
      14: astore_2
      15: aload_1
      16: aload_0
      17: ldc           #51                 // String all
      19: invokevirtual #52                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.taskLevelTagMap:(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
      22: astore_3
      23: aload_2
      24: ldc           #53                 // String stream-task-metrics
      26: aload_3
      27: ldc           #15                 // String commit
      29: ldc           #54                 // String The average per-second number of calls to commit over all tasks assigned to one stream thread
      31: ldc           #55                 // String The total number of calls to commit over all tasks assigned to one stream thread
      33: invokestatic  #56                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.addInvocationRateAndCountToSensor:(Lorg/apache/kafka/common/metrics/Sensor;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      36: aload_2
      37: areturn

  public static org.apache.kafka.common.metrics.Sensor processRatioSensor(java.lang.String, org.apache.kafka.streams.processor.internals.metrics.StreamsMetricsImpl);
    Code:
       0: aload_1
       1: aload_0
       2: ldc           #57                 // String process-ratio
       4: getstatic     #7                  // Field org/apache/kafka/common/metrics/Sensor$RecordingLevel.INFO:Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;
       7: iconst_0
       8: anewarray     #27                 // class org/apache/kafka/common/metrics/Sensor
      11: invokevirtual #28                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.threadLevelSensor:(Ljava/lang/String;Ljava/lang/String;Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;[Lorg/apache/kafka/common/metrics/Sensor;)Lorg/apache/kafka/common/metrics/Sensor;
      14: astore_2
      15: aload_1
      16: aload_0
      17: invokevirtual #29                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.threadLevelTagMap:(Ljava/lang/String;)Ljava/util/Map;
      20: astore_3
      21: aload_2
      22: aload_1
      23: invokestatic  #30                 // Method threadLevelGroup:(Lorg/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl;)Ljava/lang/String;
      26: aload_3
      27: ldc           #57                 // String process-ratio
      29: ldc           #58                 // String The fraction of time the thread spent on processing active tasks
      31: invokestatic  #59                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.addValueMetricToSensor:(Lorg/apache/kafka/common/metrics/Sensor;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
      34: aload_2
      35: areturn

  public static org.apache.kafka.common.metrics.Sensor punctuateRatioSensor(java.lang.String, org.apache.kafka.streams.processor.internals.metrics.StreamsMetricsImpl);
    Code:
       0: aload_1
       1: aload_0
       2: ldc           #60                 // String punctuate-ratio
       4: getstatic     #7                  // Field org/apache/kafka/common/metrics/Sensor$RecordingLevel.INFO:Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;
       7: iconst_0
       8: anewarray     #27                 // class org/apache/kafka/common/metrics/Sensor
      11: invokevirtual #28                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.threadLevelSensor:(Ljava/lang/String;Ljava/lang/String;Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;[Lorg/apache/kafka/common/metrics/Sensor;)Lorg/apache/kafka/common/metrics/Sensor;
      14: astore_2
      15: aload_1
      16: aload_0
      17: invokevirtual #29                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.threadLevelTagMap:(Ljava/lang/String;)Ljava/util/Map;
      20: astore_3
      21: aload_2
      22: aload_1
      23: invokestatic  #30                 // Method threadLevelGroup:(Lorg/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl;)Ljava/lang/String;
      26: aload_3
      27: ldc           #60                 // String punctuate-ratio
      29: ldc           #61                 // String The fraction of time the thread spent on punctuating active tasks
      31: invokestatic  #59                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.addValueMetricToSensor:(Lorg/apache/kafka/common/metrics/Sensor;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
      34: aload_2
      35: areturn

  public static org.apache.kafka.common.metrics.Sensor pollRatioSensor(java.lang.String, org.apache.kafka.streams.processor.internals.metrics.StreamsMetricsImpl);
    Code:
       0: aload_1
       1: aload_0
       2: ldc           #62                 // String poll-ratio
       4: getstatic     #7                  // Field org/apache/kafka/common/metrics/Sensor$RecordingLevel.INFO:Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;
       7: iconst_0
       8: anewarray     #27                 // class org/apache/kafka/common/metrics/Sensor
      11: invokevirtual #28                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.threadLevelSensor:(Ljava/lang/String;Ljava/lang/String;Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;[Lorg/apache/kafka/common/metrics/Sensor;)Lorg/apache/kafka/common/metrics/Sensor;
      14: astore_2
      15: aload_1
      16: aload_0
      17: invokevirtual #29                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.threadLevelTagMap:(Ljava/lang/String;)Ljava/util/Map;
      20: astore_3
      21: aload_2
      22: aload_1
      23: invokestatic  #30                 // Method threadLevelGroup:(Lorg/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl;)Ljava/lang/String;
      26: aload_3
      27: ldc           #62                 // String poll-ratio
      29: ldc           #63                 // String The fraction of time the thread spent on polling records from consumer
      31: invokestatic  #59                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.addValueMetricToSensor:(Lorg/apache/kafka/common/metrics/Sensor;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
      34: aload_2
      35: areturn

  public static org.apache.kafka.common.metrics.Sensor commitRatioSensor(java.lang.String, org.apache.kafka.streams.processor.internals.metrics.StreamsMetricsImpl);
    Code:
       0: aload_1
       1: aload_0
       2: ldc           #64                 // String commit-ratio
       4: getstatic     #7                  // Field org/apache/kafka/common/metrics/Sensor$RecordingLevel.INFO:Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;
       7: iconst_0
       8: anewarray     #27                 // class org/apache/kafka/common/metrics/Sensor
      11: invokevirtual #28                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.threadLevelSensor:(Ljava/lang/String;Ljava/lang/String;Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;[Lorg/apache/kafka/common/metrics/Sensor;)Lorg/apache/kafka/common/metrics/Sensor;
      14: astore_2
      15: aload_1
      16: aload_0
      17: invokevirtual #29                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.threadLevelTagMap:(Ljava/lang/String;)Ljava/util/Map;
      20: astore_3
      21: aload_2
      22: aload_1
      23: invokestatic  #30                 // Method threadLevelGroup:(Lorg/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl;)Ljava/lang/String;
      26: aload_3
      27: ldc           #64                 // String commit-ratio
      29: ldc           #65                 // String The fraction of time the thread spent on committing all tasks
      31: invokestatic  #59                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.addValueMetricToSensor:(Lorg/apache/kafka/common/metrics/Sensor;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
      34: aload_2
      35: areturn

  private static org.apache.kafka.common.metrics.Sensor invocationRateAndCountSensor(java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.apache.kafka.common.metrics.Sensor$RecordingLevel, org.apache.kafka.streams.processor.internals.metrics.StreamsMetricsImpl);
    Code:
       0: aload         5
       2: aload_0
       3: aload_1
       4: aload         4
       6: iconst_0
       7: anewarray     #27                 // class org/apache/kafka/common/metrics/Sensor
      10: invokevirtual #28                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.threadLevelSensor:(Ljava/lang/String;Ljava/lang/String;Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;[Lorg/apache/kafka/common/metrics/Sensor;)Lorg/apache/kafka/common/metrics/Sensor;
      13: astore        6
      15: aload         6
      17: aload         5
      19: invokestatic  #30                 // Method threadLevelGroup:(Lorg/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl;)Ljava/lang/String;
      22: aload         5
      24: aload_0
      25: invokevirtual #29                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.threadLevelTagMap:(Ljava/lang/String;)Ljava/util/Map;
      28: aload_1
      29: aload_2
      30: aload_3
      31: invokestatic  #56                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.addInvocationRateAndCountToSensor:(Lorg/apache/kafka/common/metrics/Sensor;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      34: aload         6
      36: areturn

  private static org.apache.kafka.common.metrics.Sensor invocationRateAndCountAndAvgAndMaxLatencySensor(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.apache.kafka.common.metrics.Sensor$RecordingLevel, org.apache.kafka.streams.processor.internals.metrics.StreamsMetricsImpl);
    Code:
       0: aload         7
       2: aload_0
       3: aload_1
       4: aload         6
       6: iconst_0
       7: anewarray     #27                 // class org/apache/kafka/common/metrics/Sensor
      10: invokevirtual #28                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.threadLevelSensor:(Ljava/lang/String;Ljava/lang/String;Lorg/apache/kafka/common/metrics/Sensor$RecordingLevel;[Lorg/apache/kafka/common/metrics/Sensor;)Lorg/apache/kafka/common/metrics/Sensor;
      13: astore        8
      15: aload         7
      17: aload_0
      18: invokevirtual #29                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.threadLevelTagMap:(Ljava/lang/String;)Ljava/util/Map;
      21: astore        9
      23: aload         7
      25: invokestatic  #30                 // Method threadLevelGroup:(Lorg/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl;)Ljava/lang/String;
      28: astore        10
      30: aload         8
      32: aload         10
      34: aload         9
      36: new           #66                 // class java/lang/StringBuilder
      39: dup
      40: invokespecial #67                 // Method java/lang/StringBuilder."<init>":()V
      43: aload_1
      44: invokevirtual #68                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      47: ldc           #69                 // String -latency
      49: invokevirtual #68                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      52: invokevirtual #70                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      55: aload         4
      57: aload         5
      59: invokestatic  #33                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.addAvgAndMaxToSensor:(Lorg/apache/kafka/common/metrics/Sensor;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      62: aload         8
      64: aload         10
      66: aload         9
      68: aload_1
      69: aload_2
      70: aload_3
      71: invokestatic  #56                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.addInvocationRateAndCountToSensor:(Lorg/apache/kafka/common/metrics/Sensor;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      74: aload         8
      76: areturn

  private static java.lang.String threadLevelGroup(org.apache.kafka.streams.processor.internals.metrics.StreamsMetricsImpl);
    Code:
       0: aload_0
       1: invokevirtual #71                 // Method org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl.version:()Lorg/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl$Version;
       4: getstatic     #72                 // Field org/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl$Version.LATEST:Lorg/apache/kafka/streams/processor/internals/metrics/StreamsMetricsImpl$Version;
       7: if_acmpne     15
      10: ldc           #73                 // String stream-thread-metrics
      12: goto          17
      15: ldc           #74                 // String stream-metrics
      17: areturn
}
