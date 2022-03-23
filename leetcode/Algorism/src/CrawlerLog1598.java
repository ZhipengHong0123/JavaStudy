public class CrawlerLog1598 {
    public int minOperations(String[] logs) {
        int depth =0;
        for (String str:logs){
            if (str.equals("../") ){
                depth --;
                depth=Math.max(depth,0);
            }else if (str.equals("./") ){
                continue;
            }else {
                depth ++;
            }
        }
        return depth;
    }
}
