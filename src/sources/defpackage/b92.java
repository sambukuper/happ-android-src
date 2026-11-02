package defpackage;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b92 {
    public static final b92 c = new b92(0);
    public final gc7 a = new gc7(16);
    public boolean b;

    public b92(int i) {
        f();
    }

    public static int c(a39 a39Var, Object obj) {
        switch (a39Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return nv0.q(((Long) obj).longValue());
            case 3:
                return nv0.q(((Long) obj).longValue());
            case 4:
                return nv0.m(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return nv0.p(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    xw3.o("UTF-8 not supported.", e);
                    return 0;
                }
            case 9:
                return ((d2) obj).b();
            case 10:
                return nv0.o((d2) obj);
            case 11:
                if (obj instanceof jb0) {
                    jb0 jb0Var = (jb0) obj;
                    return jb0Var.size() + nv0.p(jb0Var.size());
                }
                byte[] bArr = (byte[]) obj;
                return nv0.p(bArr.length) + bArr.length;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return nv0.p(((Integer) obj).intValue());
            case 13:
                return obj instanceof bg3 ? nv0.m(((bg3) obj).a()) : nv0.m(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                return nv0.p((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return nv0.q((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                kp5.t("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public static int d(zp2 zp2Var, Object obj) {
        a39 a39Var = zp2Var.Y;
        short s = zp2Var.X;
        if (!zp2Var.Z) {
            int iR = nv0.r(s);
            if (a39Var == a39.g0) {
                iR *= 2;
            }
            return c(a39Var, obj) + iR;
        }
        int iC = 0;
        for (Object obj2 : (List) obj) {
            int iR2 = nv0.r(s);
            if (a39Var == a39.g0) {
                iR2 *= 2;
            }
            iC += c(a39Var, obj2) + iR2;
        }
        return iC;
    }

    public static boolean e(Map.Entry entry) {
        zp2 zp2Var = (zp2) entry.getKey();
        if (zp2Var.Y.X != c39.l0) {
            return true;
        }
        if (zp2Var.Z) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((d2) it.next()).d()) {
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (!(value instanceof d2)) {
            bt.q("Wrong object type used with protocol message reflection.");
            return false;
        }
        if (((d2) value).d()) {
            return true;
        }
        return false;
    }

    public static Object h(iv0 iv0Var, a39 a39Var) {
        switch (a39Var.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(iv0Var.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(iv0Var.i()));
            case 2:
                return Long.valueOf(iv0Var.l());
            case 3:
                return Long.valueOf(iv0Var.l());
            case 4:
                return Integer.valueOf(iv0Var.k());
            case 5:
                return Long.valueOf(iv0Var.j());
            case 6:
                return Integer.valueOf(iv0Var.i());
            case 7:
                return Boolean.valueOf(iv0Var.l() != 0);
            case 8:
                int iK = iv0Var.k();
                int i = iv0Var.b;
                int i2 = iv0Var.d;
                if (iK > i - i2 || iK <= 0) {
                    return iK == 0 ? _UrlKt.FRAGMENT_ENCODE_SET : new String(iv0Var.h(iK), "UTF-8");
                }
                String str = new String(iv0Var.a, i2, iK, "UTF-8");
                iv0Var.d += iK;
                return str;
            case 9:
                bt.q("readPrimitiveField() cannot handle nested groups.");
                return null;
            case 10:
                bt.q("readPrimitiveField() cannot handle embedded messages.");
                return null;
            case 11:
                return iv0Var.f();
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return Integer.valueOf(iv0Var.k());
            case 13:
                bt.q("readPrimitiveField() cannot handle enums.");
                return null;
            case 14:
                return Integer.valueOf(iv0Var.i());
            case 15:
                return Long.valueOf(iv0Var.j());
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                int iK2 = iv0Var.k();
                return Integer.valueOf((-(iK2 & 1)) ^ (iK2 >>> 1));
            case 17:
                long jL = iv0Var.l();
                return Long.valueOf((-(jL & 1)) ^ (jL >>> 1));
            default:
                kp5.t("There is no way to get here, but the compiler thinks otherwise.");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    public static void j(a39 a39Var, Object obj) {
        obj.getClass();
        boolean z = true;
        boolean z2 = false;
        switch (a39Var.X) {
            case Y:
                z2 = obj instanceof Integer;
                break;
            case Z:
                z2 = obj instanceof Long;
                break;
            case f0:
                z2 = obj instanceof Float;
                break;
            case g0:
                z2 = obj instanceof Double;
                break;
            case h0:
                z2 = obj instanceof Boolean;
                break;
            case i0:
                z2 = obj instanceof String;
                break;
            case j0:
                if (!(obj instanceof jb0) && !(obj instanceof byte[])) {
                    z = false;
                }
                z2 = z;
                break;
            case k0:
                if (!(obj instanceof Integer) && !(obj instanceof bg3)) {
                    z = false;
                }
                z2 = z;
                break;
            case l0:
                z2 = obj instanceof d2;
                break;
        }
        if (z2) {
            return;
        }
        bt.q("Wrong object type used with protocol message reflection.");
    }

    public static void k(nv0 nv0Var, a39 a39Var, Object obj) throws IOException {
        switch (a39Var.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                nv0Var.getClass();
                nv0Var.d0(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                nv0Var.getClass();
                nv0Var.c0(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                nv0Var.f0(((Long) obj).longValue());
                break;
            case 3:
                nv0Var.f0(((Long) obj).longValue());
                break;
            case 4:
                nv0Var.W(((Integer) obj).intValue());
                break;
            case 5:
                nv0Var.d0(((Long) obj).longValue());
                break;
            case 6:
                nv0Var.c0(((Integer) obj).intValue());
                break;
            case 7:
                nv0Var.Z(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                nv0Var.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                nv0Var.e0(bytes.length);
                nv0Var.b0(bytes);
                break;
            case 9:
                nv0Var.getClass();
                ((d2) obj).f(nv0Var);
                break;
            case 10:
                nv0Var.Y((d2) obj);
                break;
            case 11:
                if (!(obj instanceof jb0)) {
                    byte[] bArr = (byte[]) obj;
                    nv0Var.getClass();
                    nv0Var.e0(bArr.length);
                    nv0Var.b0(bArr);
                } else {
                    jb0 jb0Var = (jb0) obj;
                    nv0Var.getClass();
                    nv0Var.e0(jb0Var.size());
                    nv0Var.a0(jb0Var);
                }
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                nv0Var.e0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof bg3)) {
                    nv0Var.W(((Integer) obj).intValue());
                } else {
                    nv0Var.W(((bg3) obj).a());
                }
                break;
            case 14:
                nv0Var.c0(((Integer) obj).intValue());
                break;
            case 15:
                nv0Var.d0(((Long) obj).longValue());
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                nv0Var.e0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                nv0Var.f0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(zp2 zp2Var, Object obj) {
        List arrayList;
        if (!zp2Var.Z) {
            bt.q("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        j(zp2Var.Y, obj);
        gc7 gc7Var = this.a;
        Object obj2 = gc7Var.get(zp2Var);
        if (obj2 == null) {
            arrayList = new ArrayList();
            gc7Var.put(zp2Var, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final b92 clone() {
        gc7 gc7Var;
        b92 b92Var = new b92();
        int i = 0;
        while (true) {
            gc7Var = this.a;
            if (i >= gc7Var.Y.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) gc7Var.Y.get(i);
            b92Var.i((zp2) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : gc7Var.c()) {
            b92Var.i((zp2) entry2.getKey(), entry2.getValue());
        }
        return b92Var;
    }

    public final void f() {
        if (this.b) {
            return;
        }
        gc7 gc7Var = this.a;
        if (!gc7Var.f0) {
            for (int i = 0; i < gc7Var.Y.size(); i++) {
                Map.Entry entry = (Map.Entry) gc7Var.Y.get(i);
                if (((zp2) entry.getKey()).Z) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : gc7Var.c()) {
                if (((zp2) entry2.getKey()).Z) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!gc7Var.f0) {
            gc7Var.Z = gc7Var.Z.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(gc7Var.Z);
            gc7Var.f0 = true;
        }
        this.b = true;
    }

    public final void g(Map.Entry entry) {
        zp2 zp2Var = (zp2) entry.getKey();
        Object value = entry.getValue();
        boolean z = zp2Var.Z;
        gc7 gc7Var = this.a;
        if (z) {
            Object arrayList = gc7Var.get(zp2Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            gc7Var.put(zp2Var, arrayList);
            return;
        }
        if (zp2Var.Y.X != c39.l0) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            gc7Var.put(zp2Var, value);
            return;
        }
        Object obj2 = gc7Var.get(zp2Var);
        if (obj2 != null) {
            gc7Var.put(zp2Var, ((d2) obj2).e().e((bq2) ((d2) value)).b());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        gc7Var.put(zp2Var, value);
    }

    public final void i(zp2 zp2Var, Object obj) {
        boolean z = zp2Var.Z;
        a39 a39Var = zp2Var.Y;
        if (!z) {
            j(a39Var, obj);
        } else {
            if (!(obj instanceof List)) {
                bt.q("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(a39Var, it.next());
            }
            obj = arrayList;
        }
        this.a.put(zp2Var, obj);
    }

    public b92() {
    }
}
