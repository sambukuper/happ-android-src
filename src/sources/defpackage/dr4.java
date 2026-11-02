package defpackage;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class dr4<S> extends sn1 {
    public CharSequence A1;
    public boolean B1;
    public int C1;
    public int D1;
    public CharSequence E1;
    public int F1;
    public CharSequence G1;
    public int H1;
    public CharSequence I1;
    public int J1;
    public CharSequence K1;
    public TextView L1;
    public CheckableImageButton M1;
    public gr4 N1;
    public boolean O1;
    public CharSequence P1;
    public CharSequence Q1;
    public final LinkedHashSet t1;
    public final LinkedHashSet u1;
    public int v1;
    public dn5 w1;
    public bd0 x1;
    public wq4 y1;
    public int z1;

    public dr4() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.t1 = new LinkedHashSet();
        this.u1 = new LinkedHashSet();
    }

    public static int Z(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(j36.mtrl_calendar_content_padding);
        Calendar calendarB = tr8.b();
        calendarB.set(5, 1);
        Calendar calendarA = tr8.a(calendarB);
        calendarA.get(2);
        calendarA.get(1);
        int maximum = calendarA.getMaximum(7);
        calendarA.getActualMaximum(5);
        calendarA.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(j36.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(j36.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean a0(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(u70.i0(u26.materialCalendarStyle, context, wq4.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // defpackage.sn1, defpackage.qk2
    public final void F(Bundle bundle) {
        super.F(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.v1);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bd0 bd0Var = this.x1;
        ad0 ad0Var = new ad0();
        long j = bd0Var.X.h0;
        long j2 = bd0Var.Y.h0;
        ad0Var.a = Long.valueOf(bd0Var.f0.h0);
        int i = bd0Var.g0;
        qc1 qc1Var = bd0Var.Z;
        wq4 wq4Var = this.y1;
        ay4 ay4Var = wq4Var == null ? null : wq4Var.g1;
        if (ay4Var != null) {
            ad0Var.a = Long.valueOf(ay4Var.h0);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", qc1Var);
        ay4 ay4VarD = ay4.d(j);
        ay4 ay4VarD2 = ay4.d(j2);
        qc1 qc1Var2 = (qc1) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = ad0Var.a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new bd0(ay4VarD, ay4VarD2, qc1Var2, l == null ? null : ay4.d(l.longValue()), i));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.z1);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.A1);
        bundle.putInt("INPUT_MODE_KEY", this.C1);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.D1);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.E1);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.F1);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.G1);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.H1);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.I1);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.J1);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.K1);
    }

    @Override // defpackage.sn1, defpackage.qk2
    public final void G() {
        dn5 dn5Var;
        dn5 dn5Var2;
        dn5 dn5Var3;
        eu7 y19Var;
        eu7 y19Var2;
        super.G();
        Window window = U().getWindow();
        if (this.B1) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.N1);
            if (!this.O1) {
                View viewFindViewById = O().findViewById(c46.fullscreen_header);
                ColorStateList colorStateListO = wa.o(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListO != null ? Integer.valueOf(colorStateListO.getDefaultColor()) : null;
                boolean z = false;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                int iC = yn0.C(window.getContext(), R.attr.colorBackground, -16777216);
                if (z2) {
                    numValueOf = Integer.valueOf(iC);
                }
                xt7.f(window, false);
                window.getContext();
                Context context = window.getContext();
                int i = Build.VERSION.SDK_INT;
                int iD = i < 27 ? qw0.d(yn0.C(context, R.attr.navigationBarColor, -16777216), 128) : 0;
                if (i < 35) {
                    window.setStatusBarColor(0);
                }
                if (i < 35) {
                    window.setNavigationBarColor(iD);
                }
                boolean z3 = yn0.L(0) || yn0.L(numValueOf.intValue());
                lr5 lr5Var = new lr5(window.getDecorView());
                if (i >= 35) {
                    y19Var = new b29(window, lr5Var);
                } else if (i >= 30) {
                    y19Var = new z19(window, lr5Var);
                } else {
                    y19Var = i >= 26 ? new y19(window, lr5Var) : new x19(window, lr5Var);
                }
                y19Var.k(z3);
                boolean zL = yn0.L(iC);
                if (yn0.L(iD) || (iD == 0 && zL)) {
                    z = true;
                }
                lr5 lr5Var2 = new lr5(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 35) {
                    y19Var2 = new b29(window, lr5Var2);
                } else if (i2 >= 30) {
                    y19Var2 = new z19(window, lr5Var2);
                } else {
                    y19Var2 = i2 >= 26 ? new y19(window, lr5Var2) : new x19(window, lr5Var2);
                }
                y19Var2.j(z);
                cr4 cr4Var = new cr4(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight());
                WeakHashMap weakHashMap = cw8.a;
                uv8.c(viewFindViewById, cr4Var);
                this.O1 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = o().getDimensionPixelOffset(j36.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.N1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ee3(U(), rect));
        }
        N();
        int i3 = this.v1;
        if (i3 == 0) {
            Y();
            throw null;
        }
        qk2 qk2VarE = j().E(this.C1 == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG");
        if (qk2VarE instanceof dn5) {
            dn5Var3 = (dn5) qk2VarE;
        } else {
            dn5Var = null;
        }
        if (dn5Var == null) {
            if (this.C1 == 1) {
                dn5Var = dn5Var3;
                Y();
                bd0 bd0Var = this.x1;
                jr4 jr4Var = new jr4();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i3);
                bundle.putParcelable("DATE_SELECTOR_KEY", null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bd0Var);
                jr4Var.Q(bundle);
                dn5Var2 = jr4Var;
            } else {
                dn5Var = dn5Var3;
                Y();
                bd0 bd0Var2 = this.x1;
                wq4 wq4Var = new wq4();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i3);
                bundle2.putParcelable("GRID_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bd0Var2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle2.putParcelable("CURRENT_MONTH_KEY", bd0Var2.f0);
                wq4Var.Q(bundle2);
                this.y1 = wq4Var;
                dn5Var2 = wq4Var;
            }
            dn5Var = dn5Var2;
        }
        dn5Var = dn5Var3;
        this.w1 = dn5Var;
        dn5Var.R(new k32());
        this.L1.setText((this.C1 == 1 && o().getConfiguration().orientation == 2) ? this.Q1 : this.P1);
        Y();
        throw null;
    }

    @Override // defpackage.sn1, defpackage.qk2
    public final void H() {
        this.w1.d1.clear();
        super.H();
    }

    @Override // defpackage.sn1
    public final Dialog T(Bundle bundle) {
        Context contextN = N();
        N();
        int i = this.v1;
        if (i == 0) {
            Y();
            throw null;
        }
        Dialog dialog = new Dialog(contextN, i);
        Context context = dialog.getContext();
        this.B1 = a0(context, R.attr.windowFullscreen);
        this.N1 = new gr4(context, null, u26.materialCalendarStyle, o56.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, v56.MaterialCalendar, u26.materialCalendarStyle, o56.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(v56.MaterialCalendar_backgroundTint, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.N1.p(context);
        this.N1.t(ColorStateList.valueOf(color));
        this.N1.s(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public final void Y() {
    }

    @Override // defpackage.sn1, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.t1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // defpackage.sn1, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.u1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.J0;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // defpackage.sn1, defpackage.qk2
    public final void y(Bundle bundle) {
        super.y(bundle);
        if (bundle == null) {
            bundle = this.h0;
        }
        this.v1 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.x1 = (bd0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.z1 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.A1 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.C1 = bundle.getInt("INPUT_MODE_KEY");
        this.D1 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.E1 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.F1 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.G1 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.H1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.I1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.J1 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.K1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.A1;
        if (text == null) {
            text = N().getResources().getText(this.z1);
        }
        this.P1 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.Q1 = text;
    }

    @Override // defpackage.qk2
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(this.B1 ? s46.mtrl_picker_fullscreen : s46.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.B1) {
            viewInflate.findViewById(c46.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(Z(context), -2));
        } else {
            viewInflate.findViewById(c46.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(Z(context), -1));
        }
        ((TextView) viewInflate.findViewById(c46.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.M1 = (CheckableImageButton) viewInflate.findViewById(c46.mtrl_picker_header_toggle);
        this.L1 = (TextView) viewInflate.findViewById(c46.mtrl_picker_title_text);
        this.M1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.M1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, u70.O(context, p36.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], u70.O(context, p36.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.M1.setChecked(this.C1 != 0);
        cw8.n(this.M1, null);
        CheckableImageButton checkableImageButton2 = this.M1;
        this.M1.setContentDescription(this.C1 == 1 ? checkableImageButton2.getContext().getString(h56.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(h56.mtrl_picker_toggle_to_text_input_mode));
        CheckableImageButton checkableImageButton3 = this.M1;
        a38.f(this.M1, this.C1 == 1 ? checkableImageButton3.getContext().getString(h56.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton3.getContext().getString(h56.mtrl_picker_toggle_to_text_input_mode_tooltip));
        this.M1.setOnClickListener(new st0(this, (byte) 10));
        Y();
        throw null;
    }
}
