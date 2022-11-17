package Movies;

class Movies {

    public static void main(String[] args) {

        String[] movies = {
                "Indiana Jones and the Raiders of the Lost Ark",
                "Indiana Jones and the Temple of Doom",
                "Indiana Jones and the Last Crusade",
        };

        String [][] mainActorsPerMovie = {
                {"Harrison Ford", "Karen Allen", "Paul Freeman"},
                {"Harrison Ford", "Kate Capshaw", "Ke Huy Quan"},
                {"Harrison Ford", "Sean Connery", "Alison Doody"},
        };

        StringBuilder actorsPerMovieResult = new StringBuilder();

        for (int i = 0; i < movies.length; i++) {
            actorsPerMovieResult.append("Dans le film ").append(movies[i]).append(", les principaux acteurs sont : ");

            for (int j = 0; j < mainActorsPerMovie.length; j++) {
                if (j < mainActorsPerMovie.length - 1) {
                    actorsPerMovieResult.append(mainActorsPerMovie[i][j]).append(", ");
                } else {
                    actorsPerMovieResult.append(mainActorsPerMovie[i][j]).append(".");
                }
            }

            System.out.println(actorsPerMovieResult);
            actorsPerMovieResult.setLength(0);
        }
    }
}
