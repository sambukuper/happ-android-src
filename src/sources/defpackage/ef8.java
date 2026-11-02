package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ef8 extends df8 {
    public static ef8 f(ByteBuffer byteBuffer) {
        df8 ff8Var;
        int i;
        ByteOrder byteOrderOrder = byteBuffer.order();
        try {
            cf8 cf8Var = new cf8();
            int i2 = byteBuffer.getInt();
            if (i2 == 845771348) {
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                if (byteOrderOrder == byteOrder) {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                }
                byteBuffer.order(byteOrder);
            } else if (i2 != 1416784178) {
                throw new IllegalArgumentException("Buffer does not contain a serialized UTrie2");
            }
            cf8Var.a = byteBuffer.getChar();
            cf8Var.b = byteBuffer.getChar();
            cf8Var.c = byteBuffer.getChar();
            cf8Var.d = byteBuffer.getChar();
            cf8Var.e = byteBuffer.getChar();
            char c = byteBuffer.getChar();
            int i3 = cf8Var.a & 15;
            if (i3 > 1) {
                throw new IllegalArgumentException("UTrie2 serialized format error.");
            }
            if (i3 == 0) {
                ff8Var = new ef8();
                i = 1;
            } else {
                ff8Var = new ff8();
                i = 2;
            }
            ff8Var.X = cf8Var;
            int i4 = cf8Var.b;
            ff8Var.g0 = i4;
            int i5 = cf8Var.c << 2;
            ff8Var.h0 = i5;
            ff8Var.i0 = cf8Var.d;
            ff8Var.n0 = cf8Var.e;
            ff8Var.l0 = c << 11;
            int i6 = i5 - 4;
            ff8Var.m0 = i6;
            if (i == 1) {
                ff8Var.m0 = i6 + i4;
            }
            if (i == 1) {
                i4 += i5;
            }
            ff8Var.Y = b33.d(i4, byteBuffer);
            if (i == 1) {
                ff8Var.Z = ff8Var.g0;
            } else {
                ff8Var.f0 = b33.f(ff8Var.h0, byteBuffer);
            }
            int iB = p61.B(i);
            if (iB == 0) {
                ff8Var.f0 = null;
                char[] cArr = ff8Var.Y;
                ff8Var.j0 = cArr[ff8Var.n0];
                ff8Var.k0 = cArr[ff8Var.Z + 128];
            } else {
                if (iB != 1) {
                    throw new IllegalArgumentException("UTrie2 serialized format error.");
                }
                ff8Var.Z = 0;
                int[] iArr = ff8Var.f0;
                ff8Var.j0 = iArr[ff8Var.n0];
                ff8Var.k0 = iArr[128];
            }
            byteBuffer.order(byteOrderOrder);
            return (ef8) ff8Var;
        } catch (Throwable th) {
            byteBuffer.order(byteOrderOrder);
            throw th;
        }
    }
}
