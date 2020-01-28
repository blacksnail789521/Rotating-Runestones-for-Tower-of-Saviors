-- 适用屏幕参数
SCREEN_RESOLUTION="640x1136";
SCREEN_COLOR_BITS=32;

-- 主入口
function main()
    rotateScreen(0);
    mSleep(3000);
    touchDown(1, 188, 708)
    mSleep(100);
    touchUp(1)

    mSleep(1000);
end