package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.ConfigGroupCache;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.enums.EDeeplinkType;
import su.happ.proxyutility.dto.enums.EPingType;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pi extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public Object i0;
    public Object j0;
    public final /* synthetic */ Object k0;
    public final /* synthetic */ Object l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(gh1 gh1Var, q51 q51Var, Map map, pq8 pq8Var, k11 k11Var) {
        super(2, q51Var);
        this.g0 = (byte) 4;
        this.i0 = gh1Var;
        this.j0 = map;
        this.k0 = pq8Var;
        this.l0 = k11Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) throws Throwable {
        byte b = this.g0;
        c71 c71Var = c71.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((pi) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 1:
                return ((pi) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 2:
                return ((pi) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 3:
                return ((pi) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 4:
                return ((pi) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 5:
                return ((pi) n((q51) obj2, (gn2) obj)).q(dn8Var);
            case 6:
                return ((pi) n((q51) obj2, (ka) obj)).q(dn8Var);
            case 7:
                return ((pi) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 8:
                return ((pi) n((q51) obj2, (ze2) obj)).q(dn8Var);
            case 9:
                return ((pi) n((q51) obj2, (g87) obj)).q(dn8Var);
            case 10:
                ((pi) n((q51) obj2, (b71) obj)).q(dn8Var);
                return c71Var;
            case 11:
                ((pi) n((q51) obj2, (b71) obj)).q(dn8Var);
                return c71Var;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return ((pi) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 13:
                return ((pi) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 14:
                return ((pi) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 15:
                return ((pi) n((q51) obj2, (b71) obj)).q(dn8Var);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return ((pi) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 17:
                return ((pi) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 18:
                return ((pi) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 19:
                return ((pi) n((q51) obj2, (b71) obj)).q(dn8Var);
            default:
                return ((pi) n((q51) obj2, (b71) obj)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.l0;
        Object obj3 = this.k0;
        switch (b) {
            case 0:
                return new pi(this.i0, (oi) this.j0, (y05) obj3, (y05) obj2, q51Var, (byte) 0);
            case 1:
                return new pi((pz0) this.i0, (ScrollCaptureSession) this.j0, (Rect) obj3, (Consumer) obj2, q51Var, (byte) 1);
            case 2:
                return new pi((cc0) this.i0, (l49) this.j0, (AtomicInteger) obj3, (xb4) obj2, q51Var, (byte) 2);
            case 3:
                return new pi((ConstraintTrackingWorker) this.i0, (ec4) this.j0, (cc0) obj3, (l49) obj2, q51Var, (byte) 3);
            case 4:
                return new pi((gh1) this.i0, q51Var, (Map) this.j0, (pq8) obj3, (k11) obj2);
            case 5:
                pi piVar = new pi((ea6) obj3, (xu1) obj2, q51Var, (byte) 5);
                piVar.i0 = obj;
                return piVar;
            case 6:
                pi piVar2 = new pi(this.j0, obj3, obj2, q51Var, (byte) 6);
                piVar2.i0 = obj;
                return piVar2;
            case 7:
                pi piVar3 = new pi(this.j0, obj3, obj2, q51Var, (byte) 7);
                piVar3.i0 = obj;
                return piVar3;
            case 8:
                pi piVar4 = new pi((j31) obj3, (xq0) obj2, q51Var, (byte) 8);
                piVar4.i0 = obj;
                return piVar4;
            case 9:
                pi piVar5 = new pi(this.j0, obj3, this.l0, q51Var, (byte) 9);
                piVar5.i0 = obj;
                return piVar5;
            case 10:
                return new pi((r77) this.i0, (dn2) this.j0, (gn2) obj3, (Activity) obj2, q51Var, (byte) 10);
            case 11:
                return new pi((r77) this.i0, (dn2) this.j0, (Context) obj3, (gn2) obj2, q51Var, (byte) 11);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return new pi((Intent) obj3, (MainActivity) obj2, q51Var, (byte) 12);
            case 13:
                return new pi((MainActivity) this.i0, (String) this.j0, (SubscriptionItem) obj3, (sn) obj2, q51Var, (byte) 13);
            case 14:
                return new pi((MainActivity) this.i0, (String) this.j0, (SubscriptionItem) obj3, (gn2) obj2, q51Var, (byte) 14);
            case 15:
                return new pi((MainViewModel) this.i0, (ArrayList) this.j0, (String) obj3, (EPingType) obj2, q51Var, (byte) 15);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                pi piVar6 = new pi(this.j0, obj3, obj2, q51Var, (byte) 16);
                piVar6.i0 = obj;
                return piVar6;
            case 17:
                return new pi((y45) obj3, (d27) obj2, q51Var, (byte) 17);
            case 18:
                pi piVar7 = new pi(this.j0, obj3, obj2, q51Var, (byte) 18);
                piVar7.i0 = obj;
                return piVar7;
            case 19:
                return new pi((y48) this.i0, (r68) this.j0, (mq5) obj3, (a23) obj2, q51Var, (byte) 19);
            default:
                return new pi((ea6) this.i0, (p86) this.j0, (d94) obj3, (p29) obj2, q51Var, (byte) 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:179:0x0376  */
    /* JADX WARN: Code duplicated, block: B:180:0x0378 A[Catch: all -> 0x032b, TryCatch #3 {all -> 0x032b, blocks: (B:163:0x0325, B:174:0x0359, B:177:0x0362, B:181:0x0380, B:183:0x0384, B:184:0x0395, B:185:0x03aa, B:180:0x0378, B:169:0x033d, B:171:0x0349), top: B:367:0x0319 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x0383  */
    /* JADX WARN: Code duplicated, block: B:183:0x0384 A[Catch: all -> 0x032b, TryCatch #3 {all -> 0x032b, blocks: (B:163:0x0325, B:174:0x0359, B:177:0x0362, B:181:0x0380, B:183:0x0384, B:184:0x0395, B:185:0x03aa, B:180:0x0378, B:169:0x033d, B:171:0x0349), top: B:367:0x0319 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x0395 A[Catch: all -> 0x032b, TryCatch #3 {all -> 0x032b, blocks: (B:163:0x0325, B:174:0x0359, B:177:0x0362, B:181:0x0380, B:183:0x0384, B:184:0x0395, B:185:0x03aa, B:180:0x0378, B:169:0x033d, B:171:0x0349), top: B:367:0x0319 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x03aa A[Catch: all -> 0x032b, TRY_LEAVE, TryCatch #3 {all -> 0x032b, blocks: (B:163:0x0325, B:174:0x0359, B:177:0x0362, B:181:0x0380, B:183:0x0384, B:184:0x0395, B:185:0x03aa, B:180:0x0378, B:169:0x033d, B:171:0x0349), top: B:367:0x0319 }] */
    /* JADX WARN: Code duplicated, block: B:287:0x0556  */
    /* JADX WARN: Code duplicated, block: B:428:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:300:0x057c -> B:301:0x057e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:302:0x0581 -> B:303:0x0584). Please report as a decompilation issue!!! */
    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        Object objA;
        Object objA2;
        gn2 gn2Var;
        Object obj2;
        gn2 gn2Var2;
        ea6 ea6Var;
        iu1 iu1Var;
        Object objR;
        Intent intent;
        MainActivity mainActivity;
        Object objD;
        String strD;
        EDeeplinkType eDeeplinkTypeB;
        int i;
        Object rj6Var;
        Object value;
        Object value2;
        Object objW;
        y45 y45Var;
        Object value3;
        byte b = this.g0;
        byte b2 = 8;
        byte b3 = 0;
        byte b4 = 11;
        s61 s61Var = this.Y;
        byte b5 = 2;
        Object obj3 = dn8.a;
        c71 c71Var = c71.X;
        Object obj4 = this.k0;
        Object obj5 = this.l0;
        byte b6 = 1;
        q51 q51Var = null;
        switch (b) {
            case 0:
                oi oiVar = (oi) this.j0;
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    if (dh3.f(this.i0, oiVar.e.getValue())) {
                        return obj3;
                    }
                    oi oiVar2 = (oi) this.j0;
                    Object obj6 = this.i0;
                    wf7 wf7Var = ri.a;
                    pk pkVar = (pk) ((y05) obj4).getValue();
                    this.h0 = true;
                    if (oi.a(oiVar2, obj6, pkVar, null, this, 12) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                wf7 wf7Var2 = ri.a;
                gn2 gn2Var3 = (gn2) ((y05) obj5).getValue();
                if (gn2Var3 == null) {
                    return obj3;
                }
                gn2Var3.B(oiVar.d());
                return obj3;
            case 1:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    pz0 pz0Var = (pz0) this.i0;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.j0;
                    Rect rect = (Rect) obj4;
                    lf3 lf3Var = new lf3(rect.left, rect.top, rect.right, rect.bottom);
                    this.h0 = true;
                    objA = pz0Var.a(scrollCaptureSession, lf3Var, this);
                    if (objA == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                    objA = obj;
                }
                ((Consumer) obj5).accept(pu.S((lf3) objA));
                return obj3;
            case 2:
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    cc0 cc0Var = (cc0) this.i0;
                    l49 l49Var = (l49) this.j0;
                    this.h0 = true;
                    objA2 = l31.a(cc0Var, l49Var, this);
                    if (objA2 == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z3) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                    objA2 = obj;
                }
                ((AtomicInteger) obj4).set(((Number) objA2).intValue());
                ((xb4) obj5).cancel(true);
                return obj3;
            case 3:
                boolean z4 = this.h0;
                if (!z4) {
                    w39.n0(obj);
                    this.h0 = true;
                    Object objF = ((ConstraintTrackingWorker) this.i0).f((ec4) this.j0, (cc0) obj4, (l49) obj5, this);
                    return objF == c71Var ? c71Var : objF;
                }
                if (z4) {
                    w39.n0(obj);
                    return obj;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                boolean z5 = this.h0;
                if (z5) {
                    if (z5) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                xg1 xg1VarG = ((gh1) this.i0).j().g((Map) this.j0, (pq8) obj4, (k11) obj5);
                this.h0 = true;
                Object objJ0 = xg1VarG.J0(this);
                return objJ0 == c71Var ? c71Var : objJ0;
            case 5:
                ea6 ea6Var2 = (ea6) obj4;
                boolean z6 = this.h0;
                if (!z6) {
                    w39.n0(obj);
                    gn2Var = (gn2) this.i0;
                    obj2 = ea6Var2.X;
                    if (!(obj2 instanceof hu1) || (obj2 instanceof eu1)) {
                        return obj3;
                    }
                    fu1 fu1Var = obj2 instanceof fu1 ? (fu1) obj2 : null;
                    if (fu1Var != null) {
                        gn2Var.B(fu1Var);
                    }
                    x90 x90Var = ((xu1) obj5).w0;
                    if (x90Var != null) {
                        this.i0 = gn2Var;
                        this.j0 = ea6Var2;
                        this.h0 = true;
                        objR = x90Var.r(this);
                        if (objR == c71Var) {
                            return c71Var;
                        }
                        gn2Var2 = gn2Var;
                        ea6Var = ea6Var2;
                    } else {
                        gn2Var2 = gn2Var;
                        ea6Var = ea6Var2;
                        iu1Var = null;
                    }
                    ea6Var.X = iu1Var;
                    gn2Var = gn2Var2;
                    obj2 = ea6Var2.X;
                    if (obj2 instanceof hu1) {
                        return obj3;
                    }
                    return obj3;
                }
                if (!z6) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ea6 ea6Var3 = (ea6) this.j0;
                gn2 gn2Var4 = (gn2) this.i0;
                w39.n0(obj);
                gn2Var2 = gn2Var4;
                ea6Var = ea6Var3;
                objR = obj;
                iu1Var = (iu1) objR;
                ea6Var.X = iu1Var;
                gn2Var = gn2Var2;
                obj2 = ea6Var2.X;
                if (obj2 instanceof hu1) {
                    return obj3;
                }
                return obj3;
            case 6:
                boolean z7 = this.h0;
                if (z7) {
                    if (z7) {
                        w39.n0(obj);
                        return obj3;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                ka kaVar = (ka) this.i0;
                pi piVar = (pi) this.j0;
                sn snVar = new sn(kaVar, (kv1) obj4, (sd5) obj5, b2);
                this.h0 = true;
                return piVar.K(snVar, this) == c71Var ? c71Var : obj3;
            case 7:
                boolean z8 = this.h0;
                if (z8) {
                    if (z8) {
                        w39.n0(obj);
                        return obj3;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                b71 b71Var = (b71) this.i0;
                kv1 kv1Var = (kv1) this.j0;
                sn2 sn2Var = kv1Var.O0;
                long jF = tu8.f(kv1Var.P0 ? -1.0f : 1.0f, ((hu1) obj4).a);
                sd5 sd5Var = (sd5) obj5;
                iv1 iv1Var = jv1.a;
                Float f = new Float(sd5Var == sd5.X ? tu8.c(jF) : tu8.b(jF));
                this.h0 = true;
                return sn2Var.x(b71Var, f, this) == c71Var ? c71Var : obj3;
            case 8:
                ze2 ze2Var = (ze2) this.i0;
                boolean z9 = this.h0;
                try {
                    if (z9 == 0) {
                        w39.n0(obj);
                        j31 j31Var = (j31) obj4;
                        te0 te0Var = new te0((xq0) obj5, ze2Var, (byte) 4);
                        this.i0 = null;
                        this.j0 = te0Var;
                        this.h0 = true;
                        Object objA3 = j31Var.a(te0Var, this);
                        z9 = te0Var;
                        if (objA3 == c71Var) {
                            obj3 = c71Var;
                            z9 = te0Var;
                        }
                    } else {
                        if (z9 != 1) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        te0 te0Var2 = (te0) this.j0;
                        w39.n0(obj);
                        z9 = te0Var2;
                    }
                    return obj3;
                } catch (h e) {
                    if (e.X != z9) {
                        throw e;
                    }
                    s61Var.getClass();
                    u70.I(s61Var);
                    return obj3;
                }
            case 9:
                w05 w05Var = (w05) obj4;
                g87 g87Var = (g87) this.i0;
                boolean z10 = this.h0;
                if (!z10) {
                    w39.n0(obj);
                    int iOrdinal = g87Var.ordinal();
                    if (iOrdinal == 0) {
                        xe2 xe2Var = (xe2) this.j0;
                        this.i0 = null;
                        this.h0 = true;
                        return xe2Var.a(w05Var, this) == c71Var ? c71Var : obj3;
                    }
                    if (iOrdinal == 1) {
                        return obj3;
                    }
                    if (iOrdinal == 2) {
                        if (obj5 == v77.a) {
                            w05Var.e();
                            return obj3;
                        }
                        w05Var.g(obj5);
                        return obj3;
                    }
                    b61.c();
                } else {
                    if (z10) {
                        w39.n0(obj);
                        return obj3;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 10:
                boolean z11 = this.h0;
                if (z11) {
                    if (!z11) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w39.n0(obj);
                    }
                    return null;
                }
                w39.n0(obj);
                r77 r77Var = (r77) this.i0;
                tq2 tq2Var = new tq2((dn2) this.j0, (gn2) obj4, (Activity) obj5, null);
                r77Var.getClass();
                this.h0 = true;
                if (z91.n(r77Var, tq2Var, this) == c71Var) {
                    return c71Var;
                }
                bt.i("SharedFlow never completes, this call should never return.");
                return null;
            case 11:
                boolean z12 = this.h0;
                if (z12) {
                    if (!z12) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w39.n0(obj);
                    }
                    return null;
                }
                w39.n0(obj);
                r77 r77Var2 = (r77) this.i0;
                zj zjVar = new zj((dn2) this.j0, (Context) obj4, (gn2) obj5, (byte) 6);
                this.h0 = true;
                if (r77Var2.a(zjVar, this) == c71Var) {
                    return c71Var;
                }
                b61.n();
                return null;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                boolean z13 = this.h0;
                try {
                    if (!z13) {
                        w39.n0(obj);
                        intent = (Intent) obj4;
                        mainActivity = (MainActivity) obj5;
                        if (dh3.f(intent.getScheme(), "content")) {
                            this.i0 = intent;
                            this.j0 = mainActivity;
                            this.h0 = true;
                            int i2 = MainActivity.y1;
                            objD = mainActivity.D(intent, this);
                            if (objD == c71Var) {
                                return c71Var;
                            }
                        }
                        ss8 ss8Var = ss8.a;
                        strD = ss8.d(String.valueOf(intent.getData()));
                        eDeeplinkTypeB = ae1.b(strD);
                        if (eDeeplinkTypeB == null) {
                            i = -1;
                        } else {
                            i = gk4.a[eDeeplinkTypeB.ordinal()];
                        }
                        switch (i) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                u84 u84VarH = i21.H(mainActivity);
                                nf1 nf1Var = tp1.a;
                                jm4.Q(u84VarH, ye1.Z, new fk4(mainActivity, strD, q51Var, b3), 2);
                                return obj3;
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case FileClientSessionCache.MAX_SIZE /* 12 */:
                                int i3 = MainActivity.y1;
                                u84 u84VarZ = ys0.z(mainActivity.X);
                                nf1 nf1Var2 = tp1.a;
                                jm4.Q(u84VarZ, dm4.a, new y9(eDeeplinkTypeB, mainActivity, q51Var, b2), 2);
                                return obj3;
                            case 13:
                                u84 u84VarH2 = i21.H(mainActivity);
                                nf1 nf1Var3 = tp1.a;
                                jm4.Q(u84VarH2, ye1.Z, new fk4(mainActivity, strD, q51Var, b6), 2);
                                return obj3;
                            default:
                                return obj3;
                        }
                    }
                    if (!z13) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mainActivity = (MainActivity) this.j0;
                    intent = (Intent) this.i0;
                    w39.n0(obj);
                    objD = obj;
                    if (((Boolean) objD).booleanValue()) {
                        return obj3;
                    }
                    ss8 ss8Var2 = ss8.a;
                    strD = ss8.d(String.valueOf(intent.getData()));
                    eDeeplinkTypeB = ae1.b(strD);
                    if (eDeeplinkTypeB == null) {
                        i = -1;
                    } else {
                        i = gk4.a[eDeeplinkTypeB.ordinal()];
                    }
                    switch (i) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            u84 u84VarH3 = i21.H(mainActivity);
                            nf1 nf1Var4 = tp1.a;
                            jm4.Q(u84VarH3, ye1.Z, new fk4(mainActivity, strD, q51Var, b3), 2);
                            return obj3;
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case FileClientSessionCache.MAX_SIZE /* 12 */:
                            int i4 = MainActivity.y1;
                            u84 u84VarZ2 = ys0.z(mainActivity.X);
                            nf1 nf1Var5 = tp1.a;
                            jm4.Q(u84VarZ2, dm4.a, new y9(eDeeplinkTypeB, mainActivity, q51Var, b2), 2);
                            return obj3;
                        case 13:
                            u84 u84VarH4 = i21.H(mainActivity);
                            nf1 nf1Var6 = tp1.a;
                            jm4.Q(u84VarH4, ye1.Z, new fk4(mainActivity, strD, q51Var, b6), 2);
                            return obj3;
                        default:
                            return obj3;
                    }
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    return obj3;
                }
            case 13:
                boolean z14 = this.h0;
                try {
                    if (!z14) {
                        w39.n0(obj);
                        MainActivity mainActivity2 = (MainActivity) this.i0;
                        String str = (String) this.j0;
                        SubscriptionItem subscriptionItem = (SubscriptionItem) obj4;
                        sn snVar2 = (sn) obj5;
                        HappApplication happApplication = HappApplication.M0;
                        k32.i().d().h(new uq0(subscriptionItem, b4));
                        zz2 zz2Var = new zz2(mainActivity2, snVar2, (byte) 9);
                        this.h0 = true;
                        if (MainActivity.P(mainActivity2, str, subscriptionItem, true, false, true, null, false, false, null, zz2Var, this, 480) == c71Var) {
                            obj3 = c71Var;
                        }
                    } else {
                        if (!z14) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w39.n0(obj);
                    }
                    return obj3;
                } catch (Throwable th2) {
                    if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                        throw th2;
                    }
                    return obj3;
                }
            case 14:
                boolean z15 = this.h0;
                try {
                    if (!z15) {
                        w39.n0(obj);
                        MainActivity mainActivity3 = (MainActivity) this.i0;
                        String str2 = (String) this.j0;
                        SubscriptionItem subscriptionItem2 = (SubscriptionItem) obj4;
                        gn2 gn2Var5 = (gn2) obj5;
                        HappApplication happApplication2 = HappApplication.M0;
                        k32.i().d().h(new uq0(subscriptionItem2, (byte) 12));
                        f63 f63Var = new f63((Object) mainActivity3, (Object) str2, (Object) gn2Var5, (byte) 10);
                        this.h0 = true;
                        if (MainActivity.P(mainActivity3, str2, subscriptionItem2, true, false, false, null, false, false, null, f63Var, this, 496) == c71Var) {
                            obj3 = c71Var;
                        }
                    } else {
                        if (!z15) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w39.n0(obj);
                    }
                    return obj3;
                } catch (Throwable th3) {
                    if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                        throw th3;
                    }
                    return obj3;
                }
            case 15:
                EPingType ePingType = (EPingType) obj5;
                MainViewModel mainViewModel = (MainViewModel) this.i0;
                boolean z16 = this.h0;
                if (!z16) {
                    w39.n0(obj);
                    this.h0 = true;
                    if (mainViewModel.I(this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z16) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                ArrayList arrayList = (ArrayList) this.j0;
                String str3 = (String) obj4;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj7 : arrayList) {
                    if (str3 == null ? false : dh3.f(((ConfigGroupCache) obj7).getSubId(), str3)) {
                        arrayList2.add(obj7);
                    } else {
                        arrayList3.add(obj7);
                    }
                }
                MainViewModel.O(mainViewModel, ePingType, arrayList2);
                MainViewModel.O(mainViewModel, ePingType, arrayList3);
                return obj3;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                boolean z17 = this.h0;
                if (z17) {
                    if (z17) {
                        w39.n0(obj);
                        return obj3;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                b71 b71Var2 = (b71) this.i0;
                nf1 nf1Var7 = tp1.a;
                hv2 hv2Var = dm4.a.h0;
                qi qiVar = new qi(this.j0, obj4, (Object) b71Var2, obj5, (q51) null, (byte) 1);
                this.h0 = true;
                return w51.W(hv2Var, qiVar, this) == c71Var ? c71Var : obj3;
            case 17:
                y45 y45Var2 = (y45) obj4;
                d27 d27Var = (d27) obj5;
                oh7 oh7Var = d27Var.b;
                boolean z18 = this.h0;
                w17 w17Var = w17.Z;
                try {
                    if (!z18) {
                        w39.n0(obj);
                        do {
                            value2 = oh7Var.getValue();
                        } while (!oh7Var.k(value2, w17.Y));
                        nf1 nf1Var8 = tp1.a;
                        ye1 ye1Var = ye1.Z;
                        t17 t17Var = new t17(y45Var2, d27Var, q51Var, (byte) 3);
                        this.i0 = d27Var;
                        this.j0 = y45Var2;
                        this.h0 = true;
                        objW = w51.W(ye1Var, t17Var, this);
                        if (objW == c71Var) {
                            return c71Var;
                        }
                        y45Var = y45Var2;
                    } else {
                        if (!z18) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y45 y45Var3 = (y45) this.j0;
                        d27Var = (d27) this.i0;
                        w39.n0(obj);
                        y45Var = y45Var3;
                        objW = obj;
                    }
                    Iterator it = ((List) objW).iterator();
                    while (it.hasNext()) {
                        y45Var.q((String) it.next());
                    }
                    oh7 oh7Var2 = d27Var.b;
                    do {
                        value3 = oh7Var2.getValue();
                        break;
                    } while (!oh7Var2.k(value3, w17Var));
                    rj6Var = obj3;
                } catch (Throwable th4) {
                    if ((th4 instanceof InterruptedException) || (th4 instanceof CancellationException)) {
                        throw th4;
                    }
                    rj6Var = new rj6(th4);
                }
                if (sj6.a(rj6Var) != null) {
                    do {
                        value = oh7Var.getValue();
                    } while (!oh7Var.k(value, w17Var));
                }
                ((wu7) y45Var2.X).Y();
                return obj3;
            case 18:
                mq5 mq5Var = (mq5) this.j0;
                boolean z19 = this.h0;
                if (!z19) {
                    w39.n0(obj);
                    l18 l18Var = new l18((b71) this.i0, new dt5(mq5Var), (sn2) obj4, (gn2) obj5, null);
                    this.h0 = true;
                    return mb6.i(mq5Var, l18Var, this) == c71Var ? c71Var : obj3;
                }
                if (z19) {
                    w39.n0(obj);
                    return obj3;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                boolean z20 = this.h0;
                if (z20) {
                    if (z20) {
                        w39.n0(obj);
                        return obj3;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                y48 y48Var = (y48) this.i0;
                xz4 xz4Var = y48Var.z0;
                r68 r68Var = (r68) this.j0;
                mq5 mq5Var2 = (mq5) obj4;
                s48 s48Var = new s48(y48Var, b4);
                this.h0 = true;
                r68Var.getClass();
                gs1 gs1Var = new gs1(xz4Var, r68Var, q51Var, b6);
                v28 v28Var = new v28((a23) obj5, r68Var, s48Var, b5);
                iv1 iv1Var2 = q18.a;
                Object objN = gv3.n(new cf2(mq5Var2, gs1Var, v28Var, new dt5(mq5Var2), null, (byte) 5), this);
                if (objN != c71Var) {
                    objN = obj3;
                }
                if (objN != c71Var) {
                    objN = obj3;
                }
                if (objN != c71Var) {
                    objN = obj3;
                }
                if (objN != c71Var) {
                    objN = obj3;
                }
                return objN == c71Var ? c71Var : obj3;
            default:
                p29 p29Var = (p29) obj5;
                d94 d94Var = (d94) obj4;
                p86 p86Var = (p86) this.j0;
                boolean z21 = this.h0;
                try {
                    if (!z21) {
                        w39.n0(obj);
                        fy4 fy4Var = (fy4) ((ea6) this.i0).X;
                        if (fy4Var != null) {
                            fy4Var.Y = gv3.c(p86Var.x);
                        }
                        this.h0 = true;
                        o86 o86Var = new o86(p86Var, null);
                        s61Var.getClass();
                        Object objW2 = w51.W(p86Var.a, new cf2(p86Var, o86Var, z68.H(s61Var), null, (byte) 3), this);
                        if (objW2 != c71Var) {
                            objW2 = obj3;
                        }
                        if (objW2 != c71Var) {
                            objW2 = obj3;
                        }
                        if (objW2 == c71Var) {
                            return c71Var;
                        }
                    } else {
                        if (!z21) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w39.n0(obj);
                    }
                    d94Var.getH0().f(p29Var);
                    return obj3;
                } catch (Throwable th5) {
                    d94Var.getH0().f(p29Var);
                    throw th5;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pi(Object obj, Object obj2, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.k0 = obj;
        this.l0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pi(Object obj, Object obj2, Object obj3, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = obj;
        this.k0 = obj2;
        this.l0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pi(Object obj, Object obj2, Object obj3, Object obj4, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = obj;
        this.j0 = obj2;
        this.k0 = obj3;
        this.l0 = obj4;
    }
}
