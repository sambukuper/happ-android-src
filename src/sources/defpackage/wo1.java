package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wo1 implements yo1 {
    public final int a;

    public /* synthetic */ wo1(int i) {
        this.a = i;
    }

    public static void a(int i) {
        if (i > 0) {
            return;
        }
        bt.q("px must be > 0.");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wo1) {
            return this.a == ((wo1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return ie2.h("Pixels(px=", this.a, ")");
    }
}
