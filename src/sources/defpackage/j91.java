package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class j91 {
    public final BigInteger a;
    public final BigInteger b;
    public final BigInteger c;
    public final k91 d;

    public j91(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, k91 k91Var) {
        this.a = bigInteger3;
        this.c = bigInteger;
        this.b = bigInteger2;
        this.d = k91Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j91)) {
            return false;
        }
        j91 j91Var = (j91) obj;
        return j91Var.c.equals(this.c) && j91Var.b.equals(this.b) && j91Var.a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (this.c.hashCode() ^ this.b.hashCode());
    }
}
