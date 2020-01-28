-- 适用屏幕参数
SCREEN_RESOLUTION="640x1136";
SCREEN_COLOR_BITS=32;

-- 主入口
function main()
    rotateScreen(0);
	--遺跡
    mSleep(3000);
    touchDown(4, 84, 288)
    mSleep(100);
    touchUp(4)
	--水
    mSleep(3000);
    touchDown(4, 80, 458)
    mSleep(100);
    touchUp(4)
	--光
    mSleep(3000);
    touchDown(4, 84, 800)
    mSleep(100);
    touchUp(4)
	--木
    mSleep(3000);
    touchDown(4, 506, 882)
    mSleep(100);
    touchUp(4)
	--暗
    mSleep(3000);
    touchDown(2, 564, 672)
    mSleep(100);
    touchUp(2)
	--火
    mSleep(3000);
    touchDown(4, 528, 446)
    mSleep(100);
    touchUp(4)
	--記憶
    mSleep(3000);
    touchDown(4, 542, 272)
    mSleep(100);
    touchUp(4)
	--主塔
    mSleep(3000);
    touchDown(4, 320, 576)
    mSleep(100);
    touchUp(4)

    mSleep(1000);
end