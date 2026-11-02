package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.node.LayoutNode;
import com.tencent.mmkv.MMKV;
import java.util.LinkedHashSet;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.AppInfo;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.ping.PingSettingsActivity;
import su.happ.proxyutility.feature.settings.OtherSettingsFragment;
import su.happ.proxyutility.ui.foundation.component.HappInputField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vj2 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ vj2(q15 q15Var, p15 p15Var) {
        this.X = (byte) 19;
        this.Y = q15Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gn2
    public final Object B(Object obj) {
        e74 e74Var;
        byte b = this.X;
        float f = 0.0f;
        byte b2 = 8;
        int i = 0;
        e74 e74Var2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                oi5 oi5Var = (oi5) obj;
                oi5Var.getClass();
                return ((wj2) obj2).onPathResult(oi5Var, "listRecursively");
            case 1:
                x90 x90Var = (x90) obj2;
                if (fs2.b.compareAndSet(false, true)) {
                    x90Var.b(dn8Var);
                }
                return dn8Var;
            case 2:
                sv1 sv1Var = (sv1) obj;
                sm0 sm0VarK = sv1Var.n0().k();
                rn2 rn2Var = ((au2) obj2).f0;
                if (rn2Var != null) {
                    rn2Var.K(sm0VarK, (xt2) sv1Var.n0().Z);
                }
                return dn8Var;
            case 3:
                ou2 ou2Var = (ou2) obj2;
                dt8 dt8Var = (dt8) obj;
                ou2Var.g(dt8Var);
                gn2 gn2Var = ou2Var.i;
                if (gn2Var != null) {
                    gn2Var.B(dt8Var);
                }
                return dn8Var;
            case 4:
                String str = (String) obj;
                int i2 = HappInputField.k0;
                str.getClass();
                ((HappInputField) obj2).i0.setVisibility(str.length() > 0 ? (byte) 0 : (byte) 8);
                return dn8Var;
            case 5:
                ((sv1) obj).getClass();
                ((p34) obj2).a();
                return dn8Var;
            case 6:
                aa6 aa6Var = (aa6) obj2;
                if (!((c13) obj).s0) {
                    return xe8.X;
                }
                aa6Var.X = false;
                return xe8.Z;
            case 7:
                wb3 wb3Var = (wb3) obj2;
                jc0 jc0Var = (jc0) obj;
                float density = jc0Var.getDensity() * ((kt1) wb3Var.C0.d()).X;
                lf lfVarA = nf.a();
                x67 x67VarA = wb3Var.B0;
                if (x67VarA == null) {
                    x67VarA = q77.a((p77) hi5.W(wb3Var, q77.a), i21.k);
                }
                mb6 mb6VarA = x67VarA.a(jc0Var.X.e(), jc0Var.X.getLayoutDirection(), jc0Var);
                if (mb6VarA instanceof ae5) {
                    lf.b(lfVarA, ((ae5) mb6VarA).j0);
                } else if (mb6VarA instanceof be5) {
                    lf.c(lfVarA, ((be5) mb6VarA).j0);
                } else {
                    if (!(mb6VarA instanceof zd5)) {
                        b61.c();
                        return null;
                    }
                    lf.a(lfVarA, ((zd5) mb6VarA).j0);
                }
                lf lfVarA2 = nf.a();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jc0Var.X.e() & 4294967295L)) - density;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jc0Var.X.e() >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jc0Var.X.e() & 4294967295L));
                if (Float.isNaN(0.0f) || Float.isNaN(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat2) || Float.isNaN(fIntBitsToFloat3)) {
                    nf.b("Invalid rectangle, make sure no value is NaN");
                }
                RectF rectF = lfVarA2.b;
                if (rectF == null) {
                    rectF = new RectF();
                    lfVarA2.b = rectF;
                }
                rectF.set(0.0f, fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3);
                Path path = lfVarA2.a;
                RectF rectF2 = lfVarA2.b;
                rectF2.getClass();
                path.addRect(rectF2, Path.Direction.CCW);
                lf lfVarA3 = nf.a();
                lfVarA3.f(lfVarA2, lfVarA, 1);
                return jc0Var.a(new zw2(lfVarA3, wb3Var, (byte) 7));
            case 8:
                wd3 wd3Var = (wd3) obj2;
                i75 i75Var = (i75) obj;
                di7 di7Var = i75Var.b;
                if (di7Var != null) {
                    di7Var.closeConnection();
                    i75Var.b = null;
                }
                c15 c15Var = wd3Var.d;
                Object[] objArr4 = c15Var.X;
                int i3 = c15Var.Z;
                while (true) {
                    if (i >= i3) {
                        i = -1;
                    } else if (!dh3.f((b09) objArr4[i], i75Var)) {
                        i++;
                    }
                }
                if (i >= 0) {
                    c15Var.k(i);
                }
                if (c15Var.Z == 0) {
                    wd3Var.b.invoke();
                }
                return dn8Var;
            case 9:
                Context context = (Context) obj;
                context.getClass();
                String str2 = ((ak3) obj2).a;
                LinkedHashSet linkedHashSet = c87.a;
                linkedHashSet.getClass();
                byte b3 = 3;
                return i21.K(new b87(context, str2, d87.a, new ar6(linkedHashSet, objArr2 == true ? 1 : 0, b3), new dl4(b3, objArr == true ? 1 : 0, (byte) 2)));
            case 10:
                return new jd((e64) obj2, (byte) 6);
            case 11:
                return new jd((k64) obj2, b2);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                ((Integer) obj).getClass();
                return obj2;
            case 13:
                j74 j74Var = (j74) obj2;
                float f2 = -((Float) obj).floatValue();
                if ((f2 >= 0.0f || j74Var.m()) && (f2 <= 0.0f || j74Var.j())) {
                    if (Math.abs(j74Var.j0) > 0.5f) {
                        zc3.c("entered drag with non-zero pending scroll");
                    }
                    j74Var.f0 = true;
                    float f3 = j74Var.j0 + f2;
                    j74Var.j0 = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = j74Var.j0;
                        int iRound = Math.round(f4);
                        e74 e74VarH = ((e74) j74Var.h0.getValue()).h(iRound, !j74Var.Y);
                        if (e74VarH == null || (e74Var = j74Var.Z) == null) {
                            e74Var2 = e74VarH;
                        } else {
                            e74 e74VarH2 = e74Var.h(iRound, true);
                            if (e74VarH2 != null) {
                                j74Var.Z = e74VarH2;
                                e74Var2 = e74VarH;
                            }
                        }
                        if (e74Var2 != null) {
                            j74Var.a(e74Var2, j74Var.Y, true);
                            j74Var.y0.setValue(dn8Var);
                            j74Var.e(f4 - j74Var.j0, e74Var2);
                        } else {
                            LayoutNode layoutNode = j74Var.m0;
                            if (layoutNode != null) {
                                layoutNode.k();
                            }
                            j74Var.e(f4 - j74Var.j0, j74Var.d());
                        }
                    }
                    if (Math.abs(j74Var.j0) > 0.5f) {
                        f2 -= j74Var.j0;
                        j74Var.j0 = 0.0f;
                    }
                    f = f2;
                }
                return Float.valueOf(-f);
            case 14:
                kv6 kv6Var = (kv6) obj2;
                return Boolean.valueOf(kv6Var != null ? kv6Var.c(obj) : true);
            case 15:
                return ((zl0) obj2).m;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                y64 y64Var = (y64) obj;
                y64Var.getClass();
                j2 j2Var = ((lg4) obj2).e;
                y64Var.a.a(j2Var.a(), new f63(objArr3 == true ? 1 : 0, new f0(j2Var, (byte) 23), new zy0(802480018, true, new yh4(j2Var)), b2));
                return dn8Var;
            case 17:
                return ((eq4) obj2).b(((Integer) obj).intValue());
            case 18:
                ow4 ow4Var = (ow4) obj2;
                ow4Var.show();
                return new jd(ow4Var, (byte) 9);
            case 19:
                ((q15) obj2).m(null);
                return dn8Var;
            case 20:
                ((j05) obj2).a((ix4) obj);
                return Boolean.TRUE;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                for (kd5 kd5Var : ((ld5) obj2).c) {
                    kd5Var.a.b(obj, kd5Var.b);
                }
                return dn8Var;
            case 22:
                ((MMKV) ((OtherSettingsFragment) obj2).d1.getValue()).p("pref_beta_version", ((Boolean) obj).booleanValue());
                return dn8Var;
            case 23:
                int iIntValue = ((Integer) obj).intValue();
                int i4 = PingSettingsActivity.U0;
                ((PingSettingsActivity) obj2).A().l(iIntValue, "pref_ping_mode");
                return dn8Var;
            case 24:
                e37 e37Var = (e37) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                return e37Var.f(iIntValue2) + ": " + e37Var.h(iIntValue2).a();
            case 25:
                ((kt) ((y5) obj2).h0).addLast(obj);
                return dn8Var;
            case 26:
                PackageManager packageManager = (PackageManager) obj2;
                qg5 qg5Var = (qg5) obj;
                PackageInfo packageInfo = (PackageInfo) qg5Var.X;
                ApplicationInfo applicationInfo = (ApplicationInfo) qg5Var.Y;
                String string = applicationInfo.loadLabel(packageManager).toString();
                Drawable drawableLoadIcon = applicationInfo.loadIcon(packageManager);
                boolean z = (applicationInfo.flags & 1) > 0;
                String str3 = packageInfo.packageName;
                str3.getClass();
                drawableLoadIcon.getClass();
                return new AppInfo(string, str3, drawableLoadIcon, z, 0);
            case 27:
                ((ux0) obj2).V(dn8Var);
                return dn8Var;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                ((qe6) obj2).b.V(dn8Var);
                return dn8Var;
            default:
                s5 s5Var = (s5) obj;
                s5Var.getClass();
                ((x90) ((s16) obj2).e.h0).b(new oe6(s5Var));
                return dn8Var;
        }
    }

    public /* synthetic */ vj2(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }
}
