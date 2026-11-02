package defpackage;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o73 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ Object f0;

    public /* synthetic */ o73(int i, int i2, m73 m73Var, byte b) {
        this.X = b;
        this.Y = i;
        this.Z = i2;
        this.f0 = m73Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        int i = this.Z;
        int i2 = this.Y;
        Object obj2 = this.f0;
        switch (b) {
            case 0:
                m73 m73Var = (m73) obj2;
                g48 g48Var = (g48) obj;
                long jF = m73Var.f(ct7.c(0, g48Var.Z.length()));
                int iD = f88.d(jF);
                int iC = f88.c(jF);
                if (i2 < iD) {
                    i2 = iD;
                }
                if (i2 <= iC) {
                    iC = i2;
                }
                int iD2 = f88.d(jF);
                int iC2 = f88.c(jF);
                if (i < iD2) {
                    i = iD2;
                }
                if (i <= iC2) {
                    iC2 = i;
                }
                g48Var.g(m73Var.b(ct7.c(iC, iC2)));
                break;
            case 1:
                m73 m73Var2 = (m73) obj2;
                g48 g48Var2 = (g48) obj;
                if (i2 < 0 || i < 0) {
                    zc3.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i2 + " and " + i + " respectively.");
                }
                long jF2 = m73Var2.f(g48Var2.i0);
                int iC3 = f88.c(jF2);
                int iA = iC3 + i;
                if (((iC3 ^ iA) & (i ^ iA)) < 0) {
                    iA = m73Var2.a();
                }
                long jB = m73Var2.b(ct7.c(f88.c(jF2), Math.min(iA, m73Var2.a())));
                w79.D(g48Var2, f88.d(jB), f88.c(jB));
                int iD3 = f88.d(jF2);
                int i3 = iD3 - i2;
                if (((iD3 ^ i3) & (i2 ^ iD3)) < 0) {
                    i3 = 0;
                }
                long jB2 = m73Var2.b(ct7.c(Math.max(0, i3), f88.d(jF2)));
                w79.D(g48Var2, f88.d(jB2), f88.c(jB2));
                break;
            case 2:
                m73 m73Var3 = (m73) obj2;
                g48 g48Var3 = (g48) obj;
                f88 f88Var = g48Var3.j0;
                mi5 mi5Var = g48Var3.Z;
                if (f88Var != null) {
                    g48Var3.f(null);
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i < 0) {
                    i = 0;
                }
                long jB3 = m73Var3.b(ct7.c(i2, i));
                int iN = x97.n(f88.d(jB3), 0, mi5Var.length());
                int iN2 = x97.n(f88.c(jB3), 0, mi5Var.length());
                if (iN != iN2) {
                    if (iN >= iN2) {
                        g48Var3.e(iN2, iN, null);
                    } else {
                        g48Var3.e(iN, iN2, null);
                    }
                }
                break;
            default:
                lf lfVar = (lf) obj2;
                tg5 tg5Var = (tg5) obj;
                ff ffVar = tg5Var.a;
                int iD4 = tg5Var.d(i2);
                int iD5 = tg5Var.d(i);
                CharSequence charSequence = ffVar.e;
                if (iD4 < 0 || iD4 > iD5 || iD5 > charSequence.length()) {
                    int length = charSequence.length();
                    StringBuilder sbR = oi0.r(iD4, "start(", iD5, ") or end(", ") is out of range [0..");
                    sbR.append(length);
                    sbR.append("], or start > end!");
                    xc3.a(sbR.toString());
                }
                Path path = new Path();
                v78 v78Var = ffVar.d;
                v78Var.f.getSelectionPath(iD4, iD5, path);
                int i4 = v78Var.h;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                lf lfVar2 = new lf(path);
                lfVar2.h((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(tg5Var.f)) & 4294967295L));
                lf.a(lfVar, lfVar2);
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ o73(Object obj, int i, int i2, byte b) {
        this.X = b;
        this.f0 = obj;
        this.Y = i;
        this.Z = i2;
    }
}
