-- 适用屏幕参数
SCREEN_RESOLUTION="640x1136";
SCREEN_COLOR_BITS=32;

-- 主入口
function main()
    rotateScreen(0);
	--貼上現在檔案
    mSleep(1000);
    touchDown(9, 612, 66)
    touchUp(9)

    mSleep(1000);
    touchDown(1, 594, 1092)
    touchUp(1)

    mSleep(1000);
    touchDown(6, 336, 884)
    touchUp(6)

    mSleep(1500);
    touchDown(5, 346, 626)
    touchUp(5)

    mSleep(1000);
    touchDown(9, 594, 72)
    touchUp(9)
	
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