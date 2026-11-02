package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cj extends g24 implements gn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ dj Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cj(dj djVar, byte b) {
        super(1);
        this.Y = b;
        this.Z = djVar;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        char c;
        long j;
        byte b = this.Y;
        dn8 dn8Var = dn8.a;
        int i = 0;
        dj djVar = this.Z;
        char c2 = ' ';
        long j2 = 4294967295L;
        switch (b) {
            case 0:
                do5 do5Var = (do5) obj;
                eo5[] eo5VarArr = djVar.c;
                eo5VarArr.getClass();
                int i2 = djVar.e;
                int i3 = djVar.g;
                int length = eo5VarArr.length;
                while (i < length) {
                    eo5 eo5Var = eo5VarArr[i];
                    if (eo5Var != null) {
                        long j3 = (((long) eo5Var.X) << 32) | (((long) eo5Var.Y) & 4294967295L);
                        long j4 = (((long) i2) << 32) | (((long) i3) & 4294967295L);
                        long jRound = (((long) Math.round((1.0f - 1.0f) * ((((int) (j4 >> 32)) - ((int) (j3 >> 32))) / 2.0f))) << 32) | (((long) Math.round((1.0f - 1.0f) * ((((int) (j4 & 4294967295L)) - ((int) (j3 & 4294967295L))) / 2.0f))) & 4294967295L);
                        do5.f(do5Var, eo5Var, (int) (jRound >> 32), (int) (jRound & 4294967295L));
                    }
                    i++;
                }
                break;
            default:
                do5 do5Var2 = (do5) obj;
                eo5[] eo5VarArr2 = djVar.b;
                eo5VarArr2.getClass();
                int i4 = djVar.d;
                int i5 = djVar.f;
                int length2 = eo5VarArr2.length;
                while (i < length2) {
                    eo5 eo5Var2 = eo5VarArr2[i];
                    if (eo5Var2 != null) {
                        long j5 = (((long) eo5Var2.X) << c2) | (((long) eo5Var2.Y) & j2);
                        c = c2;
                        j = j2;
                        long j6 = (((long) i5) & j) | (((long) i4) << c2);
                        float f = (((int) (j6 >> c)) - ((int) (j5 >> c))) / 2.0f;
                        float f2 = (1.0f - 1.0f) * ((((int) (j6 & j)) - ((int) (j5 & j))) / 2.0f);
                        int iRound = Math.round((1.0f - 1.0f) * f);
                        long jRound2 = (((long) Math.round(f2)) & j) | (((long) iRound) << c);
                        do5.f(do5Var2, eo5Var2, (int) (jRound2 >> c), (int) (jRound2 & j));
                    } else {
                        c = c2;
                        j = j2;
                    }
                    i++;
                    c2 = c;
                    j2 = j;
                }
                break;
        }
        return dn8Var;
    }
}
