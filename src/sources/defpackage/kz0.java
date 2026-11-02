package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kz0 extends qj6 implements rn2 {
    public int Z;
    public int f0;
    public int g0;
    public boolean h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ lz0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz0(lz0 lz0Var, q51 q51Var) {
        super(2, q51Var);
        this.j0 = lz0Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((kz0) n((q51) obj2, (v27) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        kz0 kz0Var = new kz0(this.j0, q51Var);
        kz0Var.i0 = obj;
        return kz0Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        v27 v27Var;
        int i;
        int i2;
        int i3;
        String strM;
        int i4;
        int i5;
        String str;
        lz0 lz0Var = this.j0;
        j05 j05Var = lz0Var.X;
        uz4 uz4Var = lz0Var.Z;
        boolean z = this.h0;
        if (!z) {
            w39.n0(obj);
            v27Var = (v27) this.i0;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.g0;
            i2 = this.f0;
            i3 = this.Z;
            v27Var = (v27) this.i0;
            w39.n0(obj);
        }
        if (i3 >= Math.min(lz0Var.f0 + 10, uz4Var.b)) {
            return dn8.a;
        }
        int i6 = i3 + 1;
        int iC = uz4Var.c(i3);
        switch (iC) {
            case 0:
                strM = "up";
                break;
            case 1:
                String strK = oi0.k(j05Var.g(i2), "down ");
                i2++;
                strM = strK;
                break;
            case 2:
                strM = pc6.m("remove ", uz4Var.c(i6), uz4Var.c(i3 + 2), " ");
                i6 = i3 + 3;
                break;
            case 3:
                int iC2 = uz4Var.c(i6);
                int iC3 = uz4Var.c(i3 + 2);
                int iC4 = uz4Var.c(i3 + 3);
                StringBuilder sbR = oi0.r(iC2, "move ", iC3, " ", " ");
                sbR.append(iC4);
                strM = sbR.toString();
                i6 = i3 + 4;
                break;
            case 4:
                strM = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int iC5 = uz4Var.c(i6);
                i5 = i2 + 1;
                str = "insertBottomUp " + iC5 + " " + j05Var.g(i2);
                int i7 = i4;
                strM = str;
                i6 = i7;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int iC6 = uz4Var.c(i6);
                i5 = i2 + 1;
                str = "insertTopDown " + iC6 + " " + j05Var.g(i2);
                int i8 = i4;
                strM = str;
                i6 = i8;
                i2 = i5;
                break;
            case 7:
                Object objG = j05Var.g(i2);
                objG.getClass();
                ci8.i(2, objG);
                i2 += 2;
                strM = "apply " + ((rn2) objG);
                break;
            case 8:
                strM = oi0.k(lz0Var.Y.g(i), "reuse ");
                i++;
                break;
            case 9:
                strM = "recompose pending";
                break;
            default:
                strM = pc6.j(iC, "unknown op: ");
                break;
        }
        this.i0 = v27Var;
        this.Z = i6;
        this.f0 = i2;
        this.g0 = i;
        this.h0 = true;
        v27Var.b(this, i3 + ": " + strM);
        return c71.X;
    }
}
