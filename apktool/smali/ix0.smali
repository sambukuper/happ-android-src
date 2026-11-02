.class public final synthetic Lix0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:J

.field public final synthetic g0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, Lix0;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lix0;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lix0;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    iput-wide p3, p0, Lix0;->f0:J

    .line 8
    .line 9
    iput-object p5, p0, Lix0;->g0:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lix0;->X:B

    .line 4
    .line 5
    iget-object v2, v0, Lix0;->g0:Ljava/lang/Object;

    .line 6
    .line 7
    iget-wide v3, v0, Lix0;->f0:J

    .line 8
    .line 9
    iget-object v5, v0, Lix0;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v0, v0, Lix0;->Y:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object v6, v0

    .line 17
    check-cast v6, Lio/sentry/android/replay/capture/m;

    .line 18
    .line 19
    check-cast v5, Lio/sentry/android/replay/w;

    .line 20
    .line 21
    check-cast v2, Lio/sentry/android/replay/d0;

    .line 22
    .line 23
    iget-object v0, v6, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/l;

    .line 24
    .line 25
    iget-object v1, v6, Lio/sentry/android/replay/capture/m;->v:Lio/sentry/s6;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    invoke-virtual {v5, v0, v7}, Lio/sentry/android/replay/w;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v0, v6, Lio/sentry/android/replay/capture/c;->j:Lio/sentry/android/replay/capture/a;

    .line 37
    .line 38
    sget-object v5, Lio/sentry/android/replay/capture/c;->u:[Lnw3;

    .line 39
    .line 40
    const/16 v16, 0x1

    .line 41
    .line 42
    aget-object v5, v5, v16

    .line 43
    .line 44
    invoke-virtual {v0, v5, v6}, Lio/sentry/android/replay/capture/a;->a(Lnw3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    move-object v9, v0

    .line 49
    check-cast v9, Ljava/util/Date;

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    if-nez v9, :cond_1

    .line 53
    .line 54
    invoke-virtual {v1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    sget-object v2, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 59
    .line 60
    const-string v3, "Segment timestamp is not set, not recording frame"

    .line 61
    .line 62
    new-array v0, v0, [Ljava/lang/Object;

    .line 63
    .line 64
    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :cond_1
    iget-object v5, v6, Lio/sentry/android/replay/capture/c;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-eqz v5, :cond_2

    .line 76
    .line 77
    invoke-virtual {v1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    sget-object v2, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 82
    .line 83
    const-string v3, "Not capturing segment, because the app is terminating, will be captured on next launch"

    .line 84
    .line 85
    new-array v0, v0, [Ljava/lang/Object;

    .line 86
    .line 87
    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto/16 :goto_0

    .line 91
    .line 92
    :cond_2
    if-nez v2, :cond_3

    .line 93
    .line 94
    invoke-virtual {v1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    sget-object v2, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 99
    .line 100
    const-string v3, "Recorder config is not set, not capturing a segment"

    .line 101
    .line 102
    new-array v0, v0, [Ljava/lang/Object;

    .line 103
    .line 104
    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_3
    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    .line 109
    .line 110
    .line 111
    move-result-wide v7

    .line 112
    sub-long v7, v3, v7

    .line 113
    .line 114
    invoke-virtual {v1}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    iget-short v5, v5, Lio/sentry/w6;->i:S

    .line 119
    .line 120
    int-to-long v10, v5

    .line 121
    cmp-long v5, v7, v10

    .line 122
    .line 123
    if-ltz v5, :cond_4

    .line 124
    .line 125
    invoke-virtual {v1}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    iget-short v5, v5, Lio/sentry/w6;->i:S

    .line 130
    .line 131
    int-to-long v7, v5

    .line 132
    invoke-virtual {v6}, Lio/sentry/android/replay/capture/c;->d()Lio/sentry/protocol/w;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    invoke-virtual {v6}, Lio/sentry/android/replay/capture/c;->e()I

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    iget v12, v2, Lio/sentry/android/replay/d0;->b:I

    .line 141
    .line 142
    iget v13, v2, Lio/sentry/android/replay/d0;->a:I

    .line 143
    .line 144
    iget v14, v2, Lio/sentry/android/replay/d0;->e:I

    .line 145
    .line 146
    iget v15, v2, Lio/sentry/android/replay/d0;->f:I

    .line 147
    .line 148
    invoke-static/range {v6 .. v15}, Lio/sentry/android/replay/capture/c;->c(Lio/sentry/android/replay/capture/c;JLjava/util/Date;Lio/sentry/protocol/w;IIIII)Lio/sentry/android/replay/capture/k;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    instance-of v5, v2, Lio/sentry/android/replay/capture/i;

    .line 153
    .line 154
    if-eqz v5, :cond_4

    .line 155
    .line 156
    check-cast v2, Lio/sentry/android/replay/capture/i;

    .line 157
    .line 158
    iget-object v5, v6, Lio/sentry/android/replay/capture/m;->w:Lio/sentry/i1;

    .line 159
    .line 160
    invoke-static {v2, v5}, Lio/sentry/android/replay/capture/i;->a(Lio/sentry/android/replay/capture/i;Lio/sentry/i1;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v6}, Lio/sentry/android/replay/capture/c;->e()I

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    add-int/lit8 v5, v5, 0x1

    .line 168
    .line 169
    invoke-virtual {v6, v5}, Lio/sentry/android/replay/capture/c;->k(I)V

    .line 170
    .line 171
    .line 172
    iget-object v2, v2, Lio/sentry/android/replay/capture/i;->a:Lio/sentry/u6;

    .line 173
    .line 174
    iget-object v2, v2, Lio/sentry/u6;->w0:Ljava/util/Date;

    .line 175
    .line 176
    invoke-virtual {v6, v2}, Lio/sentry/android/replay/capture/c;->m(Ljava/util/Date;)V

    .line 177
    .line 178
    .line 179
    :cond_4
    iget-object v2, v6, Lio/sentry/android/replay/capture/c;->k:Ljava/util/concurrent/atomic/AtomicLong;

    .line 180
    .line 181
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 182
    .line 183
    .line 184
    move-result-wide v5

    .line 185
    sub-long/2addr v3, v5

    .line 186
    invoke-virtual {v1}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    iget v2, v2, Lio/sentry/w6;->j:I

    .line 191
    .line 192
    int-to-long v5, v2

    .line 193
    cmp-long v2, v3, v5

    .line 194
    .line 195
    if-ltz v2, :cond_5

    .line 196
    .line 197
    invoke-virtual {v1}, Lio/sentry/s6;->getReplayController()Lio/sentry/d4;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    invoke-interface {v2}, Lio/sentry/d4;->stop()V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    sget-object v2, Lio/sentry/s5;->INFO:Lio/sentry/s5;

    .line 209
    .line 210
    const-string v3, "Session replay deadline exceeded (1h), stopping recording"

    .line 211
    .line 212
    new-array v0, v0, [Ljava/lang/Object;

    .line 213
    .line 214
    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :cond_5
    :goto_0
    return-void

    .line 218
    :pswitch_0
    check-cast v0, Lme6;

    .line 219
    .line 220
    check-cast v5, Lte6;

    .line 221
    .line 222
    check-cast v2, Lee;

    .line 223
    .line 224
    invoke-interface {v0, v5, v3, v4, v2}, Lme6;->U(Lte6;JLee;)V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :pswitch_1
    check-cast v0, Lme6;

    .line 229
    .line 230
    check-cast v5, Lte6;

    .line 231
    .line 232
    check-cast v2, Lse6;

    .line 233
    .line 234
    invoke-interface {v0, v5, v3, v4, v2}, Lme6;->X(Lte6;JLse6;)V

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    nop

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
