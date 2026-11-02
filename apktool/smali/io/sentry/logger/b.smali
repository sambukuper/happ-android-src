.class public Lio/sentry/logger/b;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic X:B

.field public final Y:Lio/sentry/android/core/SentryAndroidOptions;

.field public final Z:Lwg;

.field public final f0:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field public final g0:Lio/sentry/l5;

.field public final h0:Lio/sentry/d;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;Lwg;B)V
    .locals 3

    .line 1
    iput-byte p3, p0, Lio/sentry/logger/b;->X:B

    .line 2
    .line 3
    const/16 v0, 0xb

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch p3, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance p3, Lio/sentry/l5;

    .line 10
    .line 11
    invoke-direct {p3, p1}, Lio/sentry/l5;-><init>(Lio/sentry/s6;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lio/sentry/d;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lio/sentry/d;-><init>(B)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lio/sentry/logger/b;->h0:Lio/sentry/d;

    .line 28
    .line 29
    iput-object p1, p0, Lio/sentry/logger/b;->Y:Lio/sentry/android/core/SentryAndroidOptions;

    .line 30
    .line 31
    iput-object p2, p0, Lio/sentry/logger/b;->Z:Lwg;

    .line 32
    .line 33
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lio/sentry/logger/b;->f0:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 39
    .line 40
    iput-object p3, p0, Lio/sentry/logger/b;->g0:Lio/sentry/l5;

    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    new-instance p3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 47
    .line 48
    invoke-direct {p3, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 49
    .line 50
    .line 51
    new-instance p3, Lio/sentry/d;

    .line 52
    .line 53
    invoke-direct {p3, v0}, Lio/sentry/d;-><init>(B)V

    .line 54
    .line 55
    .line 56
    iput-object p3, p0, Lio/sentry/logger/b;->h0:Lio/sentry/d;

    .line 57
    .line 58
    iput-object p1, p0, Lio/sentry/logger/b;->Y:Lio/sentry/android/core/SentryAndroidOptions;

    .line 59
    .line 60
    iput-object p2, p0, Lio/sentry/logger/b;->Z:Lwg;

    .line 61
    .line 62
    new-instance p2, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 63
    .line 64
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p2, p0, Lio/sentry/logger/b;->f0:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 68
    .line 69
    new-instance p2, Lio/sentry/l5;

    .line 70
    .line 71
    invoke-direct {p2, p1}, Lio/sentry/l5;-><init>(Lio/sentry/s6;)V

    .line 72
    .line 73
    .line 74
    iput-object p2, p0, Lio/sentry/logger/b;->g0:Lio/sentry/l5;

    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Z)V
    .locals 10

    .line 1
    iget-byte p1, p0, Lio/sentry/logger/b;->X:B

    .line 2
    .line 3
    iget-object v0, p0, Lio/sentry/logger/b;->h0:Lio/sentry/d;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object v2, p0, Lio/sentry/logger/b;->Z:Lwg;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    iget-object v4, p0, Lio/sentry/logger/b;->Y:Lio/sentry/android/core/SentryAndroidOptions;

    .line 10
    .line 11
    iget-object v5, p0, Lio/sentry/logger/b;->g0:Lio/sentry/l5;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    iget-object p0, p0, Lio/sentry/logger/b;->f0:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 15
    .line 16
    packed-switch p1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v4}, Lio/sentry/s6;->getShutdownTimeoutMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v7

    .line 23
    invoke-virtual {v5, v7, v8}, Lio/sentry/l5;->a(J)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-nez p1, :cond_4

    .line 31
    .line 32
    new-instance p1, Ljava/util/ArrayList;

    .line 33
    .line 34
    const/16 v4, 0x3e8

    .line 35
    .line 36
    invoke-direct {p1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    check-cast v5, Lio/sentry/y5;

    .line 44
    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-nez v5, :cond_3

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-lt v5, v4, :cond_1

    .line 61
    .line 62
    :cond_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-nez v4, :cond_0

    .line 67
    .line 68
    new-instance v4, Lio/sentry/z5;

    .line 69
    .line 70
    invoke-direct {v4, p1}, Lio/sentry/z5;-><init>(Ljava/util/List;)V

    .line 71
    .line 72
    .line 73
    :try_start_0
    invoke-virtual {v2, v4}, Lwg;->n(Lio/sentry/z5;)Lio/sentry/internal/debugmeta/c;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v2, v4, v1}, Lwg;->x(Lio/sentry/internal/debugmeta/c;Lio/sentry/n0;)Lio/sentry/protocol/w;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catch_0
    move-exception v4

    .line 82
    iget-object v5, v2, Lwg;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v5, Lio/sentry/android/core/SentryAndroidOptions;

    .line 85
    .line 86
    invoke-virtual {v5}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    sget-object v7, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 91
    .line 92
    const-string v8, "Capturing metrics failed."

    .line 93
    .line 94
    new-array v9, v6, [Ljava/lang/Object;

    .line 95
    .line 96
    invoke-interface {v5, v7, v4, v8, v9}, Lio/sentry/ILogger;->d(Lio/sentry/s5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :goto_0
    move v4, v6

    .line 100
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-ge v4, v5, :cond_0

    .line 105
    .line 106
    iget-object v5, v0, Lio/sentry/d;->Y:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v5, Lio/sentry/transport/p;

    .line 109
    .line 110
    sget v7, Lio/sentry/transport/p;->X:I

    .line 111
    .line 112
    invoke-virtual {v5, v3}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;->releaseShared(I)Z

    .line 113
    .line 114
    .line 115
    add-int/lit8 v4, v4, 0x1

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_4
    return-void

    .line 119
    :pswitch_0
    invoke-virtual {v4}, Lio/sentry/s6;->getShutdownTimeoutMillis()J

    .line 120
    .line 121
    .line 122
    move-result-wide v7

    .line 123
    invoke-virtual {v5, v7, v8}, Lio/sentry/l5;->a(J)V

    .line 124
    .line 125
    .line 126
    :cond_5
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-nez p1, :cond_9

    .line 131
    .line 132
    new-instance p1, Ljava/util/ArrayList;

    .line 133
    .line 134
    const/16 v4, 0x64

    .line 135
    .line 136
    invoke-direct {p1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 137
    .line 138
    .line 139
    :cond_6
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    check-cast v5, Lio/sentry/u5;

    .line 144
    .line 145
    if-eqz v5, :cond_7

    .line 146
    .line 147
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    :cond_7
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    if-nez v5, :cond_8

    .line 155
    .line 156
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    if-lt v5, v4, :cond_6

    .line 161
    .line 162
    :cond_8
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-nez v4, :cond_5

    .line 167
    .line 168
    new-instance v4, Lio/sentry/v5;

    .line 169
    .line 170
    invoke-direct {v4, p1, v6}, Lio/sentry/v5;-><init>(Ljava/lang/Object;B)V

    .line 171
    .line 172
    .line 173
    :try_start_1
    invoke-virtual {v2, v4}, Lwg;->m(Lio/sentry/v5;)Lio/sentry/internal/debugmeta/c;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-virtual {v2, v4, v1}, Lwg;->x(Lio/sentry/internal/debugmeta/c;Lio/sentry/n0;)Lio/sentry/protocol/w;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :catch_1
    move-exception v4

    .line 182
    iget-object v5, v2, Lwg;->b:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v5, Lio/sentry/android/core/SentryAndroidOptions;

    .line 185
    .line 186
    invoke-virtual {v5}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    sget-object v7, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 191
    .line 192
    const-string v8, "Capturing logs failed."

    .line 193
    .line 194
    new-array v9, v6, [Ljava/lang/Object;

    .line 195
    .line 196
    invoke-interface {v5, v7, v4, v8, v9}, Lio/sentry/ILogger;->d(Lio/sentry/s5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :goto_2
    move v4, v6

    .line 200
    :goto_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    if-ge v4, v5, :cond_5

    .line 205
    .line 206
    iget-object v5, v0, Lio/sentry/d;->Y:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v5, Lio/sentry/transport/p;

    .line 209
    .line 210
    sget v7, Lio/sentry/transport/p;->X:I

    .line 211
    .line 212
    invoke-virtual {v5, v3}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;->releaseShared(I)Z

    .line 213
    .line 214
    .line 215
    add-int/lit8 v4, v4, 0x1

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_9
    return-void

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
