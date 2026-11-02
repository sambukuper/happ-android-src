.class public final Lmq8;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public final synthetic h0:Lnq8;

.field public i0:Z


# direct methods
.method public constructor <init>(Lq51;Lnq8;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lmq8;->g0:B

    .line 13
    iput-object p2, p0, Lmq8;->h0:Lnq8;

    const/4 p2, 0x2

    invoke-direct {p0, p2, p1}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public constructor <init>(Lq51;Lnq8;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lmq8;->g0:B

    .line 3
    .line 4
    iput-object p2, p0, Lmq8;->h0:Lnq8;

    .line 5
    .line 6
    iput-boolean p3, p0, Lmq8;->i0:Z

    .line 7
    .line 8
    const/4 p2, 0x2

    .line 9
    invoke-direct {p0, p2, p1}, Luy7;-><init>(ILq51;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lmq8;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    check-cast p1, Lb71;

    .line 6
    .line 7
    check-cast p2, Lq51;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lmq8;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lmq8;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lmq8;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lmq8;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lmq8;

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lmq8;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 1

    .line 1
    iget-byte p2, p0, Lmq8;->g0:B

    .line 2
    .line 3
    iget-object v0, p0, Lmq8;->h0:Lnq8;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p2, Lmq8;

    .line 9
    .line 10
    iget-boolean p0, p0, Lmq8;->i0:Z

    .line 11
    .line 12
    invoke-direct {p2, p1, v0, p0}, Lmq8;-><init>(Lq51;Lnq8;Z)V

    .line 13
    .line 14
    .line 15
    return-object p2

    .line 16
    :pswitch_0
    new-instance p0, Lmq8;

    .line 17
    .line 18
    invoke-direct {p0, p1, v0}, Lmq8;-><init>(Lq51;Lnq8;)V

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, Lmq8;->g0:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lmq8;->h0:Lnq8;

    .line 10
    .line 11
    iget-object p1, p1, Lnq8;->h:Lpv;

    .line 12
    .line 13
    invoke-virtual {p1}, Lpv;->b()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const-string p0, "CXCP"

    .line 20
    .line 21
    invoke-static {p0}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object p1, p0, Lmq8;->h0:Lnq8;

    .line 26
    .line 27
    iget-object p1, p1, Lnq8;->a:Ljr8;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljr8;->a()Lqi0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-boolean p0, p0, Lmq8;->i0:Z

    .line 34
    .line 35
    iget-object p1, p1, Lqi0;->g0:Lef0;

    .line 36
    .line 37
    iget-object v0, p1, Lef0;->q:Ljava/lang/Object;

    .line 38
    .line 39
    monitor-enter v0

    .line 40
    :try_start_0
    iput-boolean p0, p1, Lef0;->r:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    monitor-exit v0

    .line 43
    :goto_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 44
    .line 45
    return-object p0

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    monitor-exit v0

    .line 48
    throw p0

    .line 49
    :pswitch_0
    sget-object v0, Lc71;->X:Lc71;

    .line 50
    .line 51
    iget-boolean v1, p0, Lmq8;->i0:Z

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    const/4 v3, 0x1

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    if-ne v1, v3, :cond_1

    .line 58
    .line 59
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_5

    .line 63
    .line 64
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :goto_1
    move-object v0, v2

    .line 70
    goto/16 :goto_6

    .line 71
    .line 72
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    const-string p1, "CXCP"

    .line 76
    .line 77
    invoke-static {p1}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_3

    .line 82
    .line 83
    iget-object p1, p0, Lmq8;->h0:Lnq8;

    .line 84
    .line 85
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    :cond_3
    iget-object p1, p0, Lmq8;->h0:Lnq8;

    .line 89
    .line 90
    iget-object p1, p1, Lnq8;->a:Ljr8;

    .line 91
    .line 92
    iget-object v1, p1, Ljr8;->e:Lvz7;

    .line 93
    .line 94
    invoke-virtual {v1}, Lvz7;->d()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_9

    .line 99
    .line 100
    invoke-virtual {p1}, Ljr8;->a()Lqi0;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    instance-of v1, p1, Ljava/lang/AutoCloseable;

    .line 105
    .line 106
    if-eqz v1, :cond_4

    .line 107
    .line 108
    invoke-virtual {p1}, Lqi0;->close()V

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_4
    instance-of v1, p1, Ljava/util/concurrent/ExecutorService;

    .line 113
    .line 114
    if-eqz v1, :cond_8

    .line 115
    .line 116
    check-cast p1, Ljava/util/concurrent/ExecutorService;

    .line 117
    .line 118
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-ne p1, v1, :cond_5

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_5
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-nez v1, :cond_9

    .line 130
    .line 131
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 132
    .line 133
    .line 134
    const/4 v4, 0x0

    .line 135
    :cond_6
    :goto_2
    if-nez v1, :cond_7

    .line 136
    .line 137
    :try_start_1
    sget-object v5, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 138
    .line 139
    const-wide/16 v6, 0x1

    .line 140
    .line 141
    invoke-interface {p1, v6, v7, v5}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 142
    .line 143
    .line 144
    move-result v1
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 145
    goto :goto_2

    .line 146
    :catch_0
    if-nez v4, :cond_6

    .line 147
    .line 148
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move v4, v3

    .line 152
    goto :goto_2

    .line 153
    :cond_7
    if-eqz v4, :cond_9

    .line 154
    .line 155
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_8
    invoke-static {}, Lkp5;->e()V

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_9
    :goto_3
    iget-object p1, p0, Lmq8;->h0:Lnq8;

    .line 168
    .line 169
    iget-object p1, p1, Lnq8;->i:Lvz7;

    .line 170
    .line 171
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    check-cast p1, Lor8;

    .line 176
    .line 177
    iget-object v1, p1, Lor8;->e:Ljava/lang/Object;

    .line 178
    .line 179
    monitor-enter v1

    .line 180
    :try_start_2
    iget-object v4, p1, Lor8;->i:Lux0;

    .line 181
    .line 182
    if-eqz v4, :cond_a

    .line 183
    .line 184
    invoke-static {}, Lhi5;->m0()Z

    .line 185
    .line 186
    .line 187
    goto :goto_4

    .line 188
    :catchall_1
    move-exception p0

    .line 189
    goto :goto_7

    .line 190
    :cond_a
    iget-object v4, p1, Lor8;->f:Lyg1;

    .line 191
    .line 192
    if-eqz v4, :cond_b

    .line 193
    .line 194
    invoke-virtual {v4, v2}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 195
    .line 196
    .line 197
    :cond_b
    iget-object v4, p1, Lor8;->c:Lc93;

    .line 198
    .line 199
    invoke-interface {v4}, Lc93;->b()V

    .line 200
    .line 201
    .line 202
    iput-object v2, p1, Lor8;->h:Ljava/util/LinkedHashMap;

    .line 203
    .line 204
    new-instance v4, Lux0;

    .line 205
    .line 206
    invoke-direct {v4}, Lux0;-><init>()V

    .line 207
    .line 208
    .line 209
    iput-object v4, p1, Lor8;->i:Lux0;

    .line 210
    .line 211
    invoke-virtual {p1}, Lor8;->e()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 212
    .line 213
    .line 214
    :goto_4
    monitor-exit v1

    .line 215
    iput-boolean v3, p0, Lmq8;->i0:Z

    .line 216
    .line 217
    invoke-virtual {v4, p0}, Lrm3;->h(Lq51;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    if-ne p0, v0, :cond_c

    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_c
    :goto_5
    sget-object v0, Ldn8;->a:Ldn8;

    .line 225
    .line 226
    :goto_6
    return-object v0

    .line 227
    :goto_7
    monitor-exit v1

    .line 228
    throw p0

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
