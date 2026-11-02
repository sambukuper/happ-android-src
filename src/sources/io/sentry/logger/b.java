package io.sentry.logger;

import defpackage.wg;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.d;
import io.sentry.l5;
import io.sentry.s5;
import io.sentry.transport.p;
import io.sentry.u5;
import io.sentry.v5;
import io.sentry.y5;
import io.sentry.z5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public final /* synthetic */ byte X;
    public final SentryAndroidOptions Y;
    public final wg Z;
    public final ConcurrentLinkedQueue f0;
    public final l5 g0;
    public final d h0;

    public b(SentryAndroidOptions sentryAndroidOptions, wg wgVar, byte b) {
        this.X = b;
        switch (b) {
            case 1:
                new AtomicBoolean(false);
                this.h0 = new d((byte) 11);
                this.Y = sentryAndroidOptions;
                this.Z = wgVar;
                this.f0 = new ConcurrentLinkedQueue();
                this.g0 = new l5(sentryAndroidOptions);
                break;
            default:
                l5 l5Var = new l5(sentryAndroidOptions);
                new AtomicBoolean(false);
                this.h0 = new d((byte) 11);
                this.Y = sentryAndroidOptions;
                this.Z = wgVar;
                this.f0 = new ConcurrentLinkedQueue();
                this.g0 = l5Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069 A[LOOP:2: B:23:0x0063->B:25:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cd A[LOOP:5: B:46:0x00c7->B:48:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x007d A[SYNTHETIC] */
    public void a(boolean z) {
        int i;
        int i2;
        byte b = this.X;
        d dVar = this.h0;
        wg wgVar = this.Z;
        SentryAndroidOptions sentryAndroidOptions = this.Y;
        l5 l5Var = this.g0;
        byte b2 = 0;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f0;
        switch (b) {
            case 0:
                l5Var.a(sentryAndroidOptions.getShutdownTimeoutMillis());
                while (!concurrentLinkedQueue.isEmpty()) {
                    ArrayList arrayList = new ArrayList(100);
                    do {
                        u5 u5Var = (u5) concurrentLinkedQueue.poll();
                        if (u5Var != null) {
                            arrayList.add(u5Var);
                        }
                        if (!concurrentLinkedQueue.isEmpty()) {
                        }
                        if (!arrayList.isEmpty()) {
                            try {
                                wgVar.x(wgVar.m(new v5(arrayList, b2)), null);
                            } catch (IOException e) {
                                ((SentryAndroidOptions) wgVar.b).getLogger().d(s5.WARNING, e, "Capturing logs failed.", new Object[0]);
                            }
                            for (i = 0; i < arrayList.size(); i++) {
                                p pVar = (p) dVar.Y;
                                int i3 = p.X;
                                pVar.releaseShared(1);
                            }
                            break;
                        }
                    } while (arrayList.size() < 100);
                    if (!arrayList.isEmpty()) {
                        wgVar.x(wgVar.m(new v5(arrayList, b2)), null);
                        while (i < arrayList.size()) {
                            p pVar2 = (p) dVar.Y;
                            int i4 = p.X;
                            pVar2.releaseShared(1);
                        }
                    }
                }
                break;
            default:
                l5Var.a(sentryAndroidOptions.getShutdownTimeoutMillis());
                while (!concurrentLinkedQueue.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax);
                    do {
                        y5 y5Var = (y5) concurrentLinkedQueue.poll();
                        if (y5Var != null) {
                            arrayList2.add(y5Var);
                        }
                        if (!concurrentLinkedQueue.isEmpty()) {
                        }
                        if (!arrayList2.isEmpty()) {
                            try {
                                wgVar.x(wgVar.n(new z5(arrayList2)), null);
                            } catch (IOException e2) {
                                ((SentryAndroidOptions) wgVar.b).getLogger().d(s5.WARNING, e2, "Capturing metrics failed.", new Object[0]);
                            }
                            for (i2 = 0; i2 < arrayList2.size(); i2++) {
                                p pVar3 = (p) dVar.Y;
                                int i5 = p.X;
                                pVar3.releaseShared(1);
                            }
                            break;
                        }
                    } while (arrayList2.size() < 1000);
                    if (!arrayList2.isEmpty()) {
                        wgVar.x(wgVar.n(new z5(arrayList2)), null);
                        while (i2 < arrayList2.size()) {
                            p pVar4 = (p) dVar.Y;
                            int i6 = p.X;
                            pVar4.releaseShared(1);
                        }
                    }
                }
                break;
        }
    }
}
