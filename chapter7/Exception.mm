<map version="0.9.0">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1408846016039" ID="ID_1706762115" MODIFIED="1408853381979" TEXT="7: exception">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      The Java use exception to indicate problems. It 's used as an mechnism to control the errors where the program raised during its running, by providing debug inormation to help you to figure the what is wrong .
    </p>
  </body>
</html></richcontent>
<node CREATED="1408846043397" FOLDED="true" ID="ID_1608782022" MODIFIED="1408863629330" POSITION="right" STYLE="bubble" TEXT="The Idea behinding exception">
<node CREATED="1408862876354" ID="ID_1542509192" MODIFIED="1408862982260" TEXT="An Exception in JAVA is an objects that created when a abnormal situation condition arised "/>
<node CREATED="1408863007683" ID="ID_1121484681" MODIFIED="1408863271746" TEXT="Using exception to handle abnormal can separate the the code for normal and error conditions, and thus simplify the program, and as while can only handle certen type errors."/>
<node CREATED="1408863277106" ID="ID_1073250072" MODIFIED="1408863320483" TEXT="It&apos;s not all of the exceptions needed to be deal with"/>
<node CREATED="1408863352572" ID="ID_614365377" MODIFIED="1408863406191" TEXT="Exception can be created by JVM, mehods from standard packages or user&apos;s code"/>
<node CREATED="1408863471938" ID="ID_99132047" MODIFIED="1408863627696">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <img src="Exceptions_in_JAVA.png" />
  </body>
</html></richcontent>
</node>
</node>
<node CREATED="1408846692410" FOLDED="true" ID="ID_1592215950" MODIFIED="1408879600211" POSITION="right" STYLE="bubble" TEXT="Types of Exceptions">
<node CREATED="1408865836318" ID="ID_1077075250" MODIFIED="1408865869916" TEXT="Throwable is the base class of all exception"/>
<node CREATED="1408865875134" ID="ID_285702193" MODIFIED="1408866214421" TEXT="Two direct subclass: Error and Exception, Unchecked Exception and Checked exception"/>
<node CREATED="1408865913461" ID="ID_308918272" MODIFIED="1408866238965" TEXT="The error exceptions presented the situation that would not to be catch (unckecked exception): It is nearly impossible to recover from this type of error"/>
<node CREATED="1408866072613" ID="ID_79273025" MODIFIED="1408866307182" TEXT="RuntimeException (checked exception:  need to deal with in code or registry in the method"/>
<node CREATED="1408866355125" ID="ID_1520712882" MODIFIED="1408866611614" TEXT="All execptions thrown by methods in Java class packages are checked "/>
<node CREATED="1408866615175" ID="ID_1288343790" MODIFIED="1408866623748">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <img src="hierarchy_of_Exception.png" />
  </body>
</html></richcontent>
</node>
</node>
<node CREATED="1408846706340" FOLDED="true" ID="ID_371460507" MODIFIED="1408946105138" POSITION="right" STYLE="bubble" TEXT="Dealing with exceptions">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      So, what is a error or runtimeException? how to know ?
    </p>
  </body>
</html></richcontent>
<node CREATED="1408879700603" ID="ID_19645370" MODIFIED="1408879878348" TEXT="Exception, which is not Error or runtimException type, it can be deal with within the code of method, or can be ignore and throwed to the code involved the method contain the exception"/>
<node CREATED="1408890122247" ID="ID_551366534" MODIFIED="1408890284118" TEXT="To make a method throwable, just add the keyword throw and exception lists separated by commas adhere to the method signature"/>
<node CREATED="1408890369886" ID="ID_1222561982" MODIFIED="1408890520942" TEXT="The method, invoking the method defined as throwable, should be defined as throwable or contain code to handle exception "/>
<node CREATED="1408890566872" FOLDED="true" ID="ID_1134297143" MODIFIED="1408944637618" TEXT="Handing exception">
<node CREATED="1408890592630" ID="ID_1779479356" MODIFIED="1408892531262" TEXT="try block enclosed codes that may give rise to exception: Codes that may throw exception, which needed to catch, must be in try block ">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      try {
    </p>
    <p>
      // Code that can throw one or more exceptions
    </p>
    <p>
      }
    </p>
  </body>
