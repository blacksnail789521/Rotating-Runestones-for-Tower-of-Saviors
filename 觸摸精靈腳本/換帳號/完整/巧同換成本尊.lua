-- 适用屏幕参数
SCREEN_RESOLUTION="640x1136";
SCREEN_COLOR_BITS=32;

-- 主入口
function main()
    rotateScreen(0);
	--開iFile
    mSleep(5000);
    touchDown(4, 234, 808)
	mSleep(100);
    touchUp(4)
	--回到Preferences
    mSleep(3000);
    touchDown(5, 308, 1096)
	mSleep(100);
    touchUp(5)

    mSleep(1000);
    touchDown(5, 362, 1100)
	mSleep(100);
    touchUp(5)

    mSleep(1000);
    touchDown(6, 336, 160)
	mSleep(100);
    touchUp(6)
	
	--複製現在檔案
	mSleep(1000);
    touchDown(8, 318, 390)
    mSleep(29);
    touchMove(8, 320, 400)
    mSleep(18);
    touchMove(8, 320, 410)
    mSleep(19);
    touchMove(8, 320, 424)
    mSleep(18);
    touchMove(8, 320, 442)
    mSleep(21);
    touchMove(8, 320, 468)
    mSleep(16);
    touchMove(8, 320, 494)
    mSleep(14);
    touchMove(8, 320, 522)
    mSleep(14);
    touchMove(8, 320, 548)
    mSleep(17);
    touchMove(8, 320, 580)
    mSleep(14);
    touchMove(8, 320, 612)
    mSleep(19);
    touchMove(8, 324, 648)
    mSleep(15);
    touchMove(8, 328, 680)
    mSleep(16);
    touchMove(8, 330, 706)
    mSleep(21);
    touchMove(8, 332, 734)
    mSleep(12);
    touchMove(8, 336, 762)
    mSleep(18);
    touchMove(8, 340, 790)
    mSleep(17);
    touchMove(8, 344, 822)
    mSleep(17);
    touchMove(8, 354, 860)
    mSleep(18);
    touchMove(8, 366, 896)
    mSleep(15);
    touchMove(8, 372, 920)
    mSleep(19);
    touchUp(8)
	
	mSleep(1000);
    touchDown(8, 390, 860)
    mSleep(64);
    touchMove(8, 386, 842)
    mSleep(19);
    touchMove(8, 386, 830)
    mSleep(16);
    touchMove(8, 386, 814)
    mSleep(17);
    touchMove(8, 384, 796)
    mSleep(16);
    touchMove(8, 380, 770)
    mSleep(16);
    touchMove(8, 376, 738)
    mSleep(17);
    touchMove(8, 370, 708)
    mSleep(16);
    touchMove(8, 368, 670)
    mSleep(18);
    touchMove(8, 370, 602)
    mSleep(15);
    touchMove(8, 376, 562)
    mSleep(18);
    touchUp(8)
	
    mSleep(1000);
    touchDown(7, 608, 64)
	mSleep(100);
    touchUp(7)

    mSleep(1000);
    touchDown(4, 348, 620)
	mSleep(100);
    touchUp(4)

    mSleep(1000);
    touchDown(3, 606, 1086)
	mSleep(100);
    touchUp(3)

    mSleep(1000);
    touchDown(1, 376, 710)
	mSleep(100);
    touchUp(1)

    mSleep(1000);
    touchDown(7, 600, 80)
	mSleep(100);
    touchUp(7)
	
	--巧同
    mSleep(1000);
    touchDown(6, 320, 412)
	mSleep(100);
    touchUp(6)
	
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
	
	--本尊
    mSleep(1000);
    touchDown(7, 320, 518)
	mSleep(100);
    touchUp(7)
	
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
	
	--貼上新檔案
    mSleep(1000);
    touchDown(9, 612, 66)
	mSleep(100);
    touchUp(9)

    mSleep(1000);
    touchDown(1, 594, 1092)
	mSleep(100);
    touchUp(1)

    mSleep(1000);
    touchDown(6, 336, 884)
	mSleep(100);
    touchUp(6)

    mSleep(1500);
    touchDown(5, 346, 626)
	mSleep(100);
    touchUp(5)

    mSleep(1000);
    touchDown(9, 594, 72)
	mSleep(100);
    touchUp(9)
	
	--回到主畫面
	mSleep(2000);
	keyDown('HOME');
	mSleep(100);
	keyUp('HOME');
	
	--開神魔
	mSleep(2000);
    touchDown(4, 392, 810)
    mSleep(100);
    touchUp(4)

    mSleep(1000);
end