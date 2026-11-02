package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c01 extends h70 {
    public final boolean f0;

    public c01(b8 b8Var, boolean z) {
        super(b8Var);
        this.f0 = z;
    }

    @Override // defpackage.h70
    public final void g(byte b) {
        if (this.f0) {
            l(String.valueOf(b & 255));
            return;
        }
        String strValueOf = String.valueOf(b & 255);
        strValueOf.getClass();
        ((b8) this.Z).s(strValueOf);
    }

    @Override // defpackage.h70
    public final void i(int i) {
        if (this.f0) {
            l(Long.toString(((long) i) & 4294967295L, 10));
            return;
        }
        String string = Long.toString(((long) i) & 4294967295L, 10);
        string.getClass();
        ((b8) this.Z).s(string);
    }

    @Override // defpackage.h70
    public final void j(long j) {
        int i = 63;
        String str = "0";
        if (this.f0) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % 10), 10);
                        j2 /= 10;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            l(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j3 = (j >>> 1) / 5;
                cArr2[63] = Character.forDigit((int) (j - (j3 * 10)), 10);
                while (j3 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j3 % 10), 10);
                    j3 /= 10;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        str.getClass();
        ((b8) this.Z).s(str);
    }

    @Override // defpackage.h70
    public final void k(short s) {
        boolean z = this.f0;
        String strA = dl8.a(s);
        if (z) {
            l(strA);
        } else {
            strA.getClass();
            ((b8) this.Z).s(strA);
        }
    }
}
