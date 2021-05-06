package red;

public class RedPacketTest1 {
    public static void main(String[] args) {
        RedPacket rp = new RedPacket("手气红包");

        rp.setOwnerName("简幺儿");
        RondomMode rondom = new RondomMode();
        rp.setOpenWay(rondom);
    }
}
