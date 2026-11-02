package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class e91 {
    public final BigInteger a;
    public final BigInteger b;
    public final BigInteger c;

    public e91(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2) {
        if (i2 != 0) {
            if (i2 >= bigInteger.bitLength()) {
                bt.q("when l value specified, it must be less than bitlength(p)");
                throw null;
            }
            if (i2 < i) {
                bt.q("when l value specified, it may not be less than m value");
                throw null;
            }
        }
        if (i >= bigInteger.bitLength() && !ax5.a("org.bouncycastle.dh.allow_unsafe_p_value")) {
            bt.q("unsafe p value so small specific l required");
            throw null;
        }
        this.a = bigInteger2;
        this.b = bigInteger;
        this.c = bigInteger3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e91)) {
            return false;
        }
        e91 e91Var = (e91) obj;
        BigInteger bigInteger = e91Var.c;
        BigInteger bigInteger2 = this.c;
        if (bigInteger2 != null) {
            if (!bigInteger2.equals(bigInteger)) {
                return false;
            }
        } else if (bigInteger != null) {
            return false;
        }
        return e91Var.b.equals(this.b) && e91Var.a.equals(this.a);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() ^ this.a.hashCode();
        BigInteger bigInteger = this.c;
        return (bigInteger != null ? bigInteger.hashCode() : 0) ^ iHashCode;
    }
}
