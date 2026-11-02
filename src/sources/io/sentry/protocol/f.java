package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import io.sentry.s6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements n2 {
    public t X;
    public List Y;
    public HashMap Z;

    public static f a(f fVar, s6 s6Var) {
        DebugImage debugImage;
        ArrayList<DebugImage> arrayList = new ArrayList();
        if (s6Var.getProguardUuid() != null) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.PROGUARD);
            debugImage2.setUuid(s6Var.getProguardUuid());
            arrayList.add(debugImage2);
        }
        for (String str : s6Var.getBundleIds()) {
            DebugImage debugImage3 = new DebugImage();
            debugImage3.setType(DebugImage.JVM);
            debugImage3.setDebugId(str);
            arrayList.add(debugImage3);
        }
        if (fVar == null && arrayList.isEmpty()) {
            return null;
        }
        if (fVar == null) {
            fVar = new f();
        }
        if (!arrayList.isEmpty()) {
            if (fVar.Y == null) {
                fVar.b(new ArrayList());
            }
            List list = fVar.Y;
            if (list != null) {
                for (DebugImage debugImage4 : arrayList) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            list.add(debugImage4);
                            break;
                        }
                        debugImage = (DebugImage) it.next();
                    } while (!(DebugImage.PROGUARD.equals(debugImage4.getType()) ? DebugImage.PROGUARD.equals(debugImage.getType()) : DebugImage.JVM.equals(debugImage4.getType()) && DebugImage.JVM.equals(debugImage.getType()) && debugImage4.getDebugId() != null && debugImage4.getDebugId().equals(debugImage.getDebugId())));
                }
            }
        }
        return fVar;
    }

    public final void b(List list) {
        this.Y = list != null ? new ArrayList(list) : null;
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        if (this.X != null) {
            cVar.p("sdk_info");
            cVar.v(iLogger, this.X);
        }
        if (this.Y != null) {
            cVar.p("images");
            cVar.v(iLogger, this.Y);
        }
        HashMap map = this.Z;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.Z, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}
