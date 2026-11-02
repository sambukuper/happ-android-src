package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sr {
    public static final sr e = new sr(os4.e(8, 0.0f), new ig5(16.0f, 12.0f, 16.0f, 12.0f), os4.e(2, 8.0f), os4.d(2));
    public final ig5 a;
    public final ig5 b;
    public final ig5 c;
    public final ig5 d;

    public sr(ig5 ig5Var, ig5 ig5Var2, ig5 ig5Var3, ig5 ig5Var4) {
        this.a = ig5Var;
        this.b = ig5Var2;
        this.c = ig5Var3;
        this.d = ig5Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr)) {
            return false;
        }
        sr srVar = (sr) obj;
        return this.a.equals(srVar.a) && this.b.equals(srVar.b) && this.c.equals(srVar.c) && this.d.equals(srVar.d) && kt1.b(24.0f, 24.0f) && kt1.b(8.0f, 8.0f);
    }

    public final int hashCode() {
        return Float.hashCode(8.0f) + pc6.d((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 24.0f, 31);
    }

    public final String toString() {
        String strC = kt1.c(24.0f);
        String strC2 = kt1.c(8.0f);
        StringBuilder sb = new StringBuilder("AppSettingsDimensions(header=");
        sb.append(this.a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        sb.append(this.c);
        sb.append(", contentHorizontalOnly=");
        sb.append(this.d);
        sb.append(", blockSpace=");
        return oi0.q(sb, strC, ", descriptionSpace=", strC2, ")");
    }
}
