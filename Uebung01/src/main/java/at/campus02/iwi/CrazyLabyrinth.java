package at.campus02.iwi;

public class CrazyLabyrinth {
    public boolean checkPathConsistency(LabyrinthTile []path){
        for(int t = 0; t < path.length - 1; ++t){
            if((path[t].getExit() == Direction.UP) && (path[t].getEntry() != Direction.DOWN )){
                return false;
            }
            if((path[t].getExit() == Direction.RIGHT) && (path[t].getEntry() != Direction.LEFT )){
                return false;
            }
            if((path[t].getExit() == Direction.DOWN) && (path[t].getEntry() != Direction.UP )){
                return false;
            }
            if((path[t].getExit() == Direction.LEFT) && (path[t].getEntry() != Direction.RIGHT )){
                return false;
            }
        }
        return true;
    }
}
