package defpackage;

import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class il8 extends kb8 implements p51 {
    public static final char[] g0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public final Boolean f0;

    public il8(Boolean bool) {
        super(UUID.class, (byte) 2);
        this.f0 = bool;
    }

    public static final void r(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void s(char[] cArr, int i, int i2) {
        char[] cArr2 = g0;
        cArr[i2] = cArr2[(i >> 12) & 15];
        cArr[i2 + 1] = cArr2[(i >> 8) & 15];
        cArr[i2 + 2] = cArr2[(i >> 4) & 15];
        cArr[i2 + 3] = cArr2[i & 15];
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    @Override // defpackage.p51
    public final ar3 a(t37 t37Var, d50 d50Var) {
        Boolean bool;
        no3 no3VarK = lj7.k(t37Var, d50Var, this.X);
        if (no3VarK == null) {
            bool = null;
        } else {
            mo3 mo3Var = no3VarK.Y;
            if (mo3Var == mo3.X) {
                bool = Boolean.TRUE;
            } else if (mo3Var == mo3.g0) {
                bool = Boolean.FALSE;
            } else {
                bool = null;
            }
        }
        return !Objects.equals(bool, this.f0) ? new il8(bool) : this;
    }

    @Override // defpackage.kb8, defpackage.ar3
    public final boolean c(t37 t37Var, Object obj) {
        UUID uuid = (UUID) obj;
        return uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0;
    }

    @Override // defpackage.kb8, defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) {
        boolean zBooleanValue;
        UUID uuid = (UUID) obj;
        Boolean bool = this.f0;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            ro3Var.getClass();
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            byte[] bArr = new byte[16];
            long mostSignificantBits = uuid.getMostSignificantBits();
            long leastSignificantBits = uuid.getLeastSignificantBits();
            r((int) (mostSignificantBits >> 32), 0, bArr);
            r((int) mostSignificantBits, 4, bArr);
            r((int) (leastSignificantBits >> 32), 8, bArr);
            r((int) leastSignificantBits, 12, bArr);
            ro3Var.getClass();
            ro3Var.u(m10.a, bArr, 0, 16);
            return;
        }
        char[] cArr = new char[36];
        long mostSignificantBits2 = uuid.getMostSignificantBits();
        int i = (int) (mostSignificantBits2 >> 32);
        s(cArr, i >> 16, 0);
        s(cArr, i, 4);
        cArr[8] = '-';
        int i2 = (int) mostSignificantBits2;
        s(cArr, i2 >>> 16, 9);
        cArr[13] = '-';
        s(cArr, i2, 14);
        cArr[18] = '-';
        long leastSignificantBits2 = uuid.getLeastSignificantBits();
        s(cArr, (int) (leastSignificantBits2 >>> 48), 19);
        cArr[23] = '-';
        s(cArr, (int) (leastSignificantBits2 >>> 32), 24);
        int i3 = (int) leastSignificantBits2;
        s(cArr, i3 >> 16, 28);
        s(cArr, i3, 32);
        ro3Var.d1(cArr, 0, 36);
    }
}
