package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleService;
import defpackage.h37;
import defpackage.i08;
import defpackage.lh4;
import defpackage.os4;
import defpackage.p5;
import defpackage.ra;
import defpackage.x39;
import defpackage.y5;
import defpackage.zo2;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends LifecycleService {
    public static final /* synthetic */ int g0 = 0;
    public boolean Y;
    public i08 Z;
    public NotificationManager f0;

    static {
        lh4.a1("SystemFgService");
    }

    public final void a() {
        this.f0 = (NotificationManager) getApplicationContext().getSystemService("notification");
        i08 i08Var = new i08(getApplicationContext());
        this.Z = i08Var;
        if (i08Var.k0 != null) {
            lh4.P0().getClass();
        } else {
            i08Var.k0 = this;
        }
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.Z.e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = false;
        if (this.Y) {
            lh4.P0().getClass();
            this.Z.e();
            a();
            this.Y = false;
        }
        if (intent == null) {
            return 3;
        }
        i08 i08Var = this.Z;
        i08Var.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            lh4 lh4VarP0 = lh4.P0();
            Objects.toString(intent);
            lh4VarP0.getClass();
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            y5 y5Var = i08Var.Y;
            ((h37) y5Var.Y).execute(new zo2((byte) 15, i08Var, stringExtra, z));
            i08Var.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            i08Var.d(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            lh4.P0().getClass();
            SystemForegroundService systemForegroundService = i08Var.k0;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.Y = true;
            lh4.P0().getClass();
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i2);
            return 3;
        }
        lh4 lh4VarP1 = lh4.P0();
        Objects.toString(intent);
        lh4VarP1.getClass();
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
            return 3;
        }
        x39 x39Var = i08Var.X;
        UUID uuidFromString = UUID.fromString(stringExtra2);
        x39Var.getClass();
        uuidFromString.getClass();
        ra raVar = (ra) x39Var.j0.j0;
        h37 h37Var = (h37) x39Var.l0.Y;
        h37Var.getClass();
        os4.u(raVar, "CancelWorkById", h37Var, new p5(x39Var, uuidFromString, (byte) 16));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.Z.f(i, 2048);
    }

    public final void onTimeout(int i, int i2) {
        this.Z.f(i, i2);
    }
}
