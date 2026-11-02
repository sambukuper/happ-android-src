package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kp8 implements xe2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ xe2 Y;
    public final /* synthetic */ rp8 Z;

    public /* synthetic */ kp8(xe2 xe2Var, rp8 rp8Var, byte b) {
        this.X = b;
        this.Y = xe2Var;
        this.Z = rp8Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, q51 q51Var) {
        hp8 hp8Var;
        np8 np8Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        rp8 rp8Var = this.Z;
        xe2 xe2Var = this.Y;
        c71 c71Var = c71.X;
        byte b2 = 1;
        switch (b) {
            case 0:
                if (q51Var instanceof hp8) {
                    hp8Var = (hp8) q51Var;
                    int i = hp8Var.g0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        hp8Var.g0 = i - Integer.MIN_VALUE;
                    } else {
                        hp8Var = new hp8(this, q51Var);
                    }
                } else {
                    hp8Var = new hp8(this, q51Var);
                }
                Object obj = hp8Var.f0;
                int i2 = hp8Var.g0;
                if (i2 == 0) {
                    w39.n0(obj);
                    jp8 jp8Var = new jp8(ze2Var, rp8Var, (byte) 0);
                    hp8Var.g0 = 1;
                    return xe2Var.a(jp8Var, hp8Var) == c71Var ? c71Var : dn8Var;
                }
                if (i2 == 1) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (q51Var instanceof np8) {
                    np8Var = (np8) q51Var;
                    int i3 = np8Var.g0;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        np8Var.g0 = i3 - Integer.MIN_VALUE;
                    } else {
                        np8Var = new np8(this, q51Var);
                    }
                } else {
                    np8Var = new np8(this, q51Var);
                }
                Object obj2 = np8Var.f0;
                int i4 = np8Var.g0;
                if (i4 == 0) {
                    w39.n0(obj2);
                    jp8 jp8Var2 = new jp8(ze2Var, rp8Var, b2);
                    np8Var.g0 = 1;
                    return xe2Var.a(jp8Var2, np8Var) == c71Var ? c71Var : dn8Var;
                }
                if (i4 == 1) {
                    w39.n0(obj2);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
