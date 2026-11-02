package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wv4 {
    public final gx4 a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ f63 e;

    public wv4(f63 f63Var, gx4 gx4Var, int i, int i2, int i3) {
        this.e = f63Var;
        this.a = gx4Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final int a() {
        gx4 gx4Var = this.a;
        gx4 gx4Var2 = gx4.BYTE;
        int i = this.d;
        if (gx4Var != gx4Var2) {
            return i;
        }
        m70 m70Var = (m70) this.e.f0;
        wx1 wx1Var = (wx1) m70Var.e;
        String str = (String) m70Var.d;
        int i2 = this.b;
        return str.substring(i2, i + i2).getBytes(wx1Var.a[this.c].charset()).length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        gx4 gx4Var = this.a;
        sb.append(gx4Var);
        sb.append('(');
        m70 m70Var = (m70) this.e.f0;
        if (gx4Var == gx4.ECI) {
            wx1 wx1Var = (wx1) m70Var.e;
            sb.append(wx1Var.a[this.c].charset().displayName());
        } else {
            String str = (String) m70Var.d;
            int i = this.d;
            int i2 = this.b;
            String strSubstring = str.substring(i2, i + i2);
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = 0; i3 < strSubstring.length(); i3++) {
                if (strSubstring.charAt(i3) < ' ' || strSubstring.charAt(i3) > '~') {
                    sb2.append('.');
                } else {
                    sb2.append(strSubstring.charAt(i3));
                }
            }
            sb.append(sb2.toString());
        }
        sb.append(')');
        return sb.toString();
    }
}
