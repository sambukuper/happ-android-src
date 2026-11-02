package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x78 {
    public final w78 a;
    public final bz4 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public x78(w78 w78Var, bz4 bz4Var, long j) {
        float lineBaseline;
        this.a = w78Var;
        this.b = bz4Var;
        this.c = j;
        ArrayList arrayList = bz4Var.h;
        float fH = 0.0f;
        if (arrayList.isEmpty()) {
            lineBaseline = 0.0f;
        } else {
            v78 v78Var = ((tg5) arrayList.get(0)).a.d;
            Paint.FontMetricsInt fontMetricsInt = v78Var.l;
            lineBaseline = v78Var.h + ((v78Var.g + (-1) != 0 || fontMetricsInt == null) ? v78Var.f.getLineBaseline(0) : v78Var.h(0) - fontMetricsInt.ascent) + 0.0f;
        }
        this.d = lineBaseline;
        if (!arrayList.isEmpty()) {
            tg5 tg5Var = (tg5) wv0.A0(arrayList);
            v78 v78Var2 = tg5Var.a.d;
            int i = v78Var2.g - 1;
            Paint.FontMetricsInt fontMetricsInt2 = v78Var2.l;
            fH = v78Var2.h + (fontMetricsInt2 != null ? v78Var2.h(i) - fontMetricsInt2.ascent : v78Var2.f.getLineBaseline(i)) + 0.0f + tg5Var.f;
        }
        this.e = fH;
        this.f = bz4Var.g;
    }

    public final lf6 a(int i) {
        bz4 bz4Var = this.b;
        bz4Var.k(i);
        int length = ((ql) bz4Var.a.Y).Y.length();
        ArrayList arrayList = bz4Var.h;
        tg5 tg5Var = (tg5) arrayList.get(i == length ? arrayList.size() - 1 : oc.p(i, arrayList));
        return tg5Var.a.d.f.isRtlCharAt(tg5Var.d(i)) ? lf6.Y : lf6.X;
    }

    public final s86 b(int i) {
        float fJ;
        float fJ2;
        float fI;
        float fI2;
        bz4 bz4Var = this.b;
        bz4Var.j(i);
        ArrayList arrayList = bz4Var.h;
        tg5 tg5Var = (tg5) arrayList.get(oc.p(i, arrayList));
        ff ffVar = tg5Var.a;
        int iD = tg5Var.d(i);
        CharSequence charSequence = ffVar.e;
        if (iD < 0 || iD >= charSequence.length()) {
            xc3.a("offset(" + iD + ") is out of bounds [0," + charSequence.length() + ")");
        }
        v78 v78Var = ffVar.d;
        int iF = v78Var.f(iD);
        float fH = v78Var.h(iF);
        float fD = v78Var.d(iF);
        Layout layout = v78Var.f;
        boolean z = layout.getParagraphDirection(iF) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fI = v78Var.j(iD, false);
                fI2 = v78Var.j(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fI = v78Var.i(iD, false);
                fI2 = v78Var.i(iD + 1, true);
            } else {
                fJ = v78Var.j(iD, false);
                fJ2 = v78Var.j(iD + 1, true);
            }
            float f = fI;
            fJ = fI2;
            fJ2 = f;
        } else {
            fJ = v78Var.i(iD, false);
            fJ2 = v78Var.i(iD + 1, true);
        }
        RectF rectF = new RectF(fJ, fH, fJ2, fD);
        return tg5Var.a(new s86(rectF.left, rectF.top + 0.0f, rectF.right, rectF.bottom + 0.0f));
    }

    public final s86 c(int i) {
        bz4 bz4Var = this.b;
        bz4Var.k(i);
        int length = ((ql) bz4Var.a.Y).Y.length();
        ArrayList arrayList = bz4Var.h;
        tg5 tg5Var = (tg5) arrayList.get(i == length ? arrayList.size() - 1 : oc.p(i, arrayList));
        ff ffVar = tg5Var.a;
        int iD = tg5Var.d(i);
        CharSequence charSequence = ffVar.e;
        v78 v78Var = ffVar.d;
        if (iD < 0 || iD > charSequence.length()) {
            xc3.a("offset(" + iD + ") is out of bounds [0," + charSequence.length() + "]");
        }
        float fI = v78Var.i(iD, false);
        int iF = v78Var.f(iD);
        return tg5Var.a(new s86(fI, v78Var.h(iF) + 0.0f, fI, v78Var.d(iF) + 0.0f));
    }

    public final boolean d() {
        bz4 bz4Var = this.b;
        return bz4Var.c || ((float) ((int) (this.c & 4294967295L))) < bz4Var.e;
    }

    public final float e(int i, boolean z) {
        bz4 bz4Var = this.b;
        bz4Var.k(i);
        int length = ((ql) bz4Var.a.Y).Y.length();
        ArrayList arrayList = bz4Var.h;
        tg5 tg5Var = (tg5) arrayList.get(i == length ? arrayList.size() - 1 : oc.p(i, arrayList));
        ff ffVar = tg5Var.a;
        int iD = tg5Var.d(i);
        v78 v78Var = ffVar.d;
        return z ? v78Var.i(iD, false) : v78Var.j(iD, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x78) {
            x78 x78Var = (x78) obj;
            if (this.a.equals(x78Var.a) && this.b == x78Var.b && pf3.a(this.c, x78Var.c) && this.d == x78Var.d && this.e == x78Var.e && this.f.equals(x78Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final float f(int i) {
        bz4 bz4Var = this.b;
        bz4Var.l(i);
        ArrayList arrayList = bz4Var.h;
        tg5 tg5Var = (tg5) arrayList.get(oc.q(i, arrayList));
        ff ffVar = tg5Var.a;
        int i2 = i - tg5Var.d;
        v78 v78Var = ffVar.d;
        return v78Var.f.getLineLeft(i2) + (i2 == v78Var.g + (-1) ? v78Var.j : 0.0f);
    }

    public final float g(int i) {
        bz4 bz4Var = this.b;
        bz4Var.l(i);
        ArrayList arrayList = bz4Var.h;
        tg5 tg5Var = (tg5) arrayList.get(oc.q(i, arrayList));
        ff ffVar = tg5Var.a;
        int i2 = i - tg5Var.d;
        v78 v78Var = ffVar.d;
        return v78Var.f.getLineRight(i2) + (i2 == v78Var.g + (-1) ? v78Var.k : 0.0f);
    }

    public final int h(int i) {
        bz4 bz4Var = this.b;
        bz4Var.l(i);
        ArrayList arrayList = bz4Var.h;
        tg5 tg5Var = (tg5) arrayList.get(oc.q(i, arrayList));
        ff ffVar = tg5Var.a;
        return ffVar.d.f.getLineStart(i - tg5Var.d) + tg5Var.b;
    }

    public final int hashCode() {
        return this.f.hashCode() + pc6.d(pc6.d(p61.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), this.d, 31), this.e, 31);
    }

    public final lf6 i(int i) {
        bz4 bz4Var = this.b;
        bz4Var.k(i);
        int length = ((ql) bz4Var.a.Y).Y.length();
        ArrayList arrayList = bz4Var.h;
        tg5 tg5Var = (tg5) arrayList.get(i == length ? arrayList.size() - 1 : oc.p(i, arrayList));
        ff ffVar = tg5Var.a;
        int iD = tg5Var.d(i);
        v78 v78Var = ffVar.d;
        return v78Var.f.getParagraphDirection(v78Var.f(iD)) == 1 ? lf6.X : lf6.Y;
    }

    public final lf j(int i, int i2) {
        bz4 bz4Var = this.b;
        ql qlVar = (ql) bz4Var.a.Y;
        if (i < 0 || i > i2 || i2 > qlVar.Y.length()) {
            int length = qlVar.Y.length();
            StringBuilder sbR = oi0.r(i, "Start(", i2, ") or End(", ") is out of range [0..");
            sbR.append(length);
            sbR.append("), or start > end!");
            xc3.a(sbR.toString());
        }
        if (i == i2) {
            return nf.a();
        }
        lf lfVarA = nf.a();
        oc.s(bz4Var.h, ct7.c(i, i2), new o73((Object) lfVarA, i, i2, (byte) 3));
        return lfVarA;
    }

    public final long k(int i) {
        int iQ;
        int iH;
        int iH2;
        bz4 bz4Var = this.b;
        bz4Var.k(i);
        int length = ((ql) bz4Var.a.Y).Y.length();
        ArrayList arrayList = bz4Var.h;
        tg5 tg5Var = (tg5) arrayList.get(i == length ? arrayList.size() - 1 : oc.p(i, arrayList));
        ff ffVar = tg5Var.a;
        int iD = tg5Var.d(i);
        nv0 nv0VarK = ffVar.d.k();
        if (nv0VarK.E(nv0VarK.Q(iD))) {
            nv0VarK.h(iD);
            iQ = iD;
            while (iQ != -1 && (!nv0VarK.E(iQ) || nv0VarK.A(iQ))) {
                iQ = nv0VarK.Q(iQ);
            }
        } else {
            nv0VarK.h(iD);
            if (nv0VarK.D(iD)) {
                iQ = (!nv0VarK.B(iD) || nv0VarK.z(iD)) ? nv0VarK.Q(iD) : iD;
            } else {
                iQ = nv0VarK.z(iD) ? nv0VarK.Q(iD) : -1;
            }
        }
        if (iQ == -1) {
            iQ = iD;
        }
        if (nv0VarK.A(nv0VarK.H(iD))) {
            nv0VarK.h(iD);
            iH = iD;
            while (iH != -1 && (nv0VarK.E(iH) || !nv0VarK.A(iH))) {
                iH = nv0VarK.H(iH);
            }
        } else {
            nv0VarK.h(iD);
            if (nv0VarK.z(iD)) {
                if (!nv0VarK.B(iD) || nv0VarK.D(iD)) {
                    iH2 = nv0VarK.H(iD);
                    iH = iH2;
                } else {
                    iH = iD;
                }
            } else if (nv0VarK.D(iD)) {
                iH2 = nv0VarK.H(iD);
                iH = iH2;
            } else {
                iH = -1;
            }
        }
        if (iH != -1) {
            iD = iH;
        }
        return tg5Var.b(ct7.c(iQ, iD), false);
    }

    public final boolean l(int i) {
        bz4 bz4Var = this.b;
        bz4Var.l(i);
        ArrayList arrayList = bz4Var.h;
        tg5 tg5Var = (tg5) arrayList.get(oc.q(i, arrayList));
        ff ffVar = tg5Var.a;
        int i2 = i - tg5Var.d;
        Layout layout = ffVar.d.f;
        ThreadLocal threadLocal = z78.a;
        return layout.getEllipsisCount(i2) > 0;
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + pf3.b(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ")";
    }
}
