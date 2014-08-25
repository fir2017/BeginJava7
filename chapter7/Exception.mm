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
<node CREATED="1408846744253" ID="ID_978018226" MODIFIED="1408846776034" POSITION="right" STYLE="bubble" TEXT="Exception objects"/>
<node CREATED="1408846787525" ID="ID_1080854372" MODIFIED="1408846810657" POSITION="right" STYLE="bubble" TEXT="Defining your owner exception"/>
</node>
</map>
