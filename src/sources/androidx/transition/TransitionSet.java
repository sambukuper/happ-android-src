package androidx.transition;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import defpackage.em7;
import defpackage.je8;
import defpackage.ne8;
import defpackage.rp7;
import defpackage.yr6;
import defpackage.zd8;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class TransitionSet extends Transition {
    public ArrayList E0;
    public boolean F0;
    public int G0;
    public boolean H0;
    public int I0;

    @Override // androidx.transition.Transition
    public final void A() {
        ArrayList arrayList;
        if (this.E0.isEmpty()) {
            I();
            l();
            return;
        }
        je8 je8Var = new je8();
        je8Var.b = this;
        Iterator it = this.E0.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).a(je8Var);
        }
        this.G0 = this.E0.size();
        if (this.F0) {
            Iterator it2 = this.E0.iterator();
            while (it2.hasNext()) {
                ((Transition) it2.next()).A();
            }
            return;
        }
        int i = 1;
        while (true) {
            int size = this.E0.size();
            arrayList = this.E0;
            if (i >= size) {
                break;
            }
            ((Transition) arrayList.get(i - 1)).a(new je8((Transition) this.E0.get(i), (byte) 2));
            i++;
        }
        Transition transition = (Transition) arrayList.get(0);
        if (transition != null) {
            transition.A();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.Transition
    public final void B(long j, long j2) {
        long j3;
        long j4 = this.y0;
        long j5 = 0;
        if (this.k0 != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.t0 = false;
            v(this, em7.Y, z);
        }
        if (!this.F0) {
            int size = 1;
            while (true) {
                int size2 = this.E0.size();
                ArrayList arrayList = this.E0;
                if (size >= size2) {
                    size = arrayList.size();
                    break;
                } else if (((Transition) arrayList.get(size)).z0 > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i = size - 1;
            if (j >= j2) {
                while (true) {
                    if (i < this.E0.size()) {
                        Transition transition = (Transition) this.E0.get(i);
                        long j6 = transition.z0;
                        j3 = j5;
                        long j7 = j - j6;
                        if (j7 < j3) {
                            break;
                        }
                        transition.B(j7, j2 - j6);
                        i++;
                        j5 = j3;
                    }
                }
            } else {
                j3 = 0;
                while (i >= 0) {
                    Transition transition2 = (Transition) this.E0.get(i);
                    long j8 = transition2.z0;
                    long j9 = j - j8;
                    transition2.B(j9, j2 - j8);
                    if (j9 >= 0) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            if (this.k0 != null) {
                if ((j > j4 || j2 > j4) && (j >= 0 || j2 < j3)) {
                    return;
                }
                if (j > j4) {
                    this.t0 = true;
                }
                v(this, em7.Z, z);
            }
        }
        for (int i2 = 0; i2 < this.E0.size(); i2++) {
            ((Transition) this.E0.get(i2)).B(j, j2);
        }
        j3 = j5;
        if (this.k0 != null) {
            if (j > j4) {
                return;
            } else {
                return;
            }
            if (j > j4) {
                this.t0 = true;
            }
            v(this, em7.Z, z);
        }
    }

    @Override // androidx.transition.Transition
    public final void C(long j) {
        ArrayList arrayList;
        this.Z = j;
        if (j < 0 || (arrayList = this.E0) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.E0.get(i)).C(j);
        }
    }

    @Override // androidx.transition.Transition
    public final void D(rp7 rp7Var) {
        this.I0 |= 8;
        int size = this.E0.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.E0.get(i)).D(rp7Var);
        }
    }

    @Override // androidx.transition.Transition
    public final void E(TimeInterpolator timeInterpolator) {
        this.I0 |= 1;
        ArrayList arrayList = this.E0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.E0.get(i)).E(timeInterpolator);
            }
        }
        this.f0 = timeInterpolator;
    }

    @Override // androidx.transition.Transition
    public final void F(PathMotion pathMotion) {
        super.F(pathMotion);
        this.I0 |= 4;
        if (this.E0 != null) {
            for (int i = 0; i < this.E0.size(); i++) {
                ((Transition) this.E0.get(i)).F(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void G() {
        this.I0 |= 2;
        int size = this.E0.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.E0.get(i)).G();
        }
    }

    @Override // androidx.transition.Transition
    public final void H(long j) {
        this.Y = j;
    }

    @Override // androidx.transition.Transition
    public final String J(String str) {
        String strJ = super.J(str);
        for (int i = 0; i < this.E0.size(); i++) {
            strJ = strJ + "\n" + ((Transition) this.E0.get(i)).J(str.concat("  "));
        }
        return strJ;
    }

    public final void K(Transition transition) {
        this.E0.add(transition);
        transition.k0 = this;
        long j = this.Z;
        if (j >= 0) {
            transition.C(j);
        }
        if ((this.I0 & 1) != 0) {
            transition.E(this.f0);
        }
        if ((this.I0 & 2) != 0) {
            transition.G();
        }
        if ((this.I0 & 4) != 0) {
            transition.F(this.x0);
        }
        if ((this.I0 & 8) != 0) {
            transition.D(null);
        }
    }

    @Override // androidx.transition.Transition
    public final void c(ne8 ne8Var) {
        View view = ne8Var.b;
        if (t(view)) {
            for (Transition transition : this.E0) {
                if (transition.t(view)) {
                    transition.c(ne8Var);
                    ne8Var.c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void cancel() {
        super.cancel();
        int size = this.E0.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.E0.get(i)).cancel();
        }
    }

    @Override // androidx.transition.Transition
    public final void e(ne8 ne8Var) {
        int size = this.E0.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.E0.get(i)).e(ne8Var);
        }
    }

    @Override // androidx.transition.Transition
    public final void f(ne8 ne8Var) {
        View view = ne8Var.b;
        if (t(view)) {
            for (Transition transition : this.E0) {
                if (transition.t(view)) {
                    transition.f(ne8Var);
                    ne8Var.c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: i */
    public final Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.E0 = new ArrayList();
        int size = this.E0.size();
        for (int i = 0; i < size; i++) {
            Transition transitionClone = ((Transition) this.E0.get(i)).clone();
            transitionSet.E0.add(transitionClone);
            transitionClone.k0 = transitionSet;
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    public final void k(ViewGroup viewGroup, yr6 yr6Var, yr6 yr6Var2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.Y;
        int size = this.E0.size();
        for (int i = 0; i < size; i++) {
            Transition transition = (Transition) this.E0.get(i);
            if (j > 0 && (this.F0 || i == 0)) {
                long j2 = transition.Y;
                if (j2 > 0) {
                    transition.H(j2 + j);
                } else {
                    transition.H(j);
                }
            }
            transition.k(viewGroup, yr6Var, yr6Var2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    public final boolean r() {
        for (int i = 0; i < this.E0.size(); i++) {
            if (((Transition) this.E0.get(i)).r()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.Transition
    public final void w(View view) {
        super.w(view);
        int size = this.E0.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.E0.get(i)).w(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.Transition
    public final void x() {
        this.y0 = 0L;
        je8 je8Var = new je8(this, 0 == true ? 1 : 0);
        for (int i = 0; i < this.E0.size(); i++) {
            Transition transition = (Transition) this.E0.get(i);
            transition.a(je8Var);
            transition.x();
            long j = transition.y0;
            boolean z = this.F0;
            long j2 = this.y0;
            if (z) {
                this.y0 = Math.max(j2, j);
            } else {
                transition.z0 = j2;
                this.y0 = j2 + j;
            }
        }
    }

    @Override // androidx.transition.Transition
    public final Transition y(zd8 zd8Var) {
        super.y(zd8Var);
        return this;
    }

    @Override // androidx.transition.Transition
    public final void z(View view) {
        super.z(view);
        int size = this.E0.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.E0.get(i)).z(view);
        }
    }
}
