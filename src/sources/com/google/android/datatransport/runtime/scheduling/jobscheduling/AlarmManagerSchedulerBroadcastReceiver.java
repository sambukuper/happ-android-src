package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import defpackage.fc4;
import defpackage.hu5;
import defpackage.jl1;
import defpackage.lr;
import defpackage.qz;
import defpackage.v7;
import defpackage.we8;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        we8.b(context);
        lr lrVarA = qz.a();
        lrVarA.z(queryParameter);
        lrVarA.f0 = hu5.b(iIntValue);
        if (queryParameter2 != null) {
            lrVarA.Z = Base64.decode(queryParameter2, 0);
        }
        jl1 jl1Var = we8.a().d;
        ((Executor) jl1Var.g0).execute(new fc4(jl1Var, lrVarA.e(), i, new v7((byte) 0)));
    }
}
