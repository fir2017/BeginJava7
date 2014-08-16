<map version="0.9.0">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1407591979087" ID="ID_40349216" MODIFIED="1408175205763" TEXT="Extending class and inheritance">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <ul>
      <li>
        &#22522;&#20110;&#24050;&#26377;&#31867;&#23450;&#20041;&#26032;&#31867;&#24182;&#37325;&#29992;
      </li>
      <li>
        &#22810;&#24577;&#20197;&#21450;&#22914;&#20309;&#23450;&#20041;&#31867;&#26469;&#21033;&#29992;&#22810;&#24577;
      </li>
      <li>
        &#25277;&#35937;&#26041;&#27861;
      </li>
      <li>
        &#25277;&#35937;&#31867;
      </li>
      <li>
        &#25509;&#21475;&#20197;&#21450;&#22914;&#20309;&#23450;&#20041;&#33258;&#24049;&#30340;&#25509;&#21475;
      </li>
      <li>
        &#22312;&#31867;&#20013;&#20351;&#29992;&#25509;&#21475;&#30340;&#26041;&#27861;
      </li>
      <li>
        &#20351;&#29992;&#25509;&#21475;&#23454;&#29616;&#22810;&#24577;&#31867;&#30340;&#26041;&#27861;
      </li>
    </ul>
  </body>
</html></richcontent>
<node CREATED="1407592199523" FOLDED="true" ID="ID_1077517048" MODIFIED="1408177650841" POSITION="right" STYLE="bubble" TEXT="using existing class">
<node CREATED="1407593024806" ID="ID_797435119" MODIFIED="1407593085213" TEXT="derivation: define a class base on an existing class"/>
<node CREATED="1407593094214" ID="ID_1960861555" MODIFIED="1407593187244" TEXT="drived class: is the direct subclass  of the class it derived"/>
<node CREATED="1407593192837" ID="ID_1797183316" MODIFIED="1407593230296" TEXT="base class or super class: is the class used to derive other class"/>
<node CREATED="1407593267498" ID="ID_375792004" MODIFIED="1407593368584" TEXT="use extends to define a class base on an existing class">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      class <font color="#e61111">derivedClass</font>&#160;extends <font color="#ee1111">baseClass</font>&#160;{
    </p>
    <p>
      
    </p>
    <p>
      }
    </p>
  </body>
</html></richcontent>
</node>
<node CREATED="1408177565966" ID="ID_1823513889" MODIFIED="1408177578483">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <img src="class_derived_class.png" />
  </body>
</html>
</richcontent>
</node>
</node>
<node CREATED="1407592219120" FOLDED="true" ID="ID_1974189861" MODIFIED="1408183972889" POSITION="right" STYLE="bubble" TEXT="class inheritance">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      &#27599;&#20010;&#23376;&#31867;&#30340;&#23545;&#35937;&#20013;&#37117;&#21253;&#21547;&#20102;&#19968;&#20010;&#23436;&#25972;&#30340;&#36229;&#31867;&#23545;&#35937;&#65292;&#20294;&#24182;&#19981;&#26159;&#25152;&#26377;&#36229;&#31867;&#23545;&#35937;&#30340;&#25104;&#21592;&#37117;&#23545;&#23376;&#31867;&#23545;&#35937;&#21487;&#29992;&#12290;
    </p>
    <p>
      a instance of subclass always have a complete instance of base class, but this is not mean that the instance of subclass can access all members in the instance of base class.
    </p>
  </body>
</html>
</richcontent>
<node CREATED="1408178181300" ID="ID_1739011112" MODIFIED="1408178435863" TEXT="class inheritance: inclusion members of base class in derived class and thus they are accessible in the derived class"/>
<node CREATED="1408178342075" ID="ID_941861087" MODIFIED="1408178725238" TEXT="inherited member:  a member of base class that is accessible within the derived class. They are full member of the derived class">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      the members of base class, which are not inherited by derived class, are still part of the derived class.
    </p>
  </body>
</html>
</richcontent>
</node>
<node CREATED="1408177762809" FOLDED="true" ID="ID_518214033" MODIFIED="1408180430171" TEXT="Inheritance of data member">
<node CREATED="1408178829753" ID="ID_865621556" MODIFIED="1408178928822" TEXT="subclass within the pacakge include base class can inherited data members expect ones defined by private"/>
<node CREATED="1408178935619" ID="ID_186723168" MODIFIED="1408179000415" TEXT="subclass within the package not include the base class inherites data members defiend by public and protect."/>
<node CREATED="1408179008160" ID="ID_1449024722" MODIFIED="1408179703957" TEXT="data members in base class definded by private do not inherited by any type of subclass">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <h1>
      inherited of members from base class from different package
    </h1>
    <table border="0" style="border-bottom-width: 0; width: 80%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 0; border-left-width: 0; border-right-width: 0; border-top-style: solid">
      <tr>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            public defined class
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            no public defined class
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            private
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            no
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            no
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            no access
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            no
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            no
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            protect
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            yes
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            no
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            public
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            yes
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            no
          </p>
        </td>
      </tr>
    </table>
    <h1>
      inherited of members from base class from the same package
    </h1>
    <table border="0" style="border-bottom-width: 0; width: 80%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 0; border-left-width: 0; border-right-width: 0; border-top-style: solid">
      <tr>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            public defined class
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            no public defined class
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            private
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            no
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            no
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            no access
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            yes
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            yes
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            protect
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            yes
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            yes
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            public
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            yes
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 33%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            yes
          </p>
        </td>
      </tr>
    </table>
  </body>
</html>
</richcontent>
</node>
<node CREATED="1408179708405" ID="ID_511985246" MODIFIED="1408179791771" TEXT="static members inherited will share by all the object of base class and derived class "/>
<node CREATED="1408180416644" ID="ID_1399077420" MODIFIED="1408180427161">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <img src="data_member_inheritance.png" />
  </body>
