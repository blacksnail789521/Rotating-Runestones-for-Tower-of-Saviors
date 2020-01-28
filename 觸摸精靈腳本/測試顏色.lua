-- 适用屏幕参数
SCREEN_RESOLUTION="640x1136";
SCREEN_COLOR_BITS=32;

-- 主入口
function main()
    rotateScreen(0);
	
	goto def;
	
	::abc::
	notifyMessage("成功", 3000);
	mSleep(3000);
	
	
	
	::def::
	mSleep(3000);
	c = getColor(100, 100);
	mSleep(1000);
	
	if c == 1643018
	then goto abc;
	else
		notifyMessage(c, 3000);
		goto def;
	end	
	
end