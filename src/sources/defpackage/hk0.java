package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hk0 implements fk6 {
    public final /* synthetic */ byte b;
    public final fk6 c;

    public hk0(long j, byte b) {
        this.b = b;
        switch (b) {
            case 1:
                this.c = new xa8(j, new gk0(j));
                break;
            default:
                this.c = new hk0(j, (byte) 1);
                break;
        }
    }

    @Override // defpackage.fk6
    public final long a() {
        byte b = this.b;
        fk6 fk6Var = this.c;
        switch (b) {
            case 0:
                return ((xa8) ((hk0) fk6Var).c).b;
            default:
                return ((xa8) fk6Var).b;
        }
    }

    @Override // defpackage.fk6
    public final ek6 b(fk0 fk0Var) {
        byte b = this.b;
        fk6 fk6Var = this.c;
        switch (b) {
            case 0:
                if (((xa8) ((hk0) fk6Var).c).b(fk0Var).b) {
                    return ek6.e;
                }
                Throwable th = fk0Var.c;
                if (th instanceof vl0) {
                    hi5.z0("CameraX");
                    if (((vl0) th).X > 0) {
                        return ek6.f;
                    }
                }
                return ek6.d;
            default:
                return ((xa8) fk6Var).b(fk0Var);
        }
    }
}
