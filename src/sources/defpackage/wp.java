package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.a;
import androidx.appcompat.widget.i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wp extends mp implements lt4, LayoutInflater.Factory2 {
    public static final l97 h1 = new l97(0);
    public static final int[] i1 = {R.attr.windowBackground};
    public static final boolean j1 = !"robolectric".equals(Build.FINGERPRINT);
    public boolean A0;
    public ViewGroup B0;
    public TextView C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public vp[] L0;
    public vp M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public Configuration R0;
    public final int S0;
    public int T0;
    public int U0;
    public boolean V0;
    public sp W0;
    public sp X0;
    public boolean Y0;
    public int Z0;
    public boolean b1;
    public Rect c1;
    public Rect d1;
    public br e1;
    public OnBackInvokedDispatcher f1;
    public kn g1;
    public final Object l0;
    public final Context m0;
    public Window n0;
    public rp o0;
    public u70 p0;
    public uw7 q0;
    public CharSequence r0;
    public vd1 s0;
    public op t0;
    public pp u0;
    public l5 v0;
    public ActionBarContextView w0;
    public PopupWindow x0;
    public np y0;
    public qx8 z0 = null;
    public final np a1 = new np(this, 0);

    public wp(Context context, Window window, ip ipVar, Object obj) {
        AppCompatActivity appCompatActivity = null;
        this.S0 = -100;
        this.m0 = context;
        this.l0 = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AppCompatActivity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    appCompatActivity = (AppCompatActivity) context;
                    break;
                }
            }
            if (appCompatActivity != null) {
                this.S0 = ((wp) appCompatActivity.p()).S0;
            }
        }
        if (this.S0 == -100) {
            String name = this.l0.getClass().getName();
            l97 l97Var = h1;
            Integer num = (Integer) l97Var.get(name);
            if (num != null) {
                this.S0 = num.intValue();
                l97Var.remove(this.l0.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        aq.d();
    }

    public static he4 o(Context context) {
        he4 he4Var;
        he4 he4Var2;
        if (Build.VERSION.SDK_INT >= 33 || (he4Var = mp.Z) == null) {
            return null;
        }
        ie4 ie4Var = he4Var.a;
        he4 he4VarA = he4.a(context.getApplicationContext().getResources().getConfiguration().getLocales().toLanguageTags());
        if (ie4Var.a.isEmpty()) {
            he4Var2 = he4.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < he4VarA.a.a.size() + ie4Var.a.size()) {
                Locale locale = i < ie4Var.a.size() ? ie4Var.a.get(i) : he4VarA.a.a.get(i - ie4Var.a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            he4Var2 = new he4(new ie4(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return he4Var2.a.a.isEmpty() ? he4VarA : he4Var2;
    }

    public static Configuration s(Context context, int i, he4 he4Var, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (he4Var != null) {
            configuration2.setLocales(LocaleList.forLanguageTags(he4Var.a.a.toLanguageTags()));
        }
        return configuration2;
    }

    public final void A(int i) {
        this.Z0 = (1 << i) | this.Z0;
        if (this.Y0) {
            return;
        }
        View decorView = this.n0.getDecorView();
        WeakHashMap weakHashMap = cw8.a;
        decorView.postOnAnimation(this.a1);
        this.Y0 = true;
    }

    public final int B(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            bt.i("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        sp spVar = this.X0;
                        if (spVar == null) {
                            spVar = new sp(this, context);
                            this.X0 = spVar;
                        }
                        return spVar.i();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return x(context).i();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean C() {
        boolean z = this.N0;
        this.N0 = false;
        vp vpVarY = y(0);
        if (!vpVarY.m) {
            l5 l5Var = this.v0;
            if (l5Var != null) {
                l5Var.b();
                return true;
            }
            z();
            u70 u70Var = this.p0;
            if (u70Var == null || !u70Var.B()) {
                return false;
            }
        } else if (!z) {
            r(vpVarY, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.j() != false) goto L20;
     */
    @Override // defpackage.lt4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(defpackage.nt4 r6) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp.D(nt4):void");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x016f, code lost:
    
        if (r6.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(defpackage.vp r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp.E(vp, android.view.KeyEvent):void");
    }

    public final boolean F(vp vpVar, int i, KeyEvent keyEvent) {
        nt4 nt4Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((vpVar.k || G(vpVar, keyEvent)) && (nt4Var = vpVar.h) != null) {
            return nt4Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d8 A[PHI: r6
  0x00d8: PHI (r6v2 nt4) = (r6v1 nt4), (r6v8 nt4) binds: [B:34:0x0056, B:60:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:74:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0102  */
    /* JADX WARN: Code duplicated, block: B:82:0x0117  */
    public final boolean G(vp vpVar, KeyEvent keyEvent) {
        nt4 nt4Var;
        vd1 vd1Var;
        vd1 vd1Var2;
        op opVar;
        Resources.Theme themeNewTheme;
        vd1 vd1Var3;
        vd1 vd1Var4;
        if (!this.Q0) {
            boolean z = vpVar.k;
            int i = vpVar.a;
            if (z) {
                return true;
            }
            vp vpVar2 = this.M0;
            if (vpVar2 != null && vpVar2 != vpVar) {
                r(vpVar2, false);
            }
            Window.Callback callback = this.n0.getCallback();
            if (callback != null) {
                vpVar.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (vd1Var4 = this.s0) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) vd1Var4;
                actionBarOverlayLayout.j();
                ((i) actionBarOverlayLayout.j0).l = true;
            }
            if (vpVar.g == null && (!z2 || !(this.p0 instanceof sb8))) {
                nt4 nt4Var2 = vpVar.h;
                if (nt4Var2 == null || vpVar.o) {
                    if (nt4Var2 == null) {
                        Context context = this.m0;
                        if ((i == 0 || i == 108) && this.s0 != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(w26.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(w26.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(w26.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                n51 n51Var = new n51(context, 0);
                                n51Var.getTheme().setTo(themeNewTheme);
                                context = n51Var;
                            }
                        }
                        nt4 nt4Var3 = new nt4(context);
                        nt4Var3.e = this;
                        nt4 nt4Var4 = vpVar.h;
                        if (nt4Var3 != nt4Var4) {
                            if (nt4Var4 != null) {
                                nt4Var4.r(vpVar.i);
                            }
                            vpVar.h = nt4Var3;
                            nb4 nb4Var = vpVar.i;
                            if (nb4Var != null) {
                                nt4Var3.b(nb4Var, nt4Var3.a);
                            }
                        }
                        nt4Var2 = vpVar.h;
                        if (nt4Var2 != null) {
                            if (z2 && (vd1Var2 = this.s0) != null) {
                                opVar = this.t0;
                                if (opVar == null) {
                                    opVar = new op(this);
                                    this.t0 = opVar;
                                }
                                ((ActionBarOverlayLayout) vd1Var2).l(nt4Var2, opVar);
                            }
                            vpVar.h.w();
                            if (callback.onCreatePanelMenu(i, vpVar.h)) {
                                vpVar.o = false;
                            } else {
                                nt4Var = vpVar.h;
                                if (nt4Var != null) {
                                    if (nt4Var != null) {
                                        nt4Var.r(vpVar.i);
                                    }
                                    vpVar.h = null;
                                }
                                if (z2 && (vd1Var = this.s0) != null) {
                                    ((ActionBarOverlayLayout) vd1Var).l(null, this.t0);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            opVar = this.t0;
                            if (opVar == null) {
                                opVar = new op(this);
                                this.t0 = opVar;
                            }
                            ((ActionBarOverlayLayout) vd1Var2).l(nt4Var2, opVar);
                        }
                        vpVar.h.w();
                        if (callback.onCreatePanelMenu(i, vpVar.h)) {
                            nt4Var = vpVar.h;
                            if (nt4Var != null) {
                                if (nt4Var != null) {
                                    nt4Var.r(vpVar.i);
                                }
                                vpVar.h = null;
                            }
                            if (z2) {
                                ((ActionBarOverlayLayout) vd1Var).l(null, this.t0);
                            }
                        } else {
                            vpVar.o = false;
                        }
                    }
                }
                vpVar.h.w();
                Bundle bundle = vpVar.p;
                if (bundle != null) {
                    vpVar.h.s(bundle);
                    vpVar.p = null;
                }
                if (!callback.onPreparePanel(0, vpVar.g, vpVar.h)) {
                    if (z2 && (vd1Var3 = this.s0) != null) {
                        ((ActionBarOverlayLayout) vd1Var3).l(null, this.t0);
                    }
                    vpVar.h.v();
                    return false;
                }
                vpVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                vpVar.h.v();
            }
            vpVar.k = true;
            vpVar.l = false;
            this.M0 = vpVar;
            return true;
        }
        return false;
    }

    public final void H() {
        if (this.A0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void I() {
        kn knVar;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f1 != null && (y(0).m || this.v0 != null)) {
                z = true;
            }
            if (z && this.g1 == null) {
                this.g1 = c4.A(this.f1, this);
            } else {
                if (z || (knVar = this.g1) == null) {
                    return;
                }
                c4.J(this.f1, knVar);
                this.g1 = null;
            }
        }
    }

    @Override // defpackage.mp
    public final void a() {
        if (this.p0 != null) {
            z();
            if (this.p0.V()) {
                return;
            }
            A(0);
        }
    }

    @Override // defpackage.mp
    public final void c() {
        String strH;
        this.O0 = true;
        m(false, true);
        w();
        Object obj = this.l0;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strH = yn0.H(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strH = null;
            }
            if (strH != null) {
                u70 u70Var = this.p0;
                if (u70Var == null) {
                    this.b1 = true;
                } else {
                    u70Var.k0(true);
                }
            }
            synchronized (mp.j0) {
                mp.e(this);
                mp.i0.add(new WeakReference(this));
            }
        }
        this.R0 = new Configuration(this.m0.getResources().getConfiguration());
        this.P0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // defpackage.mp
    public final void d() {
        if (this.l0 instanceof Activity) {
            synchronized (mp.j0) {
                mp.e(this);
            }
        }
        if (this.Y0) {
            this.n0.getDecorView().removeCallbacks(this.a1);
        }
        this.Q0 = true;
        if (this.S0 != -100) {
            Object obj = this.l0;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                h1.put(this.l0.getClass().getName(), Integer.valueOf(this.S0));
            } else {
                h1.remove(this.l0.getClass().getName());
            }
        } else {
            h1.remove(this.l0.getClass().getName());
        }
        u70 u70Var = this.p0;
        if (u70Var != null) {
            u70Var.a0();
        }
        sp spVar = this.W0;
        if (spVar != null) {
            spVar.f();
        }
        sp spVar2 = this.X0;
        if (spVar2 != null) {
            spVar2.f();
        }
    }

    @Override // defpackage.mp
    public final boolean f(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.J0 && i == 108) {
            return false;
        }
        if (this.F0 && i == 1) {
            this.F0 = false;
        }
        if (i == 1) {
            H();
            this.J0 = true;
            return true;
        }
        if (i == 2) {
            H();
            this.D0 = true;
            return true;
        }
        if (i == 5) {
            H();
            this.E0 = true;
            return true;
        }
        if (i == 10) {
            H();
            this.H0 = true;
            return true;
        }
        if (i == 108) {
            H();
            this.F0 = true;
            return true;
        }
        if (i != 109) {
            return this.n0.requestFeature(i);
        }
        H();
        this.G0 = true;
        return true;
    }

    @Override // defpackage.mp
    public final void g(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.B0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.m0).inflate(i, viewGroup);
        this.o0.a(this.n0.getCallback());
    }

    @Override // defpackage.mp
    public final void h(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.B0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.o0.a(this.n0.getCallback());
    }

    @Override // defpackage.mp
    public final void i(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.B0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.o0.a(this.n0.getCallback());
    }

    @Override // defpackage.mp
    public final void k(CharSequence charSequence) {
        this.r0 = charSequence;
        vd1 vd1Var = this.s0;
        if (vd1Var != null) {
            vd1Var.setWindowTitle(charSequence);
            return;
        }
        u70 u70Var = this.p0;
        if (u70Var != null) {
            u70Var.n0(charSequence);
            return;
        }
        TextView textView = this.C0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // defpackage.lt4
    public final boolean l(nt4 nt4Var, MenuItem menuItem) {
        vp vpVar;
        Window.Callback callback = this.n0.getCallback();
        if (callback != null && !this.Q0) {
            nt4 nt4VarK = nt4Var.k();
            vp[] vpVarArr = this.L0;
            int length = vpVarArr != null ? vpVarArr.length : 0;
            for (int i = 0; i < length; i++) {
                vpVar = vpVarArr[i];
                if (vpVar != null && vpVar.h == nt4VarK) {
                    if (vpVar != null) {
                        return callback.onMenuItemSelected(vpVar.a, menuItem);
                    }
                }
            }
            vpVar = null;
            if (vpVar != null) {
                return callback.onMenuItemSelected(vpVar.a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0107  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean m(boolean z, boolean z2) {
        int i;
        boolean z3;
        Object obj;
        Object obj2;
        if (this.Q0) {
            return false;
        }
        int i2 = this.S0;
        if (i2 == -100) {
            i2 = mp.Y;
        }
        Context context = this.m0;
        int iB = B(context, i2);
        int i3 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        he4 he4VarO = i3 < 33 ? o(context) : null;
        if (!z2 && he4VarO != null) {
            he4VarO = he4.a(context.getResources().getConfiguration().getLocales().toLanguageTags());
        }
        Configuration configurationS = s(context, iB, he4VarO, null, false);
        boolean z4 = this.V0;
        boolean z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        Object obj3 = this.l0;
        if (z4 || !(obj3 instanceof Activity)) {
            this.V0 = true;
            i = this.U0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i3 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.U0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    this.U0 = 0;
                }
                this.V0 = true;
                i = this.U0;
            }
        }
        Configuration configuration = this.R0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = configurationS.uiMode & 48;
        he4 he4VarA = he4.a(configuration.getLocales().toLanguageTags());
        he4 he4VarA2 = he4VarO == null ? null : he4.a(configurationS.getLocales().toLanguageTags());
        int i6 = i4 != i5 ? 512 : 0;
        if (he4VarA2 != null && !he4VarA.equals(he4VarA2)) {
            i6 |= 8196;
        }
        if (((~i) & i6) != 0 && z && this.O0 && ((j1 || this.P0) && (obj3 instanceof Activity))) {
            Activity activity = (Activity) obj3;
            if (activity.isChild()) {
                z3 = false;
            } else {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 31 && (i6 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationS.getLayoutDirection());
                }
                if (i7 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new c1(activity, z5 ? (byte) 1 : (byte) 0));
                }
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i6 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i6 & i) == i6;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i5;
            if (he4VarA2 != null) {
                configuration2.setLocales(LocaleList.forLanguageTags(he4VarA2.a.a.toLanguageTags()));
            }
            resources.updateConfiguration(configuration2, null);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 < 26 && i8 < 28) {
                if (!z68.s) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        z68.r = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused2) {
                    }
                    z68.s = true;
                }
                Field field = z68.r;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException unused3) {
                        obj = null;
                    }
                    if (obj != null) {
                        if (!z68.m) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                z68.l = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException unused4) {
                            }
                            z68.m = true;
                        }
                        Field field2 = z68.l;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException unused5) {
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!z68.o) {
                                try {
                                    z68.n = Class.forName("android.content.res.ThemedResourceCache");
                                } catch (ClassNotFoundException unused6) {
                                }
                                z68.o = true;
                            }
                            Class cls = z68.n;
                            if (cls != null) {
                                if (!z68.q) {
                                    try {
                                        Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                        z68.p = declaredField3;
                                        declaredField3.setAccessible(true);
                                    } catch (NoSuchFieldException unused7) {
                                    }
                                    z68.q = true;
                                }
                                Field field3 = z68.p;
                                if (field3 != null) {
                                    try {
                                        longSparseArray = (LongSparseArray) field3.get(obj2);
                                    } catch (IllegalAccessException unused8) {
                                    }
                                    if (longSparseArray != null) {
                                        longSparseArray.clear();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i9 = this.T0;
            if (i9 != 0) {
                context.setTheme(i9);
                context.getTheme().applyStyle(this.T0, true);
            }
            if (z6 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof d94) {
                    if (((d94) activity2).getH0().i.compareTo(o84.Z) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                        this.n0.getDecorView().dispatchConfigurationChanged(configuration2);
                    }
                } else if (this.P0 && !this.Q0) {
                    activity2.onConfigurationChanged(configuration2);
                    this.n0.getDecorView().dispatchConfigurationChanged(configuration2);
                }
            }
        }
        if (he4VarA2 != null) {
            LocaleList.setDefault(LocaleList.forLanguageTags(he4.a(context.getResources().getConfiguration().getLocales().toLanguageTags()).a.a.toLanguageTags()));
        }
        if (i2 == 0) {
            x(context).u();
        } else {
            sp spVar = this.W0;
            if (spVar != null) {
                spVar.f();
            }
        }
        sp spVar2 = this.X0;
        if (i2 == 3) {
            if (spVar2 == null) {
                spVar2 = new sp(this, context);
                this.X0 = spVar2;
            }
            spVar2.u();
        } else if (spVar2 != null) {
            spVar2.f();
        }
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    public final void n(Window window) {
        Drawable drawableD;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        kn knVar;
        int resourceId;
        if (this.n0 != null) {
            bt.i("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof rp) {
            bt.i("AppCompat has already installed itself into the Window");
            return;
        }
        rp rpVar = new rp(this, callback);
        this.o0 = rpVar;
        window.setCallback(rpVar);
        Context context = this.m0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, i1);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableD = null;
        } else {
            aq aqVarA = aq.a();
            synchronized (aqVarA) {
                drawableD = aqVarA.a.d(context, resourceId, true);
            }
        }
        if (drawableD != null) {
            window.setBackgroundDrawable(drawableD);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.n0 = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f1) != null) {
            return;
        }
        Object obj = this.l0;
        if (onBackInvokedDispatcher != null && (knVar = this.g1) != null) {
            c4.J(onBackInvokedDispatcher, knVar);
            this.g1 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f1 = c4.h(activity);
            } else {
                this.f1 = null;
            }
        } else {
            this.f1 = null;
        }
        I();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View appCompatRatingBar;
        br brVar = this.e1;
        View view2 = null;
        if (brVar == null) {
            int[] iArr = h66.AppCompatTheme;
            Context context2 = this.m0;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(h66.AppCompatTheme_viewInflaterClass);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                brVar = new br();
                this.e1 = brVar;
            } else {
                try {
                    brVar = (br) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                    this.e1 = brVar;
                } catch (Throwable unused) {
                    brVar = new br();
                    this.e1 = brVar;
                }
            }
        }
        brVar.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h66.View, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(h66.View_theme, 0);
        typedArrayObtainStyledAttributes2.recycle();
        Context n51Var = (resourceId == 0 || ((context instanceof n51) && ((n51) context).a == resourceId)) ? context : new n51(context, resourceId);
        str.getClass();
        switch (str) {
            case "RatingBar":
                appCompatRatingBar = new AppCompatRatingBar(n51Var, attributeSet);
                break;
            case "CheckedTextView":
                appCompatRatingBar = new AppCompatCheckedTextView(n51Var, attributeSet);
                break;
            case "MultiAutoCompleteTextView":
                appCompatRatingBar = new AppCompatMultiAutoCompleteTextView(n51Var, attributeSet);
                break;
            case "TextView":
                appCompatRatingBar = brVar.e(n51Var, attributeSet);
                break;
            case "ImageButton":
                appCompatRatingBar = new AppCompatImageButton(n51Var, attributeSet);
                break;
            case "SeekBar":
                appCompatRatingBar = new AppCompatSeekBar(n51Var, attributeSet);
                break;
            case "Spinner":
                appCompatRatingBar = new AppCompatSpinner(n51Var, attributeSet);
                break;
            case "RadioButton":
                appCompatRatingBar = brVar.d(n51Var, attributeSet);
                break;
            case "ToggleButton":
                appCompatRatingBar = new AppCompatToggleButton(n51Var, attributeSet);
                break;
            case "ImageView":
                appCompatRatingBar = new AppCompatImageView(n51Var, attributeSet);
                break;
            case "AutoCompleteTextView":
                appCompatRatingBar = brVar.a(n51Var, attributeSet);
                break;
            case "CheckBox":
                appCompatRatingBar = brVar.c(n51Var, attributeSet);
                break;
            case "EditText":
                appCompatRatingBar = new AppCompatEditText(n51Var, attributeSet);
                break;
            case "Button":
                appCompatRatingBar = brVar.b(n51Var, attributeSet);
                break;
            default:
                appCompatRatingBar = null;
                break;
        }
        if (appCompatRatingBar == null && context != n51Var) {
            Object[] objArr = brVar.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = n51Var;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i = 0;
                    while (true) {
                        String[] strArr = br.g;
                        if (i < 3) {
                            View viewF = brVar.f(n51Var, str, strArr[i]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = brVar.f(n51Var, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused2) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th) {
                objArr[0] = null;
                objArr[1] = null;
                throw th;
            }
            appCompatRatingBar = view2;
        }
        if (appCompatRatingBar != null) {
            Context context3 = appCompatRatingBar.getContext();
            if ((context3 instanceof ContextWrapper) && appCompatRatingBar.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, br.c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    appCompatRatingBar.setOnClickListener(new ar(appCompatRatingBar, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = n51Var.obtainStyledAttributes(attributeSet, br.d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = cw8.a;
                    new qv8(j46.tag_accessibility_heading, Boolean.class, 0, 28, (byte) 3).a(appCompatRatingBar, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = n51Var.obtainStyledAttributes(attributeSet, br.e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    cw8.o(appCompatRatingBar, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = n51Var.obtainStyledAttributes(attributeSet, br.f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = cw8.a;
                    new qv8(j46.tag_screen_reader_focusable, Boolean.class, 0, 28, (byte) 0).a(appCompatRatingBar, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return appCompatRatingBar;
    }

    public final void p(int i, vp vpVar, nt4 nt4Var) {
        if (nt4Var == null) {
            if (vpVar == null && i >= 0) {
                vp[] vpVarArr = this.L0;
                if (i < vpVarArr.length) {
                    vpVar = vpVarArr[i];
                }
            }
            if (vpVar != null) {
                nt4Var = vpVar.h;
            }
        }
        if ((vpVar == null || vpVar.m) && !this.Q0) {
            rp rpVar = this.o0;
            Window.Callback callback = this.n0.getCallback();
            rpVar.getClass();
            try {
                rpVar.g0 = true;
                callback.onPanelClosed(i, nt4Var);
            } finally {
                rpVar.g0 = false;
            }
        }
    }

    public final void q(nt4 nt4Var) {
        a aVar;
        if (this.K0) {
            return;
        }
        this.K0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.s0;
        actionBarOverlayLayout.j();
        ActionMenuView actionMenuView = ((i) actionBarOverlayLayout.j0).a.f0;
        if (actionMenuView != null && (aVar = actionMenuView.y0) != null) {
            aVar.f();
            g5 g5Var = aVar.v0;
            if (g5Var != null && g5Var.b()) {
                g5Var.j.dismiss();
            }
        }
        Window.Callback callback = this.n0.getCallback();
        if (callback != null && !this.Q0) {
            callback.onPanelClosed(108, nt4Var);
        }
        this.K0 = false;
    }

    public final void r(vp vpVar, boolean z) {
        up upVar;
        vd1 vd1Var;
        if (z && vpVar.a == 0 && (vd1Var = this.s0) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) vd1Var;
            actionBarOverlayLayout.j();
            if (((i) actionBarOverlayLayout.j0).a.o()) {
                q(vpVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.m0.getSystemService("window");
        if (windowManager != null && vpVar.m && (upVar = vpVar.e) != null) {
            windowManager.removeView(upVar);
            if (z) {
                p(vpVar.a, vpVar, null);
            }
        }
        vpVar.k = false;
        vpVar.l = false;
        vpVar.m = false;
        vpVar.f = null;
        vpVar.n = true;
        if (this.M0 == vpVar) {
            this.M0 = null;
        }
        if (vpVar.a == 0) {
            I();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x012d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0134 A[RETURN] */
    public final boolean t(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        vp vpVarY;
        vd1 vd1Var;
        boolean z;
        boolean zU;
        boolean zG;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        a aVar;
        vp vpVarY2;
        Object obj = this.l0;
        if ((!(obj instanceof dx3) && !(obj instanceof yp)) || (decorView = this.n0.getDecorView()) == null || !cw8.d(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                rp rpVar = this.o0;
                Window.Callback callback = this.n0.getCallback();
                rpVar.getClass();
                try {
                    rpVar.f0 = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    rpVar.f0 = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.N0 = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    vpVarY2 = y(0);
                                    if (!vpVarY2.m) {
                                        G(vpVarY2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.v0 == null) {
                                    vpVarY = y(0);
                                    vd1Var = this.s0;
                                    Context context = this.m0;
                                    if (vd1Var != null) {
                                        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) vd1Var;
                                        actionBarOverlayLayout.j();
                                        toolbar = ((i) actionBarOverlayLayout.j0).a;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.f0) == null || !actionMenuView.x0 || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z = vpVarY.m;
                                            if (!z || vpVarY.l) {
                                                r(vpVarY, true);
                                                zU = z;
                                            } else {
                                                if (vpVarY.k) {
                                                    if (vpVarY.o) {
                                                        vpVarY.k = false;
                                                        zG = G(vpVarY, keyEvent);
                                                    } else {
                                                        zG = true;
                                                    }
                                                    if (zG) {
                                                        E(vpVarY, keyEvent);
                                                        zU = true;
                                                    }
                                                }
                                                zU = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.s0;
                                            actionBarOverlayLayout2.j();
                                            if (((i) actionBarOverlayLayout2.j0).a.o()) {
                                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.s0;
                                                actionBarOverlayLayout3.j();
                                                ActionMenuView actionMenuView2 = ((i) actionBarOverlayLayout3.j0).a.f0;
                                                if (actionMenuView2 != null && (aVar = actionMenuView2.y0) != null && aVar.f()) {
                                                    zU = true;
                                                }
                                            } else if (!this.Q0 && G(vpVarY, keyEvent)) {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.s0;
                                                actionBarOverlayLayout4.j();
                                                zU = ((i) actionBarOverlayLayout4.j0).a.u();
                                            }
                                            zU = false;
                                        }
                                    } else {
                                        z = vpVarY.m;
                                        if (z) {
                                        }
                                        r(vpVarY, true);
                                        zU = z;
                                    }
                                    if (zU && (audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio")) != null) {
                                        audioManager.playSoundEffect(0);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (C()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    rpVar.f0 = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.N0 = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            vpVarY2 = y(0);
                            if (!vpVarY2.m) {
                                G(vpVarY2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.v0 == null) {
                            vpVarY = y(0);
                            vd1Var = this.s0;
                            Context context2 = this.m0;
                            if (vd1Var != null) {
                                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) vd1Var;
                                actionBarOverlayLayout5.j();
                                toolbar = ((i) actionBarOverlayLayout5.j0).a;
                                if (toolbar.getVisibility() == 0) {
                                    z = vpVarY.m;
                                    if (z) {
                                    }
                                    r(vpVarY, true);
                                    zU = z;
                                } else {
                                    z = vpVarY.m;
                                    if (z) {
                                    }
                                    r(vpVarY, true);
                                    zU = z;
                                }
                            } else {
                                z = vpVarY.m;
                                if (z) {
                                }
                                r(vpVarY, true);
                                zU = z;
                            }
                            if (zU) {
                                audioManager.playSoundEffect(0);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (C()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void u(int i) {
        vp vpVarY = y(i);
        if (vpVarY.h != null) {
            Bundle bundle = new Bundle();
            vpVarY.h.t(bundle);
            if (bundle.size() > 0) {
                vpVarY.p = bundle;
            }
            vpVarY.h.w();
            vpVarY.h.clear();
        }
        vpVarY.o = true;
        vpVarY.n = true;
        if ((i == 108 || i == 0) && this.s0 != null) {
            vp vpVarY2 = y(0);
            vpVarY2.k = false;
            G(vpVarY2, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        if (this.A0) {
            return;
        }
        int[] iArr = h66.AppCompatTheme;
        Context context = this.m0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(h66.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            bt.i("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(h66.AppCompatTheme_windowNoTitle, false)) {
            f(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(h66.AppCompatTheme_windowActionBar, false)) {
            f(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(h66.AppCompatTheme_windowActionBarOverlay, false)) {
            f(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(h66.AppCompatTheme_windowActionModeOverlay, false)) {
            f(10);
        }
        this.I0 = typedArrayObtainStyledAttributes.getBoolean(h66.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        w();
        this.n0.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.J0) {
            viewGroup = this.H0 ? (ViewGroup) layoutInflaterFrom.inflate(u46.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(u46.abc_screen_simple, (ViewGroup) null);
        } else if (this.I0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(u46.abc_dialog_title_material, (ViewGroup) null);
            this.G0 = false;
            this.F0 = false;
        } else if (this.F0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(w26.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new n51(context, typedValue.resourceId) : context).inflate(u46.abc_screen_toolbar, (ViewGroup) null);
            vd1 vd1Var = (vd1) viewGroup.findViewById(d46.decor_content_parent);
            this.s0 = vd1Var;
            vd1Var.setWindowCallback(this.n0.getCallback());
            if (this.G0) {
                ((ActionBarOverlayLayout) this.s0).i(109);
            }
            if (this.D0) {
                ((ActionBarOverlayLayout) this.s0).i(2);
            }
            if (this.E0) {
                ((ActionBarOverlayLayout) this.s0).i(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.F0);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.G0);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.I0);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.H0);
            sb.append(", windowNoTitle: ");
            bt.q(p61.o(sb, this.J0, " }"));
            return;
        }
        op opVar = new op(this);
        WeakHashMap weakHashMap = cw8.a;
        uv8.c(viewGroup, opVar);
        if (this.s0 == null) {
            this.C0 = (TextView) viewGroup.findViewById(d46.title);
        }
        boolean z = cy8.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(d46.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.n0.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.n0.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new pp(this));
        this.B0 = viewGroup;
        Object obj = this.l0;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.r0;
        if (!TextUtils.isEmpty(title)) {
            vd1 vd1Var2 = this.s0;
            if (vd1Var2 != null) {
                vd1Var2.setWindowTitle(title);
            } else {
                u70 u70Var = this.p0;
                if (u70Var != null) {
                    u70Var.n0(title);
                } else {
                    TextView textView = this.C0;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.B0.findViewById(R.id.content);
        View decorView = this.n0.getDecorView();
        contentFrameLayout2.l0.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(h66.AppCompatTheme);
        typedArrayObtainStyledAttributes2.getValue(h66.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(h66.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(h66.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes2.getValue(h66.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(h66.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes2.getValue(h66.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(h66.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes2.getValue(h66.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(h66.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes2.getValue(h66.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.A0 = true;
        vp vpVarY = y(0);
        if (this.Q0 || vpVarY.h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.n0 == null) {
            Object obj = this.l0;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.n0 != null) {
            return;
        }
        bt.i("We have not been given a Window");
    }

    public final v3 x(Context context) {
        sp spVar = this.W0;
        if (spVar == null) {
            zv7 zv7Var = zv7.f0;
            if (zv7Var == null) {
                Context applicationContext = context.getApplicationContext();
                LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
                zv7Var = new zv7();
                zv7Var.Z = new dg();
                zv7Var.X = applicationContext;
                zv7Var.Y = locationManager;
                zv7.f0 = zv7Var;
            }
            spVar = new sp(this, zv7Var);
            this.W0 = spVar;
        }
        return spVar;
    }

    public final vp y(int i) {
        vp[] vpVarArr = this.L0;
        if (vpVarArr == null || vpVarArr.length <= i) {
            vp[] vpVarArr2 = new vp[i + 1];
            if (vpVarArr != null) {
                System.arraycopy(vpVarArr, 0, vpVarArr2, 0, vpVarArr.length);
            }
            this.L0 = vpVarArr2;
            vpVarArr = vpVarArr2;
        }
        vp vpVar = vpVarArr[i];
        if (vpVar != null) {
            return vpVar;
        }
        vp vpVar2 = new vp();
        vpVar2.a = i;
        vpVar2.n = false;
        vpVarArr[i] = vpVar2;
        return vpVar2;
    }

    public final void z() {
        u70 s09Var;
        v();
        if (this.F0 && (s09Var = this.p0) == null) {
            Object obj = this.l0;
            if (obj instanceof Activity) {
                s09Var = new s09((Activity) obj, this.G0);
                this.p0 = s09Var;
            } else if (obj instanceof Dialog) {
                s09Var = new s09((Dialog) obj);
                this.p0 = s09Var;
            }
            if (s09Var != null) {
                s09Var.k0(this.b1);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
