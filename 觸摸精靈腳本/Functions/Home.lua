-- 适用屏幕参数
SCREEN_RESOLUTION="640x1136";
SCREEN_COLOR_BITS=32;

-- 主入口
function main()
    rotateScreen(0);
    mSleep(1295);
    touchDown(4, 320, 960)
    mSleep(100);
    touchUp(4)

    mSleep(1000);
end