package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i09 {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                i09 i09Var = (i09) arrayList.get(i);
                if (this.e == i09Var.b) {
                    c(this.c, i09Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(ka4 ka4Var, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        n31 n31Var = ((m31) arrayList.get(0)).T;
        ka4Var.t();
        n31Var.b(ka4Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((m31) arrayList.get(i2)).b(ka4Var, false);
        }
        if (i == 0 && n31Var.z0 > 0) {
            ch3.h(n31Var, ka4Var, arrayList, 0);
        }
        if (i == 1 && n31Var.A0 > 0) {
            ch3.h(n31Var, ka4Var, arrayList, 1);
        }
        try {
            ka4Var.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", _UrlKt.FRAGMENT_ENCODE_SET));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            m31 m31Var = (m31) arrayList.get(i3);
            s18 s18Var = new s18((byte) 13);
            new WeakReference(m31Var);
            ka4.n(m31Var.I);
            ka4.n(m31Var.J);
            ka4.n(m31Var.K);
            ka4.n(m31Var.L);
            ka4.n(m31Var.M);
            this.d.add(s18Var);
        }
        if (i == 0) {
            iN = ka4.n(n31Var.I);
            iN2 = ka4.n(n31Var.K);
            ka4Var.t();
        } else {
            iN = ka4.n(n31Var.J);
            iN2 = ka4.n(n31Var.L);
            ka4Var.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, i09 i09Var) {
        int i2 = i09Var.b;
        for (m31 m31Var : this.a) {
            ArrayList arrayList = i09Var.a;
            if (!arrayList.contains(m31Var)) {
                arrayList.add(m31Var);
            }
            if (i == 0) {
                m31Var.n0 = i2;
            } else {
                m31Var.o0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        String str;
        int i = this.c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(" [");
        String strN = oi0.n(sb, this.b, "] <");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            strN = strN + " " + ((m31) it.next()).h0;
        }
        return strN.concat(" >");
    }
}
