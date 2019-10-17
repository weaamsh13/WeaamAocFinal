package y2019.weaam.aoc.weaamaoc2019;

public class Club {
    private String clubName;
    private int imageId;
    private int imageId2;



    public Club(String clubName, int imageId, int imageId2) {
        this.clubName = clubName;
        this.imageId = imageId;
        this.imageId2 = imageId2;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getImageId2() {
        return imageId2;
    }

    public void setImageId2(int imageId2) {
        this.imageId2 = imageId2;
    }

    public Club() {
    }

    @Override
    public String toString() {
        return "Club{" +
                "clubName='" + clubName + '\'' +
                ", imageId=" + imageId +
                ", imageId2=" + imageId2 +
                '}';
    }
}
