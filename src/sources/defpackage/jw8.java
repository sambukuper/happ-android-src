package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jw8 implements Choreographer.FrameCallback {
    public final /* synthetic */ kw8 X;

    public jw8(kw8 kw8Var) {
        this.X = kw8Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.X.X.run();
    }
}
