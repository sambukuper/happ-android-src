package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h53 implements dr8 {
    public final /* synthetic */ byte X;
    public final k05 Y;

    public h53(k05 k05Var, byte b) {
        this.X = b;
        switch (b) {
            case 1:
                this.Y = k05Var;
                zx zxVar = u18.J;
                Class cls = (Class) k05Var.a(zxVar, null);
                if (cls != null && !cls.equals(x53.class)) {
                    b61.l("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                k05Var.o(er8.W, gr8.X);
                k05Var.o(zxVar, x53.class);
                zx zxVar2 = u18.I;
                if (k05Var.a(zxVar2, null) == null) {
                    k05Var.o(zxVar2, x53.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 2:
                this.Y = k05Var;
                zx zxVar3 = u18.J;
                Class cls2 = (Class) k05Var.a(zxVar3, null);
                if (cls2 != null && !cls2.equals(lt5.class)) {
                    b61.l("Invalid target class configuration for ", this, ": ", cls2);
                    throw null;
                }
                k05Var.o(er8.W, gr8.Y);
                k05Var.o(zxVar3, lt5.class);
                zx zxVar4 = u18.I;
                if (k05Var.a(zxVar4, null) == null) {
                    k05Var.o(zxVar4, lt5.class.getCanonicalName() + "-" + UUID.randomUUID());
                }
                zx zxVar5 = i63.v;
                if (((Integer) k05Var.a(zxVar5, -1)).intValue() == -1) {
                    k05Var.o(zxVar5, 2);
                    return;
                }
                return;
            default:
                this.Y = k05Var;
                zx zxVar6 = u18.J;
                Class cls3 = (Class) k05Var.a(zxVar6, null);
                if (cls3 != null && !cls3.equals(k53.class)) {
                    b61.l("Invalid target class configuration for ", this, ": ", cls3);
                    throw null;
                }
                k05Var.o(er8.W, gr8.Z);
                k05Var.o(zxVar6, k53.class);
                zx zxVar7 = u18.I;
                if (k05Var.a(zxVar7, null) == null) {
                    k05Var.o(zxVar7, k53.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    @Override // defpackage.k62
    public final k05 b() {
        switch (this.X) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.Y;
    }

    @Override // defpackage.dr8
    public final er8 d() {
        byte b = this.X;
        k05 k05Var = this.Y;
        switch (b) {
            case 0:
                return new o53(qd5.c(k05Var));
            case 1:
                return new y53(qd5.c(k05Var));
            default:
                return new mt5(qd5.c(k05Var));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h53(byte b) {
        this(k05.j(), (byte) 0);
        this.X = b;
        switch (b) {
            case 1:
                this(k05.j(), (byte) 1);
                break;
            case 2:
                this(k05.j(), (byte) 2);
                break;
            default:
                break;
        }
    }
}
