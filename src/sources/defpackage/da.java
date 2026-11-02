package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class da extends uy7 implements gn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ Object i0;
    public final /* synthetic */ Object j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ da(Object obj, Object obj2, q51 q51Var, byte b) {
        super(1, q51Var);
        this.g0 = b;
        this.j0 = obj;
        this.i0 = obj2;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        q51 q51Var = (q51) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((da) m(q51Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 m(q51 q51Var) {
        byte b = this.g0;
        Object obj = this.i0;
        Object obj2 = this.j0;
        switch (b) {
            case 0:
                return new da((t5) obj2, (sn2) obj, q51Var, (byte) 0);
            case 1:
                return new da((la) obj2, (sn2) obj, q51Var, (byte) 1);
            case 2:
                return new da((ch) obj2, (h38) obj, q51Var, (byte) 2);
            case 3:
                return new da((i30) obj2, (h30) obj, q51Var, (byte) 3);
            case 4:
                return new da((MainViewModel) obj2, (String) obj, q51Var, (byte) 4);
            default:
                return new da((wq8) obj2, (List) obj, q51Var, (byte) 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [xd7] */
    /* JADX WARN: Type inference failed for: r1v20, types: [android.os.Handler] */
    @Override // defpackage.r10
    public final Object q(Object obj) {
        ah ahVar;
        Object value;
        xm4 xm4Var;
        byte b = this.g0;
        byte b2 = 2;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        Object obj2 = this.i0;
        Object obj3 = this.j0;
        byte b3 = 1;
        fg0 fg0Var = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        switch (b) {
            case 0:
                boolean z5 = this.h0;
                if (z5) {
                    if (z5) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                t5 t5Var = (t5) obj3;
                aa aaVar = new aa(t5Var, b2);
                r0 r0Var = new r0((sn2) obj2, t5Var, z ? 1 : 0, b3);
                this.h0 = true;
                return ys0.T(aaVar, r0Var, this) == c71Var ? c71Var : dn8Var;
            case 1:
                la laVar = (la) obj3;
                boolean z6 = this.h0;
                if (!z6) {
                    w39.n0(obj);
                    ba baVar = new ba(laVar, b3);
                    r0 r0Var2 = new r0((sn2) obj2, laVar, z2 ? 1 : 0, b2);
                    this.h0 = true;
                    if (t9.b(baVar, r0Var2, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z6) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                ke1 ke1VarB = laVar.b();
                nh5 nh5Var = laVar.f;
                Object objA = ke1VarB.a(nh5Var.l());
                if (objA == null) {
                    return dn8Var;
                }
                if (Math.abs(nh5Var.l() - laVar.b().c(objA)) >= 0.5f) {
                    return dn8Var;
                }
                laVar.d.setValue(objA);
                laVar.c.setValue(objA);
                return dn8Var;
            case 2:
                ch chVar = (ch) obj3;
                xd7 handler = chVar.e;
                View view = chVar.a;
                boolean z7 = this.h0;
                byte b4 = 4;
                try {
                    if (!z7) {
                        w39.n0(obj);
                        bh bhVar = new bh();
                        h38 h38Var = (h38) obj2;
                        ah ahVar2 = new ah(bhVar, new yg(chVar, h38Var, (byte) 0), new yg(chVar, h38Var, (byte) 1), view);
                        gn2 gn2Var = chVar.b;
                        if (gn2Var != null && (ahVar = (ah) gn2Var.B(ahVar2)) != null) {
                            ahVar2 = ahVar;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler2 = view.getHandler();
                        if (looperMyLooper != (handler2 != null ? handler2.getLooper() : null)) {
                            j0 j0Var = chVar.i;
                            if (j0Var == null) {
                                j0Var = new j0(chVar, ahVar2, bhVar, b3);
                                chVar.i = j0Var;
                            }
                            view.post(j0Var);
                        } else {
                            ActionMode actionModeStartActionMode = view.startActionMode(new ve2(ahVar2), 1);
                            if (actionModeStartActionMode == null) {
                                return dn8Var;
                            }
                            chVar.h = actionModeStartActionMode;
                        }
                        this.h0 = true;
                        Object objR = bhVar.a.r(this);
                        if (objR != c71Var) {
                            objR = dn8Var;
                        }
                        if (objR == c71Var) {
                            return c71Var;
                        }
                    } else {
                        if (!z7) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w39.n0(obj);
                    }
                    handler.a();
                    Looper looperMyLooper2 = Looper.myLooper();
                    handler = view.getHandler();
                    if (looperMyLooper2 != (handler != 0 ? handler.getLooper() : null)) {
                        Runnable c1Var = chVar.j;
                        if (c1Var == null) {
                            c1Var = new c1(chVar, b4);
                            chVar.j = c1Var;
                        }
                        view.post(c1Var);
                    } else {
                        ActionMode actionMode = chVar.h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    j0 j0Var2 = chVar.i;
                    if (j0Var2 != null) {
                        view.removeCallbacks(j0Var2);
                    }
                    chVar.h = null;
                    return dn8Var;
                } catch (Throwable th) {
                    handler.a();
                    Looper looperMyLooper3 = Looper.myLooper();
                    Handler handler3 = view.getHandler();
                    if (looperMyLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                        Runnable c1Var2 = chVar.j;
                        if (c1Var2 == null) {
                            c1Var2 = new c1(chVar, b4);
                            chVar.j = c1Var2;
                        }
                        view.post(c1Var2);
                    } else {
                        ActionMode actionMode2 = chVar.h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    j0 j0Var3 = chVar.i;
                    if (j0Var3 != null) {
                        view.removeCallbacks(j0Var3);
                    }
                    chVar.h = null;
                    throw th;
                }
            case 3:
                h30 h30Var = (h30) obj2;
                rh5 rh5Var = ((i30) obj3).c;
                boolean z8 = this.h0;
                try {
                    if (!z8) {
                        w39.n0(obj);
                        rh5Var.setValue(h30Var);
                        this.h0 = true;
                        Object objR2 = h30Var.b.r(this);
                        if (objR2 != c71Var) {
                            objR2 = dn8Var;
                        }
                        if (objR2 == c71Var) {
                            return c71Var;
                        }
                    } else {
                        if (!z8) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w39.n0(obj);
                    }
                    rh5Var.setValue(null);
                    return dn8Var;
                } catch (Throwable th2) {
                    rh5Var.setValue(null);
                    throw th2;
                }
            case 4:
                MainViewModel mainViewModel = (MainViewModel) obj3;
                boolean z9 = this.h0;
                if (!z9) {
                    w39.n0(obj);
                    MainViewModel.y(mainViewModel, (String) obj2, null, false, 6);
                    this.h0 = true;
                    if (mainViewModel.I(this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z9) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                mainViewModel.getClass();
                oh7 oh7Var = mainViewModel.w;
                do {
                    value = oh7Var.getValue();
                    xm4Var = (xm4) value;
                } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, false, xm4Var.f + 1, 0, null, null, false, null, false, null, false, false, null, 65503)));
                return dn8Var;
            default:
                wq8 wq8Var = (wq8) obj3;
                LinkedHashMap linkedHashMap = wq8Var.k;
                List list = (List) obj2;
                boolean z10 = this.h0;
                if (z10) {
                    if (z10) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                boolean zI0 = hi5.i0("CXCP");
                pq8 pq8Var = pq8.Y;
                if (zI0) {
                    Objects.toString(pq8Var);
                    Objects.toString(list);
                }
                Object obj4 = linkedHashMap.get(pq8Var);
                Object obj5 = obj4;
                if (obj4 == null) {
                    sq8 sq8Var = new sq8(fg0Var, (LinkedHashMap) (z4 ? 1 : 0), (we6) (z3 ? 1 : 0), 15);
                    linkedHashMap.put(pq8Var, sq8Var);
                    obj5 = sq8Var;
                }
                sq8 sq8Var2 = (sq8) obj5;
                fg0 fg0Var2 = new fg0((byte) 0);
                fg0Var2.c(sq8Var2.a.Y);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    fg0Var2.Y.w(w45.B((CaptureRequest.Key) it.next()));
                }
                linkedHashMap.put(pq8Var, new sq8(fg0Var2, zp4.S(sq8Var2.b), wv0.b1(sq8Var2.c), sq8Var2.d));
                sq8 sq8VarJ = wq8.j(wq8Var.k);
                this.h0 = true;
                Object objM = wq8Var.m(sq8VarJ, null, this);
                return objM == c71Var ? c71Var : objM;
        }
    }
}
