package defpackage;

import androidx.transition.Transition;
import androidx.transition.TransitionSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class je8 extends fe8 {
    public final /* synthetic */ byte a;
    public Transition b;

    public /* synthetic */ je8(Transition transition, byte b) {
        this.a = b;
        this.b = transition;
    }

    @Override // defpackage.fe8, defpackage.zd8
    public void b(Transition transition) {
        switch (this.a) {
            case 1:
                TransitionSet transitionSet = (TransitionSet) this.b;
                if (!transitionSet.H0) {
                    transitionSet.I();
                    transitionSet.H0 = true;
                }
                break;
        }
    }

    @Override // defpackage.fe8, defpackage.zd8
    public void d(Transition transition) {
        switch (this.a) {
            case 1:
                TransitionSet transitionSet = (TransitionSet) this.b;
                int i = transitionSet.G0 - 1;
                transitionSet.G0 = i;
                if (i == 0) {
                    transitionSet.H0 = false;
                    transitionSet.l();
                }
                transition.y(this);
                break;
            case 2:
                this.b.A();
                transition.y(this);
                break;
        }
    }

    @Override // defpackage.fe8, defpackage.zd8
    public void e(Transition transition) {
        switch (this.a) {
            case 0:
                TransitionSet transitionSet = (TransitionSet) this.b;
                transitionSet.E0.remove(transition);
                if (!transitionSet.r()) {
                    transitionSet.v(transitionSet, em7.f0, false);
                    transitionSet.t0 = true;
                    transitionSet.v(transitionSet, em7.Z, false);
                }
                break;
        }
    }

    public /* synthetic */ je8() {
        this.a = (byte) 1;
    }
}
