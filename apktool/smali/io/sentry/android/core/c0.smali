.class public final synthetic Lio/sentry/android/core/c0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;

.field public final synthetic Y:J

.field public final synthetic Z:I


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/core/c0;->X:Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;

    .line 5
    .line 6
    iput-wide p2, p0, Lio/sentry/android/core/c0;->Y:J

    .line 7
    .line 8
    iput p4, p0, Lio/sentry/android/core/c0;->Z:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    sget-object v0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->g0:Lio/sentry/n0;

    .line 2
    .line 3
    iget-object v0, p0, Lio/sentry/android/core/c0;->X:Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;

    .line 4
    .line 5
    iget-object v1, v0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->Y:Lio/sentry/i1;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Lio/sentry/g;

    .line 10
    .line 11
    iget-wide v2, p0, Lio/sentry/android/core/c0;->Y:J

    .line 12
    .line 13
    invoke-direct {v1, v2, v3}, Lio/sentry/g;-><init>(J)V

    .line 14
    .line 15
    .line 16
    const-string v2, "system"

    .line 17
    .line 18
    iput-object v2, v1, Lio/sentry/g;->g0:Ljava/lang/String;

    .line 19
    .line 20
    const-string v2, "device.event"

    .line 21
    .line 22
    iput-object v2, v1, Lio/sentry/g;->i0:Ljava/lang/String;

    .line 23
    .line 24
    const-string v2, "Low memory"

    .line 25
    .line 26
    iput-object v2, v1, Lio/sentry/g;->f0:Ljava/lang/String;

    .line 27
    .line 28
    const-string v2, "action"

    .line 29
    .line 30
    const-string v3, "LOW_MEMORY"

    .line 31
    .line 32
    invoke-virtual {v1, v3, v2}, Lio/sentry/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v2, "level"

    .line 36
    .line 37
    iget p0, p0, Lio/sentry/android/core/c0;->Z:I

    .line 38
    .line 39
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {v1, p0, v2}, Lio/sentry/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 47
    .line 48
    iput-object p0, v1, Lio/sentry/g;->k0:Lio/sentry/s5;

    .line 49
    .line 50
    iget-object p0, v0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->Y:Lio/sentry/i1;

    .line 51
    .line 52
    sget-object v0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->g0:Lio/sentry/n0;

    .line 53
    .line 54
    invoke-interface {p0, v1, v0}, Lio/sentry/i1;->a(Lio/sentry/g;Lio/sentry/n0;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    return-void
.end method
