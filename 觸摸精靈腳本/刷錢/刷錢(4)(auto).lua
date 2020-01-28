-- 适用屏幕参数
SCREEN_RESOLUTION="640x1136";
SCREEN_COLOR_BITS=32;

-- 主入口
function main()
    rotateScreen(0);
	
	--開自動轉
	mSleep(2000);
    touchDown(8, 54, 0)
    mSleep(81);
    touchMove(8, 58, 12)
    mSleep(18);
    touchMove(8, 58, 32)
    mSleep(18);
    touchMove(8, 58, 54)
    mSleep(15);
    touchMove(8, 58, 72)
    mSleep(17);
    touchMove(8, 58, 92)
    mSleep(16);
    touchMove(8, 58, 110)
    mSleep(17);
    touchMove(8, 58, 128)
    mSleep(15);
    touchMove(8, 56, 142)
    mSleep(17);
    touchMove(8, 54, 156)
    mSleep(17);
    touchMove(8, 52, 168)
    mSleep(17);
    touchMove(8, 50, 180)
    mSleep(17);
    touchMove(8, 48, 192)
    mSleep(16);
    touchMove(8, 46, 204)
    mSleep(16);
    touchMove(8, 46, 216)
    mSleep(17);
    touchMove(8, 46, 226)
    mSleep(16);
    touchMove(8, 46, 238)
    mSleep(17);
    touchMove(8, 46, 248)
    mSleep(17);
    touchMove(8, 46, 258)
    mSleep(16);
    touchMove(8, 46, 266)
    mSleep(17);
    touchMove(8, 46, 272)
    mSleep(17);
    touchMove(8, 46, 278)
    mSleep(16);
    touchMove(8, 46, 282)
    mSleep(17);
    touchMove(8, 46, 288)
    mSleep(17);
    touchMove(8, 46, 292)
    mSleep(16);
    touchMove(8, 46, 292)
    mSleep(17);
    touchMove(8, 46, 294)
    mSleep(17);
    touchMove(8, 46, 294)
    mSleep(33);
    touchUp(8)

    mSleep(1000);
    touchDown(4, 482, 956)
    mSleep(100);
    touchUp(4)
	
	goto def;
	
	::abc::
	 mSleep(3000);
	
	--繼續
    mSleep(3000);
    touchDown(3, 320, 670)
    mSleep(100);
    touchUp(3)
	--Home
	mSleep(3000);
    touchDown(4, 320, 960)
    mSleep(100);
    touchUp(4)
	--繼續
    mSleep(3000);
    touchDown(3, 320, 720)
    mSleep(100);
    touchUp(3)
	--Home
	mSleep(3000);
    touchDown(4, 320, 960)
    mSleep(100);
    touchUp(4)
	--升等
	mSleep(3000);
    touchDown(4, 568, 615)
    mSleep(100);
    touchUp(4)
	--Home
	mSleep(3000);
    touchDown(4, 320, 960)
    mSleep(100);
    touchUp(4)
	--靈魂石(打三場)
    mSleep(3000);
    touchDown(3, 320, 720)
    mSleep(100);
    touchUp(3)
	--Home
	mSleep(3000);
    touchDown(4, 320, 960)
    mSleep(100);
    touchUp(4)
	--靈魂石(消耗固定體力)
    mSleep(3000);
    touchDown(3, 320, 720)
    mSleep(100);
    touchUp(3)
	--Home
	mSleep(3000);
    touchDown(4, 320, 960)
    mSleep(100);
    touchUp(4)
    --朋友接受
	mSleep(3000);
    touchDown(4, 188, 720)
    mSleep(100);
    touchUp(4)
	--Home
	mSleep(3000);
    touchDown(4, 320, 960)
    mSleep(100);
    touchUp(4)
	--本來就朋友
	mSleep(3000);
    touchDown(4, 320, 720)
    mSleep(100);
    touchUp(4)
	--Home
	mSleep(3000);
    touchDown(4, 320, 960)
    mSleep(100);
    touchUp(4)
	
	--這時應該一定到主畫面了
	
	--遺跡
    mSleep(3000);
    touchDown(4, 90, 270)
    mSleep(100);
    touchUp(4)
	--移到最上
	mSleep(3000);
    touchDown(4, 320, 242)
    mSleep(100);
    touchUp(4)
	--第四關
    mSleep(3000);
    touchDown(4, 320, 744)
    mSleep(100);
    touchUp(4)
	--第一關
    mSleep(3000);
    touchDown(4, 320, 360)
    mSleep(100);
    touchUp(4)
	--吃石
    mSleep(3000);
    touchDown(4, 140, 662)
    mSleep(100);
    touchUp(4)
    mSleep(7000);
    touchDown(3, 548, 630)
    mSleep(100);
    touchUp(3)
	mSleep(5000);
    touchDown(4, 140, 662)
    mSleep(100);
    touchUp(4)
    mSleep(3000);
    touchDown(4, 320, 800)
    mSleep(100);
    touchUp(4)

	--選第一個朋友
    mSleep(3000);
    touchDown(4, 320, 370)
    mSleep(100);
    touchUp(4)
	--按下選擇
    mSleep(1000);
    touchDown(4, 320, 638)
    mSleep(100);
    touchUp(4)
	--選隊伍(左)
    mSleep(3000);
    touchDown(2, 282, 470)
    mSleep(100);
    touchUp(2)
	--進關
    mSleep(1000);
    touchDown(4, 556, 990)
    mSleep(100);
    touchUp(4)
	mSleep(1000);
	
	mSleep(15000);
	
	::def::
	
	c = getColor(100, 100);
	mSleep(1000);
	
	if c == 1577992
	then goto abc;
	else goto def;
	end	
	
end