</html></richcontent>
</node>
<node CREATED="1408891901584" ID="ID_1757990822" MODIFIED="1408894952755" TEXT="catch block enclosed codes to handle exceptions of a particular type that may thrown by the associated try block, must immediately follow the try code block"/>
<node CREATED="1408892194048" ID="ID_793168652" MODIFIED="1408937179887" TEXT="finally block is always execute before method ends">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      NOTE The primary purpose for the try block is to identify code that may result in an exception being thrown. However, you can use it to contain code that doesn't throw exceptions for the convenience of using a finally block. This can be useful when the code in the try block has several possible exit points &#8212; break or return statements, for example &#8212; but you always want to have a specifi c set of statements executed after the try block has been executed to make sure things are tidied up, such as closing any open fi les. You can put these in a finally block. Note that if a value is returned within a finally block, this return overrides any return statement.
    </p>
    <p>
      executed in the try block.
    </p>
  </body>
</html>
</richcontent>
</node>
<node CREATED="1408933214751" ID="ID_1091557767" MODIFIED="1408933276768" TEXT="The catch block itself is a separate scope from try block"/>
<node CREATED="1408933324176" ID="ID_1620666763" MODIFIED="1408933461059" TEXT="The try and catch block are bonding together, so the statement between try and catch block are not allowed"/>
<node CREATED="1408935914867" ID="ID_1340800529" MODIFIED="1408936333096" TEXT="The exception thrown by the try block, will be catch in the order of the catch blocks, where each catch block will accept the exception that is the same type or subclass of the exception declared in it. And if the exception catched, it will not passed to other catchs."/>
<node CREATED="1408936417603" ID="ID_905062256" MODIFIED="1408936940334" TEXT="It&apos;s also can catch multiple exception in on blocks, just list the exception type and connected by vertical lines">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      try {
    </p>
    <p>
      &#160;&#160;&#160;// Code that can throw exceptions
    </p>
    <p>
      &#160;&#160;&#160;// of type ArithmeticException and ArrayStoreException...
    </p>
    <p>
      } catch(ArithmeticException|ArrayStoreException e) {
    </p>
    <p>
      &#160;&#160;&#160;// Code to handle exception of either type...
    </p>
    <p>
      }
    </p>
  </body>
</html>
</richcontent>
</node>
<node CREATED="1408936945218" ID="ID_1225032662" MODIFIED="1408937016879" TEXT="The finally block is associated with try block and it is immediately follow by catch block or try block (if absent of catch block)"/>
<node CREATED="1408937238347" ID="ID_30670297" MODIFIED="1408937292767" TEXT="Each try block must followed by at least one catch block or try block"/>
<node CREATED="1408937385761" ID="ID_1871220280" MODIFIED="1408937478916">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <img src="Structure_of_Try_Catch_Finally_block.png" />
  </body>
</html>
</richcontent>
</node>
</node>
<node CREATED="1408944654411" FOLDED="true" ID="ID_1728195703" MODIFIED="1408945866754" TEXT="The excution order of try-catch-finally">
<node CREATED="1408944679356" FOLDED="true" ID="ID_966124567" MODIFIED="1408945348242" TEXT="No exception rise: try block -&gt; finally-&gt;code follow the try-catch-finally structure">
<node CREATED="1408944753881" ID="ID_258161955" MODIFIED="1408945346330">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <img src="Norm_excuting_sequence.png" />
  </body>
</html>
</richcontent>
</node>
</node>
<node CREATED="1408944759817" FOLDED="true" ID="ID_523915471" MODIFIED="1408945523280" TEXT="Exceptiion arise: try-&gt;catch-&gt;finally-&gt;code follow the try-catch-finally structure">
<node CREATED="1408945350994" ID="ID_95557574" MODIFIED="1408945361544">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <img src="Exception_excuting_sequence.png" />
  </body>
</html>
</richcontent>
</node>
</node>
<node CREATED="1408945526340" FOLDED="true" ID="ID_1017805414" MODIFIED="1408945865242" TEXT="Exception dose not in try-catch-finally structure: propagate up to each level of of calling method until either it is caught or the main method it reached.">
<node CREATED="1408945853956" ID="ID_1349719820" MODIFIED="1408945863962">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <img src="Exception_absens_from_try_strucute.png" />
  </body>
</html>
</richcontent>
</node>
</node>
</node>
<node CREATED="1408945930610" ID="ID_311175795" MODIFIED="1408945958096" TEXT="Nested try block is allowed"/>
<node CREATED="1408946069765" ID="ID_1854733449" MODIFIED="1408946101952" TEXT="Exception can be throw using keyword throw in catch block."/>
</node>
<node CREATED="1408846744253" FOLDED="true" ID="ID_978018226" MODIFIED="1408961906562" POSITION="right" STYLE="bubble" TEXT="Exception objects">
<node CREATED="1408947385564" FOLDED="true" ID="ID_549407451" MODIFIED="1408961905947" TEXT="The Throwable class">
<node CREATED="1408947410070" FOLDED="true" ID="ID_1328490705" MODIFIED="1408960441697" TEXT="Constructor">
<node CREATED="1408947418028" ID="ID_1798922305" MODIFIED="1408947557469" TEXT="Throwable(): create objects with default message"/>
<node CREATED="1408947461460" ID="ID_1911882526" MODIFIED="1408947564079" TEXT="Throwable(String mesage): create objects with message as message"/>
<node CREATED="1408947502068" ID="ID_1869223796" MODIFIED="1408959550498" TEXT="Throwable(String message, Throwable cause): create objects using message as message and cause as the specified exception. this can  make the chained of exception">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      The cause reference can be obtained by calling getCause() for a Throwable object. This allows exceptions to be chained, so when one exception has been thrown, you can create another exception that provides more information about the problem and record within it a reference to the original exception that caused the new exception to be thrown.
    </p>
  </body>
