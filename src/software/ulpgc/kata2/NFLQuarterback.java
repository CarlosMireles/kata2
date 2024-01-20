package software.ulpgc.kata2;

public record NFLQuarterback(String Player, String Team, int GamesPlayed, int PassAttempts, int PassCompletions,float PassCompletionPercentage, int TotalYards, float YardsPerAttempt, int TouchDowns,float TouchDownsPercentage, int Interceptions, float InterceptionsPercentage, float PasserRating) {
    @Override
    public String Player() {
        return Player;
    }

    @Override
    public String Team() {
        return Team;
    }

    @Override
    public int GamesPlayed() {
        return GamesPlayed;
    }

    @Override
    public int PassAttempts() {
        return PassAttempts;
    }

    @Override
    public int PassCompletions() {
        return PassCompletions;
    }

    @Override
    public float PassCompletionPercentage() {
        return PassCompletionPercentage;
    }

    @Override
    public int TotalYards() {
        return TotalYards;
    }

    @Override
    public float YardsPerAttempt() {
        return YardsPerAttempt;
    }

    @Override
    public int TouchDowns() {
        return TouchDowns;
    }

    @Override
    public float TouchDownsPercentage() {
        return TouchDownsPercentage;
    }

    @Override
    public int Interceptions() {
        return Interceptions;
    }

    @Override
    public float InterceptionsPercentage() {
        return InterceptionsPercentage;
    }

    @Override
    public float PasserRating() {
        return PasserRating;
    }
}
