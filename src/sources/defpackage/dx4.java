package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.AppInfo;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.proxy.PerAppProxyActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dx4 implements gn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ dx4(byte b) {
        this.X = b;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00aa  */
    @Override // defpackage.gn2
    public final Object B(Object obj) {
        String strValueOf;
        String str;
        byte b = this.X;
        ec7 ec7Var = ec7.Y;
        int i = 0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                nw3[] nw3VarArr = d17.a;
                ((f17) obj).a(c17.y, dn8Var);
                return dn8Var;
            case 1:
                tg5 tg5Var = (tg5) obj;
                return pc6.k(tg5Var.b, "[", tg5Var.c, ", ", ")");
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "[");
                    int length = bArr.length;
                    int i2 = 0;
                    while (i < length) {
                        byte b2 = bArr[i];
                        i2++;
                        if (i2 > 1) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) String.valueOf((int) b2));
                        i++;
                    }
                    sb.append((CharSequence) "]");
                    strValueOf = sb.toString();
                } else {
                    strValueOf = String.valueOf(entry.getValue());
                }
                return p61.n(new StringBuilder("  "), ((js5) entry.getKey()).a, " = ", strValueOf);
            case 3:
                tb2 tb2Var = ((s45) obj).a;
                if (tb2Var != null) {
                    tb2Var.invoke();
                }
                return dn8Var;
            case 4:
                i55 i55Var = (i55) obj;
                LayoutNode layoutNode = i55Var.w0;
                try {
                    if (i55Var.t()) {
                        i55Var.u1(true);
                        break;
                    }
                    return dn8Var;
                } catch (Throwable th) {
                    layoutNode.b0(th);
                    throw null;
                }
            case 5:
                lf5 lf5Var = ((i55) obj).V0;
                if (lf5Var != null) {
                    ((au2) lf5Var).c();
                }
                return dn8Var;
            case 6:
                ((Long) obj).getClass();
                return dn8Var;
            case 7:
                x85 x85Var = (x85) obj;
                if (x85Var.t()) {
                    x85Var.X.q0();
                }
                return dn8Var;
            case 8:
                return dn8Var;
            case 9:
                kl5 kl5Var = (kl5) obj;
                int i3 = bf.a;
                ox1 ox1Var = pc.b;
                kl5Var.getClass();
                Context context = (Context) x97.S(kl5Var, ox1Var);
                fi1 fi1Var = (fi1) x97.S(kl5Var, y01.h);
                if5 if5Var = (if5) x97.S(kl5Var, jf5.a);
                if (if5Var == null) {
                    return null;
                }
                return new ud(context, fi1Var, if5Var.a, if5Var.b);
            case 10:
                LayoutNode layoutNode2 = (LayoutNode) obj;
                if (layoutNode2.K()) {
                    LayoutNode.W(layoutNode2, false, 7);
                }
                return dn8Var;
            case 11:
                LayoutNode layoutNode3 = (LayoutNode) obj;
                if (layoutNode3.K()) {
                    LayoutNode.Y(layoutNode3, false, 7);
                }
                return dn8Var;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                LayoutNode layoutNode4 = (LayoutNode) obj;
                if (layoutNode4.K()) {
                    layoutNode4.I();
                }
                return dn8Var;
            case 13:
                LayoutNode layoutNode5 = (LayoutNode) obj;
                if (layoutNode5.K()) {
                    layoutNode5.X(false);
                }
                return dn8Var;
            case 14:
                LayoutNode layoutNode6 = (LayoutNode) obj;
                if (layoutNode6.K()) {
                    layoutNode6.X(false);
                }
                return dn8Var;
            case 15:
                LayoutNode layoutNode7 = (LayoutNode) obj;
                if (layoutNode7.K()) {
                    layoutNode7.V(false);
                }
                return dn8Var;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                LayoutNode layoutNode8 = (LayoutNode) obj;
                if (layoutNode8.K()) {
                    layoutNode8.V(false);
                }
                return dn8Var;
            case 17:
                obj.getClass();
                return Boolean.valueOf(!((nf5) obj).t());
            case 18:
                fi5 fi5Var = (fi5) obj;
                fi5Var.getClass();
                StringBuilder sb2 = new StringBuilder("position ");
                sb2.append(fi5Var.a);
                sb2.append(": '");
                return oi0.o(sb2, (String) fi5Var.b.invoke(), '\'');
            case 19:
                View view = (View) obj;
                int i4 = PerAppProxyActivity.V0;
                view.getClass();
                if (view instanceof ImageView) {
                    return (ImageView) view;
                }
                return null;
            case 20:
                String str2 = (String) obj;
                int i5 = PerAppProxyActivity.V0;
                str2.getClass();
                String lowerCase = fm7.R0(str2).toString().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return lowerCase;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                lk5 lk5Var = (lk5) obj;
                lk5Var.getClass();
                km5 km5Var = km5.f0;
                j2 j2Var = lk5Var.c;
                qm5 qm5VarC = ec7Var.c();
                ListIterator listIterator = j2Var.listIterator(0);
                while (listIterator.hasNext()) {
                    qm5VarC.add(AppInfo.a((AppInfo) listIterator.next(), 0));
                }
                return lk5.a(lk5Var, null, null, qm5VarC.c(), km5Var, null, false, 51);
            case 22:
                lk5 lk5Var2 = (lk5) obj;
                lk5Var2.getClass();
                km5 km5Var2 = km5.f0;
                j2 j2Var2 = lk5Var2.c;
                qm5 qm5VarC2 = ec7Var.c();
                ListIterator listIterator2 = j2Var2.listIterator(0);
                while (listIterator2.hasNext()) {
                    qm5VarC2.add(AppInfo.a((AppInfo) listIterator2.next(), 0));
                }
                return lk5.a(lk5Var2, null, null, qm5VarC2.c(), km5Var2, null, false, 51);
            case 23:
                AppInfo appInfo = (AppInfo) obj;
                return Boolean.valueOf(mm7.Z(appInfo.getPackageName(), false, "com.google") && !dh3.f(appInfo.getPackageName(), "com.google.android.webview"));
            case 24:
                return dn8Var;
            case 25:
                ir5 ir5Var = (ir5) obj;
                if (ir5Var.isAttachedToWindow()) {
                    ir5Var.q();
                }
                return dn8Var;
            case 26:
                ((Context) obj).getClass();
                return d02.X;
            case 27:
                return xu5.b;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                Context context2 = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context2.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                while (i < size) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context2.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context2.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                    i++;
                }
                return arrayList;
            default:
                zx3 zx3Var = (zx3) obj;
                zx3Var.a = (short) 6000;
                Float fValueOf = Float.valueOf(90.0f);
                zx3Var.a(fValueOf, 300).b = oy4.b;
                zx3Var.a(fValueOf, 1500);
                Float fValueOf2 = Float.valueOf(180.0f);
                zx3Var.a(fValueOf2, 1800);
                zx3Var.a(fValueOf2, 3000);
                Float fValueOf3 = Float.valueOf(270.0f);
                zx3Var.a(fValueOf3, 3300);
                zx3Var.a(fValueOf3, 4500);
                Float fValueOf4 = Float.valueOf(360.0f);
                zx3Var.a(fValueOf4, 4800);
                zx3Var.a(fValueOf4, 6000);
                return dn8Var;
        }
    }
}
