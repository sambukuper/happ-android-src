package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k08 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ int Z;

    public /* synthetic */ k08(int i, String str) {
        this.X = (byte) 2;
        this.Z = i;
        this.Y = str;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) throws Exception {
        j08 j08Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        String str = this.Y;
        int i = this.Z;
        qr6 qr6Var = (qr6) obj;
        switch (b) {
            case 0:
                qr6Var.getClass();
                xr6 xr6VarX0 = qr6Var.X0("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    xr6VarX0.T(1, str);
                    xr6VarX0.i(2, i);
                    int iQ = u15.q(xr6VarX0, "work_spec_id");
                    int iQ2 = u15.q(xr6VarX0, "generation");
                    int iQ3 = u15.q(xr6VarX0, "system_id");
                    if (xr6VarX0.S0()) {
                        j08Var = new j08(xr6VarX0.p0(iQ), (int) xr6VarX0.getLong(iQ2), (int) xr6VarX0.getLong(iQ3));
                        break;
                    } else {
                        j08Var = null;
                    }
                    return j08Var;
                } finally {
                    xr6VarX0.close();
                }
            case 1:
                qr6Var.getClass();
                xr6 xr6VarX1 = qr6Var.X0("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    xr6VarX1.T(1, str);
                    xr6VarX1.i(2, i);
                    xr6VarX1.S0();
                    return dn8Var;
                } finally {
                    xr6VarX1.close();
                }
            default:
                qr6Var.getClass();
                xr6 xr6VarX2 = qr6Var.X0("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    xr6VarX2.i(1, i);
                    xr6VarX2.T(2, str);
                    xr6VarX2.S0();
                    return dn8Var;
                } finally {
                    xr6VarX2.close();
                }
        }
    }

    public /* synthetic */ k08(String str, int i, byte b) {
        this.X = b;
        this.Y = str;
        this.Z = i;
    }
}