</html>
</richcontent>
</node>
<node CREATED="1408947645854" ID="ID_888133592" MODIFIED="1408947763669" TEXT="Throwanble(String message, Throwable cause, boolean suppress, boolean stacktrace): create objects as previous, but deliver the exception if supress is true and record stacktrace if stacktrace is true"/>
<node CREATED="1408947767372" ID="ID_262588067" MODIFIED="1408947815289" TEXT="Throwable(Throwable cuase): create objects with default messages and cause as the specified exception"/>
</node>
<node CREATED="1408959572410" FOLDED="true" ID="ID_72628477" MODIFIED="1408960213097" TEXT="Information carried by  Throwable object">
<node CREATED="1408959626322" ID="ID_817666115" MODIFIED="1408959725823" TEXT="Message: refere to the message initialized in construction"/>
<node CREATED="1408959733219" ID="ID_941808872" MODIFIED="1408959761562" TEXT="Throwable object: the cause of exception"/>
<node CREATED="1408959770569" ID="ID_1227835744" MODIFIED="1408960134370" TEXT="stacktrace: keeps track of all the methods that are in execution at any given instant. It include fully qualifi ed name for each of the methods called, plus the line number in the source fi le where each method call occurs, the line number in the source code where&#xa;the exception originates."/>
<node CREATED="1408960140234" ID="ID_240553425" MODIFIED="1408960203512" TEXT="exception supressed: A record of exceptions suppressed in order to deliver this exception"/>
</node>
<node CREATED="1408947822397" FOLDED="true" ID="ID_107411344" MODIFIED="1408961905116" TEXT="methods">
<node CREATED="1408959353690" ID="ID_1115692052" MODIFIED="1408959392913" TEXT="getCause(): return the cause object"/>
<node CREATED="1408960223283" ID="ID_1233521327" MODIFIED="1408960244842" TEXT="getMessages(): return the message information"/>
<node CREATED="1408960256875" ID="ID_1544979020" MODIFIED="1408960338197" TEXT="printStackTrace(): output the message and the stack trace to standard error output"/>
<node CREATED="1408960341074" ID="ID_876693733" MODIFIED="1408960438482" TEXT="printStrackTrace(PrintStream p): same as the above one, but using Printstream instead of standard error output"/>
<node CREATED="1408960554953" FOLDED="true" ID="ID_203804319" MODIFIED="1408961364514" TEXT="getStrackTrace(): return an array of StackTraceElement">
<node CREATED="1408961067516" ID="ID_28655249" MODIFIED="1408961182390" TEXT="getClassName(): return the full qualified name of class containing the exception points of the stack trace entry"/>
<node CREATED="1408961185930" ID="ID_896221666" MODIFIED="1408961245670" TEXT="getFileName(): return the source filename containing the exception point"/>
<node CREATED="1408961251948" ID="ID_1284363729" MODIFIED="1408961282830" TEXT="getLineNumber(): return the line number for the exception point in source file"/>
<node CREATED="1408961289004" ID="ID_536620164" MODIFIED="1408961315006" TEXT="getMethodName(): return the name of method containing the exception point"/>
</node>
<node CREATED="1408961366227" ID="ID_1892509761" MODIFIED="1408961474055" TEXT="fillStackTrace(): update stack address to the point the method called">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      The main use of this is when you want to rethrow an exception (so it is caught by the calling method) and record the point at which it is rethrown. For example:
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
</node>
</node>
<node CREATED="1408846787525" ID="ID_1080854372" MODIFIED="1408846810657" POSITION="right" STYLE="bubble" TEXT="Defining your owner exception">
<node CREATED="1408961912939" ID="ID_229056854" MODIFIED="1408961978246" TEXT="Reason to defined exception: adding more information, distinct from general exception, minimize the exception"/>
<node CREATED="1408961983539" ID="ID_1087281814" MODIFIED="1408962062751" TEXT="it must use Throwable as superclass"/>
</node>
</node>
</map>
