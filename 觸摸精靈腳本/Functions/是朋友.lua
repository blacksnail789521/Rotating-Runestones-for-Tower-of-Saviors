-- 适用屏幕参数
SCREEN_RESOLUTION="640x1136";
SCREEN_COLOR_BITS=32;

-- 主入口
function main()
    rotateScreen(0);
    mSleep(0);
    touchDown(1, 540, 634)
    mSleep(1);
    touchUp(1)

    mSleep(979);
    touchDown(7, 320, 720)
    mSleep(131);
    touchUp(7)

    mSleep(1000);
end