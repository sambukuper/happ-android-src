.class public final Lo76;
.super Lg24;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic Y:B

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lo76;->Y:B

    .line 2
    .line 3
    iput-object p1, p0, Lo76;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lo76;->f0:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lo76;->g0:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lg24;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, Lo76;->Y:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lo76;->g0:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lo76;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v3, Ljava/lang/Boolean;

    .line 13
    .line 14
    check-cast v2, Lio/sentry/android/replay/capture/c;

    .line 15
    .line 16
    iget-object p0, v2, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/l;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    const-string v0, "replay.flushed"

    .line 21
    .line 22
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {p0, v0, v2}, Lio/sentry/android/replay/l;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-object v1

    .line 30
    :pswitch_0
    check-cast v3, Lio/sentry/t6;

    .line 31
    .line 32
    check-cast v2, Lio/sentry/android/replay/capture/c;

    .line 33
    .line 34
    iget-object p0, v2, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/l;

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    const-string v0, "replay.type"

    .line 39
    .line 40
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {p0, v0, v2}, Lio/sentry/android/replay/l;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-object v1

    .line 48
    :pswitch_1
    check-cast v3, Ljava/lang/Integer;

    .line 49
    .line 50
    check-cast v2, Lio/sentry/android/replay/capture/c;

    .line 51
    .line 52
    iget-object p0, v2, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/l;

    .line 53
    .line 54
    if-eqz p0, :cond_2

    .line 55
    .line 56
    const-string v0, "segment.id"

    .line 57
    .line 58
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {p0, v0, v2}, Lio/sentry/android/replay/l;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    return-object v1

    .line 66
    :pswitch_2
    check-cast v3, Lio/sentry/protocol/w;

    .line 67
    .line 68
    check-cast v2, Lio/sentry/android/replay/capture/c;

    .line 69
    .line 70
    iget-object p0, v2, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/l;

    .line 71
    .line 72
    if-eqz p0, :cond_3

    .line 73
    .line 74
    const-string v0, "replay.id"

    .line 75
    .line 76
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {p0, v0, v2}, Lio/sentry/android/replay/l;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    return-object v1

    .line 84
    :pswitch_3
    iget-object p0, p0, Lo76;->Z:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p0, Lto0;

    .line 87
    .line 88
    iget-object p0, p0, Lto0;->b:Lg33;

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    check-cast v3, Lov2;

    .line 94
    .line 95
    invoke-virtual {v3}, Lov2;->a()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v2, Lj7;

    .line 100
    .line 101
    iget-object v1, v2, Lj7;->h:Lu23;

    .line 102
    .line 103
    iget-object v1, v1, Lu23;->d:Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {p0, v0, v1}, Lg33;->j(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
