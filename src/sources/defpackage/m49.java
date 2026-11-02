package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m49 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ String Z;

    public /* synthetic */ m49(long j, String str, byte b) {
        this.X = b;
        this.Y = j;
        this.Z = str;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) throws Exception {
        byte b = this.X;
        String str = this.Z;
        long j = this.Y;
        qr6 qr6Var = (qr6) obj;
        switch (b) {
            case 0:
                qr6Var.getClass();
                xr6 xr6VarX0 = qr6Var.X0("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    xr6VarX0.i(1, j);
                    xr6VarX0.T(2, str);
                    xr6VarX0.S0();
                    return dn8.a;
                } finally {
                    xr6VarX0.close();
                }
            default:
                qr6Var.getClass();
                xr6 xr6VarX1 = qr6Var.X0("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    xr6VarX1.i(1, j);
                    xr6VarX1.T(2, str);
                    xr6VarX1.S0();
                    return Integer.valueOf(os4.r(qr6Var));
                } finally {
                    xr6VarX1.close();
                }
        }
    }
}
