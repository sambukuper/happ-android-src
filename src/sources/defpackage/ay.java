package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ay extends m71 {
    public final Context a;
    public final f08 b;
    public final f08 c;
    public final String d;

    public ay(Context context, f08 f08Var, f08 f08Var2, String str) {
        if (context == null) {
            b61.i("Null applicationContext");
            throw null;
        }
        this.a = context;
        if (f08Var == null) {
            b61.i("Null wallClock");
            throw null;
        }
        this.b = f08Var;
        if (f08Var2 == null) {
            b61.i("Null monotonicClock");
            throw null;
        }
        this.c = f08Var2;
        if (str != null) {
            this.d = str;
        } else {
            b61.i("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m71) {
            ay ayVar = (ay) ((m71) obj);
            if (this.a.equals(ayVar.a) && this.b.equals(ayVar.b) && this.c.equals(ayVar.c) && this.d.equals(ayVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return oi0.p(sb, this.d, "}");
    }
}
