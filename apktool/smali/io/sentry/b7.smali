.class public final Lio/sentry/b7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lio/sentry/s1;


# instance fields
.field public final a:Lio/sentry/protocol/w;

.field public final b:Lio/sentry/e7;

.field public final c:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final d:Lio/sentry/o4;

.field public final e:Ljava/lang/String;

.field public f:Lio/sentry/a7;

.field public volatile g:Ljava/util/concurrent/Future;

.field public volatile h:Ljava/util/concurrent/Future;

.field public volatile i:Z

.field public final j:Lio/sentry/util/a;

.field public final k:Lio/sentry/util/a;

.field public final l:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final m:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final n:Lio/sentry/protocol/h0;

.field public final o:Lio/sentry/x1;

.field public final p:Lio/sentry/protocol/e;

.field public final q:Lio/sentry/o;

.field public final r:Lio/sentry/o7;


# direct methods
.method public constructor <init>(Lio/sentry/n7;Lio/sentry/o4;Lio/sentry/o7;Lio/sentry/o;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/protocol/w;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/b7;->a:Lio/sentry/protocol/w;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lio/sentry/b7;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    sget-object v0, Lio/sentry/a7;->c:Lio/sentry/a7;

    .line 19
    .line 20
    iput-object v0, p0, Lio/sentry/b7;->f:Lio/sentry/a7;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Lio/sentry/b7;->i:Z

    .line 24
    .line 25
    new-instance v1, Lio/sentry/util/a;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lio/sentry/b7;->j:Lio/sentry/util/a;

    .line 31
    .line 32
    new-instance v2, Lio/sentry/util/a;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v2, p0, Lio/sentry/b7;->k:Lio/sentry/util/a;

    .line 38
    .line 39
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    .line 41
    invoke-direct {v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 42
    .line 43
    .line 44
    iput-object v2, p0, Lio/sentry/b7;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 45
    .line 46
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 47
    .line 48
    invoke-direct {v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 49
    .line 50
    .line 51
    iput-object v2, p0, Lio/sentry/b7;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 52
    .line 53
    new-instance v3, Lio/sentry/protocol/e;

    .line 54
    .line 55
    invoke-direct {v3}, Lio/sentry/protocol/e;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v3, p0, Lio/sentry/b7;->p:Lio/sentry/protocol/e;

    .line 59
    .line 60
    new-instance v4, Lio/sentry/e7;

    .line 61
    .line 62
    invoke-direct {v4, p1, p0, p2, p3}, Lio/sentry/e7;-><init>(Lio/sentry/n7;Lio/sentry/b7;Lio/sentry/o4;Lio/sentry/o7;)V

    .line 63
    .line 64
    .line 65
    iput-object v4, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 66
    .line 67
    iget-object v5, p1, Lio/sentry/n7;->r0:Ljava/lang/String;

    .line 68
    .line 69
    iput-object v5, p0, Lio/sentry/b7;->e:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v5, p1, Lio/sentry/f7;->n0:Lio/sentry/x1;

    .line 72
    .line 73
    iput-object v5, p0, Lio/sentry/b7;->o:Lio/sentry/x1;

    .line 74
    .line 75
    iput-object p2, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 76
    .line 77
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {p0}, Lio/sentry/b7;->C()Ljava/lang/Boolean;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-virtual {v5, v6}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    const/4 v7, 0x0

    .line 88
    if-eqz v6, :cond_0

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    move-object p4, v7

    .line 92
    :goto_0
    iput-object p4, p0, Lio/sentry/b7;->q:Lio/sentry/o;

    .line 93
    .line 94
    iget-object p1, p1, Lio/sentry/n7;->s0:Lio/sentry/protocol/h0;

    .line 95
    .line 96
    iput-object p1, p0, Lio/sentry/b7;->n:Lio/sentry/protocol/h0;

    .line 97
    .line 98
    iput-object p3, p0, Lio/sentry/b7;->r:Lio/sentry/o7;

    .line 99
    .line 100
    invoke-virtual {p0, v4}, Lio/sentry/b7;->D(Lio/sentry/e7;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lio/sentry/b7;->A()Lio/sentry/protocol/w;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    sget-object v4, Lio/sentry/protocol/w;->Y:Lio/sentry/protocol/w;

    .line 108
    .line 109
    invoke-virtual {p1, v4}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-nez v4, :cond_1

    .line 114
    .line 115
    invoke-virtual {p0}, Lio/sentry/b7;->C()Ljava/lang/Boolean;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v5, v4}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_1

    .line 124
    .line 125
    new-instance v4, Lio/sentry/x3;

    .line 126
    .line 127
    invoke-direct {v4, p1}, Lio/sentry/x3;-><init>(Lio/sentry/protocol/w;)V

    .line 128
    .line 129
    .line 130
    const-string p1, "profile"

    .line 131
    .line 132
    invoke-virtual {v3, v4, p1}, Lio/sentry/protocol/e;->l(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    :cond_1
    if-eqz p4, :cond_2

    .line 136
    .line 137
    invoke-interface {p4, p0}, Lio/sentry/o;->e(Lio/sentry/b7;)V

    .line 138
    .line 139
    .line 140
    :cond_2
    iget-object p1, p3, Lio/sentry/o7;->g:Ljava/lang/Long;

    .line 141
    .line 142
    if-nez p1, :cond_4

    .line 143
    .line 144
    iget-object p1, p3, Lio/sentry/o7;->h:Ljava/lang/Long;

    .line 145
    .line 146
    if-eqz p1, :cond_3

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_3
    return-void

    .line 150
    :cond_4
    :goto_1
    const/4 p1, 0x1

    .line 151
    iput-boolean p1, p0, Lio/sentry/b7;->i:Z

    .line 152
    .line 153
    iget-object p3, p3, Lio/sentry/o7;->h:Ljava/lang/Long;

    .line 154
    .line 155
    if-eqz p3, :cond_8

    .line 156
    .line 157
    invoke-virtual {v1}, Lio/sentry/util/a;->g()V

    .line 158
    .line 159
    .line 160
    :try_start_0
    iget-boolean p4, p0, Lio/sentry/b7;->i:Z

    .line 161
    .line 162
    if-eqz p4, :cond_7

    .line 163
    .line 164
    invoke-virtual {p0}, Lio/sentry/b7;->x()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 168
    .line 169
    .line 170
    :try_start_1
    invoke-virtual {p2}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    invoke-virtual {p2}, Lio/sentry/s6;->getTimerExecutorService()Lio/sentry/m1;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    new-instance p4, Lio/sentry/z6;

    .line 179
    .line 180
    invoke-direct {p4, p0, p1}, Lio/sentry/z6;-><init>(Lio/sentry/b7;B)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    .line 184
    .line 185
    .line 186
    move-result-wide v2

    .line 187
    invoke-interface {p2, p4, v2, v3}, Lio/sentry/m1;->b(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    iput-object p2, p0, Lio/sentry/b7;->h:Ljava/util/concurrent/Future;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :catchall_0
    move-exception p2

    .line 195
    :try_start_2
    iget-object p3, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 196
    .line 197
    invoke-virtual {p3}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 198
    .line 199
    .line 200
    move-result-object p3

    .line 201
    invoke-virtual {p3}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 202
    .line 203
    .line 204
    move-result-object p3

    .line 205
    sget-object p4, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 206
    .line 207
    const-string v2, "Failed to schedule finish timer"

    .line 208
    .line 209
    invoke-interface {p3, p4, v2, p2}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0}, Lio/sentry/b7;->t()Lio/sentry/j7;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    if-eqz p2, :cond_5

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_5
    sget-object p2, Lio/sentry/j7;->DEADLINE_EXCEEDED:Lio/sentry/j7;

    .line 220
    .line 221
    :goto_2
    iget-object p3, p0, Lio/sentry/b7;->r:Lio/sentry/o7;

    .line 222
    .line 223
    iget-object p3, p3, Lio/sentry/o7;->g:Ljava/lang/Long;

    .line 224
    .line 225
    if-eqz p3, :cond_6

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_6
    move p1, v0

    .line 229
    :goto_3
    invoke-virtual {p0, p2, p1, v7}, Lio/sentry/b7;->f(Lio/sentry/j7;ZLio/sentry/n0;)V

    .line 230
    .line 231
    .line 232
    iget-object p1, p0, Lio/sentry/b7;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 233
    .line 234
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 235
    .line 236
    .line 237
    goto :goto_4

    .line 238
    :catchall_1
    move-exception p0

    .line 239
    goto :goto_5

    .line 240
    :cond_7
    :goto_4
    invoke-virtual {v1}, Lio/sentry/util/a;->close()V

    .line 241
    .line 242
    .line 243
    goto :goto_7

    .line 244
    :goto_5
    :try_start_3
    invoke-virtual {v1}, Lio/sentry/util/a;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 245
    .line 246
    .line 247
    goto :goto_6

    .line 248
    :catchall_2
    move-exception p1

    .line 249
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 250
    .line 251
    .line 252
    :goto_6
    throw p0

    .line 253
    :cond_8
    :goto_7
    invoke-virtual {p0}, Lio/sentry/b7;->q()V

    .line 254
    .line 255
    .line 256
    return-void
.end method

.method public static B(Lio/sentry/x0;Lio/sentry/e7;Lio/sentry/a5;)Z
    .locals 2

    .line 1
    const-string v0, "profiler_id"

    .line 2
    .line 3
    iget-object v1, p1, Lio/sentry/e7;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Ljava/lang/String;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    :try_start_0
    new-instance v1, Lio/sentry/protocol/w;

    .line 15
    .line 16
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Lio/sentry/protocol/w;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, Lio/sentry/e7;->b:Lio/sentry/a5;

    .line 22
    .line 23
    iget-object p1, p1, Lio/sentry/e7;->a:Lio/sentry/a5;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    move-object p2, v0

    .line 28
    :cond_1
    invoke-interface {p0, v1, p1, p2}, Lio/sentry/x0;->a(Lio/sentry/protocol/w;Lio/sentry/a5;Lio/sentry/a5;)Lio/sentry/profiling/c;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    sget-object p1, Lio/sentry/profiling/c;->NOT_RECORDED:Lio/sentry/profiling/c;

    .line 33
    .line 34
    if-ne p0, p1, :cond_2

    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :catch_0
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 39
    return p0
.end method


# virtual methods
.method public final A()Lio/sentry/protocol/w;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 2
    .line 3
    iget-object v1, v0, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 4
    .line 5
    iget-object v1, v1, Lio/sentry/f7;->q0:Lio/sentry/protocol/w;

    .line 6
    .line 7
    sget-object v2, Lio/sentry/protocol/w;->Y:Lio/sentry/protocol/w;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-object p0, v0, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 16
    .line 17
    iget-object p0, p0, Lio/sentry/f7;->q0:Lio/sentry/protocol/w;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    iget-object p0, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 21
    .line 22
    invoke-virtual {p0}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Lio/sentry/s6;->getContinuousProfiler()Lio/sentry/x0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-interface {p0}, Lio/sentry/x0;->e()Lio/sentry/protocol/w;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final C()Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 4
    .line 5
    iget-object p0, p0, Lio/sentry/f7;->f0:Lio/sentry/b4;

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    iget-object p0, p0, Lio/sentry/b4;->a:Ljava/io/Serializable;

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Boolean;

    .line 14
    .line 15
    return-object p0
.end method

.method public final D(Lio/sentry/e7;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/sentry/s6;->getThreadChecker()Lio/sentry/util/thread/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Lio/sentry/b7;->A()Lio/sentry/protocol/w;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v1, Lio/sentry/protocol/w;->Y:Lio/sentry/protocol/w;

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    iget-object v2, p1, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 26
    .line 27
    iget-object v2, v2, Lio/sentry/f7;->f0:Lio/sentry/b4;

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v2, v2, Lio/sentry/b4;->a:Ljava/io/Serializable;

    .line 34
    .line 35
    check-cast v2, Ljava/lang/Boolean;

    .line 36
    .line 37
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    const-string v1, "profiler_id"

    .line 44
    .line 45
    invoke-virtual {p0}, Lio/sentry/protocol/w;->a()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p1, p0, v1}, Lio/sentry/e7;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-interface {v0}, Lio/sentry/util/thread/a;->b()J

    .line 53
    .line 54
    .line 55
    move-result-wide v1

    .line 56
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const-string v1, "thread.id"

    .line 61
    .line 62
    invoke-virtual {p1, p0, v1}, Lio/sentry/e7;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const-string p0, "thread.name"

    .line 66
    .line 67
    invoke-interface {v0}, Lio/sentry/util/thread/a;->a()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p1, v0, p0}, Lio/sentry/e7;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final E(Lio/sentry/c;)V
    .locals 13

    .line 1
    iget-object v1, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 2
    .line 3
    iget-object v2, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 4
    .line 5
    iget-object v3, p0, Lio/sentry/b7;->k:Lio/sentry/util/a;

    .line 6
    .line 7
    invoke-virtual {v3}, Lio/sentry/util/a;->g()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget-boolean v0, p1, Lio/sentry/c;->f:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    new-instance v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 15
    .line 16
    invoke-direct {v4}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Lio/sentry/o4;->isEnabled()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v5, 0x0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget-object v6, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 35
    .line 36
    const-string v7, "Instance is disabled and this \'configureScope\' call is a no-op."

    .line 37
    .line 38
    new-array v8, v5, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-interface {v0, v6, v7, v8}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    :try_start_1
    iget-object v0, v2, Lio/sentry/o4;->f:Lio/sentry/n;

    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    invoke-virtual {v0, v6}, Lio/sentry/n;->d(Lio/sentry/n4;)Lio/sentry/g1;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-interface {v0}, Lio/sentry/g1;->g()Lio/sentry/protocol/w;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v4, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    :try_start_2
    invoke-virtual {v2}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-virtual {v6}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    sget-object v7, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 69
    .line 70
    const-string v8, "Error in the \'configureScope\' callback."

    .line 71
    .line 72
    invoke-interface {v6, v7, v8, v0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    :goto_0
    iget-object v0, v1, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 76
    .line 77
    iget-object v7, v0, Lio/sentry/f7;->X:Lio/sentry/protocol/w;

    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    move-object v8, v0

    .line 84
    check-cast v8, Lio/sentry/protocol/w;

    .line 85
    .line 86
    invoke-virtual {v2}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    iget-object v0, v1, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 91
    .line 92
    iget-object v10, v0, Lio/sentry/f7;->f0:Lio/sentry/b4;

    .line 93
    .line 94
    iget-object v11, p0, Lio/sentry/b7;->e:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v12, p0, Lio/sentry/b7;->n:Lio/sentry/protocol/h0;

    .line 97
    .line 98
    move-object v6, p1

    .line 99
    invoke-virtual/range {v6 .. v12}, Lio/sentry/c;->e(Lio/sentry/protocol/w;Lio/sentry/protocol/w;Lio/sentry/s6;Lio/sentry/b4;Ljava/lang/String;Lio/sentry/protocol/h0;)V

    .line 100
    .line 101
    .line 102
    iput-boolean v5, v6, Lio/sentry/c;->f:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :catchall_1
    move-exception v0

    .line 106
    move-object p0, v0

    .line 107
    goto :goto_2

    .line 108
    :cond_1
    :goto_1
    invoke-virtual {v3}, Lio/sentry/util/a;->close()V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :goto_2
    :try_start_3
    invoke-virtual {v3}, Lio/sentry/util/a;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :catchall_2
    move-exception v0

    .line 117
    move-object p1, v0

    .line 118
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    :goto_3
    throw p0
.end method

.method public final a()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 4
    .line 5
    iget-object p0, p0, Lio/sentry/f7;->h0:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0
.end method

.method public final b()Lio/sentry/l7;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/sentry/s6;->isTraceSampling()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 14
    .line 15
    iget-object v0, v0, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 16
    .line 17
    iget-object v0, v0, Lio/sentry/f7;->o0:Lio/sentry/c;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lio/sentry/b7;->E(Lio/sentry/c;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lio/sentry/c;->f()Lio/sentry/l7;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method

.method public final c()Lio/sentry/y6;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/sentry/e7;->c()Lio/sentry/y6;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final d(Ljava/lang/String;Lio/sentry/a5;Lio/sentry/x1;)Lio/sentry/q1;
    .locals 6

    .line 1
    new-instance v5, Lio/sentry/i7;

    .line 2
    .line 3
    invoke-direct {v5}, Lio/sentry/i7;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "activity.load"

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    move-object v2, p1

    .line 10
    move-object v3, p2

    .line 11
    move-object v4, p3

    .line 12
    invoke-virtual/range {v0 .. v5}, Lio/sentry/b7;->n(Ljava/lang/String;Ljava/lang/String;Lio/sentry/a5;Lio/sentry/x1;Lio/sentry/i7;)Lio/sentry/q1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final e()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 2
    .line 3
    iget-boolean p0, p0, Lio/sentry/e7;->f:Z

    .line 4
    .line 5
    return p0
.end method

.method public final f(Lio/sentry/j7;ZLio/sentry/n0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 2
    .line 3
    iget-boolean v0, v0, Lio/sentry/e7;->f:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 9
    .line 10
    invoke-virtual {v0}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lio/sentry/s6;->getDateProvider()Lio/sentry/b5;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Lio/sentry/b5;->a()Lio/sentry/a5;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 23
    .line 24
    iget-object v2, p0, Lio/sentry/b7;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :goto_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lio/sentry/e7;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    iput-object v3, v2, Lio/sentry/e7;->i:Lio/sentry/g7;

    .line 51
    .line 52
    invoke-virtual {v2, p1, v0}, Lio/sentry/e7;->v(Lio/sentry/j7;Lio/sentry/a5;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {p0, p1, v0, p2, p3}, Lio/sentry/b7;->z(Lio/sentry/j7;Lio/sentry/a5;ZLio/sentry/n0;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final g(Ljava/lang/Number;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lio/sentry/e7;->g(Ljava/lang/Number;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/b7;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(Lio/sentry/j7;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lio/sentry/b7;->v(Lio/sentry/j7;Lio/sentry/a5;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final i()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lio/sentry/b7;->t()Lio/sentry/j7;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v0, v1}, Lio/sentry/b7;->v(Lio/sentry/j7;Lio/sentry/a5;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 2
    .line 3
    iget-boolean v1, v0, Lio/sentry/e7;->f:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 18
    .line 19
    const-string v0, "The transaction is already finished. Data %s cannot be set"

    .line 20
    .line 21
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-interface {p0, p1, v0, p2}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-virtual {v0, p1, p2}, Lio/sentry/e7;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final k()Lio/sentry/d;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "%20"

    .line 4
    .line 5
    const-string v2, "\\+"

    .line 6
    .line 7
    const-string v3, "UTF-8"

    .line 8
    .line 9
    iget-object v4, v0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 10
    .line 11
    invoke-virtual {v4}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {v4}, Lio/sentry/s6;->isTraceSampling()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const/4 v5, 0x0

    .line 20
    if-eqz v4, :cond_a

    .line 21
    .line 22
    iget-object v4, v0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 23
    .line 24
    iget-object v4, v4, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 25
    .line 26
    iget-object v4, v4, Lio/sentry/f7;->o0:Lio/sentry/c;

    .line 27
    .line 28
    if-eqz v4, :cond_a

    .line 29
    .line 30
    iget-object v6, v4, Lio/sentry/c;->h:Lio/sentry/ILogger;

    .line 31
    .line 32
    invoke-virtual {v0, v4}, Lio/sentry/b7;->E(Lio/sentry/c;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    invoke-static {v6, v5, v0}, Lio/sentry/c;->a(Lio/sentry/ILogger;Ljava/lang/String;Z)Lio/sentry/c;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    iget-object v7, v7, Lio/sentry/c;->e:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v8, v4, Lio/sentry/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 43
    .line 44
    new-instance v9, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v11, ","

    .line 50
    .line 51
    if-eqz v7, :cond_2

    .line 52
    .line 53
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v12

    .line 57
    if-nez v12, :cond_2

    .line 58
    .line 59
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    sget-object v12, Lio/sentry/util/q;->a:Ljava/nio/charset/Charset;

    .line 63
    .line 64
    const/4 v12, 0x0

    .line 65
    const/4 v13, 0x0

    .line 66
    :goto_0
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v14

    .line 70
    if-ge v12, v14, :cond_1

    .line 71
    .line 72
    invoke-virtual {v7, v12}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result v14

    .line 76
    const/16 v15, 0x2c

    .line 77
    .line 78
    if-ne v14, v15, :cond_0

    .line 79
    .line 80
    add-int/lit8 v13, v13, 0x1

    .line 81
    .line 82
    :cond_0
    add-int/lit8 v12, v12, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    add-int/2addr v13, v0

    .line 86
    move-object v0, v11

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    const-string v0, ""

    .line 89
    .line 90
    const/4 v13, 0x0

    .line 91
    :goto_1
    iget-object v7, v4, Lio/sentry/c;->b:Lio/sentry/util/a;

    .line 92
    .line 93
    invoke-virtual {v7}, Lio/sentry/util/a;->g()V

    .line 94
    .line 95
    .line 96
    :try_start_0
    new-instance v12, Ljava/util/TreeSet;

    .line 97
    .line 98
    invoke-virtual {v8}, Ljava/util/concurrent/ConcurrentHashMap;->keys()Ljava/util/Enumeration;

    .line 99
    .line 100
    .line 101
    move-result-object v14

    .line 102
    invoke-static {v14}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 103
    .line 104
    .line 105
    move-result-object v14

    .line 106
    invoke-direct {v12, v14}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 107
    .line 108
    .line 109
    invoke-virtual {v7}, Lio/sentry/util/a;->close()V

    .line 110
    .line 111
    .line 112
    const-string v7, "sentry-sample_rate"

    .line 113
    .line 114
    invoke-virtual {v12, v7}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    const-string v14, "sentry-sample_rand"

    .line 118
    .line 119
    invoke-virtual {v12, v14}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v12

    .line 126
    move v15, v13

    .line 127
    move-object v13, v0

    .line 128
    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_8

    .line 133
    .line 134
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    move-object/from16 v16, v5

    .line 139
    .line 140
    move-object v5, v0

    .line 141
    check-cast v5, Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eqz v0, :cond_3

    .line 148
    .line 149
    iget-object v0, v4, Lio/sentry/c;->c:Ljava/lang/Double;

    .line 150
    .line 151
    invoke-static {v0}, Lio/sentry/c;->c(Ljava/lang/Double;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    :goto_3
    move-object v10, v0

    .line 156
    goto :goto_4

    .line 157
    :cond_3
    invoke-virtual {v14, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_4

    .line 162
    .line 163
    iget-object v0, v4, Lio/sentry/c;->d:Ljava/lang/Double;

    .line 164
    .line 165
    invoke-static {v0}, Lio/sentry/c;->c(Ljava/lang/Double;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    goto :goto_3

    .line 170
    :cond_4
    invoke-virtual {v8, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, Ljava/lang/String;

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :goto_4
    if-eqz v10, :cond_5

    .line 178
    .line 179
    const/16 v0, 0x40

    .line 180
    .line 181
    if-lt v15, v0, :cond_6

    .line 182
    .line 183
    sget-object v10, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 184
    .line 185
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    filled-new-array {v5, v0}, [Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    const-string v5, "Not adding baggage value %s as the total number of list members would exceed the maximum of %s."

    .line 194
    .line 195
    invoke-interface {v6, v10, v5, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_5
    move-object/from16 v18, v1

    .line 199
    .line 200
    move-object/from16 v17, v4

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_6
    :try_start_1
    invoke-static {v5, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 211
    move-object/from16 v17, v4

    .line 212
    .line 213
    :try_start_2
    invoke-static {v10, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-virtual {v4, v2, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 221
    move-object/from16 v18, v1

    .line 222
    .line 223
    :try_start_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    const-string v0, "="

    .line 235
    .line 236
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    add-int/2addr v4, v1

    .line 255
    const/16 v1, 0x2000

    .line 256
    .line 257
    if-le v4, v1, :cond_7

    .line 258
    .line 259
    sget-object v0, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 260
    .line 261
    const-string v4, "Not adding baggage value %s as the total header value length would exceed the maximum of %s."

    .line 262
    .line 263
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    filled-new-array {v5, v1}, [Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-interface {v6, v0, v4, v1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    goto :goto_6

    .line 275
    :catchall_0
    move-exception v0

    .line 276
    goto :goto_5

    .line 277
    :cond_7
    add-int/lit8 v15, v15, 0x1

    .line 278
    .line 279
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 280
    .line 281
    .line 282
    move-object v13, v11

    .line 283
    goto :goto_6

    .line 284
    :catchall_1
    move-exception v0

    .line 285
    move-object/from16 v18, v1

    .line 286
    .line 287
    goto :goto_5

    .line 288
    :catchall_2
    move-exception v0

    .line 289
    move-object/from16 v18, v1

    .line 290
    .line 291
    move-object/from16 v17, v4

    .line 292
    .line 293
    :goto_5
    sget-object v1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 294
    .line 295
    const-string v4, "Unable to encode baggage key value pair (key=%s,value=%s)."

    .line 296
    .line 297
    filled-new-array {v5, v10}, [Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    invoke-interface {v6, v1, v0, v4, v5}, Lio/sentry/ILogger;->d(Lio/sentry/s5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    :goto_6
    move-object/from16 v5, v16

    .line 305
    .line 306
    move-object/from16 v4, v17

    .line 307
    .line 308
    move-object/from16 v1, v18

    .line 309
    .line 310
    goto/16 :goto_2

    .line 311
    .line 312
    :cond_8
    move-object/from16 v16, v5

    .line 313
    .line 314
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    if-eqz v1, :cond_9

    .line 323
    .line 324
    move-object/from16 v5, v16

    .line 325
    .line 326
    goto :goto_7

    .line 327
    :cond_9
    new-instance v5, Lio/sentry/d;

    .line 328
    .line 329
    const/4 v1, 0x0

    .line 330
    invoke-direct {v5, v0, v1}, Lio/sentry/d;-><init>(Ljava/lang/Object;B)V

    .line 331
    .line 332
    .line 333
    :goto_7
    return-object v5

    .line 334
    :catchall_3
    move-exception v0

    .line 335
    move-object v1, v0

    .line 336
    :try_start_4
    invoke-virtual {v7}, Lio/sentry/util/a;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 337
    .line 338
    .line 339
    goto :goto_8

    .line 340
    :catchall_4
    move-exception v0

    .line 341
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 342
    .line 343
    .line 344
    :goto_8
    throw v1

    .line 345
    :cond_a
    move-object/from16 v16, v5

    .line 346
    .line 347
    return-object v16
.end method

.method public final l()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/o4;->isEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object v0, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    new-array v1, v1, [Ljava/lang/Object;

    .line 21
    .line 22
    const-string v2, "Instance is disabled and this \'configureScope\' call is a no-op."

    .line 23
    .line 24
    invoke-interface {p0, v0, v2, v1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    :try_start_0
    iget-object v1, v0, Lio/sentry/o4;->f:Lio/sentry/n;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-virtual {v1, v2}, Lio/sentry/n;->d(Lio/sentry/n4;)Lio/sentry/g1;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1, p0}, Lio/sentry/g1;->F(Lio/sentry/s1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    invoke-virtual {v0}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sget-object v1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 49
    .line 50
    const-string v2, "Error in the \'configureScope\' callback."

    .line 51
    .line 52
    invoke-interface {v0, v1, v2, p0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    return-void
.end method

.method public final m()Lio/sentry/q1;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/b7;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :cond_0
    invoke-interface {p0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lio/sentry/e7;

    .line 27
    .line 28
    iget-boolean v1, v0, Lio/sentry/e7;->f:Z

    .line 29
    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public final n(Ljava/lang/String;Ljava/lang/String;Lio/sentry/a5;Lio/sentry/x1;Lio/sentry/i7;)Lio/sentry/q1;
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 2
    .line 3
    iget-boolean v0, v0, Lio/sentry/e7;->f:Z

    .line 4
    .line 5
    sget-object v1, Lio/sentry/l3;->a:Lio/sentry/l3;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lio/sentry/b7;->o:Lio/sentry/x1;

    .line 11
    .line 12
    invoke-virtual {v0, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    :goto_0
    return-object v1

    .line 19
    :cond_1
    iget-object v0, p0, Lio/sentry/b7;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget-object v2, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 26
    .line 27
    invoke-virtual {v2}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, Lio/sentry/s6;->getMaxSpans()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-ge v0, v3, :cond_2

    .line 36
    .line 37
    iget-object p0, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 38
    .line 39
    invoke-virtual/range {p0 .. p5}, Lio/sentry/e7;->n(Ljava/lang/String;Ljava/lang/String;Lio/sentry/a5;Lio/sentry/x1;Lio/sentry/i7;)Lio/sentry/q1;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_2
    invoke-virtual {v2}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    sget-object p3, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 53
    .line 54
    const-string p4, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan."

    .line 55
    .line 56
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-interface {p0, p3, p4, p1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    return-object v1
.end method

.method public final o(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 2
    .line 3
    iget-boolean v1, v0, Lio/sentry/e7;->f:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object v0, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 18
    .line 19
    const-string v1, "The transaction is already finished. Description %s cannot be set"

    .line 20
    .line 21
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {p0, v0, v1, p1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object p0, v0, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 30
    .line 31
    iput-object p1, p0, Lio/sentry/f7;->h0:Ljava/lang/String;

    .line 32
    .line 33
    return-void
.end method

.method public final p()Lio/sentry/protocol/w;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/b7;->a:Lio/sentry/protocol/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public final q()V
    .locals 7

    .line 1
    iget-object v0, p0, Lio/sentry/b7;->j:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->g()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-boolean v1, p0, Lio/sentry/b7;->i:Z

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lio/sentry/b7;->r:Lio/sentry/o7;

    .line 11
    .line 12
    iget-object v1, v1, Lio/sentry/o7;->g:Ljava/lang/Long;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lio/sentry/b7;->y()V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lio/sentry/b7;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 23
    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    :try_start_1
    iget-object v3, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 27
    .line 28
    invoke-virtual {v3}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v3}, Lio/sentry/s6;->getTimerExecutorService()Lio/sentry/m1;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    new-instance v4, Lio/sentry/z6;

    .line 37
    .line 38
    invoke-direct {v4, p0, v2}, Lio/sentry/z6;-><init>(Lio/sentry/b7;B)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 42
    .line 43
    .line 44
    move-result-wide v5

    .line 45
    invoke-interface {v3, v4, v5, v6}, Lio/sentry/m1;->b(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iput-object v1, p0, Lio/sentry/b7;->g:Ljava/util/concurrent/Future;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    move-exception v1

    .line 53
    :try_start_2
    iget-object v3, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 54
    .line 55
    invoke-virtual {v3}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    sget-object v4, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 64
    .line 65
    const-string v5, "Failed to schedule finish timer"

    .line 66
    .line 67
    invoke-interface {v3, v4, v5, v1}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lio/sentry/b7;->t()Lio/sentry/j7;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    if-eqz v1, :cond_0

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    sget-object v1, Lio/sentry/j7;->OK:Lio/sentry/j7;

    .line 78
    .line 79
    :goto_0
    const/4 v3, 0x0

    .line 80
    invoke-virtual {p0, v1, v3}, Lio/sentry/b7;->v(Lio/sentry/j7;Lio/sentry/a5;)V

    .line 81
    .line 82
    .line 83
    iget-object p0, p0, Lio/sentry/b7;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 84
    .line 85
    invoke-virtual {p0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :catchall_1
    move-exception p0

    .line 90
    goto :goto_2

    .line 91
    :cond_1
    :goto_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :goto_2
    :try_start_3
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :catchall_2
    move-exception v0

    .line 100
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    :goto_3
    throw p0
.end method

.method public final r(Ljava/lang/String;Ljava/lang/Long;Lio/sentry/s2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lio/sentry/e7;->r(Ljava/lang/String;Ljava/lang/Long;Lio/sentry/s2;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final s()Lio/sentry/f7;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 4
    .line 5
    return-object p0
.end method

.method public final t()Lio/sentry/j7;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 4
    .line 5
    iget-object p0, p0, Lio/sentry/f7;->i0:Lio/sentry/j7;

    .line 6
    .line 7
    return-object p0
.end method

.method public final u()Lio/sentry/a5;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/e7;->b:Lio/sentry/a5;

    .line 4
    .line 5
    return-object p0
.end method

.method public final v(Lio/sentry/j7;Lio/sentry/a5;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, p1, p2, v0, v1}, Lio/sentry/b7;->z(Lio/sentry/j7;Lio/sentry/a5;ZLio/sentry/n0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final w()Lio/sentry/a5;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/e7;->a:Lio/sentry/a5;

    .line 4
    .line 5
    return-object p0
.end method

.method public final x()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/b7;->j:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->g()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, Lio/sentry/b7;->h:Ljava/util/concurrent/Future;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lio/sentry/b7;->h:Ljava/util/concurrent/Future;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lio/sentry/b7;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput-object v1, p0, Lio/sentry/b7;->h:Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :catchall_1
    move-exception v0

    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    :goto_2
    throw p0
.end method

.method public final y()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/b7;->j:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->g()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, Lio/sentry/b7;->g:Ljava/util/concurrent/Future;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lio/sentry/b7;->g:Ljava/util/concurrent/Future;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lio/sentry/b7;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput-object v1, p0, Lio/sentry/b7;->g:Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :catchall_1
    move-exception v0

    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    :goto_2
    throw p0
.end method

.method public final z(Lio/sentry/j7;Lio/sentry/a5;ZLio/sentry/n0;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 2
    .line 3
    iget-object v0, v0, Lio/sentry/e7;->b:Lio/sentry/a5;

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object p2, v0

    .line 9
    :goto_0
    if-nez p2, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 12
    .line 13
    invoke-virtual {p2}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p2}, Lio/sentry/s6;->getDateProvider()Lio/sentry/b5;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-interface {p2}, Lio/sentry/b5;->a()Lio/sentry/a5;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    :cond_1
    iget-object v0, p0, Lio/sentry/b7;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lio/sentry/e7;

    .line 42
    .line 43
    iget-object v1, v1, Lio/sentry/e7;->h:Lio/sentry/i7;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    new-instance v0, Lio/sentry/a7;

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-direct {v0, v1, p1}, Lio/sentry/a7;-><init>(ZLio/sentry/j7;)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lio/sentry/b7;->f:Lio/sentry/a7;

    .line 53
    .line 54
    iget-object p1, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 55
    .line 56
    iget-boolean p1, p1, Lio/sentry/e7;->f:Z

    .line 57
    .line 58
    if-nez p1, :cond_11

    .line 59
    .line 60
    iget-object p1, p0, Lio/sentry/b7;->r:Lio/sentry/o7;

    .line 61
    .line 62
    iget-boolean p1, p1, Lio/sentry/o7;->f:Z

    .line 63
    .line 64
    if-eqz p1, :cond_4

    .line 65
    .line 66
    iget-object p1, p0, Lio/sentry/b7;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->listIterator()Ljava/util/ListIterator;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :cond_3
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Lio/sentry/e7;

    .line 83
    .line 84
    iget-boolean v1, v0, Lio/sentry/e7;->f:Z

    .line 85
    .line 86
    if-nez v1, :cond_3

    .line 87
    .line 88
    iget-object v0, v0, Lio/sentry/e7;->b:Lio/sentry/a5;

    .line 89
    .line 90
    if-nez v0, :cond_3

    .line 91
    .line 92
    return-void

    .line 93
    :cond_4
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 94
    .line 95
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 99
    .line 100
    iget-object v1, v0, Lio/sentry/e7;->i:Lio/sentry/g7;

    .line 101
    .line 102
    new-instance v2, Lmf1;

    .line 103
    .line 104
    const/16 v3, 0xa

    .line 105
    .line 106
    invoke-direct {v2, p0, v1, p1, v3}, Lmf1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 107
    .line 108
    .line 109
    iput-object v2, v0, Lio/sentry/e7;->i:Lio/sentry/g7;

    .line 110
    .line 111
    iget-object v1, p0, Lio/sentry/b7;->f:Lio/sentry/a7;

    .line 112
    .line 113
    iget-object v1, v1, Lio/sentry/a7;->b:Lio/sentry/j7;

    .line 114
    .line 115
    invoke-virtual {v0, v1, p2}, Lio/sentry/e7;->v(Lio/sentry/j7;Lio/sentry/a5;)V

    .line 116
    .line 117
    .line 118
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-virtual {p0}, Lio/sentry/b7;->C()Ljava/lang/Boolean;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    const/4 v2, 0x0

    .line 129
    if-eqz v1, :cond_6

    .line 130
    .line 131
    iget-object v1, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 132
    .line 133
    iget-object v1, v1, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 134
    .line 135
    iget-object v1, v1, Lio/sentry/f7;->f0:Lio/sentry/b4;

    .line 136
    .line 137
    if-nez v1, :cond_5

    .line 138
    .line 139
    move-object v1, v2

    .line 140
    goto :goto_2

    .line 141
    :cond_5
    iget-object v1, v1, Lio/sentry/b4;->d:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v1, Ljava/lang/Boolean;

    .line 144
    .line 145
    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_6

    .line 150
    .line 151
    iget-object v0, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 152
    .line 153
    invoke-virtual {v0}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Lio/sentry/s6;->getTransactionProfiler()Lio/sentry/t1;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    check-cast v1, Ljava/util/List;

    .line 166
    .line 167
    iget-object v3, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 168
    .line 169
    invoke-virtual {v3}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-interface {v0, p0, v1, v3}, Lio/sentry/t1;->b(Lio/sentry/b7;Ljava/util/List;Lio/sentry/s6;)Lio/sentry/z3;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    goto :goto_3

    .line 178
    :cond_6
    move-object v0, v2

    .line 179
    :goto_3
    iget-object v1, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 180
    .line 181
    invoke-virtual {v1}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {v1}, Lio/sentry/s6;->isContinuousProfilingEnabled()Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-eqz v1, :cond_7

    .line 190
    .line 191
    iget-object v1, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 192
    .line 193
    invoke-virtual {v1}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-virtual {v1}, Lio/sentry/s6;->getProfileLifecycle()Lio/sentry/y3;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    sget-object v3, Lio/sentry/y3;->TRACE:Lio/sentry/y3;

    .line 202
    .line 203
    if-ne v1, v3, :cond_7

    .line 204
    .line 205
    iget-object v1, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 206
    .line 207
    iget-object v1, v1, Lio/sentry/e7;->c:Lio/sentry/f7;

    .line 208
    .line 209
    iget-object v1, v1, Lio/sentry/f7;->q0:Lio/sentry/protocol/w;

    .line 210
    .line 211
    sget-object v4, Lio/sentry/protocol/w;->Y:Lio/sentry/protocol/w;

    .line 212
    .line 213
    invoke-virtual {v1, v4}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    if-eqz v1, :cond_7

    .line 218
    .line 219
    iget-object v1, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 220
    .line 221
    invoke-virtual {v1}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {v1}, Lio/sentry/s6;->getContinuousProfiler()Lio/sentry/x0;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-interface {v1, v3}, Lio/sentry/x0;->b(Lio/sentry/y3;)V

    .line 230
    .line 231
    .line 232
    :cond_7
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    if-eqz v1, :cond_8

    .line 237
    .line 238
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    check-cast p1, Ljava/util/List;

    .line 243
    .line 244
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 245
    .line 246
    .line 247
    :cond_8
    iget-object p1, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 248
    .line 249
    invoke-virtual {p1}, Lio/sentry/o4;->isEnabled()Z

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    const/4 v3, 0x0

    .line 254
    if-nez v1, :cond_9

    .line 255
    .line 256
    invoke-virtual {p1}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-virtual {p1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    sget-object v1, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 265
    .line 266
    const-string v4, "Instance is disabled and this \'configureScope\' call is a no-op."

    .line 267
    .line 268
    new-array v5, v3, [Ljava/lang/Object;

    .line 269
    .line 270
    invoke-interface {p1, v1, v4, v5}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_9
    :try_start_0
    iget-object v1, p1, Lio/sentry/o4;->f:Lio/sentry/n;

    .line 275
    .line 276
    invoke-virtual {v1, v2}, Lio/sentry/n;->d(Lio/sentry/n4;)Lio/sentry/g1;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    new-instance v4, Ljn0;

    .line 281
    .line 282
    const/16 v5, 0x13

    .line 283
    .line 284
    invoke-direct {v4, p0, v1, v5}, Ljn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 285
    .line 286
    .line 287
    invoke-interface {v1, v4}, Lio/sentry/g1;->D(Lio/sentry/i4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 288
    .line 289
    .line 290
    goto :goto_4

    .line 291
    :catchall_0
    move-exception v1

    .line 292
    invoke-virtual {p1}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    invoke-virtual {p1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    sget-object v4, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 301
    .line 302
    const-string v5, "Error in the \'configureScope\' callback."

    .line 303
    .line 304
    invoke-interface {p1, v4, v5, v1}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 305
    .line 306
    .line 307
    :goto_4
    iget-object p1, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 308
    .line 309
    iget-object v1, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 310
    .line 311
    invoke-virtual {v1}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    invoke-virtual {v4}, Lio/sentry/s6;->getContinuousProfiler()Lio/sentry/x0;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    instance-of v5, v4, Lio/sentry/x2;

    .line 320
    .line 321
    if-eqz v5, :cond_a

    .line 322
    .line 323
    goto :goto_6

    .line 324
    :cond_a
    invoke-static {v4, p1, p2}, Lio/sentry/b7;->B(Lio/sentry/x0;Lio/sentry/e7;Lio/sentry/a5;)Z

    .line 325
    .line 326
    .line 327
    move-result v5

    .line 328
    const-string v6, "profiler_id"

    .line 329
    .line 330
    if-eqz v5, :cond_b

    .line 331
    .line 332
    invoke-virtual {p1, v2, v6}, Lio/sentry/e7;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    iget-object p1, p0, Lio/sentry/b7;->p:Lio/sentry/protocol/e;

    .line 336
    .line 337
    const-string v5, "profile"

    .line 338
    .line 339
    invoke-virtual {p1, v5}, Lio/sentry/protocol/e;->n(Ljava/lang/String;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v1}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    invoke-virtual {p1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    sget-object v1, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 351
    .line 352
    const-string v5, "No profile was recorded for transaction, dropping its profiler id."

    .line 353
    .line 354
    new-array v7, v3, [Ljava/lang/Object;

    .line 355
    .line 356
    invoke-interface {p1, v1, v5, v7}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    :cond_b
    iget-object p1, p0, Lio/sentry/b7;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 360
    .line 361
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    :cond_c
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 366
    .line 367
    .line 368
    move-result v1

    .line 369
    if-eqz v1, :cond_d

    .line 370
    .line 371
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    check-cast v1, Lio/sentry/e7;

    .line 376
    .line 377
    invoke-static {v4, v1, p2}, Lio/sentry/b7;->B(Lio/sentry/x0;Lio/sentry/e7;Lio/sentry/a5;)Z

    .line 378
    .line 379
    .line 380
    move-result v5

    .line 381
    if-eqz v5, :cond_c

    .line 382
    .line 383
    invoke-virtual {v1, v2, v6}, Lio/sentry/e7;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    goto :goto_5

    .line 387
    :cond_d
    :goto_6
    new-instance p1, Lio/sentry/protocol/f0;

    .line 388
    .line 389
    invoke-direct {p1, p0}, Lio/sentry/protocol/f0;-><init>(Lio/sentry/b7;)V

    .line 390
    .line 391
    .line 392
    iget-boolean p2, p0, Lio/sentry/b7;->i:Z

    .line 393
    .line 394
    if-eqz p2, :cond_f

    .line 395
    .line 396
    iget-object p2, p0, Lio/sentry/b7;->j:Lio/sentry/util/a;

    .line 397
    .line 398
    invoke-virtual {p2}, Lio/sentry/util/a;->g()V

    .line 399
    .line 400
    .line 401
    :try_start_1
    iget-boolean v1, p0, Lio/sentry/b7;->i:Z

    .line 402
    .line 403
    if-eqz v1, :cond_e

    .line 404
    .line 405
    invoke-virtual {p0}, Lio/sentry/b7;->y()V

    .line 406
    .line 407
    .line 408
    invoke-virtual {p0}, Lio/sentry/b7;->x()V

    .line 409
    .line 410
    .line 411
    iput-boolean v3, p0, Lio/sentry/b7;->i:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 412
    .line 413
    goto :goto_7

    .line 414
    :catchall_1
    move-exception p0

    .line 415
    goto :goto_8

    .line 416
    :cond_e
    :goto_7
    invoke-virtual {p2}, Lio/sentry/util/a;->close()V

    .line 417
    .line 418
    .line 419
    goto :goto_a

    .line 420
    :goto_8
    :try_start_2
    invoke-virtual {p2}, Lio/sentry/util/a;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 421
    .line 422
    .line 423
    goto :goto_9

    .line 424
    :catchall_2
    move-exception p1

    .line 425
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 426
    .line 427
    .line 428
    :goto_9
    throw p0

    .line 429
    :cond_f
    :goto_a
    if-eqz p3, :cond_10

    .line 430
    .line 431
    iget-object p2, p0, Lio/sentry/b7;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 432
    .line 433
    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 434
    .line 435
    .line 436
    move-result p2

    .line 437
    if-eqz p2, :cond_10

    .line 438
    .line 439
    iget-object p2, p0, Lio/sentry/b7;->r:Lio/sentry/o7;

    .line 440
    .line 441
    iget-object p2, p2, Lio/sentry/o7;->g:Ljava/lang/Long;

    .line 442
    .line 443
    if-eqz p2, :cond_10

    .line 444
    .line 445
    iget-object p1, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 446
    .line 447
    invoke-virtual {p1}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 448
    .line 449
    .line 450
    move-result-object p1

    .line 451
    invoke-virtual {p1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 452
    .line 453
    .line 454
    move-result-object p1

    .line 455
    sget-object p2, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 456
    .line 457
    iget-object p0, p0, Lio/sentry/b7;->e:Ljava/lang/String;

    .line 458
    .line 459
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object p0

    .line 463
    const-string p3, "Dropping idle transaction %s because it has no child spans"

    .line 464
    .line 465
    invoke-interface {p1, p2, p3, p0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    return-void

    .line 469
    :cond_10
    iget-object p2, p1, Lio/sentry/protocol/f0;->v0:Ljava/util/HashMap;

    .line 470
    .line 471
    iget-object p3, p0, Lio/sentry/b7;->b:Lio/sentry/e7;

    .line 472
    .line 473
    iget-object p3, p3, Lio/sentry/e7;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 474
    .line 475
    invoke-virtual {p2, p3}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 476
    .line 477
    .line 478
    iget-object p2, p0, Lio/sentry/b7;->d:Lio/sentry/o4;

    .line 479
    .line 480
    invoke-virtual {p0}, Lio/sentry/b7;->b()Lio/sentry/l7;

    .line 481
    .line 482
    .line 483
    move-result-object p0

    .line 484
    invoke-virtual {p2, p1, p0, p4, v0}, Lio/sentry/o4;->w(Lio/sentry/protocol/f0;Lio/sentry/l7;Lio/sentry/n0;Lio/sentry/z3;)Lio/sentry/protocol/w;

    .line 485
    .line 486
    .line 487
    :cond_11
    return-void
.end method
