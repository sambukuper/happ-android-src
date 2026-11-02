package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import su.happ.proxyutility.domain.routing.entity.DownloadFilesInfo;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFile;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zj implements ze2 {
    public final /* synthetic */ byte X;
    public final Object Y;
    public final Object Z;
    public final Object f0;

    public zj(ze2 ze2Var, s61 s61Var) {
        this.X = (byte) 7;
        this.Y = s61Var;
        this.Z = g98.b(s61Var);
        this.f0 = new t17(ze2Var, null, (byte) 17);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0193  */
    /* JADX WARN: Code duplicated, block: B:104:0x0197  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a1 A[LOOP:1: B:105:0x019b->B:107:0x01a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x010d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0156  */
    @Override // defpackage.ze2
    public final Object l(Object obj, q51 q51Var) throws Throwable {
        kq1 kq1Var;
        at1 at1Var;
        List list;
        Iterator it;
        tf2 tf2Var;
        wf2 wf2Var;
        rg2 rg2Var;
        ze2 ze2Var;
        Object obj2 = obj;
        byte b = this.X;
        c71 c71Var = c71.X;
        Object obj3 = null;
        dn8 dn8Var = dn8.a;
        Object obj4 = this.f0;
        Object obj5 = this.Z;
        Object obj6 = this.Y;
        switch (b) {
            case 0:
                ce8 ce8Var = (ce8) obj5;
                ((hv5) obj6).setValue(Boolean.valueOf(((Boolean) obj2).booleanValue() ? ((Boolean) ((rn2) ((y05) obj4).getValue()).K(ce8Var.c(), ce8Var.d.getValue())).booleanValue() : false));
                return dn8Var;
            case 1:
                ea6 ea6Var = (ea6) obj5;
                lq1 lq1Var = (lq1) obj6;
                if (q51Var instanceof kq1) {
                    kq1Var = (kq1) q51Var;
                    int i = kq1Var.h0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        kq1Var.h0 = i - Integer.MIN_VALUE;
                    } else {
                        kq1Var = new kq1(this, q51Var);
                    }
                } else {
                    kq1Var = new kq1(this, q51Var);
                }
                Object obj7 = kq1Var.f0;
                int i2 = kq1Var.h0;
                if (i2 == 0) {
                    w39.n0(obj7);
                    Object objB = lq1Var.Y.B(obj2);
                    Object obj8 = ea6Var.X;
                    if (obj8 == d75.a || !((Boolean) lq1Var.Z.K(obj8, objB)).booleanValue()) {
                        ea6Var.X = objB;
                        kq1Var.h0 = 1;
                        if (((ze2) obj4).l(obj2, kq1Var) == c71Var) {
                            return c71Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj7);
                }
                return dn8Var;
            case 2:
                DownloadFilesInfo downloadFilesInfo = (DownloadFilesInfo) obj2;
                List list2 = ((ht1) obj6).a;
                list2.getClass();
                String str = (String) obj5;
                mr2 mr2Var = (mr2) obj4;
                for (Object obj9 : list2) {
                    at1 at1Var2 = (at1) obj9;
                    if (dh3.f(at1Var2.a, str) && at1Var2.c == mr2Var) {
                        obj3 = obj9;
                        at1Var = (at1) obj3;
                        if (at1Var != null) {
                            list = at1Var.f;
                            if (list != null) {
                                it = list.iterator();
                                while (it.hasNext()) {
                                    ((fn6) it.next()).b(downloadFilesInfo);
                                }
                            }
                            StateDownloadFile stateDownloadFile = StateDownloadFile.PROGRESS;
                            stateDownloadFile.getClass();
                            at1Var.d = stateDownloadFile;
                        }
                        return dn8Var;
                    }
                }
                at1Var = (at1) obj3;
                if (at1Var != null) {
                    list = at1Var.f;
                    if (list != null) {
                        it = list.iterator();
                        while (it.hasNext()) {
                            ((fn6) it.next()).b(downloadFilesInfo);
                        }
                    }
                    StateDownloadFile stateDownloadFile2 = StateDownloadFile.PROGRESS;
                    stateDownloadFile2.getClass();
                    at1Var.d = stateDownloadFile2;
                }
                return dn8Var;
            case 3:
                ze2 ze2Var2 = (ze2) obj5;
                aa6 aa6Var = (aa6) obj6;
                if (q51Var instanceof tf2) {
                    tf2Var = (tf2) q51Var;
                    int i3 = tf2Var.i0;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        tf2Var.i0 = i3 - Integer.MIN_VALUE;
                    } else {
                        tf2Var = new tf2(this, q51Var);
                    }
                } else {
                    tf2Var = new tf2(this, q51Var);
                }
                Object objK = tf2Var.g0;
                int i4 = tf2Var.i0;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            obj2 = tf2Var.f0;
                            w39.n0(objK);
                            if (!((Boolean) objK).booleanValue()) {
                                aa6Var.X = true;
                                tf2Var.f0 = null;
                                tf2Var.i0 = 3;
                                if (ze2Var2.l(obj2, tf2Var) == c71Var) {
                                    return c71Var;
                                }
                            }
                        } else if (i4 != 3) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    w39.n0(objK);
                } else {
                    w39.n0(objK);
                    if (aa6Var.X) {
                        tf2Var.f0 = null;
                        tf2Var.i0 = 1;
                        if (ze2Var2.l(obj2, tf2Var) == c71Var) {
                            return c71Var;
                        }
                    } else {
                        tf2Var.f0 = obj2;
                        tf2Var.i0 = 2;
                        objK = ((rn2) obj4).K(obj2, tf2Var);
                        if (objK == c71Var) {
                            return c71Var;
                        }
                        if (!((Boolean) objK).booleanValue()) {
                            aa6Var.X = true;
                            tf2Var.f0 = null;
                            tf2Var.i0 = 3;
                            if (ze2Var2.l(obj2, tf2Var) == c71Var) {
                                return c71Var;
                            }
                        }
                    }
                }
                return dn8Var;
            case 4:
                if (q51Var instanceof wf2) {
                    wf2Var = (wf2) q51Var;
                    int i5 = wf2Var.h0;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        wf2Var.h0 = i5 - Integer.MIN_VALUE;
                    } else {
                        wf2Var = new wf2(this, q51Var);
                    }
                } else {
                    wf2Var = new wf2(this, q51Var);
                }
                Object obj10 = wf2Var.f0;
                int i6 = wf2Var.h0;
                if (i6 == 0) {
                    w39.n0(obj10);
                    ca6 ca6Var = (ca6) obj6;
                    int i7 = ca6Var.X + 1;
                    ca6Var.X = i7;
                    ze2 ze2Var3 = (ze2) obj5;
                    if (i7 >= 1) {
                        wf2Var.h0 = 2;
                        dh3.r(ze2Var3, obj2, obj4, wf2Var);
                        return c71Var;
                    }
                    wf2Var.h0 = 1;
                    if (ze2Var3.l(obj2, wf2Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i6 != 1 && i6 != 2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj10);
                }
                return dn8Var;
            case 5:
                if (q51Var instanceof rg2) {
                    rg2Var = (rg2) q51Var;
                    int i8 = rg2Var.g0;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        rg2Var.g0 = i8 - Integer.MIN_VALUE;
                    } else {
                        rg2Var = new rg2(this, q51Var);
                    }
                } else {
                    rg2Var = new rg2(this, q51Var);
                }
                Object obj11 = rg2Var.f0;
                int i9 = rg2Var.g0;
                if (i9 != 0) {
                    if (i9 == 1) {
                        ze2Var = rg2Var.h0;
                        w39.n0(obj11);
                    } else {
                        if (i9 != 2) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w39.n0(obj11);
                    }
                    return dn8Var;
                }
                w39.n0(obj11);
                ze2 ze2Var4 = (ze2) obj6;
                rg2Var.h0 = ze2Var4;
                rg2Var.g0 = 1;
                Object objH = u15.H((ql6) obj5, true, (ut8) obj4, rg2Var);
                if (objH == c71Var) {
                    return c71Var;
                }
                ze2Var = ze2Var4;
                obj11 = objH;
                rg2Var.h0 = null;
                rg2Var.g0 = 2;
                if (ze2Var.l(obj11, rg2Var) == c71Var) {
                    return c71Var;
                }
                return dn8Var;
            case 6:
                na3 na3Var = (na3) obj2;
                if (na3Var instanceof ka3) {
                    ((dn2) obj6).invoke();
                } else if (na3Var instanceof ma3) {
                    gn2 gn2Var = (gn2) obj4;
                    if (ue3.E((Context) obj5)) {
                        gn2Var.B(qa3.a);
                    } else {
                        gn2Var.B(va3.a);
                    }
                } else if (!(na3Var instanceof la3)) {
                    b61.c();
                    return null;
                }
                return dn8Var;
            default:
                Object objL0 = vr3.l0((s61) obj6, obj2, obj5, (t17) obj4, q51Var);
                return objL0 == c71Var ? objL0 : dn8Var;
        }
    }

    public /* synthetic */ zj(Object obj, Object obj2, Object obj3, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
    }
}
