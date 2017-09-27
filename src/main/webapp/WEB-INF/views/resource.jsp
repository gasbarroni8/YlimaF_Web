<%@page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<jsp:include page="header.jsp"/>
<html>
<body>
<div id="vm" class="resource">
    <input placeholder="输入你想搜索的内容~" v-model="resourceName">
    <button v-on:click.prevent="query">搜索</button>
</div>
<div>

</div>
</body>
<script>
    $(function () {
        var vm = new Vue({
            el: '#vm',
            data: {
                resourceName: "你的名字"
            },
            methods: {
                query: function () {
                    var url = "./query"
                    $.ajax({
                        url: url,
                        method: "POST",
                        data: {
                            resourceName: vm.resourceName
                        },
                        success: function (res) {
                            if (res && res.length > 0) {
                                console.info(res);
                            } else {
                                alert("Not found")
                            }
                        }
                    })
                }
            }
        });
        window.vm = vm;
    })

</script>
</html>
