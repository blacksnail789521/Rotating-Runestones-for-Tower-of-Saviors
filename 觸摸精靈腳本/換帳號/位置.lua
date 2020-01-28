-- 适用屏幕参数
SCREEN_RESOLUTION="640x1136";
SCREEN_COLOR_BITS=32;

-- 主入口
function main()
    rotateScreen(0);
	--分身
    mSleep(1000);
    touchDown(5, 320, 208)
	mSleep(100);
    touchUp(5)
	--子定
    mSleep(1000);
    touchDown(4, 320, 320)
	mSleep(100);
    touchUp(4)
	--巧同
    mSleep(1000);
    touchDown(6, 320, 412)
	mSleep(100);
    touchUp(6)
	--本尊
    mSleep(1000);
    touchDown(7, 320, 518)
	mSleep(100);
    touchUp(7)

    mSleep(1000);
end