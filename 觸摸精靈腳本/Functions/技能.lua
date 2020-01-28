-- 适用屏幕参数
SCREEN_RESOLUTION="640x1136";
SCREEN_COLOR_BITS=32;

-- 主入口
function main()
    rotateScreen(0);
    mSleep(0);
    touchDown(8, 532, 630)
    mSleep(1);
    touchUp(8)

    mSleep(911);
    touchDown(8, 550, 592)
    mSleep(83);
    touchUp(8)

    mSleep(1000);
end