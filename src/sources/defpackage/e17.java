package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e17 {
    public final String a;
    public final rn2 b;
    public final boolean c;

    public /* synthetic */ e17(String str) {
        this(str, new ew6((byte) 24));
    }

    public final String toString() {
        return oi0.l("AccessibilityKey: ", this.a);
    }

    public e17(String str, rn2 rn2Var) {
        this.a = str;
        this.b = rn2Var;
    }

    public e17(String str, int i) {
        this(str);
        this.c = true;
    }

    public e17(String str, boolean z, rn2 rn2Var) {
        this(str, rn2Var);
        this.c = z;
    }
}
