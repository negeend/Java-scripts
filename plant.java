public class plant{

    private boolean isAlive;
    private int soilMoistureLevel;
    private String nickname;
    private int height;

    public plant(int soil, String nickname, int height) {
        this.soilMoistureLevel = soil;
        this.nickname = nickname;
        this.height = height;
    }

    public void setNickname(String name) {
        this.nickname = name;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void water() {
        this.height += 1;
        this.soilMoistureLevel += 1;
        if this.soilMoistureLevel > 10 {
            this.isAlive = false;
        }
    }

    public boolean isDead() {
        return !this.isAlive;
    }
    
}