package io.sentry;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c6 implements io.sentry.util.f {
    public final /* synthetic */ byte X;
    public final /* synthetic */ s6 Y;

    public /* synthetic */ c6(io.sentry.util.h hVar, s6 s6Var) {
        this.X = (byte) 3;
        this.Y = s6Var;
    }

    @Override // io.sentry.util.f
    public final Object e() {
        byte b = this.X;
        s6 s6Var = this.Y;
        switch (b) {
            case 0:
                return s6Var.a();
            case 1:
                return new o2(s6Var);
            case 2:
                return s6Var.b();
            default:
                return Boolean.valueOf(io.sentry.util.h.b(s6Var, "androidx.core.view.ScrollingView"));
        }
    }

    public /* synthetic */ c6(s6 s6Var, byte b) {
        this.X = b;
        this.Y = s6Var;
    }
}
