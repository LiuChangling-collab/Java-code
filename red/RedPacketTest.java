package red;

public class RedPacketTest {
    public static void main(String[] args) {
        RedPacket rp = new RedPacket("普通红包");

        rp.setOwnerName("李哥");
        NormalMode normal = new NormalMode();
        rp.setOpenWay(normal);
    }
}

