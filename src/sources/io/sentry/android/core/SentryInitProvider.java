package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import defpackage.bt;
import io.sentry.q5;
import io.sentry.s5;
import io.sentry.v4;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class SentryInitProvider extends s0 {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            bt.i("An applicationId is required to fulfill the manifest placeholder.");
        } else {
            super.attachInfo(context, providerInfo);
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        boolean zD;
        v vVar = new v((byte) 3);
        Context context = getContext();
        if (context == null) {
            vVar.h(s5.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return false;
        }
        try {
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) m0.d.a(context) : (ApplicationInfo) m0.e.a(context);
            Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
            zD = bundle != null ? z0.d(bundle, vVar, "io.sentry.auto-init", true) : true;
        } catch (Throwable th) {
            vVar.e(s5.ERROR, "Failed to read auto-init from android manifest metadata.", th);
        }
        if (zD) {
            if (context.getPackageName().endsWith(".test")) {
                try {
                    Iterator<ActivityManager.AppTask> it = ((ActivityManager) context.getSystemService("activity")).getAppTasks().iterator();
                    while (it.hasNext()) {
                        ComponentName component = it.next().getTaskInfo().baseIntent.getComponent();
                        if (component == null || !component.getClassName().equals("androidx.compose.ui.tooling.PreviewActivity")) {
                        }
                    }
                } catch (Throwable unused) {
                }
                s1.b(context, vVar, new io.sentry.c2((byte) 22));
                q5.d().a("AutoInit");
            } else {
                s1.b(context, vVar, new io.sentry.c2((byte) 22));
                q5.d().a("AutoInit");
            }
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        v4.a();
    }
}
