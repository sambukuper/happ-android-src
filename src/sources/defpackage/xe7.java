package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xe7 {
    public ze7 a;
    public ye7 b;
    public final qk2 c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public final wl2 l;

    public xe7(ze7 ze7Var, ye7 ye7Var, wl2 wl2Var) {
        qk2 qk2Var = wl2Var.c;
        this.a = ze7Var;
        this.b = ye7Var;
        this.c = qk2Var;
        this.d = new ArrayList();
        this.i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.k = arrayList;
        this.l = wl2Var;
    }

    public final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.h = false;
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        for (we7 we7Var : wv0.Y0(this.k)) {
            we7Var.getClass();
            if (!we7Var.b) {
                we7Var.a(viewGroup);
            }
            we7Var.b = true;
        }
    }

    public final void b() {
        this.h = false;
        if (!this.f) {
            if (ml2.K(2)) {
                toString();
            }
            this.f = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.c.o0 = false;
        this.l.k();
    }

    public final void c(we7 we7Var) {
        we7Var.getClass();
        ArrayList arrayList = this.j;
        if (arrayList.remove(we7Var) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(ze7 ze7Var, ye7 ye7Var) {
        int iOrdinal = ye7Var.ordinal();
        ze7 ze7Var2 = ze7.Y;
        qk2 qk2Var = this.c;
        if (iOrdinal == 0) {
            if (this.a != ze7Var2) {
                if (ml2.K(2)) {
                    ze7 ze7Var3 = this.a;
                    Objects.toString(qk2Var);
                    Objects.toString(ze7Var3);
                    ze7Var.toString();
                }
                this.a = ze7Var;
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            if (this.a == ze7Var2) {
                if (ml2.K(2)) {
                    ye7 ye7Var2 = this.b;
                    Objects.toString(qk2Var);
                    Objects.toString(ye7Var2);
                }
                this.a = ze7.Z;
                this.b = ye7.Y;
                this.i = true;
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            b61.c();
            return;
        }
        if (ml2.K(2)) {
            ze7 ze7Var4 = this.a;
            ye7 ye7Var3 = this.b;
            Objects.toString(qk2Var);
            Objects.toString(ze7Var4);
            Objects.toString(ye7Var3);
        }
        this.a = ze7Var2;
        this.b = ye7.Z;
        this.i = true;
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.a + " lifecycleImpact = " + this.b + " fragment = " + this.c + "}";
    }
}
