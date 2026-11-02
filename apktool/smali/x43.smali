.class public final synthetic Lx43;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lx43;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Lx43;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, Lx43;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lx43;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Ljava/lang/Integer;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_0
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ljava/lang/Integer;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_1
    check-cast p0, Lio/sentry/q0;

    .line 22
    .line 23
    :try_start_0
    iget-object v0, p0, Lio/sentry/q0;->e:Lio/sentry/o0;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Ljava/net/InetAddress;->getLocalHost()Ljava/net/InetAddress;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/net/InetAddress;->getCanonicalHostName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lio/sentry/q0;->b:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    iget v0, p0, Lio/sentry/q0;->a:I

    .line 43
    .line 44
    int-to-long v4, v0

    .line 45
    add-long/2addr v2, v4

    .line 46
    iput-wide v2, p0, Lio/sentry/q0;->c:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    iget-object p0, p0, Lio/sentry/q0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 49
    .line 50
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    return-object p0

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    iget-object p0, p0, Lio/sentry/q0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 57
    .line 58
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :pswitch_2
    check-cast p0, Landroid/content/res/AssetFileDescriptor;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_3
    check-cast p0, Lvk1;

    .line 66
    .line 67
    iget-object p0, p0, Lvk1;->Y:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, Landroidx/work/impl/WorkDatabase;

    .line 70
    .line 71
    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->s()Lgs5;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-string v2, "next_job_scheduler_id"

    .line 76
    .line 77
    invoke-virtual {v0, v2}, Lgs5;->a(Ljava/lang/String;)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-eqz v0, :cond_0

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 84
    .line 85
    .line 86
    move-result-wide v3

    .line 87
    long-to-int v0, v3

    .line 88
    goto :goto_0

    .line 89
    :cond_0
    move v0, v1

    .line 90
    :goto_0
    const v3, 0x7fffffff

    .line 91
    .line 92
    .line 93
    if-ne v0, v3, :cond_1

    .line 94
    .line 95
    move v4, v1

    .line 96
    goto :goto_1

    .line 97
    :cond_1
    add-int/lit8 v4, v0, 0x1

    .line 98
    .line 99
    :goto_1
    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->s()Lgs5;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    new-instance v6, Lfs5;

    .line 104
    .line 105
    int-to-long v7, v4

    .line 106
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-direct {v6, v2, v4}, Lfs5;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5, v6}, Lgs5;->b(Lfs5;)V

    .line 114
    .line 115
    .line 116
    if-ltz v0, :cond_2

    .line 117
    .line 118
    if-gt v0, v3, :cond_2

    .line 119
    .line 120
    move v1, v0

    .line 121
    goto :goto_2

    .line 122
    :cond_2
    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->s()Lgs5;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    new-instance v0, Lfs5;

    .line 127
    .line 128
    const-wide/16 v3, 0x1

    .line 129
    .line 130
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-direct {v0, v2, v3}, Lfs5;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v0}, Lgs5;->b(Lfs5;)V

    .line 138
    .line 139
    .line 140
    :goto_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    return-object p0

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
