<map version="0.9.0">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1410022841121" ID="ID_1149928149" MODIFIED="1410022864678" TEXT="Writing Files">
<node CREATED="1410022888545" FOLDED="true" ID="ID_769997669" MODIFIED="1410097420796" POSITION="right" STYLE="bubble" TEXT="File I/O Basics">
<node CREATED="1410095690300" ID="ID_1281982049" MODIFIED="1410095776416" TEXT="File: A linear sequence of bytes, the bytes in the file referenced by its offset of the begin of file using the subindex of 0"/>
<node CREATED="1410095779142" ID="ID_818235075" MODIFIED="1410095891357" TEXT="It is need to know the formatted and organization of the meta data to understand the origination and presentation of the file"/>
<node CREATED="1410096123192" ID="ID_976959829" MODIFIED="1410096192497" TEXT="The format of data in file can be recorded or implied in may ways: file name extention, markup languages et al."/>
<node CREATED="1410096969954" ID="ID_1405213065" MODIFIED="1410097001743" TEXT="Random access and sequencial access are the two methods to access file "/>
</node>
<node CREATED="1410022935581" FOLDED="true" ID="ID_802655429" MODIFIED="1410100313868" POSITION="right" STYLE="bubble" TEXT="File Output">
<node CREATED="1410097423080" ID="ID_495197226" MODIFIED="1410100180468" TEXT="Three method for output in Files class">
<node CREATED="1410097437856" ID="ID_627558434" MODIFIED="1410098777207" TEXT="newOutputStream(Path, StandardOutputOptions)"/>
<node CREATED="1410097474690" ID="ID_913075470" MODIFIED="1410100192972" TEXT="newBufferedWriter(Path, Charset, StandardOutputOptions)"/>
<node CREATED="1410097503201" ID="ID_28115175" MODIFIED="1410097515150" TEXT="newByteChannel(Path)"/>
</node>
</node>
<node CREATED="1410022970341" FOLDED="true" ID="ID_579406167" MODIFIED="1410099418377" POSITION="right" STYLE="bubble" TEXT="Writing a File via an OutputStream">
<node CREATED="1410097817576" ID="ID_159286497" MODIFIED="1410098835639" TEXT="The default OutputOption for this method: WRITE, CREATE, TRUNCATE_EXISTING"/>
<node CREATED="1410098841939" ID="ID_1989739963" MODIFIED="1410098867782">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <img src="StandardOutputOptions.png" />
  </body>
</html>
</richcontent>
</node>
<node CREATED="1410098844107" ID="ID_1317800789" MODIFIED="1410098882403">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <img src="StandardOutputOptions-read.png" />
  </body>
</html>
</richcontent>
</node>
<node CREATED="1410099039025" ID="ID_344993484" MODIFIED="1410099090198" TEXT="BufferedOutputStream have methods to write bytes: write(char c); write(char[] chars, offset, length)"/>
<node CREATED="1410099106689" ID="ID_1230310653" MODIFIED="1410099237496" TEXT="BufferedOutputStream have method flush() to explicitly output the buffers to stream"/>
</node>
<node CREATED="1410022999775" FOLDED="true" ID="ID_1368063111" MODIFIED="1410100437034" POSITION="right" STYLE="bubble" TEXT="Writing a File Using Writer">
<node CREATED="1410099365698" ID="ID_1520025009" MODIFIED="1410099400807" TEXT="BufferedWriter object just can write characters to file"/>
<node CREATED="1410100247140" ID="ID_361923879" MODIFIED="1410100308568" TEXT="BufferedWriter have write(String, offset ,length), write(char[], offset, length, write(char),flush, close()"/>
<node CREATED="1410100425796" ID="ID_133923644" MODIFIED="1410100436116">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <img src="BufferdWriter_write_method.png" />
  </body>
</html>
</richcontent>
</node>
</node>
<node CREATED="1410023020789" ID="ID_1642462474" MODIFIED="1410023125648" POSITION="right" STYLE="bubble" TEXT="Buffers">
<node CREATED="1410101797517" ID="ID_1233499531" MODIFIED="1410101827373" TEXT="java.nio.Buffer is the base class for variety buffers"/>
<node CREATED="1410101830478" ID="ID_241227827" MODIFIED="1410101851847" TEXT="all primilary data type have itself buffers, excetp boolean"/>
<node CREATED="1410101855854" ID="ID_693031802" MODIFIED="1410101884601" TEXT="The CharBuffer was the only buffer that can be used to read or write data from or to file"/>
</node>
<node CREATED="1410023034263" ID="ID_1634736675" MODIFIED="1410023128805" POSITION="right" STYLE="bubble" TEXT="Writing a File Using a Channel"/>
<node CREATED="1410023057503" ID="ID_626830264" MODIFIED="1410023131512" POSITION="right" STYLE="bubble" TEXT="File Write Operations"/>
<node CREATED="1410023080677" ID="ID_875558697" MODIFIED="1410023136816" POSITION="right" STYLE="bubble" TEXT="Forcing Data to Be Writing to a Device"/>
</node>
</map>
