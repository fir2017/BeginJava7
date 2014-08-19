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
<node CREATED="1407592199523" FOLDED="true" ID="ID_1077517048" MODIFIED="1408371894481" POSITION="right" STYLE="bubble" TEXT="using existing class">
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
</html></richcontent>
</node>
</node>
<node CREATED="1407592219120" FOLDED="true" ID="ID_1974189861" MODIFIED="1408382430893" POSITION="right" STYLE="bubble" TEXT="class inheritance">
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
</html></richcontent>
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
</html></richcontent>
</node>
<node CREATED="1408177762809" FOLDED="true" ID="ID_518214033" MODIFIED="1408372196004" TEXT="Inheritance of data member">
<node CREATED="1408178829753" ID="ID_865621556" MODIFIED="1408372053557" TEXT="subclass within the pacakge include base class can inherited data members expect ones declared by private"/>
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
</html></richcontent>
</node>
<node CREATED="1408179708405" ID="ID_511985246" MODIFIED="1408179791771" TEXT="static members inherited will share by all the object of base class and derived class "/>
<node CREATED="1408180416644" ID="ID_1399077420" MODIFIED="1408180427161">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <img src="data_member_inheritance.png" />
  </body>
</html></richcontent>
</node>
<node CREATED="1408180151074" ID="ID_1974463254" MODIFIED="1408372194593" TEXT="Hidden data member: defined a member with the name same to the inherited data member of the base class">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      the hiddened data member of base class can still inherited, and is accessible by using key word &quot;super&quot;(super.value).
    </p>
  </body>
</html></richcontent>
</node>
</node>
<node CREATED="1408180936381" FOLDED="true" ID="ID_324057966" MODIFIED="1408372338188" TEXT="Inheritance of method member">
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
</html></richcontent>
<node CREATED="1408182431554" ID="ID_1150503708" MODIFIED="1408372317456" TEXT="constructor of the base class will called implicit or default when derived class constructor running"/>
</node>
<node CREATED="1408182645725" ID="ID_749723214" MODIFIED="1408182658112">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <img src="method_member_inheritance.png" />
  </body>
</html></richcontent>
</node>
</node>
<node CREATED="1408182545427" FOLDED="true" ID="ID_1418470342" MODIFIED="1408372388107" TEXT="override methods of base class">
<node CREATED="1408182936403" ID="ID_1306875325" MODIFIED="1408183008796" TEXT="declare a method in subclass with the signature identity to the inherited method in base class"/>
<node CREATED="1408183044724" ID="ID_55415162" MODIFIED="1408183125659" TEXT="in derived class, the overrided method access attribute must is equal or less restriction as the method declared in base class"/>
</node>
</node>
<node CREATED="1407592310989" FOLDED="true" ID="ID_163313151" MODIFIED="1408372410043" POSITION="right" STYLE="bubble" TEXT="the @override annotation">
<node CREATED="1408183739257" ID="ID_1290708016" MODIFIED="1408183775786" TEXT="overload: the signature of method different from the method in base class"/>
<node CREATED="1408183780437" ID="ID_148896253" MODIFIED="1408183860025" TEXT="override: redefined the method inherited from base class, so its signature is identical to the one in base class"/>
<node CREATED="1408183869784" ID="ID_1945069923" MODIFIED="1408183959600" TEXT="@override: to make sure that the method declared in derived class is override the method of bsae class, and the error will raise when the signaure of the class is different from any inherited method of base class"/>
</node>
<node CREATED="1407592328273" FOLDED="true" ID="ID_317127975" MODIFIED="1408376569399" POSITION="right" STYLE="bubble" TEXT="Choosing base class access attributes">
<node CREATED="1408375208455" ID="ID_600244305" MODIFIED="1408375321375" TEXT="make the external interface public, and data members private but providing public methods for accessing and manuplation"/>
</node>
<node CREATED="1407592378739" FOLDED="true" ID="ID_644675008" MODIFIED="1408382429117" POSITION="right" STYLE="bubble" TEXT="polymorphism">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      polymorphism work with derived class, that a reference to a derived class object must store in a variable of direct or indirect base class type to make polymorphism work.
    </p>
    <p>
      covariant: the return type of the method in derived class is a subclass of the return type in base class.
    </p>
    <p>
      when method called using a variable of the base class, polymorphism result in the method that is called being selected base on the object that the variable refered to, not the type of the variable.
    </p>
    <p>
      the variable of base class can store reference of any object of derived class. so a variable of Object can store reference of object from any class.
    </p>
  </body>
