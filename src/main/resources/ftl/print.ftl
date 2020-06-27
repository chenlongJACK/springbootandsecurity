<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
     <title>打印</title>
    <style>
        #app {}
        .nextPage{
            page-break-before:always
        }
        .index {
            /* width: 90%;
            margin: 10px auto; */
            letter-spacing: 5px
        }
        .logo img {
            width: 40px;
            height: 40px;
            margin-right: 10px;
        }

        .logo {
            font-size: 16px;
        }

        .index h3 {
            text-align: center;
            font-size: 26px;
            font-weight: bold;
        }

        .index .topP {
            text-align: right;
            margin-right: 40px;
            font-size: 16px;
            line-height: 30px;
        }

        .index .middle {
            border: 1px solid #000000;
        }

        .index .risk {
            padding: 10px;
            padding-right: 0;
            border-bottom: 1px solid #000000;
        }

        .index .risk p {
            display: flex;
            align-items: center;
            font-size: 16px;
        }

        .index .risk span {
            display: inline-block;
            width: 15%;
            margin-right: 4%;
            height: 30px;
            border: 1px solid #000000;
        }

        .index .info {
            padding: 10px;
            border-bottom: 1px solid #000000;
        }

        .index .info .title {
            text-align: center;
            margin: 10px 0;
            font-size: 20px;
        }

        .index .info table {
            width: 100%;
        }

        .index .info table td {
            width: 33.3%;
            height: 60px;
            line-height: 60px;
            font-size: 16px;
        }

        .index .bottom {
            padding: 10px;
            font-size: 16px;
            display: flex;
            align-items: top;
        }

        .index .bottom div {
            display: inline-block;
            margin-right: 15%;
        }

        .index .bottom div span {
            display: block;
            margin-bottom: 30px;
        }

        .riskTable {
            /* width: 90%;
            margin: 0 auto; */
        }

        .riskTable .title,.auxiliaryExamination .title,.bizExamine2 .title,.bloodSugar .title,.screeningNotice .title,.prenatalDiagnosis .title {
            text-align: center;
            font-size: 22px;
            font-weight: bold;
        }

        .riskTable table,.auxiliaryExamination table,.bizExamine table,.bizExamine2 table,.bloodSugar table {
            width: 100%;
        }

        .riskTable table td,.auxiliaryExamination table td,.bizExamine td,.bizExamine2 td,.bloodSugar td {
            border: 1px solid #000000;
            padding: 3px;
        }

        .riskTable table span {
            display: block;
            line-height: 22px;
        }
        .auxiliaryExamination,.bizExamine{
            /* width: 90%;
            margin: 0 auto; */
        }
        .auxiliaryExamination .top{
            font-size: 18px;
            margin-top: 20px;
        }
        .auxiliaryExamination .top span{
            display: inline-block;
            width: 24%;
        }
        .bizExamine .top{
            font-size: 16px;
            margin-bottom: 10px;
        }
        .bizExamine table .tdFlex span{
            display: inline-block;
            width: 20%;
        }
        .bizExamine table .tdFlex2 span{
            display: inline-block;
            width: 16%;
            line-height: 28px;
        }
        .bizExamine table .tdFlex3 span{
            display: inline-block;
            width: 22%;
            line-height: 28px;
        }
        .bizExamine table .tdFlex4 span{
            display: inline-block;
            width: 30%;
            line-height: 28px;
        }
        .bizExamine table .tdFlex5 span{
            display: inline-block;
            width: 30%;
        }
        .bizExamine table .tdFlex6 span{
            display: inline-block;
            width: 16%;
        }
        .tdTopBor td{
            border-top: none;
        }
        .bizExamine .alignCenter td{
            text-align: center;
        }
        .bizExamine .tdHeight td{
            height: 10px;
        }
        .bizExamine .tdSpan span{
            display: inline-block;
            width: 60px;
            text-indent: 10px;
        }
        .bizExamine .tdSpan td{
            padding: 2px 5px;
        }
        .bizExamine .tdSpan2 span{
            display: inline-block;
            width: 20%;
        }
        .bizExamine2 .tdHeight td{
            height: 20px;
        }
        .bizExamine2{
            letter-spacing: 2px;
        }
        .bloodSugarWaip{
            height: 1026px;
            position: relative;
        }
        .bloodSugar {
            width: 926px;
            position: absolute;
            transform:rotate(-90deg);
            transform-origin: 54% 74%;
        }
        .bloodSugar .top span{
            display: inline-block;
            width: 100px;
            margin-bottom: 10px;
        }
        .bloodSugar td{
            text-align: center;
        }
        .screeningNotice .content,.prenatalDiagnosis .content{
            line-height: 22px;
        }
        .screeningNotice .signature,.prenatalDiagnosis .signature{
            margin-top: 20px;
            text-indent: 20px;
        }
        .screeningNotice .signature span,.prenatalDiagnosis span{
            display: inline-block;
            width: 40px;
        }
        .prenatalDiagnosis .addrs{
            margin-left: 40px;
        }
        .prenatalDiagnosis .contInput{
            width: 50px;
            border: none;
            border-bottom: 1px solid #000000;
        }
        .prenatalDiagnosis .left,.prenatalDiagnosis .right{
            float: left;
        }
        .prenatalDiagnosis .left input{
            width: 20px;
            height: 20px;
            display: inline-block;
        }
        .prenatalDiagnosis .floatCont{
            overflow: hidden;
            margin-top: 10px;
        }
        .prenatalDiagnosis .right{
            margin-left: 20px;
        }
        .prenatalDiagnosis .right input{
            width: 150px;
            border: none;
            border-bottom: 1px solid #000000;
        }
        .bizExamine table span{
            position: relative;
        }
        .bizExamine .tdSpan span.span1{
            width: auto;
            text-indent: 0px;
        }
        .activeSpan::after{
            content: "";
            position: absolute;
            left: 0px;
            top: 5px;
            width: 22px;
            height: 7px;
            border: 2px solid #000;
            border-radius: 1px;
            border-top: none;
            border-right: none;
            background: transparent;
            transform: rotate(-45deg);
        }
        .bizExamine .mspan span{
            display: block;
        }
        .bizExamine .mspan span.activeSpan::after{
            top:-7px;
            left: 4px;
        }
        .bizExamine2Title{
            text-align: center;
            border: 1px solid #000000;
            line-height: 28px;
        }
        .bizExamine2Div {
            border-right: 1px solid #000;
            border-left: 1px solid #000;
        }
        .bizExamine2Div>div>div{
            height: 28px;
            line-height: 28px;
            border-bottom: 1px solid #000000;
            padding-left: 4px;
            padding-right: 4px;
        }
    </style>
</head>

<body>
            ${ds}
         <table border="1">
             <tr>
                 <td>姓名</td>
                 <td>年龄</td>
             </tr>
            <#list personList as person>
             <tr>
                 <td>${person.name}</td>
                 <td>${person.age}</td>
                <#list person.nums as num>
                    ${num}
                </#list>
             </tr>
            </#list>
         </table>
</body>
</html>