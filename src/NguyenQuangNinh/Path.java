package NguyenQuangNinh;

public class Path {
    private String path;

    public Path(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void cd(String newPath) {
        int innerCounter = 0;
        String out = "";

        String[] oldPathList = path.split("/");
        String[] newPathList = newPath.split("/");

        for(int i = 0; i < newPathList.length; i++) {
            if(newPathList[i].equals("..")) {
                innerCounter++;
            }
        }

        for(int i = 0; i < (oldPathList.length - innerCounter); i++) {
            if(oldPathList[i].equals("")) {
                continue;
            }
            out += "/" + oldPathList[i];
        }

        for(int i = 0; i < newPathList.length; i++) {
            if(!newPathList[i].equals("..")) {
                out += "/" + newPathList[i];
            }
        }

        this.path = out;
    }

    public static void main(String[] args) {
        Path path = new Path("/a/b/c/d");
        path.cd("../x");
        System.out.println(path.getPath());
    }
}