package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u21 {
    public int b;
    public boolean c;
    public final m31 d;
    public final int e;
    public u21 f;
    public ge7 i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public u21(m31 m31Var, int i) {
        this.d = m31Var;
        this.e = i;
    }

    public final void a(u21 u21Var, int i) {
        b(u21Var, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(u21 u21Var, int i, int i2, boolean z) {
        if (u21Var == null) {
            j();
            return true;
        }
        if (!z && !i(u21Var)) {
            return false;
        }
        this.f = u21Var;
        if (u21Var.a == null) {
            u21Var.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, i09 i09Var, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                w51.z(((u21) it.next()).d, i, arrayList, i09Var);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        u21 u21Var;
        if (this.d.g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (u21Var = this.f) == null || u21Var.d.g0 != 8) ? this.g : i;
    }

    public final u21 f() {
        int i = this.e;
        int iB = p61.B(i);
        m31 m31Var = this.d;
        switch (iB) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return m31Var.K;
            case 2:
                return m31Var.L;
            case 3:
                return m31Var.I;
            case 4:
                return m31Var.J;
            default:
                bt.g(oi0.z(i));
                return null;
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((u21) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0061 A[RETURN] */
    public final boolean i(u21 u21Var) {
        if (u21Var != null) {
            m31 m31Var = u21Var.d;
            int i = u21Var.e;
            int i2 = this.e;
            if (i != i2) {
                switch (p61.B(i2)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z = i == 2 || i == 4;
                        if (!(m31Var instanceof av2)) {
                            return z;
                        }
                        if (z || i == 8) {
                            return true;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = i == 3 || i == 5;
                        if (!(m31Var instanceof av2)) {
                            return z2;
                        }
                        if (z2 || i == 9) {
                            return true;
                        }
                        break;
                    case 5:
                        if (i != 2 && i != 4) {
                            return true;
                        }
                        break;
                    case 6:
                        if (i != 6 && i != 8 && i != 9) {
                            return true;
                        }
                        break;
                    default:
                        bt.g(oi0.z(i2));
                        return false;
                }
            } else if (i2 != 6 || (m31Var.E && this.d.E)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        u21 u21Var = this.f;
        if (u21Var != null && (hashSet = u21Var.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        ge7 ge7Var = this.i;
        if (ge7Var == null) {
            this.i = new ge7(1);
        } else {
            ge7Var.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.h0 + ":" + oi0.z(this.e);
    }
}
