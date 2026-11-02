package defpackage;

import su.happ.proxyutility.dto.enums.InboundAuthMode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class m93 {
    public final String a;
    public final InboundAuthMode b;
    public final String c;
    public final String d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m93(String str, InboundAuthMode inboundAuthMode, String str2, String str3) {
        inboundAuthMode.getClass();
        this.a = str;
        this.b = inboundAuthMode;
        this.c = str2;
        this.d = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static m93 a(m93 m93Var, String str, InboundAuthMode inboundAuthMode, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            str = m93Var.a;
        }
        if ((i & 2) != 0) {
            inboundAuthMode = m93Var.b;
        }
        if ((i & 4) != 0) {
            str2 = m93Var.c;
        }
        if ((i & 8) != 0) {
            str3 = m93Var.d;
        }
        m93Var.getClass();
        str.getClass();
        inboundAuthMode.getClass();
        str2.getClass();
        str3.getClass();
        return new m93(str, inboundAuthMode, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m93)) {
            return false;
        }
        m93 m93Var = (m93) obj;
        return dh3.f(this.a, m93Var.a) && this.b == m93Var.b && dh3.f(this.c, m93Var.c) && dh3.f(this.d, m93Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.d.hashCode() + pc6.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("InboundAuthBlockState(port=");
        sb.append(this.a);
        sb.append(", mode=");
        sb.append(this.b);
        sb.append(", user=");
        return oi0.q(sb, this.c, ", pass=", this.d, ")");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m93() {
        this("", InboundAuthMode.f5default, "", "");
        InboundAuthMode.INSTANCE.getClass();
    }
}
