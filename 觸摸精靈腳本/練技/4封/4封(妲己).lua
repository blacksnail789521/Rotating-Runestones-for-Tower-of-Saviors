-- 适用屏幕参数
SCREEN_RESOLUTION="640x1136";
SCREEN_COLOR_BITS=32;

-- 主入口
function main()
    rotateScreen(0);
	
	--跳過對話窗
	mSleep(1000);
    touchDown(3, 320, 670)
    mSleep(100);
    touchUp(3)
	mSleep(1000);
    touchDown(3, 320, 670)
    mSleep(100);
    touchUp(3)
	--等一下
	mSleep(10000);
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
	--技能or升等or靈魂
	mSleep(5000);
    touchDown(4, 568, 615)
    mSleep(100);
    touchUp(4)
	--Home
	mSleep(3000);
    touchDown(4, 320, 960)
    mSleep(100);
    touchUp(4)
	--技能or升等or靈魂
	mSleep(3000);
    touchDown(4, 568, 615)
    mSleep(100);
    touchUp(4)
	--Home
	mSleep(3000);
    touchDown(4, 320, 960)
    mSleep(100);
    touchUp(4)
	--技能or升等or靈魂
	mSleep(3000);
    touchDown(4, 568, 615)
    mSleep(100);
    touchUp(4)
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
	
	--主塔
    mSleep(3000);
    touchDown(4, 320, 576)
    mSleep(100);
    touchUp(4)
	--移到最上
	mSleep(3000);
    touchDown(4, 320, 242)
    mSleep(100);
    touchUp(4)
	--4封(1)
    mSleep(3000);
    touchDown(4, 320, 748)
    mSleep(100);
    touchUp(4)
	--移到最上
	mSleep(3000);
    touchDown(4, 320, 242)
    mSleep(100);
    touchUp(4)
	--4封(2)
    mSleep(3000);
    touchDown(4, 320, 360)
    mSleep(100);
    touchUp(4)
	--選妲己
    mSleep(7000);
    touchDown(4, 600, 240)
    mSleep(100);
    touchUp(4)
	mSleep(3000);
    touchDown(4, 546, 520)
    mSleep(100);
    touchUp(4)
	--選第三個朋友
    mSleep(2000);
    touchDown(4, 320, 622)
    mSleep(100);
    touchUp(4)
	--按下選擇
    mSleep(3000);
    touchDown(4, 320, 638)
    mSleep(100);
    touchUp(4)
	--選隊伍
    mSleep(3000);
    touchDown(4, 600, 496)
    mSleep(100);
    touchUp(4)
	--進關
    mSleep(3000);
    touchDown(4, 556, 990)
    mSleep(100);
    touchUp(4)

    mSleep(1000);
end