package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ob6 implements wu3 {
    public ob6() {
        x97.P(w74.X, new zk3(this, (byte) 16));
    }

    public abstract pw3 B();

    public boolean F() {
        return false;
    }

    public boolean G() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ob6)) {
            return false;
        }
        ob6 ob6Var = (ob6) obj;
        return dh3.f(f(), ob6Var.f()) && v() == ob6Var.v();
    }

    public abstract kb6 f();

    public String getName() {
        return null;
    }

    public final int hashCode() {
        return Integer.hashCode(v()) + (f().hashCode() * 31);
    }

    public boolean t() {
        return false;
    }

    public final String toString() throws IOException {
        String strU0;
        StringBuilder sb = new StringBuilder();
        int iOrdinal = x().ordinal();
        if (iOrdinal == 0) {
            sb.append("instance parameter");
        } else if (iOrdinal == 1) {
            sb.append("context parameter " + getName());
        } else if (iOrdinal == 2) {
            sb.append("extension receiver parameter");
        } else {
            if (iOrdinal != 3) {
                b61.c();
                return null;
            }
            sb.append("parameter #" + v() + ' ' + getName());
        }
        sb.append(" of ");
        kb6 kb6VarF = f();
        if (kb6VarF instanceof nw3) {
            nw3 nw3Var = (nw3) kb6VarF;
            StringBuilder sb2 = new StringBuilder();
            lh4.L0(sb2, nw3Var);
            sb2.append(nw3Var instanceof zv3 ? "var " : "val ");
            lh4.N0(sb2, nw3Var);
            lh4.M0(sb2, nw3Var.getName());
            sb2.append(": ");
            sb2.append(lh4.W0(nw3Var.j(), false));
            strU0 = sb2.toString();
        } else {
            if (!(kb6VarF instanceof pv3)) {
                b61.o(kb6VarF, "Illegal callable: ");
                return null;
            }
            strU0 = lh4.U0((pv3) kb6VarF);
        }
        sb.append(strU0);
        return sb.toString();
    }

    public int v() {
        return 0;
    }

    public fw3 x() {
        return fw3.f0;
    }
}