</html></richcontent>
<node CREATED="1408376572129" ID="ID_1366375078" MODIFIED="1408377941955" TEXT="polymorphism: the ability of a singe variable of a given type can be used to referene objects of different type and to automatically call the method that is specific to the type of object that the varaible reference. "/>
<node CREATED="1408378424545" ID="ID_1657876549" MODIFIED="1408378435208" TEXT="polymorphism work with derived class"/>
<node CREATED="1408378439366" ID="ID_1242727640" MODIFIED="1408378589434" TEXT="the method call for a derived class object must be through a variable of base class type"/>
<node CREATED="1408378596266" ID="ID_1757883152" MODIFIED="1408378627712" TEXT="the method called must defined in derived class"/>
<node CREATED="1408378654707" ID="ID_1350955315" MODIFIED="1408378684909" TEXT="the method called must declared in base class"/>
<node CREATED="1408378630817" ID="ID_162622700" MODIFIED="1408378793492" TEXT="the signature of method in derived class must be the same to the one in base class"/>
<node CREATED="1408378843410" ID="ID_1579238311" MODIFIED="1408378921163" TEXT="either the return type of method is same in derived class and base class or is covariant"/>
<node CREATED="1408378924906" ID="ID_1383000037" MODIFIED="1408379090803" TEXT="the specified access of the method must be no more restrictive  in derived class than base class"/>
<node CREATED="1408379490900" ID="ID_1800634740" MODIFIED="1408379540220" TEXT="polymorphism just can be applied to the method, but not the data member"/>
</node>
<node CREATED="1407592404678" ID="ID_1534782015" MODIFIED="1407592676313" POSITION="right" STYLE="bubble" TEXT="multiple levels of inheritance"/>
<node CREATED="1407592429080" FOLDED="true" ID="ID_827797602" MODIFIED="1408415743775" POSITION="right" STYLE="bubble" TEXT="abstract classes">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      public abstract class classname {
    </p>
    <p>
      &#160;&#160;&#160;&#160;public abstract returntype methodname ( args); // or
    </p>
    <p>
      &#160;&#160;&#160;&#160;abstract public returntype methodname (args); // or
    </p>
    <p>
      }
    </p>
  </body>
</html></richcontent>
<node CREATED="1408382439597" ID="ID_1788461105" MODIFIED="1408382501903" TEXT="abstract class: A class in which one or more method are declared, but not defined, that is the body of the method is omited."/>
<node CREATED="1408382522310" ID="ID_1693729911" MODIFIED="1408382559859" TEXT="The abstract method: the method is declared, but not defined."/>
<node CREATED="1408382569967" ID="ID_1287445362" MODIFIED="1408382645294" TEXT="using abstract to declare the abstract method"/>
<node CREATED="1408383234718" ID="ID_1362016514" MODIFIED="1408383336490" TEXT="a abstract class can not be instantiate, but can be used as type of a variable when declare"/>
<node CREATED="1408383341904" ID="ID_295253111" MODIFIED="1408383367108" TEXT="abstract method can not be private"/>
<node CREATED="1408415617689" ID="ID_634182017" MODIFIED="1408415665584" TEXT="the derived class of a abstract class should implemented all of the abstract method, or the derived class is still an abstract class"/>
</node>
<node CREATED="1407592450338" FOLDED="true" ID="ID_104572223" MODIFIED="1408462787243" POSITION="right" STYLE="bubble" TEXT="the universal superclass">
<node CREATED="1408415749290" ID="ID_1344930471" MODIFIED="1408415760757" TEXT="Object is the supperclass of any class"/>
<node CREATED="1408417741514" ID="ID_1344274497" MODIFIED="1408417770109" TEXT="A variable of object can reference to any type of class"/>
<node CREATED="1408418179262" ID="ID_654543480" MODIFIED="1408418319457">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <img src="Seven_public_method_of_Object.png" />
  </body>
</html></richcontent>
</node>
<node CREATED="1408421777417" ID="ID_1533021105" MODIFIED="1408421791542">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <img src="two_protected_method_of_Object.png" />
  </body>
