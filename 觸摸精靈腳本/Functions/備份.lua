-- 适用屏幕参数
SCREEN_RESOLUTION="640x1136";
SCREEN_COLOR_BITS=32;

-- 主入口
function main()
    rotateScreen(0);
    mSleep(1500);
    touchDown(6, 554, 814)
    mSleep(64);
    touchUp(6)

    mSleep(3000);
    touchDown(2, 504, 896)
    mSleep(14);
    touchMove(2, 508, 896)
    mSleep(84);
    touchUp(2)

    mSleep(1800);
    touchDown(2, 512, 828)
    mSleep(82);
    touchUp(2)

    mSleep(1300);
    touchDown(9, 144, 240)
    mSleep(50);
    touchUp(9)

    mSleep(1200);
    touchDown(5, 474, 662)
    mSleep(80);
    touchUp(5)

    mSleep(1500);
    touchDown(8, 320, 648)
    mSleep(65);
    touchUp(8)

    mSleep(1000);
end