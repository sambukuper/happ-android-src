package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u22 implements ow3 {
    public final Enum[] a;
    public final vz7 b;

    public u22(String str, Enum[] enumArr) {
        enumArr.getClass();
        this.a = enumArr;
        this.b = new vz7(new p5(this, str, (byte) 21));
    }

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        Enum r5 = (Enum) obj;
        r5.getClass();
        Enum[] enumArr = this.a;
        int iV0 = eu.v0(r5, enumArr);
        if (iV0 != -1) {
            e37 e37VarD = d();
            e37VarD.getClass();
            ol7Var.t(e37VarD.f(iV0));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        String strA = d().a();
        String string = Arrays.toString(enumArr);
        string.getClass();
        sb.append(" is not a valid enum ");
        sb.append(strA);
        sb.append(", must be one of ");
        sb.append(string);
        throw new m37(sb.toString());
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        int iU = rd1Var.u(d());
        Enum[] enumArr = this.a;
        if (iU >= 0 && iU < enumArr.length) {
            return enumArr[iU];
        }
        throw new m37(iU + " is not among valid " + d().a() + " enum values, values size is " + enumArr.length);
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return (e37) this.b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + d().a() + '>';
    }
}
