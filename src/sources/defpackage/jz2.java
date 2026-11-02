package defpackage;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jz2 extends bk2 {
    public final MessageDigest X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz2(e60 e60Var) throws NoSuchAlgorithmException {
        super(e60Var);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.getClass();
        this.X = messageDigest;
    }

    @Override // defpackage.bk2, defpackage.sa7
    public final void write(i90 i90Var, long j) throws IOException {
        i90Var.getClass();
        os4.i(i90Var.Y, 0L, j);
        mz6 mz6Var = i90Var.X;
        mz6Var.getClass();
        long j2 = 0;
        while (j2 < j) {
            int iMin = (int) Math.min(j - j2, mz6Var.c - mz6Var.b);
            this.X.update(mz6Var.a, mz6Var.b, iMin);
            j2 += (long) iMin;
            mz6Var = mz6Var.f;
            mz6Var.getClass();
        }
        super.write(i90Var, j);
    }
}
