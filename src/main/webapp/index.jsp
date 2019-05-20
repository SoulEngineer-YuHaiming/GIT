<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Basic DataGrid - jQuery EasyUI Demo</title>
    <link rel="stylesheet" type="text/css" href="/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="/easyui/themes/icon.css">
    <script type="text/javascript" src="/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="/easyui/jquery.easyui.min.js"></script>
</head>
<body>

<table class="easyui-datagrid">
    <thead>
    <tr>
        <th data-options="field:'code'">编码</th>
        <th data-options="field:'name'">名称</th>
        <th data-options="field:'price'">价格</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>001</td><td>名称1</td><td>2323</td>
    </tr>
    <tr>
        <td>002</td><td>名称2</td><td>4612</td>
    </tr>
    </tbody>
</table>
</body>
</html>
