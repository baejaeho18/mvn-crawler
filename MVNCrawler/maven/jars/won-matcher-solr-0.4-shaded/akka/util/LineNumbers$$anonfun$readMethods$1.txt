Compiled from "LineNumbers.scala"
public final class akka.util.LineNumbers$$anonfun$readMethods$1 extends scala.runtime.AbstractFunction1$mcVI$sp implements scala.Serializable {
  public static final long serialVersionUID;

  private final java.io.DataInputStream d$3;

  private final akka.util.LineNumbers$Constants c$2;

  public final void apply(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #25                 // Method apply$mcVI$sp:(I)V
       5: return

  public void apply$mcVI$sp(int);
    Code:
       0: getstatic     #33                 // Field akka/util/LineNumbers$.MODULE$:Lakka/util/LineNumbers$;
       3: aload_0
       4: getfield      #35                 // Field d$3:Ljava/io/DataInputStream;
       7: aload_0
       8: getfield      #37                 // Field c$2:Lakka/util/LineNumbers$Constants;
      11: invokevirtual #41                 // Method akka/util/LineNumbers$.akka$util$LineNumbers$$skipMethodOrField:(Ljava/io/DataInputStream;Lakka/util/LineNumbers$Constants;)V
      14: return

  public final java.lang.Object apply(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #48                 // Method scala/runtime/BoxesRunTime.unboxToInt:(Ljava/lang/Object;)I
       5: invokevirtual #50                 // Method apply:(I)V
       8: getstatic     #56                 // Field scala/runtime/BoxedUnit.UNIT:Lscala/runtime/BoxedUnit;
      11: areturn

  public akka.util.LineNumbers$$anonfun$readMethods$1(java.io.DataInputStream, akka.util.LineNumbers$Constants);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #35                 // Field d$3:Ljava/io/DataInputStream;
       5: aload_0
       6: aload_2
       7: putfield      #37                 // Field c$2:Lakka/util/LineNumbers$Constants;
      10: aload_0
      11: invokespecial #62                 // Method scala/runtime/AbstractFunction1$mcVI$sp."<init>":()V
      14: return
}
