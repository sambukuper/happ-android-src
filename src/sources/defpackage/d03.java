package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d03 {
    public static final d03 d;
    public final boolean a;
    public final b03 b;
    public final c03 c;

    static {
        b03 b03Var = b03.c;
        c03 c03Var = c03.a;
        d = new d03(false, b03Var, c03Var);
        new d03(true, b03Var, c03Var);
    }

    public d03(boolean z, b03 b03Var, c03 c03Var) {
        b03Var.getClass();
        c03Var.getClass();
        this.a = z;
        this.b = b03Var;
        this.c = c03Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(\n    upperCase = ");
        sb.append(this.a);
        sb.append(",\n    bytes = BytesHexFormat(\n");
        this.b.a(sb, "        ");
        sb.append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.c.a(sb, "        ");
        sb.append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
