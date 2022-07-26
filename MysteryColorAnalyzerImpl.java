import java.util.ArrayList;
import java.util.List;

public class MysteryColorAnalyzerImpl implements MysteryColorAnalyzer{



    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {
        return 0;
    }

    @Override
    public int colorOccurrence(List<Color> colors, Color color) {
        int counter = 0;
        for (int i = 0; i < colors.size(); i++) {
            Color nameColor = colors.get(i);
            if (nameColor.equals(color)) {
                counter++;
            }
        }
        return counter;
    }
    public static void main(String [] args) {
        ArrayList<Color> colors = new ArrayList<>();
        colors.add(Color.GREEN);
        colors.add(Color.BLUE);
        colors.add(Color.RED);
        colors.add(Color.RED);

        MysteryColorAnalyzerImpl mysteryColorAnalyzer = new MysteryColorAnalyzerImpl();
        double colorOcurrence= mysteryColorAnalyzer.colorOccurrence(colors,Color.RED);
        System.out.println("colorOcurrence:" + colorOcurrence);



    }
}
