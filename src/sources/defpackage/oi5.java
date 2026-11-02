package defpackage;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oi5 implements Comparable {
    public static final String Y;
    public final kb0 X;

    static {
        String str = File.separator;
        str.getClass();
        Y = str;
    }

    public oi5(kb0 kb0Var) {
        kb0Var.getClass();
        this.X = kb0Var;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iC = f.c(this);
        kb0 kb0Var = this.X;
        if (iC == -1) {
            iC = 0;
        } else if (iC < kb0Var.e() && kb0Var.j(iC) == 92) {
            iC++;
        }
        int iE = kb0Var.e();
        int i = iC;
        while (iC < iE) {
            if (kb0Var.j(iC) == 47 || kb0Var.j(iC) == 92) {
                arrayList.add(kb0Var.p(i, iC));
                i = iC + 1;
            }
            iC++;
        }
        if (i < kb0Var.e()) {
            arrayList.add(kb0Var.p(i, kb0Var.e()));
        }
        return arrayList;
    }

    public final String b() {
        kb0 kb0Var = f.a;
        kb0 kb0VarQ = this.X;
        int iL = kb0.l(kb0VarQ, kb0Var);
        if (iL == -1) {
            iL = kb0.l(kb0VarQ, f.b);
        }
        if (iL != -1) {
            kb0VarQ = kb0.q(kb0VarQ, iL + 1, 0, 2);
        } else if (h() != null && kb0VarQ.e() == 2) {
            kb0VarQ = kb0.f0;
        }
        return kb0VarQ.t();
    }

    public final oi5 c() {
        kb0 kb0Var = f.d;
        kb0 kb0Var2 = this.X;
        if (dh3.f(kb0Var2, kb0Var)) {
            return null;
        }
        kb0 kb0Var3 = f.a;
        if (dh3.f(kb0Var2, kb0Var3)) {
            return null;
        }
        kb0 kb0Var4 = f.b;
        if (dh3.f(kb0Var2, kb0Var4)) {
            return null;
        }
        kb0 kb0Var5 = f.e;
        kb0Var2.getClass();
        kb0Var5.getClass();
        int iE = kb0Var2.e();
        byte[] bArr = kb0Var5.X;
        if (kb0Var2.m(iE - bArr.length, kb0Var5, bArr.length) && (kb0Var2.e() == 2 || kb0Var2.m(kb0Var2.e() - 3, kb0Var3, 1) || kb0Var2.m(kb0Var2.e() - 3, kb0Var4, 1))) {
            return null;
        }
        int iL = kb0.l(kb0Var2, kb0Var3);
        if (iL == -1) {
            iL = kb0.l(kb0Var2, kb0Var4);
        }
        if (iL == 2 && h() != null) {
            if (kb0Var2.e() == 3) {
                return null;
            }
            return new oi5(kb0.q(kb0Var2, 0, 3, 1));
        }
        if (iL == 1) {
            kb0Var4.getClass();
            if (kb0Var2.m(0, kb0Var4, kb0Var4.e())) {
                return null;
            }
        }
        if (iL != -1 || h() == null) {
            if (iL == -1) {
                return new oi5(kb0Var);
            }
            return iL == 0 ? new oi5(kb0.q(kb0Var2, 0, 1, 1)) : new oi5(kb0.q(kb0Var2, 0, iL, 1));
        }
        if (kb0Var2.e() == 2) {
            return null;
        }
        return new oi5(kb0.q(kb0Var2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        oi5 oi5Var = (oi5) obj;
        oi5Var.getClass();
        return this.X.compareTo(oi5Var.X);
    }

    public final oi5 d(oi5 oi5Var) {
        oi5Var.getClass();
        kb0 kb0Var = oi5Var.X;
        int iC = f.c(this);
        kb0 kb0Var2 = this.X;
        oi5 oi5Var2 = iC == -1 ? null : new oi5(kb0Var2.p(0, iC));
        int iC2 = f.c(oi5Var);
        if (!dh3.f(oi5Var2, iC2 == -1 ? null : new oi5(kb0Var.p(0, iC2)))) {
            xw3.m("Paths of different roots cannot be relative to each other: ", this, " and ", oi5Var);
            return null;
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = oi5Var.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i = 0;
        while (i < iMin && dh3.f(arrayListA.get(i), arrayListA2.get(i))) {
            i++;
        }
        if (i == iMin && kb0Var2.e() == kb0Var.e()) {
            return g55.r(".");
        }
        if (arrayListA2.subList(i, arrayListA2.size()).indexOf(f.e) != -1) {
            xw3.m("Impossible relative path to resolve: ", this, " and ", oi5Var);
            return null;
        }
        if (dh3.f(kb0Var, f.d)) {
            return this;
        }
        i90 i90Var = new i90();
        kb0 kb0VarB = f.b(oi5Var);
        if (kb0VarB == null && (kb0VarB = f.b(this)) == null) {
            kb0VarB = f.f(Y);
        }
        int size = arrayListA2.size();
        for (int i2 = i; i2 < size; i2++) {
            i90Var.C0(f.e);
            i90Var.C0(kb0VarB);
        }
        int size2 = arrayListA.size();
        while (i < size2) {
            i90Var.C0((kb0) arrayListA.get(i));
            i90Var.C0(kb0VarB);
            i++;
        }
        return f.d(i90Var, false);
    }

    public final oi5 e(oi5 oi5Var, boolean z) {
        oi5Var.getClass();
        return f.a(this, oi5Var, z);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof oi5) && dh3.f(((oi5) obj).X, this.X);
    }

    public final oi5 f(String str) {
        str.getClass();
        i90 i90Var = new i90();
        i90Var.d1(str);
        return f.a(this, f.d(i90Var, false), false);
    }

    public final Path g() {
        Path path = Paths.get(this.X.t(), new String[0]);
        path.getClass();
        return path;
    }

    public final Character h() {
        kb0 kb0Var = f.a;
        kb0 kb0Var2 = this.X;
        if (kb0.h(kb0Var2, kb0Var) != -1 || kb0Var2.e() < 2 || kb0Var2.j(1) != 58) {
            return null;
        }
        char cJ = (char) kb0Var2.j(0);
        if (('a' > cJ || cJ >= '{') && ('A' > cJ || cJ >= '[')) {
            return null;
        }
        return Character.valueOf(cJ);
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final File toFile() {
        return new File(this.X.t());
    }

    public final String toString() {
        return this.X.t();
    }
}
