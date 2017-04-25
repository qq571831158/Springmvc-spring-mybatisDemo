function getStyle(obj, attr) {

    if (obj.currentStyle) {

        return obj.currentStyle[attr];

    } else {

        return getComputedStyle(obj, false)[attr];

    }
};


function doMove(obj, attr, dir, target, endFn) {

    dir = parseInt(getStyle(obj, attr)) < target ? dir : -dir;

    clearInterval(obj.timer);

    obj.timer = setInterval(function () {

        var speed = parseInt(getStyle(obj, attr)) + dir;

        if (speed > target && dir > 0 || speed < target && dir < 0) {
            speed = target;
        }

        obj.style[attr] = speed + 'px';

        if (speed == target) {
            clearInterval(obj.timer);

            /*
             if ( endFn ) {
             endFn();
             }
             */
            endFn && endFn();

        }

    }, 30);
};

function shake(obj, endFn) {

    var num = 15;

    var arr = [];

    var position = parseInt(getStyle(obj, 'left'));

    for (i = 0; i < num; i++) {

        arr.push(i);

        arr.push(-i);

    }

    var timer = null;

    clearInterval(timer);

    var len = arr.length;

    timer = setInterval(function () {


        obj.style.left = position + arr[len - 1] + 'px';

        len = len - 1;

        if (len == 0) {

            clearInterval(timer);

            endFn && endFn();
        }
    }, 30)
}
function show() {
    document.getElementsByTagName("body")[0].style.display = "block";
}