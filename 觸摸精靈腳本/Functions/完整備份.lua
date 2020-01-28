-- 适用屏幕参数
SCREEN_RESOLUTION="640x1136";
SCREEN_COLOR_BITS=32;

-- 主入口
function main()
    rotateScreen(0);

    --回桌面
	mSleep(3000);
    touchDown(4, 598, 38)
    mSleep(100);
    touchUp(4)

    mSleep(1000);
    touchDown(4, 326, 718)
    mSleep(100);
    touchUp(4)
	--備份
	mSleep(3000);
    touchDown(4, 550, 810)
    mSleep(100);
    touchUp(4)

    mSleep(2000);
    touchDown(4, 496, 192)
    mSleep(100);
    touchUp(4)

    mSleep(1500);
    touchDown(4, 520, 414)
    mSleep(100);
    touchUp(4)

    mSleep(1000);
    touchDown(4, 320, 406)
    mSleep(100);
    touchUp(4)

    mSleep(1000);
    touchDown(4, 488, 656)
    mSleep(100);
    touchUp(4)

    mSleep(1500);
    touchDown(4, 330, 630)
    mSleep(100);
    touchUp(4)
	--回桌面
	mSleep(3000);
    touchDown(4, 598, 38)
    mSleep(100);
    touchUp(4)

    mSleep(1000);
    touchDown(4, 326, 718)
    mSleep(100);
    touchUp(4)
	
	--回到神魔
	mSleep(3000);
    touchDown(4, 392, 810)
    mSleep(100);
    touchUp(4)

    mSleep(2000);
    touchDown(4, 320, 886)
    mSleep(100);
    touchUp(4)

    mSleep(1000);
end