public class FloodFill733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor) {
            dfs(image, sr, sc, color, newColor);
        }
        return image;
    }

    public void dfs(int[][] image, int r, int c, int color, int newColor) {
        if (image[r][c] == color) {
            image[r][c] = newColor;
            if (r > 0) dfs(image, r - 1, c, color, newColor);
            if (c > 0) dfs(image, r, c - 1, color, newColor);
            if (image.length - 1 - r > 0) dfs(image, r + 1, c, color, newColor);
            if (image[r].length - 1 - c > 0) dfs(image, r, c + 1, color, newColor);
        }
    }
}
