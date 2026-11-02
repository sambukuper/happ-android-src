package defpackage;

import android.app.Activity;
import android.hardware.camera2.CameraManager;
import android.view.KeyEvent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.work.impl.WorkDatabase;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p5 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ p5(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0162  */
    /* JADX WARN: Code duplicated, block: B:80:0x017f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.dn2
    public final Object invoke() {
        y07 y07Var;
        LayoutNode layoutNode;
        s86 s86Var;
        List listH0;
        xb7 xb7VarC;
        i85 i85Var = null;
        boolean z = false;
        z = false;
        switch (this.X) {
            case 0:
                ((vj2) this.Y).B((s5) this.Z);
                return dn8.a;
            case 1:
                return Boolean.valueOf(AndroidComposeView.f((AndroidComposeView) this.Y, (KeyEvent) this.Z));
            case 2:
                wx6 wx6Var = (wx6) this.Y;
                gc gcVar = (gc) this.Z;
                jx6 jx6Var = wx6Var.g0;
                jx6 jx6Var2 = wx6Var.h0;
                Float f = wx6Var.Z;
                Float f2 = wx6Var.f0;
                float fFloatValue = (jx6Var == null || f == null) ? 0.0f : ((Number) jx6Var.a.invoke()).floatValue() - f.floatValue();
                float fFloatValue2 = (jx6Var2 == null || f2 == null) ? 0.0f : ((Number) jx6Var2.a.invoke()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iA = gcVar.A(wx6Var.X);
                    a17 a17Var = (a17) gcVar.s().b(gcVar.m0);
                    if (a17Var != null) {
                        try {
                            h4 h4Var = gcVar.o0;
                            if (h4Var != null) {
                                h4Var.l(gcVar.k(a17Var));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    a17 a17Var2 = (a17) gcVar.s().b(gcVar.n0);
                    if (a17Var2 != null) {
                        try {
                            h4 h4Var2 = gcVar.p0;
                            if (h4Var2 != null) {
                                h4Var2.l(gcVar.k(a17Var2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    gcVar.f0.invalidate();
                    a17 a17Var3 = (a17) gcVar.s().b(iA);
                    if (a17Var3 != null && (y07Var = a17Var3.a) != null && (layoutNode = y07Var.c) != null) {
                        if (jx6Var != null) {
                            gcVar.r0.h(iA, jx6Var);
                        }
                        if (jx6Var2 != null) {
                            gcVar.s0.h(iA, jx6Var2);
                        }
                        gcVar.w(layoutNode);
                    }
                }
                if (jx6Var != null) {
                    wx6Var.Z = (Float) jx6Var.a.invoke();
                }
                if (jx6Var2 != null) {
                    wx6Var.f0 = (Float) jx6Var2.a.invoke();
                }
                return dn8.a;
            case 3:
                ((ea6) this.Y).X = ((dn2) this.Z).invoke();
                return dn8.a;
            case 4:
                ((jp0) this.Y).b(this.Z);
                return dn8.a;
            case 5:
                return sj.b((sj) this.Y, (aa6) this.Z);
            case 6:
                ((fz0) this.Y).c = (dn2) this.Z;
                return dn8.a;
            case 7:
                y00 y00Var = (y00) this.Y;
                p34 p34Var = (p34) this.Z;
                y00Var.y0 = y00Var.t0.a(p34Var.X.e(), p34Var.getLayoutDirection(), p34Var);
                return dn8.a;
            case 8:
                q10 q10Var = (q10) this.Y;
                p10 p10Var = (p10) this.Z;
                e31 e31Var = q10Var.a;
                synchronized (e31Var.c) {
                    if (e31Var.d.remove(p10Var) && e31Var.d.isEmpty()) {
                        e31Var.d();
                    }
                    break;
                }
                return dn8.a;
            case 9:
                t09 t09Var = (t09) this.Y;
                if (((Boolean) ((lh7) this.Z).getValue()).booleanValue() && ((Boolean) ((y74) t09Var).c.getValue()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                b88 b88Var = (b88) this.Y;
                ql qlVar = (ql) this.Z;
                if (b88Var == null) {
                    return qlVar;
                }
                vd7 vd7Var = b88Var.c;
                boolean zIsEmpty = vd7Var.isEmpty();
                ql qlVar2 = b88Var.b;
                if (!zIsEmpty) {
                    w28 w28Var = new w28(qlVar2);
                    int size = vd7Var.size();
                    for (int i = 0; i < size; i++) {
                        ((gn2) vd7Var.get(i)).B(w28Var);
                    }
                    qlVar2 = w28Var.b;
                }
                b88Var.b = qlVar2;
                return qlVar2 == null ? qlVar : qlVar2;
            case 11:
                dn2 dn2Var = (dn2) this.Y;
                i55 i55Var = (i55) this.Z;
                if (dn2Var != null && (s86Var = (s86) dn2Var.invoke()) != null) {
                    return s86Var;
                }
                if (!i55Var.V0().p0) {
                    i55Var = null;
                }
                if (i55Var != null) {
                    return u70.n(0L, u15.R(i55Var.Z));
                }
                return null;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                ((ic0) this.Y).s0.B((jc0) this.Z);
                return dn8.a;
            case 13:
                ((CameraManager) this.Y).unregisterAvailabilityCallback((se0) this.Z);
                return dn8.a;
            case 14:
                ((nf0) this.Y).Z.unregisterAvailabilityCallback((mf0) this.Z);
                return dn8.a;
            case 15:
                ((CameraManager) this.Y).unregisterAvailabilityCallback((mf0) this.Z);
                return dn8.a;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                x39 x39Var = (x39) this.Y;
                UUID uuid = (UUID) this.Z;
                WorkDatabase workDatabase = x39Var.k0;
                workDatabase.getClass();
                workDatabase.o(new sc(x39Var, uuid, (byte) 10));
                ax6.b(x39Var.j0, x39Var.k0, x39Var.m0);
                return dn8.a;
            case 17:
                return i21.K(new qg5((v82) this.Y, (zu3) this.Z));
            case 18:
                p01 p01Var = (p01) this.Y;
                Object obj = this.Z;
                lp2 lp2Var = p01Var.X;
                yb7 yb7Var = lp2Var.c;
                xb7 xb7VarC2 = yb7Var.c();
                int i2 = 0;
                while (true) {
                    try {
                        if (i2 < yb7Var.Y) {
                            if (xb7VarC2.l(i2)) {
                                Object objN = xb7VarC2.n(i2);
                                if (objN != obj) {
                                    pp2 pp2Var = objN instanceof pp2 ? (pp2) objN : null;
                                    if ((pp2Var != null ? pp2Var.a : null) == obj) {
                                    }
                                }
                                i85 i85Var2 = new i85(i2, null);
                                xb7VarC2.c();
                                i85Var = i85Var2;
                                if (i85Var != null) {
                                    int i3 = i85Var.a;
                                    Integer num = i85Var.b;
                                    xb7VarC = yb7Var.c();
                                    try {
                                        ArrayList arrayListV = nr4.V(xb7VarC, i3, num);
                                        xb7VarC.c();
                                        listH0 = wv0.H0(arrayListV, lp2Var.D());
                                    } catch (Throwable th) {
                                        xb7VarC.c();
                                        throw th;
                                    }
                                } else {
                                    listH0 = d02.X;
                                }
                                return new rz0(listH0, lp2Var.C);
                            }
                            int[] iArr = xb7VarC2.b;
                            int i4 = i2 + 1;
                            int iD = (i4 < xb7VarC2.c ? iArr[(i4 * 5) + 4] : xb7VarC2.e) - ac7.d(iArr, i2);
                            int i5 = 0;
                            while (true) {
                                if (i5 >= iD) {
                                    i2 = i4;
                                } else {
                                    Object objH = xb7VarC2.h(i2, i5);
                                    if (objH != obj) {
                                        pp2 pp2Var2 = objH instanceof pp2 ? (pp2) objH : null;
                                        if ((pp2Var2 != null ? pp2Var2.a : null) != obj) {
                                            i5++;
                                        }
                                    }
                                    i85Var = new i85(i2, Integer.valueOf(i5));
                                }
                            }
                        }
                        xb7VarC2.c();
                        if (i85Var != null) {
                            int i6 = i85Var.a;
                            Integer num2 = i85Var.b;
                            xb7VarC = yb7Var.c();
                            ArrayList arrayListV2 = nr4.V(xb7VarC, i6, num2);
                            xb7VarC.c();
                            listH0 = wv0.H0(arrayListV2, lp2Var.D());
                        } else {
                            listH0 = d02.X;
                        }
                        return new rz0(listH0, lp2Var.C);
                    } catch (Throwable th2) {
                        xb7VarC2.c();
                        throw th2;
                    }
                }
            case 19:
                return new hf3(nr4.M(((h38) this.Y).j((y24) ((dn2) this.Z).invoke())));
            case 20:
                ((n38) this.Y).d.B((h30) this.Z);
                return dn8.a;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                u22 u22Var = (u22) this.Y;
                String str = (String) this.Z;
                Enum[] enumArr = u22Var.a;
                k22 k22Var = new k22(str, enumArr.length);
                for (Enum r0 : enumArr) {
                    k22Var.k(r0.name(), false);
                }
                return k22Var;
            case 22:
                return ((e72) this.Y).e(new URL((String) this.Z), null);
            case 23:
                ((ea6) this.Y).X = ((ai2) this.Z).a1();
                return dn8.a;
            case 24:
                ((ea6) this.Y).X = hi5.W((ci2) this.Z, zn5.a);
                return dn8.a;
            case 25:
                kr2 kr2Var = (kr2) this.Y;
                return new jr2((lr2) this.Z, kr2Var, kr2Var.u);
            case 26:
                dn2 dn2Var2 = (dn2) this.Y;
                Activity activity = (Activity) this.Z;
                if (dn2Var2 != null) {
                    dn2Var2.invoke();
                } else if (activity != null) {
                    activity.finish();
                }
                return dn8.a;
            case 27:
                mw2 mw2Var = (mw2) this.Y;
                ow2 ow2Var = (ow2) this.Z;
                mw2Var.c.invoke();
                ow2Var.a.setValue(Boolean.FALSE);
                return dn8.a;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                ((n03) this.Y).d((jx4) this.Z);
                return dn8.a;
            default:
                return Http2Connection.ReaderRunnable.headers$lambda$0$0((Http2Connection) this.Y, (Http2Stream) this.Z);
        }
    }
}
