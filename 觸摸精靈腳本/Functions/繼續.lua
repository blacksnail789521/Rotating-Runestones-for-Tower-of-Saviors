-- 适用屏幕参数
SCREEN_RESOLUTION="640x1136";
SCREEN_COLOR_BITS=32;

-- 主入口
function main()
    rotateScreen(0);
    mSleep(1);
    touchDown(7, 502, 634)
    mSleep(1);
    touchUp(7)

    mSleep(1458);
    touchDown(2, 330, 722)
    mSleep(97);
    touchUp(2)

    mSleep(1000);
end