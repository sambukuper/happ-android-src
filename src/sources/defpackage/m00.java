package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m00 {
    public final z47 a;
    public final z95 b;

    public m00(z47 z47Var, z95 z95Var) {
        this.a = z47Var;
        this.b = z95Var;
        if ((z47Var == null ? z95Var : z47Var) != null) {
            return;
        }
        bt.q("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }
}
