package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mz6 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public mz6 f;
    public mz6 g;

    public mz6(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final mz6 a() {
        mz6 mz6Var = this.f;
        if (mz6Var == this) {
            mz6Var = null;
        }
        mz6 mz6Var2 = this.g;
        mz6Var2.getClass();
        mz6Var2.f = this.f;
        mz6 mz6Var3 = this.f;
        mz6Var3.getClass();
        mz6Var3.g = this.g;
        this.f = null;
        this.g = null;
        return mz6Var;
    }

    public final void b(mz6 mz6Var) {
        mz6Var.getClass();
        mz6Var.g = this;
        mz6Var.f = this.f;
        mz6 mz6Var2 = this.f;
        mz6Var2.getClass();
        mz6Var2.g = mz6Var;
        this.f = mz6Var;
    }

    public final mz6 c() {
        this.d = true;
        return new mz6(this.a, this.b, this.c, true, false);
    }

    public final void d(mz6 mz6Var, int i) {
        mz6Var.getClass();
        byte[] bArr = mz6Var.a;
        if (!mz6Var.e) {
            bt.i("only owner can write");
            return;
        }
        int i2 = mz6Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (mz6Var.d) {
                kp5.e();
                return;
            }
            int i4 = mz6Var.b;
            if (i3 - i4 > 8192) {
                kp5.e();
                return;
            }
            eu.d0(0, i4, i2, bArr, bArr);
            i2 = mz6Var.c - mz6Var.b;
            mz6Var.c = i2;
            mz6Var.b = 0;
        }
        int i5 = this.b;
        eu.d0(i2, i5, i5 + i, this.a, bArr);
        mz6Var.c += i;
        this.b += i;
    }

    public mz6() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
