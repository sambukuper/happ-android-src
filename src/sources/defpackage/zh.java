package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zh implements Choreographer.FrameCallback {
    public final /* synthetic */ mm0 X;
    public final /* synthetic */ gn2 Y;

    public zh(mm0 mm0Var, ai aiVar, gn2 gn2Var) {
        this.X = mm0Var;
        this.Y = gn2Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object rj6Var;
        try {
            rj6Var = this.Y.B(Long.valueOf(j));
        } catch (Throwable th) {
            rj6Var = new rj6(th);
        }
        this.X.f(rj6Var);
    }
}
