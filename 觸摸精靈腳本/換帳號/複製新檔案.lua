-- 适用屏幕参数
SCREEN_RESOLUTION="640x1136";
SCREEN_COLOR_BITS=32;

-- 主入口
function main()
    rotateScreen(0);
	--複製新檔案
    mSleep(1000);
    touchDown(7, 608, 64)
    touchUp(7)

    mSleep(1000);
    touchDown(4, 320, 208)
    touchUp(4)

    mSleep(1000);
    touchDown(3, 606, 1086)
    touchUp(3)

    mSleep(1000);
    touchDown(1, 376, 710)
    touchUp(1)

    mSleep(1000);
    touchDown(7, 600, 80)
    touchUp(7)
	
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