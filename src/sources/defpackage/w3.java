package defpackage;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w3 extends v3 {
    public static w3 e;
    public static w3 f;
    public static w3 g;
    public static final lf6 h = lf6.Y;
    public static final lf6 i = lf6.X;
    public final /* synthetic */ byte c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3(byte b) {
        super((byte) 0);
        this.c = b;
    }

    public boolean A(int i2) {
        if (i2 <= 0 || !B(i2 - 1)) {
            return false;
        }
        return i2 == m().length() || !B(i2);
    }

    public boolean B(int i2) {
        if (i2 < 0 || i2 >= m().length()) {
            return false;
        }
        return Character.isLetterOrDigit(m().codePointAt(i2));
    }

    @Override // defpackage.v3
    public final int[] h(int i2) {
        int iC;
        switch (this.c) {
            case 0:
                int length = m().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        dh3.T("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            dh3.T("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i2);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return l(i2, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        dh3.T("impl");
                        throw null;
                    }
                    i2 = breakIterator2.following(i2);
                } while (i2 != -1);
                return null;
            case 1:
                if (m().length() <= 0 || i2 >= m().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!B(i2) && (!B(i2) || (i2 != 0 && B(i2 - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        dh3.T("impl");
                        throw null;
                    }
                    i2 = breakIterator3.following(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    dh3.T("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i2);
                if (iFollowing2 == -1 || !A(iFollowing2)) {
                    return null;
                }
                return l(i2, iFollowing2);
            default:
                if (m().length() <= 0 || i2 >= m().length()) {
                    return null;
                }
                x78 x78Var = (x78) this.d;
                lf6 lf6Var = h;
                if (i2 < 0) {
                    if (x78Var == null) {
                        dh3.T("layoutResult");
                        throw null;
                    }
                    iC = x78Var.b.c(0);
                } else {
                    if (x78Var == null) {
                        dh3.T("layoutResult");
                        throw null;
                    }
                    int iC2 = x78Var.b.c(i2);
                    iC = y(iC2, lf6Var) == i2 ? iC2 : iC2 + 1;
                }
                x78 x78Var2 = (x78) this.d;
                if (x78Var2 == null) {
                    dh3.T("layoutResult");
                    throw null;
                }
                if (iC >= x78Var2.b.f) {
                    return null;
                }
                return l(y(iC, lf6Var), y(iC, i) + 1);
        }
    }

    @Override // defpackage.v3
    public final int[] p(int i2) {
        int iC;
        switch (this.c) {
            case 0:
                int length = m().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        dh3.T("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            dh3.T("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i2);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return l(iPreceding, i2);
                    }
                    if (breakIterator2 == null) {
                        dh3.T("impl");
                        throw null;
                    }
                    i2 = breakIterator2.preceding(i2);
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = m().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !B(i2 - 1) && !A(i2)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        dh3.T("impl");
                        throw null;
                    }
                    i2 = breakIterator3.preceding(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    dh3.T("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i2);
                if (iPreceding2 == -1 || !B(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !B(iPreceding2 - 1)) {
                    return l(iPreceding2, i2);
                }
                return null;
            default:
                if (m().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = m().length();
                x78 x78Var = (x78) this.d;
                lf6 lf6Var = i;
                if (i2 > length3) {
                    if (x78Var == null) {
                        dh3.T("layoutResult");
                        throw null;
                    }
                    iC = x78Var.b.c(m().length());
                } else {
                    if (x78Var == null) {
                        dh3.T("layoutResult");
                        throw null;
                    }
                    int iC2 = x78Var.b.c(i2);
                    iC = y(iC2, lf6Var) + 1 == i2 ? iC2 : iC2 - 1;
                }
                if (iC < 0) {
                    return null;
                }
                return l(y(iC, h), y(iC, lf6Var) + 1);
        }
    }

    public int y(int i2, lf6 lf6Var) {
        x78 x78Var = (x78) this.d;
        if (x78Var == null) {
            dh3.T("layoutResult");
            throw null;
        }
        int iH = x78Var.h(i2);
        x78 x78Var2 = (x78) this.d;
        if (x78Var2 == null) {
            dh3.T("layoutResult");
            throw null;
        }
        lf6 lf6VarI = x78Var2.i(iH);
        x78 x78Var3 = (x78) this.d;
        if (lf6Var != lf6VarI) {
            if (x78Var3 != null) {
                return x78Var3.h(i2);
            }
            dh3.T("layoutResult");
            throw null;
        }
        if (x78Var3 != null) {
            return x78Var3.b.b(i2, false) - 1;
        }
        dh3.T("layoutResult");
        throw null;
    }

    public void z(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    dh3.T("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    dh3.T("impl");
                    throw null;
                }
        }
    }
}
