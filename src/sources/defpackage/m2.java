package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m2 implements ow3 {
    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        obj.getClass();
        ow3 ow3VarV = nr4.v(this, ol7Var, obj);
        e37 e37VarD = d();
        ol7 ol7VarA = ol7Var.a(e37VarD);
        ol7VarA.u(d(), 0, ow3VarV.d().a());
        ol7VarA.q(d(), 1, ow3VarV, obj);
        ol7VarA.v(e37VarD);
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        e37 e37VarD = d();
        f01 f01VarT = rd1Var.t(e37VarD);
        Object objQ = null;
        String strK = null;
        while (true) {
            int iE = f01VarT.e(d());
            if (iE == -1) {
                if (objQ != null) {
                    f01VarT.n(e37VarD);
                    return objQ;
                }
                em7.c(oi0.l("Polymorphic value has not been read for class ", strK));
                return null;
            }
            if (iE == 0) {
                strK = f01VarT.k(d(), iE);
            } else {
                if (iE != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    if (strK == null) {
                        strK = "unknown class";
                    }
                    sb.append(strK);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iE);
                    throw new m37(sb.toString());
                }
                if (strK == null) {
                    bt.q("Cannot read polymorphic value before its type token");
                    return null;
                }
                objQ = f01VarT.q(d(), iE, nr4.u(this, f01VarT, strK), null);
            }
        }
    }

    public ow3 e(f01 f01Var, String str) {
        return ((uy6) qb1.b.getValue()).e(f01Var, str);
    }

    public ow3 f(ol7 ol7Var, Object obj) {
        hc1 hc1Var = (hc1) obj;
        hc1Var.getClass();
        return ((uy6) qb1.b.getValue()).f(ol7Var, hc1Var);
    }

    public zu3 g() {
        return yb6.a.b(hc1.class);
    }
}
