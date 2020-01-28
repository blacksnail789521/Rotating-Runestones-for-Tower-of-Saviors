-- 适用屏幕参数
SCREEN_RESOLUTION="640x1136";
SCREEN_COLOR_BITS=32;

-- 主入口
function main()
    rotateScreen(0);
    mSleep(0);
    touchDown(5, 466, 646)
    mSleep(1);
    touchUp(5)

    mSleep(2082);
    touchDown(4, 562, 614)
    mSleep(112);
    touchUp(4)

    mSleep(1000);
end