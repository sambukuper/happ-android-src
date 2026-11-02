package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x3 extends v3 {
    public static x3 e;
    public static final lf6 f = lf6.Y;
    public static final lf6 g = lf6.X;
    public x78 c;
    public y07 d;

    @Override // defpackage.v3
    public final int[] h(int i) {
        int iD;
        if (m().length() > 0 && i < m().length()) {
            try {
                y07 y07Var = this.d;
                if (y07Var == null) {
                    dh3.T("node");
                    throw null;
                }
                s86 s86VarG = y07Var.g();
                int iRound = Math.round(s86VarG.d - s86VarG.b);
                if (i <= 0) {
                    i = 0;
                }
                x78 x78Var = this.c;
                if (x78Var == null) {
                    dh3.T("layoutResult");
                    throw null;
                }
                int iC = x78Var.b.c(i);
                x78 x78Var2 = this.c;
                if (x78Var2 == null) {
                    dh3.T("layoutResult");
                    throw null;
                }
                float fE = x78Var2.b.e(iC) + iRound;
                x78 x78Var3 = this.c;
                if (x78Var3 == null) {
                    dh3.T("layoutResult");
                    throw null;
                }
                bz4 bz4Var = x78Var3.b;
                float fE2 = bz4Var.e(bz4Var.f - 1);
                x78 x78Var4 = this.c;
                if (fE < fE2) {
                    if (x78Var4 == null) {
                        dh3.T("layoutResult");
                        throw null;
                    }
                    iD = x78Var4.b.d(fE);
                } else {
                    if (x78Var4 == null) {
                        dh3.T("layoutResult");
                        throw null;
                    }
                    iD = x78Var4.b.f;
                }
                return l(i, y(iD - 1, g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.v3
    public final int[] p(int i) {
        int iD;
        if (m().length() > 0 && i > 0) {
            try {
                y07 y07Var = this.d;
                if (y07Var == null) {
                    dh3.T("node");
                    throw null;
                }
                s86 s86VarG = y07Var.g();
                int iRound = Math.round(s86VarG.d - s86VarG.b);
                int length = m().length();
                if (length <= i) {
                    i = length;
                }
                x78 x78Var = this.c;
                if (x78Var == null) {
                    dh3.T("layoutResult");
                    throw null;
                }
                int iC = x78Var.b.c(i);
                x78 x78Var2 = this.c;
                if (x78Var2 == null) {
                    dh3.T("layoutResult");
                    throw null;
                }
                float fE = x78Var2.b.e(iC) - iRound;
                if (fE > 0.0f) {
                    x78 x78Var3 = this.c;
                    if (x78Var3 == null) {
                        dh3.T("layoutResult");
                        throw null;
                    }
                    iD = x78Var3.b.d(fE);
                } else {
                    iD = 0;
                }
                if (i == m().length() && iD < iC) {
                    iD++;
                }
                return l(y(iD, f), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int y(int i, lf6 lf6Var) {
        x78 x78Var = this.c;
        if (x78Var == null) {
            dh3.T("layoutResult");
            throw null;
        }
        int iH = x78Var.h(i);
        x78 x78Var2 = this.c;
        if (x78Var2 == null) {
            dh3.T("layoutResult");
            throw null;
        }
        lf6 lf6VarI = x78Var2.i(iH);
        x78 x78Var3 = this.c;
        if (lf6Var != lf6VarI) {
            if (x78Var3 != null) {
                return x78Var3.h(i);
            }
            dh3.T("layoutResult");
            throw null;
        }
        if (x78Var3 != null) {
            return x78Var3.b.b(i, false) - 1;
        }
        dh3.T("layoutResult");
        throw null;
    }
}
