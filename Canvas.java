public class Canvas {
        private char[][] canvasStorage;
        private int width;
        private int height;
        private int canvasX;
        private int canvasY;

        public Canvas(int width, int height) {

            if(width <= 0 || height <= 0) {
                throw new IllegalArgumentException();
            }

            this.width = width;
            this.height = height;

            canvasX = width + 2;
            canvasY = height + 2;
            canvasStorage = new char[canvasX][canvasY];

            char currentCharacter = ' ';
            for (int i = 0; i < canvasY; i++) {
                for (int j = 0; j < canvasX; j++) {
                    if (i == 0 || i == canvasY - 1) {
                        currentCharacter = '-';
                    } else if (j == 0 || j == canvasX - 1) {
                        currentCharacter = '|';
                    } else {
                        currentCharacter = ' ';
                    }
                    canvasStorage[j][i] = currentCharacter;
                }
            }
        }

        public Canvas draw(int x1, int y1, int x2, int y2) {
            if (x1 >= canvasX - 2 || x2 >= canvasX - 2 || y1 >= canvasY - 2
                    || y2 >= canvasY - 2 || x1 < 0 || x2 < 0 || y1 < 0
                    || y2 < 0) {
                throw new IllegalArgumentException();
            }
            if (x2 < x1) {
                int t = x2;
                x2 = x1;
                x1 = t;
            }
            if (y2 < y1) {
                int t = y2;
                y2 = y1;
                y1 = t;
            }
            int rectX1 = x1 + 1;
            int rectY1 = y1 + 1;
            int rectX2 = x2 + 1;
            int rectY2 = y2 + 1;
            for (int i = rectY1; i <= rectY2; i++) {
                for (int j = rectX1; j <= rectX2; j++) {
                    if (i == rectY1 || i == rectY2) {
                        canvasStorage[j][i] = 'x';
                    } else if (j == rectX1 || j == rectX2) {
                        canvasStorage[j][i] = 'x';
                    } else {
                        continue;
                    }
                }
            }
            return this;
        }

        public String drawCanvas() {
            String result = "";
            for (int i = 0; i < canvasY; i++) {
                for (int j = 0; j < canvasX; j++) {
                    result += canvasStorage[j][i];
                }
                if(i != canvasY-1)
                    result += "\n";
            }
            return result;
        }
    }