</html></richcontent>
</node>
<node CREATED="1408418349498" ID="ID_965787321" MODIFIED="1408418400635" TEXT="getclass(), notify(), notifyAll(), wait() are defined as final and so can not overide in the derived class"/>
<node CREATED="1408418584854" ID="ID_525268907" MODIFIED="1408418669893" TEXT="toString method: it is always defined as public, the return of this method default is Classname@hash_of_object"/>
<node CREATED="1408420393967" ID="ID_1668918608" MODIFIED="1408420474499" TEXT="getClass() to determine the type of Object: return Class Object and can use the member method getName() to get the name of the object class"/>
<node CREATED="1408421443662" ID="ID_1793636983" MODIFIED="1408421556571" TEXT="Class was used primarily for JVM, and have no constructor, thus end user can not used directly."/>
<node CREATED="1408421559141" ID="ID_505364725" MODIFIED="1408421618035" TEXT="to get the Class object of a given Class: object.getClass() method and ClassName.class attribute"/>
<node CREATED="1408421801225" FOLDED="true" ID="ID_1021046234" MODIFIED="1408462786227" TEXT="duplicated object">
<node CREATED="1408432184813" ID="ID_287765228" MODIFIED="1408432213130" TEXT="The class implement clonable interface"/>
<node CREATED="1408460877736" ID="ID_60803372" MODIFIED="1408461292689" TEXT="The clone() method clone the object by creating a new object and setting each of fields in the new object to the same value as the corresponding fields in the current object."/>
<node CREATED="1408462405693" ID="ID_744583322" MODIFIED="1408462481107" TEXT="copy constructor should setting the coressponding fields of new object to the same value as in the old one"/>
</node>
</node>
<node CREATED="1407592506916" FOLDED="true" ID="ID_216933815" MODIFIED="1408463459148" POSITION="right" STYLE="bubble" TEXT="methods accept very number of arguments">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      format of using arbitrary number of arguments:
    </p>
    <p>
      <b>Object[any class] ... args </b>
    </p>
    <p>
      <b>&quot;...&quot; </b>indicated the complier that the arguments is vararg
    </p>
    <p>
      <b>Object[class]</b>&#160;indicated the type of args, if using Object to declare the args type, the type of elements of args can be vary.
    </p>
    <p>
      <b>args</b>&#160;is a array object, and the elements stored passed arugments.
    </p>
  </body>
</html>
</richcontent>
<node CREATED="1408462792484" ID="ID_611085814" MODIFIED="1408462898158" TEXT="varargs: method that can accept an an arbitrary number of arguments, and the arguments do not need to be of the same type"/>
</node>
<node CREATED="1407592541713" FOLDED="true" ID="ID_1964534730" MODIFIED="1408467187423" POSITION="right" STYLE="bubble" TEXT="casting objects">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Format to cast object:
    </p>
    <p>
      superclass variableName = (superclass) derived_class_object_variable
    </p>
  </body>
</html>
</richcontent>
<node CREATED="1408464587493" ID="ID_686426615" MODIFIED="1408464732244" TEXT="casting object: transform the object to another type, when the two type of classes are in the same hierarchy of derived class, and one is the superclass of the other"/>
<node CREATED="1408464735743" ID="ID_701202944" MODIFIED="1408465226365" TEXT="The cast superclass type object also maintain all the information of the origin object, and thus can be casted to any class type that was the superclass of the original class. this is mechanism that the polymorphism implement."/>
<node CREATED="1408465062167" ID="ID_311378992" MODIFIED="1408465112048" TEXT="the variable of casted object can only call the method that override by the original class"/>
<node CREATED="1408465257647" ID="ID_1067111543" MODIFIED="1408465357183" TEXT="cast between classes do not in the hierarchy derived class: class constructor where the casted cass object was an argument "/>
<node CREATED="1408465851464" ID="ID_257348209" MODIFIED="1408465959741" TEXT="instanceof operator will return true if the type of the object is of the same type of the right operator(class, or any subclass)"/>
</node>
<node CREATED="1407592568173" ID="ID_92361842" MODIFIED="1407592676311" POSITION="right" STYLE="bubble" TEXT="more on enumberation"/>
<node CREATED="1407592586489" ID="ID_61856660" MODIFIED="1407592676311" POSITION="right" STYLE="bubble" TEXT="designing classes"/>
<node CREATED="1407592602029" ID="ID_134345668" MODIFIED="1407592676310" POSITION="right" STYLE="bubble" TEXT="using the final modifier"/>
<node CREATED="1407592625615" ID="ID_1743051872" MODIFIED="1407592676310" POSITION="right" STYLE="bubble" TEXT="interface"/>
<node CREATED="1407592639455" ID="ID_515488740" MODIFIED="1407592676309" POSITION="right" STYLE="bubble" TEXT="anonymous classes"/>
</node>
</map>
