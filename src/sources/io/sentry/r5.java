package io.sentry;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum r5 implements n2 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ProfileChunk("profile_chunk"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback("feedback"),
    Log("log"),
    TraceMetric("trace_metric"),
    Span("span"),
    Unknown("__unknown__");

    private final String itemType;

    r5(String str) {
        this.itemType = str;
    }

    public static r5 resolve(Object obj) {
        if (obj instanceof j5) {
            return ((io.sentry.protocol.k) ((j5) obj).Y.y(io.sentry.protocol.k.class, "feedback")) == null ? Event : Feedback;
        }
        if (obj instanceof io.sentry.protocol.f0) {
            return Transaction;
        }
        if (obj instanceof d7) {
            return Session;
        }
        return obj instanceof io.sentry.clientreport.b ? ClientReport : Attachment;
    }

    public static r5 valueOfLabel(String str) {
        for (r5 r5Var : values()) {
            if (r5Var.itemType.equals(str)) {
                return r5Var;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.n2
    public void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        ((io.sentry.internal.debugmeta.c) r3Var).y(this.itemType);
    }
}
