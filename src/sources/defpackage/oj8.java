package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oj8 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final z47 b;
    public volatile int c = 0;

    public oj8(z47 z47Var, int i) {
        this.b = z47Var;
        this.a = i;
    }

    public final int a(int i) {
        dv4 dv4VarB = b();
        int iA = dv4VarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) dv4VarB.f0;
        int i2 = iA + dv4VarB.X;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final dv4 b() {
        ThreadLocal threadLocal = d;
        dv4 dv4Var = (dv4) threadLocal.get();
        if (dv4Var == null) {
            dv4Var = new dv4();
            threadLocal.set(dv4Var);
        }
        ev4 ev4Var = (ev4) this.b.Y;
        int iA = ev4Var.a(6);
        if (iA != 0) {
            int i = iA + ev4Var.X;
            int i2 = (this.a * 4) + ((ByteBuffer) ev4Var.f0).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) ev4Var.f0).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) ev4Var.f0;
            dv4Var.f0 = byteBuffer;
            if (byteBuffer != null) {
                dv4Var.X = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                dv4Var.Y = i4;
                dv4Var.Z = ((ByteBuffer) dv4Var.f0).getShort(i4);
                return dv4Var;
            }
            dv4Var.X = 0;
            dv4Var.Y = 0;
            dv4Var.Z = 0;
        }
        return dv4Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        dv4 dv4VarB = b();
        int iA = dv4VarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) dv4VarB.f0).getInt(iA + dv4VarB.X) : 0));
        sb.append(", codepoints:");
        dv4 dv4VarB2 = b();
        int iA2 = dv4VarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + dv4VarB2.X;
            i = ((ByteBuffer) dv4VarB2.f0).getInt(((ByteBuffer) dv4VarB2.f0).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
