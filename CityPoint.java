
public class CityPoint {
    String name;
    int[] coords;
    String description;

    public CityPoint(String name, int[] coords, String description) {
        this.name = name;
        this.coords = coords;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public int[] getCoords() {
        return this.coords;
    }

    public String getDescription() {
        return this.description;
    }

    static CityPoint[][] drive(int x1, int y1, int x2, int y2, CityPoint[][] city) {
        if (y1 < 0 || y1 > city.length || y2 < 0 || y2 > city.length || x1 < 0 || x1 > city[0].length || x2 < 0 || x2 > city[0].length) {
            return null;
        }

        int a = 0;
        while (a < city.length) {
            int b = 0;
            while (b < city[0].length) {
                int[] coords = {a, b};
                city[a][b] = new CityPoint(" ", coords, "cell");
                b++;
            }
            a++;
        }

        city[0][0].name = "+";
        city[city[0].length - 1][0].name = "+";
        city[0][city.length-1].name = "+";
        city[city[0].length - 1][city.length-1].name = "+";

        for (int i = 1; i < city[0].length -1; i++) {
            city[i][0].name = "|";
            city[i][city.length-1].name = "|";
        }
        for (int i = 1; i < city.length - 1; i++) {
            city[0][i].name = "-";
            city[city[0].length - 1][i].name = "-";
        }

        city[x1][y1].name = "A";
        city[x2][y2].name = "B";

        int x = x1;
        int y = y1;
        if (x1 > x2) {
            while (x > x2) {
                x-=1;
                city[x][y].name = "*";
            }
        } else {
            while (x < x2) {
                x+=1;
                city[x][y].name = "*";
            }
        }

        if (y1 > y2) {
            while (y > y2-1) {
                y-=1;
                city[x][y].name = "*";
            }
        } else {
            while (y < y2-1) {
                y+=1;
                city[x][y].name = "*";
            }
        }
        return city;
    }

    public static void main(String[] args) {
        CityPoint[][] city = new CityPoint[9][9];
        CityPoint[][] city2 = drive(1, 1, 3, 5, city);

        int i = 0;
        while (i < city2.length) {
            int j = 0;
            while (j < city2[0].length) {
                System.out.print(city2[i][j].name);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}