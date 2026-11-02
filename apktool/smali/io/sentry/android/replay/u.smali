.class public final Lio/sentry/android/replay/u;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lio/sentry/android/replay/ReplayIntegration;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/ReplayIntegration;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lio/sentry/android/replay/u;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lio/sentry/android/replay/u;->Y:Lio/sentry/android/replay/ReplayIntegration;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-byte v0, p0, Lio/sentry/android/replay/u;->X:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Lio/sentry/android/replay/u;->Y:Lio/sentry/android/replay/ReplayIntegration;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget v0, Lio/sentry/android/replay/ReplayIntegration;->r0:I

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lio/sentry/android/replay/ReplayIntegration;->Z0(Z)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    sget v0, Lio/sentry/android/replay/ReplayIntegration;->r0:I

    .line 16
    .line 17
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->q0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lio/sentry/android/replay/p;

    .line 24
    .line 25
    iget-object v0, v0, Lio/sentry/android/replay/p;->d:Lio/sentry/android/replay/capture/c;

    .line 26
    .line 27
    instance-of v0, v0, Lio/sentry/android/replay/capture/m;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->Z:Lio/sentry/u0;

    .line 32
    .line 33
    sget-object v2, Lio/sentry/u0;->DISCONNECTED:Lio/sentry/u0;

    .line 34
    .line 35
    if-eq v0, v2, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->g0:Lio/sentry/i1;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    invoke-interface {v0}, Lio/sentry/i1;->d()Ls91;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    sget-object v2, Lio/sentry/p;->All:Lio/sentry/p;

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Ls91;->k(Lio/sentry/p;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-ne v0, v1, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->g0:Lio/sentry/i1;

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    invoke-interface {v0}, Lio/sentry/i1;->d()Ls91;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    sget-object v2, Lio/sentry/p;->Replay:Lio/sentry/p;

    .line 67
    .line 68
    invoke-virtual {v0, v2}, Ls91;->k(Lio/sentry/p;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-ne v0, v1, :cond_2

    .line 73
    .line 74
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->C0()V

    .line 75
    .line 76
    .line 77
    :cond_2
    return-void

    .line 78
    :pswitch_1
    sget v0, Lio/sentry/android/replay/ReplayIntegration;->r0:I

    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    invoke-virtual {p0, v0}, Lio/sentry/android/replay/ReplayIntegration;->Z0(Z)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :pswitch_2
    sget v0, Lio/sentry/android/replay/ReplayIntegration;->r0:I

    .line 86
    .line 87
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->C0()V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
