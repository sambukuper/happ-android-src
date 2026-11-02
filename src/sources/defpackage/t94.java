package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t94 extends ck2 {
    public final long X;
    public final boolean Y;
    public long Z;

    public t94(je7 je7Var, long j, boolean z) {
        super(je7Var);
        this.X = j;
        this.Y = z;
        if (j >= 0) {
            return;
        }
        em7.c(ie2.f(j, "byteCount < 0: "));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // defpackage.ck2, defpackage.je7
    public final long read(i90 i90Var, long j) throws IOException {
        long j2;
        long j3;
        i90Var.getClass();
        long j4 = this.Z;
        long j5 = this.X;
        long j6 = j5 - j4;
        if (j6 < 0) {
            StringBuilder sbS = pc6.s(j5, "expected ", " bytes but got ");
            sbS.append(this.Z);
            throw new IOException(sbS.toString());
        }
        if (this.Y) {
            j6++;
            if (j <= j6) {
                j6 = j;
            }
            j2 = super.read(i90Var, j6);
            if (j2 == -1) {
                long j7 = this.Z + j2;
                this.Z = j7;
                j3 = j7 - j5;
                if (j3 <= 0) {
                    return j2;
                }
                long j8 = i90Var.Y - j3;
                i90 i90Var2 = new i90();
                i90Var2.M(i90Var);
                i90Var.write(i90Var2, j8);
                i90Var2.g();
                StringBuilder sbS2 = pc6.s(j5, "expected ", " bytes but got ");
                sbS2.append(this.Z);
                throw new IOException(sbS2.toString());
            }
            if (j6 != 0) {
                StringBuilder sbS3 = pc6.s(j5, "expected ", " bytes but got ");
                sbS3.append(this.Z);
                throw new EOFException(sbS3.toString());
            }
        } else if (j6 != 0) {
            if (j <= j6) {
                j6 = j;
            }
            j2 = super.read(i90Var, j6);
            if (j2 == -1) {
                long j9 = this.Z + j2;
                this.Z = j9;
                j3 = j9 - j5;
                if (j3 <= 0) {
                    return j2;
                }
                long j10 = i90Var.Y - j3;
                i90 i90Var3 = new i90();
                i90Var3.M(i90Var);
                i90Var.write(i90Var3, j10);
                i90Var3.g();
                StringBuilder sbS4 = pc6.s(j5, "expected ", " bytes but got ");
                sbS4.append(this.Z);
                throw new IOException(sbS4.toString());
            }
            if (j6 != 0) {
                StringBuilder sbS5 = pc6.s(j5, "expected ", " bytes but got ");
                sbS5.append(this.Z);
                throw new EOFException(sbS5.toString());
            }
        }
        return -1L;
    }
}
