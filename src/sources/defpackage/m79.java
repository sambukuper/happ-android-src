package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m79 implements rn2 {
    public final /* synthetic */ byte X = 1;
    public final /* synthetic */ ea6 Y;
    public final /* synthetic */ j76 Z;
    public final /* synthetic */ ea6 f0;
    public final /* synthetic */ ea6 g0;

    public /* synthetic */ m79(j76 j76Var, ea6 ea6Var, ea6 ea6Var2, ea6 ea6Var3) {
        this.Z = j76Var;
        this.Y = ea6Var;
        this.f0 = ea6Var2;
        this.g0 = ea6Var3;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) throws IOException {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        ea6 ea6Var = this.g0;
        ea6 ea6Var2 = this.f0;
        j76 j76Var = this.Z;
        ea6 ea6Var3 = this.Y;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                if (iIntValue != 21589) {
                    return dn8Var;
                }
                if (jLongValue >= 1) {
                    byte b2 = j76Var.readByte();
                    boolean z = (b2 & 1) == 1;
                    boolean z2 = (b2 & 2) == 2;
                    boolean z3 = (b2 & 4) == 4;
                    long j = z ? 5L : 1L;
                    if (z2) {
                        j += 4;
                    }
                    if (z3) {
                        j += 4;
                    }
                    if (jLongValue >= j) {
                        if (z) {
                            ea6Var3.X = Integer.valueOf(j76Var.k());
                        }
                        if (z2) {
                            ea6Var2.X = Integer.valueOf(j76Var.k());
                        }
                        if (!z3) {
                            return dn8Var;
                        }
                        ea6Var.X = Integer.valueOf(j76Var.k());
                        return dn8Var;
                    }
                    u52.s("bad zip: extended timestamp extra too short");
                } else {
                    u52.s("bad zip: extended timestamp extra too short");
                }
                return null;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                long jLongValue2 = ((Long) obj2).longValue();
                if (iIntValue2 != 1) {
                    return dn8Var;
                }
                if (ea6Var3.X != null) {
                    u52.s("bad zip: NTFS extra attribute tag 0x0001 repeated");
                } else {
                    if (jLongValue2 == 24) {
                        ea6Var3.X = Long.valueOf(j76Var.m());
                        ea6Var2.X = Long.valueOf(j76Var.m());
                        ea6Var.X = Long.valueOf(j76Var.m());
                        return dn8Var;
                    }
                    u52.s("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                }
                return null;
        }
    }

    public /* synthetic */ m79(ea6 ea6Var, j76 j76Var, ea6 ea6Var2, ea6 ea6Var3) {
        this.Y = ea6Var;
        this.Z = j76Var;
        this.f0 = ea6Var2;
        this.g0 = ea6Var3;
    }
}
