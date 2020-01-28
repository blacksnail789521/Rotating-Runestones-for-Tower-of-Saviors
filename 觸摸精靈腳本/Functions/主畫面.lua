-- 适用屏幕参数
SCREEN_RESOLUTION="640x1136";
SCREEN_COLOR_BITS=32;

-- 主入口
function main()
    rotateScreen(0);
    mSleep(3000);
    touchDown(4, 598, 38)
    mSleep(100);
    touchUp(4)

    mSleep(1000);
    touchDown(4, 326, 718)
    mSleep(100);
    touchUp(4)

    mSleep(1000);
end