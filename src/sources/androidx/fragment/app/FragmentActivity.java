package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import defpackage.bt;
import defpackage.d41;
import defpackage.ex8;
import defpackage.g94;
import defpackage.gm2;
import defpackage.hy0;
import defpackage.iy0;
import defpackage.ml2;
import defpackage.n71;
import defpackage.n84;
import defpackage.o84;
import defpackage.qk2;
import defpackage.tk2;
import defpackage.ue7;
import defpackage.vk1;
import defpackage.xc4;
import defpackage.xd6;
import defpackage.yb6;
import defpackage.yr6;
import defpackage.zu3;
import io.sentry.c2;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity {
    public static final /* synthetic */ int D0 = 0;
    public boolean A0;
    public boolean B0;
    public final vk1 y0;
    public final g94 z0 = new g94(this, true);
    public boolean C0 = true;

    public FragmentActivity() {
        final AppCompatActivity appCompatActivity = (AppCompatActivity) this;
        this.y0 = new vk1((Object) new tk2(appCompatActivity), (byte) 9);
        final byte b = 1;
        ((xd6) this.f0.Z).D("android:support:lifecycle", new hy0(appCompatActivity, (byte) 2));
        final byte b2 = 0;
        this.l0.add(new d41() { // from class: sk2
            @Override // defpackage.d41
            public final void accept(Object obj) {
                byte b3 = b2;
                AppCompatActivity appCompatActivity2 = appCompatActivity;
                switch (b3) {
                    case 0:
                        int i = FragmentActivity.D0;
                        appCompatActivity2.y0.E();
                        break;
                    default:
                        int i2 = FragmentActivity.D0;
                        appCompatActivity2.y0.E();
                        break;
                }
            }
        });
        this.n0.add(new d41() { // from class: sk2
            @Override // defpackage.d41
            public final void accept(Object obj) {
                byte b3 = b;
                AppCompatActivity appCompatActivity2 = appCompatActivity;
                switch (b3) {
                    case 0:
                        int i = FragmentActivity.D0;
                        appCompatActivity2.y0.E();
                        break;
                    default:
                        int i2 = FragmentActivity.D0;
                        appCompatActivity2.y0.E();
                        break;
                }
            }
        });
        j(new iy0(appCompatActivity, b));
    }

    public static boolean o(ml2 ml2Var) {
        boolean zO = false;
        for (qk2 qk2Var : ml2Var.c.G()) {
            if (qk2Var != null) {
                tk2 tk2Var = qk2Var.w0;
                if ((tk2Var == null ? null : tk2Var.F0) != null) {
                    zO |= o(qk2Var.j());
                }
                gm2 gm2Var = qk2Var.U0;
                o84 o84Var = o84.Z;
                o84 o84Var2 = o84.f0;
                if (gm2Var != null) {
                    gm2Var.g();
                    if (gm2Var.g0.i.compareTo(o84Var2) >= 0) {
                        g94 g94Var = qk2Var.U0.g0;
                        g94Var.c("setCurrentState");
                        g94Var.e(o84Var);
                        zO = true;
                    }
                }
                if (qk2Var.S0.i.compareTo(o84Var2) >= 0) {
                    g94 g94Var2 = qk2Var.S0;
                    g94Var2.c("setCurrentState");
                    g94Var2.e(o84Var);
                    zO = true;
                }
            }
        }
        return zO;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.A0);
        printWriter.print(" mResumed=");
        printWriter.print(this.B0);
        printWriter.print(" mStopped=");
        printWriter.print(this.C0);
        if (getApplication() != null) {
            ex8 ex8VarE = e();
            ex8VarE.getClass();
            n71 n71Var = n71.b;
            n71Var.getClass();
            yr6 yr6Var = new yr6(ex8VarE, xc4.c, n71Var);
            zu3 zu3VarB = yb6.a.b(xc4.class);
            String strP = zu3VarB.p();
            if (strP == null) {
                bt.q("Local and anonymous classes can not be ViewModels");
                return;
            }
            ue7 ue7Var = ((xc4) yr6Var.g(zu3VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strP))).b;
            if (ue7Var.Z > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (ue7Var.Z > 0) {
                    if (ue7Var.e(0) != null) {
                        c2.m();
                        return;
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(ue7Var.c(0));
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((tk2) this.y0.Y).E0.w(str, fileDescriptor, printWriter, strArr);
    }

    public final ml2 n() {
        return ((tk2) this.y0.Y).E0;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.y0.E();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.z0.d(n84.ON_CREATE);
        ml2 ml2Var = ((tk2) this.y0.Y).E0;
        ml2Var.H = false;
        ml2Var.I = false;
        ml2Var.O.g = false;
        ml2Var.v(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((tk2) this.y0.Y).E0.f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((tk2) this.y0.Y).E0.m();
        this.z0.d(n84.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((tk2) this.y0.Y).E0.k();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.B0 = false;
        ml2 ml2Var = ((tk2) this.y0.Y).E0;
        if (ml2Var.h != null) {
            ml2Var.d();
        }
        ml2Var.v(5);
        this.z0.d(n84.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.z0.d(n84.ON_RESUME);
        ml2 ml2Var = ((tk2) this.y0.Y).E0;
        ml2Var.H = false;
        ml2Var.I = false;
        ml2Var.O.g = false;
        ml2Var.v(7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.y0.E();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        vk1 vk1Var = this.y0;
        vk1Var.E();
        super.onResume();
        this.B0 = true;
        ((tk2) vk1Var.Y).E0.A(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        vk1 vk1Var = this.y0;
        vk1Var.E();
        tk2 tk2Var = (tk2) vk1Var.Y;
        super.onStart();
        this.C0 = false;
        if (!this.A0) {
            this.A0 = true;
            ml2 ml2Var = tk2Var.E0;
            ml2Var.H = false;
            ml2Var.I = false;
            ml2Var.O.g = false;
            ml2Var.v(4);
        }
        tk2Var.E0.A(true);
        this.z0.d(n84.ON_START);
        ml2 ml2Var2 = tk2Var.E0;
        ml2Var2.H = false;
        ml2Var2.I = false;
        ml2Var2.O.g = false;
        ml2Var2.v(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.y0.E();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.C0 = true;
        while (o(n())) {
        }
        ml2 ml2Var = ((tk2) this.y0.Y).E0;
        ml2Var.I = true;
        ml2Var.O.g = true;
        ml2Var.v(4);
        this.z0.d(n84.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((tk2) this.y0.Y).E0.f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }
}
