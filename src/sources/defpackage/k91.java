package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k91 {
    public final byte[] a;
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public k91(byte[] bArr, int i) {
        this.a = ch3.o(bArr);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k91)) {
            return false;
        }
        k91 k91Var = (k91) obj;
        if (k91Var.b != this.b) {
            return false;
        }
        return Arrays.equals(this.a, k91Var.a);
    }

    public final int hashCode() {
        return this.b ^ ch3.H(this.a);
    }
}
