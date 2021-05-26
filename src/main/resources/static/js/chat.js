/**
 * WebSocket客户端
 *
 * 使用说明：
 * 1、WebSocket客户端通过回调函数来接收服务端消息。例如：webSocket.onmessage
 * 2、WebSocket客户端通过send方法来发送消息给服务端。例如：webSocket.send();
 */
function getWebSocket() {
    /**
     * WebSocket客户端 PS：URL开头表示WebSocket协议 中间是域名端口 结尾是服务端映射地址
     */
    /*
    * http下使用ws://xxx   https下使用wss://xxx
    */
    var protocol = document.location.protocol === 'https:' ? 'wss://localhost:443/ws' : 'ws://localhost:8080/ws';
    var webSocket = new WebSocket(protocol);
    /**
     * 当服务端打开连接
     */
    webSocket.onopen = function(event) {
        console.log('WebSocket打开连接');
    };
    /**
     * 当服务端发来消息：1.广播消息 2.更新在线人数
     */
    webSocket.onmessage = function(event) {
        console.log('WebSocket收到消息：%c' + event.data, 'color:green');
        //获取服务端消息
        var message = JSON.parse(event.data) || {};
        var $messageContainer = $('.message-container');
        //发言
        if (message.type === 'SPEAK') {
            $messageContainer
                .append('<div class="mdui-card" style="margin: 10px 0;">'
                    + '<div class="mdui-card-primary">'
                    + '<div class="mdui-card-content message-content">'
                    + message.username
                    + "："
                    + message.msg
                    + '</div>' + '</div></div>');
        }
        $('.chat-num').text(message.onlineCount);
        //防止刷屏
        var $cards = $messageContainer.children('.mdui-card:visible')
            .toArray();
        if ($cards.length > 5) {
            $cards.forEach(function(item, index) {
                index < $cards.length - 5 && $(item).slideUp('fast');
            });
        }
    };
    /**
     * 关闭连接
     */
    webSocket.onclose = function(event) {
        console.log('WebSocket关闭连接');
    };
    /**
     * 通信失败
     */
    webSocket.onerror = function(event) {
        console.log('WebSocket发生异常');
    };
    return webSocket;
}
var webSocket = getWebSocket();
/**
 * 通过WebSocket对象发送消息给服务端
 */
function sendMsgToServer() {
    var $message = $('#msg');
    if ($message.val()) {
        webSocket.send(JSON.stringify({
            username : $('#username').text(),
            msg : $message.val()
        }));
        $message.val(null);
    }
}
/**
 * 清屏
 */
function clearMsg() {
    $(".message-container").empty();
}
/**
 * 使用ENTER发送消息
 */
document.onkeydown = function(event) {
    var e = event || window.event
        || arguments.callee.caller.arguments[0];
    e.keyCode === 13 && sendMsgToServer();
};

/**
 * 发送消息
 */
function send(){
    var text = document.querySelector('#textarea').value;
    if(!text){
        alert('请输入内容');
        return ;
    }
    var item = document.createElement('div');
    item.className = 'item item-right';
    item.innerHTML = "<div class='bubble bubble-left'>"+text+"</div><div class='avatar'><img th:src='@{/img/img2.jpg}' /></div>";
    document.querySelector('.content').appendChild(item);
    document.querySelector('#textarea').value = '';
    document.querySelector('#textarea').focus();
    //滚动条置底
    var height = document.querySelector('.content').scrollHeight;
    document.querySelector(".content").scrollTop = height;
}