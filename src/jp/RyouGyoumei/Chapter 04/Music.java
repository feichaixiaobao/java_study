public class Music {
    private String name; // 音乐名
    private int times; // 音乐时长（单位：秒）

    public Music(String name, int times) {
        this.name = name;
        this.times = times;
    }

    public void play() {
        System.out.println("播放中：" + this.name);
    }

    public String getInfo() {
        return "音乐名称：" + this.name + "\n时长：" + this.times + " 秒";
    }

}