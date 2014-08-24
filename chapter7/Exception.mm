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
</html>
</richcontent>
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
</html>
</richcontent>
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
</html>
</richcontent>
</node>
</node>
<node CREATED="1408846706340" ID="ID_371460507" MODIFIED="1408892445757" POSITION="right" STYLE="bubble" TEXT="Dealing with exceptions">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      So, what is a error or runtimeException? how to know ?
    </p>
  </body>
</html>
</richcontent>
<node CREATED="1408879700603" ID="ID_19645370" MODIFIED="1408879878348" TEXT="Exception, which is not Error or runtimException type, it can be deal with within the code of method, or can be ignore and throwed to the code involved the method contain the exception"/>
<node CREATED="1408890122247" ID="ID_551366534" MODIFIED="1408890284118" TEXT="To make a method throwable, just add the keyword throw and exception lists separated by commas adhere to the method signature"/>
<node CREATED="1408890369886" ID="ID_1222561982" MODIFIED="1408890520942" TEXT="The method, invoking the method defined as throwable, should be defined as throwable or contain code to handle exception "/>
<node CREATED="1408890566872" ID="ID_1134297143" MODIFIED="1408892520139" TEXT="Handing exception">
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
</html>
</richcontent>
</node>
<node CREATED="1408891901584" ID="ID_1757990822" MODIFIED="1408894952755" TEXT="catch block enclosed codes to handle exceptions of a particular type that may thrown by the associated try block, must immediately follow the try code block"/>
<node CREATED="1408892194048" ID="ID_793168652" MODIFIED="1408892440271" TEXT="finally block is always execute before method ends"/>
</node>
</node>
<node CREATED="1408846744253" ID="ID_978018226" MODIFIED="1408846776034" POSITION="right" STYLE="bubble" TEXT="Exception objects"/>
<node CREATED="1408846787525" ID="ID_1080854372" MODIFIED="1408846810657" POSITION="right" STYLE="bubble" TEXT="Defining your owner exception"/>
</node>
</map>
