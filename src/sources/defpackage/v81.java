package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v81 {
    public final e26 a;
    public final boolean b;

    public v81(e26 e26Var, boolean z) {
        this.a = e26Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v81) {
            v81 v81Var = (v81) obj;
            if (v81Var.a.equals(this.a) && v81Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }
}
