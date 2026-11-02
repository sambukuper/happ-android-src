package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.slider.Slider;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.domain.routing.entity.DownloadFilesInfo;
import su.happ.proxyutility.domain.routing.entity.RouteSettingsCache;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.feature.routing.rules.RoutingRulesActivity;
import su.happ.proxyutility.ui.foundation.component.HappInfoField;
import su.happ.proxyutility.ui.foundation.component.HappInputField;
import su.happ.proxyutility.ui.foundation.component.HappSliderField;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;
import su.happ.proxyutility.ui.foundation.component.HappToggleField;
import su.happ.proxyutility.ui.widget.CustomSpinner;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class zw2 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ zw2(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Z = obj;
        this.Y = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object B(Object obj) {
        byte b = 2;
        boolean z = true;
        CharSequence charSequence = null;
        String[] stringArray = null;
        switch (this.X) {
            case 0:
                HappInfoField happInfoField = (HappInfoField) this.Z;
                Context context = (Context) this.Y;
                TypedArray typedArray = (TypedArray) obj;
                int i = HappInfoField.j0;
                typedArray.getClass();
                AppCompatTextView appCompatTextView = happInfoField.f0;
                AppCompatTextView appCompatTextView2 = happInfoField.h0;
                appCompatTextView.setText(typedArray.getString(x56.HappInfoField_title));
                appCompatTextView.setTextColor(typedArray.getColor(x56.HappInfoField_titleColor, os4.q(context, v26.settingsText)));
                AppCompatTextView appCompatTextView3 = happInfoField.g0;
                String string = typedArray.getString(x56.HappInfoField_info);
                appCompatTextView3.setText(string != null ? wl7.e0(string) : null);
                appCompatTextView3.setHint(typedArray.getString(x56.HappInfoField_hint));
                CharSequence string2 = typedArray.getString(x56.HappInfoField_description);
                appCompatTextView2.setVisibility(string2 != null ? 0 : 8);
                appCompatTextView2.setText(string2);
                happInfoField.i0 = typedArray.getBoolean(x56.HappInfoField_copyOnShortClick, false);
                return dn8.a;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                HappInputField happInputField = (HappInputField) this.Z;
                Context context2 = (Context) this.Y;
                TypedArray typedArray2 = (TypedArray) obj;
                int i2 = HappInputField.k0;
                typedArray2.getClass();
                AppCompatTextView appCompatTextView4 = happInputField.f0;
                appCompatTextView4.setText(typedArray2.getString(x56.HappInputField_title));
                appCompatTextView4.setTextColor(typedArray2.getColor(x56.HappInputField_titleColor, os4.q(context2, v26.settingsText)));
                happInputField.g0.setHint(typedArray2.getString(x56.HappInputField_hint));
                CharSequence string3 = typedArray2.getString(x56.HappInputField_description);
                AppCompatTextView appCompatTextView5 = happInputField.h0;
                appCompatTextView5.setVisibility(string3 != null ? 0 : 8);
                appCompatTextView5.setText(string3);
                happInputField.j0 = typedArray2.getBoolean(x56.HappInfoField_copyOnShortClick, false);
                return dn8.a;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                s86 s86Var = (s86) this.Z;
                lh7 lh7Var = (lh7) this.Y;
                sv1 sv1Var = (sv1) obj;
                sv1Var.getClass();
                sm0 sm0VarK = sv1Var.n0().k();
                sm0VarK.r(u70.n(0L, sv1Var.e()), u15.c());
                sv1.k0(sv1Var, dw0.b(((Number) lh7Var.getValue()).floatValue(), dw0.b), 0L, 0L, 0.0f, 126);
                if (s86Var != null) {
                    df dfVarC = u15.c();
                    dfVarC.e(0);
                    sm0VarK.j(s86Var.a, s86Var.b, s86Var.c, s86Var.d, dfVarC);
                }
                sm0VarK.p();
                return dn8.a;
            case 3:
                HappSliderField happSliderField = (HappSliderField) this.Z;
                Context context3 = (Context) this.Y;
                TypedArray typedArray3 = (TypedArray) obj;
                int i3 = HappSliderField.j0;
                typedArray3.getClass();
                CharSequence string4 = typedArray3.getString(x56.HappSliderField_description);
                AppCompatTextView appCompatTextView6 = happSliderField.i0;
                Slider slider = happSliderField.f0;
                appCompatTextView6.setVisibility(string4 != null ? 0 : 8);
                appCompatTextView6.setText(string4);
                slider.setValueFrom(typedArray3.getFloat(x56.HappSliderField_valueFrom, 0.0f));
                slider.setValueTo(typedArray3.getFloat(x56.HappSliderField_valueTo, 100.0f));
                slider.setValue(x97.m(typedArray3.getFloat(x56.HappSliderField_progress, 0.0f), slider.getValueFrom(), slider.getValueTo()));
                slider.setStepSize(typedArray3.getFloat(x56.HappSliderField_stepSize, 1.0f));
                slider.setTickActiveTintList(ColorStateList.valueOf(-1));
                slider.setTickInactiveTintList(ColorStateList.valueOf(-16777216));
                slider.setTrackInactiveTintList(ColorStateList.valueOf(os4.q(context3, v26.colorButtonGrey)));
                slider.setTrackActiveTintList(ColorStateList.valueOf(os4.q(context3, v26.colorButtonPrimary)));
                slider.setThumbTintList(ColorStateList.valueOf(os4.q(context3, v26.colorButtonPrimary)));
                CharSequence string5 = typedArray3.getString(x56.HappSliderField_valueFromLabel);
                AppCompatTextView appCompatTextView7 = happSliderField.g0;
                if (string5 == null) {
                    string5 = String.valueOf(slider.getValueFrom());
                }
                appCompatTextView7.setText(string5);
                CharSequence string6 = typedArray3.getString(x56.HappSliderField_valueToLabel);
                AppCompatTextView appCompatTextView8 = happSliderField.h0;
                if (string6 == null) {
                    string6 = String.valueOf(slider.getValueTo());
                }
                appCompatTextView8.setText(string6);
                return dn8.a;
            case 4:
                HappSpinnerField happSpinnerField = (HappSpinnerField) this.Z;
                Context context4 = (Context) this.Y;
                TypedArray typedArray4 = (TypedArray) obj;
                int i4 = HappSpinnerField.i0;
                typedArray4.getClass();
                TextView textView = happSpinnerField.f0;
                CustomSpinner customSpinner = happSpinnerField.g0;
                textView.setText(typedArray4.getString(x56.HappSpinnerField_title));
                textView.setTextColor(typedArray4.getColor(x56.HappSpinnerField_titleColor, os4.q(context4, v26.settingsText)));
                TextView textView2 = happSpinnerField.h0;
                textView2.setText(typedArray4.getString(x56.HappSpinnerField_description));
                String string7 = typedArray4.getString(x56.HappForwardField_description);
                textView2.setVisibility(string7 != null ? 0 : 8);
                textView2.setText(string7);
                int resourceId = typedArray4.getResourceId(x56.HappSpinnerField_entries, -1);
                Integer numValueOf = Integer.valueOf(resourceId);
                if (resourceId == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    Resources resources = happSpinnerField.getResources();
                    resources.getClass();
                    stringArray = resources.getStringArray(numValueOf.intValue());
                }
                if (stringArray != null) {
                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(context4);
                    layoutInflaterFrom.getClass();
                    customSpinner.setAdapter((SpinnerAdapter) new rf7(context4, layoutInflaterFrom, customSpinner, stringArray));
                }
                return dn8.a;
            case 5:
                HappToggleField happToggleField = (HappToggleField) this.Z;
                Context context5 = (Context) this.Y;
                TypedArray typedArray5 = (TypedArray) obj;
                int i5 = HappToggleField.i0;
                typedArray5.getClass();
                TextView textView3 = happToggleField.f0;
                textView3.setText(typedArray5.getString(x56.HappToggleField_title));
                textView3.setTextColor(typedArray5.getColor(x56.HappToggleField_titleColor, os4.q(context5, v26.settingsText)));
                String string8 = typedArray5.getString(x56.HappToggleField_description);
                TextView textView4 = happToggleField.h0;
                textView4.setVisibility(string8 != null ? 0 : 8);
                textView4.setText(string8);
                happToggleField.g0.setChecked(typedArray5.getBoolean(x56.HappToggleField_checked, false));
                return dn8.a;
            case 6:
                DownloadFilesInfo downloadFilesInfo = (DownloadFilesInfo) this.Z;
                zo8 zo8Var = (zo8) this.Y;
                ha3 ha3Var = (ja3) obj;
                if (downloadFilesInfo.h()) {
                    if (!(ha3Var instanceof ia3)) {
                        if (ha3Var instanceof ha3) {
                            z = ha3Var.b;
                        } else if (ha3Var instanceof ga3) {
                            z = ((ga3) ha3Var).c;
                        } else {
                            if (!(ha3Var instanceof fa3)) {
                                b61.c();
                                return null;
                            }
                            z = ((fa3) ha3Var).a;
                        }
                    }
                    return new fa3(z, false);
                }
                if (!(ha3Var instanceof ia3)) {
                    if (ha3Var instanceof ha3) {
                        z = ha3Var.b;
                    } else if (ha3Var instanceof ga3) {
                        z = ((ga3) ha3Var).c;
                    } else {
                        if (!(ha3Var instanceof fa3)) {
                            b61.c();
                            return null;
                        }
                        z = ((fa3) ha3Var).a;
                    }
                }
                return new ga3(zo8Var, downloadFilesInfo, z, false);
            case 7:
                lf lfVar = (lf) this.Z;
                wb3 wb3Var = (wb3) this.Y;
                p34 p34Var = (p34) obj;
                p34Var.a();
                oi oiVar = wb3Var.A0;
                oiVar.getClass();
                sv1.d0(p34Var, lfVar, new fe7(((dw0) oiVar.d()).a), 0.0f, (om7) null, 60);
                return dn8.a;
            case 8:
                nc3 nc3Var = (nc3) this.Z;
                lc3 lc3Var = (lc3) this.Y;
                nc3Var.a.b(lc3Var);
                nc3Var.b.setValue(Boolean.TRUE);
                return new p00(nc3Var, lc3Var, (byte) 1);
            case 9:
                o74 o74Var = (o74) this.Z;
                Object obj2 = this.Y;
                o74Var.Z.i(obj2);
                return new p00(o74Var, obj2, (byte) 2);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                return new o74((kv6) this.Z, (Map) obj, (jv6) this.Y);
            case 11:
                do5 do5Var = (do5) obj;
                ArrayList arrayListR = wl7.R((List) this.Z, (dn2) ((cb4) this.Y).b);
                if (arrayListR != null) {
                    int size = arrayListR.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        qg5 qg5Var = (qg5) arrayListR.get(i6);
                        eo5 eo5Var = (eo5) qg5Var.X;
                        dn2 dn2Var = (dn2) qg5Var.Y;
                        do5.g(do5Var, eo5Var, dn2Var != null ? ((hf3) dn2Var.invoke()).a : 0L);
                    }
                }
                return dn8.a;
            case 12:
                gn2 gn2Var = (gn2) this.Z;
                lf4 lf4Var = (lf4) this.Y;
                dv1 dv1Var = (dv1) obj;
                dv1Var.getClass();
                int iOrdinal = dv1Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        b61.c();
                        return null;
                    }
                    String str = lf4Var.b;
                    str.getClass();
                    gn2Var.B(new zf4(str));
                }
                return dn8.a;
            case 13:
                String str2 = (String) this.Z;
                SubscriptionItem subscriptionItem = (SubscriptionItem) this.Y;
                PrintWriter printWriter = (PrintWriter) obj;
                int i7 = MainActivity.y1;
                printWriter.getClass();
                kw4 kw4Var = kw4.a;
                int iA = kw4.a(str2);
                printWriter.println(new Date() + " Sub " + (subscriptionItem != null ? subscriptionItem.getRemarks() : null) + " servers: " + iA + " servers");
                return dn8.a;
            case 14:
                nn1 nn1Var = (nn1) this.Z;
                MainActivity mainActivity = (MainActivity) this.Y;
                String str3 = (String) obj;
                int i8 = MainActivity.y1;
                str3.getClass();
                u84 u84VarZ = ys0.z(nn1Var.h());
                nf1 nf1Var = tp1.a;
                w51.G(u84VarZ, dm4.a, (e71) null, new bk4(mainActivity, str3, charSequence, b), 2);
                return dn8.a;
            case 15:
                nm4 nm4Var = (nm4) this.Z;
                String str4 = (String) this.Y;
                Long l = (Long) obj;
                l.getClass();
                nm4Var.K(str4, l);
                return dn8.a;
            case 16:
                String str5 = (String) this.Z;
                dn2 dn2Var2 = (dn2) this.Y;
                f17 f17Var = (f17) obj;
                nw3[] nw3VarArr = d17.a;
                e17 e17Var = c17.u;
                nw3 nw3Var = d17.a[11];
                Float fValueOf = Float.valueOf(1.0f);
                e17Var.getClass();
                f17Var.a(e17Var, fValueOf);
                d17.b(f17Var, str5);
                f17Var.a(s07.b, new q3((String) null, new mv2(dn2Var2, (byte) 1)));
                return dn8.a;
            case 17:
                o87 o87Var = (o87) this.Z;
                oi oiVar2 = (oi) this.Y;
                pk6 pk6Var = (pk6) obj;
                float fL = ((nh5) o87Var.d.k0).l();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (pk6Var.t0 & 4294967295L));
                if (!Float.isNaN(fL) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
                    float fFloatValue = ((Number) oiVar2.d()).floatValue();
                    pk6Var.g(zw4.d(pk6Var, fFloatValue));
                    pk6Var.h(zw4.e(pk6Var, fFloatValue));
                    pk6Var.m(pn7.h(0.5f, (fL + fIntBitsToFloat) / fIntBitsToFloat));
                }
                return dn8.a;
            case 18:
                ((jz4) this.Z).g0.add(new gz4((n17) this.Y, obj));
                return dn8.a;
            case 19:
                ((og7) this.Z).m((CancellationException) null);
                ((kv5) this.Y).b((x31) obj);
                return dn8.a;
            case 20:
                i95 i95Var = (i95) this.Z;
                eo5 eo5Var2 = (eo5) this.Y;
                do5 do5Var2 = (do5) obj;
                long j = ((hf3) i95Var.q0.B(do5Var2)).a;
                if (i95Var.r0) {
                    do5.j(do5Var2, eo5Var2, (int) (j >> 32), (int) (j & 4294967295L));
                } else {
                    do5.k(do5Var2, eo5Var2, (int) (j >> 32), (int) (j & 4294967295L), (gn2) null, 12);
                }
                return dn8.a;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                fg5 fg5Var = (fg5) this.Z;
                eo5 eo5Var3 = (eo5) this.Y;
                do5 do5Var3 = (do5) obj;
                boolean z2 = fg5Var.u0;
                float f = fg5Var.q0;
                if (z2) {
                    do5.h(do5Var3, eo5Var3, do5Var3.x0(f), do5Var3.x0(fg5Var.r0));
                } else {
                    do5.f(do5Var3, eo5Var3, do5Var3.x0(f), do5Var3.x0(fg5Var.r0));
                }
                return dn8.a;
            case 22:
                gs5 gs5Var = (gs5) this.Z;
                fs5 fs5Var = (fs5) this.Y;
                qr6 qr6Var = (qr6) obj;
                qr6Var.getClass();
                gs5Var.b.H(qr6Var, fs5Var);
                return dn8.a;
            case 23:
                lh7 lh7Var2 = (lh7) this.Z;
                lh7 lh7Var3 = (lh7) this.Y;
                sv1 sv1Var2 = (sv1) obj;
                float fH0 = sv1Var2.h0(2.0f);
                float f2 = fH0 / 2.0f;
                sv1.o0(sv1Var2, ((dw0) lh7Var2.getValue()).a, sv1Var2.h0(oc.p / 2.0f) - f2, 0L, new om7(fH0, 0.0f, 0, 0, 30), 108);
                if (kt1.a(((kt1) lh7Var3.getValue()).X, 0.0f) > 0) {
                    sv1.o0(sv1Var2, ((dw0) lh7Var2.getValue()).a, sv1Var2.h0(((kt1) lh7Var3.getValue()).X) - f2, 0L, ea2.a, 108);
                }
                return dn8.a;
            case 24:
                r01 r01Var = (r01) this.Z;
                t05 t05Var = (t05) this.Y;
                r01Var.z(obj);
                if (t05Var != null) {
                    t05Var.a(obj);
                }
                return dn8.a;
            case 25:
                p86 p86Var = (p86) this.Z;
                Throwable th = (Throwable) this.Y;
                Throwable th2 = (Throwable) obj;
                synchronized (p86Var.c) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                gv3.g(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    p86Var.e = th;
                    oh7 oh7Var = p86Var.u;
                    m86 m86Var = m86.X;
                    oh7Var.getClass();
                    oh7Var.n((Object) null, m86Var);
                }
                return dn8.a;
            case 26:
                gn2 gn2Var2 = (gn2) this.Z;
                um6 um6Var = (um6) this.Y;
                cv1 cv1Var = (cv1) obj;
                cv1Var.getClass();
                int iOrdinal2 = cv1Var.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                        b61.c();
                        return null;
                    }
                    String str6 = um6Var.c;
                    str6.getClass();
                    gn2Var2.B(new to7(str6));
                }
                return dn8.a;
            case 27:
                gn2 gn2Var3 = (gn2) this.Z;
                vo6 vo6Var = (vo6) this.Y;
                bv1 bv1Var = (bv1) obj;
                bv1Var.getClass();
                int iOrdinal3 = bv1Var.ordinal();
                if (iOrdinal3 != 0) {
                    if (iOrdinal3 != 1 && iOrdinal3 != 2) {
                        b61.c();
                        return null;
                    }
                    String str7 = vo6Var.c;
                    str7.getClass();
                    gn2Var3.B(new no6(str7));
                }
                return dn8.a;
            case 28:
                gn2 gn2Var4 = (pv3) this.Z;
                lw5 lw5Var = (lw5) this.Y;
                String str8 = (String) obj;
                str8.getClass();
                gn2Var4.B(new io6(str8, ((kw5) lw5Var).a));
                return dn8.a;
            default:
                RoutingRulesActivity routingRulesActivity = (RoutingRulesActivity) this.Z;
                RouteSettingsCache routeSettingsCache = (RouteSettingsCache) this.Y;
                String name = (String) obj;
                int i9 = RoutingRulesActivity.X0;
                name.getClass();
                s6 s6Var = routingRulesActivity.Q0;
                if (s6Var == null) {
                    dh3.T("binding");
                    throw null;
                }
                AppCompatTextView appCompatTextView9 = s6Var.H0;
                mn6 mn6VarC = routingRulesActivity.C();
                String str9 = routingRulesActivity.S0;
                vz7 vz7Var = mn6.j;
                mn6VarC.getClass();
                str9.getClass();
                if (mn6VarC.D(str9, (String) null, new m40(name, (byte) 19)) == null) {
                    name = routeSettingsCache.getName();
                }
                appCompatTextView9.setText(name);
                return dn8.a;
        }
    }
}
