package defpackage;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fq4 {
    public final Matcher a;
    public final CharSequence b;
    public final eq4 c;
    public dq4 d;

    public fq4(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new eq4(this, (byte) 0);
    }

    public final List a() {
        dq4 dq4Var = this.d;
        if (dq4Var != null) {
            return dq4Var;
        }
        dq4 dq4Var2 = new dq4(this);
        this.d = dq4Var2;
        return dq4Var2;
    }

    public final kf3 b() {
        Matcher matcher = this.a;
        return x97.a0(matcher.start(), matcher.end());
    }
}
