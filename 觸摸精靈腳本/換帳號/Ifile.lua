-- 适用屏幕参数
SCREEN_RESOLUTION="640x1136";
SCREEN_COLOR_BITS=32;

-- 主入口
function main()
    rotateScreen(0);
	--開iFile
    mSleep(1000);
    touchDown(4, 234, 808)
    touchUp(4)
	--回到Preferences
    mSleep(3000);
    touchDown(5, 308, 1096)
    touchUp(5)

    mSleep(1000);
    touchDown(5, 362, 1100)
    touchUp(5)

    mSleep(1000);
    touchDown(6, 336, 160)
    touchUp(6)

    mSleep(1000);
end