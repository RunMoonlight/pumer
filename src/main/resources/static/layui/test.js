$.ajax({
    url: "/user/reguser",
    type: "POST",
    async: false,
    data:
    success: function(data) {
        debugger;
        if(data.status == 200 && data.msg == "OK") {
            alert("success");
        } else {
            alert("发生异常：" + data.msg);
        }
    },
    error: function (response, ajaxOptions, thrownError) {
        debugger;
        alert("error");
    }
});