package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yk7 {
    public final int a;

    public /* synthetic */ yk7(int i) {
        this.a = i;
    }

    public static final String a(int i) {
        if (i == 0) {
            return "UNKNOWN";
        }
        if (i == 34) {
            return "PRIVATE";
        }
        if (i == 1144402265) {
            return "DEPTH16";
        }
        if (i == 1768253795) {
            return "DEPTH_JPEG";
        }
        if (i == 257) {
            return "DEPTH_POINT_CLOUD";
        }
        if (i == 41) {
            return "FLEX_RGB_888";
        }
        if (i == 42) {
            return "FLEX_RGBA_8888";
        }
        if (i == 1212500294) {
            return "HEIC";
        }
        if (i == 256) {
            return "JPEG";
        }
        if (i == 4101) {
            return "JPEG_R";
        }
        if (i == 16) {
            return "NV16";
        }
        if (i == 17) {
            return "NV21";
        }
        if (i == 37) {
            return "RAW10";
        }
        if (i == 38) {
            return "RAW12";
        }
        if (i == 4098) {
            return "RAW_DEPTH";
        }
        if (i == 36) {
            return "RAW_PRIVATE";
        }
        if (i == 32) {
            return "RAW_SENSOR";
        }
        if (i == 4) {
            return "RGB_565";
        }
        if (i == 842094169) {
            return "Y12";
        }
        if (i == 540422489) {
            return "Y16";
        }
        if (i == 538982489) {
            return "Y8";
        }
        if (i == 54) {
            return "YCBCR_P010";
        }
        if (i == 35) {
            return "YUV_420_888";
        }
        if (i == 39) {
            return "YUV_422_888";
        }
        if (i == 40) {
            return "YUV_444_888";
        }
        if (i == 20) {
            return "YUY2";
        }
        if (i == 842094169) {
            return "YV12";
        }
        StringBuilder sb = new StringBuilder("UNKNOWN(");
        km4.q(16);
        String string = Integer.toString(i, 16);
        string.getClass();
        sb.append(string);
        sb.append(')');
        return sb.toString();
    }

    public static String b(int i) {
        return "StreamFormat(" + a(i) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yk7) {
            return this.a == ((yk7) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
