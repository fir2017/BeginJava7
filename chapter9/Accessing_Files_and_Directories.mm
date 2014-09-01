<map version="0.9.0">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1409411443781" ID="ID_1747641127" MODIFIED="1409411464165" TEXT="Accessing Files and Directories">
<node CREATED="1409571804865" FOLDED="true" ID="ID_783893274" MODIFIED="1409578429079" POSITION="right" STYLE="bubble" TEXT="Accessing the File System">
<node CREATED="1409574394170" ID="ID_521089212" MODIFIED="1409574481886" TEXT="factory class FileSystem using getDefault method to create an FileSystem object "/>
<node CREATED="1409574486561" ID="ID_1067282903" MODIFIED="1409574656117" TEXT="FileSystem object encapsulated the file storage system"/>
<node CREATED="1409574665376" ID="ID_1504203363" MODIFIED="1409574982882" TEXT="FileStore object represent the device or partition can be created by FileSystem object&apos;s getFileStore method"/>
<node CREATED="1409574990970" ID="ID_284049845" MODIFIED="1409575142805" TEXT="FileStore object have method to get information such as name, type and total space and unAllocatedSpace "/>
</node>
<node CREATED="1409571808087" FOLDED="true" ID="ID_191206624" MODIFIED="1409579848022" POSITION="right" STYLE="bubble" TEXT="Working with Path Object">
<node CREATED="1409575977659" ID="ID_1012929886" MODIFIED="1409576113748" TEXT="Path object encapsulate a system-depend file path to a file or directory"/>
<node CREATED="1409576121091" ID="ID_759385968" MODIFIED="1409576354850" TEXT="Path object can be created by get() method of Paths or getPath() method of FileSystem object"/>
<node CREATED="1409576361257" ID="ID_738054922" MODIFIED="1409576952775" TEXT="Path object may or may not reference a real file or directory"/>
<node CREATED="1409577453533" ID="ID_786382459" MODIFIED="1409578426220" TEXT="relative path: without drive name or &quot;/&quot;, the get() of Paths or getPath() of FileSystem will use the current director as parent directory"/>
<node CREATED="1409579071366" ID="ID_819132236" MODIFIED="1409579245333" TEXT="System class have methods to getting and setting system properties"/>
<node CREATED="1409579393799" ID="ID_1189334818" MODIFIED="1409579468274" TEXT="Path object has methods to get imformation such as filename, number of splits"/>
<node CREATED="1409579497663" ID="ID_453345648" MODIFIED="1409579653916" TEXT="Files has methods to test the if the file or directory exists or not?"/>
<node CREATED="1409579680863" ID="ID_1495125904" MODIFIED="1409579845922" TEXT="Files.getAttributes() method return Attribute object that contain attributes"/>
</node>
<node CREATED="1409572053727" FOLDED="true" ID="ID_253688074" MODIFIED="1409580024933" POSITION="right" STYLE="bubble" TEXT="Creating and Deleting Directories and Files">
<node CREATED="1409579940925" ID="ID_321522698" MODIFIED="1409579993649" TEXT="Files.createDirectory() and createDirectories() create directory"/>
<node CREATED="1409579996047" ID="ID_486981418" MODIFIED="1409580022645" TEXT="Files.delete() deleted files and directories"/>
</node>
<node CREATED="1409572163375" ID="ID_92406937" MODIFIED="1409572209393" POSITION="right" STYLE="bubble" TEXT="Getting the Contents of a Directories"/>
<node CREATED="1409572212023" ID="ID_701087489" MODIFIED="1409572238589" POSITION="right" STYLE="bubble" TEXT="Closing a Stream"/>
<node CREATED="1409572253335" ID="ID_1753831520" MODIFIED="1409572314951" POSITION="right" STYLE="bubble" TEXT="Moving and Copying Files and Directories"/>
</node>
</map>
