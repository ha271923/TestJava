package KirillGaisin;

public class Platformer{
    private int position;
    private int[] tiles;

    public Platformer(int n, int position){
        tiles = new int[n];
        for(int i = 0; i < n; i++){
            tiles[i] = i;
        }
        this.position = position;
    }

    public void jumpLeft(){
        if(position >= 2) {
            int[] nextTiles = new int[tiles.length - 1];
            for (int i = 0; i < tiles.length - 1; i++) {
                nextTiles[i] = tiles[(i >= position) ? i + 1 : i];
            }
            tiles = nextTiles;
            position -= 2;
        }
    }

    public void jumpRight(){
        if(position < tiles.length - 2) {
            int[] nextTiles = new int[tiles.length - 1];
            for (int i = 0; i < tiles.length - 1; i++) {
                nextTiles[i] = tiles[(i >= position) ? i + 1 : i];
            }
            tiles = nextTiles;
            position += 1;
        }
    }

    public int position(){
        return tiles[position];
    }
    
    public static void main(String []args){
        Platformer platformer = new Platformer(6,3);
        System.out.println(platformer.position()); // should print 3
        
        platformer.jumpLeft();
        System.out.println(platformer.position()); // should print 1
        
        platformer.jumpRight();
        System.out.println(platformer.position()); // should print 4
    }
}