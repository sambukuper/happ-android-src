.class public final Lio/sentry/android/replay/s;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lio/sentry/android/replay/ReplayIntegration;

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/ReplayIntegration;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lio/sentry/android/replay/s;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lio/sentry/android/replay/s;->Y:Lio/sentry/android/replay/ReplayIntegration;

    .line 4
    .line 5
    iput-object p2, p0, Lio/sentry/android/replay/s;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget-byte v0, p0, Lio/sentry/android/replay/s;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/android/replay/s;->Y:Lio/sentry/android/replay/ReplayIntegration;

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/android/replay/s;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, Ls91;

    .line 11
    .line 12
    iget-object p0, v1, Lio/sentry/android/replay/ReplayIntegration;->q0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lio/sentry/android/replay/p;

    .line 19
    .line 20
    iget-object p0, p0, Lio/sentry/android/replay/p;->d:Lio/sentry/android/replay/capture/c;

    .line 21
    .line 22
    instance-of p0, p0, Lio/sentry/android/replay/capture/m;

    .line 23
    .line 24
    if-nez p0, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    sget-object p0, Lio/sentry/p;->All:Lio/sentry/p;

    .line 28
    .line 29
    invoke-virtual {v2, p0}, Ls91;->k(Lio/sentry/p;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-nez p0, :cond_2

    .line 34
    .line 35
    sget-object p0, Lio/sentry/p;->Replay:Lio/sentry/p;

    .line 36
    .line 37
    invoke-virtual {v2, p0}, Ls91;->k(Lio/sentry/p;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v1}, Lio/sentry/android/replay/ReplayIntegration;->H0()V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    :goto_0
    invoke-virtual {v1}, Lio/sentry/android/replay/ReplayIntegration;->C0()V

    .line 49
    .line 50
    .line 51
    :goto_1
    return-void

    .line 52
    :pswitch_0
    check-cast v2, Lio/sentry/u0;

    .line 53
    .line 54
    iput-object v2, v1, Lio/sentry/android/replay/ReplayIntegration;->Z:Lio/sentry/u0;

    .line 55
    .line 56
    iget-object p0, v1, Lio/sentry/android/replay/ReplayIntegration;->q0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Lio/sentry/android/replay/p;

    .line 63
    .line 64
    iget-object p0, p0, Lio/sentry/android/replay/p;->d:Lio/sentry/android/replay/capture/c;

    .line 65
    .line 66
    instance-of p0, p0, Lio/sentry/android/replay/capture/m;

    .line 67
    .line 68
    if-nez p0, :cond_3

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    sget-object p0, Lio/sentry/u0;->DISCONNECTED:Lio/sentry/u0;

    .line 72
    .line 73
    if-ne v2, p0, :cond_4

    .line 74
    .line 75
    invoke-virtual {v1}, Lio/sentry/android/replay/ReplayIntegration;->C0()V

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    invoke-virtual {v1}, Lio/sentry/android/replay/ReplayIntegration;->H0()V

    .line 80
    .line 81
    .line 82
    :goto_2
    return-void

    .line 83
    :pswitch_1
    check-cast v2, Lio/sentry/android/replay/p;

    .line 84
    .line 85
    iget-wide v5, v2, Lio/sentry/android/replay/p;->a:J

    .line 86
    .line 87
    iget-object v7, v2, Lio/sentry/android/replay/p;->c:Lio/sentry/protocol/w;

    .line 88
    .line 89
    sget v0, Lio/sentry/android/replay/ReplayIntegration;->r0:I

    .line 90
    .line 91
    iget-object v4, p0, Lio/sentry/android/replay/s;->Y:Lio/sentry/android/replay/ReplayIntegration;

    .line 92
    .line 93
    iget-object p0, v4, Lio/sentry/android/replay/ReplayIntegration;->q0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Lio/sentry/android/replay/p;

    .line 100
    .line 101
    iget-object v1, v0, Lio/sentry/android/replay/p;->d:Lio/sentry/android/replay/capture/c;

    .line 102
    .line 103
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Lio/sentry/android/replay/p;->b()Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    const/4 v9, 0x0

    .line 111
    const/4 v10, 0x0

    .line 112
    if-eqz v2, :cond_7

    .line 113
    .line 114
    iget-wide v2, v0, Lio/sentry/android/replay/p;->a:J

    .line 115
    .line 116
    cmp-long v2, v2, v5

    .line 117
    .line 118
    if-nez v2, :cond_7

    .line 119
    .line 120
    iget-object v2, v0, Lio/sentry/android/replay/p;->c:Lio/sentry/protocol/w;

    .line 121
    .line 122
    invoke-static {v2, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-eqz v2, :cond_7

    .line 127
    .line 128
    if-nez v1, :cond_5

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_5
    new-instance v8, Lea6;

    .line 132
    .line 133
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 134
    .line 135
    .line 136
    iput-object v1, v8, Lea6;->X:Ljava/lang/Object;

    .line 137
    .line 138
    new-instance v3, Lio/sentry/android/replay/r;

    .line 139
    .line 140
    invoke-direct/range {v3 .. v8}, Lio/sentry/android/replay/r;-><init>(Lio/sentry/android/replay/ReplayIntegration;JLio/sentry/protocol/w;Lea6;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v3, v10}, Lio/sentry/android/replay/capture/c;->a(Lgn2;Z)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Lio/sentry/android/replay/capture/c;->b()Lio/sentry/android/replay/capture/c;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    iput-object v1, v8, Lea6;->X:Ljava/lang/Object;

    .line 151
    .line 152
    invoke-virtual {v1}, Lio/sentry/android/replay/capture/c;->d()Lio/sentry/protocol/w;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    if-nez v1, :cond_6

    .line 157
    .line 158
    sget-object v1, Lio/sentry/protocol/w;->Y:Lio/sentry/protocol/w;

    .line 159
    .line 160
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    iget-object v2, v8, Lea6;->X:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v2, Lio/sentry/android/replay/capture/c;

    .line 166
    .line 167
    const/4 v3, 0x3

    .line 168
    invoke-static {v0, v9, v1, v2, v3}, Lio/sentry/android/replay/p;->a(Lio/sentry/android/replay/p;Lio/sentry/android/replay/y;Lio/sentry/protocol/w;Lio/sentry/android/replay/capture/c;I)Lio/sentry/android/replay/p;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_7
    :goto_3
    iget-object p0, v4, Lio/sentry/android/replay/ReplayIntegration;->g0:Lio/sentry/i1;

    .line 177
    .line 178
    if-eqz p0, :cond_8

    .line 179
    .line 180
    new-instance v0, Lj78;

    .line 181
    .line 182
    const/16 v1, 0x15

    .line 183
    .line 184
    invoke-direct {v0, v7, v1}, Lj78;-><init>(Ljava/lang/Object;B)V

    .line 185
    .line 186
    .line 187
    invoke-interface {p0, v0}, Lio/sentry/i1;->o(Lio/sentry/l4;)V

    .line 188
    .line 189
    .line 190
    :cond_8
    iget-object p0, v4, Lio/sentry/android/replay/ReplayIntegration;->f0:Lio/sentry/android/core/SentryAndroidOptions;

    .line 191
    .line 192
    if-eqz p0, :cond_9

    .line 193
    .line 194
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    sget-object v0, Lio/sentry/s5;->INFO:Lio/sentry/s5;

    .line 199
    .line 200
    const-string v1, "Replay was stopped or restarted before capture could run, not capturing replay"

    .line 201
    .line 202
    new-array v2, v10, [Ljava/lang/Object;

    .line 203
    .line 204
    invoke-interface {p0, v0, v1, v2}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    :goto_4
    return-void

    .line 208
    :cond_9
    const-string p0, "options"

    .line 209
    .line 210
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw v9

    .line 214
    nop

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
