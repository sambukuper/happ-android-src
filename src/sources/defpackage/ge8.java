package defpackage;

import androidx.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ge8 extends fe8 {
    public final /* synthetic */ vt a;
    public final /* synthetic */ he8 b;

    public ge8(he8 he8Var, vt vtVar) {
        this.b = he8Var;
        this.a = vtVar;
    }

    @Override // defpackage.fe8, defpackage.zd8
    public final void d(Transition transition) {
        ((ArrayList) this.a.get(this.b.Y)).remove(transition);
        transition.y(this);
    }
}
