package defpackage;

import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ComponentActivity;
import androidx.recyclerview.widget.l;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.dto.ConfigGroupCache;
import su.happ.proxyutility.dto.ServerCache;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class kq7 {
    public final uv7 a;
    public final iv7 b;
    public final gv7 c;
    public final vj4 d;
    public final mh7 e;
    public final rn2 f;
    public final sn2 g;
    public final gn2 h;
    public final rn2 i;
    public final boolean j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kq7(uv7 uv7Var, iv7 iv7Var, MainActivity mainActivity, vj4 vj4Var, mh7 mh7Var, rn2 rn2Var, sn2 sn2Var, gn2 gn2Var, rn2 rn2Var2) {
        uv7Var.getClass();
        gn2Var.getClass();
        this.a = uv7Var;
        this.b = iv7Var;
        this.c = mainActivity;
        this.d = vj4Var;
        this.e = mh7Var;
        this.f = rn2Var;
        this.g = sn2Var;
        this.h = gn2Var;
        this.i = rn2Var2;
        this.j = uv7Var == uv7.X;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(aw7 aw7Var, int i) {
        rv7 rv7Var = (rv7) this.b.B(Integer.valueOf(i));
        AppCompatImageButton appCompatImageButton = aw7Var.u.o0;
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            appCompatImageButton.setVisibility(8);
        } else if (iOrdinal != 1) {
            b61.c();
        } else {
            appCompatImageButton.setVisibility(0);
            appCompatImageButton.setOnClickListener(new dq7(this, rv7Var, (byte) 0));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(aw7 aw7Var, int i) {
        int i2;
        final rv7 rv7Var = (rv7) this.b.B(Integer.valueOf(i));
        si3 si3Var = aw7Var.u;
        si3Var.z0.setOnClickListener(new st0(aw7Var, (byte) 17));
        MaterialCheckBox materialCheckBox = si3Var.f0;
        materialCheckBox.setChecked(rv7Var.c);
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            materialCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: eq7
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    c83 c83Var;
                    compoundButton.getClass();
                    ConfigGroupCache configGroupCache = rv7Var.b;
                    String subId = configGroupCache.getSubId();
                    subId.getClass();
                    kq7 kq7Var = this.a;
                    mh7 mh7Var = kq7Var.e;
                    Object obj = null;
                    if (mh7Var != null && (c83Var = (c83) mh7Var.getValue()) != null) {
                        for (Object obj2 : c83Var) {
                            if (dh3.f((nv7) obj2, new mv7(subId))) {
                                obj = obj2;
                                break;
                            }
                        }
                        obj = (nv7) obj;
                    }
                    if (!(z && obj == null) && (z || obj == null)) {
                        return;
                    }
                    for (ServerCache serverCache : configGroupCache.getConfigs()) {
                        sn2 sn2Var = kq7Var.g;
                        if (sn2Var != null) {
                            String guid = serverCache.getGuid();
                            guid.getClass();
                            sn2Var.x(new lv7(guid), new mv7(subId), Boolean.valueOf(z));
                        }
                    }
                    rn2 rn2Var = kq7Var.f;
                    if (rn2Var != null) {
                        rn2Var.K(new mv7(subId), Boolean.valueOf(z));
                    }
                }
            });
            i2 = 0;
        } else {
            if (iOrdinal != 1) {
                b61.c();
                return;
            }
            i2 = 8;
        }
        si3Var.z0.setVisibility(i2);
        materialCheckBox.setVisibility(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(aw7 aw7Var, int i) {
        rv7 rv7Var = (rv7) this.b.B(Integer.valueOf(i));
        si3 si3Var = aw7Var.u;
        AppCompatImageButton appCompatImageButton = si3Var.h0;
        boolean z = rv7Var.d;
        appCompatImageButton.setVisibility(z ? 0 : 8);
        LinearLayout linearLayout = si3Var.x0;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, z ? 0.0f : 12.0f, si3Var.X.getContext().getResources().getDisplayMetrics()));
        linearLayout.setLayoutParams(layoutParams2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(aw7 aw7Var, int i) {
        ConfigGroupCache configGroupCache = ((rv7) this.b.B(Integer.valueOf(i))).b;
        float f = (!configGroupCache.getIsExpand() || configGroupCache.getConfigs().isEmpty()) ? 16.0f : 0.0f;
        si3 si3Var = aw7Var.u;
        float fApplyDimension = TypedValue.applyDimension(1, f, si3Var.X.getResources().getDisplayMetrics());
        si3Var.Z.setCornerLeftBottom(fApplyDimension);
        si3Var.Z.setCornerRightBottom(fApplyDimension);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(aw7 aw7Var, int i) {
        si3 si3Var = aw7Var.u;
        rv7 rv7Var = (rv7) this.b.B(Integer.valueOf(i));
        SubscriptionItem subscriptionItem = rv7Var.b.getSubscriptionItem();
        if (subscriptionItem == null || this.j) {
            rp7.e(si3Var.g0, false);
            return;
        }
        si3Var.g0.setSelected(true);
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.setTime(subscriptionItem.getLastUpdated() != -1 ? new Date(subscriptionItem.getLastUpdated() * 1000) : new Date(subscriptionItem.getAddedTime()));
        AppCompatTextView appCompatTextView = si3Var.g0;
        StringBuilder sb = new StringBuilder(ue3.i0(7, calendar.getTimeInMillis()));
        Integer num = rv7Var.e;
        if (num != null && num.intValue() > 0) {
            String string = si3Var.X.getContext().getString(y46.auto_update_subscription_info_text, num);
            string.getClass();
            sb.append(" | ".concat(string));
        }
        appCompatTextView.setText(sb.toString());
        rp7.e(si3Var.g0, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(aw7 aw7Var, int i) {
        SubscriptionItem subscriptionItem;
        rv7 rv7Var = (rv7) this.b.B(Integer.valueOf(i));
        si3 si3Var = aw7Var.u;
        ConfigGroupCache configGroupCache = rv7Var.b;
        if (configGroupCache.getIsExpand() || ((subscriptionItem = configGroupCache.getSubscriptionItem()) != null && subscriptionItem.getIsExpand())) {
            aw7Var.v = 180.0f;
            si3Var.h0.animate().rotation(aw7Var.v).setDuration(300L).start();
        } else {
            aw7Var.v = 90.0f;
            si3Var.h0.animate().rotation(aw7Var.v).setDuration(300L).start();
        }
        si3Var.h0.setOnClickListener(new dq7(this, rv7Var, (byte) 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(aw7 aw7Var, int i) {
        rv7 rv7Var = (rv7) this.b.B(Integer.valueOf(i));
        AppCompatImageView appCompatImageView = aw7Var.u.i0;
        ConfigGroupCache configGroupCache = rv7Var.b;
        SubscriptionItem subscriptionItem = configGroupCache.getSubscriptionItem();
        appCompatImageView.setVisibility((subscriptionItem == null || !subscriptionItem.b0() || fm7.o0(configGroupCache.getSubId()) || this.a != uv7.Y) ? 8 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(aw7 aw7Var, int i) {
        ConfigGroupCache configGroupCache = ((rv7) this.b.B(Integer.valueOf(i))).b;
        SubscriptionItem subscriptionItem = configGroupCache.getSubscriptionItem();
        if (!(subscriptionItem != null ? dh3.f(subscriptionItem.getImport(), Boolean.FALSE) : false)) {
            i(aw7Var, i);
            return;
        }
        si3 si3Var = aw7Var.u;
        View view = ((l) aw7Var).a;
        LinearLayout linearLayout = si3Var.j0;
        AppCompatTextView appCompatTextView = si3Var.Y;
        linearLayout.setVisibility(0);
        si3Var.l0.setVisibility(8);
        si3Var.s0.setVisibility(8);
        si3Var.r0.setVisibility(8);
        ConstraintLayout constraintLayout = si3Var.k0;
        constraintLayout.setVisibility(0);
        os4.M(constraintLayout, v26.colorBgSecondary);
        appCompatTextView.setText(appCompatTextView.getContext().getString(dh3.f(configGroupCache.getSubscriptionItem().getImportTryAdd(), Boolean.FALSE) ? y46.dialog_subscription_update_msg_restricted_access_mf : y46.dialog_subscription_update_msg_restricted_access));
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(1, 15.0f, view.getContext().getResources().getDisplayMetrics());
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, 15.0f, view.getContext().getResources().getDisplayMetrics());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to calculate best type for var: r0v40 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v40 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: su.happ.proxyutility.dto.SubscriptionUserInfo
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: su.happ.proxyutility.dto.SubscriptionUserInfo
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v11 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v11 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v13 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v14 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v15 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v5 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v6 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v7 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v8 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: su.happ.proxyutility.dto.ConfigGroupCache
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: su.happ.proxyutility.dto.ConfigGroupCache
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v0 ??, new type: su.happ.proxyutility.dto.ConfigGroupCache
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v0 ??, new type: su.happ.proxyutility.dto.ConfigGroupCache
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v1 ??, new type: su.happ.proxyutility.dto.ConfigGroupCache
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v1 ??, new type: su.happ.proxyutility.dto.ConfigGroupCache
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v2 ??, new type: su.happ.proxyutility.dto.ConfigGroupCache
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v2 ??, new type: su.happ.proxyutility.dto.ConfigGroupCache
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v3 ??, new type: su.happ.proxyutility.dto.ConfigGroupCache
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v3 ??, new type: su.happ.proxyutility.dto.ConfigGroupCache
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v4 ??, new type: su.happ.proxyutility.dto.ConfigGroupCache
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v4 ??, new type: su.happ.proxyutility.dto.ConfigGroupCache
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v1 ??, new type: su.happ.proxyutility.dto.SubscriptionItem
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v1 ??, new type: su.happ.proxyutility.dto.SubscriptionItem
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v2 ??, new type: su.happ.proxyutility.dto.MetaParams
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v2 ??, new type: su.happ.proxyutility.dto.MetaParams
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v11 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public final void i(defpackage.aw7 r23, int r24) {
        /*
            r22 = this;
            r0 = r22
            iv7 r1 = r0.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r24)
            java.lang.Object r1 = r1.B(r2)
            rv7 r1 = (defpackage.rv7) r1
            su.happ.proxyutility.dto.ConfigGroupCache r1 = r1.a
            su.happ.proxyutility.dto.SubscriptionItem r2 = r1.getSubscriptionItem()
            r22.e(r23, r24)
            r3 = r23
            si3 r3 = r3.u
            boolean r4 = r0.j
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L343
            su.happ.proxyutility.dto.MetaParams r7 = r2.getMetaParams()
            if (r7 == 0) goto L343
            boolean r0 = r2.b0()
            r8 = 3
            r9 = 2
            r10 = 0
            if (r0 == 0) goto Le0
            boolean r0 = r7.i1()
            if (r0 == 0) goto Le0
            java.lang.Long r0 = r7.B()
            if (r0 == 0) goto L42
            long r12 = r0.longValue()
            goto L43
        L42:
            r12 = r10
        L43:
            java.lang.Long r0 = r7.C()
            if (r0 == 0) goto L4e
            long r14 = r0.longValue()
            goto L4f
        L4e:
            r14 = r10
        L4f:
            java.lang.Long r0 = r7.D()
            if (r0 == 0) goto L5a
            long r16 = r0.longValue()
            goto L5c
        L5a:
            r16 = r10
        L5c:
            su.happ.proxyutility.ui.foundation.component.HappTextView r0 = r3.C0
            su.happ.proxyutility.ui.foundation.component.button.HappTextButton r2 = r3.A0
            int r18 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r18 > 0) goto L6f
            android.content.Context r12 = r0.getContext()
            int r13 = defpackage.y46.sub_info_expired
            java.lang.String r12 = r12.getString(r13)
            goto Laf
        L6f:
            int r18 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r18 != 0) goto L86
            android.content.Context r12 = r0.getContext()
            int r13 = defpackage.y46.sub_info_expire_minutes
            java.lang.Long r14 = java.lang.Long.valueOf(r16)
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            java.lang.String r12 = r12.getString(r13, r14)
            goto Laf
        L86:
            int r16 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r16 != 0) goto L9d
            android.content.Context r12 = r0.getContext()
            int r13 = defpackage.y46.sub_info_expire_hours
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            java.lang.String r12 = r12.getString(r13, r14)
            goto Laf
        L9d:
            android.content.Context r14 = r0.getContext()
            int r15 = defpackage.y46.sub_info_expire_days
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r12 = r14.getString(r15, r12)
        Laf:
            r0.setText(r12)
            java.lang.String r0 = r7.getSubExpireButtonLink()
            if (r0 != 0) goto Lba
            r0 = r5
            goto Ld5
        Lba:
            int r12 = defpackage.v26.subInfoButtonRed
            os4.M(r2, r12)
            android.content.Context r12 = r2.getContext()
            int r13 = defpackage.y46.sub_info_renew
            java.lang.String r12 = r12.getString(r13)
            r2.setText(r12)
            fq7 r12 = new fq7
            r12.<init>()
            r2.setOnClickListener(r12)
            r0 = r6
        Ld5:
            android.widget.LinearLayout r2 = r3.B0
            int r12 = defpackage.v26.subInfoBackgroundRed
            os4.M(r2, r12)
            r2 = r0
        Ldd:
            r12 = r6
            goto L159
        Le0:
            boolean r0 = r2.b0()
            if (r0 == 0) goto L157
            java.lang.String r0 = r7.getSubInfoText()
            if (r0 == 0) goto L157
            su.happ.proxyutility.dto.enums.SubInfoColor r0 = r7.getSubInfoColor()
            if (r0 != 0) goto Lf4
            su.happ.proxyutility.dto.enums.SubInfoColor r0 = su.happ.proxyutility.dto.enums.SubInfoColor.BLUE
        Lf4:
            su.happ.proxyutility.ui.foundation.component.HappTextView r2 = r3.C0
            su.happ.proxyutility.ui.foundation.component.button.HappTextButton r12 = r3.A0
            java.lang.String r13 = r7.getSubInfoText()
            r2.setText(r13)
            java.lang.String r2 = r7.getSubInfoButtonText()
            java.lang.String r13 = r7.getSubInfoButtonLink()
            if (r2 == 0) goto L136
            if (r13 != 0) goto L10c
            goto L136
        L10c:
            r12.setText(r2)
            int[] r2 = defpackage.jq7.a
            int r14 = r0.ordinal()
            r2 = r2[r14]
            if (r2 == r6) goto L127
            if (r2 == r9) goto L124
            if (r2 != r8) goto L120
            int r2 = defpackage.v26.subInfoButtonGreen
            goto L129
        L120:
            b61.c()
            return
        L124:
            int r2 = defpackage.v26.subInfoButtonBlue
            goto L129
        L127:
            int r2 = defpackage.v26.subInfoButtonRed
        L129:
            os4.M(r12, r2)
            fq7 r2 = new fq7
            r2.<init>()
            r12.setOnClickListener(r2)
            r2 = r6
            goto L137
        L136:
            r2 = r5
        L137:
            android.widget.LinearLayout r12 = r3.B0
            int[] r13 = defpackage.jq7.a
            int r0 = r0.ordinal()
            r0 = r13[r0]
            if (r0 == r6) goto L151
            if (r0 == r9) goto L14e
            if (r0 != r8) goto L14a
            int r0 = defpackage.v26.subInfoBackgroundGreen
            goto L153
        L14a:
            b61.c()
            return
        L14e:
            int r0 = defpackage.v26.subInfoBackgroundBlue
            goto L153
        L151:
            int r0 = defpackage.v26.subInfoBackgroundRed
        L153:
            os4.M(r12, r0)
            goto Ldd
        L157:
            r2 = r5
            r12 = r2
        L159:
            java.lang.String r0 = r7.getSupportUrl()
            if (r0 == 0) goto L190
            r13 = r4 ^ 1
            java.lang.String r14 = "(((https|http):\\/\\/)?(t\\.me|telegram\\.me)|tg:\\/\\/resolve).*"
            java.util.regex.Pattern r14 = java.util.regex.Pattern.compile(r14)
            r14.getClass()
            java.util.regex.Matcher r14 = r14.matcher(r0)
            boolean r14 = r14.matches()
            if (r14 == 0) goto L17c
            androidx.appcompat.widget.AppCompatImageView r14 = r3.v0
            int r15 = q36.icon_telegram
            r14.setImageResource(r15)
            goto L183
        L17c:
            androidx.appcompat.widget.AppCompatImageView r14 = r3.v0
            int r15 = q36.link
            r14.setImageResource(r15)
        L183:
            androidx.appcompat.widget.AppCompatImageView r14 = r3.v0
            fq7 r15 = new fq7
            r15.<init>()
            r14.setOnClickListener(r15)
            r0 = r6
            r9 = r0
            goto L193
        L190:
            r0 = r5
            r9 = r0
            r13 = r9
        L193:
            java.lang.String r14 = r7.getProfileWebPageUrl()
            if (r14 == 0) goto L1c0
            r13 = r4 ^ 1
            androidx.appcompat.widget.AppCompatImageView r0 = r3.w0
            int r15 = defpackage.v26.colorIconWebPageActive
            r22 = r10
            android.graphics.PorterDuff$Mode r10 = android.graphics.PorterDuff.Mode.SRC_IN
            r10.getClass()
            android.content.Context r11 = r0.getContext()
            r11.getClass()
            int r11 = os4.q(r11, r15)
            r0.setColorFilter(r11, r10)
            androidx.appcompat.widget.AppCompatImageView r0 = r3.w0
            fq7 r10 = new fq7
            r10.<init>()
            r0.setOnClickListener(r10)
            r0 = r6
            goto L1e3
        L1c0:
            r22 = r10
            androidx.appcompat.widget.AppCompatImageView r10 = r3.w0
            int r11 = defpackage.v26.colorIconWebPageInactive
            android.graphics.PorterDuff$Mode r14 = android.graphics.PorterDuff.Mode.SRC_IN
            r14.getClass()
            android.content.Context r15 = r10.getContext()
            r15.getClass()
            int r11 = os4.q(r15, r11)
            r10.setColorFilter(r11, r14)
            androidx.appcompat.widget.AppCompatImageView r10 = r3.w0
            gq7 r11 = new gq7
            r11.<init>()
            r10.setOnClickListener(r11)
        L1e3:
            su.happ.proxyutility.dto.SubscriptionUserInfo r10 = r7.getSubscriptionUserInfo()
            if (r10 == 0) goto L2f5
            long r14 = r10.getUpload()
            r16 = -1
            int r11 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r11 > 0) goto L200
            long r14 = r10.getDownload()
            int r11 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r11 <= 0) goto L1fc
            goto L200
        L1fc:
            r21 = r1
            goto L2b4
        L200:
            long r14 = r10.getTotal()
            int r11 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r11 <= 0) goto L1fc
            r13 = r4 ^ 1
            long r14 = r10.getUpload()
            int r0 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r0 <= 0) goto L217
            long r14 = r10.getUpload()
            goto L219
        L217:
            r14 = r22
        L219:
            long r16 = r10.getDownload()
            int r0 = (r16 > r22 ? 1 : (r16 == r22 ? 0 : -1))
            if (r0 <= 0) goto L226
            long r16 = r10.getDownload()
            goto L228
        L226:
            r16 = r22
        L228:
            long r14 = r14 + r16
            long r16 = r10.getTotal()
            int r0 = (r16 > r22 ? 1 : (r16 == r22 ? 0 : -1))
            if (r0 <= 0) goto L237
            long r16 = r10.getTotal()
            goto L239
        L237:
            r16 = r22
        L239:
            su.happ.proxyutility.ui.foundation.component.HappTextView r0 = r3.D0
            android.widget.ProgressBar r11 = r3.y0
            java.lang.String r8 = defpackage.x79.g(r14)
            int r18 = (r16 > r22 ? 1 : (r16 == r22 ? 0 : -1))
            if (r18 != 0) goto L24a
            java.lang.String r19 = "∞"
        L247:
            r6 = r19
            goto L24f
        L24a:
            java.lang.String r19 = defpackage.x79.g(r16)
            goto L247
        L24f:
            java.lang.String r5 = "/"
            java.lang.String r5 = pc6.p(r8, r5, r6)
            java.lang.String r6 = " "
            java.lang.String r8 = ""
            r21 = r1
            r1 = 0
            java.lang.String r5 = mm7.W(r5, r6, r8, r1)
            r0.setText(r5)
            if (r18 != 0) goto L26d
            r11.setProgress(r1)
            r1 = 1
            r11.setMax(r1)
            goto L2af
        L26d:
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 <= 0) goto L278
            qg5 r0 = defpackage.x79.d(r16)     // Catch: java.lang.Throwable -> L276
            goto L27c
        L276:
            r0 = move-exception
            goto L2a7
        L278:
            qg5 r0 = defpackage.x79.d(r14)     // Catch: java.lang.Throwable -> L276
        L27c:
            java.lang.Object r0 = r0.Y     // Catch: java.lang.Throwable -> L276
            r1 = r0
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L276
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L276
            if (r1 <= 0) goto L299
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L276
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L276
            r5 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = (double) r0     // Catch: java.lang.Throwable -> L276
            double r0 = java.lang.Math.pow(r5, r0)     // Catch: java.lang.Throwable -> L276
            int r1 = nr4.N(r0)     // Catch: java.lang.Throwable -> L276
            goto L29a
        L299:
            r1 = 1
        L29a:
            long r0 = (long) r1     // Catch: java.lang.Throwable -> L276
            long r5 = r16 / r0
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L276
            r11.setMax(r5)     // Catch: java.lang.Throwable -> L276
            long r14 = r14 / r0
            int r0 = (int) r14     // Catch: java.lang.Throwable -> L276
            r11.setProgress(r0)     // Catch: java.lang.Throwable -> L276
            goto L2af
        L2a7:
            boolean r1 = r0 instanceof java.lang.InterruptedException
            if (r1 != 0) goto L2b3
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L2b3
        L2af:
            r0 = 1
            r1 = 1
            r5 = 1
            goto L2be
        L2b3:
            throw r0
        L2b4:
            su.happ.proxyutility.ui.foundation.component.HappTextView r1 = r3.u0
            r5 = 8388611(0x800003, float:1.1754948E-38)
            r1.setGravity(r5)
            r1 = 0
            r5 = 0
        L2be:
            long r14 = r10.getExpire()
            int r6 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r6 <= 0) goto L2f9
            r0 = r4 ^ 1
            su.happ.proxyutility.ui.foundation.component.HappTextView r1 = r3.u0
            java.util.Date r6 = new java.util.Date
            long r10 = r10.getExpire()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r13
            r6.<init>(r10)
            android.content.Context r8 = r1.getContext()
            int r10 = defpackage.y46.info_bar_expires
            long r13 = r6.getTime()
            r6 = 3
            java.lang.String r6 = ue3.i0(r6, r13)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r6 = r8.getString(r10, r6)
            r1.setText(r6)
            r13 = r0
            r0 = 1
            r1 = 1
            r6 = 1
            goto L2fa
        L2f5:
            r21 = r1
            r1 = 0
            r5 = 0
        L2f9:
            r6 = 0
        L2fa:
            java.lang.String r7 = r7.getAnnounce()
            if (r7 == 0) goto L32d
            r8 = r4 ^ 1
            androidx.constraintlayout.widget.ConstraintLayout r10 = r3.k0
            su.happ.proxyutility.ui.foundation.component.HappTextView r11 = r3.Y
            int r13 = defpackage.v26.colorBgTertiary
            os4.M(r10, r13)
            int r10 = r7.length()
            r13 = 200(0xc8, float:2.8E-43)
            if (r10 <= r13) goto L319
            r10 = 199(0xc7, float:2.79E-43)
            java.lang.String r7 = fm7.Q0(r10, r7)
        L319:
            r11.setText(r7)
            android.view.ViewGroup$LayoutParams r7 = r11.getLayoutParams()
            r7.getClass()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r7 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r7
            r10 = 0
            r7.topMargin = r10
            r7.bottomMargin = r10
            r13 = r8
            r7 = 1
            goto L32f
        L32d:
            r10 = 0
            r7 = r10
        L32f:
            if (r7 != 0) goto L333
            if (r0 != 0) goto L337
        L333:
            if (r7 == 0) goto L339
            if (r0 != 0) goto L339
        L337:
            r8 = r10
            goto L33a
        L339:
            r8 = 1
        L33a:
            r11 = r2
            r2 = r1
            r1 = r13
            r13 = r12
            r12 = r9
            r9 = r7
            r7 = r6
            r6 = 1
            goto L351
        L343:
            r21 = r1
            r10 = r5
            r0 = r10
            r1 = r0
            r2 = r1
            r5 = r2
            r6 = r5
            r7 = r6
            r9 = r7
            r11 = r9
            r12 = r11
            r13 = r12
            r8 = 1
        L351:
            su.happ.proxyutility.dto.SubscriptionItem r14 = r21.getSubscriptionItem()
            if (r14 == 0) goto L362
            java.lang.Boolean r14 = r14.getImport()
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            boolean r14 = dh3.f(r14, r15)
            goto L363
        L362:
            r14 = r10
        L363:
            if (r14 == 0) goto L36a
            r20 = 1
            r1 = r4 ^ 1
            goto L36c
        L36a:
            r20 = r9
        L36c:
            android.widget.LinearLayout r4 = r3.B0
            r9 = 8
            if (r13 == 0) goto L374
            r13 = r10
            goto L375
        L374:
            r13 = r9
        L375:
            r4.setVisibility(r13)
            su.happ.proxyutility.ui.foundation.component.button.HappTextButton r4 = r3.A0
            if (r11 == 0) goto L37e
            r11 = r10
            goto L37f
        L37e:
            r11 = r9
        L37f:
            r4.setVisibility(r11)
            android.widget.LinearLayout r4 = r3.j0
            if (r1 == 0) goto L388
            r1 = r10
            goto L389
        L388:
            r1 = r9
        L389:
            r4.setVisibility(r1)
            android.widget.LinearLayout r1 = r3.l0
            if (r0 == 0) goto L392
            r0 = r10
            goto L393
        L392:
            r0 = r9
        L393:
            r1.setVisibility(r0)
            android.widget.LinearLayout r0 = r3.n0
            if (r2 == 0) goto L39c
            r1 = r10
            goto L39d
        L39c:
            r1 = r9
        L39d:
            r0.setVisibility(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.m0
            if (r5 == 0) goto L3a6
            r1 = r10
            goto L3a7
        L3a6:
            r1 = r9
        L3a7:
            r0.setVisibility(r1)
            androidx.appcompat.widget.AppCompatImageView r0 = r3.v0
            if (r12 == 0) goto L3b0
            r1 = r10
            goto L3b1
        L3b0:
            r1 = r9
        L3b1:
            r0.setVisibility(r1)
            androidx.appcompat.widget.AppCompatImageView r0 = r3.w0
            if (r6 == 0) goto L3ba
            r1 = r10
            goto L3bb
        L3ba:
            r1 = r9
        L3bb:
            r0.setVisibility(r1)
            su.happ.proxyutility.ui.foundation.component.HappTextView r0 = r3.u0
            if (r7 == 0) goto L3c4
            r1 = r10
            goto L3c5
        L3c4:
            r1 = r9
        L3c5:
            r0.setVisibility(r1)
            android.view.View r0 = r3.t0
            if (r8 == 0) goto L3ce
            r1 = r10
            goto L3cf
        L3ce:
            r1 = r9
        L3cf:
            r0.setVisibility(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.k0
            if (r20 == 0) goto L3d8
            r5 = r10
            goto L3d9
        L3d8:
            r5 = r9
        L3d9:
            r0.setVisibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq7.i(aw7, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(aw7 aw7Var, int i) {
        aw7Var.u.q0.setVisibility((this.a == uv7.Y && ((rv7) this.b.B(Integer.valueOf(i))).b.getIsPinned()) ? 0 : 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(aw7 aw7Var, int i) {
        rv7 rv7Var = (rv7) this.b.B(Integer.valueOf(i));
        AppCompatImageButton appCompatImageButton = aw7Var.u.r0;
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            appCompatImageButton.setVisibility(8);
            return;
        }
        byte b = 1;
        if (iOrdinal != 1) {
            b61.c();
        } else {
            appCompatImageButton.setVisibility(rv7Var.b.getConfigs().isEmpty() ? 8 : 0);
            appCompatImageButton.setOnClickListener(new dq7(this, rv7Var, b));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(aw7 aw7Var, int i) {
        final rv7 rv7Var = (rv7) this.b.B(Integer.valueOf(i));
        final SubscriptionItem subscriptionItem = rv7Var.b.getSubscriptionItem();
        si3 si3Var = aw7Var.u;
        if (subscriptionItem == null) {
            rp7.e(si3Var.s0, false);
            return;
        }
        final AppCompatImageButton appCompatImageButton = si3Var.s0;
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            rp7.e(appCompatImageButton, false);
        } else {
            if (iOrdinal != 1) {
                b61.c();
                return;
            }
            rp7.e(appCompatImageButton, true);
            appCompatImageButton.setOnClickListener(new View.OnClickListener() { // from class: hq7
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dn8 rj6Var;
                    kq7 kq7Var = this.X;
                    SubscriptionItem subscriptionItem2 = subscriptionItem;
                    String subId = rv7Var.b.getSubId();
                    AppCompatImageButton appCompatImageButton2 = appCompatImageButton;
                    t16 t16Var = new t16(appCompatImageButton2, (byte) 26);
                    try {
                        appCompatImageButton2.setEnabled(false);
                        gv7 gv7Var = kq7Var.c;
                        rj6Var = null;
                        if (gv7Var != null) {
                            MainActivity mainActivity = (MainActivity) gv7Var;
                            subId.getClass();
                            jm4.Q(ys0.z(((ComponentActivity) mainActivity).X), (u61) null, new pi(mainActivity, subId, subscriptionItem2, t16Var, (q51) null, (byte) 14), 3);
                            rj6Var = dn8.a;
                        }
                    } catch (Throwable th) {
                        if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                            throw th;
                        }
                        rj6Var = new rj6(th);
                    }
                    if (sj6.a(rj6Var) != null) {
                        t16Var.B(Boolean.FALSE);
                    }
                }
            });
            appCompatImageButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: iq7
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    dn8 rj6Var;
                    SubscriptionItem subscriptionItem2 = subscriptionItem;
                    rv7 rv7Var2 = rv7Var;
                    String subId = rv7Var2.b.getSubId();
                    AppCompatImageButton appCompatImageButton2 = appCompatImageButton;
                    kq7 kq7Var = this.X;
                    sn snVar = new sn(appCompatImageButton2, kq7Var, rv7Var2, (byte) 29);
                    try {
                        appCompatImageButton2.setEnabled(false);
                        gv7 gv7Var = kq7Var.c;
                        rj6Var = null;
                        if (gv7Var != null) {
                            MainActivity mainActivity = (MainActivity) gv7Var;
                            subId.getClass();
                            jm4.Q(ys0.z(((ComponentActivity) mainActivity).X), (u61) null, new pi(mainActivity, subId, subscriptionItem2, snVar, (q51) null, (byte) 13), 3);
                            rj6Var = dn8.a;
                        }
                    } catch (Throwable th) {
                        if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                            throw th;
                        }
                        rj6Var = new rj6(th);
                    }
                    if (sj6.a(rj6Var) == null) {
                        return true;
                    }
                    snVar.B(Boolean.FALSE);
                    return true;
                }
            });
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(aw7 aw7Var, int i) {
        rv7 rv7Var = (rv7) this.b.B(Integer.valueOf(i));
        si3 si3Var = aw7Var.u;
        SubscriptionItem subscriptionItem = rv7Var.b.getSubscriptionItem();
        CharSequence string = subscriptionItem == null ? si3Var.X.getContext().getString(y46.title_server_list) : subscriptionItem.getRemarks();
        string.getClass();
        si3Var.p0.setText(string);
        si3Var.p0.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
    }
}
