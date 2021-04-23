package event;

import java.util.Timer;
import java.util.TimerTask;

import screen.Draw_Screen;
import tetris.Tetris;
import tetrominos.Operate_Tetrominos;

public class Set_Timer {
	Operate_Tetrominos opTe;
	public Set_Timer(Tetris tetris){
		opTe = tetris.opTe;
		Timer timer = new Timer();
		
		TimerTask timertask = new TimerTask() {
			public void run() {
				opTe.moveDown(tetris.gameboard.currentblock);
				tetris.screen.repaint();
			}
		};
		timer.schedule(timertask, 500, 700);
	}
}