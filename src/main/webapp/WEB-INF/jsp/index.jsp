<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js">
</script>
<!DOCTYPE html>
<html>
<head>
    <script>
        $(document).ready(function () {
            $("button").click(function(){
                $.ajax(
                        {
                            type: "post",
                            url: "/news",
                            dataType:"json",
                            contentType:"application/json",
                            date:{"id":24},
                            success: function (data) {
                                $("input").val(data.id);
                            },
                            error: function (XMLHttpRequest, textStatus, errorThrown) {
                                alert(errorThrown);
                            }
                        }
                )
            })
        });
    </script>
</head>
<body>
<button/>
<input/>
</body>
</html>