package defpackage;

import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rf4 implements rn2 {
    public final /* synthetic */ byte X = 1;
    public final /* synthetic */ sf4 Y;
    public final /* synthetic */ gn2 Z;
    public final /* synthetic */ kx4 f0;

    public /* synthetic */ rf4(sf4 sf4Var, gn2 gn2Var, kx4 kx4Var) {
        this.Y = sf4Var;
        this.Z = gn2Var;
        this.f0 = kx4Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        kx4 kx4Var = this.f0;
        gn2 gn2Var = this.Z;
        sf4 sf4Var = this.Y;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                os4.c(sf4Var, gn2Var, kx4Var, (lp2) obj, w79.P(385));
                break;
            default:
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    String strJ0 = vj8.j0(y46.logs_core, lp2Var);
                    int iOrdinal = sf4Var.a.ordinal();
                    lp2Var.W(-22226513);
                    ec7 ec7Var = ec7.Y;
                    qm5 qm5VarC = ec7Var.c();
                    Iterator it = e69.i0.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        be beVar = zz0.a;
                        if (!zHasNext) {
                            j2 j2VarC = qm5VarC.c();
                            lp2Var.p(false);
                            ys0.g(strJ0, j2VarC, null, iOrdinal, null, lp2Var, 0, 52);
                            ss8 ss8Var = ss8.a;
                            if (ss8.t()) {
                                lp2Var.W(-688690046);
                                String strJ1 = vj8.j0(y46.logs_output, lp2Var);
                                int iOrdinal2 = sf4Var.b.ordinal();
                                lp2Var.W(-22209565);
                                qm5 qm5VarC2 = ec7Var.c();
                                for (nf4 nf4Var : nf4.g0) {
                                    String lowerCase = nf4Var.name().toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    boolean zF = lp2Var.f(gn2Var) | lp2Var.d(nf4Var.ordinal());
                                    Object objK = lp2Var.K();
                                    if (zF || objK == beVar) {
                                        objK = new a23((Object) gn2Var, (Object) nf4Var, (byte) 5);
                                        lp2Var.g0(objK);
                                    }
                                    qm5VarC2.add(new mw2(lowerCase, null, (dn2) objK));
                                }
                                j2 j2VarC2 = qm5VarC2.c();
                                lp2Var.p(false);
                                ys0.g(strJ1, j2VarC2, null, iOrdinal2, null, lp2Var, 0, 52);
                                lp2Var.p(false);
                            } else {
                                lp2Var.W(-688134154);
                                lp2Var.p(false);
                            }
                            String strJ2 = vj8.j0(y46.logs_view, lp2Var);
                            boolean zF2 = lp2Var.f(gn2Var);
                            Object objK2 = lp2Var.K();
                            if (zF2 || objK2 == beVar) {
                                objK2 = new ba3(gn2Var, (byte) 2);
                                lp2Var.g0(objK2);
                            }
                            nr4.a(strJ2, (dn2) objK2, kx4Var, lp2Var, 384);
                        } else {
                            e69 e69Var = (e69) it.next();
                            String lowerCase2 = e69Var.name().toLowerCase(Locale.ROOT);
                            lowerCase2.getClass();
                            boolean zF3 = lp2Var.f(gn2Var) | lp2Var.d(e69Var.ordinal());
                            Object objK3 = lp2Var.K();
                            if (zF3 || objK3 == beVar) {
                                objK3 = new a23((Object) gn2Var, (Object) e69Var, (byte) 4);
                                lp2Var.g0(objK3);
                            }
                            qm5VarC.add(new mw2(lowerCase2, null, (dn2) objK3));
                        }
                    }
                }
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ rf4(sf4 sf4Var, gn2 gn2Var, kx4 kx4Var, int i) {
        this.Y = sf4Var;
        this.Z = gn2Var;
        this.f0 = kx4Var;
    }
}
