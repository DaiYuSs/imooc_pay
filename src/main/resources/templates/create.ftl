<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>支付</title>
</head>

<body>
<div id="myQrcode"></div>

<script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/jquery.qrcode/1.0/jquery.qrcode.min.js"></script>
<script type="text/javascript">
    $(document).ready(function () {
        $('#myQrcode').qrcode({
            text: "${codeUrl}"
        })
    });
</script>
</body>
</html>