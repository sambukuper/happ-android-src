package io.sentry;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m3 implements r1 {
    public static final m3 b = new m3(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ m3(byte b2) {
        this.a = b2;
    }

    @Override // io.sentry.r1
    public final s1 a(n7 n7Var, o4 o4Var, o7 o7Var, o oVar) {
        switch (this.a) {
            case 0:
                return n3.a;
            default:
                return new b7(n7Var, o4Var, o7Var, oVar);
        }
    }
}
