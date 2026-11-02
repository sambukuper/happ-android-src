package defpackage;

import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class np4 {
    public final f63 a;

    public np4(b39 b39Var, b39 b39Var2, ss5 ss5Var) {
        this.a = new f63((Object) b39Var, (Object) b39Var2, (Object) ss5Var, (byte) 11);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0109  */
    /* JADX WARN: Code duplicated, block: B:41:0x0112  */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    /* JADX WARN: Code duplicated, block: B:44:0x0128  */
    /* JADX WARN: Code duplicated, block: B:45:0x013a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0143  */
    /* JADX WARN: Code duplicated, block: B:49:0x014c  */
    /* JADX WARN: Code duplicated, block: B:50:0x015a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0167  */
    /* JADX WARN: Code duplicated, block: B:53:0x016b  */
    /* JADX WARN: Code duplicated, block: B:55:0x017a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0183  */
    /* JADX WARN: Code duplicated, block: B:57:0x0191  */
    /* JADX WARN: Code duplicated, block: B:58:0x019b  */
    /* JADX WARN: Code duplicated, block: B:60:0x019f  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f6  */
    public static int a(f63 f63Var, Object obj, Object obj2) {
        int iJ;
        int size;
        int i;
        int i2;
        b39 b39Var;
        int iH;
        int size2;
        int i3;
        b39 b39Var2 = (b39) f63Var.Y;
        int i4 = c92.c;
        int iJ2 = 1;
        int iH2 = mv0.h(1);
        v29 v29Var = b39.f0;
        if (b39Var2 == v29Var) {
            iH2 *= 2;
        }
        switch (b39Var2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iJ = 8;
                i2 = iJ + iH2;
                b39Var = (b39) f63Var.Z;
                iH = mv0.h(2);
                if (b39Var == v29Var) {
                    iH *= 2;
                }
                switch (b39Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = mv0.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((cq2) ((e2) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((cq2) ((e2) obj2)).a(null);
                        i3 = mv0.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = mv0.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        iJ2 = mv0.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        int iIntValue = ((Integer) obj2).intValue();
                        iJ2 = mv0.i((iIntValue >> 31) ^ (iIntValue << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iJ2 = mv0.j((jLongValue >> 63) ^ (jLongValue << 1));
                        return iJ2 + iH + i2;
                    default:
                        kp5.t("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 1:
                ((Float) obj).getClass();
                iJ = 4;
                i2 = iJ + iH2;
                b39Var = (b39) f63Var.Z;
                iH = mv0.h(2);
                if (b39Var == v29Var) {
                    iH *= 2;
                }
                switch (b39Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = mv0.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((cq2) ((e2) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((cq2) ((e2) obj2)).a(null);
                        i3 = mv0.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = mv0.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        iJ2 = mv0.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iJ2 = mv0.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iJ2 = mv0.j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                        return iJ2 + iH + i2;
                    default:
                        kp5.t("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 2:
                iJ = mv0.j(((Long) obj).longValue());
                i2 = iJ + iH2;
                b39Var = (b39) f63Var.Z;
                iH = mv0.h(2);
                if (b39Var == v29Var) {
                    iH *= 2;
                }
                switch (b39Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = mv0.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((cq2) ((e2) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((cq2) ((e2) obj2)).a(null);
                        i3 = mv0.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = mv0.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        iJ2 = mv0.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iJ2 = mv0.i((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iJ2 = mv0.j((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                        return iJ2 + iH + i2;
                    default:
                        kp5.t("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 3:
                iJ = mv0.j(((Long) obj).longValue());
                i2 = iJ + iH2;
                b39Var = (b39) f63Var.Z;
                iH = mv0.h(2);
                if (b39Var == v29Var) {
                    iH *= 2;
                }
                switch (b39Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = mv0.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((cq2) ((e2) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((cq2) ((e2) obj2)).a(null);
                        i3 = mv0.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = mv0.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        iJ2 = mv0.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iJ2 = mv0.i((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iJ2 = mv0.j((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                        return iJ2 + iH + i2;
                    default:
                        kp5.t("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 4:
                iJ = mv0.j(((Integer) obj).intValue());
                i2 = iJ + iH2;
                b39Var = (b39) f63Var.Z;
                iH = mv0.h(2);
                if (b39Var == v29Var) {
                    iH *= 2;
                }
                switch (b39Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = mv0.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((cq2) ((e2) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((cq2) ((e2) obj2)).a(null);
                        i3 = mv0.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = mv0.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        iJ2 = mv0.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iJ2 = mv0.i((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iJ2 = mv0.j((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                        return iJ2 + iH + i2;
                    default:
                        kp5.t("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 5:
                ((Long) obj).getClass();
                iJ = 8;
                i2 = iJ + iH2;
                b39Var = (b39) f63Var.Z;
                iH = mv0.h(2);
                if (b39Var == v29Var) {
                    iH *= 2;
                }
                switch (b39Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = mv0.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((cq2) ((e2) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((cq2) ((e2) obj2)).a(null);
                        i3 = mv0.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = mv0.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        iJ2 = mv0.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iJ2 = mv0.i((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iJ2 = mv0.j((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                        return iJ2 + iH + i2;
                    default:
                        kp5.t("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 6:
                ((Integer) obj).getClass();
                iJ = 4;
                i2 = iJ + iH2;
                b39Var = (b39) f63Var.Z;
                iH = mv0.h(2);
                if (b39Var == v29Var) {
                    iH *= 2;
                }
                switch (b39Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = mv0.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((cq2) ((e2) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((cq2) ((e2) obj2)).a(null);
                        i3 = mv0.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = mv0.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        iJ2 = mv0.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iJ2 = mv0.i((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iJ2 = mv0.j((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                        return iJ2 + iH + i2;
                    default:
                        kp5.t("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 7:
                ((Boolean) obj).getClass();
                iJ = 1;
                i2 = iJ + iH2;
                b39Var = (b39) f63Var.Z;
                iH = mv0.h(2);
                if (b39Var == v29Var) {
                    iH *= 2;
                }
                switch (b39Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = mv0.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((cq2) ((e2) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((cq2) ((e2) obj2)).a(null);
                        i3 = mv0.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = mv0.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        iJ2 = mv0.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iJ2 = mv0.i((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iJ2 = mv0.j((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                        return iJ2 + iH + i2;
                    default:
                        kp5.t("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 8:
                if (obj instanceof hb0) {
                    size = ((hb0) obj).size();
                    i = mv0.i(size);
                    iJ = size + i;
                } else {
                    iJ = mv0.g((String) obj);
                }
                i2 = iJ + iH2;
                b39Var = (b39) f63Var.Z;
                iH = mv0.h(2);
                if (b39Var == v29Var) {
                    iH *= 2;
                }
                switch (b39Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = mv0.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((cq2) ((e2) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((cq2) ((e2) obj2)).a(null);
                        i3 = mv0.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = mv0.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        iJ2 = mv0.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iJ2 = mv0.i((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iJ2 = mv0.j((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                        return iJ2 + iH + i2;
                    default:
                        kp5.t("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 9:
                iJ = ((cq2) ((e2) obj)).a(null);
                i2 = iJ + iH2;
                b39Var = (b39) f63Var.Z;
                iH = mv0.h(2);
                if (b39Var == v29Var) {
                    iH *= 2;
                }
                switch (b39Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = mv0.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((cq2) ((e2) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((cq2) ((e2) obj2)).a(null);
                        i3 = mv0.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = mv0.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        iJ2 = mv0.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iJ2 = mv0.i((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iJ2 = mv0.j((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                        return iJ2 + iH + i2;
                    default:
                        kp5.t("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 10:
                size = ((cq2) ((e2) obj)).a(null);
                i = mv0.i(size);
                iJ = size + i;
                i2 = iJ + iH2;
                b39Var = (b39) f63Var.Z;
                iH = mv0.h(2);
                if (b39Var == v29Var) {
                    iH *= 2;
                }
                switch (b39Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = mv0.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((cq2) ((e2) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((cq2) ((e2) obj2)).a(null);
                        i3 = mv0.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = mv0.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        iJ2 = mv0.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iJ2 = mv0.i((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iJ2 = mv0.j((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                        return iJ2 + iH + i2;
                    default:
                        kp5.t("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 11:
                if (obj instanceof hb0) {
                    size = ((hb0) obj).size();
                    i = mv0.i(size);
                } else {
                    size = ((byte[]) obj).length;
                    i = mv0.i(size);
                }
                iJ = size + i;
                i2 = iJ + iH2;
                b39Var = (b39) f63Var.Z;
                iH = mv0.h(2);
                if (b39Var == v29Var) {
                    iH *= 2;
                }
                switch (b39Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = mv0.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((cq2) ((e2) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((cq2) ((e2) obj2)).a(null);
                        i3 = mv0.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = mv0.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        iJ2 = mv0.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iJ2 = mv0.i((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iJ2 = mv0.j((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                        return iJ2 + iH + i2;
                    default:
                        kp5.t("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                iJ = mv0.i(((Integer) obj).intValue());
                i2 = iJ + iH2;
                b39Var = (b39) f63Var.Z;
                iH = mv0.h(2);
                if (b39Var == v29Var) {
                    iH *= 2;
                }
                switch (b39Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = mv0.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((cq2) ((e2) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((cq2) ((e2) obj2)).a(null);
                        i3 = mv0.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = mv0.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        iJ2 = mv0.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iJ2 = mv0.i((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iJ2 = mv0.j((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                        return iJ2 + iH + i2;
                    default:
                        kp5.t("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 13:
                iJ = mv0.j(((Integer) obj).intValue());
                i2 = iJ + iH2;
                b39Var = (b39) f63Var.Z;
                iH = mv0.h(2);
                if (b39Var == v29Var) {
                    iH *= 2;
                }
                switch (b39Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = mv0.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((cq2) ((e2) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((cq2) ((e2) obj2)).a(null);
                        i3 = mv0.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = mv0.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        iJ2 = mv0.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iJ2 = mv0.i((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iJ2 = mv0.j((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                        return iJ2 + iH + i2;
                    default:
                        kp5.t("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 14:
                ((Integer) obj).getClass();
                iJ = 4;
                i2 = iJ + iH2;
                b39Var = (b39) f63Var.Z;
                iH = mv0.h(2);
                if (b39Var == v29Var) {
                    iH *= 2;
                }
                switch (b39Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = mv0.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((cq2) ((e2) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((cq2) ((e2) obj2)).a(null);
                        i3 = mv0.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = mv0.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        iJ2 = mv0.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iJ2 = mv0.i((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iJ2 = mv0.j((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                        return iJ2 + iH + i2;
                    default:
                        kp5.t("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 15:
                ((Long) obj).getClass();
                iJ = 8;
                i2 = iJ + iH2;
                b39Var = (b39) f63Var.Z;
                iH = mv0.h(2);
                if (b39Var == v29Var) {
                    iH *= 2;
                }
                switch (b39Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = mv0.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((cq2) ((e2) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((cq2) ((e2) obj2)).a(null);
                        i3 = mv0.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = mv0.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        iJ2 = mv0.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iJ2 = mv0.i((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iJ2 = mv0.j((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                        return iJ2 + iH + i2;
                    default:
                        kp5.t("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                int iIntValue17 = ((Integer) obj).intValue();
                iJ = mv0.i((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                i2 = iJ + iH2;
                b39Var = (b39) f63Var.Z;
                iH = mv0.h(2);
                if (b39Var == v29Var) {
                    iH *= 2;
                }
                switch (b39Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = mv0.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((cq2) ((e2) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((cq2) ((e2) obj2)).a(null);
                        i3 = mv0.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = mv0.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        iJ2 = mv0.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iJ2 = mv0.i((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iJ2 = mv0.j((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                        return iJ2 + iH + i2;
                    default:
                        kp5.t("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iJ = mv0.j((jLongValue18 >> 63) ^ (jLongValue18 << 1));
                i2 = iJ + iH2;
                b39Var = (b39) f63Var.Z;
                iH = mv0.h(2);
                if (b39Var == v29Var) {
                    iH *= 2;
                }
                switch (b39Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 2:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 3:
                        iJ2 = mv0.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case 4:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 5:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 6:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case 8:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = mv0.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((cq2) ((e2) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((cq2) ((e2) obj2)).a(null);
                        i3 = mv0.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof hb0) {
                            size2 = ((hb0) obj2).size();
                            i3 = mv0.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = mv0.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        iJ2 = mv0.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = mv0.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iJ2 = mv0.i((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iJ2 = mv0.j((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                        return iJ2 + iH + i2;
                    default:
                        kp5.t("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            default:
                kp5.t("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }
}
