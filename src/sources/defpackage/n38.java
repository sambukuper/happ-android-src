package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n38 extends f38 {
    public final String b;
    public final int c;
    public final gn2 d;

    public n38(Object obj, String str, int i, gn2 gn2Var) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = gn2Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return oi0.n(sb, this.c, ")");
    }
}
