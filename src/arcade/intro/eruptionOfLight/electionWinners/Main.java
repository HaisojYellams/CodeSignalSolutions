package arcade.intro.eruptionOfLight.electionWinners;

public class Main {
    int electionsWinners(int[] votes, int k) {
        int maxVotes = Integer.MIN_VALUE;
        int maxVoteCount = 0;

        for (int v : votes) {
            if (v >= maxVotes) {
                if (v == maxVotes) {
                    maxVoteCount += 1;
                } else {
                    maxVotes = v;
                    maxVoteCount = 1;
                }
            }
        }

        if (k == 0) {
            if (maxVoteCount > 1) {
                return 0;
            } else {
                return 1;
            }
        }

        int numCanWin = 0;
        for (int v : votes) {
            if (v + k > maxVotes) {
                numCanWin += 1;
            }
        }

        return numCanWin;
    }

}
