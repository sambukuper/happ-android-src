package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zs5 {
    public static final zs5 c = new zs5(ys5.X, 0);
    public static final zs5 d = new zs5(ys5.h0, 1);
    public final ys5 a;
    public final int b;

    public zs5(ys5 ys5Var, int i) {
        this.a = ys5Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zs5.class != obj.getClass()) {
            return false;
        }
        zs5 zs5Var = (zs5) obj;
        return this.a == zs5Var.a && this.b == zs5Var.b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" ");
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "null" : "slice";
        } else {
            str = "meet";
        }
        sb.append(str);
        return sb.toString();
    }
}
