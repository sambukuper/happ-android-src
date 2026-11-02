package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gk2 {
    public static final v15 e = v15.g("<root>");
    public final String a;
    public transient fk2 b;
    public transient gk2 c;
    public transient v15 d;

    static {
        Pattern.compile("\\.").getClass();
    }

    public gk2(fk2 fk2Var, String str) {
        str.getClass();
        this.a = str;
        this.b = fk2Var;
    }

    public static final List f(gk2 gk2Var) {
        if (gk2Var.c()) {
            return new ArrayList();
        }
        List listF = f(gk2Var.e());
        listF.add(gk2Var.g());
        return listF;
    }

    public final gk2 a(v15 v15Var) {
        String strB;
        v15Var.getClass();
        if (c()) {
            strB = v15Var.b();
        } else {
            strB = this.a + '.' + v15Var.b();
        }
        strB.getClass();
        return new gk2(strB, this, v15Var);
    }

    public final void b() {
        String str = this.a;
        int length = str.length() - 1;
        boolean z = false;
        while (true) {
            if (length >= 0) {
                char cCharAt = str.charAt(length);
                if (cCharAt == '.' && !z) {
                    break;
                }
                if (cCharAt == '`') {
                    z = !z;
                }
                length--;
            } else {
                length = -1;
                break;
            }
        }
        if (length >= 0) {
            this.d = v15.d(str.substring(length + 1));
            this.c = new gk2(str.substring(0, length));
        } else {
            this.d = v15.d(str);
            this.c = fk2.c.a;
        }
    }

    public final boolean c() {
        return this.a.length() == 0;
    }

    public final boolean d() {
        return this.b != null || fm7.l0(this.a, '<', 0, 6) < 0;
    }

    public final gk2 e() {
        gk2 gk2Var = this.c;
        if (gk2Var != null) {
            return gk2Var;
        }
        if (c()) {
            bt.i("root");
            return null;
        }
        b();
        gk2 gk2Var2 = this.c;
        gk2Var2.getClass();
        return gk2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gk2) {
            return dh3.f(this.a, ((gk2) obj).a);
        }
        return false;
    }

    public final v15 g() {
        v15 v15Var = this.d;
        if (v15Var != null) {
            return v15Var;
        }
        if (c()) {
            bt.i("root");
            return null;
        }
        b();
        v15 v15Var2 = this.d;
        v15Var2.getClass();
        return v15Var2;
    }

    public final boolean h(v15 v15Var) {
        v15Var.getClass();
        if (!c()) {
            String str = this.a;
            int iL0 = fm7.l0(str, '.', 0, 6);
            if (iL0 == -1) {
                iL0 = str.length();
            }
            int i = iL0;
            String strB = v15Var.b();
            strB.getClass();
            if (i == strB.length() && mm7.U(0, 0, i, this.a, strB, false)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final fk2 i() {
        fk2 fk2Var = this.b;
        if (fk2Var != null) {
            return fk2Var;
        }
        fk2 fk2Var2 = new fk2(this);
        this.b = fk2Var2;
        return fk2Var2;
    }

    public final String toString() {
        if (!c()) {
            return this.a;
        }
        String strB = e.b();
        strB.getClass();
        return strB;
    }

    public gk2(String str) {
        this.a = str;
    }

    public gk2(String str, gk2 gk2Var, v15 v15Var) {
        this.a = str;
        this.c = gk2Var;
        this.d = v15Var;
    }
}
