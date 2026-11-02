package su.happ.proxyutility.ui;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.tencent.mmkv.MMKV;
import defpackage.an7;
import defpackage.o10;
import defpackage.p56;
import defpackage.pz7;
import defpackage.ss8;
import defpackage.v26;
import defpackage.vp8;
import defpackage.y26;
import defpackage.zr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.foundation.component.HappEditText;
import su.happ.proxyutility.ui.foundation.component.HappTextView;
import su.happ.proxyutility.util.AlertUtil$mMsgReceiver$1;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0007J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lsu/happ/proxyutility/ui/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View;", "rootView", "Ldn8;", "setBarsParams", "(Landroid/view/View;)V", "n10", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public abstract class BaseActivity extends AppCompatActivity {
    public static final /* synthetic */ int P0 = 0;
    public final o8 F0;
    public final vp8 G0;
    public final an7 H0;
    public final vz7 I0;
    public int J0;
    public int K0;
    public zr L0;
    public Locale M0;
    public aj2 N0;
    public final vz7 O0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BaseActivity() {
        ((xd6) ((ComponentActivity) this).f0.Z).D("androidx:appcompat", new fp(this));
        j(new gp(this));
        this.F0 = new o8((byte) 0);
        HappApplication happApplication = HappApplication.M0;
        this.G0 = (vp8) k32.i().Y.getValue();
        this.H0 = (an7) k32.i().X.getValue();
        this.I0 = new vz7(new x((byte) 27));
        this.J0 = -1;
        this.K0 = -1;
        this.O0 = new vz7(new o7(this, (byte) 10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void s(View view, int i) {
        if ((view instanceof TextView) && !(view instanceof HappTextView) && !(view instanceof HappEditText)) {
            TextView textView = (TextView) view;
            textView.setTextSize(d28.f(textView.getTextSize(), textView.getResources().getDisplayMetrics()) + i);
            return;
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i2 = 0;
        while (true) {
            if (!(i2 < viewGroup.getChildCount())) {
                return;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            s(childAt, i);
            i2 = i3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void t(gb4 gb4Var, View view) {
        if (view instanceof ActionMenuView) {
            nt4 nt4Var = ((ActionMenuView) view).u0;
            nt4Var.i();
            ArrayList arrayList = nt4Var.i;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View actionView = ((st4) it.next()).getActionView();
                if (actionView != null) {
                    arrayList2.add(actionView);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                t(gb4Var, (View) it2.next());
            }
            return;
        }
        if (!(view instanceof ViewGroup)) {
            if (view instanceof TextView) {
                return;
            }
            gb4Var.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            t(gb4Var, childAt);
            i = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean w(Resources resources) {
        ss8 ss8Var = ss8.a;
        int i = o10.a[ss8.e().ordinal()];
        if (i == 1) {
            return (resources.getConfiguration().uiMode & 48) == 32;
        }
        if (i != 2) {
            if (i != 3) {
                b61.c();
                return false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: su.happ.proxyutility.ui.BaseActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void attachBaseContext(Context context) {
        ContextWrapper contextWrapper;
        Resources resources;
        Configuration configuration;
        if (context != null) {
            ss8 ss8Var = ss8.a;
            Locale localeN = ss8.n();
            Configuration configuration2 = context.getResources().getConfiguration();
            configuration2.setLocale(localeN);
            LocaleList localeList = new LocaleList(localeN);
            LocaleList.setDefault(localeList);
            configuration2.setLocales(localeList);
            context.createConfigurationContext(configuration2);
            if (pz7.a()) {
                configuration2.uiMode = (configuration2.uiMode & (-16)) | 4;
            }
            contextWrapper = new ContextWrapper(context);
        } else {
            contextWrapper = null;
        }
        super.attachBaseContext(contextWrapper);
        if (contextWrapper == null || (resources = contextWrapper.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return;
        }
        Configuration configuration3 = new Configuration(configuration);
        configuration3.fontScale = 1.0f;
        applyOverrideConfiguration(configuration3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: su.happ.proxyutility.ui.BaseActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int i;
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        u70 u70VarQ = q();
        if (u70VarQ != null) {
            u70VarQ.l0(true);
        }
        Window window = getWindow();
        if (ue3.y(this)) {
            i = 1;
        } else {
            i = Build.VERSION.SDK_INT >= 30 ? 32 : 16;
        }
        window.setSoftInputMode(i);
        ss8 ss8Var = ss8.a;
        this.L0 = ss8.e();
        vz7 vz7Var = this.O0;
        gy1.a(this, (e08) vz7Var.getValue(), (e08) vz7Var.getValue());
        Resources resources = getResources();
        resources.getClass();
        setTheme(w(resources) ? p56.AppThemeDark : p56.AppThemeLight);
        Window window2 = getWindow();
        if (Build.VERSION.SDK_INT >= 29) {
            window2.setNavigationBarContrastEnforced(true);
        } else {
            Context context = window2.getContext();
            context.getClass();
            window2.setNavigationBarColor(os4.q(context, v26.colorNavBarOld));
            window2.setStatusBarColor(getColor(R.color.transparent));
        }
        this.M0 = getResources().getConfiguration().getLocales().get(0);
        HappApplication happApplication = HappApplication.M0;
        if ((k32.i().getApplicationInfo().flags & 2) != 0) {
            c12.e();
            if (((MMKV) ss8.e.getValue()).getString("pref_http_port", (String) null) == null) {
                bt.q("Required value was null.");
                return;
            }
        }
        setRequestedOrientation(!getResources().getBoolean(y26.isTablet) ? 5 : -1);
        if (HappApplication.R0) {
            HappApplication.R0 = false;
            jm4.Q(ys0.z(((androidx.core.app.ComponentActivity) this).X), (u61) null, new r5(this, (q51) null, (byte) 2), 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: su.happ.proxyutility.ui.BaseActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean onCreateOptionsMenu(Menu menu) {
        Context context;
        menu.getClass();
        Toolbar toolbarV = v();
        int i = 0;
        boolean zY = (toolbarV == null || (context = toolbarV.getContext()) == null) ? false : ue3.y(context);
        gb4 gb4VarR = i21.r();
        Toolbar toolbarV2 = v();
        if (toolbarV2 != null) {
            t(gb4VarR, toolbarV2);
        }
        gb4 gb4VarJ = i21.j(gb4VarR);
        o03 o03VarListIterator = gb4VarJ.listIterator(0);
        while (true) {
            o03 o03Var = o03VarListIterator;
            if (!o03Var.hasNext()) {
                return super/*android.app.Activity*/.onCreateOptionsMenu(menu);
            }
            Object next = o03Var.next();
            int i2 = i + 1;
            if (i < 0) {
                i21.X();
                throw null;
            }
            View view = (View) next;
            view.setClickable(true);
            view.setFocusable(true);
            view.setFocusableInTouchMode(zY);
            x97.U(view, new eb9(this, gb4VarJ, i, view));
            i = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: su.happ.proxyutility.ui.BaseActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onPause() {
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
        o8 o8Var = this.F0;
        o8Var.getClass();
        HappApplication happApplication = HappApplication.M0;
        k32.i().unregisterReceiver((AlertUtil$mMsgReceiver$1) o8Var.f0);
        o8Var.Y = false;
        this.G0.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: su.happ.proxyutility.ui.BaseActivity */
    /* JADX WARN: Code duplicated, block: B:17:0x0074  */
    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int i;
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        o8 o8Var = this.F0;
        o8Var.getClass();
        HappApplication happApplication = HappApplication.M0;
        int i2 = 2;
        ue3.I(k32.i(), (AlertUtil$mMsgReceiver$1) o8Var.f0, new IntentFilter("su.happ.proxyutility.action.activity"), 2);
        o8Var.Z = this;
        o8Var.Y = true;
        this.G0.getClass();
        Locale locale = this.M0;
        ss8 ss8Var = ss8.a;
        if (!dh3.f(locale, ss8.n()) || this.L0 != ss8.e()) {
            y();
        }
        int iE = ((MMKV) this.I0.getValue()).e(-1, "pref_font_size");
        aj2.X.getClass();
        aj2 aj2VarG = k32.g(iE);
        aj2 aj2Var = this.N0;
        if (aj2Var == null) {
            i = 0;
        } else {
            int iOrdinal = aj2Var.ordinal();
            if (iOrdinal == 0) {
                i = -2;
            } else if (iOrdinal == 1) {
                i = 0;
            } else {
                if (iOrdinal != 2) {
                    b61.c();
                    return;
                }
                i = 2;
            }
        }
        int i3 = -i;
        int iOrdinal2 = aj2VarG.ordinal();
        if (iOrdinal2 == 0) {
            i2 = -2;
        } else if (iOrdinal2 == 1) {
            i2 = 0;
        } else if (iOrdinal2 != 2) {
            b61.c();
            return;
        }
        this.N0 = aj2VarG;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        s(decorView, i3 + i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setBarsParams(View rootView) {
        rootView.getClass();
        rootView.requestApplyInsets();
        o61 o61Var = new o61(this, (byte) 2);
        WeakHashMap weakHashMap = cw8.a;
        uv8.c(rootView, o61Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: su.happ.proxyutility.ui.BaseActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final int u() {
        if (ViewConfiguration.get(this).hasPermanentMenuKey()) {
            return 0;
        }
        int i = this.K0;
        Integer numValueOf = Integer.valueOf(i);
        if (i <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        Resources resources = getResources();
        String lowerCase = "NAVIGATION".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        int identifier = resources.getIdentifier(lowerCase.concat("_bar_height"), "dimen", "android");
        Integer numValueOf2 = identifier > 0 ? Integer.valueOf(getResources().getDimensionPixelSize(identifier)) : null;
        return numValueOf2 != null ? numValueOf2.intValue() : (int) (38.0f * getResources().getDisplayMetrics().density);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Toolbar v() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean x() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: su.happ.proxyutility.ui.BaseActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void y() {
        Intent intent = getIntent();
        Set setZ = z();
        intent.getClass();
        Iterator it = setZ.iterator();
        while (it.hasNext()) {
            intent.removeExtra((String) it.next());
        }
        finish();
        startActivity(intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Set z() {
        return m02.X;
    }
}
