package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.ProviderId;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class qc2 {
    public static final /* synthetic */ nw3[] l = {new mx5(qc2.class)};
    public final Context a;
    public final js5 b = new js5("remote_messages");
    public final js5 c = new js5("token");
    public final js5 d = new js5("provider_ids");
    public final js5 e = new js5("last_token_send_timestamp");
    public final is5 f = x97.R("messaging", (lr5) null, (vj2) null, 14);
    public final cc2 g;
    public final h76 h;
    public final xe2 i;
    public final xe2 j;
    public final xe2 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qc2(Context context) {
        this.a = context;
        cc2 cc2Var = new cc2(d(context).j(), this, (byte) 0);
        this.g = cc2Var;
        this.h = jm4.a0(w51.t(new j31(cc2Var, (byte) 1)), HappApplication.N0, h87.a, (Object) null);
        this.i = w51.t(new cc2(d(context).j(), this, (byte) 1));
        this.j = w51.t(new cc2(d(context).j(), this, (byte) 2));
        this.k = w51.t(new cc2(d(context).j(), this, (byte) 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ld6 ld6Var, s51 s51Var) {
        ub2 ub2Var;
        if (s51Var instanceof ub2) {
            ub2Var = (ub2) s51Var;
            int i = ub2Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ub2Var.h0 = i - Integer.MIN_VALUE;
            } else {
                ub2Var = new ub2(this, s51Var);
            }
        } else {
            ub2Var = new ub2(this, s51Var);
        }
        Object obj = ub2Var.f0;
        int i2 = ub2Var.h0;
        q51 q51Var = null;
        if (i2 == 0) {
            w39.n0(obj);
            na1 na1VarD = d(this.a);
            co coVar = new co((Object) this, (Object) ld6Var, q51Var, (byte) 2);
            ub2Var.h0 = 1;
            Object objX = wl7.x(na1VarD, coVar, ub2Var);
            c71 c71Var = c71.X;
            if (objX == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(s51 s51Var) {
        vb2 vb2Var;
        ux0 ux0Var;
        if (s51Var instanceof vb2) {
            vb2Var = (vb2) s51Var;
            int i = vb2Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                vb2Var.i0 = i - Integer.MIN_VALUE;
            } else {
                vb2Var = new vb2(this, s51Var);
            }
        } else {
            vb2Var = new vb2(this, s51Var);
        }
        Object obj = vb2Var.g0;
        int i2 = vb2Var.i0;
        c71 c71Var = c71.X;
        if (i2 == 0) {
            w39.n0(obj);
            ux0 ux0Var2 = new ux0();
            na1 na1VarD = d(this.a);
            k kVar = new k(ux0Var2, (q51) null, (byte) 11);
            vb2Var.f0 = ux0Var2;
            vb2Var.i0 = 1;
            if (wl7.x(na1VarD, kVar, vb2Var) != c71Var) {
                ux0Var = ux0Var2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                w39.n0(obj);
                return obj;
            }
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ux0Var = vb2Var.f0;
        w39.n0(obj);
        vb2Var.f0 = null;
        vb2Var.i0 = 2;
        Object objH = ux0Var.h(vb2Var);
        return objH == c71Var ? c71Var : objH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(s51 s51Var) {
        wb2 wb2Var;
        if (s51Var instanceof wb2) {
            wb2Var = (wb2) s51Var;
            int i = wb2Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                wb2Var.h0 = i - Integer.MIN_VALUE;
            } else {
                wb2Var = new wb2(this, s51Var);
            }
        } else {
            wb2Var = new wb2(this, s51Var);
        }
        Object obj = wb2Var.f0;
        int i2 = wb2Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            na1 na1VarD = d(this.a);
            xb2 xb2Var = new xb2(this, jCurrentTimeMillis, (q51) null, (byte) 0);
            wb2Var.h0 = 1;
            Object objX = wl7.x(na1VarD, xb2Var, wb2Var);
            c71 c71Var = c71.X;
            if (objX == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final na1 d(Context context) {
        return (na1) this.f.a(l[0], context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:25:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f1 A[LOOP:0: B:38:0x00eb->B:40:0x00f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0110  */
    /* JADX WARN: Code duplicated, block: B:46:0x012e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0130  */
    /* JADX WARN: Code duplicated, block: B:51:0x0145  */
    /* JADX WARN: Code duplicated, block: B:54:0x014c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0164  */
    /* JADX WARN: Code duplicated, block: B:60:0x016e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0183, code lost:
    
        if (f(r7, r2) == r6) goto L62;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x0130, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, s51 s51Var) {
        yb2 yb2Var;
        String str2;
        Object objQ;
        String str3;
        Object objQ2;
        String str4;
        String str5;
        Set set;
        Object objQ3;
        Set set2;
        Long l2;
        long jLongValue;
        ArrayList arrayList;
        Iterator it;
        Set setC1;
        long jCurrentTimeMillis;
        boolean z;
        long j;
        Set set3;
        if (s51Var instanceof yb2) {
            yb2Var = (yb2) s51Var;
            int i = yb2Var.o0;
            if ((i & Integer.MIN_VALUE) != 0) {
                yb2Var.o0 = i - Integer.MIN_VALUE;
            } else {
                yb2Var = new yb2(this, s51Var);
            }
        } else {
            yb2Var = new yb2(this, s51Var);
        }
        Object obj = yb2Var.m0;
        int i2 = yb2Var.o0;
        boolean z2 = true;
        Object obj2 = c71.X;
        switch (i2) {
            case 0:
                w39.n0(obj);
                str2 = str;
                yb2Var.f0 = str2;
                yb2Var.o0 = 1;
                objQ = gv3.q(this.i, yb2Var);
                if (objQ != obj2) {
                    str3 = (String) objQ;
                    yb2Var.f0 = str2;
                    yb2Var.g0 = str3;
                    yb2Var.o0 = 2;
                    objQ2 = gv3.q(this.j, yb2Var);
                    if (objQ2 != obj2) {
                        str4 = str2;
                        obj = objQ2;
                        str5 = str3;
                        set = (Set) obj;
                        if (set == null) {
                            set = m02.X;
                        }
                        yb2Var.f0 = str4;
                        yb2Var.g0 = str5;
                        yb2Var.h0 = set;
                        yb2Var.o0 = 3;
                        objQ3 = gv3.q(this.k, yb2Var);
                        if (objQ3 != obj2) {
                            set2 = set;
                            obj = objQ3;
                            l2 = (Long) obj;
                            if (l2 != null) {
                                jLongValue = l2.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            kw4 kw4Var = kw4.a;
                            ArrayList arrayListT = kw4.t();
                            arrayList = new ArrayList(xv0.Z(arrayListT, 10));
                            it = arrayListT.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ProviderId) it.next()).getValue());
                            }
                            setC1 = wv0.c1(arrayList);
                            jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                            if (!dh3.f(str5, str4)) {
                                yb2Var.f0 = null;
                                yb2Var.g0 = null;
                                yb2Var.h0 = set2;
                                yb2Var.i0 = setC1;
                                yb2Var.j0 = jLongValue;
                                yb2Var.k0 = jCurrentTimeMillis;
                                yb2Var.l0 = true;
                                yb2Var.o0 = 4;
                                z = h(str4, yb2Var) != obj2;
                            }
                            j = jCurrentTimeMillis;
                            set3 = setC1;
                            set2.getClass();
                            set3.getClass();
                            if (set2.size() == set3.size() || !set2.containsAll(set3)) {
                                yb2Var.f0 = null;
                                yb2Var.g0 = null;
                                yb2Var.h0 = null;
                                yb2Var.i0 = null;
                                yb2Var.j0 = jLongValue;
                                yb2Var.k0 = j;
                                yb2Var.l0 = true;
                                yb2Var.o0 = 5;
                                if (g(setC1, yb2Var) != obj2) {
                                    z = true;
                                    if (j - jLongValue > 259200) {
                                        yb2Var.f0 = null;
                                        yb2Var.g0 = null;
                                        yb2Var.h0 = null;
                                        yb2Var.i0 = null;
                                        yb2Var.j0 = jLongValue;
                                        yb2Var.k0 = j;
                                        yb2Var.l0 = true;
                                        yb2Var.o0 = 6;
                                    }
                                }
                                break;
                            } else {
                                if (j - jLongValue > 259200) {
                                    yb2Var.f0 = null;
                                    yb2Var.g0 = null;
                                    yb2Var.h0 = null;
                                    yb2Var.i0 = null;
                                    yb2Var.j0 = jLongValue;
                                    yb2Var.k0 = j;
                                    yb2Var.l0 = true;
                                    yb2Var.o0 = 6;
                                }
                                break;
                            }
                            return Boolean.valueOf(z);
                        }
                    }
                }
                return obj2;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                String str6 = yb2Var.f0;
                w39.n0(obj);
                objQ = obj;
                str2 = str6;
                str3 = (String) objQ;
                yb2Var.f0 = str2;
                yb2Var.g0 = str3;
                yb2Var.o0 = 2;
                objQ2 = gv3.q(this.j, yb2Var);
                if (objQ2 != obj2) {
                    str4 = str2;
                    obj = objQ2;
                    str5 = str3;
                    set = (Set) obj;
                    if (set == null) {
                        set = m02.X;
                    }
                    yb2Var.f0 = str4;
                    yb2Var.g0 = str5;
                    yb2Var.h0 = set;
                    yb2Var.o0 = 3;
                    objQ3 = gv3.q(this.k, yb2Var);
                    if (objQ3 != obj2) {
                        set2 = set;
                        obj = objQ3;
                        l2 = (Long) obj;
                        if (l2 != null) {
                            jLongValue = l2.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        kw4 kw4Var2 = kw4.a;
                        ArrayList arrayListT2 = kw4.t();
                        arrayList = new ArrayList(xv0.Z(arrayListT2, 10));
                        it = arrayListT2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ProviderId) it.next()).getValue());
                        }
                        setC1 = wv0.c1(arrayList);
                        jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        if (!dh3.f(str5, str4)) {
                            yb2Var.f0 = null;
                            yb2Var.g0 = null;
                            yb2Var.h0 = set2;
                            yb2Var.i0 = setC1;
                            yb2Var.j0 = jLongValue;
                            yb2Var.k0 = jCurrentTimeMillis;
                            yb2Var.l0 = true;
                            yb2Var.o0 = 4;
                            if (h(str4, yb2Var) != obj2) {
                            }
                        }
                        j = jCurrentTimeMillis;
                        set3 = setC1;
                        set2.getClass();
                        set3.getClass();
                        if (set2.size() == set3.size()) {
                            yb2Var.f0 = null;
                            yb2Var.g0 = null;
                            yb2Var.h0 = null;
                            yb2Var.i0 = null;
                            yb2Var.j0 = jLongValue;
                            yb2Var.k0 = j;
                            yb2Var.l0 = true;
                            yb2Var.o0 = 5;
                            if (g(setC1, yb2Var) != obj2) {
                                z = true;
                                if (j - jLongValue > 259200) {
                                    yb2Var.f0 = null;
                                    yb2Var.g0 = null;
                                    yb2Var.h0 = null;
                                    yb2Var.i0 = null;
                                    yb2Var.j0 = jLongValue;
                                    yb2Var.k0 = j;
                                    yb2Var.l0 = true;
                                    yb2Var.o0 = 6;
                                    break;
                                }
                                return Boolean.valueOf(z);
                            }
                        } else {
                            yb2Var.f0 = null;
                            yb2Var.g0 = null;
                            yb2Var.h0 = null;
                            yb2Var.i0 = null;
                            yb2Var.j0 = jLongValue;
                            yb2Var.k0 = j;
                            yb2Var.l0 = true;
                            yb2Var.o0 = 5;
                            if (g(setC1, yb2Var) != obj2) {
                                z = true;
                                if (j - jLongValue > 259200) {
                                    yb2Var.f0 = null;
                                    yb2Var.g0 = null;
                                    yb2Var.h0 = null;
                                    yb2Var.i0 = null;
                                    yb2Var.j0 = jLongValue;
                                    yb2Var.k0 = j;
                                    yb2Var.l0 = true;
                                    yb2Var.o0 = 6;
                                    break;
                                }
                                return Boolean.valueOf(z);
                            }
                        }
                    }
                }
                return obj2;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                str3 = yb2Var.g0;
                String str7 = yb2Var.f0;
                w39.n0(obj);
                str4 = str7;
                str5 = str3;
                set = (Set) obj;
                if (set == null) {
                    set = m02.X;
                }
                yb2Var.f0 = str4;
                yb2Var.g0 = str5;
                yb2Var.h0 = set;
                yb2Var.o0 = 3;
                objQ3 = gv3.q(this.k, yb2Var);
                if (objQ3 != obj2) {
                    set2 = set;
                    obj = objQ3;
                    l2 = (Long) obj;
                    if (l2 != null) {
                        jLongValue = l2.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    kw4 kw4Var3 = kw4.a;
                    ArrayList arrayListT3 = kw4.t();
                    arrayList = new ArrayList(xv0.Z(arrayListT3, 10));
                    it = arrayListT3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ProviderId) it.next()).getValue());
                    }
                    setC1 = wv0.c1(arrayList);
                    jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    if (!dh3.f(str5, str4)) {
                        yb2Var.f0 = null;
                        yb2Var.g0 = null;
                        yb2Var.h0 = set2;
                        yb2Var.i0 = setC1;
                        yb2Var.j0 = jLongValue;
                        yb2Var.k0 = jCurrentTimeMillis;
                        yb2Var.l0 = true;
                        yb2Var.o0 = 4;
                        if (h(str4, yb2Var) != obj2) {
                        }
                    }
                    j = jCurrentTimeMillis;
                    set3 = setC1;
                    set2.getClass();
                    set3.getClass();
                    if (set2.size() == set3.size()) {
                        yb2Var.f0 = null;
                        yb2Var.g0 = null;
                        yb2Var.h0 = null;
                        yb2Var.i0 = null;
                        yb2Var.j0 = jLongValue;
                        yb2Var.k0 = j;
                        yb2Var.l0 = true;
                        yb2Var.o0 = 5;
                        if (g(setC1, yb2Var) != obj2) {
                            z = true;
                            if (j - jLongValue > 259200) {
                                yb2Var.f0 = null;
                                yb2Var.g0 = null;
                                yb2Var.h0 = null;
                                yb2Var.i0 = null;
                                yb2Var.j0 = jLongValue;
                                yb2Var.k0 = j;
                                yb2Var.l0 = true;
                                yb2Var.o0 = 6;
                                break;
                            }
                            return Boolean.valueOf(z);
                        }
                    } else {
                        yb2Var.f0 = null;
                        yb2Var.g0 = null;
                        yb2Var.h0 = null;
                        yb2Var.i0 = null;
                        yb2Var.j0 = jLongValue;
                        yb2Var.k0 = j;
                        yb2Var.l0 = true;
                        yb2Var.o0 = 5;
                        if (g(setC1, yb2Var) != obj2) {
                            z = true;
                            if (j - jLongValue > 259200) {
                                yb2Var.f0 = null;
                                yb2Var.g0 = null;
                                yb2Var.h0 = null;
                                yb2Var.i0 = null;
                                yb2Var.j0 = jLongValue;
                                yb2Var.k0 = j;
                                yb2Var.l0 = true;
                                yb2Var.o0 = 6;
                                break;
                            }
                            return Boolean.valueOf(z);
                        }
                    }
                }
                return obj2;
            case 3:
                Set set4 = yb2Var.h0;
                str5 = yb2Var.g0;
                str4 = yb2Var.f0;
                w39.n0(obj);
                set2 = set4;
                l2 = (Long) obj;
                if (l2 != null) {
                    jLongValue = l2.longValue();
                } else {
                    jLongValue = 0;
                }
                kw4 kw4Var4 = kw4.a;
                ArrayList arrayListT4 = kw4.t();
                arrayList = new ArrayList(xv0.Z(arrayListT4, 10));
                it = arrayListT4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ProviderId) it.next()).getValue());
                }
                setC1 = wv0.c1(arrayList);
                jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                if (!dh3.f(str5, str4)) {
                    yb2Var.f0 = null;
                    yb2Var.g0 = null;
                    yb2Var.h0 = set2;
                    yb2Var.i0 = setC1;
                    yb2Var.j0 = jLongValue;
                    yb2Var.k0 = jCurrentTimeMillis;
                    yb2Var.l0 = true;
                    yb2Var.o0 = 4;
                    if (h(str4, yb2Var) != obj2) {
                    }
                    return obj2;
                }
                j = jCurrentTimeMillis;
                set3 = setC1;
                set2.getClass();
                set3.getClass();
                if (set2.size() == set3.size()) {
                    yb2Var.f0 = null;
                    yb2Var.g0 = null;
                    yb2Var.h0 = null;
                    yb2Var.i0 = null;
                    yb2Var.j0 = jLongValue;
                    yb2Var.k0 = j;
                    yb2Var.l0 = true;
                    yb2Var.o0 = 5;
                    if (g(setC1, yb2Var) != obj2) {
                        z = true;
                        if (j - jLongValue > 259200) {
                            yb2Var.f0 = null;
                            yb2Var.g0 = null;
                            yb2Var.h0 = null;
                            yb2Var.i0 = null;
                            yb2Var.j0 = jLongValue;
                            yb2Var.k0 = j;
                            yb2Var.l0 = true;
                            yb2Var.o0 = 6;
                            break;
                        }
                        return Boolean.valueOf(z);
                    }
                } else {
                    yb2Var.f0 = null;
                    yb2Var.g0 = null;
                    yb2Var.h0 = null;
                    yb2Var.i0 = null;
                    yb2Var.j0 = jLongValue;
                    yb2Var.k0 = j;
                    yb2Var.l0 = true;
                    yb2Var.o0 = 5;
                    if (g(setC1, yb2Var) != obj2) {
                        z = true;
                        if (j - jLongValue > 259200) {
                            yb2Var.f0 = null;
                            yb2Var.g0 = null;
                            yb2Var.h0 = null;
                            yb2Var.i0 = null;
                            yb2Var.j0 = jLongValue;
                            yb2Var.k0 = j;
                            yb2Var.l0 = true;
                            yb2Var.o0 = 6;
                            break;
                        }
                        return Boolean.valueOf(z);
                    }
                }
                return obj2;
            case 4:
                z = yb2Var.l0;
                j = yb2Var.k0;
                jLongValue = yb2Var.j0;
                setC1 = yb2Var.i0;
                set2 = yb2Var.h0;
                w39.n0(obj);
                set3 = setC1;
                set2.getClass();
                set3.getClass();
                if (set2.size() == set3.size()) {
                    yb2Var.f0 = null;
                    yb2Var.g0 = null;
                    yb2Var.h0 = null;
                    yb2Var.i0 = null;
                    yb2Var.j0 = jLongValue;
                    yb2Var.k0 = j;
                    yb2Var.l0 = true;
                    yb2Var.o0 = 5;
                    if (g(setC1, yb2Var) != obj2) {
                        z = true;
                        if (j - jLongValue > 259200) {
                            yb2Var.f0 = null;
                            yb2Var.g0 = null;
                            yb2Var.h0 = null;
                            yb2Var.i0 = null;
                            yb2Var.j0 = jLongValue;
                            yb2Var.k0 = j;
                            yb2Var.l0 = true;
                            yb2Var.o0 = 6;
                            break;
                        }
                        return Boolean.valueOf(z);
                    }
                } else {
                    yb2Var.f0 = null;
                    yb2Var.g0 = null;
                    yb2Var.h0 = null;
                    yb2Var.i0 = null;
                    yb2Var.j0 = jLongValue;
                    yb2Var.k0 = j;
                    yb2Var.l0 = true;
                    yb2Var.o0 = 5;
                    if (g(setC1, yb2Var) != obj2) {
                        z = true;
                        if (j - jLongValue > 259200) {
                            yb2Var.f0 = null;
                            yb2Var.g0 = null;
                            yb2Var.h0 = null;
                            yb2Var.i0 = null;
                            yb2Var.j0 = jLongValue;
                            yb2Var.k0 = j;
                            yb2Var.l0 = true;
                            yb2Var.o0 = 6;
                            break;
                        }
                        return Boolean.valueOf(z);
                    }
                }
                return obj2;
            case 5:
                z = yb2Var.l0;
                j = yb2Var.k0;
                jLongValue = yb2Var.j0;
                Set set5 = yb2Var.i0;
                Set set6 = yb2Var.h0;
                w39.n0(obj);
                if (j - jLongValue > 259200) {
                    yb2Var.f0 = null;
                    yb2Var.g0 = null;
                    yb2Var.h0 = null;
                    yb2Var.i0 = null;
                    yb2Var.j0 = jLongValue;
                    yb2Var.k0 = j;
                    yb2Var.l0 = true;
                    yb2Var.o0 = 6;
                    break;
                }
                return Boolean.valueOf(z);
            case 6:
                z2 = yb2Var.l0;
                Set set7 = yb2Var.i0;
                Set set8 = yb2Var.h0;
                w39.n0(obj);
                z = z2;
                return Boolean.valueOf(z);
            default:
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(long j, s51 s51Var) {
        lc2 lc2Var;
        if (s51Var instanceof lc2) {
            lc2Var = (lc2) s51Var;
            int i = lc2Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                lc2Var.h0 = i - Integer.MIN_VALUE;
            } else {
                lc2Var = new lc2(this, s51Var);
            }
        } else {
            lc2Var = new lc2(this, s51Var);
        }
        Object obj = lc2Var.f0;
        int i2 = lc2Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            na1 na1VarD = d(this.a);
            xb2 xb2Var = new xb2(this, j, (q51) null, (byte) 1);
            lc2Var.h0 = 1;
            Object objX = wl7.x(na1VarD, xb2Var, lc2Var);
            c71 c71Var = c71.X;
            if (objX == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(Set set, s51 s51Var) {
        mc2 mc2Var;
        if (s51Var instanceof mc2) {
            mc2Var = (mc2) s51Var;
            int i = mc2Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                mc2Var.h0 = i - Integer.MIN_VALUE;
            } else {
                mc2Var = new mc2(this, s51Var);
            }
        } else {
            mc2Var = new mc2(this, s51Var);
        }
        Object obj = mc2Var.f0;
        int i2 = mc2Var.h0;
        q51 q51Var = null;
        if (i2 == 0) {
            w39.n0(obj);
            na1 na1VarD = d(this.a);
            co coVar = new co((Object) this, (Object) set, q51Var, (byte) 3);
            mc2Var.h0 = 1;
            Object objX = wl7.x(na1VarD, coVar, mc2Var);
            c71 c71Var = c71.X;
            if (objX == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, s51 s51Var) {
        nc2 nc2Var;
        if (s51Var instanceof nc2) {
            nc2Var = (nc2) s51Var;
            int i = nc2Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                nc2Var.h0 = i - Integer.MIN_VALUE;
            } else {
                nc2Var = new nc2(this, s51Var);
            }
        } else {
            nc2Var = new nc2(this, s51Var);
        }
        Object obj = nc2Var.f0;
        int i2 = nc2Var.h0;
        q51 q51Var = null;
        if (i2 == 0) {
            w39.n0(obj);
            na1 na1VarD = d(this.a);
            oc2 oc2Var = new oc2(this, str, q51Var, (byte) 0);
            nc2Var.h0 = 1;
            Object objX = wl7.x(na1VarD, oc2Var, nc2Var);
            c71 c71Var = c71.X;
            if (objX == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, s51 s51Var) {
        pc2 pc2Var;
        if (s51Var instanceof pc2) {
            pc2Var = (pc2) s51Var;
            int i = pc2Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                pc2Var.h0 = i - Integer.MIN_VALUE;
            } else {
                pc2Var = new pc2(this, s51Var);
            }
        } else {
            pc2Var = new pc2(this, s51Var);
        }
        Object obj = pc2Var.f0;
        int i2 = pc2Var.h0;
        q51 q51Var = null;
        byte b = 1;
        if (i2 == 0) {
            w39.n0(obj);
            na1 na1VarD = d(this.a);
            oc2 oc2Var = new oc2(this, str, q51Var, b);
            pc2Var.h0 = 1;
            Object objX = wl7.x(na1VarD, oc2Var, pc2Var);
            c71 c71Var = c71.X;
            if (objX == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8.a;
    }
}