</html>
</richcontent>
</node>
<node CREATED="1408180151074" ID="ID_1974463254" MODIFIED="1408180331556" TEXT="Hidden data member: defined a member with the name same of the inherited data member the base class">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      the hiddened data member of base class can still inherited, and is accessible by using key word &quot;super&quot;(super.value).
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node CREATED="1408180936381" FOLDED="true" ID="ID_324057966" MODIFIED="1408182659446" TEXT="Inheritance of method member">
<node CREATED="1408180950633" ID="ID_305385638" MODIFIED="1408180995675" TEXT="the ruler of inherited of base class is the same as the inherited of data member"/>
<node CREATED="1408181016376" ID="ID_1487300878" MODIFIED="1408181042518" TEXT="contructors do not inherited by derived class"/>
<node CREATED="1408181456975" ID="ID_1258777036" MODIFIED="1408181953626" TEXT="Objects of derived class">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <table border="0" style="border-bottom-width: 0; width: 80%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 0; border-left-width: 0; border-right-width: 0; border-top-style: solid">
      <tr>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            Derived class
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            Inherited method
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            new method
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            base class
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            private
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            Yes
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            no
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            base class
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            no access attribute
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            yes
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            no
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            bsae class
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            protected
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            yes
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            yes
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            base class
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            public
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            yes
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            yes
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            derived class
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            private
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            no
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            yes
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            derived class
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            no access attribute
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            no
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            yes
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            derived class
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            protected
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            no
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            yes
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            derived class
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            public
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            no
          </p>
        </td>
        <td valign="top" style="border-bottom-width: 1; width: 25%; border-left-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-width: 1; border-left-width: 1; border-right-width: 1; border-top-style: solid">
          <p style="margin-bottom: 1; margin-top: 1; margin-left: 1; margin-right: 1">
            yes
          </p>
        </td>
      </tr>
    </table>
  </body>
</html>
</richcontent>
<node CREATED="1408182431554" ID="ID_1150503708" MODIFIED="1408182498673" TEXT="constructor of base class will called implicit or default when derived class constructor running"/>
</node>
<node CREATED="1408182645725" ID="ID_749723214" MODIFIED="1408182658112">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <img src="method_member_inheritance.png" />
  </body>
</html>
</richcontent>
</node>
</node>
<node CREATED="1408182545427" FOLDED="true" ID="ID_1418470342" MODIFIED="1408183166298" TEXT="override methods of base class">
<node CREATED="1408182936403" ID="ID_1306875325" MODIFIED="1408183008796" TEXT="declare a method in subclass with the signature identity to the inherited method in base class"/>
<node CREATED="1408183044724" ID="ID_55415162" MODIFIED="1408183125659" TEXT="in derived class, the overrided method access attribute must is equal or less restriction as the method declared in base class"/>
</node>
</node>
<node CREATED="1407592310989" FOLDED="true" ID="ID_163313151" MODIFIED="1408183974879" POSITION="right" STYLE="bubble" TEXT="the @override annotation">
<node CREATED="1408183739257" ID="ID_1290708016" MODIFIED="1408183775786" TEXT="overload: the signature of method different from the method in base class"/>
<node CREATED="1408183780437" ID="ID_148896253" MODIFIED="1408183860025" TEXT="override: redefined the method inherited from base class, so its signature is identical to the one in base class"/>
<node CREATED="1408183869784" ID="ID_1945069923" MODIFIED="1408183959600" TEXT="@override: to make sure that the method declared in derived class is override the method of bsae class, and the error will raise when the signaure of the class is different from any inherited method of base class"/>
</node>
<node CREATED="1407592328273" ID="ID_317127975" MODIFIED="1407592376019" POSITION="right" STYLE="bubble" TEXT="Choosing base class access attributes"/>
<node CREATED="1407592378739" ID="ID_644675008" MODIFIED="1407592388847" POSITION="right" STYLE="bubble" TEXT="polymorphism"/>
<node CREATED="1407592404678" ID="ID_1534782015" MODIFIED="1407592676313" POSITION="right" STYLE="bubble" TEXT="multiple levels of inheritance"/>
<node CREATED="1407592429080" ID="ID_827797602" MODIFIED="1407592676313" POSITION="right" STYLE="bubble" TEXT="abstract classes"/>
<node CREATED="1407592450338" ID="ID_104572223" MODIFIED="1407592676312" POSITION="right" STYLE="bubble" TEXT="the universal superclass"/>
<node CREATED="1407592506916" ID="ID_216933815" MODIFIED="1407592676312" POSITION="right" STYLE="bubble" TEXT="methods accept very number of arguments"/>
<node CREATED="1407592541713" ID="ID_1964534730" MODIFIED="1407592676312" POSITION="right" STYLE="bubble" TEXT="casting objects"/>
<node CREATED="1407592568173" ID="ID_92361842" MODIFIED="1407592676311" POSITION="right" STYLE="bubble" TEXT="more on enumberation"/>
<node CREATED="1407592586489" ID="ID_61856660" MODIFIED="1407592676311" POSITION="right" STYLE="bubble" TEXT="designing classes"/>
<node CREATED="1407592602029" ID="ID_134345668" MODIFIED="1407592676310" POSITION="right" STYLE="bubble" TEXT="using the final modifier"/>
<node CREATED="1407592625615" ID="ID_1743051872" MODIFIED="1407592676310" POSITION="right" STYLE="bubble" TEXT="interface"/>
<node CREATED="1407592639455" ID="ID_515488740" MODIFIED="1407592676309" POSITION="right" STYLE="bubble" TEXT="anonymous classes"/>
</node>
</map>
