package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2;
import su.happ.proxyutility.dto.ConfigGroupCache;
import su.happ.proxyutility.dto.SendTVGetResponse;
import su.happ.proxyutility.dto.ServerCache;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.InboundAuthMode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class n implements ze2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ze2 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ n(ze2 ze2Var, byte b) {
        this.X = b;
        this.Y = ze2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:104:0x0178  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:149:0x0224  */
    /* JADX WARN: Code duplicated, block: B:169:0x026d  */
    /* JADX WARN: Code duplicated, block: B:196:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:223:0x0353  */
    /* JADX WARN: Code duplicated, block: B:230:0x0366  */
    /* JADX WARN: Code duplicated, block: B:247:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:262:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:279:0x0421  */
    /* JADX WARN: Code duplicated, block: B:294:0x0459  */
    /* JADX WARN: Code duplicated, block: B:309:0x0496  */
    /* JADX WARN: Code duplicated, block: B:324:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:339:0x050a  */
    /* JADX WARN: Code duplicated, block: B:354:0x0542  */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:371:0x057c  */
    /* JADX WARN: Code duplicated, block: B:386:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:401:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:418:0x0626  */
    /* JADX WARN: Code duplicated, block: B:444:0x0687  */
    /* JADX WARN: Code duplicated, block: B:459:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:474:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:489:0x0737  */
    /* JADX WARN: Code duplicated, block: B:520:0x0796  */
    /* JADX WARN: Code duplicated, block: B:537:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:612:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0108  */
    /* JADX WARN: Code duplicated, block: B:89:0x0140  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public final Object l(Object obj, q51 q51Var) throws Throwable {
        m mVar;
        i31 i31Var;
        ua1 ua1Var;
        bo1 bo1Var;
        b52 b52Var;
        d52 d52Var;
        ec2 ec2Var;
        og2 og2Var;
        u93 u93Var;
        x93 x93Var;
        al4 al4Var;
        gl4 gl4Var;
        il4 il4Var;
        kl4 kl4Var;
        ml4 ml4Var;
        ol4 ol4Var;
        rl4 rl4Var;
        tl4 tl4Var;
        ao4 ao4Var;
        co4 co4Var;
        List configs;
        no4 no4Var;
        pm4 pm4Var;
        vo4 vo4Var;
        wj5 wj5Var;
        ak5 ak5Var;
        ck5 ck5Var;
        sk5 sk5Var;
        uk5 uk5Var;
        wk5 wk5Var;
        ao5 ao5Var;
        wi0 wi0VarV;
        y17 y17Var;
        String data;
        byte b = this.X;
        boolean z = false;
        dn8 dn8Var = dn8.a;
        ze2 ze2Var = this.Y;
        c71 c71Var = c71.X;
        Object obj2 = null;
        switch (b) {
            case 0:
                if (q51Var instanceof m) {
                    mVar = (m) q51Var;
                    int i = mVar.g0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        mVar.g0 = i - Integer.MIN_VALUE;
                    } else {
                        mVar = new m(this, q51Var);
                    }
                } else {
                    mVar = new m(this, q51Var);
                }
                Object obj3 = mVar.f0;
                int i2 = mVar.g0;
                if (i2 == 0) {
                    w39.n0(obj3);
                    String str = ((w) obj).Y;
                    mVar.g0 = 1;
                    return ze2Var.l(str, mVar) == c71Var ? c71Var : dn8Var;
                }
                if (i2 == 1) {
                    w39.n0(obj3);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                if (q51Var instanceof i31) {
                    i31Var = (i31) q51Var;
                    int i3 = i31Var.g0;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        i31Var.g0 = i3 - Integer.MIN_VALUE;
                    } else {
                        i31Var = new i31(this, q51Var);
                    }
                } else {
                    i31Var = new i31(this, q51Var);
                }
                Object obj4 = i31Var.f0;
                int i4 = i31Var.g0;
                if (i4 != 0) {
                    if (i4 == 1) {
                        w39.n0(obj4);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj4);
                if (!(obj instanceof w31)) {
                    return dn8Var;
                }
                i31Var.g0 = 1;
                return ze2Var.l(obj, i31Var) == c71Var ? c71Var : dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                if (q51Var instanceof ua1) {
                    ua1Var = (ua1) q51Var;
                    int i5 = ua1Var.g0;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ua1Var.g0 = i5 - Integer.MIN_VALUE;
                    } else {
                        ua1Var = new ua1(this, q51Var);
                    }
                } else {
                    ua1Var = new ua1(this, q51Var);
                }
                Object obj5 = ua1Var.f0;
                int i6 = ua1Var.g0;
                if (i6 == 0) {
                    w39.n0(obj5);
                    v91 v91Var = (hh7) obj;
                    if (v91Var instanceof u66) {
                        throw ((u66) v91Var).b;
                    }
                    if (v91Var instanceof v91) {
                        Object obj6 = v91Var.b;
                        ua1Var.g0 = 1;
                        return ze2Var.l(obj6, ua1Var) == c71Var ? c71Var : dn8Var;
                    }
                    if ((v91Var instanceof ma2) || (v91Var instanceof sl8) || (v91Var instanceof a55)) {
                        bt.i("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    } else {
                        b61.c();
                    }
                } else {
                    if (i6 == 1) {
                        w39.n0(obj5);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 3:
                if (q51Var instanceof bo1) {
                    bo1Var = (bo1) q51Var;
                    int i7 = bo1Var.g0;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        bo1Var.g0 = i7 - Integer.MIN_VALUE;
                    } else {
                        bo1Var = new bo1(this, q51Var);
                    }
                } else {
                    bo1Var = new bo1(this, q51Var);
                }
                Object obj7 = bo1Var.f0;
                int i8 = bo1Var.g0;
                if (i8 == 0) {
                    w39.n0(obj7);
                    c83 c83Var = ((e27) obj).c;
                    bo1Var.g0 = 1;
                    return ze2Var.l(c83Var, bo1Var) == c71Var ? c71Var : dn8Var;
                }
                if (i8 == 1) {
                    w39.n0(obj7);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (q51Var instanceof b52) {
                    b52Var = (b52) q51Var;
                    int i9 = b52Var.g0;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        b52Var.g0 = i9 - Integer.MIN_VALUE;
                    } else {
                        b52Var = new b52(this, q51Var);
                    }
                } else {
                    b52Var = new b52(this, q51Var);
                }
                Object obj8 = b52Var.f0;
                int i10 = b52Var.g0;
                if (i10 == 0) {
                    w39.n0(obj8);
                    Boolean boolValueOf = Boolean.valueOf(((k52) obj).c);
                    b52Var.g0 = 1;
                    return ze2Var.l(boolValueOf, b52Var) == c71Var ? c71Var : dn8Var;
                }
                if (i10 == 1) {
                    w39.n0(obj8);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (q51Var instanceof d52) {
                    d52Var = (d52) q51Var;
                    int i11 = d52Var.g0;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        d52Var.g0 = i11 - Integer.MIN_VALUE;
                    } else {
                        d52Var = new d52(this, q51Var);
                    }
                } else {
                    d52Var = new d52(this, q51Var);
                }
                Object obj9 = d52Var.f0;
                int i12 = d52Var.g0;
                if (i12 == 0) {
                    w39.n0(obj9);
                    List listY0 = wv0.Y0(((k52) obj).b);
                    d52Var.g0 = 1;
                    return ze2Var.l(listY0, d52Var) == c71Var ? c71Var : dn8Var;
                }
                if (i12 == 1) {
                    w39.n0(obj9);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (q51Var instanceof ec2) {
                    ec2Var = (ec2) q51Var;
                    int i13 = ec2Var.g0;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        ec2Var.g0 = i13 - Integer.MIN_VALUE;
                    } else {
                        ec2Var = new ec2(this, q51Var);
                    }
                } else {
                    ec2Var = new ec2(this, q51Var);
                }
                Object obj10 = ec2Var.f0;
                int i14 = ec2Var.g0;
                if (i14 != 0) {
                    if (i14 == 1) {
                        w39.n0(obj10);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj10);
                ArrayList arrayList = new ArrayList();
                for (Object obj11 : (List) obj) {
                    ld6 ld6Var = (ld6) obj11;
                    if (ld6Var.g0 == kd6.Y && !ld6Var.h0) {
                        arrayList.add(obj11);
                    }
                }
                obj2 = arrayList.isEmpty() ? null : arrayList;
                ec2Var.g0 = 1;
                return ze2Var.l(obj2, ec2Var) == c71Var ? c71Var : dn8Var;
            case 7:
                if (q51Var instanceof og2) {
                    og2Var = (og2) q51Var;
                    int i15 = og2Var.g0;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        og2Var.g0 = i15 - Integer.MIN_VALUE;
                    } else {
                        og2Var = new og2(this, q51Var);
                    }
                } else {
                    og2Var = new og2(this, q51Var);
                }
                Object obj12 = og2Var.f0;
                int i16 = og2Var.g0;
                if (i16 != 0) {
                    if (i16 == 1) {
                        w39.n0(obj12);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj12);
                if (obj == null) {
                    return dn8Var;
                }
                og2Var.g0 = 1;
                return ze2Var.l(obj, og2Var) == c71Var ? c71Var : dn8Var;
            case 8:
                if (q51Var instanceof u93) {
                    u93Var = (u93) q51Var;
                    int i17 = u93Var.g0;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        u93Var.g0 = i17 - Integer.MIN_VALUE;
                    } else {
                        u93Var = new u93(this, q51Var);
                    }
                } else {
                    u93Var = new u93(this, q51Var);
                }
                Object obj13 = u93Var.f0;
                int i18 = u93Var.g0;
                if (i18 == 0) {
                    w39.n0(obj13);
                    InboundAuthMode inboundAuthMode = ((q93) obj).a.b;
                    u93Var.g0 = 1;
                    return ze2Var.l(inboundAuthMode, u93Var) == c71Var ? c71Var : dn8Var;
                }
                if (i18 == 1) {
                    w39.n0(obj13);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (q51Var instanceof x93) {
                    x93Var = (x93) q51Var;
                    int i19 = x93Var.g0;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        x93Var.g0 = i19 - Integer.MIN_VALUE;
                    } else {
                        x93Var = new x93(this, q51Var);
                    }
                } else {
                    x93Var = new x93(this, q51Var);
                }
                Object obj14 = x93Var.f0;
                int i20 = x93Var.g0;
                if (i20 == 0) {
                    w39.n0(obj14);
                    InboundAuthMode inboundAuthMode2 = ((q93) obj).c.b;
                    x93Var.g0 = 1;
                    return ze2Var.l(inboundAuthMode2, x93Var) == c71Var ? c71Var : dn8Var;
                }
                if (i20 == 1) {
                    w39.n0(obj14);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                if (q51Var instanceof al4) {
                    al4Var = (al4) q51Var;
                    int i21 = al4Var.g0;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        al4Var.g0 = i21 - Integer.MIN_VALUE;
                    } else {
                        al4Var = new al4(this, q51Var);
                    }
                } else {
                    al4Var = new al4(this, q51Var);
                }
                Object obj15 = al4Var.f0;
                int i22 = al4Var.g0;
                if (i22 != 0) {
                    if (i22 == 1) {
                        w39.n0(obj15);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj15);
                pm4 pm4Var2 = ((xm4) obj).m;
                if (pm4Var2 == null) {
                    return dn8Var;
                }
                al4Var.g0 = 1;
                return ze2Var.l(pm4Var2, al4Var) == c71Var ? c71Var : dn8Var;
            case 11:
                if (q51Var instanceof gl4) {
                    gl4Var = (gl4) q51Var;
                    int i23 = gl4Var.g0;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        gl4Var.g0 = i23 - Integer.MIN_VALUE;
                    } else {
                        gl4Var = new gl4(this, q51Var);
                    }
                } else {
                    gl4Var = new gl4(this, q51Var);
                }
                Object obj16 = gl4Var.f0;
                int i24 = gl4Var.g0;
                if (i24 == 0) {
                    w39.n0(obj16);
                    a45 a45Var = ((xm4) obj).h;
                    gl4Var.g0 = 1;
                    return ze2Var.l(a45Var, gl4Var) == c71Var ? c71Var : dn8Var;
                }
                if (i24 == 1) {
                    w39.n0(obj16);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (q51Var instanceof il4) {
                    il4Var = (il4) q51Var;
                    int i25 = il4Var.g0;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        il4Var.g0 = i25 - Integer.MIN_VALUE;
                    } else {
                        il4Var = new il4(this, q51Var);
                    }
                } else {
                    il4Var = new il4(this, q51Var);
                }
                Object obj17 = il4Var.f0;
                int i26 = il4Var.g0;
                if (i26 == 0) {
                    w39.n0(obj17);
                    ServerConfig serverConfig = ((xm4) obj).c;
                    il4Var.g0 = 1;
                    return ze2Var.l(serverConfig, il4Var) == c71Var ? c71Var : dn8Var;
                }
                if (i26 == 1) {
                    w39.n0(obj17);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (q51Var instanceof kl4) {
                    kl4Var = (kl4) q51Var;
                    int i27 = kl4Var.g0;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        kl4Var.g0 = i27 - Integer.MIN_VALUE;
                    } else {
                        kl4Var = new kl4(this, q51Var);
                    }
                } else {
                    kl4Var = new kl4(this, q51Var);
                }
                Object obj18 = kl4Var.f0;
                int i28 = kl4Var.g0;
                if (i28 == 0) {
                    w39.n0(obj18);
                    Boolean boolValueOf2 = Boolean.valueOf(((xm4) obj).q);
                    kl4Var.g0 = 1;
                    return ze2Var.l(boolValueOf2, kl4Var) == c71Var ? c71Var : dn8Var;
                }
                if (i28 == 1) {
                    w39.n0(obj18);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (q51Var instanceof ml4) {
                    ml4Var = (ml4) q51Var;
                    int i29 = ml4Var.g0;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        ml4Var.g0 = i29 - Integer.MIN_VALUE;
                    } else {
                        ml4Var = new ml4(this, q51Var);
                    }
                } else {
                    ml4Var = new ml4(this, q51Var);
                }
                Object obj19 = ml4Var.f0;
                int i30 = ml4Var.g0;
                if (i30 == 0) {
                    w39.n0(obj19);
                    Boolean boolValueOf3 = Boolean.valueOf(!((xm4) obj).j);
                    ml4Var.g0 = 1;
                    return ze2Var.l(boolValueOf3, ml4Var) == c71Var ? c71Var : dn8Var;
                }
                if (i30 == 1) {
                    w39.n0(obj19);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (q51Var instanceof ol4) {
                    ol4Var = (ol4) q51Var;
                    int i31 = ol4Var.g0;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        ol4Var.g0 = i31 - Integer.MIN_VALUE;
                    } else {
                        ol4Var = new ol4(this, q51Var);
                    }
                } else {
                    ol4Var = new ol4(this, q51Var);
                }
                Object obj20 = ol4Var.f0;
                int i32 = ol4Var.g0;
                if (i32 == 0) {
                    w39.n0(obj20);
                    qm4 qm4Var = ((xm4) obj).s;
                    ol4Var.g0 = 1;
                    return ze2Var.l(qm4Var, ol4Var) == c71Var ? c71Var : dn8Var;
                }
                if (i32 == 1) {
                    w39.n0(obj20);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (q51Var instanceof rl4) {
                    rl4Var = (rl4) q51Var;
                    int i33 = rl4Var.g0;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        rl4Var.g0 = i33 - Integer.MIN_VALUE;
                    } else {
                        rl4Var = new rl4(this, q51Var);
                    }
                } else {
                    rl4Var = new rl4(this, q51Var);
                }
                Object obj21 = rl4Var.f0;
                int i34 = rl4Var.g0;
                if (i34 != 0) {
                    if (i34 == 1) {
                        w39.n0(obj21);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj21);
                if (((Number) obj).longValue() == 0) {
                    return dn8Var;
                }
                rl4Var.g0 = 1;
                return ze2Var.l(obj, rl4Var) == c71Var ? c71Var : dn8Var;
            case 17:
                if (q51Var instanceof tl4) {
                    tl4Var = (tl4) q51Var;
                    int i35 = tl4Var.g0;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        tl4Var.g0 = i35 - Integer.MIN_VALUE;
                    } else {
                        tl4Var = new tl4(this, q51Var);
                    }
                } else {
                    tl4Var = new tl4(this, q51Var);
                }
                Object obj22 = tl4Var.f0;
                int i36 = tl4Var.g0;
                if (i36 == 0) {
                    w39.n0(obj22);
                    Long l = new Long(((xm4) obj).b);
                    tl4Var.g0 = 1;
                    return ze2Var.l(l, tl4Var) == c71Var ? c71Var : dn8Var;
                }
                if (i36 == 1) {
                    w39.n0(obj22);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                if (q51Var instanceof ao4) {
                    ao4Var = (ao4) q51Var;
                    int i37 = ao4Var.g0;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        ao4Var.g0 = i37 - Integer.MIN_VALUE;
                    } else {
                        ao4Var = new ao4(this, q51Var);
                    }
                } else {
                    ao4Var = new ao4(this, q51Var);
                }
                Object obj23 = ao4Var.f0;
                int i38 = ao4Var.g0;
                if (i38 != 0) {
                    if (i38 == 1) {
                        w39.n0(obj23);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj23);
                if (((List) obj).isEmpty()) {
                    return dn8Var;
                }
                ao4Var.g0 = 1;
                return ze2Var.l(obj, ao4Var) == c71Var ? c71Var : dn8Var;
            case 19:
                if (q51Var instanceof co4) {
                    co4Var = (co4) q51Var;
                    int i39 = co4Var.g0;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        co4Var.g0 = i39 - Integer.MIN_VALUE;
                    } else {
                        co4Var = new co4(this, q51Var);
                    }
                } else {
                    co4Var = new co4(this, q51Var);
                }
                Object obj24 = co4Var.f0;
                int i40 = co4Var.g0;
                if (i40 != 0) {
                    if (i40 == 1) {
                        w39.n0(obj24);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj24);
                for (Object obj25 : (List) obj) {
                    ConfigGroupCache configGroupCache = (ConfigGroupCache) obj25;
                    SubscriptionItem subscriptionItem = configGroupCache.getSubscriptionItem();
                    if (!(subscriptionItem != null ? dh3.f(subscriptionItem.getImport(), Boolean.FALSE) : false) && ((configs = configGroupCache.getConfigs()) == null || !configs.isEmpty())) {
                        Iterator it = configs.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                continue;
                            } else if (((ServerCache) it.next()).getIsSelected()) {
                                obj2 = obj25;
                                co4Var.g0 = 1;
                                if (ze2Var.l(obj2, co4Var) == c71Var) {
                                    return c71Var;
                                }
                                return dn8Var;
                            }
                        }
                    }
                }
                co4Var.g0 = 1;
                if (ze2Var.l(obj2, co4Var) == c71Var) {
                    return c71Var;
                }
                return dn8Var;
            case 20:
                if (q51Var instanceof no4) {
                    no4Var = (no4) q51Var;
                    int i41 = no4Var.g0;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        no4Var.g0 = i41 - Integer.MIN_VALUE;
                    } else {
                        no4Var = new no4(this, q51Var);
                    }
                } else {
                    no4Var = new no4(this, q51Var);
                }
                Object obj26 = no4Var.f0;
                int i42 = no4Var.g0;
                if (i42 != 0) {
                    if (i42 == 1) {
                        w39.n0(obj26);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj26);
                b2 b2Var = (cm5) obj;
                StateDownloadFileV2 success = new StateDownloadFileV2.Success(System.currentTimeMillis());
                Iterator it2 = b2Var.e().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        StateDownloadFileV2 stateDownloadFileV2 = (StateDownloadFileV2) it2.next();
                        if (stateDownloadFileV2 instanceof StateDownloadFileV2.Error) {
                            pm4Var = new pm4(stateDownloadFileV2, false, 6);
                        } else if (!(success instanceof StateDownloadFileV2.Loading) && (stateDownloadFileV2 instanceof StateDownloadFileV2.Loading)) {
                            success = stateDownloadFileV2;
                        }
                    } else {
                        pm4Var = new pm4(success, b2Var.isEmpty(), 4);
                    }
                }
                no4Var.g0 = 1;
                return ze2Var.l(pm4Var, no4Var) == c71Var ? c71Var : dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                if (q51Var instanceof vo4) {
                    vo4Var = (vo4) q51Var;
                    int i43 = vo4Var.g0;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        vo4Var.g0 = i43 - Integer.MIN_VALUE;
                    } else {
                        vo4Var = new vo4(this, q51Var);
                    }
                } else {
                    vo4Var = new vo4(this, q51Var);
                }
                Object obj27 = vo4Var.f0;
                int i44 = vo4Var.g0;
                if (i44 != 0) {
                    if (i44 == 1) {
                        w39.n0(obj27);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj27);
                if (!((List) obj).isEmpty()) {
                    kw4 kw4Var = kw4.a;
                    if (kw4.n()) {
                        z = true;
                    }
                }
                Boolean boolValueOf4 = Boolean.valueOf(z);
                vo4Var.g0 = 1;
                return ze2Var.l(boolValueOf4, vo4Var) == c71Var ? c71Var : dn8Var;
            case 22:
                if (q51Var instanceof wj5) {
                    wj5Var = (wj5) q51Var;
                    int i45 = wj5Var.g0;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        wj5Var.g0 = i45 - Integer.MIN_VALUE;
                    } else {
                        wj5Var = new wj5(this, q51Var);
                    }
                } else {
                    wj5Var = new wj5(this, q51Var);
                }
                Object obj28 = wj5Var.f0;
                int i46 = wj5Var.g0;
                if (i46 == 0) {
                    w39.n0(obj28);
                    j2 j2Var = ((lk5) obj).e;
                    wj5Var.g0 = 1;
                    return ze2Var.l(j2Var, wj5Var) == c71Var ? c71Var : dn8Var;
                }
                if (i46 == 1) {
                    w39.n0(obj28);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                if (q51Var instanceof ak5) {
                    ak5Var = (ak5) q51Var;
                    int i47 = ak5Var.g0;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        ak5Var.g0 = i47 - Integer.MIN_VALUE;
                    } else {
                        ak5Var = new ak5(this, q51Var);
                    }
                } else {
                    ak5Var = new ak5(this, q51Var);
                }
                Object obj29 = ak5Var.f0;
                int i48 = ak5Var.g0;
                if (i48 == 0) {
                    w39.n0(obj29);
                    jk5 jk5Var = ((lk5) obj).a;
                    ak5Var.g0 = 1;
                    return ze2Var.l(jk5Var, ak5Var) == c71Var ? c71Var : dn8Var;
                }
                if (i48 == 1) {
                    w39.n0(obj29);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                if (q51Var instanceof ck5) {
                    ck5Var = (ck5) q51Var;
                    int i49 = ck5Var.g0;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        ck5Var.g0 = i49 - Integer.MIN_VALUE;
                    } else {
                        ck5Var = new ck5(this, q51Var);
                    }
                } else {
                    ck5Var = new ck5(this, q51Var);
                }
                Object obj30 = ck5Var.f0;
                int i50 = ck5Var.g0;
                if (i50 == 0) {
                    w39.n0(obj30);
                    Boolean boolValueOf5 = Boolean.valueOf(((lk5) obj).g);
                    ck5Var.g0 = 1;
                    return ze2Var.l(boolValueOf5, ck5Var) == c71Var ? c71Var : dn8Var;
                }
                if (i50 == 1) {
                    w39.n0(obj30);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (q51Var instanceof sk5) {
                    sk5Var = (sk5) q51Var;
                    int i51 = sk5Var.g0;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        sk5Var.g0 = i51 - Integer.MIN_VALUE;
                    } else {
                        sk5Var = new sk5(this, q51Var);
                    }
                } else {
                    sk5Var = new sk5(this, q51Var);
                }
                Object obj31 = sk5Var.f0;
                int i52 = sk5Var.g0;
                if (i52 == 0) {
                    w39.n0(obj31);
                    j2 j2Var2 = ((lk5) obj).c;
                    sk5Var.g0 = 1;
                    return ze2Var.l(j2Var2, sk5Var) == c71Var ? c71Var : dn8Var;
                }
                if (i52 == 1) {
                    w39.n0(obj31);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (q51Var instanceof uk5) {
                    uk5Var = (uk5) q51Var;
                    int i53 = uk5Var.g0;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        uk5Var.g0 = i53 - Integer.MIN_VALUE;
                    } else {
                        uk5Var = new uk5(this, q51Var);
                    }
                } else {
                    uk5Var = new uk5(this, q51Var);
                }
                Object obj32 = uk5Var.f0;
                int i54 = uk5Var.g0;
                if (i54 == 0) {
                    w39.n0(obj32);
                    String str2 = ((lk5) obj).b;
                    uk5Var.g0 = 1;
                    return ze2Var.l(str2, uk5Var) == c71Var ? c71Var : dn8Var;
                }
                if (i54 == 1) {
                    w39.n0(obj32);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (q51Var instanceof wk5) {
                    wk5Var = (wk5) q51Var;
                    int i55 = wk5Var.g0;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        wk5Var.g0 = i55 - Integer.MIN_VALUE;
                    } else {
                        wk5Var = new wk5(this, q51Var);
                    }
                } else {
                    wk5Var = new wk5(this, q51Var);
                }
                Object obj33 = wk5Var.f0;
                int i56 = wk5Var.g0;
                if (i56 == 0) {
                    w39.n0(obj33);
                    Boolean boolValueOf6 = Boolean.valueOf(((lk5) obj).f);
                    wk5Var.g0 = 1;
                    return ze2Var.l(boolValueOf6, wk5Var) == c71Var ? c71Var : dn8Var;
                }
                if (i56 == 1) {
                    w39.n0(obj33);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                if (q51Var instanceof ao5) {
                    ao5Var = (ao5) q51Var;
                    int i57 = ao5Var.g0;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        ao5Var.g0 = i57 - Integer.MIN_VALUE;
                    } else {
                        ao5Var = new ao5(this, q51Var);
                    }
                } else {
                    ao5Var = new ao5(this, q51Var);
                }
                Object obj34 = ao5Var.f0;
                int i58 = ao5Var.g0;
                if (i58 != 0) {
                    if (i58 == 1) {
                        w39.n0(obj34);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj34);
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = ((List) obj).iterator();
                while (it3.hasNext()) {
                    try {
                        wi0VarV = z68.v(((vi0) it3.next()).a, (String) null, (ny) null);
                    } catch (Exception unused) {
                        wi0VarV = null;
                    }
                    if (wi0VarV != null) {
                        arrayList2.add(wi0VarV);
                    }
                    break;
                }
                ao5Var.g0 = 1;
                return ze2Var.l(arrayList2, ao5Var) == c71Var ? c71Var : dn8Var;
            default:
                if (q51Var instanceof y17) {
                    y17Var = (y17) q51Var;
                    int i59 = y17Var.g0;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        y17Var.g0 = i59 - Integer.MIN_VALUE;
                    } else {
                        y17Var = new y17(this, q51Var);
                    }
                } else {
                    y17Var = new y17(this, q51Var);
                }
                Object obj35 = y17Var.f0;
                int i60 = y17Var.g0;
                if (i60 != 0) {
                    if (i60 == 1) {
                        w39.n0(obj35);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj35);
                Object obj36 = ((sj6) obj).X;
                if (obj36 instanceof rj6) {
                    obj36 = null;
                }
                SendTVGetResponse sendTVGetResponse = (SendTVGetResponse) obj36;
                if (sendTVGetResponse != null && (data = sendTVGetResponse.getData()) != null && !fm7.o0(data)) {
                    obj2 = data;
                }
                if (obj2 == null) {
                    return dn8Var;
                }
                y17Var.g0 = 1;
                return ze2Var.l(obj2, y17Var) == c71Var ? c71Var : dn8Var;
        }
    }
}
