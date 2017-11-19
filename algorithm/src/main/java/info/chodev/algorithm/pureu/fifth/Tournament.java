package info.chodev.algorithm.pureu.fifth;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * https://www.acmicpc.net/problem/1057
 * 
 * 토너먼트
 * 
 * @author pureu
 * @since 2017.11.20
 *
 */
public class Tournament {

	/**
	 * 토너먼트
	 * 
	 * @param n
	 * @param p1
	 * @param p2
	 * @return
	 */
	public int playTournament(int n, int p1, int p2) {
		int[] round = new int[n];
		for(int i=0;i<n;i++) {
			round[i] = i+1;
		}
		Team winnerTeam = new Team();
		winnerTeam.setPlayer1(p1);
		winnerTeam.setPlayer2(p2);
		
		int roundCount = 1;
		while(round.length > 1) {
			List<Team> teamList = makeTeam(round);
			if(findTeam(teamList, winnerTeam)) {
				return roundCount;
			}
			round = getWinner(teamList, winnerTeam);
			roundCount++;
		}
		
		return -1;
	}

	/**
	 * 팀을 찾는다.
	 * 
	 * @param teamList
	 * @param winnerTeam
	 * @return
	 */
	public boolean findTeam(List<Team> teamList, Team winnerTeam) {
		boolean isFind = false;
		for(int i=0;i<teamList.size();i++) { 
			if(teamList.get(i).compareTo(winnerTeam) == 0) {
				isFind =  true;
				break;
			}
		}
		return isFind;
	}
	
	/**
	 * 싸운다.
	 * 
	 * @param team
	 * @param winnerTeam
	 * @return
	 */
	public int fight(Team team, Team winnerTeam) {
		if(team.getPlayer1() == winnerTeam.getPlayer1()
				|| team.getPlayer1() == winnerTeam.getPlayer2()) {
			return team.getPlayer1();
		} else if(team.getPlayer2() == winnerTeam.getPlayer1()
				|| team.getPlayer1() == winnerTeam.getPlayer2()) {
			return team.getPlayer2();
		} else {
			Random random = new Random();
			int lucky = random.nextInt(2);
			if(lucky == 0) {
				return team.getPlayer1();
			} else {
				return team.getPlayer2();
			}
		}
	}
	
	/**
	 * 승리자를 구한다.
	 * 
	 * @param teamList
	 * @param winnerTeam
	 * @return
	 */
	public int[] getWinner(List<Team> teamList, Team winnerTeam) {
		int[] winner = new int[teamList.size()];
		for(int i=0;i<teamList.size();i++) {
			winner[i] = fight(teamList.get(i), winnerTeam);
		}
		return winner;
	}
	
	/**
	 * 팀을 만든다.
	 * 
	 * @param round
	 * @return
	 */
	public List<Team> makeTeam(int[] round) {
		List<Team> teamList = new ArrayList<Team>();
		for(int i=0;i<round.length;i=i+2) {
			Team team = new Team();
			team.setPlayer1(round[i]);
			team.setPlayer2(round[i+1]);
			teamList.add(team);
		}
		return teamList;
	}
	
	public static void main(String[] args) {
		Tournament tournament = new Tournament();
		System.out.println("round : " + tournament.playTournament(16, 8, 9));
	}
}

class Team implements Comparable<Team> {
	private int player1 = 0;
	private int player2 = 0;
	
	public int getPlayer1() {
		return player1;
	}
	public void setPlayer1(int player1) {
		this.player1 = player1;
	}
	public int getPlayer2() {
		return player2;
	}
	public void setPlayer2(int player2) {
		this.player2 = player2;
	}
	
	public int compareTo(Team o) {
		if(getPlayer1() > o.getPlayer1()
				&& getPlayer2() > o.getPlayer2()) {
			return 1;
		} else if(getPlayer1() == o.getPlayer1()
				&& getPlayer2() == o.getPlayer2()) {
			return 0;
		} else {
			return -1;
		}
	}
}