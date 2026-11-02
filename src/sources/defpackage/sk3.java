package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sk3 extends cl3 implements wv3 {
    public final g44 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk3(ov3 ov3Var, Field field, Object obj, yu3 yu3Var) {
        super(ov3Var, field, obj, yu3Var);
        ov3Var.getClass();
        yu3Var.getClass();
        this.k0 = x97.P(w74.X, new f3(this, (byte) 29));
    }

    @Override // defpackage.cl3, defpackage.kb6
    public final kb6 A(ov3 ov3Var, yu3 yu3Var) {
        ov3Var.getClass();
        yu3Var.getClass();
        return new sk3(ov3Var, U(), this.f0, yu3Var);
    }

    @Override // defpackage.zv3
    public final uv3 d() {
        return (rk3) this.k0.getValue();
    }

    @Override // defpackage.wv3, defpackage.zv3
    public final vv3 d() {
        return (rk3) this.k0.getValue();
    }
}
